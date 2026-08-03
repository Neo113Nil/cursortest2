package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public class zzo extends com.google.android.gms.common.data.DataBufferRef {
    public zzo(com.google.android.gms.common.data.DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    protected final java.lang.String zzj(java.lang.String str, java.lang.String str2) {
        if (!hasColumn(str) || hasNull(str)) {
            return null;
        }
        return getString(str);
    }

    protected final int zzq(java.lang.String str, int i) {
        return (!hasColumn(str) || hasNull(str)) ? i : getInteger(str);
    }
}
