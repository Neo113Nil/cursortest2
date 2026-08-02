package com.google.android.gms.internal.measurement;

import android.content.ComponentName;

/* loaded from: classes.dex */
final class zzja implements Runnable {
    private final /* synthetic */ ComponentName val$name;
    private final /* synthetic */ zziy zzare;

    zzja(zziy zziyVar, ComponentName componentName) {
        this.zzare = zziyVar;
        this.val$name = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzare.zzaqv.onServiceDisconnected(this.val$name);
    }
}
