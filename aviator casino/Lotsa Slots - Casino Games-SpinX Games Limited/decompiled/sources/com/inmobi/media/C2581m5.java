package com.inmobi.media;

/* renamed from: com.inmobi.media.m5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2581m5 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5328a;
    public final /* synthetic */ com.inmobi.media.C2607n5 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2581m5(com.inmobi.media.C2607n5 c2607n5, int i, int i2, int i3, int i4, int i5, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = c2607n5;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2581m5 c2581m5 = new com.inmobi.media.C2581m5(this.b, this.c, this.d, this.e, this.f, this.g, continuation);
        c2581m5.f5328a = obj;
        return c2581m5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2581m5) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable(this.b.getContext(), this.c);
        if (drawable != null) {
            this.b.a(drawable, this.d, this.e, this.f, this.g);
            return kotlin.Unit.INSTANCE;
        }
        com.inmobi.media.C2607n5 c2607n5 = this.b;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = c2607n5.b;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("CustomView", "CustomView drawable for " + ((int) c2607n5.f5350a) + " cannot be created");
        }
        return kotlin.Unit.INSTANCE;
    }
}
