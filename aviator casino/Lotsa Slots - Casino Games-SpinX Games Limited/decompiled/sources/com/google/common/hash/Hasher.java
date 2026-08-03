package com.google.common.hash;

@com.google.common.hash.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public interface Hasher extends com.google.common.hash.PrimitiveSink {
    com.google.common.hash.HashCode hash();

    @java.lang.Deprecated
    int hashCode();

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putBoolean(boolean b);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putByte(byte b);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putBytes(java.nio.ByteBuffer bytes);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putBytes(byte[] bytes);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putBytes(byte[] bytes, int off, int len);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putChar(char c);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putDouble(double d);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putFloat(float f);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putInt(int i);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putLong(long l);

    <T> com.google.common.hash.Hasher putObject(@com.google.common.hash.ParametricNullness T instance, com.google.common.hash.Funnel<? super T> funnel);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putShort(short s);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putString(java.lang.CharSequence charSequence, java.nio.charset.Charset charset);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putUnencodedChars(java.lang.CharSequence charSequence);

    /* renamed from: com.google.common.hash.Hasher$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }
}
