package kotlin.text;

@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 A2\u00060\u0001j\u0002`\u0002:\u0002BAB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fB\u001f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u0005\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0086\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0014J!\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0016¢\u0006\u0004\b!\u0010\u001aJ\u001d\u0010\"\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J)\u0010%\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100'¢\u0006\u0004\b%\u0010)J\u001d\u0010*\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0007¢\u0006\u0004\b*\u0010&J%\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070,2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010+\u001a\u00020\u0016¢\u0006\u0004\b-\u0010.J%\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070\u001b2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010+\u001a\u00020\u0016¢\u0006\u0004\b/\u0010\u001dJ\u000f\u00100\u001a\u00020\u0007H\u0016¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0003¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u0002082\u0006\u0010\u0011\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010;R\u0011\u0010\b\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b<\u00101R\u001e\u0010=\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r8G¢\u0006\u0006\u001a\u0004\b?\u0010@"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Camera2StreamConfigurationMap;", "Ljava/util/regex/Pattern;", "nativePattern", "<init>", "(Ljava/util/regex/Pattern;)V", "", "pattern", "(Ljava/lang/String;)V", "Lkotlin/text/RegexOption;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "", "options", "(Ljava/lang/String;Ljava/util/Set;)V", "", "input", "", "matches", "(Ljava/lang/CharSequence;)Z", "containsMatchIn", "", "startIndex", "Lkotlin/text/MatchResult;", "find", "(Ljava/lang/CharSequence;I)Lkotlin/text/MatchResult;", "Lkotlin/sequences/Sequence;", "findAll", "(Ljava/lang/CharSequence;I)Lkotlin/sequences/Sequence;", "matchEntire", "(Ljava/lang/CharSequence;)Lkotlin/text/MatchResult;", "index", "matchAt", "matchesAt", "(Ljava/lang/CharSequence;I)Z", "replacement", "replace", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function1;", "transform", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "replaceFirst", "limit", "", "split", "(Ljava/lang/CharSequence;I)Ljava/util/List;", "splitToSequence", "toString", "()Ljava/lang/String;", "toPattern", "()Ljava/util/regex/Pattern;", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "Ljava/util/regex/Pattern;", "getPattern", "_options", "Ljava/util/Set;", "getOptions", "()Ljava/util/Set;", "Companion", "Serialized"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Regex implements java.io.Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.text.Regex.Companion INSTANCE = new kotlin.text.Regex.Companion(null);
    private java.util.Set<? extends kotlin.text.RegexOption> _options;
    private final java.util.regex.Pattern nativePattern;

    public Regex(java.util.regex.Pattern pattern) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "");
        this.nativePattern = pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Regex(java.lang.String str) {
        this(r2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compile, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Regex(java.lang.String str, kotlin.text.RegexOption regexOption) {
        this(r3);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regexOption, "");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(str, kotlin.text.Regex.Companion.access$ensureUnicodeCase(INSTANCE, regexOption.getValue()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compile, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Regex(java.lang.String str, java.util.Set<? extends kotlin.text.RegexOption> set) {
        this(r3);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(str, kotlin.text.Regex.Companion.access$ensureUnicodeCase(INSTANCE, kotlin.text.RegexKt.access$toInt(set)));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compile, "");
    }

    public final java.lang.String getPattern() {
        java.lang.String pattern = this.nativePattern.pattern();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pattern, "");
        return pattern;
    }

    public final java.util.Set<kotlin.text.RegexOption> getOptions() {
        java.util.Set set = this._options;
        if (set != null) {
            return set;
        }
        final int flags = this.nativePattern.flags();
        java.util.EnumSet allOf = java.util.EnumSet.allOf(kotlin.text.RegexOption.class);
        kotlin.jvm.internal.Intrinsics.checkNotNull(allOf);
        kotlin.collections.CollectionsKt.retainAll(allOf, new kotlin.jvm.functions.Function1<kotlin.text.RegexOption, java.lang.Boolean>() { // from class: kotlin.text.Regex$special$$inlined$fromInt$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(kotlin.text.RegexOption regexOption) {
                kotlin.text.RegexOption regexOption2 = regexOption;
                return java.lang.Boolean.valueOf((flags & regexOption2.getMask()) == regexOption2.getValue());
            }
        });
        java.util.Set<kotlin.text.RegexOption> unmodifiableSet = java.util.Collections.unmodifiableSet(allOf);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "");
        this._options = unmodifiableSet;
        return unmodifiableSet;
    }

    public final boolean matches(java.lang.CharSequence input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return this.nativePattern.matcher(input).matches();
    }

    public final boolean containsMatchIn(java.lang.CharSequence input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return this.nativePattern.matcher(input).find();
    }

    public static /* synthetic */ kotlin.text.MatchResult find$default(kotlin.text.Regex regex, java.lang.CharSequence charSequence, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.find(charSequence, i);
    }

    public final kotlin.text.MatchResult find(java.lang.CharSequence input, int startIndex) {
        kotlin.text.MatchResult highResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.util.regex.Matcher matcher = this.nativePattern.matcher(input);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(matcher, "");
        highResolutionOutputSizeshNQ4ISI = kotlin.text.RegexKt.getHighResolutionOutputSizeshNQ4ISI(matcher, startIndex, input);
        return highResolutionOutputSizeshNQ4ISI;
    }

    public static /* synthetic */ kotlin.sequences.Sequence findAll$default(kotlin.text.Regex regex, java.lang.CharSequence charSequence, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.findAll(charSequence, i);
    }

    public final kotlin.sequences.Sequence<kotlin.text.MatchResult> findAll(final java.lang.CharSequence input, final int startIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        if (startIndex < 0 || startIndex > input.length()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Start index out of bounds: ");
            sb.append(startIndex);
            sb.append(", input length: ");
            sb.append(input.length());
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        return kotlin.sequences.SequencesKt.generateSequence(new kotlin.jvm.functions.Function0() { // from class: kotlin.text.Regex$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.text.MatchResult find;
                find = kotlin.text.Regex.this.find(input, startIndex);
                return find;
            }
        }, (kotlin.jvm.functions.Function1) kotlin.text.Regex$findAll$2.Camera2StreamConfigurationMap);
    }

    public final kotlin.text.MatchResult matchEntire(java.lang.CharSequence input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.util.regex.Matcher matcher = this.nativePattern.matcher(input);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(matcher, "");
        return kotlin.text.RegexKt.access$matchEntire(matcher, input);
    }

    public final kotlin.text.MatchResult matchAt(java.lang.CharSequence input, int index) {
        kotlin.text.MatcherMatchResult matcherMatchResult;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.util.regex.Matcher region = this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(index, input.length());
        if (region.lookingAt()) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(region);
            matcherMatchResult = new kotlin.text.MatcherMatchResult(region, input);
        } else {
            matcherMatchResult = null;
        }
        return matcherMatchResult;
    }

    public final boolean matchesAt(java.lang.CharSequence input, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(index, input.length()).lookingAt();
    }

    public final java.lang.String replace(java.lang.CharSequence input, java.lang.String replacement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacement, "");
        java.lang.String replaceAll = this.nativePattern.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(replaceAll, "");
        return replaceAll;
    }

    public final java.lang.String replace(java.lang.CharSequence input, kotlin.jvm.functions.Function1<? super kotlin.text.MatchResult, ? extends java.lang.CharSequence> transform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transform, "");
        int i = 0;
        kotlin.text.MatchResult find$default = find$default(this, input, 0, 2, null);
        if (find$default == null) {
            return input.toString();
        }
        int length = input.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length);
        do {
            sb.append(input, i, find$default.getRange().getStart().intValue());
            sb.append(transform.invoke(find$default));
            i = find$default.getRange().getEndInclusive().intValue() + 1;
            find$default = find$default.next();
            if (i >= length) {
                break;
            }
        } while (find$default != null);
        if (i < length) {
            sb.append(input, i, length);
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final java.lang.String replaceFirst(java.lang.CharSequence input, java.lang.String replacement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacement, "");
        java.lang.String replaceFirst = this.nativePattern.matcher(input).replaceFirst(replacement);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(replaceFirst, "");
        return replaceFirst;
    }

    public static /* synthetic */ java.util.List split$default(kotlin.text.Regex regex, java.lang.CharSequence charSequence, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.split(charSequence, i);
    }

    public final java.util.List<java.lang.String> split(java.lang.CharSequence input, int limit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        kotlin.text.StringsKt.requireNonNegativeLimit(limit);
        java.util.regex.Matcher matcher = this.nativePattern.matcher(input);
        if (limit == 1 || !matcher.find()) {
            return kotlin.collections.CollectionsKt.listOf(input.toString());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(limit > 0 ? kotlin.ranges.RangesKt.coerceAtMost(limit, 10) : 10);
        int i = limit - 1;
        int i2 = 0;
        do {
            arrayList.add(input.subSequence(i2, matcher.start()).toString());
            i2 = matcher.end();
            if (i >= 0 && arrayList.size() == i) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(i2, input.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ kotlin.sequences.Sequence splitToSequence$default(kotlin.text.Regex regex, java.lang.CharSequence charSequence, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.splitToSequence(charSequence, i);
    }

    public final kotlin.sequences.Sequence<java.lang.String> splitToSequence(java.lang.CharSequence input, int limit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        kotlin.text.StringsKt.requireNonNegativeLimit(limit);
        return kotlin.sequences.SequencesKt.sequence(new kotlin.text.Regex$splitToSequence$1(this, input, limit, null));
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.nativePattern.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    /* renamed from: toPattern, reason: from getter */
    public final java.util.regex.Pattern getNativePattern() {
        return this.nativePattern;
    }

    private final java.lang.Object writeReplace() {
        java.lang.String pattern = this.nativePattern.pattern();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pattern, "");
        return new kotlin.text.Regex.Serialized(pattern, this.nativePattern.flags());
    }

    private final void readObject(java.io.ObjectInputStream input) {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0002\u0018\u0000 \u00112\u00060\u0001j\u0002`\u0002:\u0001\u0011B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Camera2StreamConfigurationMap;", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;I)V", "", "readResolve", "()Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes17.dex */
    static final class Serialized implements java.io.Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoSizes;
        private final int getHighSpeedVideoFpsRangesFor;

        public Serialized(java.lang.String str, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.getHighSpeedVideoSizes = str;
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        private final java.lang.Object readResolve() {
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compile, "");
            return new kotlin.text.Regex(compile);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Lkotlin/text/Regex$Companion;", "", "<init>", "()V", "", "literal", "Lkotlin/text/Regex;", "fromLiteral", "(Ljava/lang/String;)Lkotlin/text/Regex;", "escape", "(Ljava/lang/String;)Ljava/lang/String;", "escapeReplacement"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public static final /* synthetic */ int access$ensureUnicodeCase(kotlin.text.Regex.Companion companion, int i) {
            return (i & 2) != 0 ? i | 64 : i;
        }

        private Companion() {
        }

        public final kotlin.text.Regex fromLiteral(java.lang.String literal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(literal, "");
            return new kotlin.text.Regex(literal, kotlin.text.RegexOption.LITERAL);
        }

        public final java.lang.String escape(java.lang.String literal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(literal, "");
            java.lang.String quote = java.util.regex.Pattern.quote(literal);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(quote, "");
            return quote;
        }

        public final java.lang.String escapeReplacement(java.lang.String literal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(literal, "");
            java.lang.String quoteReplacement = java.util.regex.Matcher.quoteReplacement(literal);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(quoteReplacement, "");
            return quoteReplacement;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
