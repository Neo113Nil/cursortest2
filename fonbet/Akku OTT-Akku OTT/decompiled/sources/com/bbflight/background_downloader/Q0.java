package com.bbflight.background_downloader;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class Q0 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        kotlinx.serialization.descriptors.a buildClassSerialDescriptor = (kotlinx.serialization.descriptors.a) obj;
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        List emptyList = CollectionsKt.emptyList();
        kotlinx.serialization.internal.S0 s0 = kotlinx.serialization.internal.S0.a;
        kotlinx.serialization.internal.J0 j0 = kotlinx.serialization.internal.S0.b;
        buildClassSerialDescriptor.a("type", j0, emptyList);
        List emptyList2 = CollectionsKt.emptyList();
        kotlinx.serialization.internal.W w = kotlinx.serialization.internal.W.a;
        buildClassSerialDescriptor.a("httpResponseCode", kotlinx.serialization.internal.W.b, emptyList2);
        buildClassSerialDescriptor.a("description", j0, CollectionsKt.emptyList());
        return Unit.INSTANCE;
    }
}
