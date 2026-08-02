package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzftw {
    private final zzftv zza;

    private zzftw(zzftv zzftvVar) {
        int i7 = zzfsr.zzb;
        this.zza = zzftvVar;
    }

    public static zzftw zza(int i7) {
        final int i8 = 4000;
        return new zzftw(new zzftv(i8) { // from class: com.google.android.gms.internal.ads.zzftn
            @Override // com.google.android.gms.internal.ads.zzftv
            public final Iterator zza(zzftw zzftwVar, CharSequence charSequence) {
                return new zzfts(zzftwVar, charSequence, 4000);
            }
        });
    }

    public static zzftw zzb(final zzfss zzfssVar) {
        return new zzftw(new zzftv() { // from class: com.google.android.gms.internal.ads.zzfto
            @Override // com.google.android.gms.internal.ads.zzftv
            public final Iterator zza(zzftw zzftwVar, CharSequence charSequence) {
                return new zzftq(zzftwVar, charSequence, zzfss.this);
            }
        });
    }

    public static zzftw zzc(Pattern pattern) {
        final zzfsy zzfsyVar = new zzfsy(pattern);
        zzfth.zzi(!((zzfsx) zzfsyVar.zza("")).zza.matches(), "The pattern may not match the empty string: %s", zzfsyVar);
        return new zzftw(new zzftv() { // from class: com.google.android.gms.internal.ads.zzftp
            @Override // com.google.android.gms.internal.ads.zzftv
            public final Iterator zza(zzftw zzftwVar, CharSequence charSequence) {
                return new zzftr(zzftwVar, charSequence, zzfsu.this.zza(charSequence));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator zzg(CharSequence charSequence) {
        return this.zza.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        charSequence.getClass();
        return new zzftt(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        charSequence.getClass();
        Iterator zzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzg.hasNext()) {
            arrayList.add((String) zzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
