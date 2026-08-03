package com.moloco.sdk.internal.services.usertracker;

/* loaded from: classes5.dex */
public final class c implements com.moloco.sdk.internal.services.usertracker.b {
    public static final int b = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.w f7314a;

    public c(com.moloco.sdk.internal.services.w dataStoreService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStoreService, "dataStoreService");
        this.f7314a = dataStoreService;
    }

    @Override // com.moloco.sdk.internal.services.usertracker.b
    public java.lang.Object a(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object a2 = this.f7314a.a(com.moloco.sdk.internal.services.usertracker.d.f7315a, str, continuation);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.internal.services.usertracker.b
    public java.lang.Object b(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return this.f7314a.d(com.moloco.sdk.internal.services.usertracker.d.f7315a, continuation);
    }

    @Override // com.moloco.sdk.internal.services.usertracker.b
    public java.lang.Object a(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object a2 = this.f7314a.a(com.moloco.sdk.internal.services.usertracker.d.f7315a, continuation);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }
}
