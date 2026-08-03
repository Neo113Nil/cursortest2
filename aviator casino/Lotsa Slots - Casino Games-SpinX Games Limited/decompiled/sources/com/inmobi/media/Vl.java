package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Vl extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f5019a;
    public final /* synthetic */ org.xmlpull.v1.XmlPullParser b;
    public final /* synthetic */ com.inmobi.media.Wl c;
    public final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vl(com.inmobi.media.Wl wl, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.Ref.BooleanRef booleanRef, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        super(1, continuation);
        this.b = xmlPullParser;
        this.c = wl;
        this.d = booleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Vl(this.c, continuation, this.d, this.b);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return ((com.inmobi.media.Vl) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
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
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5019a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String name = this.b.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -2077435339:
                        if (name.equals("AdVerifications")) {
                            this.c.c(this.b);
                            return kotlin.Unit.INSTANCE;
                        }
                        break;
                    case -1692490108:
                        if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.o)) {
                            this.c.t(this.b);
                            return kotlin.Unit.INSTANCE;
                        }
                        break;
                    case -587420703:
                        if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.g)) {
                            this.d.element = true;
                            com.inmobi.media.Wl wl = this.c;
                            org.xmlpull.v1.XmlPullParser xmlPullParser = this.b;
                            this.f5019a = 1;
                            if (wl.n(xmlPullParser) != 4) {
                                throw new com.inmobi.media.Kl((short) 1109);
                            }
                            java.lang.String b = com.inmobi.media.Fl.b(xmlPullParser.getText());
                            if (b.length() == 0) {
                                throw new com.inmobi.media.Kl((short) 1108);
                            }
                            obj = com.inmobi.media.Jl.f4787a.a(b, this);
                            break;
                        }
                        break;
                    case 67232232:
                        if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c)) {
                            com.inmobi.media.De a2 = this.c.a("error", this.b);
                            if (a2 != null) {
                                this.c.i.add(a2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        break;
                    case 184043572:
                        if (name.equals("Extensions")) {
                            this.c.e(this.b);
                            return kotlin.Unit.INSTANCE;
                        }
                        break;
                    case 2114088489:
                        if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n)) {
                            this.c.f(this.b);
                            return kotlin.Unit.INSTANCE;
                        }
                        break;
                }
            }
            com.inmobi.media.Wl wl2 = this.c;
            org.xmlpull.v1.XmlPullParser xmlPullParser2 = this.b;
            wl2.getClass();
            com.inmobi.media.Wl.w(xmlPullParser2);
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.Wl wl3 = this.c;
        this.f5019a = 2;
    }
}
