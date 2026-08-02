package coil3.svg;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class Svg$Parser$Companion$DEFAULT$1 implements coil3.svg.Svg.Parser, kotlin.jvm.internal.FunctionAdapter {
    public static final coil3.svg.Svg$Parser$Companion$DEFAULT$1 getHighSpeedVideoFpsRanges = new coil3.svg.Svg$Parser$Companion$DEFAULT$1();

    @Override // coil3.svg.Svg.Parser
    public final coil3.svg.Svg parse(okio.BufferedSource bufferedSource) {
        return coil3.svg.internal.ParseSvg_androidKt.parseSvg(bufferedSource);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final kotlin.Function<?> getFunctionDelegate() {
        return new kotlin.jvm.internal.FunctionReferenceImpl(1, coil3.svg.internal.ParseSvg_androidKt.class, "parseSvg", "parseSvg(Lokio/BufferedSource;)Lcoil3/svg/Svg;", 1);
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof coil3.svg.Svg.Parser) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    Svg$Parser$Companion$DEFAULT$1() {
    }
}
