package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
class zzjr extends zzhi implements zzhk {
    protected final zzjt zzalo;

    zzjr(zzjt zzjtVar) {
        super(zzjtVar.zzlm());
        Preconditions.checkNotNull(zzjtVar);
        this.zzalo = zzjtVar;
    }

    public zzjz zzjf() {
        return this.zzalo.zzjf();
    }

    public zzed zzjg() {
        return this.zzalo.zzjg();
    }

    public zzek zzjh() {
        return this.zzalo.zzjh();
    }
}
