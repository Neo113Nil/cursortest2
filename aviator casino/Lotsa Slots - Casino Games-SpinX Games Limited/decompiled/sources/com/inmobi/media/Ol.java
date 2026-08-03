package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ol extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f4881a;
    public final /* synthetic */ org.xmlpull.v1.XmlPullParser b;
    public final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef c;
    public final /* synthetic */ com.inmobi.media.Wl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ol(com.inmobi.media.Wl wl, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.Ref.BooleanRef booleanRef, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        super(1, continuation);
        this.b = xmlPullParser;
        this.c = booleanRef;
        this.d = wl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        org.xmlpull.v1.XmlPullParser xmlPullParser = this.b;
        return new com.inmobi.media.Ol(this.d, continuation, this.c, xmlPullParser);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return ((com.inmobi.media.Ol) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4881a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String name = this.b.getName();
            if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.e)) {
                kotlin.jvm.internal.Ref.BooleanRef booleanRef = this.c;
                if (!booleanRef.element) {
                    booleanRef.element = true;
                    this.d.g(this.b);
                }
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.f)) {
                kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = this.c;
                if (!booleanRef2.element) {
                    booleanRef2.element = true;
                    com.inmobi.media.Wl wl = this.d;
                    org.xmlpull.v1.XmlPullParser xmlPullParser = this.b;
                    this.f4881a = 1;
                    if (com.inmobi.media.Wl.c(wl, xmlPullParser, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                com.inmobi.media.Wl wl2 = this.d;
                org.xmlpull.v1.XmlPullParser xmlPullParser2 = this.b;
                wl2.getClass();
                com.inmobi.media.Wl.w(xmlPullParser2);
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
