package com.google.common.hash;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
abstract class AbstractCompositeHashFunction extends com.google.common.hash.AbstractHashFunction {
    private static final long serialVersionUID = 0;
    final com.google.common.hash.HashFunction[] functions;

    abstract com.google.common.hash.HashCode makeHash(com.google.common.hash.Hasher[] hasherArr);

    AbstractCompositeHashFunction(com.google.common.hash.HashFunction... hashFunctionArr) {
        for (com.google.common.hash.HashFunction hashFunction : hashFunctionArr) {
            com.google.common.base.Preconditions.checkNotNull(hashFunction);
        }
        this.functions = hashFunctionArr;
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher() {
        int length = this.functions.length;
        com.google.common.hash.Hasher[] hasherArr = new com.google.common.hash.Hasher[length];
        for (int i = 0; i < length; i++) {
            hasherArr[i] = this.functions[i].newHasher();
        }
        return fromHashers(hasherArr);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher(int i) {
        com.google.common.base.Preconditions.checkArgument(i >= 0);
        int length = this.functions.length;
        com.google.common.hash.Hasher[] hasherArr = new com.google.common.hash.Hasher[length];
        for (int i2 = 0; i2 < length; i2++) {
            hasherArr[i2] = this.functions[i2].newHasher(i);
        }
        return fromHashers(hasherArr);
    }

    private com.google.common.hash.Hasher fromHashers(final com.google.common.hash.Hasher[] hasherArr) {
        return new com.google.common.hash.Hasher(this) { // from class: com.google.common.hash.AbstractCompositeHashFunction.1
            final /* synthetic */ com.google.common.hash.AbstractCompositeHashFunction this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putByte(byte b) {
                for (com.google.common.hash.Hasher hasher : hasherArr) {
                    hasher.putByte(b);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putBytes(byte[] bArr) {
                for (com.google.common.hash.Hasher hasher : hasherArr) {
                    hasher.putBytes(bArr);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putBytes(byte[] bArr, int i, int i2) {
                for (com.google.common.hash.Hasher hasher : hasherArr) {
                    hasher.putBytes(bArr, i, i2);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putBytes(java.nio.ByteBuffer byteBuffer) {
                int position = byteBuffer.position();
                for (com.google.common.hash.Hasher hasher : hasherArr) {
                    com.google.common.hash.Java8Compatibility.position(byteBuffer, position);
                    hasher.putBytes(byteBuffer);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putShort(short s) {
                for (com.google.common.hash.Hasher hasher : hasherArr) {
                    hasher.putShort(s);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putInt(int i) {
                for (com.google.common.hash.Hasher hasher : hasherArr) {
                    hasher.putInt(i);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putLong(long j) {
                for (com.google.common.hash.Hasher hasher : hasherArr) {
                    hasher.putLong(j);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putFloat(float f) {
                for (com.google.common.hash.Hasher hasher : hasherArr) {
                    hasher.putFloat(f);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putDouble(double d) {
                for (com.google.common.hash.Hasher hasher : hasherArr) {
                    hasher.putDouble(d);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putBoolean(boolean z) {
                for (com.google.common.hash.Hasher hasher : hasherArr) {
                    hasher.putBoolean(z);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putChar(char c) {
                for (com.google.common.hash.Hasher hasher : hasherArr) {
                    hasher.putChar(c);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putUnencodedChars(java.lang.CharSequence charSequence) {
                for (com.google.common.hash.Hasher hasher : hasherArr) {
                    hasher.putUnencodedChars(charSequence);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putString(java.lang.CharSequence charSequence, java.nio.charset.Charset charset) {
                for (com.google.common.hash.Hasher hasher : hasherArr) {
                    hasher.putString(charSequence, charset);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher
            public <T> com.google.common.hash.Hasher putObject(T t, com.google.common.hash.Funnel<? super T> funnel) {
                for (com.google.common.hash.Hasher hasher : hasherArr) {
                    hasher.putObject(t, funnel);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher
            public com.google.common.hash.HashCode hash() {
                return this.this$0.makeHash(hasherArr);
            }
        };
    }
}
