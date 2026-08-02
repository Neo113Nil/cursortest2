package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzfv {
    private boolean value;
    private final boolean zzamn;
    private boolean zzamo;
    private final /* synthetic */ zzft zzamp;
    private final String zzny;

    public zzfv(zzft zzftVar, String str, boolean z) {
        this.zzamp = zzftVar;
        Preconditions.checkNotEmpty(str);
        this.zzny = str;
        this.zzamn = true;
    }

    @WorkerThread
    public final boolean get() {
        SharedPreferences zzji;
        if (!this.zzamo) {
            this.zzamo = true;
            zzji = this.zzamp.zzji();
            this.value = zzji.getBoolean(this.zzny, this.zzamn);
        }
        return this.value;
    }

    @WorkerThread
    public final void set(boolean z) {
        SharedPreferences zzji;
        zzji = this.zzamp.zzji();
        SharedPreferences.Editor edit = zzji.edit();
        edit.putBoolean(this.zzny, z);
        edit.apply();
        this.value = z;
    }
}
