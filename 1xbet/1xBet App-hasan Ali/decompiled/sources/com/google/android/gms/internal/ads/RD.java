package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class RD {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1805xu f11342a;

    /* renamed from: b, reason: collision with root package name */
    public final QD f11343b;

    /* renamed from: c, reason: collision with root package name */
    public SurfaceHolderCallbackC0974fE f11344c;

    /* renamed from: e, reason: collision with root package name */
    public float f11346e = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public int f11345d = 0;

    public RD(Context context, Handler handler, SurfaceHolderCallbackC0974fE surfaceHolderCallbackC0974fE) {
        this.f11342a = AbstractC1400ot.e(new C1685v8(context, 1));
        this.f11344c = surfaceHolderCallbackC0974fE;
        this.f11343b = new QD(this, handler);
    }

    public final void a() {
        int i = this.f11345d;
        if (i == 1 || i == 0 || AbstractC1260lo.f14419a >= 26) {
            return;
        }
        ((AudioManager) this.f11342a.mo12a()).abandonAudioFocus(this.f11343b);
    }

    public final void b(int i) {
        if (this.f11345d == i) {
            return;
        }
        this.f11345d = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.f11346e != f) {
            this.f11346e = f;
            SurfaceHolderCallbackC0974fE surfaceHolderCallbackC0974fE = this.f11344c;
            if (surfaceHolderCallbackC0974fE != null) {
                C1109iE c1109iE = surfaceHolderCallbackC0974fE.f13463k;
                c1109iE.y1(1, 2, Float.valueOf(c1109iE.f13901U * c1109iE.f13889G.f11346e));
            }
        }
    }
}
