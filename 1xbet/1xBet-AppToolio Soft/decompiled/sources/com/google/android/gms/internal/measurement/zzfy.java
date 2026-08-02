package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzfy {
    private String value;
    private boolean zzamo;
    private final /* synthetic */ zzft zzamp;
    private final String zzamu;
    private final String zzny;

    public zzfy(zzft zzftVar, String str, String str2) {
        this.zzamp = zzftVar;
        Preconditions.checkNotEmpty(str);
        this.zzny = str;
        this.zzamu = null;
    }

    @WorkerThread
    public final void zzbv(String str) {
        SharedPreferences zzji;
        if (zzkd.zzs(str, this.value)) {
            return;
        }
        zzji = this.zzamp.zzji();
        SharedPreferences.Editor edit = zzji.edit();
        edit.putString(this.zzny, str);
        edit.apply();
        this.value = str;
    }

    @WorkerThread
    public final String zzjq() {
        SharedPreferences zzji;
        if (!this.zzamo) {
            this.zzamo = true;
            zzji = this.zzamp.zzji();
            this.value = zzji.getString(this.zzny, null);
        }
        return this.value;
    }
}
