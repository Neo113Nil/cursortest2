package com.fyber.inneractive.sdk.web;

import android.widget.Toast;

/* loaded from: classes4.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6018a;

    public v(String str) {
        this.f6018a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(com.fyber.inneractive.sdk.util.o.f5960a, this.f6018a, 0).show();
    }
}
