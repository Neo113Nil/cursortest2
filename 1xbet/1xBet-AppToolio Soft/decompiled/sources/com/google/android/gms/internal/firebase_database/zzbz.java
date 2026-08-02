package com.google.android.gms.internal.firebase_database;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.FirebaseDatabase;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class zzbz {
    protected FirebaseApp zzbd;
    private zzia zzco;
    protected boolean zzcp;
    private String zzcr;
    protected zzcg zzhf;
    protected zzbq zzhg;
    protected zzdt zzhh;
    protected String zzhi;
    private zzcj zzhl;
    protected zzib zzhj = zzib.INFO;
    protected long cacheSize = 10485760;
    private boolean zzgs = false;
    private boolean zzhk = false;

    private final zzcj zzbj() {
        if (this.zzhl == null) {
            zzbk();
        }
        return this.zzhl;
    }

    private final synchronized void zzbk() {
        this.zzhl = new zzq(this.zzbd);
    }

    private final ScheduledExecutorService zzs() {
        zzdt zzdtVar = this.zzhh;
        if (zzdtVar instanceof zzkh) {
            return ((zzkh) zzdtVar).zzs();
        }
        throw new RuntimeException("Custom run loops are not supported!");
    }

    final void stop() {
        this.zzhk = true;
        this.zzhf.shutdown();
        this.zzhh.shutdown();
    }

    public final zzaj zza(zzah zzahVar, zzak zzakVar) {
        return zzbj().zza(this, new zzaf(this.zzco, new zzca(this.zzhg), zzs(), this.zzcp, FirebaseDatabase.getSdkVersion(), this.zzcr, zzbj().zzi().getAbsolutePath()), zzahVar, zzakVar);
    }

    final synchronized void zzba() {
        if (!this.zzgs) {
            this.zzgs = true;
            if (this.zzco == null) {
                this.zzco = zzbj().zza(this, this.zzhj, null);
            }
            zzbj();
            if (this.zzcr == null) {
                this.zzcr = "Firebase/5/" + FirebaseDatabase.getSdkVersion() + "/" + zzbj().zzc(this);
            }
            if (this.zzhf == null) {
                this.zzhf = zzbj().zza(this);
            }
            if (this.zzhh == null) {
                this.zzhh = this.zzhl.zzb(this);
            }
            if (this.zzhi == null) {
                this.zzhi = "default";
            }
            if (this.zzhg == null) {
                this.zzhg = zzbj().zza(zzs());
            }
        }
    }

    public final void zzbl() {
        if (this.zzhk) {
            this.zzhf.restart();
            this.zzhh.restart();
            this.zzhk = false;
        }
    }

    protected final void zzbm() {
        if (this.zzgs) {
            throw new DatabaseException("Modifications to DatabaseConfig objects must occur before they are in use");
        }
    }

    public final zzib zzbn() {
        return this.zzhj;
    }

    public final long zzbo() {
        return this.cacheSize;
    }

    public final zzcg zzbp() {
        return this.zzhf;
    }

    public final String zzbq() {
        return this.zzhi;
    }

    public final zzhz zzp(String str) {
        return new zzhz(this.zzco, str);
    }

    final zzfv zzq(String str) {
        return this.zzcp ? this.zzhl.zza(this, str) : new zzfu();
    }

    public final boolean zzt() {
        return this.zzcp;
    }

    public final String zzv() {
        return this.zzcr;
    }
}
