package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class zzyf extends zzyk implements zzlo {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfxs zzc = zzfxs.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzxf
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i7 = zzyf.zzb;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });
    public final Context zza;
    private final Object zzd;
    private zzxt zze;
    private zzxx zzf;
    private zze zzg;
    private final zzxb zzh;

    public zzyf(Context context) {
        zzxb zzxbVar = new zzxb();
        zzxt zzxtVar = zzxt.zzF;
        this.zzd = new Object();
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzh = zzxbVar;
        if (zzxtVar != null) {
            this.zze = zzxtVar;
        } else {
            zzxs zzxsVar = new zzxs(zzxtVar, null);
            zzxsVar.zzw(zzxtVar);
            this.zze = new zzxt(zzxsVar);
        }
        this.zzg = zze.zza;
        if (this.zze.zzQ && context == null) {
            zzdq.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static /* bridge */ /* synthetic */ int zzb(int i7, int i8) {
        return (i7 == 0 || i7 != i8) ? Integer.bitCount(i7 & i8) : f.API_PRIORITY_OTHER;
    }

    public static int zzc(zzz zzzVar, String str, boolean z4) {
        if (!TextUtils.isEmpty(str) && str.equals(zzzVar.zzd)) {
            return 4;
        }
        String zzh = zzh(str);
        String zzh2 = zzh(zzzVar.zzd);
        if (zzh2 == null || zzh == null) {
            return (z4 && zzh2 == null) ? 1 : 0;
        }
        if (zzh2.startsWith(zzh) || zzh.startsWith(zzh2)) {
            return 3;
        }
        int i7 = zzen.zza;
        return zzh2.split("-", 2)[0].equals(zzh.split("-", 2)[0]) ? 2 : 0;
    }

    public static String zzh(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static /* synthetic */ boolean zzm(zzyf zzyfVar, zzxt zzxtVar, zzz zzzVar) {
        zzxx zzxxVar;
        zzxx zzxxVar2;
        if (!zzxtVar.zzQ) {
            return true;
        }
        int i7 = zzzVar.zzE;
        char c3 = 65535;
        if (i7 == -1 || i7 <= 2) {
            return true;
        }
        String str = zzzVar.zzo;
        if (str != null) {
            switch (str.hashCode()) {
                case -2123537834:
                    if (str.equals("audio/eac3-joc")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 187078296:
                    if (str.equals("audio/ac3")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case 187078297:
                    if (str.equals("audio/ac4")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case 1504578661:
                    if (str.equals("audio/eac3")) {
                        c3 = 1;
                        break;
                    }
                    break;
            }
            if ((c3 == 0 || c3 == 1 || c3 == 2 || c3 == 3) && (zzen.zza < 32 || (zzxxVar2 = zzyfVar.zzf) == null || !zzxxVar2.zze())) {
                return true;
            }
        }
        if (zzen.zza >= 32 && (zzxxVar = zzyfVar.zzf) != null && zzxxVar.zze() && zzxxVar.zzc() && zzyfVar.zzf.zzd()) {
            return zzyfVar.zzf.zzb(zzyfVar.zzg, zzzVar);
        }
        return false;
    }

    private static void zzt(zzwv zzwvVar, zzbt zzbtVar, Map map) {
        for (int i7 = 0; i7 < zzwvVar.zzb; i7++) {
            if (((zzbp) zzbtVar.zzD.get(zzwvVar.zzb(i7))) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzu() {
        boolean z4;
        zzxx zzxxVar;
        synchronized (this.zzd) {
            try {
                z4 = false;
                if (this.zze.zzQ && zzen.zza >= 32 && (zzxxVar = this.zzf) != null && zzxxVar.zze()) {
                    z4 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            zzs();
        }
    }

    private static final Pair zzv(int i7, zzyj zzyjVar, int[][][] iArr, zzxz zzxzVar, Comparator comparator) {
        RandomAccess randomAccess;
        zzyj zzyjVar2 = zzyjVar;
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (i8 < 2) {
            if (i7 == zzyjVar2.zzc(i8)) {
                zzwv zzd = zzyjVar2.zzd(i8);
                for (int i9 = 0; i9 < zzd.zzb; i9++) {
                    zzbo zzb2 = zzd.zzb(i9);
                    List zza = zzxzVar.zza(i8, zzb2, iArr[i8][i9]);
                    boolean[] zArr = new boolean[zzb2.zza];
                    int i10 = 0;
                    while (i10 < zzb2.zza) {
                        int i11 = i10 + 1;
                        zzya zzyaVar = (zzya) zza.get(i10);
                        int zzb3 = zzyaVar.zzb();
                        if (!zArr[i10] && zzb3 != 0) {
                            if (zzb3 == 1) {
                                randomAccess = zzfwh.zzo(zzyaVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzyaVar);
                                for (int i12 = i11; i12 < zzb2.zza; i12++) {
                                    zzya zzyaVar2 = (zzya) zza.get(i12);
                                    if (zzyaVar2.zzb() == 2 && zzyaVar.zzc(zzyaVar2)) {
                                        arrayList2.add(zzyaVar2);
                                        zArr[i12] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i10 = i11;
                    }
                }
            }
            i8++;
            zzyjVar2 = zzyjVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i13 = 0; i13 < list.size(); i13++) {
            iArr2[i13] = ((zzya) list.get(i13)).zzc;
        }
        zzya zzyaVar3 = (zzya) list.get(0);
        return Pair.create(new zzyg(zzyaVar3.zzb, iArr2, 0), Integer.valueOf(zzyaVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final void zza(zzlm zzlmVar) {
        synchronized (this.zzd) {
            boolean z4 = this.zze.zzU;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final Pair zzd(zzyj zzyjVar, int[][][] iArr, final int[] iArr2, zzuq zzuqVar, zzbn zzbnVar) {
        final zzxt zzxtVar;
        final boolean z4;
        final String str;
        Pair pair;
        final String str2;
        int i7;
        zzyh zza;
        int i8;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        int i9 = 1;
        synchronized (this.zzd) {
            zzxtVar = this.zze;
        }
        if (zzxtVar.zzQ && zzen.zza >= 32 && this.zzf == null) {
            this.zzf = new zzxx(this.zza, this);
        }
        int i10 = 2;
        zzyg[] zzygVarArr = new zzyg[2];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= 2) {
                z4 = false;
                break;
            }
            if (zzyjVar.zzc(i12) == 2 && zzyjVar.zzd(i12).zzb > 0) {
                z4 = true;
                break;
            }
            i12++;
        }
        Pair zzv = zzv(1, zzyjVar, iArr, new zzxz() { // from class: com.google.android.gms.internal.ads.zzxk
            @Override // com.google.android.gms.internal.ads.zzxz
            public final List zza(int i13, zzbo zzboVar, int[] iArr3) {
                zzxk zzxkVar = this;
                final zzyf zzyfVar = zzyf.this;
                final zzxt zzxtVar2 = zzxtVar;
                zzfti zzftiVar = new zzfti() { // from class: com.google.android.gms.internal.ads.zzxm
                    @Override // com.google.android.gms.internal.ads.zzfti
                    public final boolean zza(Object obj) {
                        return zzyf.zzm(zzyf.this, zzxtVar2, (zzz) obj);
                    }
                };
                int i14 = iArr2[i13];
                int i15 = zzfwh.zzd;
                zzfwe zzfweVar = new zzfwe();
                int i16 = 0;
                while (i16 < zzboVar.zza) {
                    zzfweVar.zzf(new zzxp(i13, zzboVar, i16, zzxtVar2, iArr3[i16], z4, zzftiVar, i14));
                    i16++;
                    zzxkVar = this;
                }
                return zzfweVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxl
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzxp) Collections.max((List) obj)).zza((zzxp) Collections.max((List) obj2));
            }
        });
        if (zzv != null) {
            zzygVarArr[((Integer) zzv.second).intValue()] = (zzyg) zzv.first;
        }
        if (zzv == null) {
            str = null;
        } else {
            Object obj = zzv.first;
            str = ((zzyg) obj).zza.zzb(((zzyg) obj).zzb[0]).zzd;
        }
        int i13 = zzxtVar.zzu.zzb;
        final Point zzw = (!zzxtVar.zzk || (context2 = this.zza) == null) ? null : zzen.zzw(context2);
        Pair zzv2 = zzv(2, zzyjVar, iArr, new zzxz() { // from class: com.google.android.gms.internal.ads.zzxi
            /* JADX WARN: Removed duplicated region for block: B:44:0x0053  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0061  */
            @Override // com.google.android.gms.internal.ads.zzxz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final List zza(int i14, zzbo zzboVar, int[] iArr3) {
                int i15;
                char c3;
                boolean z7;
                int i16;
                int i17;
                int i18;
                Point point;
                int i19;
                int i20;
                zzxi zzxiVar = this;
                int i21 = zzyf.zzb;
                zzxt zzxtVar2 = zzxt.this;
                int i22 = iArr2[i14];
                Point point2 = zzw;
                int i23 = point2 != null ? point2.x : zzxtVar2.zzi;
                int i24 = point2 != null ? point2.y : zzxtVar2.zzj;
                boolean z8 = zzxtVar2.zzl;
                if (i23 == Integer.MAX_VALUE) {
                    i15 = f.API_PRIORITY_OTHER;
                } else if (i24 == Integer.MAX_VALUE) {
                    i15 = Integer.MAX_VALUE;
                } else {
                    int i25 = Integer.MAX_VALUE;
                    for (int i26 = 0; i26 < zzboVar.zza; i26++) {
                        zzz zzb2 = zzboVar.zzb(i26);
                        int i27 = zzb2.zzv;
                        if (i27 > 0 && (i16 = zzb2.zzw) > 0) {
                            if (z8) {
                                if ((i27 > i16) != (i23 > i24)) {
                                    i18 = i24;
                                    i17 = i23;
                                    if (i27 * i17 < i16 * i18) {
                                        int i28 = zzen.zza;
                                        point = new Point(i18, ((r14 + i27) - 1) / i27);
                                    } else {
                                        int i29 = zzen.zza;
                                        point = new Point(((r11 + i16) - 1) / i16, i17);
                                    }
                                    i19 = zzb2.zzv;
                                    int i30 = zzb2.zzw;
                                    i20 = i19 * i30;
                                    if (i19 >= ((int) (point.x * 0.98f)) && i30 >= ((int) (point.y * 0.98f)) && i20 < i25) {
                                        i25 = i20;
                                    }
                                }
                            }
                            i17 = i24;
                            i18 = i23;
                            if (i27 * i17 < i16 * i18) {
                            }
                            i19 = zzb2.zzv;
                            int i302 = zzb2.zzw;
                            i20 = i19 * i302;
                            if (i19 >= ((int) (point.x * 0.98f))) {
                                i25 = i20;
                            }
                        }
                    }
                    i15 = i25;
                }
                int i31 = zzfwh.zzd;
                zzfwe zzfweVar = new zzfwe();
                int i32 = 0;
                while (i32 < zzboVar.zza) {
                    int zza2 = zzboVar.zzb(i32).zza();
                    if (i15 != Integer.MAX_VALUE) {
                        c3 = 65535;
                        if (zza2 == -1 || zza2 > i15) {
                            z7 = false;
                            zzfweVar.zzf(new zzyd(i14, zzboVar, i32, zzxtVar2, iArr3[i32], str, i22, z7));
                            i32++;
                            zzxiVar = this;
                        }
                    } else {
                        c3 = 65535;
                    }
                    z7 = true;
                    zzfweVar.zzf(new zzyd(i14, zzboVar, i32, zzxtVar2, iArr3[i32], str, i22, z7));
                    i32++;
                    zzxiVar = this;
                }
                return zzfweVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxj
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                List list = (List) obj2;
                List list2 = (List) obj3;
                return zzfvw.zzj().zzc((zzyd) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyb
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzyd.zzd((zzyd) obj4, (zzyd) obj5);
                    }
                }), (zzyd) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyb
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzyd.zzd((zzyd) obj4, (zzyd) obj5);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzyb
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzyd.zzd((zzyd) obj4, (zzyd) obj5);
                    }
                }).zzb(list.size(), list2.size()).zzc((zzyd) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyc
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzyd.zza((zzyd) obj4, (zzyd) obj5);
                    }
                }), (zzyd) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyc
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzyd.zza((zzyd) obj4, (zzyd) obj5);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzyc
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzyd.zza((zzyd) obj4, (zzyd) obj5);
                    }
                }).zza();
            }
        });
        int i14 = 4;
        if (zzv2 == null) {
            int i15 = zzxtVar.zzu.zzb;
            pair = zzv(4, zzyjVar, iArr, new zzxz() { // from class: com.google.android.gms.internal.ads.zzxg
                @Override // com.google.android.gms.internal.ads.zzxz
                public final List zza(int i16, zzbo zzboVar, int[] iArr3) {
                    int i17 = zzyf.zzb;
                    int i18 = zzfwh.zzd;
                    zzfwe zzfweVar = new zzfwe();
                    for (int i19 = 0; i19 < zzboVar.zza; i19++) {
                        zzfweVar.zzf(new zzxq(i16, zzboVar, i19, zzxt.this, iArr3[i19]));
                    }
                    return zzfweVar.zzi();
                }
            }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxh
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return ((zzxq) ((List) obj2).get(0)).compareTo((zzxq) ((List) obj3).get(0));
                }
            });
        } else {
            pair = null;
        }
        if (pair != null) {
            zzygVarArr[((Integer) pair.second).intValue()] = (zzyg) pair.first;
        } else if (zzv2 != null) {
            zzygVarArr[((Integer) zzv2.second).intValue()] = (zzyg) zzv2.first;
        }
        int i16 = zzxtVar.zzu.zzb;
        if (!zzxtVar.zzx || (context = this.zza) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            str2 = null;
        } else {
            int i17 = zzen.zza;
            str2 = locale.toLanguageTag();
        }
        int i18 = 3;
        Pair zzv3 = zzv(3, zzyjVar, iArr, new zzxz() { // from class: com.google.android.gms.internal.ads.zzxn
            @Override // com.google.android.gms.internal.ads.zzxz
            public final List zza(int i19, zzbo zzboVar, int[] iArr3) {
                int i20 = zzyf.zzb;
                int i21 = zzfwh.zzd;
                zzfwe zzfweVar = new zzfwe();
                for (int i22 = 0; i22 < zzboVar.zza; i22++) {
                    String str3 = str2;
                    int i23 = i22;
                    zzfweVar.zzf(new zzxy(i19, zzboVar, i23, zzxt.this, iArr3[i22], str, str3));
                }
                return zzfweVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxo
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((zzxy) ((List) obj2).get(0)).zza((zzxy) ((List) obj3).get(0));
            }
        });
        if (zzv3 != null) {
            zzygVarArr[((Integer) zzv3.second).intValue()] = (zzyg) zzv3.first;
        }
        int i19 = 0;
        while (i19 < i10) {
            int zzc2 = zzyjVar.zzc(i19);
            if (zzc2 != i10 && zzc2 != i9 && zzc2 != i18 && zzc2 != i14) {
                zzwv zzd = zzyjVar.zzd(i19);
                int[][] iArr3 = iArr[i19];
                int i20 = zzxtVar.zzu.zzb;
                int i21 = i11;
                int i22 = i21;
                zzbo zzboVar = null;
                zzxr zzxrVar = null;
                while (i21 < zzd.zzb) {
                    zzbo zzb2 = zzd.zzb(i21);
                    int[] iArr4 = iArr3[i21];
                    zzxr zzxrVar2 = zzxrVar;
                    for (int i23 = i11; i23 < zzb2.zza; i23++) {
                        if (zzln.zza(iArr4[i23], zzxtVar.zzR)) {
                            zzxr zzxrVar3 = new zzxr(zzb2.zzb(i23), iArr4[i23]);
                            if (zzxrVar2 == null || zzxrVar3.compareTo(zzxrVar2) > 0) {
                                zzxrVar2 = zzxrVar3;
                                zzboVar = zzb2;
                                i22 = i23;
                            }
                        }
                        i9 = 1;
                    }
                    i21 += i9;
                    zzxrVar = zzxrVar2;
                    i11 = 0;
                }
                zzygVarArr[i19] = zzboVar == null ? null : new zzyg(zzboVar, new int[]{i22}, 0);
                i9 = 1;
            }
            i19 += i9;
            i10 = 2;
            i11 = 0;
            i18 = 3;
            i14 = 4;
        }
        HashMap hashMap = new HashMap();
        int i24 = 2;
        for (int i25 = 0; i25 < 2; i25 += i9) {
            zzt(zzyjVar.zzd(i25), zzxtVar, hashMap);
        }
        zzt(zzyjVar.zze(), zzxtVar, hashMap);
        for (int i26 = 0; i26 < 2; i26 += i9) {
            if (((zzbp) hashMap.get(Integer.valueOf(zzyjVar.zzc(i26)))) != null) {
                throw null;
            }
        }
        int i27 = 0;
        while (i27 < i24) {
            zzwv zzd2 = zzyjVar.zzd(i27);
            if (zzxtVar.zzf(i27, zzd2)) {
                if (zzxtVar.zzd(i27, zzd2) != null) {
                    throw null;
                }
                zzygVarArr[i27] = null;
            }
            i27++;
            i24 = 2;
        }
        int i28 = 0;
        for (int i29 = i24; i28 < i29; i29 = 2) {
            int zzc3 = zzyjVar.zzc(i28);
            if (zzxtVar.zze(i28) || zzxtVar.zzE.contains(Integer.valueOf(zzc3))) {
                zzygVarArr[i28] = null;
                i8 = 1;
            } else {
                i8 = 1;
            }
            i28 += i8;
        }
        zzxb zzxbVar = this.zzh;
        zzyv zzq = zzq();
        zzfwh zzh = zzxc.zzh(zzygVarArr);
        int i30 = 2;
        zzyh[] zzyhVarArr = new zzyh[2];
        int i31 = 0;
        while (i31 < i30) {
            zzyg zzygVar = zzygVarArr[i31];
            if (zzygVar != null) {
                int[] iArr5 = zzygVar.zzb;
                int length = iArr5.length;
                if (length == 0) {
                    i7 = i31;
                    i31 = i7 + 1;
                    i30 = 2;
                } else {
                    if (length == 1) {
                        zza = new zzyi(zzygVar.zza, iArr5[0], 0, 0, null);
                        i7 = i31;
                    } else {
                        i7 = i31;
                        zza = zzxbVar.zza(zzygVar.zza, iArr5, 0, zzq, (zzfwh) zzh.get(i31));
                    }
                    zzyhVarArr[i7] = zza;
                }
            } else {
                i7 = i31;
            }
            i31 = i7 + 1;
            i30 = 2;
        }
        zzlq[] zzlqVarArr = new zzlq[i30];
        for (int i32 = 0; i32 < i30; i32++) {
            zzlqVarArr[i32] = (zzxtVar.zze(i32) || zzxtVar.zzE.contains(Integer.valueOf(zzyjVar.zzc(i32))) || (zzyjVar.zzc(i32) != -2 && zzyhVarArr[i32] == null)) ? null : zzlq.zza;
        }
        int i33 = zzxtVar.zzu.zzb;
        return Pair.create(zzlqVarArr, zzyhVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzyn
    public final zzlo zze() {
        return this;
    }

    public final zzxt zzf() {
        zzxt zzxtVar;
        synchronized (this.zzd) {
            zzxtVar = this.zze;
        }
        return zzxtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyn
    public final void zzj() {
        zzxx zzxxVar;
        if (zzen.zza >= 32 && (zzxxVar = this.zzf) != null) {
            zzxxVar.zza();
        }
        super.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzyn
    public final void zzk(zze zzeVar) {
        if (this.zzg.equals(zzeVar)) {
            return;
        }
        this.zzg = zzeVar;
        zzu();
    }

    public final void zzl(zzxs zzxsVar) {
        boolean equals;
        zzxt zzxtVar = new zzxt(zzxsVar);
        synchronized (this.zzd) {
            equals = this.zze.equals(zzxtVar);
            this.zze = zzxtVar;
        }
        if (equals) {
            return;
        }
        if (zzxtVar.zzQ && this.zza == null) {
            zzdq.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzyn
    public final boolean zzn() {
        return true;
    }
}
