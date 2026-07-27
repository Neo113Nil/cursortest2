package com.vungle.ads.internal.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class q extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f12158a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar) {
        super(2);
        this.f12158a = zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        String errorMessage = (String) obj2;
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f12158a.a(errorMessage, intValue);
        return Unit.INSTANCE;
    }
}
