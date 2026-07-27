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
public final class Nn extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6749a;
    public final /* synthetic */ XmlPullParser b;
    public final /* synthetic */ Rn c;
    public final /* synthetic */ Ref.BooleanRef d;
    public final /* synthetic */ Ref.BooleanRef e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nn(XmlPullParser xmlPullParser, Rn rn, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Continuation continuation) {
        super(1, continuation);
        this.b = xmlPullParser;
        this.c = rn;
        this.d = booleanRef;
        this.e = booleanRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Nn(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Nn) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6749a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String name = this.b.getName();
            if (Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c)) {
                C4189wf a2 = this.c.a("error", this.b);
                if (a2 != null) {
                    this.c.h.add(a2);
                }
            } else if (Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.d)) {
                Rn rn = this.c;
                XmlPullParser xmlPullParser = this.b;
                rn.getClass();
                try {
                    z = Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "conditionalAd"));
                } catch (Exception unused) {
                    z = false;
                }
                if (z) {
                    this.d.element = true;
                    Rn rn2 = this.c;
                    XmlPullParser xmlPullParser2 = this.b;
                    rn2.getClass();
                    Rn.w(xmlPullParser2);
                    return Unit.INSTANCE;
                }
                Ref.BooleanRef booleanRef = this.e;
                if (booleanRef.element) {
                    Rn rn3 = this.c;
                    XmlPullParser xmlPullParser3 = this.b;
                    rn3.getClass();
                    Rn.w(xmlPullParser3);
                    return Unit.INSTANCE;
                }
                booleanRef.element = true;
                Rn rn4 = this.c;
                XmlPullParser xmlPullParser4 = this.b;
                this.f6749a = 1;
                if (Rn.a(rn4, xmlPullParser4, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                Rn rn5 = this.c;
                XmlPullParser xmlPullParser5 = this.b;
                rn5.getClass();
                Rn.w(xmlPullParser5);
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
