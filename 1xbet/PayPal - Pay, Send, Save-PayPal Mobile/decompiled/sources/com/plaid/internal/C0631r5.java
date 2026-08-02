package com.plaid.internal;

/* renamed from: com.plaid.internal.r5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0631r5 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonBuilder, kotlin.Unit> {

    /* renamed from: a, reason: collision with root package name */
    public static final com.plaid.internal.C0631r5 f6557a = new com.plaid.internal.C0631r5();

    public C0631r5() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final kotlin.Unit invoke(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
        kotlinx.serialization.json.JsonBuilder jsonBuilder2 = jsonBuilder;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder2, "");
        jsonBuilder2.setIgnoreUnknownKeys(true);
        return kotlin.Unit.INSTANCE;
    }
}
