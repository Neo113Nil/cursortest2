package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\u0088\u0001\b\u0092\u0001\u00020\u0002"}, d2 = {"Lio/ktor/util/DigestImpl;", "Lio/ktor/util/Digest;", "Ljava/security/MessageDigest;", "p0", "getHighSpeedVideoFpsRanges", "(Ljava/security/MessageDigest;)Ljava/security/MessageDigest;", "getHighSpeedVideoSizes", "Ljava/security/MessageDigest;", "delegate"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes17.dex */
final class DigestImpl implements io.ktor.util.Digest {
    private final java.security.MessageDigest getHighSpeedVideoSizes;

    private /* synthetic */ DigestImpl(java.security.MessageDigest messageDigest) {
        this.getHighSpeedVideoSizes = messageDigest;
    }

    @Override // io.ktor.util.Digest
    public final void plusAssign(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        java.security.MessageDigest messageDigest = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        messageDigest.update(bArr);
    }

    @Override // io.ktor.util.Digest
    public final void reset() {
        this.getHighSpeedVideoSizes.reset();
    }

    @Override // io.ktor.util.Digest
    public final java.lang.Object build(kotlin.coroutines.Continuation<? super byte[]> continuation) {
        byte[] digest = this.getHighSpeedVideoSizes.digest();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(digest, "");
        return digest;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof io.ktor.util.DigestImpl) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, ((io.ktor.util.DigestImpl) obj).getHighSpeedVideoSizes);
    }

    public final int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode();
    }

    public final java.lang.String toString() {
        java.security.MessageDigest messageDigest = this.getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DigestImpl(delegate=");
        sb.append(messageDigest);
        sb.append(')');
        return sb.toString();
    }

    public static java.security.MessageDigest getHighSpeedVideoFpsRanges(java.security.MessageDigest messageDigest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageDigest, "");
        return messageDigest;
    }

    public static final /* synthetic */ io.ktor.util.DigestImpl getHighSpeedVideoFpsRangesFor(java.security.MessageDigest messageDigest) {
        return new io.ktor.util.DigestImpl(messageDigest);
    }
}
