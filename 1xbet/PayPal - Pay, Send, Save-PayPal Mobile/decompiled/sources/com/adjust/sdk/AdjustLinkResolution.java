package com.adjust.sdk;

/* loaded from: classes7.dex */
public final class AdjustLinkResolution {
    private static volatile java.util.concurrent.ExecutorService executor = null;
    private static final java.lang.String[] expectedUrlHostSuffixArray = {"adjust.com", "adj.st", "go.link", "adjust.net.in", "adjust.cn", "adjust.world", "adjust.io"};
    private static final int maxRecursions = 10;

    public interface AdjustLinkResolutionCallback {
        void resolvedLinkCallback(android.net.Uri uri);
    }

    private AdjustLinkResolution() {
    }

    private static android.net.Uri convertToUri(java.net.URL url) {
        if (url == null) {
            return null;
        }
        return android.net.Uri.parse(url.toString());
    }

    private static boolean isTerminalUrl(java.lang.String str) {
        return urlMatchesSuffix(str, expectedUrlHostSuffixArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void requestAndResolve(java.net.URL url, int i, com.adjust.sdk.AdjustLinkResolution.AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        java.net.HttpURLConnection httpURLConnection;
        java.net.URL convertToHttps = convertToHttps(url);
        try {
            httpURLConnection = (java.net.HttpURLConnection) convertToHttps.openConnection();
        } catch (java.lang.Throwable unused) {
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.connect();
            java.lang.String headerField = httpURLConnection.getHeaderField("Location");
            java.net.URL url2 = headerField != null ? new java.net.URL(headerField) : null;
            httpURLConnection.disconnect();
            resolveLink(url2, convertToHttps, i + 1, adjustLinkResolutionCallback);
        } catch (java.lang.Throwable unused2) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            resolveLink(null, convertToHttps, i + 1, adjustLinkResolutionCallback);
        }
    }

    public static void resolveLink(java.lang.String str, java.lang.String[] strArr, final com.adjust.sdk.AdjustLinkResolution.AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        final java.net.URL url;
        if (adjustLinkResolutionCallback == null) {
            return;
        }
        if (str == null) {
            adjustLinkResolutionCallback.resolvedLinkCallback(null);
            return;
        }
        try {
            url = new java.net.URL(str);
        } catch (java.net.MalformedURLException unused) {
            url = null;
        }
        if (url == null) {
            adjustLinkResolutionCallback.resolvedLinkCallback(null);
            return;
        }
        if (!urlMatchesSuffix(url.getHost(), strArr)) {
            adjustLinkResolutionCallback.resolvedLinkCallback(convertToUri(url));
            return;
        }
        if (executor == null) {
            synchronized (expectedUrlHostSuffixArray) {
                if (executor == null) {
                    executor = java.util.concurrent.Executors.newSingleThreadExecutor();
                }
            }
        }
        executor.execute(new java.lang.Runnable() { // from class: com.adjust.sdk.AdjustLinkResolution.1
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.AdjustLinkResolution.requestAndResolve(url, 0, adjustLinkResolutionCallback);
            }
        });
    }

    private static boolean urlMatchesSuffix(java.lang.String str, java.lang.String[] strArr) {
        if (str == null || strArr == null) {
            return false;
        }
        for (java.lang.String str2 : strArr) {
            if (str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static java.net.URL convertToHttps(java.net.URL url) {
        java.lang.String externalForm;
        if (url != null && (externalForm = url.toExternalForm()) != null && externalForm.startsWith("http:")) {
            try {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("https:");
                sb.append(externalForm.substring(5));
                return new java.net.URL(sb.toString());
            } catch (java.net.MalformedURLException unused) {
            }
        }
        return url;
    }

    private static void resolveLink(java.net.URL url, java.net.URL url2, int i, com.adjust.sdk.AdjustLinkResolution.AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        if (url == null) {
            adjustLinkResolutionCallback.resolvedLinkCallback(convertToUri(url2));
            return;
        }
        if (isTerminalUrl(url.getHost())) {
            adjustLinkResolutionCallback.resolvedLinkCallback(convertToUri(url));
        } else if (i > 10) {
            adjustLinkResolutionCallback.resolvedLinkCallback(convertToUri(url));
        } else {
            requestAndResolve(url, i, adjustLinkResolutionCallback);
        }
    }
}
