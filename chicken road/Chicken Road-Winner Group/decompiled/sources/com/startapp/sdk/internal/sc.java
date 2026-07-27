package com.startapp.sdk.internal;

import android.os.SystemClock;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class sc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uc f4331a;

    public sc(uc ucVar) {
        this.f4331a = ucVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long uptimeMillis = (this.f4331a.f4463a.f4438q * 1000) - SystemClock.uptimeMillis();
        uc ucVar = this.f4331a;
        long j3 = uptimeMillis + ucVar.f4463a.f4598w;
        TextView textView = ucVar.f4468g;
        if (textView != null) {
            long j4 = j3 / 1000;
            if (j4 > 0 && j3 % 1000 < 100) {
                j4--;
            }
            textView.setText(String.valueOf(j4));
        }
        if (j3 >= 1000) {
            long j5 = j3 % 1000;
            this.f4331a.f4472k.postDelayed(this, j5 != 0 ? j5 : 1000L);
            return;
        }
        uc ucVar2 = this.f4331a;
        if (ucVar2.f4468g != null) {
            ucVar2.f4469h.setVisibility(8);
            this.f4331a.f4468g.setVisibility(8);
        }
        this.f4331a.f4463a.s();
    }
}
