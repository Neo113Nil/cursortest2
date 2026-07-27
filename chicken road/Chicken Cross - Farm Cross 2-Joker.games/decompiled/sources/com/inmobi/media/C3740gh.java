package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Semaphore;

/* renamed from: com.inmobi.media.gh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3740gh extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC3571ah f7124a;
    public int b;
    public final /* synthetic */ AbstractC3796ih c;
    public final /* synthetic */ Vg d;
    public final /* synthetic */ Semaphore e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3740gh(AbstractC3796ih abstractC3796ih, Vg vg, Semaphore semaphore, Continuation continuation) {
        super(2, continuation);
        this.c = abstractC3796ih;
        this.d = vg;
        this.e = semaphore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3740gh(this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3740gh) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r1.a((com.inmobi.media.C3628ch) r6, r5) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC3571ah interfaceC3571ah;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC3796ih abstractC3796ih = this.c;
                interfaceC3571ah = abstractC3796ih.b;
                Vg vg = this.d;
                this.f7124a = interfaceC3571ah;
                this.b = 1;
                obj = abstractC3796ih.a(vg, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.e.release();
                    return Unit.INSTANCE;
                }
                interfaceC3571ah = this.f7124a;
                ResultKt.throwOnFailure(obj);
            }
            this.f7124a = null;
            this.b = 2;
        } catch (Throwable th) {
            this.e.release();
            throw th;
        }
    }
}
