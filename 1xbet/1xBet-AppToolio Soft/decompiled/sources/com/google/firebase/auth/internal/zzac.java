package com.google.firebase.auth.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;

/* loaded from: classes.dex */
final class zzac implements BackgroundDetector.BackgroundStateChangeListener {
    private final /* synthetic */ zzab zzlx;

    zzac(zzab zzabVar) {
        this.zzlx = zzabVar;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        boolean zzbm;
        zzs zzsVar;
        if (z) {
            this.zzlx.zzlw = true;
            this.zzlx.cancel();
            return;
        }
        this.zzlx.zzlw = false;
        zzbm = this.zzlx.zzbm();
        if (zzbm) {
            zzsVar = this.zzlx.zzlv;
            zzsVar.zzbi();
        }
    }
}
