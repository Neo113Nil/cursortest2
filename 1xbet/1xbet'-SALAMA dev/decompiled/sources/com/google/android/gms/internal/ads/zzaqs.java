package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class zzaqs extends zzhdn {
    public zzaqs(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzhdn
    public final void zze(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
    }
}
