package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
final class zzakp {
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final zzakv zzf;
    public final String zzg;
    public final String zzh;
    public final zzakp zzi;
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    private zzakp(String str, String str2, long j, long j3, zzakv zzakvVar, String[] strArr, String str3, String str4, zzakp zzakpVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzakvVar;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j;
        this.zze = j3;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzakpVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }

    public static zzakp zzb(String str, long j, long j3, zzakv zzakvVar, String[] strArr, String str2, String str3, zzakp zzakpVar) {
        return new zzakp(str, null, j, j3, zzakvVar, strArr, str2, str3, zzakpVar);
    }

    public static zzakp zzc(String str) {
        return new zzakp(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static SpannableStringBuilder zzi(String str, Map map) {
        if (!map.containsKey(str)) {
            zzcl zzclVar = new zzcl();
            zzclVar.zzl(new SpannableStringBuilder());
            map.put(str, zzclVar);
        }
        CharSequence charSequenceZzq = ((zzcl) map.get(str)).zzq();
        charSequenceZzq.getClass();
        return (SpannableStringBuilder) charSequenceZzq;
    }

    private final void zzj(TreeSet treeSet, boolean z4) {
        String str = this.zza;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z4 || zEquals || (zEquals2 && this.zzh != null)) {
            long j = this.zzd;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j3 = this.zze;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
        }
        if (this.zzm != null) {
            for (int i7 = 0; i7 < this.zzm.size(); i7++) {
                zzakp zzakpVar = (zzakp) this.zzm.get(i7);
                boolean z7 = true;
                if (!z4 && !zEquals) {
                    z7 = false;
                }
                zzakpVar.zzj(treeSet, z7);
            }
        }
    }

    private final void zzk(long j, String str, List list) {
        String str2;
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (zzg(j) && "div".equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i7 = 0; i7 < zza(); i7++) {
            zzd(i7).zzk(j, str, list);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:107:0x0202  */
    /* JADX WARN: Code duplicated, block: B:110:0x0206  */
    /* JADX WARN: Code duplicated, block: B:111:0x0211  */
    /* JADX WARN: Code duplicated, block: B:112:0x0220  */
    /* JADX WARN: Code duplicated, block: B:115:0x023a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0245  */
    /* JADX WARN: Code duplicated, block: B:120:0x0256  */
    /* JADX WARN: Code duplicated, block: B:123:0x0263  */
    private final void zzl(long j, Map map, Map map2, String str, Map map3) {
        zzakp zzakpVar;
        int i7;
        zzakv zzakvVarZza;
        int iZze;
        int i8;
        int i9 = -1;
        if (zzg(j)) {
            String str2 = !"".equals(this.zzg) ? this.zzg : str;
            Iterator it = this.zzl.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                int iIntValue = this.zzk.containsKey(str3) ? ((Integer) this.zzk.get(str3)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    zzcl zzclVar = (zzcl) map3.get(str3);
                    zzclVar.getClass();
                    zzakt zzaktVar = (zzakt) map2.get(str2);
                    zzaktVar.getClass();
                    int i10 = zzaktVar.zzj;
                    zzakv zzakvVarZza2 = zzaku.zza(this.zzf, this.zzj, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzclVar.zzq();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzclVar.zzl(spannableStringBuilder);
                    }
                    if (zzakvVarZza2 != null) {
                        zzakp zzakpVar2 = this.zzi;
                        if (zzakvVarZza2.zzh() != i9) {
                            spannableStringBuilder.setSpan(new StyleSpan(zzakvVarZza2.zzh()), iIntValue, iIntValue2, 33);
                        }
                        if (zzakvVarZza2.zzM()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzakvVarZza2.zzN()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzakvVarZza2.zzL()) {
                            zzcs.zzb(spannableStringBuilder, new ForegroundColorSpan(zzakvVarZza2.zzd()), iIntValue, iIntValue2, 33);
                        }
                        if (zzakvVarZza2.zzK()) {
                            zzcs.zzb(spannableStringBuilder, new BackgroundColorSpan(zzakvVarZza2.zzc()), iIntValue, iIntValue2, 33);
                        }
                        if (zzakvVarZza2.zzG() != null) {
                            zzcs.zzb(spannableStringBuilder, new TypefaceSpan(zzakvVarZza2.zzG()), iIntValue, iIntValue2, 33);
                        }
                        if (zzakvVarZza2.zzk() != null) {
                            zzako zzakoVarZzk = zzakvVarZza2.zzk();
                            zzakoVarZzk.getClass();
                            int i11 = zzakoVarZzk.zza;
                            if (i11 == -1) {
                                i11 = (i10 == 2 || i10 == 1) ? 3 : 1;
                                i8 = 1;
                            } else {
                                i8 = zzakoVarZzk.zzb;
                            }
                            int i12 = zzakoVarZzk.zzc;
                            if (i12 == -2) {
                                i12 = 1;
                            }
                            zzcs.zzb(spannableStringBuilder, new zzct(i11, i8, i12), iIntValue, iIntValue2, 33);
                        }
                        int iZzg = zzakvVarZza2.zzg();
                        if (iZzg == 2) {
                            while (true) {
                                if (zzakpVar2 == null) {
                                    zzakpVar2 = null;
                                    break;
                                }
                                zzakv zzakvVarZza3 = zzaku.zza(zzakpVar2.zzf, zzakpVar2.zzj, map);
                                if (zzakvVarZza3 != null && zzakvVarZza3.zzg() == 1) {
                                    break;
                                } else {
                                    zzakpVar2 = zzakpVar2.zzi;
                                }
                            }
                            if (zzakpVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzakpVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzakpVar = null;
                                        break;
                                    }
                                    zzakp zzakpVar3 = (zzakp) arrayDeque.pop();
                                    zzakv zzakvVarZza4 = zzaku.zza(zzakpVar3.zzf, zzakpVar3.zzj, map);
                                    if (zzakvVarZza4 != null && zzakvVarZza4.zzg() == 3) {
                                        zzakpVar = zzakpVar3;
                                        break;
                                    }
                                    for (int iZza = zzakpVar3.zza() - 1; iZza >= 0; iZza--) {
                                        arrayDeque.push(zzakpVar3.zzd(iZza));
                                    }
                                }
                                if (zzakpVar != null) {
                                    if (zzakpVar.zza() != 1 || zzakpVar.zzd(0).zzb == null) {
                                        i7 = -1;
                                        zzdq.zze("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str4 = zzakpVar.zzd(0).zzb;
                                        int i13 = zzen.zza;
                                        zzakv zzakvVarZza5 = zzaku.zza(zzakpVar.zzf, zzakpVar.zzj, map);
                                        int iZzf = zzakvVarZza5 != null ? zzakvVarZza5.zzf() : -1;
                                        i7 = -1;
                                        if (iZzf == -1 && (zzakvVarZza = zzaku.zza(zzakpVar2.zzf, zzakpVar2.zzj, map)) != null) {
                                            iZzf = zzakvVarZza.zzf();
                                        }
                                        spannableStringBuilder.setSpan(new zzcr(str4, iZzf), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                            if (zzakvVarZza2.zzJ()) {
                                zzcs.zzb(spannableStringBuilder, new zzcq(), iIntValue, iIntValue2, 33);
                            }
                            iZze = zzakvVarZza2.zze();
                            if (iZze != 1) {
                                zzcs.zzb(spannableStringBuilder, new AbsoluteSizeSpan((int) zzakvVarZza2.zza(), true), iIntValue, iIntValue2, 33);
                            } else if (iZze != 2) {
                                zzcs.zzb(spannableStringBuilder, new RelativeSizeSpan(zzakvVarZza2.zza()), iIntValue, iIntValue2, 33);
                            } else if (iZze == 3) {
                                zzcs.zza(spannableStringBuilder, zzakvVarZza2.zza() / 100.0f, iIntValue, iIntValue2, 33);
                            }
                            if ("p".equals(this.zza)) {
                                if (zzakvVarZza2.zzb() != Float.MAX_VALUE) {
                                    zzclVar.zzj((zzakvVarZza2.zzb() * (-90.0f)) / 100.0f);
                                }
                                if (zzakvVarZza2.zzj() != null) {
                                    zzclVar.zzm(zzakvVarZza2.zzj());
                                }
                                if (zzakvVarZza2.zzi() != null) {
                                    zzclVar.zzg(zzakvVarZza2.zzi());
                                }
                            }
                            i9 = i7;
                            it = it;
                        } else if (iZzg == 3 || iZzg == 4) {
                            spannableStringBuilder.setSpan(new zzakn(), iIntValue, iIntValue2, 33);
                        }
                        i7 = -1;
                        if (zzakvVarZza2.zzJ()) {
                            zzcs.zzb(spannableStringBuilder, new zzcq(), iIntValue, iIntValue2, 33);
                        }
                        iZze = zzakvVarZza2.zze();
                        if (iZze != 1) {
                            zzcs.zzb(spannableStringBuilder, new AbsoluteSizeSpan((int) zzakvVarZza2.zza(), true), iIntValue, iIntValue2, 33);
                        } else if (iZze != 2) {
                            zzcs.zzb(spannableStringBuilder, new RelativeSizeSpan(zzakvVarZza2.zza()), iIntValue, iIntValue2, 33);
                        } else if (iZze == 3) {
                            zzcs.zza(spannableStringBuilder, zzakvVarZza2.zza() / 100.0f, iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.zza)) {
                            if (zzakvVarZza2.zzb() != Float.MAX_VALUE) {
                                zzclVar.zzj((zzakvVarZza2.zzb() * (-90.0f)) / 100.0f);
                            }
                            if (zzakvVarZza2.zzj() != null) {
                                zzclVar.zzm(zzakvVarZza2.zzj());
                            }
                            if (zzakvVarZza2.zzi() != null) {
                                zzclVar.zzg(zzakvVarZza2.zzi());
                            }
                        }
                        i9 = i7;
                        it = it;
                    }
                }
            }
            for (int i14 = 0; i14 < zza(); i14++) {
                zzd(i14).zzl(j, map, map2, str2, map3);
            }
        }
    }

    private final void zzm(long j, boolean z4, String str, Map map) {
        this.zzk.clear();
        this.zzl.clear();
        if ("metadata".equals(this.zza)) {
            return;
        }
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (this.zzc && z4) {
            SpannableStringBuilder spannableStringBuilderZzi = zzi(str, map);
            String str2 = this.zzb;
            str2.getClass();
            spannableStringBuilderZzi.append((CharSequence) str2);
            return;
        }
        if ("br".equals(this.zza) && z4) {
            zzi(str, map).append('\n');
            return;
        }
        if (zzg(j)) {
            for (Map.Entry entry : map.entrySet()) {
                HashMap map2 = this.zzk;
                String str3 = (String) entry.getKey();
                CharSequence charSequenceZzq = ((zzcl) entry.getValue()).zzq();
                charSequenceZzq.getClass();
                map2.put(str3, Integer.valueOf(charSequenceZzq.length()));
            }
            boolean zEquals = "p".equals(this.zza);
            for (int i7 = 0; i7 < zza(); i7++) {
                zzd(i7).zzm(j, z4 || zEquals, str, map);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderZzi2 = zzi(str, map);
                int length = spannableStringBuilderZzi2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderZzi2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderZzi2.charAt(length) != '\n') {
                    spannableStringBuilderZzi2.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                HashMap map3 = this.zzl;
                String str4 = (String) entry2.getKey();
                CharSequence charSequenceZzq2 = ((zzcl) entry2.getValue()).zzq();
                charSequenceZzq2.getClass();
                map3.put(str4, Integer.valueOf(charSequenceZzq2.length()));
            }
        }
    }

    public final int zza() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final zzakp zzd(int i7) {
        List list = this.zzm;
        if (list != null) {
            return (zzakp) list.get(i7);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List zze(long j, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        zzk(j, this.zzg, arrayList);
        TreeMap treeMap = new TreeMap();
        zzm(j, false, this.zzg, treeMap);
        zzl(j, map, map2, this.zzg, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Pair pair = (Pair) arrayList.get(i7);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                zzakt zzaktVar = (zzakt) map2.get(pair.first);
                zzaktVar.getClass();
                zzcl zzclVar = new zzcl();
                zzclVar.zzc(bitmapDecodeByteArray);
                zzclVar.zzh(zzaktVar.zzb);
                zzclVar.zzi(0);
                zzclVar.zze(zzaktVar.zzc, 0);
                zzclVar.zzf(zzaktVar.zze);
                zzclVar.zzk(zzaktVar.zzf);
                zzclVar.zzd(zzaktVar.zzg);
                zzclVar.zzo(zzaktVar.zzj);
                arrayList2.add(zzclVar.zzp());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzakt zzaktVar2 = (zzakt) map2.get(entry.getKey());
            zzaktVar2.getClass();
            zzcl zzclVar2 = (zzcl) entry.getValue();
            CharSequence charSequenceZzq = zzclVar2.zzq();
            charSequenceZzq.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceZzq;
            for (zzakn zzaknVar : (zzakn[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzakn.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzaknVar), spannableStringBuilder.getSpanEnd(zzaknVar), (CharSequence) "");
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length()) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ') {
                    int i10 = i9;
                    while (i10 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i10) == ' ') {
                        i10++;
                    }
                    int i11 = i10 - i9;
                    if (i11 > 0) {
                        spannableStringBuilder.delete(i8, i11 + i8);
                    }
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i12 = 0;
            while (i12 < spannableStringBuilder.length() - 1) {
                int i13 = i12 + 1;
                if (spannableStringBuilder.charAt(i12) == '\n' && spannableStringBuilder.charAt(i13) == ' ') {
                    spannableStringBuilder.delete(i13, i12 + 2);
                }
                i12 = i13;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i14 = 0;
            while (i14 < spannableStringBuilder.length() - 1) {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i14) == ' ' && spannableStringBuilder.charAt(i15) == '\n') {
                    spannableStringBuilder.delete(i14, i15);
                }
                i14 = i15;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzclVar2.zze(zzaktVar2.zzc, zzaktVar2.zzd);
            zzclVar2.zzf(zzaktVar2.zze);
            zzclVar2.zzh(zzaktVar2.zzb);
            zzclVar2.zzk(zzaktVar2.zzf);
            zzclVar2.zzn(zzaktVar2.zzi, zzaktVar2.zzh);
            zzclVar2.zzo(zzaktVar2.zzj);
            arrayList2.add(zzclVar2.zzp());
        }
        return arrayList2;
    }

    public final void zzf(zzakp zzakpVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzakpVar);
    }

    public final boolean zzg(long j) {
        long j3 = this.zzd;
        if (j3 == -9223372036854775807L) {
            if (this.zze == -9223372036854775807L) {
                return true;
            }
            j3 = -9223372036854775807L;
        }
        if (j3 <= j && this.zze == -9223372036854775807L) {
            return true;
        }
        if (j3 != -9223372036854775807L || j >= this.zze) {
            return j3 <= j && j < this.zze;
        }
        return true;
    }

    public final long[] zzh() {
        TreeSet treeSet = new TreeSet();
        int i7 = 0;
        zzj(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i7] = ((Long) it.next()).longValue();
            i7++;
        }
        return jArr;
    }
}
