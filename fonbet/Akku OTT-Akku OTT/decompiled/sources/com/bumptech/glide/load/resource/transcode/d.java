package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.x;
import com.bumptech.glide.load.i;
import com.bumptech.glide.util.a;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d implements e<com.bumptech.glide.load.resource.gif.c, byte[]> {
    @Override // com.bumptech.glide.load.resource.transcode.e
    @Nullable
    public final x<byte[]> a(@NonNull x<com.bumptech.glide.load.resource.gif.c> xVar, @NonNull i iVar) {
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = xVar.get().a.a.a.d.asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = com.bumptech.glide.util.a.a;
        a.b bVar = (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) ? null : new a.b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        if (bVar != null && bVar.a == 0 && bVar.b == bVar.c.length) {
            bArr = asReadOnlyBuffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
            asReadOnlyBuffer2.get(bArr2);
            bArr = bArr2;
        }
        return new com.bumptech.glide.load.resource.bytes.b(bArr);
    }
}
