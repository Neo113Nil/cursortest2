package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
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
            int iZzd = zzedVar.zzd();
            Charset charset = StandardCharsets.UTF_8;
            String strZzz = zzedVar.zzz(charset);
            if (strZzz == null || !strZzz.startsWith("WEBVTT")) {
                zzedVar.zzL(iZzd);
                throw zzaz.zza("Expected WEBVTT. Got ".concat(String.valueOf(zzedVar.zzz(charset))), null);
            }
            while (!TextUtils.isEmpty(this.zza.zzz(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                zzed zzedVar2 = this.zza;
                byte b7 = -1;
                int iZzd2 = 0;
                while (b7 == -1) {
                    iZzd2 = zzedVar2.zzd();
                    String strZzz2 = zzedVar2.zzz(StandardCharsets.UTF_8);
                    if (strZzz2 == null) {
                        b7 = 0;
                    } else if ("STYLE".equals(strZzz2)) {
                        b7 = 2;
                    } else {
                        b7 = strZzz2.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                    }
                }
                zzedVar2.zzL(iZzd2);
                if (b7 == 0) {
                    zzajm.zza(new zzalo(arrayList2), zzajrVar, zzddVar);
                    return;
                }
                if (b7 == 1) {
                    while (!TextUtils.isEmpty(this.zza.zzz(StandardCharsets.UTF_8))) {
                    }
                } else if (b7 != 2) {
                    zzald zzaldVarZzc = zzalk.zzc(this.zza, arrayList);
                    if (zzaldVarZzc != null) {
                        arrayList2.add(zzaldVarZzc);
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
