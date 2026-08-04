package com.google.android.gms.internal.ads;

import P.AbstractC0348d;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzot {
    static final zzfwk zzb;
    private final SparseArray zzd = new SparseArray();
    private final int zze;
    public static final zzot zza = new zzot(zzfwh.zzo(zzos.zza));
    private static final zzfwh zzc = zzfwh.zzq(2, 5, 6);

    static {
        zzfwj zzfwjVar = new zzfwj();
        zzfwjVar.zza(5, 6);
        zzfwjVar.zza(17, 6);
        zzfwjVar.zza(7, 6);
        zzfwjVar.zza(30, 10);
        zzfwjVar.zza(18, 6);
        zzfwjVar.zza(6, 8);
        zzfwjVar.zza(8, 8);
        zzfwjVar.zza(14, 8);
        zzb = zzfwjVar.zzc();
    }

    private zzot(List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            zzos zzosVar = (zzos) list.get(i7);
            this.zzd.put(zzosVar.zzb, zzosVar);
        }
        int iMax = 0;
        for (int i8 = 0; i8 < this.zzd.size(); i8++) {
            iMax = Math.max(iMax, ((zzos) this.zzd.valueAt(i8)).zzc);
        }
        this.zze = iMax;
    }

    public static Uri zza() {
        if (zzf()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    public static zzot zzc(Context context, zze zzeVar, zzoz zzozVar) {
        return zzd(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzeVar, zzozVar);
    }

    public static zzot zzd(Context context, Intent intent, zze zzeVar, zzoz zzozVar) {
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        if (zzozVar == null) {
            zzoz zzozVar2 = null;
            if (zzen.zza >= 33) {
                try {
                    List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(zzeVar.zza().zza);
                    if (!audioDevicesForAttributes.isEmpty()) {
                        zzozVar2 = new zzoz((AudioDeviceInfo) audioDevicesForAttributes.get(0));
                    }
                } catch (RuntimeException unused) {
                }
            }
            zzozVar = zzozVar2;
        }
        int i7 = zzen.zza;
        if (i7 >= 33 && (zzen.zzN(context) || zzen.zzJ(context))) {
            List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(zzeVar.zza().zza);
            HashMap map = new HashMap();
            map.put(2, new HashSet(zzfzk.zzg(12)));
            for (int i8 = 0; i8 < directProfilesForAttributes.size(); i8++) {
                AudioProfile audioProfileH = AbstractC0348d.h(directProfilesForAttributes.get(i8));
                if (audioProfileH.getEncapsulationType() != 1) {
                    int format = audioProfileH.getFormat();
                    if (zzen.zzK(format) || zzb.containsKey(Integer.valueOf(format))) {
                        Integer numValueOf = Integer.valueOf(format);
                        if (map.containsKey(numValueOf)) {
                            Set set = (Set) map.get(numValueOf);
                            set.getClass();
                            set.addAll(zzfzk.zzg(audioProfileH.getChannelMasks()));
                        } else {
                            map.put(numValueOf, new HashSet(zzfzk.zzg(audioProfileH.getChannelMasks())));
                        }
                    }
                }
            }
            int i9 = zzfwh.zzd;
            zzfwe zzfweVar = new zzfwe();
            for (Map.Entry entry : map.entrySet()) {
                zzfweVar.zzf(new zzos(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new zzot(zzfweVar.zzi());
        }
        AudioDeviceInfo[] devices = zzozVar == null ? audioManager.getDevices(2) : new AudioDeviceInfo[]{zzozVar.zza};
        zzfwl zzfwlVar = new zzfwl();
        zzfwlVar.zzg(8, 7);
        if (i7 >= 31) {
            zzfwlVar.zzg(26, 27);
        }
        if (i7 >= 33) {
            zzfwlVar.zzf((Object) 30);
        }
        zzfwm zzfwmVarZzi = zzfwlVar.zzi();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (zzfwmVarZzi.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return zza;
            }
        }
        zzfwl zzfwlVar2 = new zzfwl();
        zzfwlVar2.zzf((Object) 2);
        if (zzen.zza >= 29 && (zzen.zzN(context) || zzen.zzJ(context))) {
            int i10 = zzfwh.zzd;
            zzfwe zzfweVar2 = new zzfwe();
            zzfyn it = zzb.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (zzen.zza >= zzen.zzh(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), zzeVar.zza().zza)) {
                    zzfweVar2.zzf(num);
                }
            }
            zzfweVar2.zzf((Object) 2);
            zzfwlVar2.zzh(zzfweVar2.zzi());
            return new zzot(zze(zzfzk.zzh(zzfwlVar2.zzi()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z4 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z4 || zzf()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            zzfwlVar2.zzh(zzc);
        }
        if (intent == null || z4 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new zzot(zze(zzfzk.zzh(zzfwlVar2.zzi()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            zzfwlVar2.zzh(zzfzk.zzg(intArrayExtra));
        }
        return new zzot(zze(zzfzk.zzh(zzfwlVar2.zzi()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    private static zzfwh zze(int[] iArr, int i7) {
        int i8 = zzfwh.zzd;
        zzfwe zzfweVar = new zzfwe();
        for (int i9 : iArr) {
            zzfweVar.zzf(new zzos(i9, i7));
        }
        return zzfweVar.zzi();
    }

    private static boolean zzf() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0045 A[RETURN] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzot)) {
            return false;
        }
        zzot zzotVar = (zzot) obj;
        SparseArray sparseArray = this.zzd;
        SparseArray sparseArray2 = zzotVar.zzd;
        if (zzen.zza < 31) {
            int size = sparseArray.size();
            if (size == sparseArray2.size()) {
                for (int i7 = 0; i7 < size; i7++) {
                    if (Objects.equals(sparseArray.valueAt(i7), sparseArray2.get(sparseArray.keyAt(i7)))) {
                    }
                }
                if (this.zze == zzotVar.zze) {
                    return true;
                }
            }
        } else if (sparseArray.contentEquals(sparseArray2)) {
            if (this.zze == zzotVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iContentHashCode;
        int i7 = zzen.zza;
        SparseArray sparseArray = this.zzd;
        if (i7 >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i8 = 0; i8 < sparseArray.size(); i8++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i8)) + ((sparseArray.keyAt(i8) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.zze;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.zze + ", audioProfiles=" + this.zzd.toString() + "]";
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003a A[PHI: r0
      0x003a: PHI (r0v3 int) = (r0v2 int), (r0v7 int) binds: [B:11:0x002c, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    public final Pair zzb(zzz zzzVar, zze zzeVar) {
        String str = zzzVar.zzo;
        str.getClass();
        int iZza = zzay.zza(str, zzzVar.zzk);
        if (!zzb.containsKey(Integer.valueOf(iZza))) {
            return null;
        }
        int i7 = 8;
        if (iZza != 18) {
            if (iZza != 8) {
                if (iZza == 30 && !zzen.zzH(this.zzd, 30)) {
                    iZza = 7;
                }
            } else if (zzen.zzH(this.zzd, 8)) {
                iZza = 8;
                if (iZza == 30) {
                    iZza = 7;
                }
            } else {
                iZza = 7;
            }
        } else if (zzen.zzH(this.zzd, 18)) {
            iZza = 18;
            if (iZza != 8) {
                if (iZza == 30) {
                    iZza = 7;
                }
            } else if (zzen.zzH(this.zzd, 8)) {
                iZza = 8;
                if (iZza == 30) {
                    iZza = 7;
                }
            } else {
                iZza = 7;
            }
        } else {
            iZza = 6;
        }
        if (!zzen.zzH(this.zzd, iZza)) {
            return null;
        }
        zzos zzosVar = (zzos) this.zzd.get(iZza);
        zzosVar.getClass();
        int iZza2 = zzzVar.zzE;
        if (iZza2 == -1 || iZza == 18) {
            int i8 = zzzVar.zzF;
            if (i8 == -1) {
                i8 = 48000;
            }
            iZza2 = zzosVar.zza(i8, zzeVar);
        } else if (!zzzVar.zzo.equals("audio/vnd.dts.uhd;profile=p2") || zzen.zza >= 33) {
            if (!zzosVar.zzb(iZza2)) {
                return null;
            }
        } else if (iZza2 > 10) {
            return null;
        }
        int i9 = zzen.zza;
        if (i9 > 28) {
            i7 = iZza2;
        } else if (iZza2 != 7) {
            if (iZza2 == 3 || iZza2 == 4 || iZza2 == 5) {
                i7 = 6;
            } else {
                i7 = iZza2;
            }
        }
        if (i9 <= 26 && "fugu".equals(Build.DEVICE) && i7 == 1) {
            i7 = 2;
        }
        int iZzi = zzen.zzi(i7);
        if (iZzi != 0) {
            return Pair.create(Integer.valueOf(iZza), Integer.valueOf(iZzi));
        }
        return null;
    }
}
