package kotlinx.serialization.json.io.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lkotlinx/serialization/json/io/internal/IoSerialReader;", "Lkotlinx/serialization/json/internal/InternalJsonReaderCodePointImpl;", "Lkotlinx/io/Source;", "source", "<init>", "(Lkotlinx/io/Source;)V", "", "exhausted", "()Z", "", "nextCodePoint", "()I", "getHighSpeedVideoSizes", "Lkotlinx/io/Source;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class IoSerialReader extends kotlinx.serialization.json.internal.InternalJsonReaderCodePointImpl {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.io.Source getHighSpeedVideoFpsRanges;

    public IoSerialReader(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        this.getHighSpeedVideoFpsRanges = source;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonReaderCodePointImpl
    public final boolean exhausted() {
        return this.getHighSpeedVideoFpsRanges.exhausted();
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonReaderCodePointImpl
    public final int nextCodePoint() {
        return kotlinx.io.Utf8Kt.readCodePointValue(this.getHighSpeedVideoFpsRanges);
    }
}
