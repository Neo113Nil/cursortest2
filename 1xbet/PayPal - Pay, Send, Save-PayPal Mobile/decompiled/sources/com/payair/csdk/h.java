package com.payair.csdk;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.payair.csdk.h f4256a = new com.payair.csdk.h();

    public h() {
        super(1);
    }

    public static java.lang.String a(com.payair.hce.ErrorModel errorModel) {
        java.lang.String errorCode = errorModel.getErrorCode();
        java.lang.String description = errorModel.getDescription();
        java.lang.String reasonCode = errorModel.getReasonCode();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(errorCode);
        sb.append(" ");
        sb.append(description);
        sb.append(" ");
        sb.append(reasonCode);
        return sb.toString();
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        return a((com.payair.hce.ErrorModel) obj);
    }
}
