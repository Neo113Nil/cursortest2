package kotlinx.io;

/* compiled from: SinksJvm.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\u0002\u001a\u0012\u0010\f\u001a\u00020\b*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e\u001a\n\u0010\u000f\u001a\u00020\u0010*\u00020\u0002¨\u0006\u0011"}, d2 = {"writeString", "", "Lkotlinx/io/Sink;", "string", "", "charset", "Ljava/nio/charset/Charset;", "startIndex", "", "endIndex", "asOutputStream", "Ljava/io/OutputStream;", "write", "source", "Ljava/nio/ByteBuffer;", "asByteChannel", "Ljava/nio/channels/WritableByteChannel;", "kotlinx-io-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SinksJvmKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asByteChannel$lambda$1() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asOutputStream$lambda$0() {
        return false;
    }

    public static /* synthetic */ void writeString$default(kotlinx.io.Sink sink, java.lang.String str, java.nio.charset.Charset charset, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = str.length();
        }
        writeString(sink, str, charset, i, i2);
    }

    public static final void writeString(kotlinx.io.Sink sink, java.lang.String string, java.nio.charset.Charset charset, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlinx.io._UtilKt.checkBounds(string.length(), i, i2);
        if (kotlin.jvm.internal.Intrinsics.areEqual(charset, kotlin.text.Charsets.UTF_8)) {
            kotlinx.io.Utf8Kt.writeString(sink, string, i, i2);
            return;
        }
        java.lang.String substring = string.substring(i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        byte[] bytes = substring.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        sink.write(bytes, 0, bytes.length);
    }

    public static final java.io.OutputStream asOutputStream(final kotlinx.io.Sink sink) {
        final kotlin.jvm.internal.MutablePropertyReference0Impl mutablePropertyReference0Impl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "<this>");
        if (sink instanceof kotlinx.io.RealSink) {
            mutablePropertyReference0Impl = new kotlin.jvm.internal.MutablePropertyReference0Impl(sink) { // from class: kotlinx.io.SinksJvmKt$asOutputStream$isClosed$1
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public java.lang.Object get() {
                    return java.lang.Boolean.valueOf(((kotlinx.io.RealSink) this.receiver).closed);
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                public void set(java.lang.Object obj) {
                    ((kotlinx.io.RealSink) this.receiver).closed = ((java.lang.Boolean) obj).booleanValue();
                }
            };
        } else {
            if (!(sink instanceof kotlinx.io.Buffer)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            mutablePropertyReference0Impl = new kotlin.jvm.functions.Function0() { // from class: kotlinx.io.SinksJvmKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    boolean asOutputStream$lambda$0;
                    asOutputStream$lambda$0 = kotlinx.io.SinksJvmKt.asOutputStream$lambda$0();
                    return java.lang.Boolean.valueOf(asOutputStream$lambda$0);
                }
            };
        }
        return new java.io.OutputStream() { // from class: kotlinx.io.SinksJvmKt$asOutputStream$1
            @Override // java.io.OutputStream
            public void write(int r3) {
                if (mutablePropertyReference0Impl.invoke().booleanValue()) {
                    throw new java.io.IOException("Underlying sink is closed.");
                }
                kotlinx.io.Sink sink2 = sink;
                sink2.getBufferField().writeByte((byte) r3);
                sink2.hintEmit();
            }

            @Override // java.io.OutputStream
            public void write(byte[] data, int offset, int byteCount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                if (mutablePropertyReference0Impl.invoke().booleanValue()) {
                    throw new java.io.IOException("Underlying sink is closed.");
                }
                kotlinx.io.Sink sink2 = sink;
                sink2.getBufferField().write(data, offset, byteCount + offset);
                sink2.hintEmit();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
                if (mutablePropertyReference0Impl.invoke().booleanValue()) {
                    return;
                }
                sink.flush();
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                sink.close();
            }

            public java.lang.String toString() {
                return sink + ".asOutputStream()";
            }
        };
    }

    public static final int write(kotlinx.io.Sink sink, java.nio.ByteBuffer source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        long sizeMut = sink.getBufferField().getSizeMut();
        kotlinx.io.BuffersJvmKt.transferFrom(sink.getBufferField(), source);
        long sizeMut2 = sink.getBufferField().getSizeMut() - sizeMut;
        sink.hintEmit();
        return (int) sizeMut2;
    }

    public static final java.nio.channels.WritableByteChannel asByteChannel(final kotlinx.io.Sink sink) {
        final kotlin.jvm.internal.MutablePropertyReference0Impl mutablePropertyReference0Impl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "<this>");
        if (sink instanceof kotlinx.io.RealSink) {
            mutablePropertyReference0Impl = new kotlin.jvm.internal.MutablePropertyReference0Impl(sink) { // from class: kotlinx.io.SinksJvmKt$asByteChannel$isClosed$1
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public java.lang.Object get() {
                    return java.lang.Boolean.valueOf(((kotlinx.io.RealSink) this.receiver).closed);
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                public void set(java.lang.Object obj) {
                    ((kotlinx.io.RealSink) this.receiver).closed = ((java.lang.Boolean) obj).booleanValue();
                }
            };
        } else {
            if (!(sink instanceof kotlinx.io.Buffer)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            mutablePropertyReference0Impl = new kotlin.jvm.functions.Function0() { // from class: kotlinx.io.SinksJvmKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    boolean asByteChannel$lambda$1;
                    asByteChannel$lambda$1 = kotlinx.io.SinksJvmKt.asByteChannel$lambda$1();
                    return java.lang.Boolean.valueOf(asByteChannel$lambda$1);
                }
            };
        }
        return new java.nio.channels.WritableByteChannel() { // from class: kotlinx.io.SinksJvmKt$asByteChannel$1
            @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                kotlinx.io.Sink.this.close();
            }

            @Override // java.nio.channels.Channel
            public boolean isOpen() {
                return !mutablePropertyReference0Impl.invoke().booleanValue();
            }

            @Override // java.nio.channels.WritableByteChannel
            public int write(java.nio.ByteBuffer source) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
                if (!(!mutablePropertyReference0Impl.invoke().booleanValue())) {
                    throw new java.lang.IllegalStateException("Underlying sink is closed.".toString());
                }
                return kotlinx.io.SinksJvmKt.write(kotlinx.io.Sink.this, source);
            }
        };
    }
}
