package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes4.dex */
final class zzae extends com.google.android.gms.internal.common.zzz {
    private final com.google.android.gms.internal.common.zzah zza;

    zzae(com.google.android.gms.internal.common.zzah zzahVar, int i) {
        super(zzahVar.size(), i);
        this.zza = zzahVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    protected final java.lang.Object zza(int i) {
        return this.zza.get(i);
    }
}
