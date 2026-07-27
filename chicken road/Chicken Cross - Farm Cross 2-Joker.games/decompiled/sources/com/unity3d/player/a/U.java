package com.unity3d.player.a;

import android.widget.FrameLayout;
import com.unity3d.player.S0;

/* loaded from: classes7.dex */
public final class U implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11756a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ Y h;

    public U(Y y, String str, int i, int i2, int i3, boolean z, long j, long j2) {
        this.h = y;
        this.f11756a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = j;
        this.g = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y y = this.h;
        if (y.f != null) {
            AbstractC4890t.Log(5, "Video already playing");
            Y y2 = this.h;
            y2.g = 2;
            y2.d.release();
            return;
        }
        Y y3 = this.h;
        y.f = new S0(y3.b, y3.f11760a, this.f11756a, this.b, this.c, this.d, this.e, this.f, this.g, new T(this));
        Y y4 = this.h;
        if (y4.f != null) {
            FrameLayout frameLayout = y4.f11760a.getFrameLayout();
            frameLayout.bringToFront();
            frameLayout.addView(this.h.f);
        }
    }
}
