package kotlin.time;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J}\u0010\u0014\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2K\u0010\u0013\u001aG\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\fH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/time/LongParser;", "", "", "p0", "", "p1", "<init>", "(JZ)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "startIndex", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "endIndex", "sign", "hasOverflow", "", com.sun.jna.Callback.METHOD_NAME, "parse", "(Ljava/lang/String;ILkotlin/jvm/functions/Function3;)J", "getHighSpeedVideoSizes", "J", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LongParser {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.time.LongParser.Companion INSTANCE = new kotlin.time.LongParser.Companion(null);
    private static final kotlin.time.LongParser iso = new kotlin.time.LongParser(4611686018427387903L, true);

    /* renamed from: default, reason: not valid java name */
    private static final kotlin.time.LongParser f61default = new kotlin.time.LongParser(Long.MAX_VALUE, false);

    private LongParser(long j, boolean z) {
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighSpeedVideoFpsRanges = j / 10;
        this.getHighSpeedVideoSizes = j % 10;
    }

    public final long parse(java.lang.String value, int startIndex, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Boolean, kotlin.Unit> callback) {
        int i;
        long j;
        char charAt;
        char charAt2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        if (this.getHighSpeedVideoFpsRangesFor) {
            char charAt3 = value.charAt(startIndex);
            if (charAt3 == '+') {
                startIndex++;
            } else if (charAt3 == '-') {
                startIndex++;
                i = -1;
                while (startIndex < value.length() && value.charAt(startIndex) == '0') {
                    startIndex++;
                }
                j = 0;
                while (startIndex < value.length() && '0' <= (charAt = value.charAt(startIndex)) && charAt < ':') {
                    int i2 = charAt - '0';
                    if (j <= this.getHighSpeedVideoFpsRanges || (j == this.getHighSpeedVideoFpsRanges && i2 > this.getHighSpeedVideoSizes)) {
                        while (startIndex < value.length() && '0' <= (charAt2 = value.charAt(startIndex)) && charAt2 < ':') {
                            startIndex++;
                        }
                        callback.invoke(java.lang.Integer.valueOf(startIndex), java.lang.Integer.valueOf(i), java.lang.Boolean.TRUE);
                        return this.Camera2StreamConfigurationMap;
                    }
                    j = i2 + (j << 3) + (j << 1);
                    startIndex++;
                }
                callback.invoke(java.lang.Integer.valueOf(startIndex), java.lang.Integer.valueOf(i), java.lang.Boolean.FALSE);
                return j;
            }
        }
        i = 1;
        while (startIndex < value.length()) {
            startIndex++;
        }
        j = 0;
        while (startIndex < value.length()) {
            int i22 = charAt - '0';
            if (j <= this.getHighSpeedVideoFpsRanges) {
            }
            while (startIndex < value.length()) {
                startIndex++;
            }
            callback.invoke(java.lang.Integer.valueOf(startIndex), java.lang.Integer.valueOf(i), java.lang.Boolean.TRUE);
            return this.Camera2StreamConfigurationMap;
        }
        callback.invoke(java.lang.Integer.valueOf(startIndex), java.lang.Integer.valueOf(i), java.lang.Boolean.FALSE);
        return j;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lkotlin/time/LongParser$Companion;", "", "<init>", "()V", "Lkotlin/time/LongParser;", "iso", "Lkotlin/time/LongParser;", "getIso", "()Lkotlin/time/LongParser;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "getDefault"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlin.time.LongParser getIso() {
            return kotlin.time.LongParser.iso;
        }

        public final kotlin.time.LongParser getDefault() {
            return kotlin.time.LongParser.f61default;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
