package com.inmobi.media;

/* renamed from: com.inmobi.media.v5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2821v5 implements com.inmobi.media.InterfaceC2782tj {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.Nc f5502a;
    public com.inmobi.media.AbstractC2735s1 b;
    public com.inmobi.media.A8 c;

    public C2821v5(com.inmobi.media.A8 a8) {
        this.f5502a = null;
        this.b = null;
        this.c = a8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r1, null, null, new com.inmobi.media.C2795u5(r7, null), 3, null);
     */
    @Override // com.inmobi.media.InterfaceC2782tj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        kotlinx.coroutines.Job launch$default;
        com.inmobi.media.InterfaceC2772t9 c;
        com.inmobi.media.A8 a8 = this.c;
        if (a8 != null && (c = a8.c()) != null) {
            ((com.inmobi.media.C2799u9) c).a("AUM-DestroyedState", "Initialize Called");
        }
        com.inmobi.media.A8 a82 = this.c;
        if (a82 == null || (r1 = a82.a()) == null || launch$default == null) {
            return;
        }
        launch$default.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.v5$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.C2821v5.a(com.inmobi.media.C2821v5.this, (java.lang.Throwable) obj);
            }
        });
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void c() {
    }

    public C2821v5(com.inmobi.media.Nc nc, com.inmobi.media.AbstractC2735s1 abstractC2735s1, com.inmobi.media.A8 a8) {
        this.f5502a = nc;
        this.b = abstractC2735s1;
        this.c = a8;
    }

    public static final kotlin.Unit a(com.inmobi.media.C2821v5 c2821v5, java.lang.Throwable th) {
        com.inmobi.media.InterfaceC2772t9 c;
        com.inmobi.media.A8 a8 = c2821v5.c;
        if (a8 != null && (c = a8.c()) != null) {
            ((com.inmobi.media.C2799u9) c).a();
        }
        com.inmobi.media.A8 a82 = c2821v5.c;
        com.inmobi.media.J3.a(a82 != null ? a82.a() : null);
        c2821v5.b = null;
        c2821v5.c = null;
        c2821v5.f5502a = null;
        return kotlin.Unit.INSTANCE;
    }
}
