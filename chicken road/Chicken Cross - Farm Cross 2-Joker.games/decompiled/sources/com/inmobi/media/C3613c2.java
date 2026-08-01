package com.inmobi.media;

import android.view.ViewGroup;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.c2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3613c2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7038a;
    public final /* synthetic */ C3697f2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3613c2(C3697f2 c3697f2, Continuation continuation) {
        super(2, continuation);
        this.b = c3697f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3613c2(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3613c2(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7038a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C3697f2 c3697f2 = this.b;
            ViewGroup viewGroup = c3697f2.b;
            CoroutineScope coroutineScope = c3697f2.f7097a;
            this.f7038a = 1;
            if (C3697f2.a(c3697f2, viewGroup, coroutineScope, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
