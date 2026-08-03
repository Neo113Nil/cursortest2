package com.ironsource;

/* renamed from: com.ironsource.ua, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3311ua {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3212p0 f6762a;
    private java.lang.String b;
    private boolean c;

    public AbstractC3311ua(com.ironsource.C3212p0 adTools) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        this.f6762a = adTools;
        this.b = "";
    }

    public final com.ironsource.C3212p0 a() {
        return this.f6762a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    protected final boolean c() {
        return this.c;
    }

    public abstract boolean d();

    public final void a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.b = str;
    }

    public final void b(java.lang.Runnable callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        this.f6762a.e(callback);
    }

    protected final void a(boolean z) {
        this.c = z;
    }

    public final void a(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f6762a.d(runnable);
    }

    public final void a(com.ironsource.C3069h0 adProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.f6762a.e().a(new com.ironsource.D0(this.f6762a, adProperties, null, 4, null));
    }
}
