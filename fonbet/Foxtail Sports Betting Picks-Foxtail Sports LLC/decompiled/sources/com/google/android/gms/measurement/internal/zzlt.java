package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzgf;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.DebugKt;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class zzlt extends zzot {
    private static String zza(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // com.google.android.gms.measurement.internal.zzot
    protected final boolean zzc() {
        return false;
    }

    public zzlt(zzou zzouVar) {
        super(zzouVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03c8 A[Catch: all -> 0x051f, TryCatch #3 {all -> 0x051f, SecurityException -> 0x0502, SecurityException -> 0x019b, blocks: (B:10:0x0046, B:12:0x0051, B:15:0x0068, B:17:0x006e, B:20:0x0085, B:22:0x009e, B:23:0x00a5, B:25:0x00af, B:26:0x00bc, B:28:0x00c6, B:29:0x00d3, B:31:0x00de, B:32:0x00e6, B:34:0x0103, B:35:0x0110, B:37:0x012c, B:39:0x013a, B:41:0x0140, B:43:0x0146, B:44:0x0149, B:46:0x0156, B:48:0x015c, B:51:0x0170, B:54:0x017a, B:55:0x018b, B:57:0x018f, B:60:0x019c, B:63:0x01b7, B:65:0x01e9, B:67:0x01ef, B:69:0x01f5, B:71:0x020c, B:73:0x0216, B:74:0x0223, B:75:0x0233, B:77:0x0239, B:83:0x024f, B:87:0x027d, B:88:0x0284, B:90:0x028a, B:92:0x02c2, B:94:0x0329, B:95:0x0341, B:97:0x034d, B:98:0x038c, B:99:0x03c2, B:101:0x03c8, B:104:0x03de, B:109:0x03e9, B:111:0x0438, B:112:0x0447, B:114:0x044f, B:115:0x0452, B:117:0x045a, B:118:0x0463, B:120:0x046d, B:123:0x047b, B:124:0x047e, B:134:0x0460, B:135:0x0379, B:136:0x0256, B:142:0x0504, B:145:0x0107, B:147:0x010d), top: B:9:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0438 A[Catch: all -> 0x051f, TryCatch #3 {all -> 0x051f, SecurityException -> 0x0502, SecurityException -> 0x019b, blocks: (B:10:0x0046, B:12:0x0051, B:15:0x0068, B:17:0x006e, B:20:0x0085, B:22:0x009e, B:23:0x00a5, B:25:0x00af, B:26:0x00bc, B:28:0x00c6, B:29:0x00d3, B:31:0x00de, B:32:0x00e6, B:34:0x0103, B:35:0x0110, B:37:0x012c, B:39:0x013a, B:41:0x0140, B:43:0x0146, B:44:0x0149, B:46:0x0156, B:48:0x015c, B:51:0x0170, B:54:0x017a, B:55:0x018b, B:57:0x018f, B:60:0x019c, B:63:0x01b7, B:65:0x01e9, B:67:0x01ef, B:69:0x01f5, B:71:0x020c, B:73:0x0216, B:74:0x0223, B:75:0x0233, B:77:0x0239, B:83:0x024f, B:87:0x027d, B:88:0x0284, B:90:0x028a, B:92:0x02c2, B:94:0x0329, B:95:0x0341, B:97:0x034d, B:98:0x038c, B:99:0x03c2, B:101:0x03c8, B:104:0x03de, B:109:0x03e9, B:111:0x0438, B:112:0x0447, B:114:0x044f, B:115:0x0452, B:117:0x045a, B:118:0x0463, B:120:0x046d, B:123:0x047b, B:124:0x047e, B:134:0x0460, B:135:0x0379, B:136:0x0256, B:142:0x0504, B:145:0x0107, B:147:0x010d), top: B:9:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x044f A[Catch: all -> 0x051f, TryCatch #3 {all -> 0x051f, SecurityException -> 0x0502, SecurityException -> 0x019b, blocks: (B:10:0x0046, B:12:0x0051, B:15:0x0068, B:17:0x006e, B:20:0x0085, B:22:0x009e, B:23:0x00a5, B:25:0x00af, B:26:0x00bc, B:28:0x00c6, B:29:0x00d3, B:31:0x00de, B:32:0x00e6, B:34:0x0103, B:35:0x0110, B:37:0x012c, B:39:0x013a, B:41:0x0140, B:43:0x0146, B:44:0x0149, B:46:0x0156, B:48:0x015c, B:51:0x0170, B:54:0x017a, B:55:0x018b, B:57:0x018f, B:60:0x019c, B:63:0x01b7, B:65:0x01e9, B:67:0x01ef, B:69:0x01f5, B:71:0x020c, B:73:0x0216, B:74:0x0223, B:75:0x0233, B:77:0x0239, B:83:0x024f, B:87:0x027d, B:88:0x0284, B:90:0x028a, B:92:0x02c2, B:94:0x0329, B:95:0x0341, B:97:0x034d, B:98:0x038c, B:99:0x03c2, B:101:0x03c8, B:104:0x03de, B:109:0x03e9, B:111:0x0438, B:112:0x0447, B:114:0x044f, B:115:0x0452, B:117:0x045a, B:118:0x0463, B:120:0x046d, B:123:0x047b, B:124:0x047e, B:134:0x0460, B:135:0x0379, B:136:0x0256, B:142:0x0504, B:145:0x0107, B:147:0x010d), top: B:9:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x045a A[Catch: all -> 0x051f, TryCatch #3 {all -> 0x051f, SecurityException -> 0x0502, SecurityException -> 0x019b, blocks: (B:10:0x0046, B:12:0x0051, B:15:0x0068, B:17:0x006e, B:20:0x0085, B:22:0x009e, B:23:0x00a5, B:25:0x00af, B:26:0x00bc, B:28:0x00c6, B:29:0x00d3, B:31:0x00de, B:32:0x00e6, B:34:0x0103, B:35:0x0110, B:37:0x012c, B:39:0x013a, B:41:0x0140, B:43:0x0146, B:44:0x0149, B:46:0x0156, B:48:0x015c, B:51:0x0170, B:54:0x017a, B:55:0x018b, B:57:0x018f, B:60:0x019c, B:63:0x01b7, B:65:0x01e9, B:67:0x01ef, B:69:0x01f5, B:71:0x020c, B:73:0x0216, B:74:0x0223, B:75:0x0233, B:77:0x0239, B:83:0x024f, B:87:0x027d, B:88:0x0284, B:90:0x028a, B:92:0x02c2, B:94:0x0329, B:95:0x0341, B:97:0x034d, B:98:0x038c, B:99:0x03c2, B:101:0x03c8, B:104:0x03de, B:109:0x03e9, B:111:0x0438, B:112:0x0447, B:114:0x044f, B:115:0x0452, B:117:0x045a, B:118:0x0463, B:120:0x046d, B:123:0x047b, B:124:0x047e, B:134:0x0460, B:135:0x0379, B:136:0x0256, B:142:0x0504, B:145:0x0107, B:147:0x010d), top: B:9:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0379 A[Catch: all -> 0x051f, TryCatch #3 {all -> 0x051f, SecurityException -> 0x0502, SecurityException -> 0x019b, blocks: (B:10:0x0046, B:12:0x0051, B:15:0x0068, B:17:0x006e, B:20:0x0085, B:22:0x009e, B:23:0x00a5, B:25:0x00af, B:26:0x00bc, B:28:0x00c6, B:29:0x00d3, B:31:0x00de, B:32:0x00e6, B:34:0x0103, B:35:0x0110, B:37:0x012c, B:39:0x013a, B:41:0x0140, B:43:0x0146, B:44:0x0149, B:46:0x0156, B:48:0x015c, B:51:0x0170, B:54:0x017a, B:55:0x018b, B:57:0x018f, B:60:0x019c, B:63:0x01b7, B:65:0x01e9, B:67:0x01ef, B:69:0x01f5, B:71:0x020c, B:73:0x0216, B:74:0x0223, B:75:0x0233, B:77:0x0239, B:83:0x024f, B:87:0x027d, B:88:0x0284, B:90:0x028a, B:92:0x02c2, B:94:0x0329, B:95:0x0341, B:97:0x034d, B:98:0x038c, B:99:0x03c2, B:101:0x03c8, B:104:0x03de, B:109:0x03e9, B:111:0x0438, B:112:0x0447, B:114:0x044f, B:115:0x0452, B:117:0x045a, B:118:0x0463, B:120:0x046d, B:123:0x047b, B:124:0x047e, B:134:0x0460, B:135:0x0379, B:136:0x0256, B:142:0x0504, B:145:0x0107, B:147:0x010d), top: B:9:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028a A[Catch: all -> 0x051f, LOOP:1: B:88:0x0284->B:90:0x028a, LOOP_END, TryCatch #3 {all -> 0x051f, SecurityException -> 0x0502, SecurityException -> 0x019b, blocks: (B:10:0x0046, B:12:0x0051, B:15:0x0068, B:17:0x006e, B:20:0x0085, B:22:0x009e, B:23:0x00a5, B:25:0x00af, B:26:0x00bc, B:28:0x00c6, B:29:0x00d3, B:31:0x00de, B:32:0x00e6, B:34:0x0103, B:35:0x0110, B:37:0x012c, B:39:0x013a, B:41:0x0140, B:43:0x0146, B:44:0x0149, B:46:0x0156, B:48:0x015c, B:51:0x0170, B:54:0x017a, B:55:0x018b, B:57:0x018f, B:60:0x019c, B:63:0x01b7, B:65:0x01e9, B:67:0x01ef, B:69:0x01f5, B:71:0x020c, B:73:0x0216, B:74:0x0223, B:75:0x0233, B:77:0x0239, B:83:0x024f, B:87:0x027d, B:88:0x0284, B:90:0x028a, B:92:0x02c2, B:94:0x0329, B:95:0x0341, B:97:0x034d, B:98:0x038c, B:99:0x03c2, B:101:0x03c8, B:104:0x03de, B:109:0x03e9, B:111:0x0438, B:112:0x0447, B:114:0x044f, B:115:0x0452, B:117:0x045a, B:118:0x0463, B:120:0x046d, B:123:0x047b, B:124:0x047e, B:134:0x0460, B:135:0x0379, B:136:0x0256, B:142:0x0504, B:145:0x0107, B:147:0x010d), top: B:9:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0329 A[Catch: all -> 0x051f, TryCatch #3 {all -> 0x051f, SecurityException -> 0x0502, SecurityException -> 0x019b, blocks: (B:10:0x0046, B:12:0x0051, B:15:0x0068, B:17:0x006e, B:20:0x0085, B:22:0x009e, B:23:0x00a5, B:25:0x00af, B:26:0x00bc, B:28:0x00c6, B:29:0x00d3, B:31:0x00de, B:32:0x00e6, B:34:0x0103, B:35:0x0110, B:37:0x012c, B:39:0x013a, B:41:0x0140, B:43:0x0146, B:44:0x0149, B:46:0x0156, B:48:0x015c, B:51:0x0170, B:54:0x017a, B:55:0x018b, B:57:0x018f, B:60:0x019c, B:63:0x01b7, B:65:0x01e9, B:67:0x01ef, B:69:0x01f5, B:71:0x020c, B:73:0x0216, B:74:0x0223, B:75:0x0233, B:77:0x0239, B:83:0x024f, B:87:0x027d, B:88:0x0284, B:90:0x028a, B:92:0x02c2, B:94:0x0329, B:95:0x0341, B:97:0x034d, B:98:0x038c, B:99:0x03c2, B:101:0x03c8, B:104:0x03de, B:109:0x03e9, B:111:0x0438, B:112:0x0447, B:114:0x044f, B:115:0x0452, B:117:0x045a, B:118:0x0463, B:120:0x046d, B:123:0x047b, B:124:0x047e, B:134:0x0460, B:135:0x0379, B:136:0x0256, B:142:0x0504, B:145:0x0107, B:147:0x010d), top: B:9:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x034d A[Catch: all -> 0x051f, TryCatch #3 {all -> 0x051f, SecurityException -> 0x0502, SecurityException -> 0x019b, blocks: (B:10:0x0046, B:12:0x0051, B:15:0x0068, B:17:0x006e, B:20:0x0085, B:22:0x009e, B:23:0x00a5, B:25:0x00af, B:26:0x00bc, B:28:0x00c6, B:29:0x00d3, B:31:0x00de, B:32:0x00e6, B:34:0x0103, B:35:0x0110, B:37:0x012c, B:39:0x013a, B:41:0x0140, B:43:0x0146, B:44:0x0149, B:46:0x0156, B:48:0x015c, B:51:0x0170, B:54:0x017a, B:55:0x018b, B:57:0x018f, B:60:0x019c, B:63:0x01b7, B:65:0x01e9, B:67:0x01ef, B:69:0x01f5, B:71:0x020c, B:73:0x0216, B:74:0x0223, B:75:0x0233, B:77:0x0239, B:83:0x024f, B:87:0x027d, B:88:0x0284, B:90:0x028a, B:92:0x02c2, B:94:0x0329, B:95:0x0341, B:97:0x034d, B:98:0x038c, B:99:0x03c2, B:101:0x03c8, B:104:0x03de, B:109:0x03e9, B:111:0x0438, B:112:0x0447, B:114:0x044f, B:115:0x0452, B:117:0x045a, B:118:0x0463, B:120:0x046d, B:123:0x047b, B:124:0x047e, B:134:0x0460, B:135:0x0379, B:136:0x0256, B:142:0x0504, B:145:0x0107, B:147:0x010d), top: B:9:0x0046 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] zza(zzbl zzblVar, String str) {
        zzpo zzpoVar;
        List<zzpo> list;
        int i;
        zzbh zzd;
        zzgf.zzj.zzb zzbVar;
        Bundle bundle;
        zzh zzhVar;
        zzgf.zzk.zza zzaVar;
        byte[] bArr;
        zzbh zza;
        long j;
        zzgf.zzf.zza zza2;
        Iterator<String> it;
        zzgf.zzk.zza zzaVar2;
        long zzs;
        long zzu;
        String zzal;
        zzv();
        this.zzu.zzaa();
        Preconditions.checkNotNull(zzblVar);
        Preconditions.checkNotEmpty(str);
        if (!"_iap".equals(zzblVar.zza) && !"_iapx".equals(zzblVar.zza)) {
            zzj().zzc().zza("Generating a payload for this event is not available. package_name, event_name", str, zzblVar.zza);
            return null;
        }
        zzgf.zzj.zzb zzb = zzgf.zzj.zzb();
        zzh().zzq();
        try {
            zzh zzd2 = zzh().zzd(str);
            if (zzd2 == null) {
                zzj().zzc().zza("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!zzd2.zzar()) {
                zzj().zzc().zza("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            zzgf.zzk.zza zzp = zzgf.zzk.zzx().zzh(1).zzp("android");
            if (!TextUtils.isEmpty(zzd2.zzac())) {
                zzp.zzb(zzd2.zzac());
            }
            if (!TextUtils.isEmpty(zzd2.zzae())) {
                zzp.zzd((String) Preconditions.checkNotNull(zzd2.zzae()));
            }
            if (!TextUtils.isEmpty(zzd2.zzaf())) {
                zzp.zze((String) Preconditions.checkNotNull(zzd2.zzaf()));
            }
            if (zzd2.zze() != -2147483648L) {
                zzp.zze((int) zzd2.zze());
            }
            zzp.zzg(zzd2.zzq()).zze(zzd2.zzo());
            String zzah = zzd2.zzah();
            String zzaa = zzd2.zzaa();
            if (!TextUtils.isEmpty(zzah)) {
                zzp.zzm(zzah);
            } else if (!TextUtils.isEmpty(zzaa)) {
                zzp.zza(zzaa);
            }
            zzp.zzk(zzd2.zzw());
            zzjj zzb2 = this.zzg.zzb(str);
            zzp.zzd(zzd2.zzn());
            if (this.zzu.zzae() && zze().zzj(zzp.zzu()) && zzb2.zzg() && !TextUtils.isEmpty(null)) {
                zzp.zzj((String) null);
            }
            zzp.zzg(zzb2.zze());
            if (zzb2.zzg() && zzd2.zzaq()) {
                Pair<String, Boolean> zza3 = zzo().zza(zzd2.zzac(), zzb2);
                if (zzd2.zzaq() && zza3 != null && !TextUtils.isEmpty((CharSequence) zza3.first)) {
                    zzp.zzq(zza((String) zza3.first, Long.toString(zzblVar.zzd)));
                    if (zza3.second != null) {
                        zzp.zzc(((Boolean) zza3.second).booleanValue());
                    }
                }
            }
            zzf().zzad();
            zzgf.zzk.zza zzi = zzp.zzi(Build.MODEL);
            zzf().zzad();
            zzi.zzo(Build.VERSION.RELEASE).zzj((int) zzf().zzc()).zzs(zzf().zzg());
            if (zzb2.zzh() && zzd2.zzad() != null) {
                zzp.zzc(zza((String) Preconditions.checkNotNull(zzd2.zzad()), Long.toString(zzblVar.zzd)));
            }
            if (!TextUtils.isEmpty(zzd2.zzag())) {
                zzp.zzl((String) Preconditions.checkNotNull(zzd2.zzag()));
            }
            String zzac = zzd2.zzac();
            List<zzpo> zzk = zzh().zzk(zzac);
            Iterator<zzpo> it2 = zzk.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    zzpoVar = null;
                    break;
                }
                zzpoVar = it2.next();
                if ("_lte".equals(zzpoVar.zzc)) {
                    break;
                }
            }
            try {
                if (zzpoVar != null && zzpoVar.zze != null) {
                    list = zzk;
                    zzgf.zzp[] zzpVarArr = new zzgf.zzp[list.size()];
                    for (i = 0; i < list.size(); i++) {
                        zzgf.zzp.zza zzb3 = zzgf.zzp.zze().zza(list.get(i).zzc).zzb(list.get(i).zzd);
                        h_().zza(zzb3, list.get(i).zze);
                        zzpVarArr[i] = (zzgf.zzp) ((com.google.android.gms.internal.measurement.zzkg) zzb3.zzaj());
                    }
                    zzp.zze(Arrays.asList(zzpVarArr));
                    this.zzg.zza(zzd2, zzp);
                    this.zzg.zzb(zzd2, zzp);
                    zzgs zza4 = zzgs.zza(zzblVar);
                    zzs().zza(zza4.zzc, zzh().zzc(str));
                    zzs().zza(zza4, zze().zzb(str));
                    Bundle bundle2 = zza4.zzc;
                    bundle2.putLong("_c", 1L);
                    zzj().zzc().zza("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1L);
                    bundle2.putString("_o", zzblVar.zzc);
                    if (zzs().zzd(zzp.zzu(), zzd2.zzam())) {
                        zzs().zza(bundle2, "_dbg", (Object) 1L);
                        zzs().zza(bundle2, "_r", (Object) 1L);
                    }
                    zzd = zzh().zzd(str, zzblVar.zza);
                    if (zzd != null) {
                        zzhVar = zzd2;
                        bundle = bundle2;
                        zzbVar = zzb;
                        zzaVar = zzp;
                        bArr = null;
                        zza = new zzbh(str, zzblVar.zza, 0L, 0L, zzblVar.zzd, 0L, null, null, null, null);
                        j = 0;
                    } else {
                        zzbVar = zzb;
                        bundle = bundle2;
                        zzhVar = zzd2;
                        zzaVar = zzp;
                        bArr = null;
                        long j2 = zzd.zzf;
                        zza = zzd.zza(zzblVar.zzd);
                        j = j2;
                    }
                    zzbh zzbhVar = zza;
                    zzh().zza(zzbhVar);
                    zzbe zzbeVar = new zzbe(this.zzu, zzblVar.zzc, str, zzblVar.zza, zzblVar.zzd, j, bundle);
                    zza2 = zzgf.zzf.zze().zzb(zzbeVar.zzd).zza(zzbeVar.zzb).zza(zzbeVar.zze);
                    it = zzbeVar.zzf.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        zzgf.zzh.zza zza5 = zzgf.zzh.zze().zza(next);
                        Object zzc = zzbeVar.zzf.zzc(next);
                        if (zzc != null) {
                            h_().zza(zza5, zzc);
                            zza2.zza(zza5);
                        }
                    }
                    zzaVar2 = zzaVar;
                    zzaVar2.zza(zza2).zza(zzgf.zzl.zza().zza(zzgf.zzg.zza().zza(zzbhVar.zzc).zza(zzblVar.zza)));
                    zzaVar2.zza(zzg().zza(zzhVar.zzac(), Collections.emptyList(), zzaVar2.zzac(), Long.valueOf(zza2.zzc()), Long.valueOf(zza2.zzc()), false));
                    if (zza2.zzg()) {
                        zzaVar2.zzj(zza2.zzc()).zzf(zza2.zzc());
                    }
                    zzs = zzhVar.zzs();
                    if (zzs != 0) {
                        zzaVar2.zzh(zzs);
                    }
                    zzu = zzhVar.zzu();
                    if (zzu == 0) {
                        zzaVar2.zzi(zzu);
                    } else if (zzs != 0) {
                        zzaVar2.zzi(zzs);
                    }
                    zzal = zzhVar.zzal();
                    if (com.google.android.gms.internal.measurement.zzpf.zza() && zze().zze(str, zzbn.zzcg) && zzal != null) {
                        zzaVar2.zzr(zzal);
                    }
                    zzhVar.zzap();
                    zzaVar2.zzf((int) zzhVar.zzt()).zzm(114010L).zzl(zzb().currentTimeMillis()).zzd(Boolean.TRUE.booleanValue());
                    this.zzg.zza(zzaVar2.zzu(), zzaVar2);
                    zzgf.zzj.zzb zzbVar2 = zzbVar;
                    zzbVar2.zza(zzaVar2);
                    zzh zzhVar2 = zzhVar;
                    zzhVar2.zzr(zzaVar2.zzf());
                    zzhVar2.zzp(zzaVar2.zze());
                    zzh().zza(zzhVar2, false, false);
                    zzh().zzx();
                    return h_().zzb(((zzgf.zzj) ((com.google.android.gms.internal.measurement.zzkg) zzbVar2.zzaj())).zzce());
                }
                return h_().zzb(((zzgf.zzj) ((com.google.android.gms.internal.measurement.zzkg) zzbVar2.zzaj())).zzce());
            } catch (IOException e) {
                zzj().zzg().zza("Data loss. Failed to bundle and serialize. appId", zzgo.zza(str), e);
                return bArr;
            }
            list = zzk;
            zzpo zzpoVar2 = new zzpo(zzac, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lte", zzb().currentTimeMillis(), 0L);
            list.add(zzpoVar2);
            zzh().zza(zzpoVar2);
            zzgf.zzp[] zzpVarArr2 = new zzgf.zzp[list.size()];
            while (i < list.size()) {
            }
            zzp.zze(Arrays.asList(zzpVarArr2));
            this.zzg.zza(zzd2, zzp);
            this.zzg.zzb(zzd2, zzp);
            zzgs zza42 = zzgs.zza(zzblVar);
            zzs().zza(zza42.zzc, zzh().zzc(str));
            zzs().zza(zza42, zze().zzb(str));
            Bundle bundle22 = zza42.zzc;
            bundle22.putLong("_c", 1L);
            zzj().zzc().zza("Marking in-app purchase as real-time");
            bundle22.putLong("_r", 1L);
            bundle22.putString("_o", zzblVar.zzc);
            if (zzs().zzd(zzp.zzu(), zzd2.zzam())) {
            }
            zzd = zzh().zzd(str, zzblVar.zza);
            if (zzd != null) {
            }
            zzbh zzbhVar2 = zza;
            zzh().zza(zzbhVar2);
            zzbe zzbeVar2 = new zzbe(this.zzu, zzblVar.zzc, str, zzblVar.zza, zzblVar.zzd, j, bundle);
            zza2 = zzgf.zzf.zze().zzb(zzbeVar2.zzd).zza(zzbeVar2.zzb).zza(zzbeVar2.zze);
            it = zzbeVar2.zzf.iterator();
            while (it.hasNext()) {
            }
            zzaVar2 = zzaVar;
            zzaVar2.zza(zza2).zza(zzgf.zzl.zza().zza(zzgf.zzg.zza().zza(zzbhVar2.zzc).zza(zzblVar.zza)));
            zzaVar2.zza(zzg().zza(zzhVar.zzac(), Collections.emptyList(), zzaVar2.zzac(), Long.valueOf(zza2.zzc()), Long.valueOf(zza2.zzc()), false));
            if (zza2.zzg()) {
            }
            zzs = zzhVar.zzs();
            if (zzs != 0) {
            }
            zzu = zzhVar.zzu();
            if (zzu == 0) {
            }
            zzal = zzhVar.zzal();
            if (com.google.android.gms.internal.measurement.zzpf.zza()) {
                zzaVar2.zzr(zzal);
            }
            zzhVar.zzap();
            zzaVar2.zzf((int) zzhVar.zzt()).zzm(114010L).zzl(zzb().currentTimeMillis()).zzd(Boolean.TRUE.booleanValue());
            this.zzg.zza(zzaVar2.zzu(), zzaVar2);
            zzgf.zzj.zzb zzbVar22 = zzbVar;
            zzbVar22.zza(zzaVar2);
            zzh zzhVar22 = zzhVar;
            zzhVar22.zzr(zzaVar2.zzf());
            zzhVar22.zzp(zzaVar2.zze());
            zzh().zza(zzhVar22, false, false);
            zzh().zzx();
        } catch (SecurityException e2) {
            zzj().zzc().zza("app instance id encryption failed", e2.getMessage());
            return new byte[0];
        } catch (SecurityException e3) {
            zzj().zzc().zza("Resettable device id encryption failed", e3.getMessage());
            return new byte[0];
        } finally {
            zzh().zzr();
        }
    }
}
