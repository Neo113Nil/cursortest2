package com.ironsource;

/* loaded from: classes5.dex */
public class Q9 {

    class a extends java.util.zip.GZIPOutputStream {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f5937a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(java.io.OutputStream outputStream, int i) throws java.io.IOException {
            super(outputStream);
            this.f5937a = i;
            if (i < 0 || i > 9) {
                return;
            }
            ((java.util.zip.GZIPOutputStream) this).def.setLevel(i);
        }
    }

    public static byte[] a(java.lang.String str, int i) throws java.lang.Exception {
        byte[] bArr = new byte[0];
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(str.length());
            com.ironsource.Q9.a aVar = new com.ironsource.Q9.a(byteArrayOutputStream, i);
            aVar.write(str.getBytes());
            aVar.close();
            bArr = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return bArr;
        } catch (java.lang.OutOfMemoryError e) {
            com.ironsource.C3180n4.d().a(e);
            java.lang.String str2 = "Error while compressing:" + e.getMessage();
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(str2);
            b(str2);
            return bArr;
        }
    }

    private static void b(java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            jSONObject.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        com.ironsource.Jb.Y().q().a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.TROUBLESHOOTING_FAILED_TO_GZIP, jSONObject));
    }

    public static byte[] a(java.lang.String str) throws java.lang.Exception {
        return a(str, -1);
    }

    public static java.lang.String a(byte[] bArr) {
        try {
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
            java.util.zip.GZIPInputStream gZIPInputStream = new java.util.zip.GZIPInputStream(byteArrayInputStream);
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(gZIPInputStream, "UTF-8"));
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return sb.toString();
                }
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("exception while decompressing " + e);
            return null;
        } catch (java.lang.OutOfMemoryError e2) {
            com.ironsource.C3180n4.d().a(e2);
            java.lang.String str = "Error while decompressing:" + e2.getMessage();
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(str);
            b(str);
            return null;
        }
    }
}
