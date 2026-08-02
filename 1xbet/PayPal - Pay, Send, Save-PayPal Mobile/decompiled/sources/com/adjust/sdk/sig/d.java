package com.adjust.sdk.sig;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f2823a = false;

    public static void a(java.util.Set set, java.util.Map map, java.util.Map map2) {
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (map.containsKey(str)) {
                map2.put(str, (java.lang.String) map.get(str));
            }
        }
    }

    public static void a(android.content.Context context, com.adjust.sdk.sig.c cVar, com.adjust.sdk.sig.a aVar, java.util.Map map, java.lang.String str, java.lang.String str2) {
        byte[] bArr;
        if (f2823a || map == null || map.size() == 0 || str == null || str2 == null) {
            return;
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        boolean equals = com.adjust.sdk.AdjustConfig.ENVIRONMENT_SANDBOX.equals(map.get("environment"));
        if (equals) {
            simpleDateFormat.format(new java.util.Date(java.lang.System.currentTimeMillis()));
        }
        map.put("activity_kind", str);
        map.put("client_sdk", str2);
        int i = 2;
        while (true) {
            if (i <= 0) {
                bArr = null;
                break;
            }
            try {
                cVar.b(context);
                bArr = cVar.a(context, map.toString().getBytes("UTF-8"));
                break;
            } catch (com.adjust.sdk.sig.b e) {
                f2823a = true;
                map.remove("activity_kind");
                map.remove("client_sdk");
                throw e;
            } catch (java.security.InvalidKeyException e2) {
                e = e2;
            } catch (java.security.UnrecoverableKeyException e3) {
                e = e3;
            } catch (java.lang.Exception e4) {
                e4.getMessage();
                map.remove("activity_kind");
                map.remove("client_sdk");
                throw e4;
            }
            e.getMessage();
            i--;
            cVar.a(context);
        }
        if (i == 0) {
            f2823a = true;
            map.remove("activity_kind");
            map.remove("client_sdk");
            return;
        }
        if (equals) {
            simpleDateFormat.format(new java.util.Date(java.lang.System.currentTimeMillis()));
        }
        byte[] nSign = ((com.adjust.sdk.sig.NativeLibHelper) aVar).nSign(context, map, bArr, cVar.f2822a);
        if (equals) {
            simpleDateFormat.format(new java.util.Date(java.lang.System.currentTimeMillis()));
        }
        if (nSign == null) {
            map.remove("activity_kind");
            map.remove("client_sdk");
            return;
        }
        int length = nSign.length;
        char[] cArr = com.adjust.sdk.sig.e.f2824a;
        char[] cArr2 = new char[length * 2];
        for (int i2 = 0; i2 < length; i2++) {
            byte b = nSign[i2];
            int i3 = i2 * 2;
            char[] cArr3 = com.adjust.sdk.sig.e.f2824a;
            cArr2[i3] = cArr3[(b & 255) >>> 4];
            cArr2[i3 + 1] = cArr3[b & com.google.common.base.Ascii.SI];
        }
        map.put("signature", new java.lang.String(cArr2));
        map.remove("activity_kind");
        map.remove("client_sdk");
        if (equals) {
            simpleDateFormat.format(new java.util.Date(java.lang.System.currentTimeMillis()));
        }
    }
}
