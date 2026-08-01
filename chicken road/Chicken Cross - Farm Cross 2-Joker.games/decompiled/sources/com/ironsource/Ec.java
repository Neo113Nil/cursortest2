package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ec extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ec(Exception e) {
        super("Missing Headers", e);
        Intrinsics.checkNotNullParameter(e, "e");
    }
}
