package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u0000 \u00022\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\nÀ\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat;", "", "Companion", "OptionalGroup", "Sequence", "StringLiteral", "Directive", "Lkotlinx/datetime/format/UnicodeFormat$Directive;", "Lkotlinx/datetime/format/UnicodeFormat$OptionalGroup;", "Lkotlinx/datetime/format/UnicodeFormat$Sequence;", "Lkotlinx/datetime/format/UnicodeFormat$StringLiteral;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface UnicodeFormat {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.datetime.format.UnicodeFormat.Companion INSTANCE = kotlinx.datetime.format.UnicodeFormat.Companion.getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Companion;", "", "<init>", "()V", "", "pattern", "Lkotlinx/datetime/format/UnicodeFormat;", "parse", "(Ljava/lang/String;)Lkotlinx/datetime/format/UnicodeFormat;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ kotlinx.datetime.format.UnicodeFormat.Companion getHighSpeedVideoFpsRangesFor = new kotlinx.datetime.format.UnicodeFormat.Companion();

        private Companion() {
        }

        public final kotlinx.datetime.format.UnicodeFormat parse(java.lang.String pattern) {
            java.util.List list;
            java.util.List list2;
            java.util.List list3;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "");
            java.util.List mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(new java.util.ArrayList());
            int length = pattern.length();
            java.lang.String str = "";
            int i = 0;
            boolean z = false;
            java.lang.Character ch = null;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = pattern.charAt(i2);
                if (ch != null && charAt == ch.charValue()) {
                    i++;
                } else if (!z) {
                    if (i > 0) {
                        java.util.List list4 = (java.util.List) kotlin.collections.CollectionsKt.last(mutableListOf);
                        if (list4 != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(ch);
                            list4.add(kotlinx.datetime.format.UnicodeKt.access$unicodeDirective(ch.charValue(), i));
                        }
                        i = 0;
                        ch = null;
                    }
                    list3 = kotlinx.datetime.format.UnicodeKt.Camera2StreamConfigurationMap;
                    if (!list3.contains(java.lang.Character.valueOf(charAt))) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(str);
                        sb.append(charAt);
                        str = sb.toString();
                    } else {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(str, "")) {
                            java.util.List list5 = (java.util.List) kotlin.collections.CollectionsKt.last(mutableListOf);
                            if (list5 != null) {
                                list5.add(new kotlinx.datetime.format.UnicodeFormat.StringLiteral(str));
                            }
                            str = "";
                        }
                        if (charAt == '\'') {
                            z = true;
                            str = "";
                        } else if (charAt == '[') {
                            mutableListOf.add(new java.util.ArrayList());
                        } else if (charAt == ']') {
                            java.util.List list6 = (java.util.List) kotlin.collections.CollectionsKt.removeLast(mutableListOf);
                            if (list6 == null) {
                                throw new java.lang.IllegalArgumentException("Unmatched closing bracket");
                            }
                            java.util.List list7 = (java.util.List) kotlin.collections.CollectionsKt.last(mutableListOf);
                            if (list7 != null) {
                                list7.add(new kotlinx.datetime.format.UnicodeFormat.OptionalGroup(new kotlinx.datetime.format.UnicodeFormat.Sequence(list6)));
                            }
                        } else {
                            ch = java.lang.Character.valueOf(charAt);
                            i = 1;
                        }
                    }
                } else if (charAt == '\'') {
                    java.util.List list8 = (java.util.List) kotlin.collections.CollectionsKt.last(mutableListOf);
                    if (list8 != null) {
                        java.lang.String str2 = str;
                        if (str2.length() == 0) {
                            str2 = "'";
                        }
                        list8.add(new kotlinx.datetime.format.UnicodeFormat.StringLiteral(str2));
                    }
                    z = false;
                    str = "";
                } else {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(str);
                    sb2.append(charAt);
                    str = sb2.toString();
                }
            }
            if (i > 0 && (list2 = (java.util.List) kotlin.collections.CollectionsKt.last(mutableListOf)) != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(ch);
                list2.add(kotlinx.datetime.format.UnicodeKt.access$unicodeDirective(ch.charValue(), i));
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(str, "") && (list = (java.util.List) kotlin.collections.CollectionsKt.last(mutableListOf)) != null) {
                list.add(new kotlinx.datetime.format.UnicodeFormat.StringLiteral(str));
            }
            java.util.List list9 = (java.util.List) kotlin.collections.CollectionsKt.removeLast(mutableListOf);
            if (list9 != null) {
                return new kotlinx.datetime.format.UnicodeFormat.Sequence(list9);
            }
            throw new java.lang.IllegalArgumentException("Unmatched opening bracket");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\t"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$OptionalGroup;", "Lkotlinx/datetime/format/UnicodeFormat;", "format", "<init>", "(Lkotlinx/datetime/format/UnicodeFormat;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Lkotlinx/datetime/format/UnicodeFormat;", "copy", "(Lkotlinx/datetime/format/UnicodeFormat;)Lkotlinx/datetime/format/UnicodeFormat$OptionalGroup;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/datetime/format/UnicodeFormat;", "getFormat"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OptionalGroup implements kotlinx.datetime.format.UnicodeFormat {
        private final kotlinx.datetime.format.UnicodeFormat format;

        public OptionalGroup(kotlinx.datetime.format.UnicodeFormat unicodeFormat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unicodeFormat, "");
            this.format = unicodeFormat;
        }

        public final kotlinx.datetime.format.UnicodeFormat getFormat() {
            return this.format;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            sb.append(this.format);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            return sb.toString();
        }

        public final int hashCode() {
            return this.format.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof kotlinx.datetime.format.UnicodeFormat.OptionalGroup) && kotlin.jvm.internal.Intrinsics.areEqual(this.format, ((kotlinx.datetime.format.UnicodeFormat.OptionalGroup) other).format);
        }

        public final kotlinx.datetime.format.UnicodeFormat.OptionalGroup copy(kotlinx.datetime.format.UnicodeFormat format) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
            return new kotlinx.datetime.format.UnicodeFormat.OptionalGroup(format);
        }

        /* renamed from: component1, reason: from getter */
        public final kotlinx.datetime.format.UnicodeFormat getFormat() {
            return this.format;
        }

        public static /* synthetic */ kotlinx.datetime.format.UnicodeFormat.OptionalGroup copy$default(kotlinx.datetime.format.UnicodeFormat.OptionalGroup optionalGroup, kotlinx.datetime.format.UnicodeFormat unicodeFormat, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                unicodeFormat = optionalGroup.format;
            }
            return optionalGroup.copy(unicodeFormat);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Sequence;", "Lkotlinx/datetime/format/UnicodeFormat;", "", "formats", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lkotlinx/datetime/format/UnicodeFormat$Sequence;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/List;", "getFormats"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Sequence implements kotlinx.datetime.format.UnicodeFormat {
        private final java.util.List<kotlinx.datetime.format.UnicodeFormat> formats;

        /* JADX WARN: Multi-variable type inference failed */
        public Sequence(java.util.List<? extends kotlinx.datetime.format.UnicodeFormat> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.formats = list;
        }

        public final java.util.List<kotlinx.datetime.format.UnicodeFormat> getFormats() {
            return this.formats;
        }

        public final java.lang.String toString() {
            return kotlin.collections.CollectionsKt.joinToString$default(this.formats, "", null, null, 0, null, null, 62, null);
        }

        public final int hashCode() {
            return this.formats.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof kotlinx.datetime.format.UnicodeFormat.Sequence) && kotlin.jvm.internal.Intrinsics.areEqual(this.formats, ((kotlinx.datetime.format.UnicodeFormat.Sequence) other).formats);
        }

        public final kotlinx.datetime.format.UnicodeFormat.Sequence copy(java.util.List<? extends kotlinx.datetime.format.UnicodeFormat> formats) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formats, "");
            return new kotlinx.datetime.format.UnicodeFormat.Sequence(formats);
        }

        public final java.util.List<kotlinx.datetime.format.UnicodeFormat> component1() {
            return this.formats;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ kotlinx.datetime.format.UnicodeFormat.Sequence copy$default(kotlinx.datetime.format.UnicodeFormat.Sequence sequence, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = sequence.formats;
            }
            return sequence.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$StringLiteral;", "Lkotlinx/datetime/format/UnicodeFormat;", "", "literal", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "component1", "copy", "(Ljava/lang/String;)Lkotlinx/datetime/format/UnicodeFormat$StringLiteral;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getLiteral"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StringLiteral implements kotlinx.datetime.format.UnicodeFormat {
        private final java.lang.String literal;

        public StringLiteral(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.literal = str;
        }

        public final java.lang.String getLiteral() {
            return this.literal;
        }

        public final java.lang.String toString() {
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.literal, "'")) {
                return "''";
            }
            java.lang.String str = this.literal;
            for (int i = 0; i < str.length(); i++) {
                if (java.lang.Character.isLetter(str.charAt(i))) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("'");
                    sb.append(this.literal);
                    sb.append('\'');
                    return sb.toString();
                }
            }
            return this.literal.length() == 0 ? "" : this.literal;
        }

        public final int hashCode() {
            return this.literal.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof kotlinx.datetime.format.UnicodeFormat.StringLiteral) && kotlin.jvm.internal.Intrinsics.areEqual(this.literal, ((kotlinx.datetime.format.UnicodeFormat.StringLiteral) other).literal);
        }

        public final kotlinx.datetime.format.UnicodeFormat.StringLiteral copy(java.lang.String literal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(literal, "");
            return new kotlinx.datetime.format.UnicodeFormat.StringLiteral(literal);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getLiteral() {
            return this.literal;
        }

        public static /* synthetic */ kotlinx.datetime.format.UnicodeFormat.StringLiteral copy$default(kotlinx.datetime.format.UnicodeFormat.StringLiteral stringLiteral, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stringLiteral.literal;
            }
            return stringLiteral.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0015\u0016\u0017\u0018\u0019B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0005\u001a\u001b\u001c\u001d\u001e"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive;", "Lkotlinx/datetime/format/UnicodeFormat;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getFormatLength", "formatLength", "", "getFormatLetter", "()C", "formatLetter", "YearMonthBased", "DateBased", "TimeBased", "ZoneBased", "OffsetBased", "Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$OffsetBased;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$ZoneBased;", "Lkotlinx/datetime/format/UnknownUnicodeDirective;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Directive implements kotlinx.datetime.format.UnicodeFormat {
        public abstract int getFormatLength();

        public abstract char getFormatLetter();

        private Directive() {
        }

        public java.lang.String toString() {
            return kotlin.text.StringsKt.repeat(java.lang.String.valueOf(getFormatLetter()), getFormatLength());
        }

        public boolean equals(java.lang.Object other) {
            if (!(other instanceof kotlinx.datetime.format.UnicodeFormat.Directive)) {
                return false;
            }
            kotlinx.datetime.format.UnicodeFormat.Directive directive = (kotlinx.datetime.format.UnicodeFormat.Directive) other;
            return getFormatLetter() == directive.getFormatLetter() && getFormatLength() == directive.getFormatLength();
        }

        public int hashCode() {
            return (java.lang.Character.hashCode(getFormatLetter()) * 31) + getFormatLength();
        }

        @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0007\u0010\n\u0082\u0001\t\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased;", "<init>", "()V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;)V", "Era", "Year", "YearOfEra", "CyclicYearName", "RelatedGregorianYear", "MonthOfYear", "StandaloneMonthOfYear", "QuarterOfYear", "StandaloneQuarterOfYear", "Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased$CyclicYearName;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased$Era;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased$MonthOfYear;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased$QuarterOfYear;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased$RelatedGregorianYear;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased$StandaloneMonthOfYear;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased$StandaloneQuarterOfYear;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased$Year;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased$YearOfEra;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class YearMonthBased extends kotlinx.datetime.format.UnicodeFormat.Directive.DateBased {
            /* renamed from: addToFormat */
            public abstract void mo24157addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth builder);

            private YearMonthBased() {
                super(null);
            }

            @Override // kotlinx.datetime.format.UnicodeFormat.Directive.DateBased
            /* renamed from: addToFormat */
            public void mo24154addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithDate builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                mo24157addToFormat((kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth) builder);
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased$Era;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;)Ljava/lang/Void;", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Era extends kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased {
                private final int formatLength;
                private final char formatLetter;

                public Era(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = 'G';
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased
                /* renamed from: addToFormat, reason: merged with bridge method [inline-methods] */
                public final java.lang.Void mo24157addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    kotlinx.datetime.format.UnicodeKt.getHighResolutionOutputSizeshNQ4ISI(this, null);
                    throw new kotlin.KotlinNothingValueException();
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased$Year;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;)V", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Year extends kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased {
                private final int formatLength;
                private final char formatLetter;

                public Year(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased
                /* renamed from: addToFormat */
                public final void mo24157addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    int formatLength = getFormatLength();
                    if (formatLength == 1) {
                        builder.year(kotlinx.datetime.format.Padding.NONE);
                        return;
                    }
                    if (formatLength == 2) {
                        builder.yearTwoDigits(2000);
                        return;
                    }
                    if (formatLength == 3) {
                        kotlinx.datetime.format.UnicodeKt.access$unsupportedPadding(this, getFormatLength());
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (formatLength == 4) {
                        builder.year(kotlinx.datetime.format.Padding.ZERO);
                    } else {
                        kotlinx.datetime.format.UnicodeKt.access$unsupportedPadding(this, getFormatLength());
                        throw new kotlin.KotlinNothingValueException();
                    }
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased$YearOfEra;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;)V", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class YearOfEra extends kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased {
                private final int formatLength;
                private final char formatLetter;

                public YearOfEra(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = 'y';
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased
                /* renamed from: addToFormat */
                public final void mo24157addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    int formatLength = getFormatLength();
                    if (formatLength == 1) {
                        kotlinx.datetime.format.YearMonthFormatKt.yearOfEra(builder, kotlinx.datetime.format.Padding.NONE);
                        return;
                    }
                    if (formatLength == 2) {
                        kotlinx.datetime.format.YearMonthFormatKt.yearOfEraTwoDigits(builder, 2000);
                        return;
                    }
                    if (formatLength == 3) {
                        kotlinx.datetime.format.UnicodeKt.access$unsupportedPadding(this, getFormatLength());
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (formatLength == 4) {
                        kotlinx.datetime.format.YearMonthFormatKt.yearOfEra(builder, kotlinx.datetime.format.Padding.ZERO);
                    } else {
                        kotlinx.datetime.format.UnicodeKt.access$unsupportedPadding(this, getFormatLength());
                        throw new kotlin.KotlinNothingValueException();
                    }
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased$CyclicYearName;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;)Ljava/lang/Void;", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CyclicYearName extends kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased {
                private final int formatLength;
                private final char formatLetter;

                public CyclicYearName(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_UT;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased
                /* renamed from: addToFormat, reason: merged with bridge method [inline-methods] */
                public final java.lang.Void mo24157addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    kotlinx.datetime.format.UnicodeKt.getHighSpeedVideoSizes("cyclic-year", null);
                    throw new kotlin.KotlinNothingValueException();
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased$RelatedGregorianYear;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;)Ljava/lang/Void;", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class RelatedGregorianYear extends kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased {
                private final int formatLength;
                private final char formatLetter;

                public RelatedGregorianYear(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = 'r';
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased
                /* renamed from: addToFormat, reason: merged with bridge method [inline-methods] */
                public final java.lang.Void mo24157addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    kotlinx.datetime.format.UnicodeKt.getHighSpeedVideoSizes("related-gregorian-year", null);
                    throw new kotlin.KotlinNothingValueException();
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased$MonthOfYear;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;)V", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class MonthOfYear extends kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased {
                private final int formatLength;
                private final char formatLetter;

                public MonthOfYear(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = io.ktor.util.date.GMTDateParser.MONTH;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased
                /* renamed from: addToFormat */
                public final void mo24157addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    int formatLength = getFormatLength();
                    if (formatLength == 1) {
                        builder.monthNumber(kotlinx.datetime.format.Padding.NONE);
                        return;
                    }
                    if (formatLength == 2) {
                        builder.monthNumber(kotlinx.datetime.format.Padding.ZERO);
                    } else {
                        if (formatLength != 3 && formatLength != 4 && formatLength != 5) {
                            kotlinx.datetime.format.UnicodeKt.access$unknownLength(this);
                            throw new kotlin.KotlinNothingValueException();
                        }
                        kotlinx.datetime.format.UnicodeKt.getHighResolutionOutputSizeshNQ4ISI(this, null);
                        throw new kotlin.KotlinNothingValueException();
                    }
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased$StandaloneMonthOfYear;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;)V", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class StandaloneMonthOfYear extends kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased {
                private final int formatLength;
                private final char formatLetter;

                public StandaloneMonthOfYear(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_LT;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased
                /* renamed from: addToFormat */
                public final void mo24157addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    int formatLength = getFormatLength();
                    if (formatLength == 1) {
                        builder.monthNumber(kotlinx.datetime.format.Padding.NONE);
                        return;
                    }
                    if (formatLength == 2) {
                        builder.monthNumber(kotlinx.datetime.format.Padding.ZERO);
                    } else {
                        if (formatLength != 3 && formatLength != 4 && formatLength != 5) {
                            kotlinx.datetime.format.UnicodeKt.access$unknownLength(this);
                            throw new kotlin.KotlinNothingValueException();
                        }
                        kotlinx.datetime.format.UnicodeKt.getHighResolutionOutputSizeshNQ4ISI(this, null);
                        throw new kotlin.KotlinNothingValueException();
                    }
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased$QuarterOfYear;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;)V", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class QuarterOfYear extends kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased {
                private final int formatLength;
                private final char formatLetter;

                public QuarterOfYear(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = 'Q';
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased
                /* renamed from: addToFormat */
                public final void mo24157addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    int formatLength = getFormatLength();
                    if (formatLength == 1 || formatLength == 2) {
                        kotlinx.datetime.format.UnicodeKt.getHighSpeedVideoSizes("quarter-of-year", null);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (formatLength != 3 && formatLength != 4 && formatLength != 5) {
                        kotlinx.datetime.format.UnicodeKt.access$unknownLength(this);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    kotlinx.datetime.format.UnicodeKt.getHighResolutionOutputSizeshNQ4ISI(this, null);
                    throw new kotlin.KotlinNothingValueException();
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased$StandaloneQuarterOfYear;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;)V", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class StandaloneQuarterOfYear extends kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased {
                private final int formatLength;
                private final char formatLetter;

                public StandaloneQuarterOfYear(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = 'q';
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased
                /* renamed from: addToFormat */
                public final void mo24157addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    int formatLength = getFormatLength();
                    if (formatLength == 1 || formatLength == 2) {
                        kotlinx.datetime.format.UnicodeKt.getHighSpeedVideoSizes("standalone-quarter-of-year", null);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (formatLength != 3 && formatLength != 4 && formatLength != 5) {
                        kotlinx.datetime.format.UnicodeKt.access$unknownLength(this);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    kotlinx.datetime.format.UnicodeKt.getHighResolutionOutputSizeshNQ4ISI(this, null);
                    throw new kotlin.KotlinNothingValueException();
                }
            }

            public /* synthetic */ YearMonthBased(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\n\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u000b\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased;", "Lkotlinx/datetime/format/UnicodeFormat$Directive;", "<init>", "()V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;)V", "DayOfYear", "DayOfMonth", "ModifiedJulianDay", "WeekBasedYear", "WeekOfWeekBasedYear", "WeekOfMonth", "DayOfWeek", "LocalizedDayOfWeek", "StandaloneLocalizedDayOfWeek", "DayOfWeekInMonth", "Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased$DayOfMonth;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased$DayOfWeek;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased$DayOfWeekInMonth;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased$DayOfYear;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased$LocalizedDayOfWeek;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased$ModifiedJulianDay;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased$StandaloneLocalizedDayOfWeek;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased$WeekBasedYear;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased$WeekOfMonth;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased$WeekOfWeekBasedYear;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$YearMonthBased;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class DateBased extends kotlinx.datetime.format.UnicodeFormat.Directive {
            /* renamed from: addToFormat */
            public abstract void mo24154addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithDate builder);

            private DateBased() {
                super(null);
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased$DayOfYear;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;)V", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class DayOfYear extends kotlinx.datetime.format.UnicodeFormat.Directive.DateBased {
                private final int formatLength;
                private final char formatLetter;

                public DayOfYear(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = 'D';
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.DateBased
                /* renamed from: addToFormat */
                public final void mo24154addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithDate builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    int formatLength = getFormatLength();
                    if (formatLength == 1) {
                        builder.dayOfYear(kotlinx.datetime.format.Padding.NONE);
                    } else if (formatLength == 3) {
                        builder.dayOfYear(kotlinx.datetime.format.Padding.ZERO);
                    } else {
                        kotlinx.datetime.format.UnicodeKt.access$unknownLength(this);
                        throw new kotlin.KotlinNothingValueException();
                    }
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased$DayOfMonth;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;)V", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class DayOfMonth extends kotlinx.datetime.format.UnicodeFormat.Directive.DateBased {
                private final int formatLength;
                private final char formatLetter;

                public DayOfMonth(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.DateBased
                /* renamed from: addToFormat */
                public final void mo24154addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithDate builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    int formatLength = getFormatLength();
                    if (formatLength == 1) {
                        builder.day(kotlinx.datetime.format.Padding.NONE);
                    } else if (formatLength == 2) {
                        builder.day(kotlinx.datetime.format.Padding.ZERO);
                    } else {
                        kotlinx.datetime.format.UnicodeKt.access$unknownLength(this);
                        throw new kotlin.KotlinNothingValueException();
                    }
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased$ModifiedJulianDay;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;)Ljava/lang/Void;", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ModifiedJulianDay extends kotlinx.datetime.format.UnicodeFormat.Directive.DateBased {
                private final int formatLength;
                private final char formatLetter;

                public ModifiedJulianDay(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = 'g';
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.DateBased
                /* renamed from: addToFormat, reason: merged with bridge method [inline-methods] */
                public final java.lang.Void mo24154addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithDate builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    kotlinx.datetime.format.UnicodeKt.getHighSpeedVideoSizes("modified-julian-day", null);
                    throw new kotlin.KotlinNothingValueException();
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased$WeekBasedYear;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;)Ljava/lang/Void;", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class WeekBasedYear extends kotlinx.datetime.format.UnicodeFormat.Directive.DateBased {
                private final int formatLength;
                private final char formatLetter;

                public WeekBasedYear(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = io.ktor.util.date.GMTDateParser.YEAR;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.DateBased
                /* renamed from: addToFormat, reason: merged with bridge method [inline-methods] */
                public final java.lang.Void mo24154addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithDate builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    kotlinx.datetime.format.UnicodeKt.getHighSpeedVideoSizes("week-based-year", null);
                    throw new kotlin.KotlinNothingValueException();
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased$WeekOfWeekBasedYear;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;)Ljava/lang/Void;", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class WeekOfWeekBasedYear extends kotlinx.datetime.format.UnicodeFormat.Directive.DateBased {
                private final int formatLength;
                private final char formatLetter;

                public WeekOfWeekBasedYear(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = 'w';
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.DateBased
                /* renamed from: addToFormat, reason: merged with bridge method [inline-methods] */
                public final java.lang.Void mo24154addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithDate builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    kotlinx.datetime.format.UnicodeKt.getHighSpeedVideoSizes("week-of-week-based-year", null);
                    throw new kotlin.KotlinNothingValueException();
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased$WeekOfMonth;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;)Ljava/lang/Void;", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class WeekOfMonth extends kotlinx.datetime.format.UnicodeFormat.Directive.DateBased {
                private final int formatLength;
                private final char formatLetter;

                public WeekOfMonth(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = 'W';
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.DateBased
                /* renamed from: addToFormat, reason: merged with bridge method [inline-methods] */
                public final java.lang.Void mo24154addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithDate builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    kotlinx.datetime.format.UnicodeKt.getHighSpeedVideoSizes("week-of-month", null);
                    throw new kotlin.KotlinNothingValueException();
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased$DayOfWeek;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;)Ljava/lang/Void;", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class DayOfWeek extends kotlinx.datetime.format.UnicodeFormat.Directive.DateBased {
                private final int formatLength;
                private final char formatLetter;

                public DayOfWeek(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = 'E';
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.DateBased
                /* renamed from: addToFormat, reason: merged with bridge method [inline-methods] */
                public final java.lang.Void mo24154addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithDate builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    kotlinx.datetime.format.UnicodeKt.getHighResolutionOutputSizeshNQ4ISI(this, null);
                    throw new kotlin.KotlinNothingValueException();
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased$LocalizedDayOfWeek;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;)Ljava/lang/Void;", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class LocalizedDayOfWeek extends kotlinx.datetime.format.UnicodeFormat.Directive.DateBased {
                private final int formatLength;
                private final char formatLetter;

                public LocalizedDayOfWeek(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = 'e';
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.DateBased
                /* renamed from: addToFormat, reason: merged with bridge method [inline-methods] */
                public final java.lang.Void mo24154addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithDate builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    kotlinx.datetime.format.UnicodeKt.getHighResolutionOutputSizeshNQ4ISI(this, null);
                    throw new kotlin.KotlinNothingValueException();
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased$StandaloneLocalizedDayOfWeek;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;)Ljava/lang/Void;", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class StandaloneLocalizedDayOfWeek extends kotlinx.datetime.format.UnicodeFormat.Directive.DateBased {
                private final int formatLength;
                private final char formatLetter;

                public StandaloneLocalizedDayOfWeek(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = 'c';
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.DateBased
                /* renamed from: addToFormat, reason: merged with bridge method [inline-methods] */
                public final java.lang.Void mo24154addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithDate builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    kotlinx.datetime.format.UnicodeKt.getHighResolutionOutputSizeshNQ4ISI(this, null);
                    throw new kotlin.KotlinNothingValueException();
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased$DayOfWeekInMonth;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$DateBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;)Ljava/lang/Void;", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class DayOfWeekInMonth extends kotlinx.datetime.format.UnicodeFormat.Directive.DateBased {
                private final int formatLength;
                private final char formatLetter;

                public DayOfWeekInMonth(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = 'F';
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.DateBased
                /* renamed from: addToFormat, reason: merged with bridge method [inline-methods] */
                public final java.lang.Void mo24154addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithDate builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    kotlinx.datetime.format.UnicodeKt.getHighSpeedVideoSizes("day-of-week-in-month", null);
                    throw new kotlin.KotlinNothingValueException();
                }
            }

            public /* synthetic */ DateBased(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased;", "Lkotlinx/datetime/format/UnicodeFormat$Directive;", "<init>", "()V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;)V", "AmPmMarker", "AmPmHourOfDay", "HourOfDay", "MinuteOfHour", "WithSecondPrecision", "WithSubsecondPrecision", "Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$AmPmHourOfDay;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$AmPmMarker;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$HourOfDay;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$MinuteOfHour;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$WithSecondPrecision;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class TimeBased extends kotlinx.datetime.format.UnicodeFormat.Directive {
            /* renamed from: addToFormat */
            public abstract void mo24156addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithTime builder);

            private TimeBased() {
                super(null);
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$AmPmMarker;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;)Ljava/lang/Void;", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class AmPmMarker extends kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased {
                private final int formatLength;
                private final char formatLetter;

                public AmPmMarker(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = 'a';
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased
                /* renamed from: addToFormat, reason: merged with bridge method [inline-methods] */
                public final java.lang.Void mo24156addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithTime builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    kotlinx.datetime.format.UnicodeKt.getHighResolutionOutputSizeshNQ4ISI(this, null);
                    throw new kotlin.KotlinNothingValueException();
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$AmPmHourOfDay;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;)Ljava/lang/Void;", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class AmPmHourOfDay extends kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased {
                private final int formatLength;
                private final char formatLetter;

                public AmPmHourOfDay(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = io.ktor.util.date.GMTDateParser.HOURS;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased
                /* renamed from: addToFormat, reason: merged with bridge method [inline-methods] */
                public final java.lang.Void mo24156addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithTime builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    kotlinx.datetime.format.UnicodeKt.getHighResolutionOutputSizeshNQ4ISI(this, null);
                    throw new kotlin.KotlinNothingValueException();
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$HourOfDay;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;)V", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class HourOfDay extends kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased {
                private final int formatLength;
                private final char formatLetter;

                public HourOfDay(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = 'H';
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased
                /* renamed from: addToFormat */
                public final void mo24156addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithTime builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    int formatLength = getFormatLength();
                    if (formatLength == 1) {
                        builder.hour(kotlinx.datetime.format.Padding.NONE);
                    } else if (formatLength == 2) {
                        builder.hour(kotlinx.datetime.format.Padding.ZERO);
                    } else {
                        kotlinx.datetime.format.UnicodeKt.access$unknownLength(this);
                        throw new kotlin.KotlinNothingValueException();
                    }
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$MinuteOfHour;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;)V", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class MinuteOfHour extends kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased {
                private final int formatLength;
                private final char formatLetter;

                public MinuteOfHour(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = io.ktor.util.date.GMTDateParser.MINUTES;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased
                /* renamed from: addToFormat */
                public final void mo24156addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithTime builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    int formatLength = getFormatLength();
                    if (formatLength == 1) {
                        builder.minute(kotlinx.datetime.format.Padding.NONE);
                    } else if (formatLength == 2) {
                        builder.minute(kotlinx.datetime.format.Padding.ZERO);
                    } else {
                        kotlinx.datetime.format.UnicodeKt.access$unknownLength(this);
                        throw new kotlin.KotlinNothingValueException();
                    }
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0005\u0006"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$WithSecondPrecision;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased;", "<init>", "()V", "SecondOfMinute", "Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$WithSecondPrecision$SecondOfMinute;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$WithSubsecondPrecision;"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static abstract class WithSecondPrecision extends kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased {

                @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$WithSecondPrecision$SecondOfMinute;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$WithSecondPrecision;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;)V", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class SecondOfMinute extends kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased.WithSecondPrecision {
                    private final int formatLength;
                    private final char formatLetter;

                    public SecondOfMinute(int i) {
                        super(null);
                        this.formatLength = i;
                        this.formatLetter = io.ktor.util.date.GMTDateParser.SECONDS;
                    }

                    @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                    public final int getFormatLength() {
                        return this.formatLength;
                    }

                    @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                    public final char getFormatLetter() {
                        return this.formatLetter;
                    }

                    @Override // kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased
                    /* renamed from: addToFormat */
                    public final void mo24156addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithTime builder) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                        int formatLength = getFormatLength();
                        if (formatLength == 1) {
                            builder.second(kotlinx.datetime.format.Padding.NONE);
                        } else if (formatLength == 2) {
                            builder.second(kotlinx.datetime.format.Padding.ZERO);
                        } else {
                            kotlinx.datetime.format.UnicodeKt.access$unknownLength(this);
                            throw new kotlin.KotlinNothingValueException();
                        }
                    }
                }

                private WithSecondPrecision() {
                    super(null);
                }

                public /* synthetic */ WithSecondPrecision(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$WithSubsecondPrecision;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$WithSecondPrecision;", "<init>", "()V", "FractionOfSecond", "MilliOfDay", "NanoOfSecond", "NanoOfDay", "Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$WithSubsecondPrecision$FractionOfSecond;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$WithSubsecondPrecision$MilliOfDay;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$WithSubsecondPrecision$NanoOfDay;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$WithSubsecondPrecision$NanoOfSecond;"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static abstract class WithSubsecondPrecision extends kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased.WithSecondPrecision {

                @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$WithSubsecondPrecision$FractionOfSecond;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$WithSubsecondPrecision;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;)V", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class FractionOfSecond extends kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased.WithSubsecondPrecision {
                    private final int formatLength;
                    private final char formatLetter;

                    public FractionOfSecond(int i) {
                        super(null);
                        this.formatLength = i;
                        this.formatLetter = 'S';
                    }

                    @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                    public final int getFormatLength() {
                        return this.formatLength;
                    }

                    @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                    public final char getFormatLetter() {
                        return this.formatLetter;
                    }

                    @Override // kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased
                    /* renamed from: addToFormat */
                    public final void mo24156addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithTime builder) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                        builder.secondFraction(getFormatLength());
                    }
                }

                private WithSubsecondPrecision() {
                    super(null);
                }

                @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$WithSubsecondPrecision$MilliOfDay;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$WithSubsecondPrecision;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;)Ljava/lang/Void;", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class MilliOfDay extends kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased.WithSubsecondPrecision {
                    private final int formatLength;
                    private final char formatLetter;

                    public MilliOfDay(int i) {
                        super(null);
                        this.formatLength = i;
                        this.formatLetter = 'A';
                    }

                    @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                    public final int getFormatLength() {
                        return this.formatLength;
                    }

                    @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                    public final char getFormatLetter() {
                        return this.formatLetter;
                    }

                    @Override // kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased
                    /* renamed from: addToFormat, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Void mo24156addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithTime builder) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                        kotlinx.datetime.format.UnicodeKt.getHighSpeedVideoSizes("millisecond-of-day", null);
                        throw new kotlin.KotlinNothingValueException();
                    }
                }

                @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$WithSubsecondPrecision$NanoOfSecond;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$WithSubsecondPrecision;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;)Ljava/lang/Void;", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class NanoOfSecond extends kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased.WithSubsecondPrecision {
                    private final int formatLength;
                    private final char formatLetter;

                    public NanoOfSecond(int i) {
                        super(null);
                        this.formatLength = i;
                        this.formatLetter = 'n';
                    }

                    @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                    public final int getFormatLength() {
                        return this.formatLength;
                    }

                    @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                    public final char getFormatLetter() {
                        return this.formatLetter;
                    }

                    @Override // kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased
                    /* renamed from: addToFormat, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Void mo24156addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithTime builder) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                        kotlinx.datetime.format.UnicodeKt.getHighSpeedVideoSizes("nano-of-second", "Maybe you meant 'S' instead of 'n'?");
                        throw new kotlin.KotlinNothingValueException();
                    }
                }

                @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$WithSubsecondPrecision$NanoOfDay;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$TimeBased$WithSubsecondPrecision;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;)Ljava/lang/Void;", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class NanoOfDay extends kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased.WithSubsecondPrecision {
                    private final int formatLength;
                    private final char formatLetter;

                    public NanoOfDay(int i) {
                        super(null);
                        this.formatLength = i;
                        this.formatLetter = 'N';
                    }

                    @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                    public final int getFormatLength() {
                        return this.formatLength;
                    }

                    @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                    public final char getFormatLetter() {
                        return this.formatLetter;
                    }

                    @Override // kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased
                    /* renamed from: addToFormat, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Void mo24156addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithTime builder) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                        kotlinx.datetime.format.UnicodeKt.getHighSpeedVideoSizes("nanosecond-of-day", null);
                        throw new kotlin.KotlinNothingValueException();
                    }
                }

                public /* synthetic */ WithSubsecondPrecision(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ TimeBased(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0003\f\r\u000e"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$ZoneBased;", "Lkotlinx/datetime/format/UnicodeFormat$Directive;", "<init>", "()V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTimeComponents;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTimeComponents;)V", "TimeZoneId", "GenericTimeZoneName", "TimeZoneName", "Lkotlinx/datetime/format/UnicodeFormat$Directive$ZoneBased$GenericTimeZoneName;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$ZoneBased$TimeZoneId;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$ZoneBased$TimeZoneName;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class ZoneBased extends kotlinx.datetime.format.UnicodeFormat.Directive {
            /* renamed from: addToFormat */
            public abstract void mo24158addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents builder);

            private ZoneBased() {
                super(null);
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$ZoneBased$TimeZoneId;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$ZoneBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTimeComponents;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTimeComponents;)V", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class TimeZoneId extends kotlinx.datetime.format.UnicodeFormat.Directive.ZoneBased {
                private final int formatLength;
                private final char formatLetter;

                public TimeZoneId(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = 'V';
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.ZoneBased
                /* renamed from: addToFormat */
                public final void mo24158addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    if (getFormatLength() == 2) {
                        builder.timeZoneId();
                    } else {
                        kotlinx.datetime.format.UnicodeKt.access$unknownLength(this);
                        throw new kotlin.KotlinNothingValueException();
                    }
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$ZoneBased$GenericTimeZoneName;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$ZoneBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTimeComponents;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTimeComponents;)Ljava/lang/Void;", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class GenericTimeZoneName extends kotlinx.datetime.format.UnicodeFormat.Directive.ZoneBased {
                private final int formatLength;
                private final char formatLetter;

                public GenericTimeZoneName(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = 'v';
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.ZoneBased
                /* renamed from: addToFormat, reason: merged with bridge method [inline-methods] */
                public final java.lang.Void mo24158addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    kotlinx.datetime.format.UnicodeKt.getHighResolutionOutputSizeshNQ4ISI(this, null);
                    throw new kotlin.KotlinNothingValueException();
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$ZoneBased$TimeZoneName;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$ZoneBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTimeComponents;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTimeComponents;)Ljava/lang/Void;", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class TimeZoneName extends kotlinx.datetime.format.UnicodeFormat.Directive.ZoneBased {
                private final int formatLength;
                private final char formatLetter;

                public TimeZoneName(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = io.ktor.util.date.GMTDateParser.ZONE;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.ZoneBased
                /* renamed from: addToFormat, reason: merged with bridge method [inline-methods] */
                public final java.lang.Void mo24158addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    kotlinx.datetime.format.UnicodeKt.getHighResolutionOutputSizeshNQ4ISI(this, "Format 'V' can be used to format time zone IDs in a locale-invariant manner.");
                    throw new kotlin.KotlinNothingValueException();
                }
            }

            public /* synthetic */ ZoneBased(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\u0010\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0001\u0004\u0016\u0017\u0018\u0019"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$OffsetBased;", "Lkotlinx/datetime/format/UnicodeFormat$Directive;", "<init>", "()V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithUtcOffset;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithUtcOffset;)V", "Lkotlinx/datetime/format/WhenToOutput;", "outputMinutes", "()Lkotlinx/datetime/format/WhenToOutput;", "outputSeconds", "", "zOnZero", "useSeparator", "offset", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithUtcOffset;ZZ)V", "LocalizedZoneOffset", "ZoneOffset1", "ZoneOffset2", "ZoneOffset3", "Lkotlinx/datetime/format/UnicodeFormat$Directive$OffsetBased$LocalizedZoneOffset;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$OffsetBased$ZoneOffset1;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$OffsetBased$ZoneOffset2;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$OffsetBased$ZoneOffset3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class OffsetBased extends kotlinx.datetime.format.UnicodeFormat.Directive {
            /* renamed from: addToFormat */
            public abstract void mo24155addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset builder);

            public abstract kotlinx.datetime.format.WhenToOutput outputMinutes();

            public abstract kotlinx.datetime.format.WhenToOutput outputSeconds();

            private OffsetBased() {
                super(null);
            }

            public final void offset(kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset withUtcOffset, boolean z, boolean z2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withUtcOffset, "");
                kotlinx.datetime.format.UtcOffsetFormatKt.isoOffset(withUtcOffset, z, z2, outputMinutes(), outputSeconds());
            }

            @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0017X\u0097D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$OffsetBased$LocalizedZoneOffset;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$OffsetBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithUtcOffset;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithUtcOffset;)Ljava/lang/Void;", "Lkotlinx/datetime/format/WhenToOutput;", "outputMinutes", "()Lkotlinx/datetime/format/WhenToOutput;", "outputSeconds", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class LocalizedZoneOffset extends kotlinx.datetime.format.UnicodeFormat.Directive.OffsetBased {
                private final int formatLength;
                private final char formatLetter;

                public LocalizedZoneOffset(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = 'O';
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.OffsetBased
                /* renamed from: addToFormat, reason: merged with bridge method [inline-methods] */
                public final java.lang.Void mo24155addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    kotlinx.datetime.format.UnicodeKt.getHighResolutionOutputSizeshNQ4ISI(this, null);
                    throw new kotlin.KotlinNothingValueException();
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.OffsetBased
                public final kotlinx.datetime.format.WhenToOutput outputMinutes() {
                    kotlinx.datetime.format.UnicodeKt.getHighResolutionOutputSizeshNQ4ISI(this, null);
                    throw new kotlin.KotlinNothingValueException();
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.OffsetBased
                public final kotlinx.datetime.format.WhenToOutput outputSeconds() {
                    kotlinx.datetime.format.UnicodeKt.getHighResolutionOutputSizeshNQ4ISI(this, null);
                    throw new kotlin.KotlinNothingValueException();
                }
            }

            @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0017X\u0097D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$OffsetBased$ZoneOffset1;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$OffsetBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithUtcOffset;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithUtcOffset;)V", "Lkotlinx/datetime/format/WhenToOutput;", "outputMinutes", "()Lkotlinx/datetime/format/WhenToOutput;", "outputSeconds", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ZoneOffset1 extends kotlinx.datetime.format.UnicodeFormat.Directive.OffsetBased {
                private final int formatLength;
                private final char formatLetter;

                public ZoneOffset1(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = 'X';
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.OffsetBased
                /* renamed from: addToFormat */
                public final void mo24155addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    int formatLength = getFormatLength();
                    if (formatLength == 1) {
                        offset(builder, true, false);
                        return;
                    }
                    if (formatLength == 2) {
                        offset(builder, true, false);
                        return;
                    }
                    if (formatLength == 3) {
                        offset(builder, true, true);
                        return;
                    }
                    if (formatLength == 4) {
                        offset(builder, true, false);
                    } else if (formatLength == 5) {
                        offset(builder, true, true);
                    } else {
                        kotlinx.datetime.format.UnicodeKt.access$unknownLength(this);
                        throw new kotlin.KotlinNothingValueException();
                    }
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.OffsetBased
                public final kotlinx.datetime.format.WhenToOutput outputMinutes() {
                    return getFormatLength() == 1 ? kotlinx.datetime.format.WhenToOutput.IF_NONZERO : kotlinx.datetime.format.WhenToOutput.ALWAYS;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.OffsetBased
                public final kotlinx.datetime.format.WhenToOutput outputSeconds() {
                    return getFormatLength() <= 3 ? kotlinx.datetime.format.WhenToOutput.NEVER : kotlinx.datetime.format.WhenToOutput.IF_NONZERO;
                }
            }

            @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0017X\u0097D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$OffsetBased$ZoneOffset2;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$OffsetBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithUtcOffset;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithUtcOffset;)V", "Lkotlinx/datetime/format/WhenToOutput;", "outputMinutes", "()Lkotlinx/datetime/format/WhenToOutput;", "outputSeconds", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ZoneOffset2 extends kotlinx.datetime.format.UnicodeFormat.Directive.OffsetBased {
                private final int formatLength;
                private final char formatLetter;

                public ZoneOffset2(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = 'x';
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.OffsetBased
                /* renamed from: addToFormat */
                public final void mo24155addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    int formatLength = getFormatLength();
                    if (formatLength == 1) {
                        offset(builder, false, false);
                        return;
                    }
                    if (formatLength == 2) {
                        offset(builder, false, false);
                        return;
                    }
                    if (formatLength == 3) {
                        offset(builder, false, true);
                        return;
                    }
                    if (formatLength == 4) {
                        offset(builder, false, false);
                    } else if (formatLength == 5) {
                        offset(builder, false, true);
                    } else {
                        kotlinx.datetime.format.UnicodeKt.access$unknownLength(this);
                        throw new kotlin.KotlinNothingValueException();
                    }
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.OffsetBased
                public final kotlinx.datetime.format.WhenToOutput outputMinutes() {
                    return getFormatLength() == 1 ? kotlinx.datetime.format.WhenToOutput.IF_NONZERO : kotlinx.datetime.format.WhenToOutput.ALWAYS;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.OffsetBased
                public final kotlinx.datetime.format.WhenToOutput outputSeconds() {
                    return getFormatLength() <= 3 ? kotlinx.datetime.format.WhenToOutput.NEVER : kotlinx.datetime.format.WhenToOutput.IF_NONZERO;
                }
            }

            @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0017X\u0097D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lkotlinx/datetime/format/UnicodeFormat$Directive$OffsetBased$ZoneOffset3;", "Lkotlinx/datetime/format/UnicodeFormat$Directive$OffsetBased;", "", "formatLength", "<init>", "(I)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithUtcOffset;", "builder", "", "addToFormat", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithUtcOffset;)V", "Lkotlinx/datetime/format/WhenToOutput;", "outputMinutes", "()Lkotlinx/datetime/format/WhenToOutput;", "outputSeconds", com.visa.cbp.getEncExpo.warmup, "getFormatLength", "()I", "", "formatLetter", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFormatLetter", "()C"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ZoneOffset3 extends kotlinx.datetime.format.UnicodeFormat.Directive.OffsetBased {
                private final int formatLength;
                private final char formatLetter;

                public ZoneOffset3(int i) {
                    super(null);
                    this.formatLength = i;
                    this.formatLetter = org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_ZERO;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final int getFormatLength() {
                    return this.formatLength;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive
                public final char getFormatLetter() {
                    return this.formatLetter;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.OffsetBased
                /* renamed from: addToFormat */
                public final void mo24155addToFormat(kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    int formatLength = getFormatLength();
                    if (formatLength == 1 || formatLength == 2 || formatLength == 3) {
                        offset(builder, false, false);
                        return;
                    }
                    if (formatLength == 4) {
                        new kotlinx.datetime.format.UnicodeFormat.Directive.OffsetBased.LocalizedZoneOffset(4).mo24155addToFormat(builder);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (formatLength == 5) {
                        offset(builder, false, true);
                    } else {
                        kotlinx.datetime.format.UnicodeKt.access$unknownLength(this);
                        throw new kotlin.KotlinNothingValueException();
                    }
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.OffsetBased
                public final kotlinx.datetime.format.WhenToOutput outputMinutes() {
                    return kotlinx.datetime.format.WhenToOutput.ALWAYS;
                }

                @Override // kotlinx.datetime.format.UnicodeFormat.Directive.OffsetBased
                public final kotlinx.datetime.format.WhenToOutput outputSeconds() {
                    return getFormatLength() <= 3 ? kotlinx.datetime.format.WhenToOutput.NEVER : kotlinx.datetime.format.WhenToOutput.IF_NONZERO;
                }
            }

            public /* synthetic */ OffsetBased(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Directive(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
