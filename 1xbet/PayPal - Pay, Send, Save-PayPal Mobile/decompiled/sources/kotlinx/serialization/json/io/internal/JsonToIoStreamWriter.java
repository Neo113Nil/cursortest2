package kotlinx.serialization.json.io.internal;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lkotlinx/serialization/json/io/internal/JsonToIoStreamWriter;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "Lkotlinx/io/Sink;", "sink", "<init>", "(Lkotlinx/io/Sink;)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "writeLong", "(J)V", "", "char", "writeChar", "(C)V", "", "text", "write", "(Ljava/lang/String;)V", "writeQuoted", "release", "()V", "getHighSpeedVideoSizes", "Lkotlinx/io/Sink;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class JsonToIoStreamWriter implements kotlinx.serialization.json.internal.InternalJsonWriter {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.io.Sink getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public final void release() {
    }

    public JsonToIoStreamWriter(kotlinx.io.Sink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        this.getHighResolutionOutputSizeshNQ4ISI = sink;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public final void writeLong(long value) {
        write(java.lang.String.valueOf(value));
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public final void writeChar(char r2) {
        kotlinx.io.Utf8Kt.writeCodePointValue(this.getHighResolutionOutputSizeshNQ4ISI, r2);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public final void write(java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlinx.io.Utf8Kt.writeString$default(this.getHighResolutionOutputSizeshNQ4ISI, text, 0, 0, 6, (java.lang.Object) null);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public final void writeQuoted(java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlinx.io.Utf8Kt.writeCodePointValue(this.getHighResolutionOutputSizeshNQ4ISI, 34);
        int length = text.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = text.charAt(i2);
            if (charAt < kotlinx.serialization.json.internal.StringOpsKt.getESCAPE_STRINGS().length && kotlinx.serialization.json.internal.StringOpsKt.getESCAPE_STRINGS()[charAt] != null) {
                kotlinx.io.Utf8Kt.writeString(this.getHighResolutionOutputSizeshNQ4ISI, text, i, i2);
                java.lang.String str = kotlinx.serialization.json.internal.StringOpsKt.getESCAPE_STRINGS()[charAt];
                kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                kotlinx.io.Utf8Kt.writeString(this.getHighResolutionOutputSizeshNQ4ISI, str, 0, str.length());
                i = i2 + 1;
            }
        }
        kotlinx.io.Utf8Kt.writeString(this.getHighResolutionOutputSizeshNQ4ISI, text, i, text.length());
        kotlinx.io.Utf8Kt.writeCodePointValue(this.getHighResolutionOutputSizeshNQ4ISI, 34);
    }
}
