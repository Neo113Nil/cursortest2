package kotlin.text;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class Regex$findAll$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.text.MatchResult, kotlin.text.MatchResult> {
    public static final kotlin.text.Regex$findAll$2 Camera2StreamConfigurationMap = new kotlin.text.Regex$findAll$2();

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public final kotlin.text.MatchResult invoke(kotlin.text.MatchResult matchResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(matchResult, "");
        return matchResult.next();
    }

    Regex$findAll$2() {
        super(1, kotlin.text.MatchResult.class, io.ktor.http.LinkHeader.Rel.Next, "next()Lkotlin/text/MatchResult;", 0);
    }
}
