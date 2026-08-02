package com.google.android.gms.internal.firebase_database;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.firebase.database.DatabaseError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class zzev implements zzai, zzet {
    private final /* synthetic */ zzee zzlb;
    private final zzhi zzlo;
    private final zzex zzlp;

    public zzev(zzee zzeeVar, zzhi zzhiVar) {
        zzex zze;
        this.zzlb = zzeeVar;
        this.zzlo = zzhiVar;
        zze = zzeeVar.zze(zzhiVar.zzeo());
        this.zzlp = zze;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzet
    public final List<? extends zzgy> zzb(DatabaseError databaseError) {
        zzhz zzhzVar;
        if (databaseError == null) {
            zzhh zzeo = this.zzlo.zzeo();
            zzex zzexVar = this.zzlp;
            return zzexVar != null ? this.zzlb.zza(zzexVar) : this.zzlb.zzs(zzeo.zzg());
        }
        zzhzVar = this.zzlb.zzbs;
        String valueOf = String.valueOf(this.zzlo.zzeo().zzg());
        String databaseError2 = databaseError.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19 + String.valueOf(databaseError2).length());
        sb.append("Listen at ");
        sb.append(valueOf);
        sb.append(" failed: ");
        sb.append(databaseError2);
        zzhzVar.zzb(sb.toString(), null);
        return this.zzlb.zza(this.zzlo.zzeo(), databaseError);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzai
    public final String zzx() {
        return this.zzlo.zzep().zzfj();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzai
    public final boolean zzy() {
        return zzkl.zzn(this.zzlo.zzep()) > PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzai
    public final zzy zzz() {
        zzik zzh = zzik.zzh(this.zzlo.zzep());
        List<zzch> zzo = zzh.zzo();
        ArrayList arrayList = new ArrayList(zzo.size());
        Iterator<zzch> it = zzo.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().zzbv());
        }
        return new zzy(arrayList, zzh.zzp());
    }
}
