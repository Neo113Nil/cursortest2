package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001b\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lkotlin/text/RegexOption;", "Lkotlin/text/FlagEnum;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;III)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue", "()I", com.daon.sdk.face.license.License.FEATURE_MASK, "getMask", "IGNORE_CASE", "MULTILINE", "LITERAL", "UNIX_LINES", "COMMENTS", "DOT_MATCHES_ALL", "CANON_EQ"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RegexOption implements kotlin.text.FlagEnum {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlin.text.RegexOption[] $VALUES;
    public static final kotlin.text.RegexOption CANON_EQ;
    public static final kotlin.text.RegexOption COMMENTS;
    public static final kotlin.text.RegexOption DOT_MATCHES_ALL;
    public static final kotlin.text.RegexOption IGNORE_CASE;
    public static final kotlin.text.RegexOption LITERAL;
    public static final kotlin.text.RegexOption MULTILINE;
    public static final kotlin.text.RegexOption UNIX_LINES;
    private final int mask;
    private final int value;

    private RegexOption(java.lang.String str, int i, int i2, int i3) {
        this.value = i2;
        this.mask = i3;
    }

    /* synthetic */ RegexOption(java.lang.String str, int i, int i2, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i4 & 2) != 0 ? i2 : i3);
    }

    @Override // kotlin.text.FlagEnum
    public final int getMask() {
        return this.mask;
    }

    @Override // kotlin.text.FlagEnum
    public final int getValue() {
        return this.value;
    }

    static {
        kotlin.text.RegexOption regexOption = new kotlin.text.RegexOption("IGNORE_CASE", 0, 2, 0, 2, null);
        IGNORE_CASE = regexOption;
        int i = 0;
        int i2 = 2;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        kotlin.text.RegexOption regexOption2 = new kotlin.text.RegexOption("MULTILINE", 1, 8, i, i2, defaultConstructorMarker);
        MULTILINE = regexOption2;
        int i3 = 0;
        int i4 = 2;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker2 = null;
        kotlin.text.RegexOption regexOption3 = new kotlin.text.RegexOption("LITERAL", 2, 16, i3, i4, defaultConstructorMarker2);
        LITERAL = regexOption3;
        kotlin.text.RegexOption regexOption4 = new kotlin.text.RegexOption("UNIX_LINES", 3, 1, i, i2, defaultConstructorMarker);
        UNIX_LINES = regexOption4;
        kotlin.text.RegexOption regexOption5 = new kotlin.text.RegexOption("COMMENTS", 4, 4, i3, i4, defaultConstructorMarker2);
        COMMENTS = regexOption5;
        kotlin.text.RegexOption regexOption6 = new kotlin.text.RegexOption("DOT_MATCHES_ALL", 5, 32, i, i2, defaultConstructorMarker);
        DOT_MATCHES_ALL = regexOption6;
        kotlin.text.RegexOption regexOption7 = new kotlin.text.RegexOption("CANON_EQ", 6, 128, i3, i4, defaultConstructorMarker2);
        CANON_EQ = regexOption7;
        kotlin.text.RegexOption[] regexOptionArr = {regexOption, regexOption2, regexOption3, regexOption4, regexOption5, regexOption6, regexOption7};
        $VALUES = regexOptionArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(regexOptionArr);
    }

    public static kotlin.text.RegexOption[] values() {
        return (kotlin.text.RegexOption[]) $VALUES.clone();
    }

    public static kotlin.text.RegexOption valueOf(java.lang.String str) {
        return (kotlin.text.RegexOption) java.lang.Enum.valueOf(kotlin.text.RegexOption.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlin.text.RegexOption> getEntries() {
        return $ENTRIES;
    }
}
