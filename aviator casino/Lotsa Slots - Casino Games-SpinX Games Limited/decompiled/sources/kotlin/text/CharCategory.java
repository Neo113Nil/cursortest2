package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CharCategoryJVM.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001.B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0086\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)¨\u0006/"}, d2 = {"Lkotlin/text/CharCategory;", "", "value", "", "code", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getValue", "()I", "getCode", "()Ljava/lang/String;", "UNASSIGNED", "UPPERCASE_LETTER", "LOWERCASE_LETTER", "TITLECASE_LETTER", "MODIFIER_LETTER", "OTHER_LETTER", "NON_SPACING_MARK", "ENCLOSING_MARK", "COMBINING_SPACING_MARK", "DECIMAL_DIGIT_NUMBER", "LETTER_NUMBER", "OTHER_NUMBER", "SPACE_SEPARATOR", "LINE_SEPARATOR", "PARAGRAPH_SEPARATOR", "CONTROL", "FORMAT", "PRIVATE_USE", "SURROGATE", "DASH_PUNCTUATION", "START_PUNCTUATION", "END_PUNCTUATION", "CONNECTOR_PUNCTUATION", "OTHER_PUNCTUATION", "MATH_SYMBOL", "CURRENCY_SYMBOL", "MODIFIER_SYMBOL", "OTHER_SYMBOL", "INITIAL_QUOTE_PUNCTUATION", "FINAL_QUOTE_PUNCTUATION", "contains", "", "char", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CharCategory {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlin.text.CharCategory[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.text.CharCategory.Companion INSTANCE;
    private final java.lang.String code;
    private final int value;
    public static final kotlin.text.CharCategory UNASSIGNED = new kotlin.text.CharCategory("UNASSIGNED", 0, 0, "Cn");
    public static final kotlin.text.CharCategory UPPERCASE_LETTER = new kotlin.text.CharCategory("UPPERCASE_LETTER", 1, 1, "Lu");
    public static final kotlin.text.CharCategory LOWERCASE_LETTER = new kotlin.text.CharCategory("LOWERCASE_LETTER", 2, 2, "Ll");
    public static final kotlin.text.CharCategory TITLECASE_LETTER = new kotlin.text.CharCategory("TITLECASE_LETTER", 3, 3, "Lt");
    public static final kotlin.text.CharCategory MODIFIER_LETTER = new kotlin.text.CharCategory("MODIFIER_LETTER", 4, 4, "Lm");
    public static final kotlin.text.CharCategory OTHER_LETTER = new kotlin.text.CharCategory("OTHER_LETTER", 5, 5, "Lo");
    public static final kotlin.text.CharCategory NON_SPACING_MARK = new kotlin.text.CharCategory("NON_SPACING_MARK", 6, 6, "Mn");
    public static final kotlin.text.CharCategory ENCLOSING_MARK = new kotlin.text.CharCategory("ENCLOSING_MARK", 7, 7, "Me");
    public static final kotlin.text.CharCategory COMBINING_SPACING_MARK = new kotlin.text.CharCategory("COMBINING_SPACING_MARK", 8, 8, "Mc");
    public static final kotlin.text.CharCategory DECIMAL_DIGIT_NUMBER = new kotlin.text.CharCategory("DECIMAL_DIGIT_NUMBER", 9, 9, "Nd");
    public static final kotlin.text.CharCategory LETTER_NUMBER = new kotlin.text.CharCategory("LETTER_NUMBER", 10, 10, "Nl");
    public static final kotlin.text.CharCategory OTHER_NUMBER = new kotlin.text.CharCategory("OTHER_NUMBER", 11, 11, "No");
    public static final kotlin.text.CharCategory SPACE_SEPARATOR = new kotlin.text.CharCategory("SPACE_SEPARATOR", 12, 12, "Zs");
    public static final kotlin.text.CharCategory LINE_SEPARATOR = new kotlin.text.CharCategory("LINE_SEPARATOR", 13, 13, "Zl");
    public static final kotlin.text.CharCategory PARAGRAPH_SEPARATOR = new kotlin.text.CharCategory("PARAGRAPH_SEPARATOR", 14, 14, "Zp");
    public static final kotlin.text.CharCategory CONTROL = new kotlin.text.CharCategory("CONTROL", 15, 15, "Cc");
    public static final kotlin.text.CharCategory FORMAT = new kotlin.text.CharCategory("FORMAT", 16, 16, "Cf");
    public static final kotlin.text.CharCategory PRIVATE_USE = new kotlin.text.CharCategory("PRIVATE_USE", 17, 18, "Co");
    public static final kotlin.text.CharCategory SURROGATE = new kotlin.text.CharCategory("SURROGATE", 18, 19, "Cs");
    public static final kotlin.text.CharCategory DASH_PUNCTUATION = new kotlin.text.CharCategory("DASH_PUNCTUATION", 19, 20, "Pd");
    public static final kotlin.text.CharCategory START_PUNCTUATION = new kotlin.text.CharCategory("START_PUNCTUATION", 20, 21, "Ps");
    public static final kotlin.text.CharCategory END_PUNCTUATION = new kotlin.text.CharCategory("END_PUNCTUATION", 21, 22, "Pe");
    public static final kotlin.text.CharCategory CONNECTOR_PUNCTUATION = new kotlin.text.CharCategory("CONNECTOR_PUNCTUATION", 22, 23, "Pc");
    public static final kotlin.text.CharCategory OTHER_PUNCTUATION = new kotlin.text.CharCategory("OTHER_PUNCTUATION", 23, 24, "Po");
    public static final kotlin.text.CharCategory MATH_SYMBOL = new kotlin.text.CharCategory("MATH_SYMBOL", 24, 25, "Sm");
    public static final kotlin.text.CharCategory CURRENCY_SYMBOL = new kotlin.text.CharCategory("CURRENCY_SYMBOL", 25, 26, "Sc");
    public static final kotlin.text.CharCategory MODIFIER_SYMBOL = new kotlin.text.CharCategory("MODIFIER_SYMBOL", 26, 27, "Sk");
    public static final kotlin.text.CharCategory OTHER_SYMBOL = new kotlin.text.CharCategory("OTHER_SYMBOL", 27, 28, "So");
    public static final kotlin.text.CharCategory INITIAL_QUOTE_PUNCTUATION = new kotlin.text.CharCategory("INITIAL_QUOTE_PUNCTUATION", 28, 29, "Pi");
    public static final kotlin.text.CharCategory FINAL_QUOTE_PUNCTUATION = new kotlin.text.CharCategory("FINAL_QUOTE_PUNCTUATION", 29, 30, "Pf");

    private static final /* synthetic */ kotlin.text.CharCategory[] $values() {
        return new kotlin.text.CharCategory[]{UNASSIGNED, UPPERCASE_LETTER, LOWERCASE_LETTER, TITLECASE_LETTER, MODIFIER_LETTER, OTHER_LETTER, NON_SPACING_MARK, ENCLOSING_MARK, COMBINING_SPACING_MARK, DECIMAL_DIGIT_NUMBER, LETTER_NUMBER, OTHER_NUMBER, SPACE_SEPARATOR, LINE_SEPARATOR, PARAGRAPH_SEPARATOR, CONTROL, FORMAT, PRIVATE_USE, SURROGATE, DASH_PUNCTUATION, START_PUNCTUATION, END_PUNCTUATION, CONNECTOR_PUNCTUATION, OTHER_PUNCTUATION, MATH_SYMBOL, CURRENCY_SYMBOL, MODIFIER_SYMBOL, OTHER_SYMBOL, INITIAL_QUOTE_PUNCTUATION, FINAL_QUOTE_PUNCTUATION};
    }

    public static kotlin.enums.EnumEntries<kotlin.text.CharCategory> getEntries() {
        return $ENTRIES;
    }

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
        kotlin.text.CharCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        INSTANCE = new kotlin.text.CharCategory.Companion(null);
    }

    public final boolean contains(char r2) {
        return java.lang.Character.getType(r2) == this.value;
    }

    /* compiled from: CharCategoryJVM.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lkotlin/text/CharCategory$Companion;", "", "<init>", "()V", "valueOf", "Lkotlin/text/CharCategory;", "category", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

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
            throw new java.lang.IllegalArgumentException("Category #" + category + " is not defined.");
        }
    }

    public static kotlin.text.CharCategory valueOf(java.lang.String str) {
        return (kotlin.text.CharCategory) java.lang.Enum.valueOf(kotlin.text.CharCategory.class, str);
    }

    public static kotlin.text.CharCategory[] values() {
        return (kotlin.text.CharCategory[]) $VALUES.clone();
    }
}
