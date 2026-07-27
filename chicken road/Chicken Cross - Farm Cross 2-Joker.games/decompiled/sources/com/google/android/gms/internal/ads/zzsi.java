package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public interface zzsi {
    void zzA(float f);

    void zzB();

    void zzC();

    void zzD();

    default void zzE() {
    }

    void zza(zzsf zzsfVar);

    default void zzb(zzqj zzqjVar) {
    }

    default void zzc(zzdp zzdpVar) {
    }

    boolean zzd(zzv zzvVar);

    int zze(zzv zzvVar);

    default zzqw zzf(zzv zzvVar) {
        throw null;
    }

    long zzg(boolean z);

    default void zzh(zzsb zzsbVar) throws zzsd {
        throw null;
    }

    void zzi();

    void zzj();

    boolean zzk(ByteBuffer byteBuffer, long j, int i) throws zzse, zzsh;

    void zzl() throws zzsh;

    boolean zzm();

    boolean zzn();

    void zzo(zzav zzavVar);

    zzav zzp();

    void zzq(boolean z);

    void zzr(zzd zzdVar);

    default zzql zzs() {
        throw null;
    }

    void zzt(int i);

    void zzu(zze zzeVar);

    default void zzv(AudioDeviceInfo audioDeviceInfo) {
    }

    default void zzw(int i) {
    }

    default void zzx(long j) {
    }

    long zzy();

    default void zzz(int i, int i2) {
    }
}
