package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.ua, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4676ua {

    /* renamed from: a, reason: collision with root package name */
    private final C4577p0 f8701a;
    private String b;
    private boolean c;

    public AbstractC4676ua(C4577p0 adTools) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        this.f8701a = adTools;
        this.b = "";
    }

    public final C4577p0 a() {
        return this.f8701a;
    }

    public final String b() {
        return this.b;
    }

    protected final boolean c() {
        return this.c;
    }

    public abstract boolean d();

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.b = str;
    }

    public final void b(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f8701a.b(callback);
    }

    protected final void a(boolean z) {
        this.c = z;
    }

    public final void a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f8701a.a(runnable);
    }

    public final void a(C4434h0 adProperties) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.f8701a.f().a(new C0(this.f8701a, adProperties, null, 4, null));
    }
}
