package com.google.common.hash;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
final class ChecksumHashFunction extends com.google.common.hash.AbstractHashFunction implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final int bits;
    private final com.google.common.hash.ImmutableSupplier<? extends java.util.zip.Checksum> checksumSupplier;
    private final java.lang.String toString;

    ChecksumHashFunction(com.google.common.hash.ImmutableSupplier<? extends java.util.zip.Checksum> immutableSupplier, int i, java.lang.String str) {
        this.checksumSupplier = (com.google.common.hash.ImmutableSupplier) com.google.common.base.Preconditions.checkNotNull(immutableSupplier);
        com.google.common.base.Preconditions.checkArgument(i == 32 || i == 64, "bits (%s) must be either 32 or 64", i);
        this.bits = i;
        this.toString = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str);
    }

    @Override // com.google.common.hash.HashFunction
    public final int bits() {
        return this.bits;
    }

    @Override // com.google.common.hash.HashFunction
    public final com.google.common.hash.Hasher newHasher() {
        return new com.google.common.hash.ChecksumHashFunction.ChecksumHasher(this.checksumSupplier.get());
    }

    public final java.lang.String toString() {
        return this.toString;
    }

    final class ChecksumHasher extends com.google.common.hash.AbstractByteHasher {
        private final java.util.zip.Checksum checksum;

        private ChecksumHasher(java.util.zip.Checksum checksum) {
            this.checksum = (java.util.zip.Checksum) com.google.common.base.Preconditions.checkNotNull(checksum);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected final void update(byte b) {
            this.checksum.update(b);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected final void update(byte[] bArr, int i, int i2) {
            this.checksum.update(bArr, i, i2);
        }

        @Override // com.google.common.hash.Hasher
        public final com.google.common.hash.HashCode hash() {
            long value = this.checksum.getValue();
            if (com.google.common.hash.ChecksumHashFunction.this.bits == 32) {
                return com.google.common.hash.HashCode.fromInt((int) value);
            }
            return com.google.common.hash.HashCode.fromLong(value);
        }
    }
}
