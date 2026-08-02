package kotlin.text;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\f\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\t\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u000b\u001a\u0011\u0010\r\u001a\u00020\f*\u00020\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0012\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0014\u001a\u00020\u0010*\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"", "", "digitToInt", "(C)I", "radix", "(CI)I", "digitToIntOrNull", "(C)Ljava/lang/Integer;", "(CI)Ljava/lang/Integer;", "digitToChar", "(I)C", "(II)C", "", "titlecase", "(C)Ljava/lang/String;", "other", "", "ignoreCase", "equals", "(CCZ)Z", "isSurrogate", "(C)Z"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/CharsKt")
/* loaded from: classes3.dex */
public class CharsKt__CharKt extends kotlin.text.CharsKt__CharJVMKt {
    public static final boolean isSurrogate(char c) {
        return 55296 <= c && c < 57344;
    }

    public static final int digitToInt(char c) {
        int digitOf = kotlin.text.CharsKt.digitOf(c, 10);
        if (digitOf >= 0) {
            return digitOf;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Char ");
        sb.append(c);
        sb.append(" is not a decimal digit");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final int digitToInt(char c, int i) {
        java.lang.Integer digitToIntOrNull = kotlin.text.CharsKt.digitToIntOrNull(c, i);
        if (digitToIntOrNull != null) {
            return digitToIntOrNull.intValue();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Char ");
        sb.append(c);
        sb.append(" is not a digit in the given radix=");
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final java.lang.Integer digitToIntOrNull(char c) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(kotlin.text.CharsKt.digitOf(c, 10));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final java.lang.Integer digitToIntOrNull(char c, int i) {
        kotlin.text.CharsKt.checkRadix(i);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(kotlin.text.CharsKt.digitOf(c, i));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final char digitToChar(int i) {
        if (i >= 0 && i < 10) {
            return (char) (i + 48);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Int ");
        sb.append(i);
        sb.append(" is not a decimal digit");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final char digitToChar(int i, int i2) {
        if (2 > i2 || i2 >= 37) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid radix: ");
            sb.append(i2);
            sb.append(". Valid radix values are in range 2..36");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i >= 0 && i < i2) {
            return (char) (i < 10 ? i + 48 : ((char) (i + 65)) - '\n');
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Digit ");
        sb2.append(i);
        sb2.append(" does not represent a valid digit in radix ");
        sb2.append(i2);
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    public static final java.lang.String titlecase(char c) {
        return kotlin.text._OneToManyTitlecaseMappingsKt.titlecaseImpl(c);
    }

    public static /* synthetic */ boolean equals$default(char c, char c2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.CharsKt.equals(c, c2, z);
    }

    public static final boolean equals(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = java.lang.Character.toUpperCase(c);
        char upperCase2 = java.lang.Character.toUpperCase(c2);
        return upperCase == upperCase2 || java.lang.Character.toLowerCase(upperCase) == java.lang.Character.toLowerCase(upperCase2);
    }
}
