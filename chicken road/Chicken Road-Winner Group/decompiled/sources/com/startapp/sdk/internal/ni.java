package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class ni implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent[] f4113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f4114b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4115c;

    public ni(Intent[] intentArr, Context context, String str) {
        this.f4113a = intentArr;
        this.f4114b = context;
        this.f4115c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4113a[0] = si.a(this.f4114b, this.f4115c);
        synchronized (this.f4113a) {
            this.f4113a.notifyAll();
        }
    }
}
