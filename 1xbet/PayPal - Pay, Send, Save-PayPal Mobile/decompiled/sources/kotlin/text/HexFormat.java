package kotlin.text;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 \u00162\u00020\u0001:\u0004\u0017\u0018\u0019\u0016B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lkotlin/text/HexFormat;", "", "", "upperCase", "Lkotlin/text/HexFormat$BytesHexFormat;", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "Lkotlin/text/HexFormat$NumberHexFormat;", "number", "<init>", "(ZLkotlin/text/HexFormat$BytesHexFormat;Lkotlin/text/HexFormat$NumberHexFormat;)V", "", "toString", "()Ljava/lang/String;", "Z", "getUpperCase", "()Z", "Lkotlin/text/HexFormat$BytesHexFormat;", "getBytes", "()Lkotlin/text/HexFormat$BytesHexFormat;", "Lkotlin/text/HexFormat$NumberHexFormat;", "getNumber", "()Lkotlin/text/HexFormat$NumberHexFormat;", "Companion", "BytesHexFormat", "NumberHexFormat", "Builder"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HexFormat {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.text.HexFormat.Companion INSTANCE = new kotlin.text.HexFormat.Companion(null);
    private static final kotlin.text.HexFormat Default = new kotlin.text.HexFormat(false, kotlin.text.HexFormat.BytesHexFormat.INSTANCE.getDefault$kotlin_stdlib(), kotlin.text.HexFormat.NumberHexFormat.INSTANCE.getDefault$kotlin_stdlib());
    private static final kotlin.text.HexFormat UpperCase = new kotlin.text.HexFormat(true, kotlin.text.HexFormat.BytesHexFormat.INSTANCE.getDefault$kotlin_stdlib(), kotlin.text.HexFormat.NumberHexFormat.INSTANCE.getDefault$kotlin_stdlib());
    private final kotlin.text.HexFormat.BytesHexFormat bytes;
    private final kotlin.text.HexFormat.NumberHexFormat number;
    private final boolean upperCase;

    public HexFormat(boolean z, kotlin.text.HexFormat.BytesHexFormat bytesHexFormat, kotlin.text.HexFormat.NumberHexFormat numberHexFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytesHexFormat, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(numberHexFormat, "");
        this.upperCase = z;
        this.bytes = bytesHexFormat;
        this.number = numberHexFormat;
    }

    public final boolean getUpperCase() {
        return this.upperCase;
    }

    public final kotlin.text.HexFormat.BytesHexFormat getBytes() {
        return this.bytes;
    }

    public final kotlin.text.HexFormat.NumberHexFormat getNumber() {
        return this.number;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("HexFormat(\n    upperCase = ");
        sb.append(this.upperCase);
        sb.append(",\n    bytes = BytesHexFormat(\n");
        this.bytes.appendOptionsTo$kotlin_stdlib(sb, "        ").append('\n');
        sb.append("    ),\n");
        sb.append("    number = NumberHexFormat(\n");
        this.number.appendOptionsTo$kotlin_stdlib(sb, "        ").append('\n');
        sb.append("    )\n");
        sb.append(")");
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 &2\u00020\u0001:\u0002'&B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00060\u000ej\u0002`\u000f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001a\u0010\rR\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u001e\u001a\u00020\u001d8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u001d8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001a\u0010$\u001a\u00020\u001d8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat;", "", "", "bytesPerLine", "bytesPerGroup", "", "groupSeparator", "byteSeparator", "bytePrefix", "byteSuffix", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "sb", "indent", "appendOptionsTo$kotlin_stdlib", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", com.visa.cbp.getEncExpo.warmup, "getBytesPerLine", "()I", "getBytesPerGroup", "Ljava/lang/String;", "getGroupSeparator", "getByteSeparator", "getBytePrefix", "getByteSuffix", "", "noLineAndGroupSeparator", "Z", "getNoLineAndGroupSeparator$kotlin_stdlib", "()Z", "shortByteSeparatorNoPrefixAndSuffix", "getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib", "ignoreCase", "getIgnoreCase$kotlin_stdlib", "Companion", "Builder"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BytesHexFormat {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final kotlin.text.HexFormat.BytesHexFormat.Companion INSTANCE = new kotlin.text.HexFormat.BytesHexFormat.Companion(null);
        private static final kotlin.text.HexFormat.BytesHexFormat Default = new kotlin.text.HexFormat.BytesHexFormat(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");
        private final java.lang.String bytePrefix;
        private final java.lang.String byteSeparator;
        private final java.lang.String byteSuffix;
        private final int bytesPerGroup;
        private final int bytesPerLine;
        private final java.lang.String groupSeparator;
        private final boolean ignoreCase;
        private final boolean noLineAndGroupSeparator;
        private final boolean shortByteSeparatorNoPrefixAndSuffix;

        public BytesHexFormat(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.bytesPerLine = i;
            this.bytesPerGroup = i2;
            this.groupSeparator = str;
            this.byteSeparator = str2;
            this.bytePrefix = str3;
            this.byteSuffix = str4;
            this.noLineAndGroupSeparator = i == Integer.MAX_VALUE && i2 == Integer.MAX_VALUE;
            this.shortByteSeparatorNoPrefixAndSuffix = str3.length() == 0 && str4.length() == 0 && str2.length() <= 1;
            this.ignoreCase = kotlin.text.HexFormatKt.access$isCaseSensitive(str) || kotlin.text.HexFormatKt.access$isCaseSensitive(str2) || kotlin.text.HexFormatKt.access$isCaseSensitive(str3) || kotlin.text.HexFormatKt.access$isCaseSensitive(str4);
        }

        public final int getBytesPerLine() {
            return this.bytesPerLine;
        }

        public final int getBytesPerGroup() {
            return this.bytesPerGroup;
        }

        public final java.lang.String getGroupSeparator() {
            return this.groupSeparator;
        }

        public final java.lang.String getByteSeparator() {
            return this.byteSeparator;
        }

        public final java.lang.String getBytePrefix() {
            return this.bytePrefix;
        }

        public final java.lang.String getByteSuffix() {
            return this.byteSuffix;
        }

        /* renamed from: getNoLineAndGroupSeparator$kotlin_stdlib, reason: from getter */
        public final boolean getNoLineAndGroupSeparator() {
            return this.noLineAndGroupSeparator;
        }

        /* renamed from: getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib, reason: from getter */
        public final boolean getShortByteSeparatorNoPrefixAndSuffix() {
            return this.shortByteSeparatorNoPrefixAndSuffix;
        }

        /* renamed from: getIgnoreCase$kotlin_stdlib, reason: from getter */
        public final boolean getIgnoreCase() {
            return this.ignoreCase;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("BytesHexFormat(\n");
            appendOptionsTo$kotlin_stdlib(sb, "    ").append('\n');
            sb.append(")");
            return sb.toString();
        }

        public final java.lang.StringBuilder appendOptionsTo$kotlin_stdlib(java.lang.StringBuilder sb, java.lang.String indent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(indent, "");
            sb.append(indent);
            sb.append("bytesPerLine = ");
            sb.append(this.bytesPerLine);
            sb.append(",\n");
            sb.append(indent);
            sb.append("bytesPerGroup = ");
            sb.append(this.bytesPerGroup);
            sb.append(",\n");
            sb.append(indent);
            sb.append("groupSeparator = \"");
            sb.append(this.groupSeparator);
            sb.append("\",\n");
            sb.append(indent);
            sb.append("byteSeparator = \"");
            sb.append(this.byteSeparator);
            sb.append("\",\n");
            sb.append(indent);
            sb.append("bytePrefix = \"");
            sb.append(this.bytePrefix);
            sb.append("\",\n");
            sb.append(indent);
            sb.append("byteSuffix = \"");
            sb.append(this.byteSuffix);
            sb.append("\"");
            return sb;
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\"\u0010\u0013\u001a\u00020\u00128\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0019\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00128\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R*\u0010\u001c\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00128\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R*\u0010\u001f\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00128\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "", "<init>", "()V", "Lkotlin/text/HexFormat$BytesHexFormat;", "build$kotlin_stdlib", "()Lkotlin/text/HexFormat$BytesHexFormat;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "bytesPerLine", com.visa.cbp.getEncExpo.warmup, "getBytesPerLine", "()I", "setBytesPerLine", "(I)V", "bytesPerGroup", "getBytesPerGroup", "setBytesPerGroup", "", "groupSeparator", "Ljava/lang/String;", "getGroupSeparator", "()Ljava/lang/String;", "setGroupSeparator", "(Ljava/lang/String;)V", "byteSeparator", "getByteSeparator", "setByteSeparator", "bytePrefix", "getBytePrefix", "setBytePrefix", "byteSuffix", "getByteSuffix", "setByteSuffix"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder {
            private int bytesPerLine = kotlin.text.HexFormat.BytesHexFormat.INSTANCE.getDefault$kotlin_stdlib().getBytesPerLine();
            private int bytesPerGroup = kotlin.text.HexFormat.BytesHexFormat.INSTANCE.getDefault$kotlin_stdlib().getBytesPerGroup();
            private java.lang.String groupSeparator = kotlin.text.HexFormat.BytesHexFormat.INSTANCE.getDefault$kotlin_stdlib().getGroupSeparator();
            private java.lang.String byteSeparator = kotlin.text.HexFormat.BytesHexFormat.INSTANCE.getDefault$kotlin_stdlib().getByteSeparator();
            private java.lang.String bytePrefix = kotlin.text.HexFormat.BytesHexFormat.INSTANCE.getDefault$kotlin_stdlib().getBytePrefix();
            private java.lang.String byteSuffix = kotlin.text.HexFormat.BytesHexFormat.INSTANCE.getDefault$kotlin_stdlib().getByteSuffix();

            public final int getBytesPerLine() {
                return this.bytesPerLine;
            }

            public final void setBytesPerLine(int i) {
                if (i <= 0) {
                    throw new java.lang.IllegalArgumentException("Non-positive values are prohibited for bytesPerLine, but was ".concat(java.lang.String.valueOf(i)));
                }
                this.bytesPerLine = i;
            }

            public final int getBytesPerGroup() {
                return this.bytesPerGroup;
            }

            public final void setBytesPerGroup(int i) {
                if (i <= 0) {
                    throw new java.lang.IllegalArgumentException("Non-positive values are prohibited for bytesPerGroup, but was ".concat(java.lang.String.valueOf(i)));
                }
                this.bytesPerGroup = i;
            }

            public final java.lang.String getGroupSeparator() {
                return this.groupSeparator;
            }

            public final void setGroupSeparator(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.groupSeparator = str;
            }

            public final java.lang.String getByteSeparator() {
                return this.byteSeparator;
            }

            public final void setByteSeparator(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                java.lang.String str2 = str;
                if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, '\n', false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, '\r', false, 2, (java.lang.Object) null)) {
                    throw new java.lang.IllegalArgumentException("LF and CR characters are prohibited in byteSeparator, but was ".concat(java.lang.String.valueOf(str)));
                }
                this.byteSeparator = str;
            }

            public final java.lang.String getBytePrefix() {
                return this.bytePrefix;
            }

            public final void setBytePrefix(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                java.lang.String str2 = str;
                if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, '\n', false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, '\r', false, 2, (java.lang.Object) null)) {
                    throw new java.lang.IllegalArgumentException("LF and CR characters are prohibited in bytePrefix, but was ".concat(java.lang.String.valueOf(str)));
                }
                this.bytePrefix = str;
            }

            public final java.lang.String getByteSuffix() {
                return this.byteSuffix;
            }

            public final void setByteSuffix(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                java.lang.String str2 = str;
                if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, '\n', false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, '\r', false, 2, (java.lang.Object) null)) {
                    throw new java.lang.IllegalArgumentException("LF and CR characters are prohibited in byteSuffix, but was ".concat(java.lang.String.valueOf(str)));
                }
                this.byteSuffix = str;
            }

            public final kotlin.text.HexFormat.BytesHexFormat build$kotlin_stdlib() {
                return new kotlin.text.HexFormat.BytesHexFormat(this.bytesPerLine, this.bytesPerGroup, this.groupSeparator, this.byteSeparator, this.bytePrefix, this.byteSuffix);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat$Companion;", "", "<init>", "()V", "Lkotlin/text/HexFormat$BytesHexFormat;", "Default", "Lkotlin/text/HexFormat$BytesHexFormat;", "getDefault$kotlin_stdlib", "()Lkotlin/text/HexFormat$BytesHexFormat;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final kotlin.text.HexFormat.BytesHexFormat getDefault$kotlin_stdlib() {
                return kotlin.text.HexFormat.BytesHexFormat.Default;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 $2\u00020\u0001:\u0002%$B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00060\rj\u0002`\u000e2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\b\u001a\u00020\u00078\u0007¢\u0006\u0012\n\u0004\b\b\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\u001a\u0010 \u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018R\u001a\u0010\"\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat;", "", "", "prefix", "suffix", "", "removeLeadingZeros", "", "minLength", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "toString", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "sb", "indent", "appendOptionsTo$kotlin_stdlib", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "Ljava/lang/String;", "getPrefix", "getSuffix", "Z", "getRemoveLeadingZeros", "()Z", com.visa.cbp.getEncExpo.warmup, "getMinLength", "()I", "getMinLength$annotations", "()V", "isDigitsOnly", "isDigitsOnly$kotlin_stdlib", "isDigitsOnlyAndNoPadding", "isDigitsOnlyAndNoPadding$kotlin_stdlib", "ignoreCase", "getIgnoreCase$kotlin_stdlib", "Companion", "Builder"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NumberHexFormat {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final kotlin.text.HexFormat.NumberHexFormat.Companion INSTANCE = new kotlin.text.HexFormat.NumberHexFormat.Companion(null);
        private static final kotlin.text.HexFormat.NumberHexFormat Default = new kotlin.text.HexFormat.NumberHexFormat("", "", false, 1);
        private final boolean ignoreCase;
        private final boolean isDigitsOnly;
        private final boolean isDigitsOnlyAndNoPadding;
        private final int minLength;
        private final java.lang.String prefix;
        private final boolean removeLeadingZeros;
        private final java.lang.String suffix;

        public static /* synthetic */ void getMinLength$annotations() {
        }

        public NumberHexFormat(java.lang.String str, java.lang.String str2, boolean z, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.prefix = str;
            this.suffix = str2;
            this.removeLeadingZeros = z;
            this.minLength = i;
            boolean z2 = str.length() == 0 && str2.length() == 0;
            this.isDigitsOnly = z2;
            this.isDigitsOnlyAndNoPadding = z2 && i == 1;
            this.ignoreCase = kotlin.text.HexFormatKt.access$isCaseSensitive(str) || kotlin.text.HexFormatKt.access$isCaseSensitive(str2);
        }

        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        public final java.lang.String getSuffix() {
            return this.suffix;
        }

        public final boolean getRemoveLeadingZeros() {
            return this.removeLeadingZeros;
        }

        public final int getMinLength() {
            return this.minLength;
        }

        /* renamed from: isDigitsOnly$kotlin_stdlib, reason: from getter */
        public final boolean getIsDigitsOnly() {
            return this.isDigitsOnly;
        }

        /* renamed from: isDigitsOnlyAndNoPadding$kotlin_stdlib, reason: from getter */
        public final boolean getIsDigitsOnlyAndNoPadding() {
            return this.isDigitsOnlyAndNoPadding;
        }

        /* renamed from: getIgnoreCase$kotlin_stdlib, reason: from getter */
        public final boolean getIgnoreCase() {
            return this.ignoreCase;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("NumberHexFormat(\n");
            appendOptionsTo$kotlin_stdlib(sb, "    ").append('\n');
            sb.append(")");
            return sb.toString();
        }

        public final java.lang.StringBuilder appendOptionsTo$kotlin_stdlib(java.lang.StringBuilder sb, java.lang.String indent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(indent, "");
            sb.append(indent);
            sb.append("prefix = \"");
            sb.append(this.prefix);
            sb.append("\",\n");
            sb.append(indent);
            sb.append("suffix = \"");
            sb.append(this.suffix);
            sb.append("\",\n");
            sb.append(indent);
            sb.append("removeLeadingZeros = ");
            sb.append(this.removeLeadingZeros);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            sb.append('\n');
            sb.append(indent);
            sb.append("minLength = ");
            sb.append(this.minLength);
            return sb;
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\"\u0010\u0013\u001a\u00020\u00128\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R0\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198\u0007@GX\u0086\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "", "<init>", "()V", "Lkotlin/text/HexFormat$NumberHexFormat;", "build$kotlin_stdlib", "()Lkotlin/text/HexFormat$NumberHexFormat;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "prefix", "Ljava/lang/String;", "getPrefix", "()Ljava/lang/String;", "setPrefix", "(Ljava/lang/String;)V", "suffix", "getSuffix", "setSuffix", "", "removeLeadingZeros", "Z", "getRemoveLeadingZeros", "()Z", "setRemoveLeadingZeros", "(Z)V", "", "minLength", com.visa.cbp.getEncExpo.warmup, "getMinLength", "()I", "setMinLength", "(I)V", "getMinLength$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder {
            private java.lang.String prefix = kotlin.text.HexFormat.NumberHexFormat.INSTANCE.getDefault$kotlin_stdlib().getPrefix();
            private java.lang.String suffix = kotlin.text.HexFormat.NumberHexFormat.INSTANCE.getDefault$kotlin_stdlib().getSuffix();
            private boolean removeLeadingZeros = kotlin.text.HexFormat.NumberHexFormat.INSTANCE.getDefault$kotlin_stdlib().getRemoveLeadingZeros();
            private int minLength = kotlin.text.HexFormat.NumberHexFormat.INSTANCE.getDefault$kotlin_stdlib().getMinLength();

            public static /* synthetic */ void getMinLength$annotations() {
            }

            public final java.lang.String getPrefix() {
                return this.prefix;
            }

            public final void setPrefix(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                java.lang.String str2 = str;
                if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, '\n', false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, '\r', false, 2, (java.lang.Object) null)) {
                    throw new java.lang.IllegalArgumentException("LF and CR characters are prohibited in prefix, but was ".concat(java.lang.String.valueOf(str)));
                }
                this.prefix = str;
            }

            public final java.lang.String getSuffix() {
                return this.suffix;
            }

            public final void setSuffix(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                java.lang.String str2 = str;
                if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, '\n', false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, '\r', false, 2, (java.lang.Object) null)) {
                    throw new java.lang.IllegalArgumentException("LF and CR characters are prohibited in suffix, but was ".concat(java.lang.String.valueOf(str)));
                }
                this.suffix = str;
            }

            public final boolean getRemoveLeadingZeros() {
                return this.removeLeadingZeros;
            }

            public final void setRemoveLeadingZeros(boolean z) {
                this.removeLeadingZeros = z;
            }

            public final int getMinLength() {
                return this.minLength;
            }

            public final void setMinLength(int i) {
                if (i <= 0) {
                    throw new java.lang.IllegalArgumentException("Non-positive values are prohibited for minLength, but was ".concat(java.lang.String.valueOf(i)).toString());
                }
                this.minLength = i;
            }

            public final kotlin.text.HexFormat.NumberHexFormat build$kotlin_stdlib() {
                return new kotlin.text.HexFormat.NumberHexFormat(this.prefix, this.suffix, this.removeLeadingZeros, this.minLength);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat$Companion;", "", "<init>", "()V", "Lkotlin/text/HexFormat$NumberHexFormat;", "Default", "Lkotlin/text/HexFormat$NumberHexFormat;", "getDefault$kotlin_stdlib", "()Lkotlin/text/HexFormat$NumberHexFormat;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final kotlin.text.HexFormat.NumberHexFormat getDefault$kotlin_stdlib() {
                return kotlin.text.HexFormat.NumberHexFormat.Default;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lkotlin/text/HexFormat$Builder;", "", "<init>", "()V", "Lkotlin/text/HexFormat;", "build", "()Lkotlin/text/HexFormat;", "", "upperCase", "Z", "getUpperCase", "()Z", "setUpperCase", "(Z)V", "Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "getBytes", "()Lkotlin/text/HexFormat$BytesHexFormat$Builder;", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "getHighSpeedVideoSizes", "Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "getNumber", "()Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "number", "getHighSpeedVideoFpsRanges", "Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private kotlin.text.HexFormat.NumberHexFormat.Builder getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private kotlin.text.HexFormat.BytesHexFormat.Builder getHighSpeedVideoFpsRangesFor;
        private boolean upperCase = kotlin.text.HexFormat.INSTANCE.getDefault().getUpperCase();

        public final boolean getUpperCase() {
            return this.upperCase;
        }

        public final void setUpperCase(boolean z) {
            this.upperCase = z;
        }

        public final kotlin.text.HexFormat.BytesHexFormat.Builder getBytes() {
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                this.getHighSpeedVideoFpsRangesFor = new kotlin.text.HexFormat.BytesHexFormat.Builder();
            }
            kotlin.text.HexFormat.BytesHexFormat.Builder builder = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(builder);
            return builder;
        }

        public final kotlin.text.HexFormat.NumberHexFormat.Builder getNumber() {
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                this.getHighResolutionOutputSizeshNQ4ISI = new kotlin.text.HexFormat.NumberHexFormat.Builder();
            }
            kotlin.text.HexFormat.NumberHexFormat.Builder builder = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(builder);
            return builder;
        }

        public final kotlin.text.HexFormat build() {
            kotlin.text.HexFormat.BytesHexFormat default$kotlin_stdlib;
            kotlin.text.HexFormat.NumberHexFormat default$kotlin_stdlib2;
            boolean z = this.upperCase;
            kotlin.text.HexFormat.BytesHexFormat.Builder builder = this.getHighSpeedVideoFpsRangesFor;
            if (builder == null || (default$kotlin_stdlib = builder.build$kotlin_stdlib()) == null) {
                default$kotlin_stdlib = kotlin.text.HexFormat.BytesHexFormat.INSTANCE.getDefault$kotlin_stdlib();
            }
            kotlin.text.HexFormat.NumberHexFormat.Builder builder2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (builder2 == null || (default$kotlin_stdlib2 = builder2.build$kotlin_stdlib()) == null) {
                default$kotlin_stdlib2 = kotlin.text.HexFormat.NumberHexFormat.INSTANCE.getDefault$kotlin_stdlib();
            }
            return new kotlin.text.HexFormat(z, default$kotlin_stdlib, default$kotlin_stdlib2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lkotlin/text/HexFormat$Companion;", "", "<init>", "()V", "Lkotlin/text/HexFormat;", "Default", "Lkotlin/text/HexFormat;", "getDefault", "()Lkotlin/text/HexFormat;", "UpperCase", "getUpperCase"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlin.text.HexFormat getDefault() {
            return kotlin.text.HexFormat.Default;
        }

        public final kotlin.text.HexFormat getUpperCase() {
            return kotlin.text.HexFormat.UpperCase;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
