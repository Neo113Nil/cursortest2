package com.plaid.internal;

/* renamed from: com.plaid.internal.n2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0593n2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonBuilder, kotlin.Unit> {

    /* renamed from: a, reason: collision with root package name */
    public static final com.plaid.internal.C0593n2 f6505a = new com.plaid.internal.C0593n2();

    public C0593n2() {
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
