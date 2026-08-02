package com.benasher44.uuid;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001a\u0006*\u00020\u000e0\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u000f\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/benasher44/uuid/JvmHasher;", "Lcom/benasher44/uuid/UuidHasher;", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;I)V", "", org.bouncycastle.cms.CMSAttributeTableGenerator.DIGEST, "()[B", "", "update", "([B)V", "Ljava/security/MessageDigest;", "getHighSpeedVideoFpsRanges", "Ljava/security/MessageDigest;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getVersion", "()I"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class JvmHasher implements com.benasher44.uuid.UuidHasher {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.security.MessageDigest getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    public JvmHasher(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoFpsRangesFor = java.security.MessageDigest.getInstance(str);
    }

    @Override // com.benasher44.uuid.UuidHasher
    /* renamed from: getVersion, reason: from getter */
    public final int getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.benasher44.uuid.UuidHasher
    public final void update(byte[] p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoFpsRangesFor.update(p0);
    }

    @Override // com.benasher44.uuid.UuidHasher
    public final byte[] digest() {
        byte[] digest = this.getHighSpeedVideoFpsRangesFor.digest();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(digest, "");
        return digest;
    }
}
