package com.vungle.ads.internal.executor;

import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.OutOfMemory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class i extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f11916a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar) {
        super(0);
        this.f11916a = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        new OutOfMemory(l.a("submit callable error in ").append(this.f11916a.a()).toString()).logErrorNoReturnValue$vungle_ads_release();
        return Unit.INSTANCE;
    }
}
