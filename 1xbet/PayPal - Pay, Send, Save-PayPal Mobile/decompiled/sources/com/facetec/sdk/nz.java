package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class nz {
    static {
        com.facetec.sdk.pq.d("\"\\");
        com.facetec.sdk.pq.d("\t ,=");
    }

    public static long e(com.facetec.sdk.mw mwVar) {
        return c(mwVar.c().c("Content-Length"));
    }

    private static long c(java.lang.String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return java.lang.Long.parseLong(str);
        } catch (java.lang.NumberFormatException unused) {
            return -1L;
        }
    }

    public static void a(com.facetec.sdk.mi miVar, com.facetec.sdk.mv mvVar, com.facetec.sdk.mm mmVar) {
        if (miVar == com.facetec.sdk.mi.f3646a) {
            return;
        }
        com.facetec.sdk.ml.b(mvVar, mmVar).isEmpty();
    }

    public static boolean a(com.facetec.sdk.mw mwVar) {
        if (mwVar.d().a().equals(com.datadog.android.internal.network.HttpSpec.Method.HEAD)) {
            return false;
        }
        int e = mwVar.e();
        return (((e >= 100 && e < 200) || e == 204 || e == 304) && e(mwVar) == -1 && !"chunked".equalsIgnoreCase(mwVar.b(com.google.common.net.HttpHeaders.TRANSFER_ENCODING))) ? false : true;
    }

    public static int e(java.lang.String str, int i, java.lang.String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int b(java.lang.String str, int i) {
        char charAt;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || charAt == '\t')) {
            i++;
        }
        return i;
    }

    public static int c(java.lang.String str, int i) {
        try {
            long parseLong = java.lang.Long.parseLong(str);
            if (parseLong > androidx.collection.SieveCacheKt.NodeLinkMask) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (java.lang.NumberFormatException unused) {
            return i;
        }
    }
}
