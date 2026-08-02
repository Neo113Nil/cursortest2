package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import e1.k;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class zzdt {
    public static void zza(MediaFormat mediaFormat, String str, int i7) {
        if (i7 != -1) {
            mediaFormat.setInteger(str, i7);
        }
    }

    public static void zzb(MediaFormat mediaFormat, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            mediaFormat.setByteBuffer(k.d(i7, "csd-"), ByteBuffer.wrap((byte[]) list.get(i7)));
        }
    }
}
