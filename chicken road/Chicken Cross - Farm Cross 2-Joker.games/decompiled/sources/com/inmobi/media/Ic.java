package com.inmobi.media;

import android.content.Context;
import java.util.Calendar;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class Ic extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6625a;
    public final /* synthetic */ Jc b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ic(Jc jc, Context context, Continuation continuation) {
        super(1, continuation);
        this.b = jc;
        this.c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Ic(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Ic(this.b, this.c, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6625a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.b.g.get()) {
                return Unit.INSTANCE;
            }
            Jc jc = this.b;
            Context context = this.c;
            this.f6625a = 1;
            if (jc.a(context, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        CoroutineScope coroutineScope = Sc.f6848a;
        C4213xc dao = (C4213xc) AbstractC4240yc.f7500a.getValue();
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        Jc jc2 = this.b;
        long j = timeInMillis - jc2.c;
        int i2 = jc2.e;
        Intrinsics.checkNotNullParameter(dao, "dao");
        if (!Sc.c.getAndSet(true)) {
            Qc runnable = new Qc(dao, j, i2, null);
            CoroutineScope coroutineScope2 = AbstractC4143un.f7420a;
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            BuildersKt__Builders_commonKt.launch$default(AbstractC4143un.f7420a, null, null, new C4058rn(10000L, null, runnable), 3, null);
        }
        return Unit.INSTANCE;
    }
}
