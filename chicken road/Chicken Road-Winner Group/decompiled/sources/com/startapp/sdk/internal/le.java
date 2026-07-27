package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class le implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4009a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oe f4010b;

    public le(oe oeVar, int i3) {
        this.f4010b = oeVar;
        this.f4009a = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xj xjVar = this.f4010b.f4164b;
        if (xjVar != null) {
            xjVar.a(this.f4009a);
        }
    }
}
