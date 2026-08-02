package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzazj {
    private final zzayy zza;
    private final int zzb;
    private final int zzc;

    public zzazj(int i7, int i8, int i9) {
        this.zzb = i7;
        i8 = (i8 > 64 || i8 < 0) ? 64 : i8;
        if (i9 <= 0) {
            this.zzc = 1;
        } else {
            this.zzc = i9;
        }
        this.zza = new zzazh(i8);
    }

    public final String zza(ArrayList arrayList, ArrayList arrayList2) {
        Collections.sort(arrayList2, new zzazi(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            String[] split = Normalizer.normalize((CharSequence) arrayList.get(((zzayx) arrayList2.get(i7)).zze()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                for (String str : split) {
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        int i8 = 1;
                        boolean z4 = false;
                        while (true) {
                            int i9 = i8 + 2;
                            if (i9 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i8) == '\'') {
                                if (sb.charAt(i8 - 1) != ' ') {
                                    int i10 = i8 + 1;
                                    if ((sb.charAt(i10) == 's' || sb.charAt(i10) == 'S') && (i9 == sb.length() || sb.charAt(i9) == ' ')) {
                                        sb.insert(i8, ' ');
                                        i8 = i9;
                                        z4 = true;
                                    }
                                }
                                sb.setCharAt(i8, ' ');
                                z4 = true;
                            }
                            i8++;
                        }
                        String sb2 = z4 ? sb.toString() : null;
                        if (sb2 != null) {
                            str = sb2;
                        }
                    }
                    String[] zzb = zzazc.zzb(str, true);
                    if (zzb.length >= this.zzc) {
                        for (int i11 = 0; i11 < zzb.length; i11++) {
                            String str2 = "";
                            for (int i12 = 0; i12 < this.zzc; i12++) {
                                int i13 = i11 + i12;
                                if (i13 >= zzb.length) {
                                    break;
                                }
                                if (i12 > 0) {
                                    str2 = str2.concat(" ");
                                }
                                str2 = str2.concat(String.valueOf(zzb[i13]));
                            }
                            hashSet.add(str2);
                            if (hashSet.size() >= this.zzb) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.zzb) {
                            break loop0;
                        }
                    }
                }
            }
        }
        zzaza zzazaVar = new zzaza();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzazaVar.zzb.write(this.zza.zzb((String) it.next()));
            } catch (IOException e7) {
                int i14 = J.f3546b;
                j.e("Error while writing hash to byteStream", e7);
            }
        }
        return zzazaVar.toString();
    }
}
