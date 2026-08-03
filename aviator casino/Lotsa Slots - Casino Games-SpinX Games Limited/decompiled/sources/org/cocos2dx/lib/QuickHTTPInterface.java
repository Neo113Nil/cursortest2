package org.cocos2dx.lib;

/* loaded from: classes6.dex */
public class QuickHTTPInterface {
    public static java.lang.String BOUNDARY = "----------------------------78631b43218d";
    public static java.lang.String NEWLINE = "\r\n";

    public static java.net.HttpURLConnection createURLConnect(java.lang.String str) {
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
            httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.ACCEPT_ENCODING, "identity");
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        } catch (java.lang.Exception e) {
            android.util.Log.e("QuickHTTPInterface", e.toString());
            return null;
        }
    }

    public static void setRequestMethod(java.net.HttpURLConnection httpURLConnection, java.lang.String str) {
        try {
            if ("POST".equalsIgnoreCase(str)) {
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty("Content-Type", androidx.browser.trusted.sharing.ShareTarget.ENCODING_TYPE_URL_ENCODED);
            }
            httpURLConnection.setRequestMethod(str);
        } catch (java.lang.Exception e) {
            android.util.Log.e("QuickHTTPInterface", e.toString());
        }
    }

    public static void addRequestHeader(java.net.HttpURLConnection httpURLConnection, java.lang.String str, java.lang.String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str.trim()) && z) {
            str2 = str2 + "; boundary=" + BOUNDARY;
        }
        httpURLConnection.setRequestProperty(str, str2);
    }

    public static void setTimeout(java.net.HttpURLConnection httpURLConnection, int i) {
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i);
    }

    public static int connect(java.net.HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.connect();
            return 0;
        } catch (java.lang.Throwable th) {
            android.util.Log.e("QuickHTTPInterface", th.toString());
            return 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:3:0x0002, B:6:0x000f, B:9:0x0016, B:11:0x0039, B:12:0x0045, B:16:0x0033), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void postContent(java.net.HttpURLConnection httpURLConnection, java.lang.String str, java.lang.String str2, boolean z) {
        java.lang.String encode;
        try {
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(httpURLConnection.getOutputStream());
            if (str != null && str.length() != 0) {
                encode = java.net.URLEncoder.encode(str, com.ironsource.B5.O) + com.ironsource.X3.j.b + java.net.URLEncoder.encode(str2, com.ironsource.B5.O);
                if (z) {
                    encode = com.ironsource.X3.j.c + encode;
                }
                dataOutputStream.write(encode.getBytes());
                dataOutputStream.flush();
            }
            encode = java.net.URLEncoder.encode(str2, com.ironsource.B5.O);
            if (z) {
            }
            dataOutputStream.write(encode.getBytes());
            dataOutputStream.flush();
        } catch (java.lang.Exception e) {
            android.util.Log.e("QuickHTTPInterface", e.toString());
        }
    }

    public static void postContentByteArray(java.net.HttpURLConnection httpURLConnection, byte[] bArr) {
        try {
            java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.flush();
        } catch (java.lang.Exception e) {
            android.util.Log.e("QuickHTTPInterface", e.toString());
        }
    }

    public static void postFormContent(java.net.HttpURLConnection httpURLConnection, java.lang.String str, java.lang.String str2) {
        try {
            java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(getBoundaryContentHeader(str, str2).getBytes());
            outputStream.flush();
        } catch (java.lang.Exception e) {
            android.util.Log.e("QuickHTTPInterface", e.toString());
        }
    }

    public static void postFormFile(java.net.HttpURLConnection httpURLConnection, java.lang.String str, java.lang.String str2) {
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(str2);
            java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(getBoundaryFileHeader(str, str2).getBytes());
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.write(NEWLINE.getBytes());
                    outputStream.flush();
                    fileInputStream.close();
                    return;
                }
            }
        } catch (java.lang.Exception e) {
            android.util.Log.e("QuickHTTPInterface", e.toString());
        }
    }

    public static void postFormEnd(java.net.HttpURLConnection httpURLConnection, boolean z) {
        if ("GET".equalsIgnoreCase(httpURLConnection.getRequestMethod())) {
            return;
        }
        try {
            java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
            if (z) {
                outputStream.write(getBoundaryEnd().getBytes());
                outputStream.flush();
            }
            outputStream.close();
        } catch (java.lang.Exception e) {
            android.util.Log.e("QuickHTTPInterface", e.toString());
        }
    }

    public static java.lang.String getBoundaryFileHeader(java.lang.String str, java.lang.String str2) {
        return "--" + BOUNDARY + NEWLINE + "Content-Disposition: form-data; name=\"" + str + "\"; filename=\"" + new java.io.File(str2).getName() + "\"" + NEWLINE + "Content-Type: application/octet-stream" + NEWLINE + NEWLINE;
    }

    public static java.lang.String getBoundaryContentHeader(java.lang.String str, java.lang.String str2) {
        return "--" + BOUNDARY + NEWLINE + "Content-Disposition: form-data; name=\"" + str + "\"" + NEWLINE + NEWLINE + str2 + NEWLINE;
    }

    public static java.lang.String getBoundaryEnd() {
        return "--" + BOUNDARY + "--" + NEWLINE;
    }

    public static int getResponedCode(java.net.HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (java.lang.Exception e) {
            android.util.Log.e("QuickHTTPInterface", e.toString());
            return 0;
        }
    }

    public static java.lang.String getResponedErr(java.net.HttpURLConnection httpURLConnection) {
        try {
            java.lang.String responseMessage = httpURLConnection.getResponseMessage();
            android.util.Log.e("QuickHTTPInterface", "--------------- error msg = " + responseMessage);
            return responseMessage;
        } catch (java.lang.Exception e) {
            java.lang.String exc = e.toString();
            android.util.Log.e("QuickHTTPInterface", exc);
            return exc;
        }
    }

    public static java.lang.String getResponedHeader(java.net.HttpURLConnection httpURLConnection) {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            headerFields = httpURLConnection.getHeaderFields();
        } catch (java.lang.Exception e) {
            android.util.Log.e("QuickHTTPInterface", e.toString());
        }
        if (headerFields != null && !headerFields.isEmpty()) {
            for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : headerFields.entrySet()) {
                java.lang.String key = entry.getKey();
                if (key == null) {
                    key = "";
                }
                java.util.List<java.lang.String> value = entry.getValue();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.Iterator<java.lang.String> it = value.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject.put(key, jSONArray);
            }
            return jSONObject.toString();
        }
        return jSONObject.toString();
    }

    public static java.lang.String getResponedHeaderByIdx(java.net.HttpURLConnection httpURLConnection, int i) {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields == null || headerFields.isEmpty()) {
            return null;
        }
        int i2 = 0;
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : headerFields.entrySet()) {
            if (i2 == i) {
                java.lang.String key = entry.getKey();
                if (key == null) {
                    return listToString(entry.getValue(), ",") + "\n";
                }
                return key + ":" + listToString(entry.getValue(), ",") + "\n";
            }
            i2++;
        }
        return null;
    }

    public static java.lang.String getResponedHeaderByKey(java.net.HttpURLConnection httpURLConnection, java.lang.String str) {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields;
        if (str == null || (headerFields = httpURLConnection.getHeaderFields()) == null || headerFields.isEmpty()) {
            return null;
        }
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : headerFields.entrySet()) {
            if (str.equalsIgnoreCase(entry.getKey())) {
                if ("set-cookie".equalsIgnoreCase(str)) {
                    return combinCookies(entry.getValue(), httpURLConnection.getURL().getHost());
                }
                return listToString(entry.getValue(), ",");
            }
        }
        return null;
    }

    public static int getResponedHeaderByKeyInt(java.net.HttpURLConnection httpURLConnection, java.lang.String str) {
        try {
            java.lang.String headerField = httpURLConnection.getHeaderField(str);
            if (headerField == null) {
                return 0;
            }
            return java.lang.Integer.parseInt(headerField);
        } catch (java.lang.Exception e) {
            android.util.Log.e("QuickHTTPInterface", e.toString());
            return 0;
        }
    }

    public static int getContentLeng(java.net.HttpURLConnection httpURLConnection) {
        return httpURLConnection.getContentLength();
    }

    public static byte[] getResponedString(java.net.HttpURLConnection httpURLConnection) {
        java.io.DataInputStream dataInputStream;
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200 && responseCode != 201) {
                dataInputStream = new java.io.DataInputStream(httpURLConnection.getErrorStream());
            } else {
                dataInputStream = new java.io.DataInputStream(httpURLConnection.getInputStream());
            }
            byte[] bArr = new byte[1024];
            int read = dataInputStream.read(bArr);
            if (-1 == read) {
                return new byte[]{0};
            }
            byte[] bArr2 = new byte[read + 1];
            bArr2[0] = 1;
            java.lang.System.arraycopy(bArr, 0, bArr2, 1, read);
            return bArr2;
        } catch (java.lang.Exception e) {
            android.util.Log.e("QuickHTTPInterface", e.toString());
            return null;
        }
    }

    public static void close(java.net.HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (java.lang.Throwable th) {
            android.util.Log.e("QuickHTTPInterface", th.toString());
        }
    }

    public static void printInfo(java.lang.String str) {
        android.util.Log.e("QuickHTTPInterface", "-------------------- QuickHTTPInterface info = " + str);
    }

    public static java.lang.String listToString(java.util.List<java.lang.String> list, java.lang.String str) {
        if (list == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        boolean z = false;
        for (java.lang.String str2 : list) {
            if (z) {
                sb.append(str);
            }
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            z = true;
        }
        return sb.toString();
    }

    public static java.lang.String combinCookies(java.util.List<java.lang.String> list, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        if (list == null || list.isEmpty()) {
            return "";
        }
        java.util.Iterator<java.lang.String> it = list.iterator();
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        java.lang.String str4 = null;
        java.lang.String str5 = str;
        while (it.hasNext()) {
            char c = 1;
            char c2 = 0;
            boolean z = true;
            boolean z2 = false;
            for (java.lang.String str6 : it.next().split(";")) {
                java.lang.String[] split = str6.split(com.ironsource.X3.j.b);
                if (z) {
                    if (2 == split.length) {
                        str2 = split[c2];
                        str3 = split[c];
                    } else {
                        str2 = "";
                        str3 = str2;
                    }
                    z = false;
                }
                if ("expires".equalsIgnoreCase(split[c2].trim())) {
                    str4 = str2Seconds(split[c].trim());
                    c2 = 0;
                } else {
                    c2 = 0;
                    if ("secure".equalsIgnoreCase(split[0].trim())) {
                        c = 1;
                        z2 = true;
                    } else if (com.ironsource.X3.j.D.equalsIgnoreCase(split[0].trim())) {
                        c = 1;
                        str5 = split[1];
                    } else {
                        c = 1;
                    }
                }
            }
            if (str5 == null) {
                str5 = "none";
            }
            sb.append(str5);
            sb.append("\tFALSE\t/\t");
            if (z2) {
                sb.append("TRUE\t");
            } else {
                sb.append("FALSE\t");
            }
            sb.append(str4);
            sb.append("\t");
            sb.append(str2);
            sb.append("\t");
            sb.append(str3);
            sb.append('\n');
        }
        return sb.toString();
    }

    private static java.lang.String str2Seconds(java.lang.String str) {
        long j;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        try {
            calendar.setTime(new java.text.SimpleDateFormat("EEE, dd-MMM-yyyy hh:mm:ss zzz", java.util.Locale.US).parse(str));
            j = calendar.getTimeInMillis() / 1000;
        } catch (java.lang.Exception unused) {
            j = -1;
        }
        return -1 == j ? str : java.lang.Long.toString(j);
    }
}
