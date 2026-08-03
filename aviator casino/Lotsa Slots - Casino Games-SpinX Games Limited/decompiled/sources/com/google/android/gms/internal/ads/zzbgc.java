package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbgc {
    private final com.google.android.gms.internal.ads.zzbfs zza;
    private final int zzb;
    private final int zzc;

    public zzbgc(int i, int i2, int i3) {
        this.zzb = i;
        i2 = (i2 > 64 || i2 < 0) ? 64 : i2;
        if (i3 <= 0) {
            this.zzc = 1;
        } else {
            this.zzc = i3;
        }
        this.zza = new com.google.android.gms.internal.ads.zzbga(i2);
    }

    public final java.lang.String zza(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        java.util.Collections.sort(arrayList2, new com.google.android.gms.internal.ads.zzbgb(this));
        java.util.HashSet hashSet = new java.util.HashSet();
        loop0: for (int i = 0; i < arrayList2.size(); i++) {
            java.lang.String[] split = java.text.Normalizer.normalize((java.lang.CharSequence) arrayList.get(((com.google.android.gms.internal.ads.zzbfr) arrayList2.get(i)).zze()), java.text.Normalizer.Form.NFKC).toLowerCase(java.util.Locale.US).split("\n");
            if (split.length != 0) {
                for (java.lang.String str : split) {
                    if (str.contains("'")) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
                        int i2 = 1;
                        boolean z = false;
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
                                        z = true;
                                    }
                                }
                                sb.setCharAt(i2, ' ');
                                z = true;
                            }
                            i2++;
                        }
                        java.lang.String sb2 = z ? sb.toString() : null;
                        if (sb2 != null) {
                            str = sb2;
                        }
                    }
                    java.lang.String[] zzb = com.google.android.gms.internal.ads.zzbfw.zzb(str, true);
                    int length = zzb.length;
                    int i5 = this.zzc;
                    if (length >= i5) {
                        for (int i6 = 0; i6 < zzb.length; i6++) {
                            java.lang.String str2 = "";
                            for (int i7 = 0; i7 < i5; i7++) {
                                int i8 = i6 + i7;
                                if (i8 >= zzb.length) {
                                    break;
                                }
                                if (i7 > 0) {
                                    str2 = str2.concat(io.ktor.sse.ServerSentEventKt.SPACE);
                                }
                                java.lang.String str3 = zzb[i8];
                                java.lang.String.valueOf(str3);
                                str2 = str2.concat(java.lang.String.valueOf(str3));
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
        com.google.android.gms.internal.ads.zzbfu zzbfuVar = new com.google.android.gms.internal.ads.zzbfu();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzbfuVar.zzb.write(this.zza.zza((java.lang.String) it.next()));
            } catch (java.io.IOException e) {
                int i9 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error while writing hash to byteStream", e);
            }
        }
        return zzbfuVar.toString();
    }
}
