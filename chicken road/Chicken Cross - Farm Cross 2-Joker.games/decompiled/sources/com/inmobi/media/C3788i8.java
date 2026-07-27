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
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* renamed from: com.inmobi.media.i8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3788i8 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4043r8 f7158a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3788i8(Continuation continuation, C4043r8 c4043r8) {
        super(2, continuation);
        this.f7158a = c4043r8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3788i8(continuation, this.f7158a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3788i8((Continuation) obj2, this.f7158a).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Job launch$default;
        Job launch$default2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.f7158a.c() == Kh.f) {
            this.f7158a.n.seekTo(0L);
            C4043r8 c4043r8 = this.f7158a;
            c4043r8.j.set(Kh.c);
        }
        C4182w8 c4182w8 = this.f7158a.y;
        if (c4182w8.e) {
            c4182w8.a();
            c4182w8.d.a();
        } else {
            AbstractC4012q5.a(c4182w8.f7453a, new C4155v8(c4182w8, null));
        }
        V6 v6 = this.f7158a.x;
        if (!v6.d.getAndSet(true)) {
            CoroutineScope coroutineScope = v6.b;
            long j = v6.k;
            T6 action = new T6(v6, null);
            Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
            Intrinsics.checkNotNullParameter(action, "action");
            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain().getImmediate(), null, new C3643d4(j, null, action), 2, null);
            v6.e = launch$default;
            CoroutineScope coroutineScope2 = v6.b;
            long j2 = v6.l;
            U6 action2 = new U6(v6, null);
            Intrinsics.checkNotNullParameter(coroutineScope2, "<this>");
            Intrinsics.checkNotNullParameter(action2, "action");
            launch$default2 = BuildersKt__Builders_commonKt.launch$default(coroutineScope2, Dispatchers.getMain().getImmediate(), null, new C3643d4(j2, null, action2), 2, null);
            v6.f = launch$default2;
        }
        this.f7158a.n.play();
        C4043r8 c4043r82 = this.f7158a;
        c4043r82.j.set(Kh.d);
        C4043r8 c4043r83 = this.f7158a;
        c4043r83.a(new C4172vp(c4043r83.n.getCurrentPosition()));
        return Unit.INSTANCE;
    }
}
