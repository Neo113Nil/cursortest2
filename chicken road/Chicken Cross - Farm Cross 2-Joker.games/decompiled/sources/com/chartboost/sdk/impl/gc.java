package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class gc extends hj {
    public /* synthetic */ gc(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 101 : num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(String elementName, Integer num) {
        super("Missing required element: " + elementName + ".", num);
        Intrinsics.checkNotNullParameter(elementName, "elementName");
    }
}
