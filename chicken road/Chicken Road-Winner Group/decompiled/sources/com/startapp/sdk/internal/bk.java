package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class bk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dk f3513b;

    public bk(dk dkVar, String str) {
        this.f3513b = dkVar;
        this.f3512a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3513b.f3606d.a(this.f3512a);
    }
}
