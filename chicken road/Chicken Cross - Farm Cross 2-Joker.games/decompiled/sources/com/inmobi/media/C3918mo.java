package com.inmobi.media;

import android.view.ViewGroup;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.mo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3918mo extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bo f7253a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3918mo(Bo bo, Continuation continuation) {
        super(2, continuation);
        this.f7253a = bo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3918mo(this.f7253a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3918mo(this.f7253a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ViewGroup viewGroup = this.f7253a.j;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(null);
        }
        return Unit.INSTANCE;
    }
}
