package com.inmobi.media;

import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class Pc extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public C4213xc f6781a;
    public Iterator b;
    public int c;
    public final /* synthetic */ C4213xc d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pc(C4213xc c4213xc, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.d = c4213xc;
        this.e = j;
        this.f = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Pc(this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Pc) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:7:0x0013, B:9:0x003d, B:11:0x0043, B:23:0x001f, B:24:0x0035, B:26:0x0026), top: B:2:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C4213xc c4213xc;
        Iterator it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C4213xc c4213xc2 = this.d;
                long j = this.e;
                int i2 = this.f;
                this.c = 1;
                obj = c4213xc2.a(j, i2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = this.b;
                    c4213xc = this.f6781a;
                    ResultKt.throwOnFailure(obj);
                    while (it.hasNext()) {
                        C4019qc c4019qc = (C4019qc) it.next();
                        Tc.a(c4019qc.f7325a);
                        String str = c4019qc.f7325a;
                        this.f6781a = c4213xc;
                        this.b = it;
                        this.c = 2;
                        if (c4213xc.a(str, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    Sc.c.set(false);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            c4213xc = this.d;
            it = ((List) obj).iterator();
            while (it.hasNext()) {
            }
            Sc.c.set(false);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            Sc.c.set(false);
            throw th;
        }
    }
}
