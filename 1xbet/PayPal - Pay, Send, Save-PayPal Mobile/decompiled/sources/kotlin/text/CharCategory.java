package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b)\b\u0086\u0001\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3"}, d2 = {"Lkotlin/text/CharCategory;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "", "char", "", "contains", "(C)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "Companion", "UNASSIGNED", "UPPERCASE_LETTER", "LOWERCASE_LETTER", "TITLECASE_LETTER", "MODIFIER_LETTER", "OTHER_LETTER", "NON_SPACING_MARK", "ENCLOSING_MARK", "COMBINING_SPACING_MARK", "DECIMAL_DIGIT_NUMBER", "LETTER_NUMBER", "OTHER_NUMBER", "SPACE_SEPARATOR", "LINE_SEPARATOR", "PARAGRAPH_SEPARATOR", "CONTROL", org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT, "PRIVATE_USE", "SURROGATE", "DASH_PUNCTUATION", "START_PUNCTUATION", "END_PUNCTUATION", "CONNECTOR_PUNCTUATION", "OTHER_PUNCTUATION", "MATH_SYMBOL", "CURRENCY_SYMBOL", "MODIFIER_SYMBOL", "OTHER_SYMBOL", "INITIAL_QUOTE_PUNCTUATION", "FINAL_QUOTE_PUNCTUATION"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CharCategory {
    public static final kotlin.text.CharCategory COMBINING_SPACING_MARK;
    public static final kotlin.text.CharCategory CONNECTOR_PUNCTUATION;
    public static final kotlin.text.CharCategory CONTROL;
    public static final kotlin.text.CharCategory CURRENCY_SYMBOL;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.text.CharCategory.Companion INSTANCE;
    public static final kotlin.text.CharCategory DASH_PUNCTUATION;
    public static final kotlin.text.CharCategory DECIMAL_DIGIT_NUMBER;
    public static final kotlin.text.CharCategory ENCLOSING_MARK;
    public static final kotlin.text.CharCategory END_PUNCTUATION;
    public static final kotlin.text.CharCategory FINAL_QUOTE_PUNCTUATION;
    public static final kotlin.text.CharCategory FORMAT;
    public static final kotlin.text.CharCategory INITIAL_QUOTE_PUNCTUATION;
    public static final kotlin.text.CharCategory LETTER_NUMBER;
    public static final kotlin.text.CharCategory LINE_SEPARATOR;
    public static final kotlin.text.CharCategory LOWERCASE_LETTER;
    public static final kotlin.text.CharCategory MATH_SYMBOL;
    public static final kotlin.text.CharCategory MODIFIER_LETTER;
    public static final kotlin.text.CharCategory MODIFIER_SYMBOL;
    public static final kotlin.text.CharCategory NON_SPACING_MARK;
    public static final kotlin.text.CharCategory OTHER_LETTER;
    public static final kotlin.text.CharCategory OTHER_NUMBER;
    public static final kotlin.text.CharCategory OTHER_PUNCTUATION;
    public static final kotlin.text.CharCategory OTHER_SYMBOL;
    public static final kotlin.text.CharCategory PARAGRAPH_SEPARATOR;
    public static final kotlin.text.CharCategory PRIVATE_USE;
    public static final kotlin.text.CharCategory SPACE_SEPARATOR;
    public static final kotlin.text.CharCategory START_PUNCTUATION;
    public static final kotlin.text.CharCategory SURROGATE;
    public static final kotlin.text.CharCategory TITLECASE_LETTER;
    public static final kotlin.text.CharCategory UNASSIGNED;
    public static final kotlin.text.CharCategory UPPERCASE_LETTER;
    private static final /* synthetic */ kotlin.text.CharCategory[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final java.lang.String code;
    private final int value;

    private CharCategory(java.lang.String str, int i, int i2, java.lang.String str2) {
        this.value = i2;
        this.code = str2;
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        kotlin.text.CharCategory charCategory = new kotlin.text.CharCategory("UNASSIGNED", 0, 0, "Cn");
        UNASSIGNED = charCategory;
        kotlin.text.CharCategory charCategory2 = new kotlin.text.CharCategory("UPPERCASE_LETTER", 1, 1, "Lu");
        UPPERCASE_LETTER = charCategory2;
        kotlin.text.CharCategory charCategory3 = new kotlin.text.CharCategory("LOWERCASE_LETTER", 2, 2, "Ll");
        LOWERCASE_LETTER = charCategory3;
        kotlin.text.CharCategory charCategory4 = new kotlin.text.CharCategory("TITLECASE_LETTER", 3, 3, "Lt");
        TITLECASE_LETTER = charCategory4;
        kotlin.text.CharCategory charCategory5 = new kotlin.text.CharCategory("MODIFIER_LETTER", 4, 4, "Lm");
        MODIFIER_LETTER = charCategory5;
        kotlin.text.CharCategory charCategory6 = new kotlin.text.CharCategory("OTHER_LETTER", 5, 5, "Lo");
        OTHER_LETTER = charCategory6;
        kotlin.text.CharCategory charCategory7 = new kotlin.text.CharCategory("NON_SPACING_MARK", 6, 6, "Mn");
        NON_SPACING_MARK = charCategory7;
        kotlin.text.CharCategory charCategory8 = new kotlin.text.CharCategory("ENCLOSING_MARK", 7, 7, "Me");
        ENCLOSING_MARK = charCategory8;
        kotlin.text.CharCategory charCategory9 = new kotlin.text.CharCategory("COMBINING_SPACING_MARK", 8, 8, "Mc");
        COMBINING_SPACING_MARK = charCategory9;
        kotlin.text.CharCategory charCategory10 = new kotlin.text.CharCategory("DECIMAL_DIGIT_NUMBER", 9, 9, "Nd");
        DECIMAL_DIGIT_NUMBER = charCategory10;
        kotlin.text.CharCategory charCategory11 = new kotlin.text.CharCategory("LETTER_NUMBER", 10, 10, "Nl");
        LETTER_NUMBER = charCategory11;
        kotlin.text.CharCategory charCategory12 = new kotlin.text.CharCategory("OTHER_NUMBER", 11, 11, "No");
        OTHER_NUMBER = charCategory12;
        kotlin.text.CharCategory charCategory13 = new kotlin.text.CharCategory("SPACE_SEPARATOR", 12, 12, "Zs");
        SPACE_SEPARATOR = charCategory13;
        kotlin.text.CharCategory charCategory14 = new kotlin.text.CharCategory("LINE_SEPARATOR", 13, 13, "Zl");
        LINE_SEPARATOR = charCategory14;
        kotlin.text.CharCategory charCategory15 = new kotlin.text.CharCategory("PARAGRAPH_SEPARATOR", 14, 14, "Zp");
        PARAGRAPH_SEPARATOR = charCategory15;
        kotlin.text.CharCategory charCategory16 = new kotlin.text.CharCategory("CONTROL", 15, 15, "Cc");
        CONTROL = charCategory16;
        kotlin.text.CharCategory charCategory17 = new kotlin.text.CharCategory(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT, 16, 16, "Cf");
        FORMAT = charCategory17;
        kotlin.text.CharCategory charCategory18 = new kotlin.text.CharCategory("PRIVATE_USE", 17, 18, "Co");
        PRIVATE_USE = charCategory18;
        kotlin.text.CharCategory charCategory19 = new kotlin.text.CharCategory("SURROGATE", 18, 19, "Cs");
        SURROGATE = charCategory19;
        kotlin.text.CharCategory charCategory20 = new kotlin.text.CharCategory("DASH_PUNCTUATION", 19, 20, "Pd");
        DASH_PUNCTUATION = charCategory20;
        kotlin.text.CharCategory charCategory21 = new kotlin.text.CharCategory("START_PUNCTUATION", 20, 21, "Ps");
        START_PUNCTUATION = charCategory21;
        kotlin.text.CharCategory charCategory22 = new kotlin.text.CharCategory("END_PUNCTUATION", 21, 22, "Pe");
        END_PUNCTUATION = charCategory22;
        kotlin.text.CharCategory charCategory23 = new kotlin.text.CharCategory("CONNECTOR_PUNCTUATION", 22, 23, "Pc");
        CONNECTOR_PUNCTUATION = charCategory23;
        kotlin.text.CharCategory charCategory24 = new kotlin.text.CharCategory("OTHER_PUNCTUATION", 23, 24, "Po");
        OTHER_PUNCTUATION = charCategory24;
        kotlin.text.CharCategory charCategory25 = new kotlin.text.CharCategory("MATH_SYMBOL", 24, 25, "Sm");
        MATH_SYMBOL = charCategory25;
        kotlin.text.CharCategory charCategory26 = new kotlin.text.CharCategory("CURRENCY_SYMBOL", 25, 26, "Sc");
        CURRENCY_SYMBOL = charCategory26;
        kotlin.text.CharCategory charCategory27 = new kotlin.text.CharCategory("MODIFIER_SYMBOL", 26, 27, "Sk");
        MODIFIER_SYMBOL = charCategory27;
        kotlin.text.CharCategory charCategory28 = new kotlin.text.CharCategory("OTHER_SYMBOL", 27, 28, "So");
        OTHER_SYMBOL = charCategory28;
        kotlin.text.CharCategory charCategory29 = new kotlin.text.CharCategory("INITIAL_QUOTE_PUNCTUATION", 28, 29, "Pi");
        INITIAL_QUOTE_PUNCTUATION = charCategory29;
        kotlin.text.CharCategory charCategory30 = new kotlin.text.CharCategory("FINAL_QUOTE_PUNCTUATION", 29, 30, "Pf");
        FINAL_QUOTE_PUNCTUATION = charCategory30;
        kotlin.text.CharCategory[] charCategoryArr = {charCategory, charCategory2, charCategory3, charCategory4, charCategory5, charCategory6, charCategory7, charCategory8, charCategory9, charCategory10, charCategory11, charCategory12, charCategory13, charCategory14, charCategory15, charCategory16, charCategory17, charCategory18, charCategory19, charCategory20, charCategory21, charCategory22, charCategory23, charCategory24, charCategory25, charCategory26, charCategory27, charCategory28, charCategory29, charCategory30};
        getHighResolutionOutputSizeshNQ4ISI = charCategoryArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(charCategoryArr);
        INSTANCE = new kotlin.text.CharCategory.Companion(null);
    }

    public final boolean contains(char r2) {
        return java.lang.Character.getType(r2) == this.value;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/text/CharCategory$Companion;", "", "<init>", "()V", "", "category", "Lkotlin/text/CharCategory;", "valueOf", "(I)Lkotlin/text/CharCategory;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final kotlin.text.CharCategory valueOf(int category) {
            if (category >= 0 && category < 17) {
                return (kotlin.text.CharCategory) kotlin.text.CharCategory.getEntries().get(category);
            }
            if (18 <= category && category < 31) {
                return (kotlin.text.CharCategory) kotlin.text.CharCategory.getEntries().get(category - 1);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Category #");
            sb.append(category);
            sb.append(" is not defined.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static kotlin.text.CharCategory[] values() {
        return (kotlin.text.CharCategory[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static kotlin.text.CharCategory valueOf(java.lang.String str) {
        return (kotlin.text.CharCategory) java.lang.Enum.valueOf(kotlin.text.CharCategory.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlin.text.CharCategory> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
