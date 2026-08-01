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

/* renamed from: com.inmobi.media.l1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3865l1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7212a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ AbstractC3923n1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3865l1(byte[] bArr, AbstractC3923n1 abstractC3923n1, Continuation continuation) {
        super(2, continuation);
        this.b = bArr;
        this.c = abstractC3923n1;
    }

    public static final Unit a(AbstractC3923n1 abstractC3923n1, X x) {
        AbstractC3923n1.a(abstractC3923n1, x);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3865l1(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3865l1(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7212a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                byte[] bArr = this.b;
                AbstractC3923n1 abstractC3923n1 = this.c;
                C3553a c3553a = new C3553a(bArr, abstractC3923n1.l.f7470a, abstractC3923n1.i);
                final AbstractC3923n1 abstractC3923n12 = this.c;
                Function1 function1 = new Function1() { // from class: com.inmobi.media.l1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C3865l1.a(AbstractC3923n1.this, (X) obj2);
                    }
                };
                this.f7212a = 1;
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
            AbstractC3923n1 abstractC3923n13 = this.c;
            Z9 z9 = abstractC3923n13.i;
            if (z9 != null) {
                C4201x0 c4201x0 = abstractC3923n13.l;
                AbstractC3666e0.a(c4201x0.e, c4201x0.f, adResponse, z9);
            }
            this.c.a(adResponse);
        } catch (Z e) {
            AbstractC3923n1 abstractC3923n14 = this.c;
            W w = e.b;
            if (w instanceof C4194wk) {
                abstractC3923n14.b(((C4194wk) w).f7463a);
            }
            abstractC3923n14.b(e.f6983a, true, (short) 0);
        } catch (Throwable th) {
            Z9 z92 = this.c.i;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                z92.a("n1", "doAdLoadWork: " + th);
            }
            Lazy lazy = Ba.f6473a;
            Ba.a(new C3810j3(th));
            AbstractC3923n1 abstractC3923n15 = this.c;
            abstractC3923n15.getClass();
            abstractC3923n15.b(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2363)));
            abstractC3923n15.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
        }
        return Unit.INSTANCE;
    }
}
