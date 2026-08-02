package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzfw {
    private long value;
    private boolean zzamo;
    private final /* synthetic */ zzft zzamp;
    private final long zzamq;
    private final String zzny;

    public zzfw(zzft zzftVar, String str, long j) {
        this.zzamp = zzftVar;
        Preconditions.checkNotEmpty(str);
        this.zzny = str;
        this.zzamq = j;
    }

    @WorkerThread
    public final long get() {
        SharedPreferences zzji;
        if (!this.zzamo) {
            this.zzamo = true;
            zzji = this.zzamp.zzji();
            this.value = zzji.getLong(this.zzny, this.zzamq);
        }
        return this.value;
    }

    @WorkerThread
    public final void set(long j) {
        SharedPreferences zzji;
        zzji = this.zzamp.zzji();
        SharedPreferences.Editor edit = zzji.edit();
        edit.putLong(this.zzny, j);
        edit.apply();
        this.value = j;
    }
}
