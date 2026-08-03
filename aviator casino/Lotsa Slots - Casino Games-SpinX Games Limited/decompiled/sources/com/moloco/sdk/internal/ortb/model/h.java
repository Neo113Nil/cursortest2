package com.moloco.sdk.internal.ortb.model;

/* loaded from: classes5.dex */
public final class h {
    public static final java.lang.String a(com.moloco.sdk.internal.ortb.model.C3415e c3415e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c3415e, "<this>");
        java.lang.String mtid = c3415e.getExt().getMtid();
        return mtid == null ? "UNKNOWN_MTID" : mtid;
    }
}
