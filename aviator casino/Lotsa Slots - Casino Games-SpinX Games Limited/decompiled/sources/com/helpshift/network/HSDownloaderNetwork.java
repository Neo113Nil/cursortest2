package com.helpshift.network;

/* loaded from: classes2.dex */
public class HSDownloaderNetwork {
    private static final java.lang.String TAG = "dwnldrNet";
    private final com.helpshift.network.URLConnectionProvider urlConnectionProvider;

    private boolean isSuccessful(int i) {
        return i >= 200 && i <= 300;
    }

    public HSDownloaderNetwork(com.helpshift.network.URLConnectionProvider uRLConnectionProvider) {
        this.urlConnectionProvider = uRLConnectionProvider;
    }

    public com.helpshift.network.HSDownloaderResponse downloadResource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.io.File file) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        boolean z;
        javax.net.ssl.HttpsURLConnection httpsURLConnection;
        java.lang.String str6 = "";
        java.lang.String str7 = com.ironsource.B5.O;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        boolean z2 = false;
        int i = com.ironsource.InterfaceC3141l1.a.b.d;
        try {
            httpsURLConnection = (javax.net.ssl.HttpsURLConnection) this.urlConnectionProvider.getURL(str).openConnection();
            map.put(com.google.common.net.HttpHeaders.ACCEPT_ENCODING, "gzip");
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            i = httpsURLConnection.getResponseCode();
            str7 = httpsURLConnection.getContentEncoding();
            str4 = httpsURLConnection.getContentType();
        } catch (java.net.UnknownHostException e) {
            e = e;
            str2 = "";
        } catch (java.lang.Exception e2) {
            e = e2;
            str2 = "";
        }
        try {
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpsURLConnection.getHeaderFields();
            processResponseHeaders(headerFields, jSONObject);
            str6 = extractETag(headerFields);
            if (isSuccessful(i)) {
                saveDataFromConnection(httpsURLConnection, str, file, str7);
            }
            if (isSuccessful(i) || i == 304) {
                com.helpshift.log.HSLogger.d(TAG, "Successfully downloaded the resource with Url: " + str + " headers: " + map);
                z2 = true;
            }
            str3 = str6;
            str5 = str7;
            z = z2;
        } catch (java.net.UnknownHostException e3) {
            e = e3;
            str2 = str6;
            str6 = str4;
            com.helpshift.log.HSLogger.e(TAG, "Error downloading resource: " + str + " \n " + e.getMessage());
            str3 = str2;
            str4 = str6;
            str5 = str7;
            z = false;
            return new com.helpshift.network.HSDownloaderResponse(i, jSONObject, str3, str4, str5, z);
        } catch (java.lang.Exception e4) {
            e = e4;
            str2 = str6;
            str6 = str4;
            com.helpshift.log.HSLogger.e(TAG, "Error downloading resource: " + str, e);
            str3 = str2;
            str4 = str6;
            str5 = str7;
            z = false;
            return new com.helpshift.network.HSDownloaderResponse(i, jSONObject, str3, str4, str5, z);
        }
        return new com.helpshift.network.HSDownloaderResponse(i, jSONObject, str3, str4, str5, z);
    }

    private void saveDataFromConnection(javax.net.ssl.HttpsURLConnection httpsURLConnection, java.lang.String str, java.io.File file, java.lang.String str2) throws java.lang.Exception {
        try {
            java.io.InputStream createInputStream = createInputStream(httpsURLConnection, str2);
            try {
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                try {
                    saveResourceToFile(createInputStream, fileOutputStream);
                    fileOutputStream.close();
                    if (createInputStream != null) {
                        createInputStream.close();
                    }
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error reading stream for resource: " + str, e);
            throw e;
        }
    }

    private void processResponseHeaders(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, org.json.JSONObject jSONObject) {
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : map.entrySet()) {
            if (entry.getKey() != null || entry.getValue() != null) {
                java.lang.String key = entry.getKey() == null ? "" : entry.getKey();
                jSONObject.put(key, generateHeaderValue(entry.getValue()));
                if (com.google.common.net.HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN.equalsIgnoreCase(key)) {
                    jSONObject.put(key, "*");
                }
            }
        }
    }

    private java.lang.String extractETag(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        java.util.List<java.lang.String> list = map.get("etag");
        return com.helpshift.util.Utils.isNotEmpty(list) ? list.get(0) : "";
    }

    private java.io.InputStream createInputStream(javax.net.ssl.HttpsURLConnection httpsURLConnection, java.lang.String str) throws java.io.IOException {
        java.io.InputStream inputStream = httpsURLConnection.getInputStream();
        return (inputStream != null && com.helpshift.util.Utils.isNotEmpty(str) && str.contains("gzip")) ? new java.util.zip.GZIPInputStream(inputStream) : inputStream;
    }

    private void saveResourceToFile(java.io.InputStream inputStream, java.io.FileOutputStream fileOutputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return;
                } else {
                    fileOutputStream.write(bArr, 0, read);
                }
            } catch (java.io.IOException e) {
                com.helpshift.log.HSLogger.e(TAG, "Error saving resource to file: ", e);
                return;
            }
        }
    }

    private static java.lang.String generateHeaderValue(java.util.List<java.lang.String> list) {
        if (com.helpshift.util.Utils.isEmpty(list)) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            sb.append(";");
            sb.append(list.get(i));
        }
        return sb.toString();
    }
}
