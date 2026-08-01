package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes6.dex */
public final class Ln extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6701a;
    public final /* synthetic */ XmlPullParser b;
    public final /* synthetic */ Ref.BooleanRef c;
    public final /* synthetic */ Rn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ln(Rn rn, Continuation continuation, Ref.BooleanRef booleanRef, XmlPullParser xmlPullParser) {
        super(1, continuation);
        this.b = xmlPullParser;
        this.c = booleanRef;
        this.d = rn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        XmlPullParser xmlPullParser = this.b;
        return new Ln(this.d, continuation, this.c, xmlPullParser);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Ln) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6701a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(this.b.getName(), "VAST")) {
                this.c.element = true;
                Rn rn = this.d;
                XmlPullParser xmlPullParser = this.b;
                this.f6701a = 1;
                if (Rn.b(rn, xmlPullParser, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
