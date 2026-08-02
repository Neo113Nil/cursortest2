package androidx.compose.runtime.tooling;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0003J\u000e\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003J\u0006\u0010\u001a\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0003J\u0010\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\tJ\u0006\u0010\u001e\u001a\u00020\u0011J\u0006\u0010\u001f\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006 "}, d2 = {"Landroidx/compose/runtime/tooling/SourceInfoParserState;", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "i", "", "getI", "()I", "setI", "(I)V", "expect", "", "char", "", "throwParseError", "", "message", "matches", "", "takeIntUntil", "separator", "takeUntil", "takeUntilEnd", "skipUntil", "advance", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "current", "atEnd", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SourceInfoParserState {
    private final java.lang.String Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRanges;

    public SourceInfoParserState(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    /* renamed from: getHighSpeedVideoSizes, reason: from getter */
    public final java.lang.String getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
    public final int getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final void Camera2StreamConfigurationMap() {
        if (getHighSpeedVideoFpsRanges(')')) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI("expected )");
        throw new kotlin.KotlinNothingValueException();
    }

    public final java.lang.Void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        int min = java.lang.Math.min(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap.length());
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Error while parsing source information: ");
        sb.append(str);
        sb.append(" at ");
        java.lang.String substring = this.Camera2StreamConfigurationMap.substring(0, min);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        sb.append(substring);
        sb.append('|');
        java.lang.String substring2 = this.Camera2StreamConfigurationMap.substring(min);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
        sb.append(substring2);
        throw new androidx.compose.runtime.tooling.ParseException(sb.toString());
    }

    public final boolean getHighSpeedVideoFpsRanges(char c) {
        return this.getHighSpeedVideoFpsRanges < this.Camera2StreamConfigurationMap.length() && this.Camera2StreamConfigurationMap.charAt(this.getHighSpeedVideoFpsRanges) == c;
    }

    public final int getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(getHighSpeedVideoFpsRanges(str));
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        getHighResolutionOutputSizeshNQ4ISI("expected int");
        throw new kotlin.KotlinNothingValueException();
    }

    public final java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str) {
        int i = this.getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes(str);
        int i2 = this.getHighSpeedVideoFpsRanges;
        if (i2 <= i) {
            return "";
        }
        java.lang.String substring = this.Camera2StreamConfigurationMap.substring(i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public final java.lang.String getInputFormats() {
        java.lang.String str = this.Camera2StreamConfigurationMap;
        java.lang.String substring = str.substring(this.getHighSpeedVideoFpsRanges, str.length());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    private void getHighSpeedVideoSizes(java.lang.String str) {
        while (this.getHighSpeedVideoFpsRanges < this.Camera2StreamConfigurationMap.length() && !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, this.Camera2StreamConfigurationMap.charAt(this.getHighSpeedVideoFpsRanges), false, 2, (java.lang.Object) null)) {
            this.getHighSpeedVideoFpsRanges++;
        }
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(int i) {
        this.getHighSpeedVideoFpsRanges += i;
    }

    public final char getHighSpeedVideoFpsRangesFor() {
        return this.Camera2StreamConfigurationMap.charAt(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean getHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges >= this.Camera2StreamConfigurationMap.length();
    }
}
