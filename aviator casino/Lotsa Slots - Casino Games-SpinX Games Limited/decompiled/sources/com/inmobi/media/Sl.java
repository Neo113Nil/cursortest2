package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Sl extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f4961a;
    public final /* synthetic */ org.xmlpull.v1.XmlPullParser b;
    public final /* synthetic */ com.inmobi.media.Wl c;
    public final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef d;
    public final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sl(org.xmlpull.v1.XmlPullParser xmlPullParser, com.inmobi.media.Wl wl, kotlin.jvm.internal.Ref.BooleanRef booleanRef, kotlin.jvm.internal.Ref.BooleanRef booleanRef2, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.b = xmlPullParser;
        this.c = wl;
        this.d = booleanRef;
        this.e = booleanRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Sl(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return ((com.inmobi.media.Sl) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4961a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String name = this.b.getName();
            if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c)) {
                com.inmobi.media.De a2 = this.c.a("error", this.b);
                if (a2 != null) {
                    this.c.h.add(a2);
                }
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.d)) {
                com.inmobi.media.Wl wl = this.c;
                org.xmlpull.v1.XmlPullParser xmlPullParser = this.b;
                wl.getClass();
                try {
                    if (java.lang.Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "conditionalAd"))) {
                        this.d.element = true;
                        com.inmobi.media.Wl wl2 = this.c;
                        org.xmlpull.v1.XmlPullParser xmlPullParser2 = this.b;
                        wl2.getClass();
                        com.inmobi.media.Wl.w(xmlPullParser2);
                        return kotlin.Unit.INSTANCE;
                    }
                } catch (java.lang.Exception unused) {
                }
                kotlin.jvm.internal.Ref.BooleanRef booleanRef = this.e;
                if (booleanRef.element) {
                    com.inmobi.media.Wl wl3 = this.c;
                    org.xmlpull.v1.XmlPullParser xmlPullParser3 = this.b;
                    wl3.getClass();
                    com.inmobi.media.Wl.w(xmlPullParser3);
                    return kotlin.Unit.INSTANCE;
                }
                booleanRef.element = true;
                com.inmobi.media.Wl wl4 = this.c;
                org.xmlpull.v1.XmlPullParser xmlPullParser4 = this.b;
                this.f4961a = 1;
                if (com.inmobi.media.Wl.a(wl4, xmlPullParser4, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                com.inmobi.media.Wl wl5 = this.c;
                org.xmlpull.v1.XmlPullParser xmlPullParser5 = this.b;
                wl5.getClass();
                com.inmobi.media.Wl.w(xmlPullParser5);
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
