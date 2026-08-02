package com.amplitude.android.utilities;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class k extends AdaptedFunctionReference implements Function2<String, Map<String, ? extends Object>, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Map<String, ? extends Object> map) {
        String p0 = str;
        Intrinsics.checkNotNullParameter(p0, "p0");
        com.amplitude.core.b.m((com.amplitude.android.a) this.receiver, p0, map, 4);
        return Unit.INSTANCE;
    }
}
