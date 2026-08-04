package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p090m3.f;

/* JADX INFO: loaded from: classes.dex */
public final class zzahq {
    private List<String> zza;

    public zzahq() {
        this(null);
    }

    public static zzahq zza() {
        return new zzahq(null);
    }

    public final List<String> zzb() {
        return this.zza;
    }

    private zzahq(List<String> list) {
        this.zza = new ArrayList();
    }

    public zzahq(int i7, List<String> list) {
        if (list != null && !list.isEmpty()) {
            for (int i8 = 0; i8 < list.size(); i8++) {
                list.set(i8, f.a(list.get(i8)));
            }
            this.zza = Collections.unmodifiableList(list);
            return;
        }
        this.zza = Collections.emptyList();
    }
}
