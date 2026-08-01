package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class Bd extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Cd f6474a;
    public final /* synthetic */ AdSessionConfiguration b;
    public final /* synthetic */ AdSessionContext c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bd(Cd cd, AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, Continuation continuation) {
        super(2, continuation);
        this.f6474a = cd;
        this.b = adSessionConfiguration;
        this.c = adSessionContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Bd(this.f6474a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Bd) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Cd cd = this.f6474a;
        AdSessionConfiguration adSessionConfiguration = this.b;
        Intrinsics.checkNotNull(adSessionConfiguration);
        AdSessionContext adSessionContext = this.c;
        int i = Cd.h;
        cd.a(adSessionConfiguration, adSessionContext);
        this.f6474a.b();
        this.f6474a.c();
        return Unit.INSTANCE;
    }
}
