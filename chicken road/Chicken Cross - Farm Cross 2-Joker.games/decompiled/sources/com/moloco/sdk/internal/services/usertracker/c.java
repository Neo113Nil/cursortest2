package com.moloco.sdk.internal.services.usertracker;

import com.moloco.sdk.internal.services.w;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class c implements b {
    public static final int b = 8;

    /* renamed from: a, reason: collision with root package name */
    public final w f10835a;

    public c(w dataStoreService) {
        Intrinsics.checkNotNullParameter(dataStoreService, "dataStoreService");
        this.f10835a = dataStoreService;
    }

    @Override // com.moloco.sdk.internal.services.usertracker.b
    public Object a(String str, Continuation<? super Unit> continuation) {
        Object a2 = this.f10835a.a(d.f10836a, str, continuation);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.internal.services.usertracker.b
    public Object b(Continuation<? super String> continuation) {
        return this.f10835a.d(d.f10836a, continuation);
    }

    @Override // com.moloco.sdk.internal.services.usertracker.b
    public Object a(Continuation<? super Unit> continuation) {
        Object a2 = this.f10835a.a(d.f10836a, continuation);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }
}
