package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzij extends zzih {
    public final int zzc;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzij(int i, String str, IOException iOException, Map map, zzhw zzhwVar, byte[] bArr) {
        super(r10.toString(), iOException, zzhwVar, 2004, 1);
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 15);
        sb.append("Response code: ");
        sb.append(i);
        this.zzc = i;
    }
}
