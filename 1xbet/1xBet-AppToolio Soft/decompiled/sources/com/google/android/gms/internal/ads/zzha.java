package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

@zzadh
/* loaded from: classes.dex */
public final class zzha {
    private final int zzaiz;
    private final zzgq zzajb;
    private String zzajj;
    private String zzajk;
    private final boolean zzajl = false;
    private final int zzajm;
    private final int zzajn;

    public zzha(int i, int i2, int i3) {
        this.zzaiz = i;
        if (i2 > 64 || i2 < 0) {
            this.zzajm = 64;
        } else {
            this.zzajm = i2;
        }
        if (i3 <= 0) {
            this.zzajn = 1;
        } else {
            this.zzajn = i3;
        }
        this.zzajb = new zzgz(this.zzajm);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0109 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zza(ArrayList<String> arrayList, ArrayList<zzgp> arrayList2) {
        String str;
        String[] zzb;
        boolean z;
        Collections.sort(arrayList2, new zzhb(this));
        HashSet hashSet = new HashSet();
        for (int i = 0; i < arrayList2.size(); i++) {
            String[] split = Normalizer.normalize(arrayList.get(arrayList2.get(i).zzhf()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            boolean z2 = true;
            if (split.length != 0) {
                for (String str2 : split) {
                    if (str2.indexOf("'") != -1) {
                        StringBuilder sb = new StringBuilder(str2);
                        int i2 = 1;
                        boolean z3 = false;
                        while (true) {
                            int i3 = i2 + 2;
                            if (i3 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i2) == '\'') {
                                if (sb.charAt(i2 - 1) != ' ') {
                                    int i4 = i2 + 1;
                                    if ((sb.charAt(i4) == 's' || sb.charAt(i4) == 'S') && (i3 == sb.length() || sb.charAt(i3) == ' ')) {
                                        sb.insert(i2, ' ');
                                        i2 = i3;
                                        z3 = true;
                                    }
                                }
                                sb.setCharAt(i2, ' ');
                                z3 = true;
                            }
                            i2++;
                        }
                        str = z3 ? sb.toString() : null;
                        if (str != null) {
                            this.zzajk = str;
                            zzb = zzgu.zzb(str, true);
                            if (zzb.length < this.zzajn) {
                                for (int i5 = 0; i5 < zzb.length; i5++) {
                                    String str3 = "";
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 >= this.zzajn) {
                                            z = true;
                                            break;
                                        }
                                        int i7 = i5 + i6;
                                        if (i7 >= zzb.length) {
                                            z = false;
                                            break;
                                        }
                                        if (i6 > 0) {
                                            str3 = String.valueOf(str3).concat(" ");
                                        }
                                        String valueOf = String.valueOf(str3);
                                        String valueOf2 = String.valueOf(zzb[i7]);
                                        str3 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                                        i6++;
                                    }
                                    if (!z) {
                                        break;
                                    }
                                    hashSet.add(str3);
                                    if (hashSet.size() >= this.zzaiz) {
                                        break;
                                    }
                                }
                                if (hashSet.size() >= this.zzaiz) {
                                    z2 = false;
                                    break;
                                }
                            }
                        }
                    }
                    str = str2;
                    zzb = zzgu.zzb(str, true);
                    if (zzb.length < this.zzajn) {
                    }
                }
            }
            if (!z2) {
                break;
            }
        }
        zzgt zzgtVar = new zzgt();
        this.zzajj = "";
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzgtVar.write(this.zzajb.zzx((String) it.next()));
            } catch (IOException e) {
                zzakb.zzb("Error while writing hash to byteStream", e);
            }
        }
        return zzgtVar.toString();
    }
}
