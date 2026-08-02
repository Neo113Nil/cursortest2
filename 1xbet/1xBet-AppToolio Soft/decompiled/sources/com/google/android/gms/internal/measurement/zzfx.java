package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import android.support.annotation.WorkerThread;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes.dex */
public final class zzfx {
    private final long zzabi;
    private final /* synthetic */ zzft zzamp;

    @VisibleForTesting
    private final String zzamr;
    private final String zzams;
    private final String zzamt;

    private zzfx(zzft zzftVar, String str, long j) {
        this.zzamp = zzftVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(j > 0);
        this.zzamr = String.valueOf(str).concat(":start");
        this.zzams = String.valueOf(str).concat(":count");
        this.zzamt = String.valueOf(str).concat(":value");
        this.zzabi = j;
    }

    @WorkerThread
    private final void zzfh() {
        SharedPreferences zzji;
        this.zzamp.zzab();
        long currentTimeMillis = this.zzamp.zzbt().currentTimeMillis();
        zzji = this.zzamp.zzji();
        SharedPreferences.Editor edit = zzji.edit();
        edit.remove(this.zzams);
        edit.remove(this.zzamt);
        edit.putLong(this.zzamr, currentTimeMillis);
        edit.apply();
    }

    @WorkerThread
    private final long zzfj() {
        SharedPreferences zzji;
        zzji = this.zzamp.zzji();
        return zzji.getLong(this.zzamr, 0L);
    }

    @WorkerThread
    public final void zzc(String str, long j) {
        SharedPreferences zzji;
        SharedPreferences zzji2;
        SharedPreferences zzji3;
        this.zzamp.zzab();
        if (zzfj() == 0) {
            zzfh();
        }
        if (str == null) {
            str = "";
        }
        zzji = this.zzamp.zzji();
        long j2 = zzji.getLong(this.zzams, 0L);
        if (j2 <= 0) {
            zzji3 = this.zzamp.zzji();
            SharedPreferences.Editor edit = zzji3.edit();
            edit.putString(this.zzamt, str);
            edit.putLong(this.zzams, 1L);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.zzamp.zzgg().zzlo().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        zzji2 = this.zzamp.zzji();
        SharedPreferences.Editor edit2 = zzji2.edit();
        if (z) {
            edit2.putString(this.zzamt, str);
        }
        edit2.putLong(this.zzams, j3);
        edit2.apply();
    }

    @WorkerThread
    public final Pair<String, Long> zzfi() {
        long abs;
        SharedPreferences zzji;
        SharedPreferences zzji2;
        this.zzamp.zzab();
        this.zzamp.zzab();
        long zzfj = zzfj();
        if (zzfj == 0) {
            zzfh();
            abs = 0;
        } else {
            abs = Math.abs(zzfj - this.zzamp.zzbt().currentTimeMillis());
        }
        long j = this.zzabi;
        if (abs < j) {
            return null;
        }
        if (abs > (j << 1)) {
            zzfh();
            return null;
        }
        zzji = this.zzamp.zzji();
        String string = zzji.getString(this.zzamt, null);
        zzji2 = this.zzamp.zzji();
        long j2 = zzji2.getLong(this.zzams, 0L);
        zzfh();
        return (string == null || j2 <= 0) ? zzft.zzalr : new Pair<>(string, Long.valueOf(j2));
    }
}
