package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* loaded from: classes.dex */
public abstract class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final w2 f4199a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f4200b = null;

    /* renamed from: c, reason: collision with root package name */
    public Long f4201c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4202d = false;

    public p2(w2 w2Var) {
        this.f4199a = w2Var;
    }

    public abstract boolean a();

    public abstract long b();

    public void c() {
        this.f4201c = null;
        this.f4202d = false;
        w2 w2Var = this.f4199a;
        w2Var.getClass();
        MetaData E3 = MetaData.E();
        if (E3.f0() && w2Var.f4575w < E3.Y()) {
            w2Var.f4575w++;
            w2Var.a(null, null, true, false, null);
        } else {
            C0259m c0259m = w2Var.f4577z;
            if (c0259m != null) {
                c0259m.a(w2Var);
            }
        }
    }

    public final void d() {
        if (this.f4202d) {
            return;
        }
        if (this.f4201c == null) {
            this.f4201c = Long.valueOf(System.currentTimeMillis());
        }
        if (a()) {
            if (this.f4200b == null) {
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    myLooper = Looper.getMainLooper();
                }
                this.f4200b = new Handler(myLooper);
            }
            long b3 = b();
            if (b3 >= 0) {
                this.f4202d = true;
                this.f4200b.postDelayed(new o2(this), b3);
            }
        }
    }

    public final void e() {
        Handler handler = this.f4200b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f4201c = null;
        this.f4202d = false;
    }
}
