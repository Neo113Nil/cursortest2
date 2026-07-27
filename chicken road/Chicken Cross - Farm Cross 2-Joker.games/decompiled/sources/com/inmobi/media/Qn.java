package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes6.dex */
public final class Qn extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6811a;
    public final /* synthetic */ XmlPullParser b;
    public final /* synthetic */ Rn c;
    public final /* synthetic */ Ref.BooleanRef d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qn(Rn rn, Continuation continuation, Ref.BooleanRef booleanRef, XmlPullParser xmlPullParser) {
        super(1, continuation);
        this.b = xmlPullParser;
        this.c = rn;
        this.d = booleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Qn(this.c, continuation, this.d, this.b);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Qn) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b4, code lost:
    
        if (r1.a((java.lang.String) r5, r4) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
    
        if (r5 == r0) goto L41;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6811a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String name = this.b.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -2077435339:
                        if (name.equals("AdVerifications")) {
                            this.c.c(this.b);
                            return Unit.INSTANCE;
                        }
                        break;
                    case -1692490108:
                        if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.o)) {
                            this.c.t(this.b);
                            return Unit.INSTANCE;
                        }
                        break;
                    case -587420703:
                        if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.g)) {
                            this.d.element = true;
                            Rn rn = this.c;
                            XmlPullParser xmlPullParser = this.b;
                            this.f6811a = 1;
                            if (rn.n(xmlPullParser) != 4) {
                                throw new Fn((short) 1109);
                            }
                            String b = An.b(xmlPullParser.getText());
                            if (b.length() == 0) {
                                throw new Fn((short) 1108);
                            }
                            obj = En.f6539a.a(b, this);
                            break;
                        }
                        break;
                    case 67232232:
                        if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c)) {
                            C4189wf a2 = this.c.a("error", this.b);
                            if (a2 != null) {
                                this.c.i.add(a2);
                            }
                            return Unit.INSTANCE;
                        }
                        break;
                    case 184043572:
                        if (name.equals("Extensions")) {
                            this.c.e(this.b);
                            return Unit.INSTANCE;
                        }
                        break;
                    case 2114088489:
                        if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n)) {
                            this.c.f(this.b);
                            return Unit.INSTANCE;
                        }
                        break;
                }
            }
            Rn rn2 = this.c;
            XmlPullParser xmlPullParser2 = this.b;
            rn2.getClass();
            Rn.w(xmlPullParser2);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        Rn rn3 = this.c;
        this.f6811a = 2;
    }
}
