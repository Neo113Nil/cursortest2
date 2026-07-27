package com.google.android.gms.internal.ads;

import com.ironsource.U3;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public class zzinh implements Iterator, Closeable, zzave {
    private static final zzavd zza = new zzing("eof ");
    protected zzava zzb;
    protected zzini zzc;
    zzavd zzd = null;
    long zze = 0;
    long zzf = 0;
    private final List zzg = new ArrayList();

    static {
        zzino.zzb(zzinh.class);
    }

    public void close() throws IOException {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzavd zzavdVar = this.zzd;
        if (zzavdVar == zza) {
            return false;
        }
        if (zzavdVar != null) {
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
        sb.append(U3.j.d);
        int i = 0;
        while (true) {
            List list = this.zzg;
            if (i >= list.size()) {
                sb.append(U3.j.e);
                return sb.toString();
            }
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((zzavd) list.get(i)).toString());
            i++;
        }
    }

    public final List zzc() {
        return (this.zzc == null || this.zzd == zza) ? this.zzg : new zzinn(this.zzg, this);
    }

    public final void zzd(zzini zziniVar, long j, zzava zzavaVar) throws IOException {
        this.zzc = zziniVar;
        this.zze = zziniVar.zzc();
        zziniVar.zzd(zziniVar.zzc() + j);
        this.zzf = zziniVar.zzc();
        this.zzb = zzavaVar;
    }

    @Override // java.util.Iterator
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzavd next() {
        zzavd zzb;
        zzavd zzavdVar = this.zzd;
        if (zzavdVar != null && zzavdVar != zza) {
            this.zzd = null;
            return zzavdVar;
        }
        zzini zziniVar = this.zzc;
        if (zziniVar == null || this.zze >= this.zzf) {
            this.zzd = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zziniVar) {
                this.zzc.zzd(this.zze);
                zzb = this.zzb.zzb(this.zzc, this);
                this.zze = this.zzc.zzc();
            }
            return zzb;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }
}
