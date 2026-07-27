package com.inmobi.media;

import com.inmobi.ads.InMobiBanner;
import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* loaded from: classes6.dex */
public final class F9 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6553a;
    public final /* synthetic */ long b;
    public final /* synthetic */ WeakReference c;
    public final /* synthetic */ EnumC4149v2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F9(long j, WeakReference weakReference, EnumC4149v2 enumC4149v2, Continuation continuation) {
        super(2, continuation);
        this.b = j;
        this.c = weakReference;
        this.d = enumC4149v2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new F9(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((F9) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        A2 mAdManager;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6553a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.b;
            this.f6553a = 1;
            if (DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        InMobiBanner inMobiBanner = (InMobiBanner) this.c.get();
        if (inMobiBanner == null) {
            return Unit.INSTANCE;
        }
        if (!inMobiBanner.isAttachedToWindow() && (mAdManager = inMobiBanner.getMAdManager()) != null) {
            mAdManager.a(this.d, this.b);
        }
        return Unit.INSTANCE;
    }
}
