package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* renamed from: com.inmobi.media.sp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4088sp extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7382a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4116tp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4088sp(C4116tp c4116tp, Continuation continuation) {
        super(2, continuation);
        this.c = c4116tp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C4088sp c4088sp = new C4088sp(this.c, continuation);
        c4088sp.b = obj;
        return c4088sp;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4088sp c4088sp = new C4088sp(this.c, (Continuation) obj2);
        c4088sp.b = (CoroutineScope) obj;
        return c4088sp.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r4, r6) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        if (com.inmobi.media.C4116tp.a(r7, r6) == r0) goto L22;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005c -> B:6:0x002e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7382a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.b;
        } else if (i == 1) {
            coroutineScope = (CoroutineScope) this.b;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (IllegalStateException e) {
                String str = "Exception in VideoProgressTracker: " + e;
            }
            long j = this.c.c;
            this.b = coroutineScope;
            this.f7382a = 2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.b;
            ResultKt.throwOnFailure(obj);
        }
        if (!CoroutineScopeKt.isActive(coroutineScope)) {
            return Unit.INSTANCE;
        }
        C4116tp c4116tp = this.c;
        this.b = coroutineScope;
        this.f7382a = 1;
    }
}
