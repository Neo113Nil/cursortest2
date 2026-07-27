package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* renamed from: com.inmobi.media.hc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3763hc extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7140a;
    public final /* synthetic */ C3553a b;
    public final /* synthetic */ AbstractC3792ic c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3763hc(C3553a c3553a, AbstractC3792ic abstractC3792ic, Continuation continuation) {
        super(2, continuation);
        this.b = c3553a;
        this.c = abstractC3792ic;
    }

    public static final Unit a(AbstractC3792ic abstractC3792ic, X x) {
        abstractC3792ic.m.a(x);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3763hc(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3763hc(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7140a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C3553a c3553a = this.b;
                final AbstractC3792ic abstractC3792ic = this.c;
                Function1 function1 = new Function1() { // from class: com.inmobi.media.hc$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C3763hc.a(AbstractC3792ic.this, (X) obj2);
                    }
                };
                this.f7140a = 1;
                obj = c3553a.a(function1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AdResponse adResponse = (AdResponse) obj;
            this.c.f7095a.getClass();
            AbstractC3792ic abstractC3792ic2 = this.c;
            AbstractC3666e0.a("native", abstractC3792ic2.d.h, adResponse, abstractC3792ic2.e);
            Z9 z9 = this.c.e;
            if (z9 != null) {
                z9.a("AUM-LoadResponseState", "AdResponse Parse Success");
            }
            this.c.a(adResponse);
        } catch (Z e) {
            Z9 z92 = this.c.e;
            if (z92 != null) {
                z92.b("AUM-LoadResponseState", "AdResponse Parse Failure " + e);
            }
            AbstractC3792ic abstractC3792ic3 = this.c;
            abstractC3792ic3.getClass();
            W w = e.b;
            if (w instanceof C4248yk) {
                C3922n0 c3922n0 = abstractC3792ic3.g;
                BuildersKt__Builders_commonKt.launch$default(c3922n0.f7256a, null, null, new C3894m0(c3922n0, null), 3, null);
                abstractC3792ic3.a(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 0)), e.f6983a);
            } else if (w instanceof C3842k7) {
                abstractC3792ic3.a(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(((C3842k7) w).f7197a))), e.f6983a);
            } else if (w instanceof C3871l7) {
                abstractC3792ic3.a(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf((short) ((C3871l7) w).f7218a))), e.f6983a);
            } else {
                if (!(w instanceof C4194wk)) {
                    throw new NoWhenBranchMatchedException();
                }
                abstractC3792ic3.a(((C4194wk) w).f7463a, e.f6983a);
            }
        }
        return Unit.INSTANCE;
    }
}
