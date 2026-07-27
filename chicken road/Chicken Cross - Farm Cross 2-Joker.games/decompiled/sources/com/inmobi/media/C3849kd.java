package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.MediaView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.kd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3849kd extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7201a;
    public final /* synthetic */ C3877ld b;
    public final /* synthetic */ Z6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3849kd(C3877ld c3877ld, Z6 z6, Continuation continuation) {
        super(2, continuation);
        this.b = c3877ld;
        this.c = z6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3849kd(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3849kd(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        if (r1.a(r13, r12) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r13.a(r12) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        G2 bo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7201a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C3877ld c3877ld = this.b;
            Y6 y6 = c3877ld.d;
            Z6 experienceModel = this.c;
            y6.getClass();
            Intrinsics.checkNotNullParameter(experienceModel, "experienceModel");
            if (experienceModel instanceof C3828jl) {
                bo = new C3800il(y6.f6966a, y6.b, (C3828jl) experienceModel, y6.c, y6.d);
            } else {
                if (!(experienceModel instanceof Co)) {
                    throw new NoWhenBranchMatchedException();
                }
                bo = new Bo(y6.f6966a, y6.b, (Co) experienceModel, y6.c, y6.d);
            }
            c3877ld.b = bo;
            G2 g2 = this.b.b;
            if (g2 != null) {
                this.f7201a = 1;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return this.b.c;
            }
            ResultKt.throwOnFailure(obj);
        }
        C3877ld c3877ld2 = this.b;
        G2 g22 = c3877ld2.b;
        if (g22 != null) {
            MediaView mediaView = c3877ld2.c;
            this.f7201a = 2;
        }
        return this.b.c;
    }
}
