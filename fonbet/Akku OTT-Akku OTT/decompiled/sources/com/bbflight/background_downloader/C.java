package com.bbflight.background_downloader;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class C implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        B it = (B) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.ordinal());
    }
}
