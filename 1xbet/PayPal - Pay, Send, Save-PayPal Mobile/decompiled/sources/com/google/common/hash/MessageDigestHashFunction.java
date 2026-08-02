package com.google.common.hash;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
final class MessageDigestHashFunction extends com.google.common.hash.AbstractHashFunction implements java.io.Serializable {
    private final int bytes;
    private final java.security.MessageDigest prototype;
    private final boolean supportsClone;
    private final java.lang.String toString;

    MessageDigestHashFunction(java.lang.String str, java.lang.String str2) {
        java.security.MessageDigest messageDigest = getMessageDigest(str);
        this.prototype = messageDigest;
        this.bytes = messageDigest.getDigestLength();
        this.toString = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str2);
        this.supportsClone = supportsClone(messageDigest);
    }

    MessageDigestHashFunction(java.lang.String str, int i, java.lang.String str2) {
        this.toString = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str2);
        java.security.MessageDigest messageDigest = getMessageDigest(str);
        this.prototype = messageDigest;
        int digestLength = messageDigest.getDigestLength();
        com.google.common.base.Preconditions.checkArgument(i >= 4 && i <= digestLength, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.bytes = i;
        this.supportsClone = supportsClone(messageDigest);
    }

    private static boolean supportsClone(java.security.MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (java.lang.CloneNotSupportedException unused) {
            return false;
        }
    }

    @Override // com.google.common.hash.HashFunction
    public final int bits() {
        return this.bytes * 8;
    }

    public final java.lang.String toString() {
        return this.toString;
    }

    private static java.security.MessageDigest getMessageDigest(java.lang.String str) {
        try {
            return java.security.MessageDigest.getInstance(str);
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    @Override // com.google.common.hash.HashFunction
    public final com.google.common.hash.Hasher newHasher() {
        if (this.supportsClone) {
            try {
                return new com.google.common.hash.MessageDigestHashFunction.MessageDigestHasher((java.security.MessageDigest) this.prototype.clone(), this.bytes);
            } catch (java.lang.CloneNotSupportedException unused) {
            }
        }
        return new com.google.common.hash.MessageDigestHashFunction.MessageDigestHasher(getMessageDigest(this.prototype.getAlgorithm()), this.bytes);
    }

    static final class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.String algorithmName;
        private final int bytes;
        private final java.lang.String toString;

        private SerializedForm(java.lang.String str, int i, java.lang.String str2) {
            this.algorithmName = str;
            this.bytes = i;
            this.toString = str2;
        }

        private java.lang.Object readResolve() {
            return new com.google.common.hash.MessageDigestHashFunction(this.algorithmName, this.bytes, this.toString);
        }
    }

    final java.lang.Object writeReplace() {
        return new com.google.common.hash.MessageDigestHashFunction.SerializedForm(this.prototype.getAlgorithm(), this.bytes, this.toString);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    static final class MessageDigestHasher extends com.google.common.hash.AbstractByteHasher {
        private final int bytes;
        private final java.security.MessageDigest digest;
        private boolean done;

        private MessageDigestHasher(java.security.MessageDigest messageDigest, int i) {
            this.digest = messageDigest;
            this.bytes = i;
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected final void update(byte b) {
            checkNotDone();
            this.digest.update(b);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected final void update(byte[] bArr, int i, int i2) {
            checkNotDone();
            this.digest.update(bArr, i, i2);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected final void update(java.nio.ByteBuffer byteBuffer) {
            checkNotDone();
            this.digest.update(byteBuffer);
        }

        private void checkNotDone() {
            com.google.common.base.Preconditions.checkState(!this.done, "Cannot re-use a Hasher after calling hash() on it");
        }

        @Override // com.google.common.hash.Hasher
        public final com.google.common.hash.HashCode hash() {
            checkNotDone();
            this.done = true;
            if (this.bytes == this.digest.getDigestLength()) {
                return com.google.common.hash.HashCode.fromBytesNoCopy(this.digest.digest());
            }
            return com.google.common.hash.HashCode.fromBytesNoCopy(java.util.Arrays.copyOf(this.digest.digest(), this.bytes));
        }
    }
}
