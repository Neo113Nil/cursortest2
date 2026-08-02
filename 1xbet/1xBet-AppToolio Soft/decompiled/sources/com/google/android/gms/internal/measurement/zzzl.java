package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzzl extends zzzj {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzbto;
    private int zzbtp;
    private int zzbtq;
    private int zzbtr;

    private zzzl(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzbtr = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzbtq = this.pos;
        this.zzbto = z;
    }

    private final void zztp() {
        this.limit += this.zzbtp;
        int i = this.limit;
        int i2 = i - this.zzbtq;
        int i3 = this.zzbtr;
        if (i2 <= i3) {
            this.zzbtp = 0;
        } else {
            this.zzbtp = i2 - i3;
            this.limit = i - this.zzbtp;
        }
    }

    public final int zzaf(int i) throws zzzy {
        if (i < 0) {
            throw zzzy.zzuc();
        }
        int zzto = i + zzto();
        int i2 = this.zzbtr;
        if (zzto > i2) {
            throw zzzy.zzub();
        }
        this.zzbtr = zzto;
        zztp();
        return i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzzj
    public final int zzto() {
        return this.pos - this.zzbtq;
    }
}
