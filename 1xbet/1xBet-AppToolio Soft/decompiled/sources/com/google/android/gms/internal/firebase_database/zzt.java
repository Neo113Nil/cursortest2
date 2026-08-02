package com.google.android.gms.internal.firebase_database;

import com.google.firebase.FirebaseApp;

/* loaded from: classes.dex */
final class zzt implements FirebaseApp.BackgroundStateChangeListener {
    private final /* synthetic */ zzaj zzbp;

    zzt(zzq zzqVar, zzaj zzajVar) {
        this.zzbp = zzajVar;
    }

    @Override // com.google.firebase.FirebaseApp.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        if (z) {
            this.zzbp.interrupt("app_in_background");
        } else {
            this.zzbp.resume("app_in_background");
        }
    }
}
