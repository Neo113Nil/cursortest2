package com.google.android.gms.internal.p000authapi;

import android.util.Base64;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-auth@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzal {
    private static final Random zzcy = new Random();

    public static String zzs() {
        byte[] bArr = new byte[16];
        zzcy.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
