package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.dj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3658dj extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f7072a;
    public C4213xc b;
    public int c;
    public final /* synthetic */ C3685ej d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3658dj(C3685ej c3685ej, long j, boolean z, Continuation continuation) {
        super(2, continuation);
        this.d = c3685ej;
        this.e = j;
        this.f = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3658dj(this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3658dj) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
    
        if (r2.b(r7, r19) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00af  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C4213xc c4213xc;
        Object b;
        C4019qc c4019qc;
        C4213xc dao;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C3685ej c3685ej = this.d;
            long j = this.e;
            boolean z = this.f;
            String str = c3685ej.j;
            C4019qc c4019qc2 = new C4019qc(str, j, 0, 0L, z, c3685ej.k.get(), 12);
            c4213xc = (C4213xc) AbstractC4240yc.f7500a.getValue();
            this.f7072a = c4019qc2;
            this.b = c4213xc;
            this.c = 1;
            b = c4213xc.b(str, this);
            if (b != coroutine_suspended) {
                c4019qc = c4019qc2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4213xc c4213xc2 = (C4213xc) this.f7072a;
            ResultKt.throwOnFailure(obj);
            dao = c4213xc2;
            CoroutineScope coroutineScope = Sc.f6848a;
            long j2 = this.e;
            C3685ej c3685ej2 = this.d;
            long j3 = j2 - c3685ej2.b;
            int i2 = c3685ej2.c;
            Intrinsics.checkNotNullParameter(dao, "dao");
            if (!Sc.c.getAndSet(true)) {
                Qc runnable = new Qc(dao, j3, i2, null);
                CoroutineScope coroutineScope2 = AbstractC4143un.f7420a;
                Intrinsics.checkNotNullParameter(runnable, "runnable");
                BuildersKt__Builders_commonKt.launch$default(AbstractC4143un.f7420a, null, null, new C4058rn(10000L, null, runnable), 3, null);
            }
            return Unit.INSTANCE;
        }
        c4213xc = this.b;
        c4019qc = (C4019qc) this.f7072a;
        ResultKt.throwOnFailure(obj);
        b = obj;
        if (((Boolean) b).booleanValue()) {
            this.f7072a = null;
            this.b = null;
            this.c = 2;
        } else {
            this.f7072a = c4213xc;
            this.b = null;
            this.c = 3;
            if (c4213xc.a(c4019qc, this) != coroutine_suspended) {
                dao = c4213xc;
                CoroutineScope coroutineScope3 = Sc.f6848a;
                long j22 = this.e;
                C3685ej c3685ej22 = this.d;
                long j32 = j22 - c3685ej22.b;
                int i22 = c3685ej22.c;
                Intrinsics.checkNotNullParameter(dao, "dao");
                if (!Sc.c.getAndSet(true)) {
                }
                return Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }
}
