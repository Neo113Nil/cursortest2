package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.http.SslError;

@TargetApi(14)
/* loaded from: classes.dex */
public class zzakv extends zzakt {
    @Override // com.google.android.gms.internal.ads.zzakq
    public final String zza(SslError sslError) {
        return sslError.getUrl();
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public int zzrq() {
        return 1;
    }
}
