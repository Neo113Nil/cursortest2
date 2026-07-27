package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.a2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3556a2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3584b2 f7002a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3556a2(C3584b2 c3584b2, Continuation continuation) {
        super(2, continuation);
        this.f7002a = c3584b2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3556a2(this.f7002a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3556a2(this.f7002a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C3584b2 c3584b2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean z = 0;
        z = 0;
        try {
            try {
                C3584b2 c3584b22 = this.f7002a;
                c3584b22.c = c3584b22.f7022a.invoke();
                c3584b2 = this.f7002a;
            } catch (Exception e) {
                String str = "Exception occurred while refreshing property value: " + e.getMessage();
                c3584b2 = this.f7002a;
            }
            c3584b2.d.set(false);
            z = Unit.INSTANCE;
            return z;
        } catch (Throwable th) {
            this.f7002a.d.set(z);
            throw th;
        }
    }
}
