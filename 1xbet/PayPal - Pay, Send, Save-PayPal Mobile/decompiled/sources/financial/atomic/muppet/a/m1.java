package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public abstract class m1 {
    private static final kotlin.text.Regex getHighResolutionOutputSizeshNQ4ISI = new kotlin.text.Regex("(^|;)\\s*([^;=\\{\\}\\s]+)\\s*(=\\s*(\"[^\"]*\"|[^;]*))?");

    public static /* synthetic */ kotlin.Pair $r8$lambda$W2CE25Ca1EV5VzOpOAAE0lvSalY(kotlin.text.MatchResult matchResult) {
        java.lang.String str;
        java.lang.String value;
        java.lang.String str2 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(matchResult, "");
        kotlin.text.MatchGroup matchGroup = matchResult.getGetInputFormats().get(2);
        if (matchGroup == null || (str = matchGroup.getValue()) == null) {
            str = "";
        }
        kotlin.text.MatchGroup matchGroup2 = matchResult.getGetInputFormats().get(4);
        if (matchGroup2 != null && (value = matchGroup2.getValue()) != null) {
            str2 = value;
        }
        return kotlin.TuplesKt.to(str, str2);
    }
}
