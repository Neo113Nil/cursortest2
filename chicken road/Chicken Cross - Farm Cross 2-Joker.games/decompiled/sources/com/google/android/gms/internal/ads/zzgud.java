package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgud extends zzgua implements Serializable {
    private final Pattern zza;

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgua
    public final zzgtz zza(CharSequence charSequence) {
        return new zzguc(this.zza.matcher(charSequence));
    }

    zzgud(Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }
}
