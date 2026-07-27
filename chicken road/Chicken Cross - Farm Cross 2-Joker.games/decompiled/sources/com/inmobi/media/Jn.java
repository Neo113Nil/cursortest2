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
public final class Jn extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6657a;
    public final /* synthetic */ XmlPullParser b;
    public final /* synthetic */ Ref.BooleanRef c;
    public final /* synthetic */ Rn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jn(Rn rn, Continuation continuation, Ref.BooleanRef booleanRef, XmlPullParser xmlPullParser) {
        super(1, continuation);
        this.b = xmlPullParser;
        this.c = booleanRef;
        this.d = rn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        XmlPullParser xmlPullParser = this.b;
        return new Jn(this.d, continuation, this.c, xmlPullParser);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Jn) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6657a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String name = this.b.getName();
            if (Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.e)) {
                Ref.BooleanRef booleanRef = this.c;
                if (!booleanRef.element) {
                    booleanRef.element = true;
                    this.d.g(this.b);
                }
            } else if (Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.f)) {
                Ref.BooleanRef booleanRef2 = this.c;
                if (!booleanRef2.element) {
                    booleanRef2.element = true;
                    Rn rn = this.d;
                    XmlPullParser xmlPullParser = this.b;
                    this.f6657a = 1;
                    if (Rn.c(rn, xmlPullParser, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                Rn rn2 = this.d;
                XmlPullParser xmlPullParser2 = this.b;
                rn2.getClass();
                Rn.w(xmlPullParser2);
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
