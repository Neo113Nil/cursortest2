package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e"}, d2 = {"Lkotlin/text/CharDirectionality;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "Companion", "UNDEFINED", "LEFT_TO_RIGHT", "RIGHT_TO_LEFT", "RIGHT_TO_LEFT_ARABIC", "EUROPEAN_NUMBER", "EUROPEAN_NUMBER_SEPARATOR", "EUROPEAN_NUMBER_TERMINATOR", "ARABIC_NUMBER", "COMMON_NUMBER_SEPARATOR", "NONSPACING_MARK", "BOUNDARY_NEUTRAL", "PARAGRAPH_SEPARATOR", "SEGMENT_SEPARATOR", "WHITESPACE", "OTHER_NEUTRALS", "LEFT_TO_RIGHT_EMBEDDING", "LEFT_TO_RIGHT_OVERRIDE", "RIGHT_TO_LEFT_EMBEDDING", "RIGHT_TO_LEFT_OVERRIDE", "POP_DIRECTIONAL_FORMAT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CharDirectionality {
    public static final kotlin.text.CharDirectionality ARABIC_NUMBER;
    public static final kotlin.text.CharDirectionality BOUNDARY_NEUTRAL;
    public static final kotlin.text.CharDirectionality COMMON_NUMBER_SEPARATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.text.CharDirectionality.Companion INSTANCE;
    public static final kotlin.text.CharDirectionality EUROPEAN_NUMBER;
    public static final kotlin.text.CharDirectionality EUROPEAN_NUMBER_SEPARATOR;
    public static final kotlin.text.CharDirectionality EUROPEAN_NUMBER_TERMINATOR;
    public static final kotlin.text.CharDirectionality LEFT_TO_RIGHT;
    public static final kotlin.text.CharDirectionality LEFT_TO_RIGHT_EMBEDDING;
    public static final kotlin.text.CharDirectionality LEFT_TO_RIGHT_OVERRIDE;
    public static final kotlin.text.CharDirectionality NONSPACING_MARK;
    public static final kotlin.text.CharDirectionality OTHER_NEUTRALS;
    public static final kotlin.text.CharDirectionality PARAGRAPH_SEPARATOR;
    public static final kotlin.text.CharDirectionality POP_DIRECTIONAL_FORMAT;
    public static final kotlin.text.CharDirectionality RIGHT_TO_LEFT;
    public static final kotlin.text.CharDirectionality RIGHT_TO_LEFT_ARABIC;
    public static final kotlin.text.CharDirectionality RIGHT_TO_LEFT_EMBEDDING;
    public static final kotlin.text.CharDirectionality RIGHT_TO_LEFT_OVERRIDE;
    public static final kotlin.text.CharDirectionality SEGMENT_SEPARATOR;
    public static final kotlin.text.CharDirectionality UNDEFINED;
    public static final kotlin.text.CharDirectionality WHITESPACE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final kotlin.Lazy<java.util.Map<java.lang.Integer, kotlin.text.CharDirectionality>> getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.text.CharDirectionality[] getHighSpeedVideoSizes;
    private final int value;

    private CharDirectionality(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        kotlin.text.CharDirectionality charDirectionality = new kotlin.text.CharDirectionality("UNDEFINED", 0, -1);
        UNDEFINED = charDirectionality;
        kotlin.text.CharDirectionality charDirectionality2 = new kotlin.text.CharDirectionality("LEFT_TO_RIGHT", 1, 0);
        LEFT_TO_RIGHT = charDirectionality2;
        kotlin.text.CharDirectionality charDirectionality3 = new kotlin.text.CharDirectionality("RIGHT_TO_LEFT", 2, 1);
        RIGHT_TO_LEFT = charDirectionality3;
        kotlin.text.CharDirectionality charDirectionality4 = new kotlin.text.CharDirectionality("RIGHT_TO_LEFT_ARABIC", 3, 2);
        RIGHT_TO_LEFT_ARABIC = charDirectionality4;
        kotlin.text.CharDirectionality charDirectionality5 = new kotlin.text.CharDirectionality("EUROPEAN_NUMBER", 4, 3);
        EUROPEAN_NUMBER = charDirectionality5;
        kotlin.text.CharDirectionality charDirectionality6 = new kotlin.text.CharDirectionality("EUROPEAN_NUMBER_SEPARATOR", 5, 4);
        EUROPEAN_NUMBER_SEPARATOR = charDirectionality6;
        kotlin.text.CharDirectionality charDirectionality7 = new kotlin.text.CharDirectionality("EUROPEAN_NUMBER_TERMINATOR", 6, 5);
        EUROPEAN_NUMBER_TERMINATOR = charDirectionality7;
        kotlin.text.CharDirectionality charDirectionality8 = new kotlin.text.CharDirectionality("ARABIC_NUMBER", 7, 6);
        ARABIC_NUMBER = charDirectionality8;
        kotlin.text.CharDirectionality charDirectionality9 = new kotlin.text.CharDirectionality("COMMON_NUMBER_SEPARATOR", 8, 7);
        COMMON_NUMBER_SEPARATOR = charDirectionality9;
        kotlin.text.CharDirectionality charDirectionality10 = new kotlin.text.CharDirectionality("NONSPACING_MARK", 9, 8);
        NONSPACING_MARK = charDirectionality10;
        kotlin.text.CharDirectionality charDirectionality11 = new kotlin.text.CharDirectionality("BOUNDARY_NEUTRAL", 10, 9);
        BOUNDARY_NEUTRAL = charDirectionality11;
        kotlin.text.CharDirectionality charDirectionality12 = new kotlin.text.CharDirectionality("PARAGRAPH_SEPARATOR", 11, 10);
        PARAGRAPH_SEPARATOR = charDirectionality12;
        kotlin.text.CharDirectionality charDirectionality13 = new kotlin.text.CharDirectionality("SEGMENT_SEPARATOR", 12, 11);
        SEGMENT_SEPARATOR = charDirectionality13;
        kotlin.text.CharDirectionality charDirectionality14 = new kotlin.text.CharDirectionality("WHITESPACE", 13, 12);
        WHITESPACE = charDirectionality14;
        kotlin.text.CharDirectionality charDirectionality15 = new kotlin.text.CharDirectionality("OTHER_NEUTRALS", 14, 13);
        OTHER_NEUTRALS = charDirectionality15;
        kotlin.text.CharDirectionality charDirectionality16 = new kotlin.text.CharDirectionality("LEFT_TO_RIGHT_EMBEDDING", 15, 14);
        LEFT_TO_RIGHT_EMBEDDING = charDirectionality16;
        kotlin.text.CharDirectionality charDirectionality17 = new kotlin.text.CharDirectionality("LEFT_TO_RIGHT_OVERRIDE", 16, 15);
        LEFT_TO_RIGHT_OVERRIDE = charDirectionality17;
        kotlin.text.CharDirectionality charDirectionality18 = new kotlin.text.CharDirectionality("RIGHT_TO_LEFT_EMBEDDING", 17, 16);
        RIGHT_TO_LEFT_EMBEDDING = charDirectionality18;
        kotlin.text.CharDirectionality charDirectionality19 = new kotlin.text.CharDirectionality("RIGHT_TO_LEFT_OVERRIDE", 18, 17);
        RIGHT_TO_LEFT_OVERRIDE = charDirectionality19;
        kotlin.text.CharDirectionality charDirectionality20 = new kotlin.text.CharDirectionality("POP_DIRECTIONAL_FORMAT", 19, 18);
        POP_DIRECTIONAL_FORMAT = charDirectionality20;
        kotlin.text.CharDirectionality[] charDirectionalityArr = {charDirectionality, charDirectionality2, charDirectionality3, charDirectionality4, charDirectionality5, charDirectionality6, charDirectionality7, charDirectionality8, charDirectionality9, charDirectionality10, charDirectionality11, charDirectionality12, charDirectionality13, charDirectionality14, charDirectionality15, charDirectionality16, charDirectionality17, charDirectionality18, charDirectionality19, charDirectionality20};
        getHighSpeedVideoSizes = charDirectionalityArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(charDirectionalityArr);
        INSTANCE = new kotlin.text.CharDirectionality.Companion(null);
        getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlin.text.CharDirectionality$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kotlin.text.CharDirectionality.$r8$lambda$v4DGHaUIucf67ksqHLHlHE3vuBU();
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR!\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlin/text/CharDirectionality$Companion;", "", "<init>", "()V", "", "directionality", "Lkotlin/text/CharDirectionality;", "valueOf", "(I)Lkotlin/text/CharDirectionality;", "", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlin.text.CharDirectionality valueOf(int directionality) {
            kotlin.text.CharDirectionality charDirectionality = (kotlin.text.CharDirectionality) ((java.util.Map) kotlin.text.CharDirectionality.getHighSpeedVideoFpsRangesFor.getValue()).get(java.lang.Integer.valueOf(directionality));
            if (charDirectionality != null) {
                return charDirectionality;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Directionality #");
            sb.append(directionality);
            sb.append(" is not defined.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ java.util.Map $r8$lambda$v4DGHaUIucf67ksqHLHlHE3vuBU() {
        kotlin.enums.EnumEntries<kotlin.text.CharDirectionality> entries = getEntries();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
        for (java.lang.Object obj : entries) {
            linkedHashMap.put(java.lang.Integer.valueOf(((kotlin.text.CharDirectionality) obj).value), obj);
        }
        return linkedHashMap;
    }

    public static kotlin.text.CharDirectionality[] values() {
        return (kotlin.text.CharDirectionality[]) getHighSpeedVideoSizes.clone();
    }

    public static kotlin.text.CharDirectionality valueOf(java.lang.String str) {
        return (kotlin.text.CharDirectionality) java.lang.Enum.valueOf(kotlin.text.CharDirectionality.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlin.text.CharDirectionality> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
