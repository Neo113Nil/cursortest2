package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzqh {
    public static final com.google.android.gms.internal.ads.zzqh zza;
    static final com.google.android.gms.internal.ads.zzgwp zzb;
    private static final com.google.android.gms.internal.ads.zzgwm zzc;
    private static final com.google.android.gms.internal.ads.zzgwm zzd;
    private static final com.google.android.gms.internal.ads.zzgwm zze;
    private final android.util.SparseArray zzf = new android.util.SparseArray();
    private final int zzg;
    private final com.google.android.gms.internal.ads.zzgwm zzh;
    private final com.google.android.gms.internal.ads.zzgwm zzi;

    static {
        com.google.android.gms.internal.ads.zzgwm zzj = com.google.android.gms.internal.ads.zzgwm.zzj(12);
        zzc = zzj;
        com.google.android.gms.internal.ads.zzgwm zzi = com.google.android.gms.internal.ads.zzgwm.zzi();
        zzd = zzi;
        zza = new com.google.android.gms.internal.ads.zzqh(com.google.android.gms.internal.ads.zzgwm.zzj(com.google.android.gms.internal.ads.zzqg.zza), zzj, zzi);
        zze = com.google.android.gms.internal.ads.zzgwm.zzl(2, 5, 6);
        com.google.android.gms.internal.ads.zzgwo zzgwoVar = new com.google.android.gms.internal.ads.zzgwo();
        zzgwoVar.zza(5, 6);
        zzgwoVar.zza(17, 6);
        zzgwoVar.zza(7, 6);
        zzgwoVar.zza(30, 10);
        zzgwoVar.zza(18, 6);
        zzgwoVar.zza(6, 8);
        zzgwoVar.zza(8, 8);
        zzgwoVar.zza(14, 8);
        zzb = zzgwoVar.zzc();
    }

    private zzqh(java.util.List list, java.util.List list2, java.util.List list3) {
        for (int i = 0; i < list.size(); i++) {
            com.google.android.gms.internal.ads.zzqg zzqgVar = (com.google.android.gms.internal.ads.zzqg) list.get(i);
            this.zzf.put(zzqgVar.zzb, zzqgVar);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzf.size(); i3++) {
            i2 = java.lang.Math.max(i2, ((com.google.android.gms.internal.ads.zzqg) this.zzf.valueAt(i3)).zzc);
        }
        this.zzg = i2;
        this.zzh = com.google.android.gms.internal.ads.zzgwm.zzq(list2);
        this.zzi = com.google.android.gms.internal.ads.zzgwm.zzq(list3);
    }

    static com.google.android.gms.internal.ads.zzqh zza(android.content.Context context, com.google.android.gms.internal.ads.zzd zzdVar, android.media.AudioDeviceInfo audioDeviceInfo, java.util.List list) {
        return zzb(context, context.registerReceiver(null, new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzdVar, audioDeviceInfo, list);
    }

    static com.google.android.gms.internal.ads.zzqh zzb(android.content.Context context, android.content.Intent intent, com.google.android.gms.internal.ads.zzd zzdVar, android.media.AudioDeviceInfo audioDeviceInfo, java.util.List list) {
        android.media.AudioManager zza2 = com.google.android.gms.internal.ads.zzcj.zza(context);
        if (audioDeviceInfo == null) {
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                java.util.List<android.media.AudioDeviceInfo> audioDevicesForAttributes = zza2.getAudioDevicesForAttributes(zzdVar.zza());
                if (!audioDevicesForAttributes.isEmpty()) {
                    audioDeviceInfo = audioDevicesForAttributes.get(0);
                }
            }
            audioDeviceInfo = null;
        }
        com.google.android.gms.internal.ads.zzgwm zza3 = audioDeviceInfo != null ? com.google.android.gms.internal.ads.zzub.zza(audioDeviceInfo) : zzc;
        if (android.os.Build.VERSION.SDK_INT >= 33 && (com.google.android.gms.internal.ads.zzfl.zzP(context) || com.google.android.gms.internal.ads.zzfl.zzQ(context))) {
            java.util.List<android.media.AudioProfile> directProfilesForAttributes = zza2.getDirectProfilesForAttributes(zzdVar.zza());
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(2, new java.util.HashSet(com.google.android.gms.internal.ads.zzhah.zzg(12)));
            for (int i = 0; i < directProfilesForAttributes.size(); i++) {
                android.media.AudioProfile audioProfile = directProfilesForAttributes.get(i);
                if (audioProfile.getEncapsulationType() != 1) {
                    int format = audioProfile.getFormat();
                    if (com.google.android.gms.internal.ads.zzfl.zzD(format) || zzb.containsKey(java.lang.Integer.valueOf(format))) {
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(format);
                        if (hashMap.containsKey(valueOf)) {
                            java.util.Set set = (java.util.Set) hashMap.get(valueOf);
                            set.getClass();
                            set.addAll(com.google.android.gms.internal.ads.zzhah.zzg(audioProfile.getChannelMasks()));
                        } else {
                            hashMap.put(valueOf, new java.util.HashSet(com.google.android.gms.internal.ads.zzhah.zzg(audioProfile.getChannelMasks())));
                        }
                    }
                }
            }
            int i2 = com.google.android.gms.internal.ads.zzgwm.zzd;
            com.google.android.gms.internal.ads.zzgwj zzgwjVar = new com.google.android.gms.internal.ads.zzgwj();
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                zzgwjVar.zzf(new com.google.android.gms.internal.ads.zzqg(((java.lang.Integer) entry.getKey()).intValue(), (java.util.Set) entry.getValue()));
            }
            return new com.google.android.gms.internal.ads.zzqh(zzgwjVar.zzi(), zza3, list);
        }
        for (android.media.AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo == null ? zza2.getDevices(2) : new android.media.AudioDeviceInfo[]{audioDeviceInfo}) {
            if (com.google.android.gms.internal.ads.zztu.zza(audioDeviceInfo2.getType())) {
                return new com.google.android.gms.internal.ads.zzqh(com.google.android.gms.internal.ads.zzgwm.zzj(com.google.android.gms.internal.ads.zzqg.zza), zza3, list);
            }
        }
        com.google.android.gms.internal.ads.zzgwv zzgwvVar = new com.google.android.gms.internal.ads.zzgwv();
        zzgwvVar.zzf((java.lang.Object) 2);
        if (android.os.Build.VERSION.SDK_INT >= 29 && (com.google.android.gms.internal.ads.zzfl.zzP(context) || com.google.android.gms.internal.ads.zzfl.zzQ(context))) {
            int i3 = com.google.android.gms.internal.ads.zzgwm.zzd;
            com.google.android.gms.internal.ads.zzgwj zzgwjVar2 = new com.google.android.gms.internal.ads.zzgwj();
            com.google.android.gms.internal.ads.zzgza it = zzb.keySet().iterator();
            while (it.hasNext()) {
                java.lang.Integer num = (java.lang.Integer) it.next();
                int intValue = num.intValue();
                if (android.os.Build.VERSION.SDK_INT >= com.google.android.gms.internal.ads.zzfl.zzF(intValue) && android.media.AudioTrack.isDirectPlaybackSupported(new android.media.AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), zzdVar.zza())) {
                    zzgwjVar2.zzf(num);
                }
            }
            zzgwjVar2.zzf((java.lang.Object) 2);
            zzgwvVar.zzg(zzgwjVar2.zzi());
            return new com.google.android.gms.internal.ads.zzqh(zzh(com.google.android.gms.internal.ads.zzhah.zzf(zzgwvVar.zzh()), 10), zza3, list);
        }
        android.content.ContentResolver contentResolver = context.getContentResolver();
        boolean z = android.provider.Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z || zzg()) && android.provider.Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            zzgwvVar.zzg(zze);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new com.google.android.gms.internal.ads.zzqh(zzh(com.google.android.gms.internal.ads.zzhah.zzf(zzgwvVar.zzh()), 10), zza3, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            zzgwvVar.zzg(com.google.android.gms.internal.ads.zzhah.zzg(intArrayExtra));
        }
        return new com.google.android.gms.internal.ads.zzqh(zzh(com.google.android.gms.internal.ads.zzhah.zzf(zzgwvVar.zzh()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), zza3, list);
    }

    static android.net.Uri zzc() {
        if (zzg()) {
            return android.provider.Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    private static boolean zzg() {
        return android.os.Build.MANUFACTURER.equals("Amazon") || android.os.Build.MANUFACTURER.equals("Xiaomi");
    }

    private static com.google.android.gms.internal.ads.zzgwm zzh(int[] iArr, int i) {
        int i2 = com.google.android.gms.internal.ads.zzgwm.zzd;
        com.google.android.gms.internal.ads.zzgwj zzgwjVar = new com.google.android.gms.internal.ads.zzgwj();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i3 : iArr) {
            zzgwjVar.zzf(new com.google.android.gms.internal.ads.zzqg(i3, i));
        }
        return zzgwjVar.zzi();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r1.contentEquals(r3) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzqh)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzqh zzqhVar = (com.google.android.gms.internal.ads.zzqh) obj;
        android.util.SparseArray sparseArray = this.zzf;
        android.util.SparseArray<?> sparseArray2 = zzqhVar.zzf;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        if (android.os.Build.VERSION.SDK_INT < 31) {
            int size = sparseArray.size();
            if (size == sparseArray2.size()) {
                for (int i = 0; i < size; i++) {
                    if (!java.util.Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                        break;
                    }
                }
                if (this.zzg != zzqhVar.zzg || !java.util.Objects.equals(this.zzh, zzqhVar.zzh) || !java.util.Objects.equals(this.zzi, zzqhVar.zzi)) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        int i2 = android.os.Build.VERSION.SDK_INT;
        android.util.SparseArray sparseArray = this.zzf;
        if (i2 >= 31) {
            i = sparseArray.contentHashCode();
        } else {
            int i3 = 17;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                i3 = (((i3 * 31) + sparseArray.keyAt(i4)) * 31) + java.util.Objects.hashCode(sparseArray.valueAt(i4));
            }
            i = i3;
        }
        return (((((this.zzg * 31) + i) * 31) + java.util.Objects.hashCode(this.zzh)) * 31) + java.util.Objects.hashCode(this.zzi);
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.ads.zzgwm zzgwmVar = this.zzi;
        com.google.android.gms.internal.ads.zzgwm zzgwmVar2 = this.zzh;
        java.lang.String obj = this.zzf.toString();
        java.lang.String valueOf = java.lang.String.valueOf(zzgwmVar2);
        java.lang.String valueOf2 = java.lang.String.valueOf(zzgwmVar);
        int i = this.zzg;
        int length = java.lang.String.valueOf(i).length();
        int length2 = obj.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 50 + length2 + 28 + java.lang.String.valueOf(valueOf).length() + 26 + java.lang.String.valueOf(valueOf2).length() + 1);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", audioProfiles=");
        sb.append(obj);
        sb.append(", speakerLayoutChannelMasks=");
        sb.append(valueOf);
        sb.append(", spatializerChannelMasks=");
        sb.append(valueOf2);
        sb.append(com.ironsource.X3.j.e);
        return sb.toString();
    }

    public final com.google.android.gms.internal.ads.zzgwm zzd() {
        return this.zzh;
    }

    public final com.google.android.gms.internal.ads.zzgwm zze() {
        return this.zzi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
    
        if (r7 != 5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0049, code lost:
    
        if (com.google.android.gms.internal.ads.zzfl.zza(r9.zzf, 30) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.util.Pair zzf(com.google.android.gms.internal.ads.zzv zzvVar, com.google.android.gms.internal.ads.zzd zzdVar) {
        android.util.SparseArray sparseArray;
        int zzE;
        java.lang.String str = zzvVar.zzp;
        str.getClass();
        int zzg = com.google.android.gms.internal.ads.zzas.zzg(str, zzvVar.zzk);
        if (!zzb.containsKey(java.lang.Integer.valueOf(zzg))) {
            return null;
        }
        int i = 6;
        if (zzg == 18) {
            if (com.google.android.gms.internal.ads.zzfl.zza(this.zzf, 18)) {
                zzg = 18;
            } else {
                zzg = 6;
                sparseArray = this.zzf;
                if (!com.google.android.gms.internal.ads.zzfl.zza(sparseArray, zzg)) {
                    return null;
                }
                com.google.android.gms.internal.ads.zzqg zzqgVar = (com.google.android.gms.internal.ads.zzqg) sparseArray.get(zzg);
                zzqgVar.getClass();
                int i2 = zzvVar.zzH;
                if (i2 == -1 || zzg == 18) {
                    int i3 = zzvVar.zzI;
                    if (i3 == -1) {
                        i3 = 48000;
                    }
                    i2 = zzqgVar.zzb(i3, zzdVar);
                } else if (!str.equals("audio/vnd.dts.uhd;profile=p2") || android.os.Build.VERSION.SDK_INT >= 33) {
                    if (!zzqgVar.zza(i2)) {
                        return null;
                    }
                } else if (i2 > 10) {
                    return null;
                }
                if (android.os.Build.VERSION.SDK_INT <= 28) {
                    if (i2 == 7) {
                        i = 8;
                    } else if (i2 != 3) {
                        if (i2 != 4) {
                        }
                    }
                    if (android.os.Build.VERSION.SDK_INT <= 26 && "fugu".equals(android.os.Build.DEVICE) && i == 1) {
                        i = 2;
                    }
                    zzE = com.google.android.gms.internal.ads.zzfl.zzE(i);
                    if (zzE == 0) {
                        return android.util.Pair.create(java.lang.Integer.valueOf(zzg), java.lang.Integer.valueOf(zzE));
                    }
                    return null;
                }
                i = i2;
                if (android.os.Build.VERSION.SDK_INT <= 26) {
                    i = 2;
                }
                zzE = com.google.android.gms.internal.ads.zzfl.zzE(i);
                if (zzE == 0) {
                }
            }
        }
        if (zzg == 8) {
            if (com.google.android.gms.internal.ads.zzfl.zza(this.zzf, 8)) {
                zzg = 8;
            }
            zzg = 7;
            sparseArray = this.zzf;
            if (!com.google.android.gms.internal.ads.zzfl.zza(sparseArray, zzg)) {
            }
        }
        if (zzg == 30) {
        }
        sparseArray = this.zzf;
        if (!com.google.android.gms.internal.ads.zzfl.zza(sparseArray, zzg)) {
        }
    }
}
