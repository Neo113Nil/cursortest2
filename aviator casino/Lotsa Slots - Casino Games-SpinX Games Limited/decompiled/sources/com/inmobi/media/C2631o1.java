package com.inmobi.media;

/* renamed from: com.inmobi.media.o1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2631o1 implements com.inmobi.media.A8 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2657p1 f5364a;
    public final android.content.Context b;
    public final com.inmobi.media.C2799u9 c;
    public final com.inmobi.media.C2313c0 d;
    public final kotlinx.coroutines.CoroutineScope e;
    public final com.inmobi.media.C2576m0 f;

    public C2631o1(android.content.Context context, com.inmobi.media.Oc oc, com.inmobi.media.C2657p1 adManagerContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adManagerContext, "adManagerContext");
        this.f5364a = adManagerContext;
        com.inmobi.media.C2603n1 c2603n1 = new com.inmobi.media.C2603n1(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE, this);
        this.b = context;
        this.c = oc.f4875a;
        com.inmobi.media.C2313c0 c2313c0 = new com.inmobi.media.C2313c0();
        this.d = c2313c0;
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getIO().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)).plus(c2603n1));
        this.e = CoroutineScope;
        this.f = new com.inmobi.media.C2576m0(CoroutineScope, adManagerContext, c2313c0);
    }

    @Override // com.inmobi.media.A8
    public final kotlinx.coroutines.CoroutineScope a() {
        return this.e;
    }

    @Override // com.inmobi.media.A8
    public final com.inmobi.media.C2576m0 b() {
        return this.f;
    }

    @Override // com.inmobi.media.A8
    public final com.inmobi.media.InterfaceC2772t9 c() {
        return this.c;
    }
}
