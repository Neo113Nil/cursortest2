package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.j1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3808j1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7171a;
    public final /* synthetic */ AbstractC3923n1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3808j1(AbstractC3923n1 abstractC3923n1, Continuation continuation) {
        super(2, continuation);
        this.b = abstractC3923n1;
    }

    public static final Unit a(AbstractC3923n1 abstractC3923n1, X x) {
        AbstractC3923n1.a(abstractC3923n1, x);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3808j1(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3808j1(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7171a;
        try {
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        C3948nq c3948nq = new C3948nq(this.b.H(), this.b.i);
                        final AbstractC3923n1 abstractC3923n1 = this.b;
                        Function1 function1 = new Function1() { // from class: com.inmobi.media.j1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return C3808j1.a(AbstractC3923n1.this, (X) obj2);
                            }
                        };
                        this.f7171a = 1;
                        obj = c3948nq.a(function1, this);
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
                    AbstractC3923n1 abstractC3923n12 = this.b;
                    Z9 z9 = abstractC3923n12.i;
                    if (z9 != null) {
                        C4201x0 c4201x0 = abstractC3923n12.l;
                        AbstractC3666e0.a(c4201x0.e, c4201x0.f, adResponse, z9);
                    }
                    this.b.a(adResponse);
                } catch (Throwable th) {
                    Z9 z92 = this.b.i;
                    if (z92 != null) {
                        Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                        z92.a("n1", "doAdLoadWork: " + th);
                    }
                    Lazy lazy = Ba.f6473a;
                    Ba.a(new C3810j3(th));
                    AbstractC3923n1 abstractC3923n13 = this.b;
                    abstractC3923n13.getClass();
                    abstractC3923n13.b(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2363)));
                    abstractC3923n13.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
                }
            } catch (Z e) {
                AbstractC3923n1.a(this.b, e);
            }
            this.b.b((byte) 0);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            this.b.b((byte) 0);
            throw th2;
        }
    }
}
