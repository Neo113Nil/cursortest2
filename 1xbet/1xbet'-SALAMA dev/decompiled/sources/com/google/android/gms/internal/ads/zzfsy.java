package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class zzfsy extends zzfsu implements Serializable {
    private final Pattern zza;

    public zzfsy(Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfsu
    public final zzfst zza(CharSequence charSequence) {
        return new zzfsx(this.zza.matcher(charSequence));
    }
}
