package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;

/* renamed from: com.inmobi.media.d4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3643d4 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7062a;
    public /* synthetic */ Object b;
    public final /* synthetic */ SuspendLambda c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3643d4(long j, Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.c = (SuspendLambda) function1;
        this.d = j;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C3643d4 c3643d4 = new C3643d4(this.d, continuation, this.c);
        c3643d4.b = obj;
        return c3643d4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3643d4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r4, r6) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r7.invoke(r6) == r0) goto L23;
     */
    /* JADX WARN: Type inference failed for: r7v5, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005c -> B:12:0x003f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7062a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.b;
            this.b = coroutineScope2;
            this.f7062a = 1;
            if (DelayKt.delay(0L, this) != coroutine_suspended) {
                coroutineScope = coroutineScope2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                coroutineScope = (CoroutineScope) this.b;
                ResultKt.throwOnFailure(obj);
                long j = this.d;
                this.b = coroutineScope;
                this.f7062a = 3;
            } else if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        coroutineScope = (CoroutineScope) this.b;
        ResultKt.throwOnFailure(obj);
        if (!CoroutineScopeKt.isActive(coroutineScope)) {
            return Unit.INSTANCE;
        }
        ?? r7 = this.c;
        this.b = coroutineScope;
        this.f7062a = 2;
    }
}
