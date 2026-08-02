package com.google.common.base;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'LOWER_UNDERSCORE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes9.dex */
public abstract class CaseFormat {
    public static final com.google.common.base.CaseFormat LOWER_CAMEL;
    public static final com.google.common.base.CaseFormat LOWER_UNDERSCORE;
    public static final com.google.common.base.CaseFormat UPPER_CAMEL;
    public static final com.google.common.base.CaseFormat UPPER_UNDERSCORE;
    private final com.google.common.base.CharMatcher wordBoundary;
    private final java.lang.String wordSeparator;
    public static final com.google.common.base.CaseFormat LOWER_HYPHEN = new com.google.common.base.CaseFormat("LOWER_HYPHEN", 0, com.google.common.base.CharMatcher.is('-'), "-") { // from class: com.google.common.base.CaseFormat.1
        @Override // com.google.common.base.CaseFormat
        final java.lang.String normalizeWord(java.lang.String str) {
            return com.google.common.base.Ascii.toLowerCase(str);
        }

        @Override // com.google.common.base.CaseFormat
        final java.lang.String convert(com.google.common.base.CaseFormat caseFormat, java.lang.String str) {
            if (caseFormat == LOWER_UNDERSCORE) {
                return str.replace('-', '_');
            }
            if (caseFormat == UPPER_UNDERSCORE) {
                return com.google.common.base.Ascii.toUpperCase(str.replace('-', '_'));
            }
            return super.convert(caseFormat, str);
        }
    };
    private static final /* synthetic */ com.google.common.base.CaseFormat[] $VALUES = $values();

    abstract java.lang.String normalizeWord(java.lang.String str);

    private static /* synthetic */ com.google.common.base.CaseFormat[] $values() {
        return new com.google.common.base.CaseFormat[]{LOWER_HYPHEN, LOWER_UNDERSCORE, LOWER_CAMEL, UPPER_CAMEL, UPPER_UNDERSCORE};
    }

    public static com.google.common.base.CaseFormat valueOf(java.lang.String str) {
        return (com.google.common.base.CaseFormat) java.lang.Enum.valueOf(com.google.common.base.CaseFormat.class, str);
    }

    public static com.google.common.base.CaseFormat[] values() {
        return (com.google.common.base.CaseFormat[]) $VALUES.clone();
    }

    static {
        java.lang.String str = "_";
        LOWER_UNDERSCORE = new com.google.common.base.CaseFormat("LOWER_UNDERSCORE", 1, com.google.common.base.CharMatcher.is('_'), str) { // from class: com.google.common.base.CaseFormat.2
            @Override // com.google.common.base.CaseFormat
            final java.lang.String normalizeWord(java.lang.String str2) {
                return com.google.common.base.Ascii.toLowerCase(str2);
            }

            @Override // com.google.common.base.CaseFormat
            final java.lang.String convert(com.google.common.base.CaseFormat caseFormat, java.lang.String str2) {
                if (caseFormat == LOWER_HYPHEN) {
                    return str2.replace('_', '-');
                }
                if (caseFormat == UPPER_UNDERSCORE) {
                    return com.google.common.base.Ascii.toUpperCase(str2);
                }
                return super.convert(caseFormat, str2);
            }
        };
        java.lang.String str2 = "";
        LOWER_CAMEL = new com.google.common.base.CaseFormat("LOWER_CAMEL", 2, com.google.common.base.CharMatcher.inRange('A', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_ZERO), str2) { // from class: com.google.common.base.CaseFormat.3
            @Override // com.google.common.base.CaseFormat
            final java.lang.String normalizeWord(java.lang.String str3) {
                return com.google.common.base.CaseFormat.firstCharOnlyToUpper(str3);
            }

            @Override // com.google.common.base.CaseFormat
            final java.lang.String normalizeFirstWord(java.lang.String str3) {
                return com.google.common.base.Ascii.toLowerCase(str3);
            }
        };
        UPPER_CAMEL = new com.google.common.base.CaseFormat("UPPER_CAMEL", 3, com.google.common.base.CharMatcher.inRange('A', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_ZERO), str2) { // from class: com.google.common.base.CaseFormat.4
            @Override // com.google.common.base.CaseFormat
            final java.lang.String normalizeWord(java.lang.String str3) {
                return com.google.common.base.CaseFormat.firstCharOnlyToUpper(str3);
            }
        };
        UPPER_UNDERSCORE = new com.google.common.base.CaseFormat("UPPER_UNDERSCORE", 4, com.google.common.base.CharMatcher.is('_'), str) { // from class: com.google.common.base.CaseFormat.5
            @Override // com.google.common.base.CaseFormat
            final java.lang.String normalizeWord(java.lang.String str3) {
                return com.google.common.base.Ascii.toUpperCase(str3);
            }

            @Override // com.google.common.base.CaseFormat
            final java.lang.String convert(com.google.common.base.CaseFormat caseFormat, java.lang.String str3) {
                if (caseFormat == LOWER_HYPHEN) {
                    return com.google.common.base.Ascii.toLowerCase(str3.replace('_', '-'));
                }
                if (caseFormat == LOWER_UNDERSCORE) {
                    return com.google.common.base.Ascii.toLowerCase(str3);
                }
                return super.convert(caseFormat, str3);
            }
        };
    }

    private CaseFormat(java.lang.String str, int i, com.google.common.base.CharMatcher charMatcher, java.lang.String str2) {
        this.wordBoundary = charMatcher;
        this.wordSeparator = str2;
    }

    public final java.lang.String to(com.google.common.base.CaseFormat caseFormat, java.lang.String str) {
        com.google.common.base.Preconditions.checkNotNull(caseFormat);
        com.google.common.base.Preconditions.checkNotNull(str);
        return caseFormat == this ? str : convert(caseFormat, str);
    }

    java.lang.String convert(com.google.common.base.CaseFormat caseFormat, java.lang.String str) {
        java.lang.StringBuilder sb = null;
        int i = 0;
        int i2 = -1;
        while (true) {
            i2 = this.wordBoundary.indexIn(str, i2 + 1);
            if (i2 == -1) {
                break;
            }
            if (i == 0) {
                sb = new java.lang.StringBuilder(str.length() + (caseFormat.wordSeparator.length() * 4));
                sb.append(caseFormat.normalizeFirstWord(str.substring(i, i2)));
            } else {
                ((java.lang.StringBuilder) java.util.Objects.requireNonNull(sb)).append(caseFormat.normalizeWord(str.substring(i, i2)));
            }
            sb.append(caseFormat.wordSeparator);
            i = this.wordSeparator.length() + i2;
        }
        if (i == 0) {
            return caseFormat.normalizeFirstWord(str);
        }
        java.lang.StringBuilder sb2 = (java.lang.StringBuilder) java.util.Objects.requireNonNull(sb);
        sb2.append(caseFormat.normalizeWord(str.substring(i)));
        return sb2.toString();
    }

    public com.google.common.base.Converter<java.lang.String, java.lang.String> converterTo(com.google.common.base.CaseFormat caseFormat) {
        return new com.google.common.base.CaseFormat.StringConverter(this, caseFormat);
    }

    static final class StringConverter extends com.google.common.base.Converter<java.lang.String, java.lang.String> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.CaseFormat sourceFormat;
        private final com.google.common.base.CaseFormat targetFormat;

        StringConverter(com.google.common.base.CaseFormat caseFormat, com.google.common.base.CaseFormat caseFormat2) {
            this.sourceFormat = (com.google.common.base.CaseFormat) com.google.common.base.Preconditions.checkNotNull(caseFormat);
            this.targetFormat = (com.google.common.base.CaseFormat) com.google.common.base.Preconditions.checkNotNull(caseFormat2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public final java.lang.String doForward(java.lang.String str) {
            return this.sourceFormat.to(this.targetFormat, str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public final java.lang.String doBackward(java.lang.String str) {
            return this.targetFormat.to(this.sourceFormat, str);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.common.base.CaseFormat.StringConverter)) {
                return false;
            }
            com.google.common.base.CaseFormat.StringConverter stringConverter = (com.google.common.base.CaseFormat.StringConverter) obj;
            return this.sourceFormat.equals(stringConverter.sourceFormat) && this.targetFormat.equals(stringConverter.targetFormat);
        }

        public final int hashCode() {
            return this.sourceFormat.hashCode() ^ this.targetFormat.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.sourceFormat);
            sb.append(".converterTo(");
            sb.append(this.targetFormat);
            sb.append(")");
            return sb.toString();
        }
    }

    java.lang.String normalizeFirstWord(java.lang.String str) {
        return normalizeWord(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String firstCharOnlyToUpper(java.lang.String str) {
        if (str.isEmpty()) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.google.common.base.Ascii.toUpperCase(str.charAt(0)));
        sb.append(com.google.common.base.Ascii.toLowerCase(str.substring(1)));
        return sb.toString();
    }
}
