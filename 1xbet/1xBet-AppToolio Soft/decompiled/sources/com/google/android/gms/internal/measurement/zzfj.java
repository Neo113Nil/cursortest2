package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzfj implements Runnable {
    private final /* synthetic */ int zzakw;
    private final /* synthetic */ String zzakx;
    private final /* synthetic */ Object zzaky;
    private final /* synthetic */ Object zzakz;
    private final /* synthetic */ Object zzala;
    private final /* synthetic */ zzfi zzalb;

    zzfj(zzfi zzfiVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.zzalb = zzfiVar;
        this.zzakw = i;
        this.zzakx = str;
        this.zzaky = obj;
        this.zzakz = obj2;
        this.zzala = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        long j;
        char c2;
        long j2;
        zzfi zzfiVar;
        char c3;
        zzft zzgj = this.zzalb.zzacv.zzgj();
        if (!zzgj.isInitialized()) {
            this.zzalb.zza(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        c = this.zzalb.zzakl;
        if (c == 0) {
            if (this.zzalb.zzgk().zzds()) {
                zzfiVar = this.zzalb;
                zzfiVar.zzgl();
                c3 = 'C';
            } else {
                zzfiVar = this.zzalb;
                zzfiVar.zzgl();
                c3 = 'c';
            }
            zzfiVar.zzakl = c3;
        }
        j = this.zzalb.zzafi;
        if (j < 0) {
            zzfi zzfiVar2 = this.zzalb;
            zzfiVar2.zzafi = zzfiVar2.zzgk().zzgw();
        }
        char charAt = "01VDIWEA?".charAt(this.zzakw);
        c2 = this.zzalb.zzakl;
        j2 = this.zzalb.zzafi;
        String zza = zzfi.zza(true, this.zzakx, this.zzaky, this.zzakz, this.zzala);
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 24);
        sb.append("2");
        sb.append(charAt);
        sb.append(c2);
        sb.append(j2);
        sb.append(":");
        sb.append(zza);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = this.zzakx.substring(0, 1024);
        }
        zzgj.zzals.zzc(sb2, 1L);
    }
}
