package com.google.android.gms.internal.firebase_database;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzhc {
    private final zzhz zzbs;
    private final zzcg zzhf;

    public zzhc(zzbz zzbzVar) {
        this.zzhf = zzbzVar.zzbp();
        this.zzbs = zzbzVar.zzp("EventRaiser");
    }

    public final void zze(List<? extends zzgy> list) {
        if (this.zzbs.zzfa()) {
            zzhz zzhzVar = this.zzbs;
            int size = list.size();
            StringBuilder sb = new StringBuilder(28);
            sb.append("Raising ");
            sb.append(size);
            sb.append(" event(s)");
            zzhzVar.zza(sb.toString(), null, new Object[0]);
        }
        this.zzhf.zza(new zzhd(this, new ArrayList(list)));
    }
}
