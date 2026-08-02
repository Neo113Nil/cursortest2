package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzx {
    private final zzh zza;
    private final zzad zzb;
    private final int zzc;

    private zzx(zzad zzadVar) {
        this(zzadVar, false, zzl.zza, f.API_PRIORITY_OTHER);
    }

    public static zzx zza(char c3) {
        zzj zzjVar = new zzj(c3);
        zzy.zza(zzjVar);
        return new zzx(new zzaa(zzjVar));
    }

    private zzx(zzad zzadVar, boolean z4, zzh zzhVar, int i7) {
        this.zzb = zzadVar;
        this.zza = zzhVar;
        this.zzc = f.API_PRIORITY_OTHER;
    }

    public static zzx zza(String str) {
        zzn zza = zzt.zza(str);
        if (!zza.zza("").zzc()) {
            return new zzx(new zzac(zza));
        }
        throw new IllegalArgumentException(zzag.zza("The pattern may not match the empty string: %s", zza));
    }

    public final List<String> zza(CharSequence charSequence) {
        zzy.zza(charSequence);
        Iterator<String> zza = this.zzb.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (zza.hasNext()) {
            arrayList.add(zza.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
