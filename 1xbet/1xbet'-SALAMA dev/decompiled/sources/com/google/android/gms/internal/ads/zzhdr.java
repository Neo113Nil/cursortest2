package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class zzhdr implements Iterator, Closeable, zzaqp {
    private static final zzaqo zza = new zzhdq("eof ");
    protected zzaql zzb;
    protected zzhds zzc;
    zzaqo zzd = null;
    long zze = 0;
    long zzf = 0;
    private final List zzg = new ArrayList();

    static {
        zzhdy.zzb(zzhdr.class);
    }

    public void close() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzaqo zzaqoVar = this.zzd;
        if (zzaqoVar == zza) {
            return false;
        }
        if (zzaqoVar != null) {
            return true;
        }
        try {
            this.zzd = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zzd = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i7 = 0; i7 < this.zzg.size(); i7++) {
            if (i7 > 0) {
                sb.append(";");
            }
            sb.append(((zzaqo) this.zzg.get(i7)).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzaqo next() {
        zzaqo zzaqoVarZzb;
        zzaqo zzaqoVar = this.zzd;
        if (zzaqoVar != null && zzaqoVar != zza) {
            this.zzd = null;
            return zzaqoVar;
        }
        zzhds zzhdsVar = this.zzc;
        if (zzhdsVar == null || this.zze >= this.zzf) {
            this.zzd = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzhdsVar) {
                this.zzc.zze(this.zze);
                zzaqoVarZzb = this.zzb.zzb(this.zzc, this);
                this.zze = this.zzc.zzb();
            }
            return zzaqoVarZzb;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public final List zzd() {
        return (this.zzc == null || this.zzd == zza) ? this.zzg : new zzhdx(this.zzg, this);
    }

    public final void zze(zzhds zzhdsVar, long j, zzaql zzaqlVar) {
        this.zzc = zzhdsVar;
        this.zze = zzhdsVar.zzb();
        zzhdsVar.zze(zzhdsVar.zzb() + j);
        this.zzf = zzhdsVar.zzb();
        this.zzb = zzaqlVar;
    }
}
