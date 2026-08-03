package com.ironsource;

/* loaded from: classes5.dex */
public final class Ec extends java.lang.Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ec(java.lang.Exception e) {
        super("Missing Headers", e);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "e");
    }
}
