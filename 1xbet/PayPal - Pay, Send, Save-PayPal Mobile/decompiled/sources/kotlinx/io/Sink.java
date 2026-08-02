package kotlinx.io;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000bH&¢\u0006\u0004\b\b\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0004H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u000bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H&¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0007H&¢\u0006\u0004\b!\u0010\u001fR\u001a\u0010&\u001a\u00020\"8'X¦\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001f\u001a\u0004\b#\u0010$\u0082\u0001\u0002\"'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lkotlinx/io/Sink;", "Lkotlinx/io/RawSink;", "", "source", "", "startIndex", "endIndex", "", "write", "([BII)V", "Lkotlinx/io/RawSource;", "", "transferFrom", "(Lkotlinx/io/RawSource;)J", "byteCount", "(Lkotlinx/io/RawSource;J)V", "", "byte", "writeByte", "(B)V", "", "short", "writeShort", "(S)V", com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_INT, "writeInt", "(I)V", com.adjust.sdk.Constants.LONG, "writeLong", "(J)V", "flush", "()V", "emit", "hintEmit", "Lkotlinx/io/Buffer;", "getBuffer", "()Lkotlinx/io/Buffer;", "getBuffer$annotations", "buffer", "Lkotlinx/io/RealSink;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Sink extends kotlinx.io.RawSink {
    static /* synthetic */ void getBuffer$annotations() {
    }

    void emit();

    @Override // kotlinx.io.RawSink, java.io.Flushable
    void flush();

    kotlinx.io.Buffer getBuffer();

    void hintEmit();

    long transferFrom(kotlinx.io.RawSource source);

    void write(kotlinx.io.RawSource source, long byteCount);

    void write(byte[] source, int startIndex, int endIndex);

    void writeByte(byte r1);

    void writeInt(int r1);

    void writeLong(long r1);

    void writeShort(short r1);

    static /* synthetic */ void write$default(kotlinx.io.Sink sink, byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        sink.write(bArr, i, i2);
    }
}
