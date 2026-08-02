package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a/\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lio/ktor/util/HashFunction;", "", "input", "", "offset", "length", org.bouncycastle.cms.CMSAttributeTableGenerator.DIGEST, "(Lio/ktor/util/HashFunction;[BII)[B"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HashFunctionKt {
    public static final /* synthetic */ int access$leftRotate(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    public static /* synthetic */ byte[] digest$default(io.ktor.util.HashFunction hashFunction, byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return digest(hashFunction, bArr, i, i2);
    }

    public static final byte[] digest(io.ktor.util.HashFunction hashFunction, byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hashFunction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        hashFunction.update(bArr, i, i2);
        return hashFunction.digest();
    }
}
