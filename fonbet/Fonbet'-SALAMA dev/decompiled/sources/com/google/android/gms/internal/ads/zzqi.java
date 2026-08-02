package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* loaded from: classes.dex */
final class zzqi {
    public static void zza(AudioTrack audioTrack, zzoz zzozVar) {
        audioTrack.setPreferredDevice(zzozVar == null ? null : zzozVar.zza);
    }
}
