package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class ke implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gj f3958a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3959b;

    public ke(gj gjVar, String str) {
        this.f3958a = gjVar;
        this.f3959b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gj gjVar = this.f3958a;
        String str = this.f3959b;
        me meVar = gjVar.f3800a;
        if (meVar != null) {
            meVar.a(str);
        }
    }
}
