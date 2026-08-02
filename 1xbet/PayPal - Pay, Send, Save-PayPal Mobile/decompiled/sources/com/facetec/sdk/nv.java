package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class nv {

    /* renamed from: a, reason: collision with root package name */
    public static int f3694a;
    public static int d;

    public static boolean d(java.lang.String str) {
        return str.equals("POST") || str.equals(com.datadog.android.internal.network.HttpSpec.Method.PUT) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REPORT);
    }

    public static boolean e(java.lang.String str) {
        return (str.equals("GET") || str.equals(com.datadog.android.internal.network.HttpSpec.Method.HEAD)) ? false : true;
    }

    public static int b() {
        int i = f3694a;
        f3694a = i + 1;
        if (i % 6475074 != 0) {
            return d;
        }
        int freeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
        d = freeMemory;
        return freeMemory;
    }
}
