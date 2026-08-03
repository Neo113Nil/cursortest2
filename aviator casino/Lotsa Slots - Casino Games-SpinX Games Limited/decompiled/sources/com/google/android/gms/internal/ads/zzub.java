package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzub {
    private static final com.google.android.gms.internal.ads.zzgwm zza = com.google.android.gms.internal.ads.zzgwm.zzj(12);

    /* JADX WARN: Code restructure failed: missing block: B:116:0x017a, code lost:
    
        if (r0.isEmpty() != false) goto L111;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.internal.ads.zzgwm zza(android.media.AudioDeviceInfo audioDeviceInfo) {
        int type;
        com.google.android.gms.internal.ads.zzgwm zzb;
        int speakerLayoutChannelMask;
        if (!com.google.android.gms.internal.ads.zztu.zza(audioDeviceInfo.getType())) {
            if (audioDeviceInfo.getType() == 1) {
                return com.google.android.gms.internal.ads.zzgwm.zzj(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (android.os.Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return com.google.android.gms.internal.ads.zzgwm.zzj(java.lang.Integer.valueOf(speakerLayoutChannelMask));
                }
                com.google.android.gms.internal.ads.zzeg.zzc("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return zza;
            }
            if (android.os.Build.VERSION.SDK_INT >= 31 && audioDeviceInfo.getType() == 10) {
                zzb = zzb(audioDeviceInfo);
                if (zzb.isEmpty()) {
                    com.google.android.gms.internal.ads.zzgwm zza2 = com.google.android.gms.internal.ads.zzqq.zza(audioDeviceInfo.getAudioDescriptors());
                    if (!zza2.isEmpty()) {
                        return zza2;
                    }
                }
                return zzb;
            }
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                int type2 = audioDeviceInfo.getType();
                if (android.os.Build.VERSION.SDK_INT >= 31 && type2 == 29) {
                    zzb = zzb(audioDeviceInfo);
                    if (zzb.isEmpty()) {
                        java.util.List<android.media.AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                        if (android.os.Build.VERSION.SDK_INT >= 34) {
                            if (android.os.Build.VERSION.SDK_INT < 34 || audioDescriptors == null) {
                                zzb = com.google.android.gms.internal.ads.zzgwm.zzi();
                            } else {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                for (android.media.AudioDescriptor audioDescriptor : audioDescriptors) {
                                    if (audioDescriptor.getStandard() == 2) {
                                        byte[] descriptor = audioDescriptor.getDescriptor();
                                        int length = descriptor.length;
                                        if (length != 3) {
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(length).length() + 21);
                                            sb.append("Invalid SADB length: ");
                                            sb.append(length);
                                            com.google.android.gms.internal.ads.zzeg.zzc("AudioDescriptorUtil", sb.toString());
                                        } else {
                                            if (android.os.Build.VERSION.SDK_INT >= 34) {
                                                byte b = descriptor[0];
                                                r8 = 1 == (b & 1) ? 12 : 0;
                                                if ((b & 2) != 0) {
                                                    r8 |= 32;
                                                }
                                                if ((b & 4) != 0) {
                                                    r8 |= 16;
                                                }
                                                if ((b & 8) != 0) {
                                                    r8 |= 192;
                                                }
                                                if ((b & com.google.common.base.Ascii.DLE) != 0) {
                                                    r8 |= 1024;
                                                }
                                                if ((b & 32) != 0) {
                                                    r8 |= 768;
                                                }
                                                if ((b & 128) != 0) {
                                                    r8 |= 201326592;
                                                }
                                                byte b2 = descriptor[1];
                                                if ((b2 & 1) != 0) {
                                                    r8 |= 81920;
                                                }
                                                if ((b2 & 2) != 0) {
                                                    r8 |= 8192;
                                                }
                                                if ((b2 & 4) != 0) {
                                                    r8 |= 32768;
                                                }
                                                if ((b2 & 8) != 0) {
                                                    r8 |= 6144;
                                                }
                                                if ((b2 & com.google.common.base.Ascii.DLE) != 0) {
                                                    r8 |= 33554432;
                                                }
                                                if ((b2 & 32) != 0) {
                                                    r8 |= 262144;
                                                }
                                                if ((b2 & com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO) != 0) {
                                                    r8 |= 6144;
                                                }
                                                if ((b2 & 128) != 0) {
                                                    r8 |= 3145728;
                                                }
                                                byte b3 = descriptor[2];
                                                if ((b3 & 1) != 0) {
                                                    r8 |= 655360;
                                                }
                                                if ((b3 & 2) != 0) {
                                                    r8 = 8388608 | r8;
                                                }
                                                if ((b3 & 4) != 0) {
                                                    r8 |= 20971520;
                                                }
                                            }
                                            arrayList.add(java.lang.Integer.valueOf(r8));
                                        }
                                    }
                                }
                                arrayList.sort(com.google.android.gms.internal.ads.zzqo.zza);
                                zzb = com.google.android.gms.internal.ads.zzgwm.zzq(arrayList);
                            }
                        }
                        com.google.android.gms.internal.ads.zzgwm zza3 = com.google.android.gms.internal.ads.zzqq.zza(audioDescriptors);
                        if (!zza3.isEmpty()) {
                            return zza3;
                        }
                    }
                    return zzb;
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (android.os.Build.VERSION.SDK_INT >= 31 && type == 22))) {
                com.google.android.gms.internal.ads.zzgwm zzb2 = zzb(audioDeviceInfo);
                if (!zzb2.isEmpty()) {
                    return zzb2;
                }
            }
        }
        return zza;
    }

    private static com.google.android.gms.internal.ads.zzgwm zzb(android.media.AudioDeviceInfo audioDeviceInfo) {
        java.util.List<android.media.AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        java.util.TreeSet treeSet = new java.util.TreeSet(java.util.Comparator.comparing(com.google.android.gms.internal.ads.zzua.zza).reversed());
        for (android.media.AudioProfile audioProfile : audioProfiles) {
            if (audioProfile.getEncapsulationType() != 1 && com.google.android.gms.internal.ads.zzfl.zzD(audioProfile.getFormat())) {
                for (int i : audioProfile.getChannelMasks()) {
                    treeSet.add(java.lang.Integer.valueOf(i));
                }
            }
        }
        return com.google.android.gms.internal.ads.zzgwm.zzq(treeSet);
    }
}
