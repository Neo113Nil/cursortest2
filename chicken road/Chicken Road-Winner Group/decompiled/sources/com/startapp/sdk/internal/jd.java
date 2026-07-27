package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class jd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3923a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3924b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3925c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ld f3926d;

    public jd(ld ldVar, String str, boolean z3, String str2) {
        this.f3926d = ldVar;
        this.f3923a = str;
        this.f3924b = z3;
        this.f3925c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3926d.a(this.f3923a, this.f3925c, this.f3924b);
    }
}
