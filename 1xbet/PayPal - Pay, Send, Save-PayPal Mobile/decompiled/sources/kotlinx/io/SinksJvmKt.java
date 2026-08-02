package kotlinx.io;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0013\u001a\u00020\u0012*\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lkotlinx/io/Sink;", "", "string", "Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "", "startIndex", "endIndex", "", "writeString", "(Lkotlinx/io/Sink;Ljava/lang/String;Ljava/nio/charset/Charset;II)V", "Ljava/io/OutputStream;", "asOutputStream", "(Lkotlinx/io/Sink;)Ljava/io/OutputStream;", "Ljava/nio/ByteBuffer;", "source", "write", "(Lkotlinx/io/Sink;Ljava/nio/ByteBuffer;)I", "Ljava/nio/channels/WritableByteChannel;", "asByteChannel", "(Lkotlinx/io/Sink;)Ljava/nio/channels/WritableByteChannel;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SinksJvmKt {
    /* renamed from: $r8$lambda$WoRNFD1efPgfMbl-RRv8f8QCXy4, reason: not valid java name */
    public static /* synthetic */ boolean m24200$r8$lambda$WoRNFD1efPgfMblRRv8f8QCXy4() {
        return false;
    }

    /* renamed from: $r8$lambda$qZcPEE3sPlCIG-RI8s9tbkExJ8A, reason: not valid java name */
    public static /* synthetic */ boolean m24201$r8$lambda$qZcPEE3sPlCIGRI8s9tbkExJ8A() {
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

    public static final void writeString(kotlinx.io.Sink sink, java.lang.String str, java.nio.charset.Charset charset, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        kotlinx.io._UtilKt.checkBounds(str.length(), i, i2);
        if (kotlin.jvm.internal.Intrinsics.areEqual(charset, kotlin.text.Charsets.UTF_8)) {
            kotlinx.io.Utf8Kt.writeString(sink, str, i, i2);
            return;
        }
        java.lang.String substring = str.substring(i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        byte[] bytes = substring.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        sink.write(bytes, 0, bytes.length);
    }

    public static final java.io.OutputStream asOutputStream(final kotlinx.io.Sink sink) {
        final kotlin.jvm.internal.MutablePropertyReference0Impl mutablePropertyReference0Impl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        if (sink instanceof kotlinx.io.RealSink) {
            mutablePropertyReference0Impl = new kotlin.jvm.internal.MutablePropertyReference0Impl(sink) { // from class: kotlinx.io.SinksJvmKt$asOutputStream$isClosed$1
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public final java.lang.Object get() {
                    return java.lang.Boolean.valueOf(((kotlinx.io.RealSink) this.receiver).closed);
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                public final void set(java.lang.Object obj) {
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
                    return java.lang.Boolean.valueOf(kotlinx.io.SinksJvmKt.m24201$r8$lambda$qZcPEE3sPlCIGRI8s9tbkExJ8A());
                }
            };
        }
        return new java.io.OutputStream() { // from class: kotlinx.io.SinksJvmKt$asOutputStream$1
            @Override // java.io.OutputStream
            public final void write(int r3) {
                if (mutablePropertyReference0Impl.invoke().booleanValue()) {
                    throw new java.io.IOException("Underlying sink is closed.");
                }
                kotlinx.io.Sink sink2 = sink;
                sink2.getGetHighSpeedVideoFpsRanges().writeByte((byte) r3);
                sink2.hintEmit();
            }

            @Override // java.io.OutputStream
            public final void write(byte[] data, int offset, int byteCount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                if (mutablePropertyReference0Impl.invoke().booleanValue()) {
                    throw new java.io.IOException("Underlying sink is closed.");
                }
                kotlinx.io.Sink sink2 = sink;
                sink2.getGetHighSpeedVideoFpsRanges().write(data, offset, byteCount + offset);
                sink2.hintEmit();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() {
                if (mutablePropertyReference0Impl.invoke().booleanValue()) {
                    return;
                }
                sink.flush();
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                sink.close();
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(sink);
                sb.append(".asOutputStream()");
                return sb.toString();
            }
        };
    }

    public static final int write(kotlinx.io.Sink sink, java.nio.ByteBuffer byteBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        long sizeMut = sink.getGetHighSpeedVideoFpsRanges().getSizeMut();
        kotlinx.io.BuffersJvmKt.transferFrom(sink.getGetHighSpeedVideoFpsRanges(), byteBuffer);
        long sizeMut2 = sink.getGetHighSpeedVideoFpsRanges().getSizeMut();
        sink.hintEmit();
        return (int) (sizeMut2 - sizeMut);
    }

    public static final java.nio.channels.WritableByteChannel asByteChannel(final kotlinx.io.Sink sink) {
        final kotlin.jvm.internal.MutablePropertyReference0Impl mutablePropertyReference0Impl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        if (sink instanceof kotlinx.io.RealSink) {
            mutablePropertyReference0Impl = new kotlin.jvm.internal.MutablePropertyReference0Impl(sink) { // from class: kotlinx.io.SinksJvmKt$asByteChannel$isClosed$1
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public final java.lang.Object get() {
                    return java.lang.Boolean.valueOf(((kotlinx.io.RealSink) this.receiver).closed);
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                public final void set(java.lang.Object obj) {
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
                    return java.lang.Boolean.valueOf(kotlinx.io.SinksJvmKt.m24200$r8$lambda$WoRNFD1efPgfMblRRv8f8QCXy4());
                }
            };
        }
        return new java.nio.channels.WritableByteChannel() { // from class: kotlinx.io.SinksJvmKt$asByteChannel$1
            @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                kotlinx.io.Sink.this.close();
            }

            @Override // java.nio.channels.Channel
            public final boolean isOpen() {
                return !mutablePropertyReference0Impl.invoke().booleanValue();
            }

            @Override // java.nio.channels.WritableByteChannel
            public final int write(java.nio.ByteBuffer source) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
                if (mutablePropertyReference0Impl.invoke().booleanValue()) {
                    throw new java.lang.IllegalStateException("Underlying sink is closed.".toString());
                }
                return kotlinx.io.SinksJvmKt.write(kotlinx.io.Sink.this, source);
            }
        };
    }
}
