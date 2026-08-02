package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001e"}, d2 = {"Lkotlinx/serialization/json/internal/JsonToStringWriter;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "writeLong", "(J)V", "", "char", "writeChar", "(C)V", "", "text", "write", "(Ljava/lang/String;)V", "writeQuoted", "release", "toString", "()Ljava/lang/String;", "", "p0", "p1", "getHighSpeedVideoSizes", "(II)I", "", "Camera2StreamConfigurationMap", "[C", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JsonToStringWriter implements kotlinx.serialization.json.internal.InternalJsonWriter {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private char[] getHighSpeedVideoFpsRangesFor = kotlinx.serialization.json.internal.CharArrayPool.INSTANCE.take();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public final void writeLong(long value) {
        write(java.lang.String.valueOf(value));
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public final void write(java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        int length = text.length();
        if (length == 0) {
            return;
        }
        getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, length);
        text.getChars(0, text.length(), this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoFpsRanges += length;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public final void writeQuoted(java.lang.String text) {
        byte b;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, text.length() + 2);
        char[] cArr = this.getHighSpeedVideoFpsRangesFor;
        int i2 = this.getHighSpeedVideoFpsRanges;
        int i3 = i2 + 1;
        cArr[i2] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        int i5 = i3;
        while (i5 < i4) {
            char c = cArr[i5];
            if (c < kotlinx.serialization.json.internal.StringOpsKt.getESCAPE_MARKERS().length && kotlinx.serialization.json.internal.StringOpsKt.getESCAPE_MARKERS()[c] != 0) {
                int length2 = text.length();
                for (int i6 = i5 - i3; i6 < length2; i6++) {
                    int highSpeedVideoSizes = getHighSpeedVideoSizes(i5, 2);
                    char charAt = text.charAt(i6);
                    if (charAt >= kotlinx.serialization.json.internal.StringOpsKt.getESCAPE_MARKERS().length || (b = kotlinx.serialization.json.internal.StringOpsKt.getESCAPE_MARKERS()[charAt]) == 0) {
                        this.getHighSpeedVideoFpsRangesFor[highSpeedVideoSizes] = charAt;
                        i5 = highSpeedVideoSizes + 1;
                    } else {
                        if (b == 1) {
                            java.lang.String str = kotlinx.serialization.json.internal.StringOpsKt.getESCAPE_STRINGS()[charAt];
                            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                            int highSpeedVideoSizes2 = getHighSpeedVideoSizes(highSpeedVideoSizes, str.length());
                            str.getChars(0, str.length(), this.getHighSpeedVideoFpsRangesFor, highSpeedVideoSizes2);
                            i = highSpeedVideoSizes2 + str.length();
                            this.getHighSpeedVideoFpsRanges = i;
                        } else {
                            char[] cArr2 = this.getHighSpeedVideoFpsRangesFor;
                            cArr2[highSpeedVideoSizes] = '\\';
                            cArr2[highSpeedVideoSizes + 1] = (char) b;
                            i = highSpeedVideoSizes + 2;
                            this.getHighSpeedVideoFpsRanges = i;
                        }
                        i5 = i;
                    }
                }
                int highSpeedVideoSizes3 = getHighSpeedVideoSizes(i5, 1);
                this.getHighSpeedVideoFpsRangesFor[highSpeedVideoSizes3] = '\"';
                this.getHighSpeedVideoFpsRanges = highSpeedVideoSizes3 + 1;
                return;
            }
            i5++;
        }
        cArr[i4] = '\"';
        this.getHighSpeedVideoFpsRanges = i4 + 1;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public final void release() {
        kotlinx.serialization.json.internal.CharArrayPool.INSTANCE.release(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String toString() {
        return new java.lang.String(this.getHighSpeedVideoFpsRangesFor, 0, this.getHighSpeedVideoFpsRanges);
    }

    @kotlin.IgnorableReturnValue
    private final int getHighSpeedVideoSizes(int p0, int p1) {
        int i = p1 + p0;
        char[] cArr = this.getHighSpeedVideoFpsRangesFor;
        if (cArr.length <= i) {
            char[] copyOf = java.util.Arrays.copyOf(cArr, kotlin.ranges.RangesKt.coerceAtLeast(i, p0 * 2));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            this.getHighSpeedVideoFpsRangesFor = copyOf;
        }
        return p0;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public final void writeChar(char r4) {
        getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, 1);
        char[] cArr = this.getHighSpeedVideoFpsRangesFor;
        int i = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = i + 1;
        cArr[i] = r4;
    }
}
