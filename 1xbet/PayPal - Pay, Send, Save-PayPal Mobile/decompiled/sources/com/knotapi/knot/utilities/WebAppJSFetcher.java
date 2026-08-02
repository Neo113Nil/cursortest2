package com.knotapi.knot.utilities;

/* loaded from: classes9.dex */
public class WebAppJSFetcher {
    private static volatile com.knotapi.knot.utilities.WebAppJSFetcher instance;
    private final java.lang.String appRootURL;
    private final java.util.concurrent.ExecutorService executorService;
    private final java.util.Map<java.lang.String, java.lang.String> jsCache;
    private final java.util.Map<java.lang.String, java.util.List<com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback>> pendingCallbacks;

    public interface JSFetchCallback {
        void onFetchFailed(java.lang.Exception exc);

        void onJSCodeFetched(java.lang.String str);
    }

    private WebAppJSFetcher() {
        java.lang.String str = com.knotapi.knot.services.KnotSDKInitProvider.rootUrl;
        if (str == null) {
            this.appRootURL = "https://knotapi.vercel.app";
        } else {
            this.appRootURL = str;
        }
        this.jsCache = new java.util.concurrent.ConcurrentHashMap();
        this.pendingCallbacks = new java.util.concurrent.ConcurrentHashMap();
        this.executorService = java.util.concurrent.Executors.newFixedThreadPool(8);
    }

    public static com.knotapi.knot.utilities.WebAppJSFetcher getInstance() {
        if (instance == null) {
            synchronized (com.knotapi.knot.utilities.WebAppJSFetcher.class) {
                if (instance == null) {
                    instance = new com.knotapi.knot.utilities.WebAppJSFetcher();
                }
            }
        }
        return instance;
    }

    static /* synthetic */ java.util.List lambda$fetchJS$2(java.lang.String str, com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback jSFetchCallback, java.lang.String str2, java.util.List list) {
        if (list != null) {
            list.add(jSFetchCallback);
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(jSFetchCallback);
        return arrayList;
    }

    static /* synthetic */ void lambda$fetchJS$3(java.lang.Exception exc, java.lang.String str, java.util.List list, java.lang.String str2) {
        if (exc != null || str == null || str.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback) it.next()).onFetchFailed(exc != null ? exc : new java.lang.Exception("JS code is empty"));
            }
        } else {
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback) it2.next()).onJSCodeFetched(str);
            }
        }
    }

    private java.lang.String readStream(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            java.lang.String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(readLine);
            sb.append('\n');
        }
    }

    public void fetchJS(final java.lang.String str, final com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback jSFetchCallback) {
        java.lang.StringBuilder sb;
        if (str == null || str.trim().isEmpty()) {
            if (jSFetchCallback != null) {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.utilities.WebAppJSFetcher$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback.this.onFetchFailed(new java.lang.IllegalArgumentException("Path cannot be null or empty."));
                    }
                });
                return;
            }
            return;
        }
        if (jSFetchCallback != null) {
            java.lang.String str2 = this.appRootURL;
            java.lang.String str3 = androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR;
            if (str2.endsWith(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR)) {
                sb = new java.lang.StringBuilder();
                str3 = this.appRootURL;
            } else {
                sb = new java.lang.StringBuilder();
                sb.append(this.appRootURL);
            }
            sb.append(str3);
            sb.append(str);
            final java.lang.String obj = sb.toString();
            final java.lang.String str4 = this.jsCache.get(str);
            if (str4 != null && !str4.isEmpty()) {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.utilities.WebAppJSFetcher$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback.this.onJSCodeFetched(str4);
                    }
                });
                return;
            }
            this.jsCache.remove(str);
            this.pendingCallbacks.compute(str, new java.util.function.BiFunction() { // from class: com.knotapi.knot.utilities.WebAppJSFetcher$$ExternalSyntheticLambda2
                @Override // java.util.function.BiFunction
                public final java.lang.Object apply(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.knotapi.knot.utilities.WebAppJSFetcher.lambda$fetchJS$2(str, jSFetchCallback, (java.lang.String) obj2, (java.util.List) obj3);
                }
            });
            if (this.pendingCallbacks.get(str).size() == 1) {
                this.executorService.execute(new java.lang.Runnable() { // from class: com.knotapi.knot.utilities.WebAppJSFetcher$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.knotapi.knot.utilities.WebAppJSFetcher.this.m10848lambda$fetchJS$4$comknotapiknotutilitiesWebAppJSFetcher(obj, str);
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: lambda$fetchJS$4$com-knotapi-knot-utilities-WebAppJSFetcher, reason: not valid java name */
    /* synthetic */ void m10848lambda$fetchJS$4$comknotapiknotutilitiesWebAppJSFetcher(java.lang.String str, final java.lang.String str2) {
        java.lang.Throwable th;
        java.net.HttpURLConnection httpURLConnection;
        final java.lang.String str3;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        try {
            httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
            try {
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("HTTP error code: ");
                    sb.append(responseCode);
                    throw new java.io.IOException(sb.toString());
                }
                java.io.InputStream inputStream = httpURLConnection.getInputStream();
                if (inputStream == null) {
                    throw new java.io.IOException("InputStream is null");
                }
                str3 = readStream(inputStream);
                try {
                    this.jsCache.put(str2, str3);
                    httpURLConnection.disconnect();
                    final java.util.List<com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback> remove = this.pendingCallbacks.remove(str2);
                    if (remove == null || remove.isEmpty()) {
                        return;
                    }
                    android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
                    final java.lang.Object[] objArr3 = objArr2 == true ? 1 : 0;
                    handler.post(new java.lang.Runnable() { // from class: com.knotapi.knot.utilities.WebAppJSFetcher$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.knotapi.knot.utilities.WebAppJSFetcher.lambda$fetchJS$3(objArr3, str3, remove, str2);
                        }
                    });
                } catch (java.lang.Exception e) {
                    httpURLConnection2 = httpURLConnection;
                    e = e;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    final java.util.List<com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback> remove2 = this.pendingCallbacks.remove(str2);
                    if (remove2 == null || remove2.isEmpty()) {
                        return;
                    }
                    new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.utilities.WebAppJSFetcher$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.knotapi.knot.utilities.WebAppJSFetcher.lambda$fetchJS$3(e, str3, remove2, str2);
                        }
                    });
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    final java.util.List<com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback> remove3 = this.pendingCallbacks.remove(str2);
                    if (remove3 == null || remove3.isEmpty()) {
                        return;
                    }
                    android.os.Handler handler2 = new android.os.Handler(android.os.Looper.getMainLooper());
                    final java.lang.Object[] objArr4 = objArr == true ? 1 : 0;
                    handler2.post(new java.lang.Runnable() { // from class: com.knotapi.knot.utilities.WebAppJSFetcher$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.knotapi.knot.utilities.WebAppJSFetcher.lambda$fetchJS$3(objArr4, str3, remove3, str2);
                        }
                    });
                    throw th;
                }
            } catch (java.lang.Exception e2) {
                httpURLConnection2 = httpURLConnection;
                e = e2;
                str3 = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                str3 = null;
            }
        } catch (java.lang.Exception e3) {
            e = e3;
            str3 = null;
        } catch (java.lang.Throwable th4) {
            th = th4;
            httpURLConnection = null;
            str3 = null;
        }
    }
}
