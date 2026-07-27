package com.inmobi.media;

import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;

/* renamed from: com.inmobi.media.vg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4163vg extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7438a;
    public final /* synthetic */ Kf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4163vg(Kf kf, Continuation continuation) {
        super(2, continuation);
        this.b = kf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4163vg(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4163vg(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7438a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C3733ga c3733ga = (C3733ga) If.c.getValue();
            Kf kf = this.b;
            this.f7438a = 1;
            obj = c3733ga.f7119a.a(kf, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Of of = (Of) obj;
        if (!AbstractC4086sn.a(of)) {
            throw new IOException();
        }
        IntRange intRange = Tf.f6872a;
        Intrinsics.checkNotNullParameter(of, "<this>");
        return of.d().string(Charsets.UTF_8);
    }
}
