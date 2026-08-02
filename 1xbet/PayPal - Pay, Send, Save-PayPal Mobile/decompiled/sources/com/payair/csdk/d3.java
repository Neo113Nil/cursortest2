package com.payair.csdk;

/* loaded from: classes10.dex */
public final class d3 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.payair.csdk.d3 f4243a = new com.payair.csdk.d3();

    public d3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.payair.model.NetworkTokenReference networkTokenReference = (com.payair.model.NetworkTokenReference) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        return java.lang.Boolean.valueOf(networkTokenReference.isHandled());
    }
}
