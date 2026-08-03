package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public interface zznc {

    /* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
    /* renamed from: com.google.android.gms.internal.ads.zznc$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$zzv(com.google.android.gms.internal.ads.zznc _this, com.google.android.gms.internal.ads.zznb zznbVar) {
        }

        public static void $default$zzw(com.google.android.gms.internal.ads.zznc _this) {
        }

        public static boolean zzac(int i, boolean z) {
            int i2 = i & 7;
            if (i2 != 4) {
                return z && i2 == 3;
            }
            return true;
        }
    }

    java.lang.String zzU();

    int zza();

    int zzad(com.google.android.gms.internal.ads.zzv zzvVar) throws com.google.android.gms.internal.ads.zzjk;

    int zzu() throws com.google.android.gms.internal.ads.zzjk;

    void zzv(com.google.android.gms.internal.ads.zznb zznbVar);

    void zzw();
}
