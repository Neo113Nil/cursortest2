package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ab extends hj {
    public /* synthetic */ ab(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 100 : num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(String message, Integer num) {
        super(message, num);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
