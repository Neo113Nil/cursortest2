package kotlinx.serialization.json.internal;

@kotlinx.serialization.json.internal.JsonFriendModuleApi
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bg\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\u0011À\u0006\u0003"}, d2 = {"Lkotlinx/serialization/json/internal/InternalJsonWriter;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "writeLong", "(J)V", "", "char", "writeChar", "(C)V", "", "text", "write", "(Ljava/lang/String;)V", "writeQuoted", "release", "()V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface InternalJsonWriter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.serialization.json.internal.InternalJsonWriter.Companion INSTANCE = kotlinx.serialization.json.internal.InternalJsonWriter.Companion.getHighSpeedVideoFpsRanges;

    void release();

    void write(java.lang.String text);

    void writeChar(char r1);

    void writeLong(long value);

    void writeQuoted(java.lang.String text);

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jh\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042K\u0010\r\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlinx/serialization/json/internal/InternalJsonWriter$Companion;", "", "<init>", "()V", "", "text", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "", "startIndex", "endIndex", "", "writeImpl", "doWriteEscaping", "(Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        static final /* synthetic */ kotlinx.serialization.json.internal.InternalJsonWriter.Companion getHighSpeedVideoFpsRanges = new kotlinx.serialization.json.internal.InternalJsonWriter.Companion();

        private Companion() {
        }

        public final void doWriteEscaping(java.lang.String text, kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> writeImpl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeImpl, "");
            int length = text.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = text.charAt(i2);
                if (charAt < kotlinx.serialization.json.internal.StringOpsKt.getESCAPE_STRINGS().length && kotlinx.serialization.json.internal.StringOpsKt.getESCAPE_STRINGS()[charAt] != null) {
                    writeImpl.invoke(text, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
                    java.lang.String str = kotlinx.serialization.json.internal.StringOpsKt.getESCAPE_STRINGS()[charAt];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                    writeImpl.invoke(str, 0, java.lang.Integer.valueOf(str.length()));
                    i = i2 + 1;
                }
            }
            writeImpl.invoke(text, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(text.length()));
        }
    }
}
