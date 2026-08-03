package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* loaded from: classes5.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.U f7418a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.U();
    public static final java.util.Map<java.lang.Integer, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3447d> b = new java.util.LinkedHashMap();
    public static final int c = 8;

    public final void b(int i) {
        b.remove(java.lang.Integer.valueOf(i));
    }

    public final int a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3447d wv) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wv, "wv");
        int hashCode = wv.hashCode();
        b.put(java.lang.Integer.valueOf(hashCode), wv);
        return hashCode;
    }

    public final /* synthetic */ <T> T a(int i) {
        T t = (T) b.get(java.lang.Integer.valueOf(i));
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
        return t;
    }
}
