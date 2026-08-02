package coil3.svg.internal;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lokio/BufferedSource;", "source", "Lcoil3/svg/Svg;", "parseSvg", "(Lokio/BufferedSource;)Lcoil3/svg/Svg;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ParseSvg_androidKt {
    public static final coil3.svg.Svg parseSvg(okio.BufferedSource bufferedSource) {
        return new coil3.svg.internal.AndroidSvg(com.caverock.androidsvg.SVG.getFromInputStream(bufferedSource.inputStream()));
    }
}
