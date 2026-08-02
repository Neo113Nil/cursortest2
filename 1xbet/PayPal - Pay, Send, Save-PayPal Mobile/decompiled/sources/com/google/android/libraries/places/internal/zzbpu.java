package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbpu implements com.google.android.libraries.places.internal.zzbpw {
    @Override // com.google.android.libraries.places.internal.zzbpx
    public final /* synthetic */ int zza(com.google.android.libraries.places.internal.zzbxo zzbxoVar, int i, java.lang.Object obj, int i2) {
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
        int limit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + i);
        zzbxoVar.zzj(byteBuffer);
        byteBuffer.limit(limit);
        return 0;
    }

    zzbpu() {
    }
}
