package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface zzso {
    int zza();

    int zzb(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzc();

    ByteBuffer zzf(int i7);

    ByteBuffer zzg(int i7);

    void zzi();

    void zzj();

    void zzk(int i7, int i8, int i9, long j, int i10);

    void zzl(int i7, int i8, zzhd zzhdVar, long j, int i9);

    void zzm();

    void zzn(int i7, long j);

    void zzo(int i7, boolean z4);

    void zzp(Surface surface);

    void zzq(Bundle bundle);

    void zzr(int i7);

    boolean zzs(zzsn zzsnVar);
}
