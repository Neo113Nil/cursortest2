package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaut extends com.google.android.gms.internal.ads.zzimb {
    public zzaut(java.lang.String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzimb
    public final void zze(java.nio.ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
