package com.google.android.gms.internal.ads;

import java.util.function.Supplier;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final /* synthetic */ class zzawk implements Supplier {
    private final /* synthetic */ int zzc;
    public static final /* synthetic */ zzawk zzb = new zzawk(1);
    static final /* synthetic */ zzawk zza = new zzawk(0);

    private /* synthetic */ zzawk(int i) {
        this.zzc = i;
    }

    @Override // java.util.function.Supplier
    public final /* synthetic */ Object get() {
        return this.zzc != 0 ? zzaxa.zza(null) : new zzawn();
    }
}
