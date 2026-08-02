package kotlinx.serialization.json.internal;

@kotlinx.serialization.json.internal.JsonFriendModuleApi
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/serialization/json/internal/InternalJsonReaderCodePointImpl;", "Lkotlinx/serialization/json/internal/InternalJsonReader;", "<init>", "()V", "", "exhausted", "()Z", "", "nextCodePoint", "()I", "", "buffer", "bufferOffset", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "read", "([CII)I", "", "getHighSpeedVideoSizes", "Ljava/lang/Character;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class InternalJsonReaderCodePointImpl implements kotlinx.serialization.json.internal.InternalJsonReader {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.lang.Character getHighSpeedVideoFpsRangesFor;

    public abstract boolean exhausted();

    public abstract int nextCodePoint();

    @Override // kotlinx.serialization.json.internal.InternalJsonReader
    public final int read(char[] buffer, int bufferOffset, int count) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        java.lang.Character ch = this.getHighSpeedVideoFpsRangesFor;
        if (ch != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(ch);
            buffer[bufferOffset] = ch.charValue();
            this.getHighSpeedVideoFpsRangesFor = null;
            i = 1;
        } else {
            i = 0;
        }
        while (i < count && !exhausted()) {
            int nextCodePoint = nextCodePoint();
            if (nextCodePoint <= 65535) {
                buffer[bufferOffset + i] = (char) nextCodePoint;
                i++;
            } else {
                char c = (char) ((nextCodePoint >>> 10) + 55232);
                char c2 = (char) ((nextCodePoint & 1023) + 56320);
                buffer[bufferOffset + i] = c;
                int i2 = i + 1;
                if (i2 < count) {
                    buffer[i2 + bufferOffset] = c2;
                    i += 2;
                } else {
                    this.getHighSpeedVideoFpsRangesFor = java.lang.Character.valueOf(c2);
                    i = i2;
                }
            }
        }
        if (i > 0) {
            return i;
        }
        return -1;
    }
}
