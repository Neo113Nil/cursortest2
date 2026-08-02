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

/* loaded from: classes.dex */
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
        int i8 = 0;
        for (int i9 = 0; i9 < this.zzd.size(); i9++) {
            i8 = Math.max(i8, ((zzos) this.zzd.valueAt(i9)).zzc);
        }
        this.zze = i8;
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
        boolean isDirectPlaybackSupported;
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        List audioDevicesForAttributes;
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        if (zzozVar == null) {
            zzoz zzozVar2 = null;
            if (zzen.zza >= 33) {
                try {
                    audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(zzeVar.zza().zza);
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
            directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(zzeVar.zza().zza);
            HashMap hashMap = new HashMap();
            hashMap.put(2, new HashSet(zzfzk.zzg(12)));
            for (int i8 = 0; i8 < directProfilesForAttributes.size(); i8++) {
                AudioProfile h6 = AbstractC0348d.h(directProfilesForAttributes.get(i8));
                encapsulationType = h6.getEncapsulationType();
                if (encapsulationType != 1) {
                    format = h6.getFormat();
                    if (zzen.zzK(format) || zzb.containsKey(Integer.valueOf(format))) {
                        Integer valueOf = Integer.valueOf(format);
                        if (hashMap.containsKey(valueOf)) {
                            Set set = (Set) hashMap.get(valueOf);
                            set.getClass();
                            channelMasks2 = h6.getChannelMasks();
                            set.addAll(zzfzk.zzg(channelMasks2));
                        } else {
                            channelMasks = h6.getChannelMasks();
                            hashMap.put(valueOf, new HashSet(zzfzk.zzg(channelMasks)));
                        }
                    }
                }
            }
            int i9 = zzfwh.zzd;
            zzfwe zzfweVar = new zzfwe();
            for (Map.Entry entry : hashMap.entrySet()) {
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
        zzfwm zzi = zzfwlVar.zzi();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (zzi.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
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
                int intValue = num.intValue();
                if (zzen.zza >= zzen.zzh(intValue)) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), zzeVar.zza().zza);
                    if (isDirectPlaybackSupported) {
                        zzfweVar2.zzf(num);
                    }
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
    
        if (r1 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean contentEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzot)) {
            return false;
        }
        zzot zzotVar = (zzot) obj;
        SparseArray sparseArray = this.zzd;
        SparseArray sparseArray2 = zzotVar.zzd;
        if (zzen.zza >= 31) {
            contentEquals = sparseArray.contentEquals(sparseArray2);
        } else {
            int size = sparseArray.size();
            if (size == sparseArray2.size()) {
                for (int i7 = 0; i7 < size; i7++) {
                    if (!Objects.equals(sparseArray.valueAt(i7), sparseArray2.get(sparseArray.keyAt(i7)))) {
                        break;
                    }
                }
                if (this.zze == zzotVar.zze) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8 = zzen.zza;
        SparseArray sparseArray = this.zzd;
        if (i8 >= 31) {
            i7 = sparseArray.contentHashCode();
        } else {
            int i9 = 17;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                i9 = Objects.hashCode(sparseArray.valueAt(i10)) + ((sparseArray.keyAt(i10) + (i9 * 31)) * 31);
            }
            i7 = i9;
        }
        return (i7 * 31) + this.zze;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.zze + ", audioProfiles=" + this.zzd.toString() + "]";
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0044, code lost:
    
        if (com.google.android.gms.internal.ads.zzen.zzH(r8.zzd, 30) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair zzb(zzz zzzVar, zze zzeVar) {
        int zzi;
        String str = zzzVar.zzo;
        str.getClass();
        int zza2 = zzay.zza(str, zzzVar.zzk);
        if (!zzb.containsKey(Integer.valueOf(zza2))) {
            return null;
        }
        int i7 = 8;
        if (zza2 == 18) {
            if (zzen.zzH(this.zzd, 18)) {
                zza2 = 18;
            } else {
                zza2 = 6;
                if (!zzen.zzH(this.zzd, zza2)) {
                    return null;
                }
                zzos zzosVar = (zzos) this.zzd.get(zza2);
                zzosVar.getClass();
                int i8 = zzzVar.zzE;
                if (i8 == -1 || zza2 == 18) {
                    int i9 = zzzVar.zzF;
                    if (i9 == -1) {
                        i9 = 48000;
                    }
                    i8 = zzosVar.zza(i9, zzeVar);
                } else if (!zzzVar.zzo.equals("audio/vnd.dts.uhd;profile=p2") || zzen.zza >= 33) {
                    if (!zzosVar.zzb(i8)) {
                        return null;
                    }
                } else if (i8 > 10) {
                    return null;
                }
                int i10 = zzen.zza;
                if (i10 <= 28) {
                    if (i8 != 7) {
                        if (i8 == 3 || i8 == 4 || i8 == 5) {
                            i7 = 6;
                        }
                    }
                    if (i10 <= 26 && "fugu".equals(Build.DEVICE) && i7 == 1) {
                        i7 = 2;
                    }
                    zzi = zzen.zzi(i7);
                    if (zzi == 0) {
                        return Pair.create(Integer.valueOf(zza2), Integer.valueOf(zzi));
                    }
                    return null;
                }
                i7 = i8;
                if (i10 <= 26) {
                    i7 = 2;
                }
                zzi = zzen.zzi(i7);
                if (zzi == 0) {
                }
            }
        }
        if (zza2 == 8) {
            if (zzen.zzH(this.zzd, 8)) {
                zza2 = 8;
            }
            zza2 = 7;
            if (!zzen.zzH(this.zzd, zza2)) {
            }
        }
        if (zza2 == 30) {
        }
        if (!zzen.zzH(this.zzd, zza2)) {
        }
    }
}
