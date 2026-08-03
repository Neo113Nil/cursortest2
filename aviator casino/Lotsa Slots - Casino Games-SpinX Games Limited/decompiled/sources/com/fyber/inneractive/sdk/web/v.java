package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4360a;

    public v(java.lang.String str) {
        this.f4360a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.Toast.makeText(com.fyber.inneractive.sdk.util.o.f4302a, this.f4360a, 0).show();
    }
}
