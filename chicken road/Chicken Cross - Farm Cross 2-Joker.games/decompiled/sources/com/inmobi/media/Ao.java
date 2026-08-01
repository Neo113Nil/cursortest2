package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class Ao extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bo f6462a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ao(Bo bo, Continuation continuation) {
        super(2, continuation);
        this.f6462a = bo;
    }

    public static final void a(Bo bo, View view) {
        AbstractC4012q5.a(bo.d, bo.b, C3578ao.f7018a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Ao(this.f6462a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Ao(this.f6462a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        final Bo bo = this.f6462a;
        ViewGroup viewGroup = bo.j;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.Ao$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ao.a(Bo.this, view);
                }
            });
        }
        return Unit.INSTANCE;
    }
}
