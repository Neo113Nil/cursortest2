package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"", "localeFormat", "Landroidx/compose/material3/internal/DateInputFormat;", "datePatternAsInputFormat", "(Ljava/lang/String;)Landroidx/compose/material3/internal/DateInputFormat;", "", "DaysInWeek", com.visa.cbp.getEncExpo.warmup, "", "MillisecondsIn24Hours", "J"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CalendarModelKt {
    public static final int DaysInWeek = 7;
    public static final long MillisecondsIn24Hours = 86400000;

    public static final androidx.compose.material3.internal.DateInputFormat datePatternAsInputFormat(java.lang.String str) {
        java.lang.String removeSuffix = kotlin.text.StringsKt.removeSuffix(kotlin.text.StringsKt.replace$default(new kotlin.text.Regex("y{1,4}").replace(new kotlin.text.Regex("M{1,2}").replace(new kotlin.text.Regex("d{1,2}").replace(new kotlin.text.Regex("[^dMy/\\-.]").replace(str, ""), "dd"), "MM"), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_YEAR_FORMAT), "My", "M/y", false, 4, (java.lang.Object) null), (java.lang.CharSequence) ".");
        kotlin.text.MatchResult find$default = kotlin.text.Regex.find$default(new kotlin.text.Regex("[/\\-.]"), removeSuffix, 0, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNull(find$default);
        kotlin.text.MatchGroup matchGroup = find$default.getGetInputFormats().get(0);
        kotlin.jvm.internal.Intrinsics.checkNotNull(matchGroup);
        return new androidx.compose.material3.internal.DateInputFormat(removeSuffix, matchGroup.getValue().charAt(0));
    }
}
