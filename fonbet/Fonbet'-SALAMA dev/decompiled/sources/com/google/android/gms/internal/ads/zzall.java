package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzall implements zzajs {
    private final zzed zza = new zzed();
    private final zzalb zzb = new zzalb();

    @Override // com.google.android.gms.internal.ads.zzajs
    public final void zza(byte[] bArr, int i7, int i8, zzajr zzajrVar, zzdd zzddVar) {
        this.zza.zzJ(bArr, i8 + i7);
        this.zza.zzL(i7);
        ArrayList arrayList = new ArrayList();
        try {
            zzed zzedVar = this.zza;
            int zzd = zzedVar.zzd();
            Charset charset = StandardCharsets.UTF_8;
            String zzz = zzedVar.zzz(charset);
            if (zzz == null || !zzz.startsWith("WEBVTT")) {
                zzedVar.zzL(zzd);
                throw zzaz.zza("Expected WEBVTT. Got ".concat(String.valueOf(zzedVar.zzz(charset))), null);
            }
            while (!TextUtils.isEmpty(this.zza.zzz(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                zzed zzedVar2 = this.zza;
                char c3 = 65535;
                int i9 = 0;
                while (c3 == 65535) {
                    i9 = zzedVar2.zzd();
                    String zzz2 = zzedVar2.zzz(StandardCharsets.UTF_8);
                    c3 = zzz2 == null ? (char) 0 : "STYLE".equals(zzz2) ? (char) 2 : zzz2.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                zzedVar2.zzL(i9);
                if (c3 == 0) {
                    zzajm.zza(new zzalo(arrayList2), zzajrVar, zzddVar);
                    return;
                }
                if (c3 == 1) {
                    while (!TextUtils.isEmpty(this.zza.zzz(StandardCharsets.UTF_8))) {
                    }
                } else if (c3 != 2) {
                    zzald zzc = zzalk.zzc(this.zza, arrayList);
                    if (zzc != null) {
                        arrayList2.add(zzc);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.zza.zzz(StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zzb(this.zza));
                }
            }
        } catch (zzaz e7) {
            throw new IllegalArgumentException(e7);
        }
    }
}
