package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzamg {
    private static final com.google.android.gms.internal.ads.zzgty zza = com.google.android.gms.internal.ads.zzgty.zza(com.google.android.gms.internal.ads.zzgsx.zzc(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON));
    private static final com.google.android.gms.internal.ads.zzgty zzb = com.google.android.gms.internal.ads.zzgty.zza(com.google.android.gms.internal.ads.zzgsx.zzc(io.ktor.util.date.GMTDateParser.ANY));
    private final java.util.List zzc = new java.util.ArrayList();
    private int zzd = 0;
    private int zze;

    public final void zza() {
        this.zzc.clear();
        this.zzd = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int zzb(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagy zzagyVar, java.util.List list) throws java.io.IOException {
        int i;
        char c;
        char c2;
        int i2 = this.zzd;
        if (i2 == 0) {
            long zzo = zzafzVar.zzo();
            zzagyVar.zza = (zzo == -1 || zzo < 8) ? 0L : zzo - 8;
            this.zzd = 1;
            return 1;
        }
        int i3 = 2;
        if (i2 != 1) {
            char c3 = 2819;
            short s = 2817;
            short s2 = 2816;
            short s3 = 2192;
            if (i2 != 2) {
                long zzn = zzafzVar.zzn();
                int zzo2 = (int) ((zzafzVar.zzo() - zzafzVar.zzn()) - this.zze);
                com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet(zzo2);
                zzafzVar.zzc(zzetVar.zzi(), 0, zzo2);
                int i4 = 0;
                while (true) {
                    java.util.List list2 = this.zzc;
                    if (i4 < list2.size()) {
                        com.google.android.gms.internal.ads.zzamf zzamfVar = (com.google.android.gms.internal.ads.zzamf) list2.get(i4);
                        zzetVar.zzh((int) (zzamfVar.zza - zzn));
                        zzetVar.zzk(4);
                        int zzC = zzetVar.zzC();
                        java.lang.String zzK = zzetVar.zzK(zzC, java.nio.charset.StandardCharsets.UTF_8);
                        switch (zzK.hashCode()) {
                            case -1711564334:
                                if (zzK.equals("SlowMotion_Data")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1332107749:
                                if (zzK.equals("Super_SlowMotion_Edit_Data")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1251387154:
                                if (zzK.equals("Super_SlowMotion_Data")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -830665521:
                                if (zzK.equals("Super_SlowMotion_Deflickering_On")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1760745220:
                                if (zzK.equals("Super_SlowMotion_BGM")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c == 0) {
                            c2 = 2192;
                        } else if (c == 1) {
                            c2 = 2816;
                        } else if (c == 2) {
                            c2 = 2817;
                        } else if (c == 3) {
                            c2 = 2819;
                        } else {
                            if (c != 4) {
                                throw com.google.android.gms.internal.ads.zzat.zzb("Invalid SEF name", null);
                            }
                            c2 = 2820;
                        }
                        int i5 = zzamfVar.zzb - (zzC + 8);
                        if (c2 == 2192) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.util.List zze = zzb.zze(zzetVar.zzK(i5, java.nio.charset.StandardCharsets.UTF_8));
                            for (int i6 = 0; i6 < zze.size(); i6++) {
                                java.util.List zze2 = zza.zze((java.lang.CharSequence) zze.get(i6));
                                if (zze2.size() != 3) {
                                    throw com.google.android.gms.internal.ads.zzat.zzb(null, null);
                                }
                                try {
                                    arrayList.add(new com.google.android.gms.internal.ads.zzajv(java.lang.Long.parseLong((java.lang.String) zze2.get(0)), java.lang.Long.parseLong((java.lang.String) zze2.get(1)), 1 << (java.lang.Integer.parseInt((java.lang.String) zze2.get(2)) - 1)));
                                } catch (java.lang.NumberFormatException e) {
                                    throw com.google.android.gms.internal.ads.zzat.zzb(null, e);
                                }
                            }
                            list.add(new com.google.android.gms.internal.ads.zzajw(arrayList));
                        } else if (c2 != 2816 && c2 != 2817 && c2 != c3 && c2 != 2820) {
                            throw new java.lang.IllegalStateException();
                        }
                        i4++;
                        c3 = 2819;
                    } else {
                        zzagyVar.zza = 0L;
                    }
                }
            } else {
                long zzo3 = zzafzVar.zzo();
                int i7 = this.zze - 20;
                com.google.android.gms.internal.ads.zzet zzetVar2 = new com.google.android.gms.internal.ads.zzet(i7);
                zzafzVar.zzc(zzetVar2.zzi(), 0, i7);
                int i8 = 0;
                while (i8 < i7 / 12) {
                    zzetVar2.zzk(i3);
                    short zzw = zzetVar2.zzw();
                    if (zzw == s3 || zzw == s2 || zzw == s || zzw == 2819 || zzw == 2820) {
                        i = i7;
                        this.zzc.add(new com.google.android.gms.internal.ads.zzamf(zzw, (zzo3 - this.zze) - zzetVar2.zzC(), zzetVar2.zzC()));
                    } else {
                        zzetVar2.zzk(8);
                        i = i7;
                    }
                    i8++;
                    i7 = i;
                    i3 = 2;
                    s = 2817;
                    s2 = 2816;
                    s3 = 2192;
                }
                java.util.List list3 = this.zzc;
                if (list3.isEmpty()) {
                    zzagyVar.zza = 0L;
                } else {
                    this.zzd = 3;
                    zzagyVar.zza = ((com.google.android.gms.internal.ads.zzamf) list3.get(0)).zza;
                }
            }
        } else {
            com.google.android.gms.internal.ads.zzet zzetVar3 = new com.google.android.gms.internal.ads.zzet(8);
            zzafzVar.zzc(zzetVar3.zzi(), 0, 8);
            this.zze = zzetVar3.zzC() + 8;
            if (zzetVar3.zzB() != 1397048916) {
                zzagyVar.zza = 0L;
            } else {
                zzagyVar.zza = zzafzVar.zzn() - (this.zze - 12);
                this.zzd = 2;
            }
        }
        return 1;
    }
}
