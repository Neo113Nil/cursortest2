package kotlinx.datetime.internal.format.parser;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u0014*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0014B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u0010\u001a\u00020\r2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/internal/format/parser/TimeZoneParserOperation;", "Output", "Lkotlinx/datetime/internal/format/parser/ParserOperation;", "Lkotlinx/datetime/internal/format/parser/AssignableField;", "", "setter", "<init>", "(Lkotlinx/datetime/internal/format/parser/AssignableField;)V", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "", "input", "", "startIndex", "Lkotlinx/datetime/internal/format/parser/ParseResult;", "consume-FANa98k", "(Ljava/lang/Object;Ljava/lang/CharSequence;I)Ljava/lang/Object;", "consume", "getHighSpeedVideoFpsRanges", "Lkotlinx/datetime/internal/format/parser/AssignableField;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TimeZoneParserOperation<Output> implements kotlinx.datetime.internal.format.parser.ParserOperation<Output> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion INSTANCE = new kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion(null);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.datetime.internal.format.parser.AssignableField<Output, java.lang.String> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public TimeZoneParserOperation(kotlinx.datetime.internal.format.parser.AssignableField<? super Output, java.lang.String> assignableField) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assignableField, "");
        this.getHighSpeedVideoSizes = assignableField;
    }

    @Override // kotlinx.datetime.internal.format.parser.ParserOperation
    /* renamed from: consume-FANa98k */
    public final java.lang.Object mo24171consumeFANa98k(Output storage, java.lang.CharSequence input, int startIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        int access$validateTimeZone = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.access$validateTimeZone(INSTANCE, input, startIndex);
        if (access$validateTimeZone > startIndex) {
            kotlinx.datetime.internal.format.parser.ParserOperationKt.access$setWithoutReassigning(this.getHighSpeedVideoSizes, storage, input.subSequence(startIndex, access$validateTimeZone).toString(), startIndex, access$validateTimeZone);
            return kotlinx.datetime.internal.format.parser.ParseResult.INSTANCE.m24181OkQi1bsqg(access$validateTimeZone);
        }
        return kotlinx.datetime.internal.format.parser.ParseResult.INSTANCE.m24180ErrorRg3Co2E(startIndex, new kotlin.jvm.functions.Function0() { // from class: kotlinx.datetime.internal.format.parser.TimeZoneParserOperation$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.$r8$lambda$SFlrk74U7nhYHdI3kLs6J3MDaQg();
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/parser/TimeZoneParserOperation$Companion;", "", "<init>", "()V", "State"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lkotlinx/datetime/internal/format/parser/TimeZoneParserOperation$Companion$State;", "", "<init>", "(Ljava/lang/String;I)V", "getOutputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "getOutputMinFrameDuration", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getInputSizeshNQ4ISI", "getOutputFormats", "getInputFormats"}, k = 1, mv = {2, 1, 0}, xi = 48)
        static final class State {
            public static final kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State Camera2StreamConfigurationMap;
            public static final kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State getHighResolutionOutputSizeshNQ4ISI;
            public static final kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State getHighSpeedVideoFpsRanges;
            public static final kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State getHighSpeedVideoFpsRangesFor;
            public static final kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State getHighSpeedVideoSizes;
            public static final kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State getHighSpeedVideoSizesFor;
            public static final kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State getInputFormats;
            public static final kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State getInputSizeshNQ4ISI;
            public static final kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State getOutputFormats;
            public static final kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State getOutputMinFrameDuration;
            private static final /* synthetic */ kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State[] getOutputMinFrameDurationlomOqCM;
            public static final kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State getOutputSizeshNQ4ISI;
            private static final /* synthetic */ kotlin.enums.EnumEntries getOutputStallDurationlomOqCM;

            private State(java.lang.String str, int i) {
            }

            static {
                kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State state = new kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State("START", 0);
                getOutputSizeshNQ4ISI = state;
                kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State state2 = new kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State("AFTER_PREFIX", 1);
                getHighSpeedVideoSizesFor = state2;
                kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State state3 = new kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State("AFTER_SIGN", 2);
                getOutputMinFrameDuration = state3;
                kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State state4 = new kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State("AFTER_INIT_SIGN", 3);
                getHighSpeedVideoSizes = state4;
                kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State state5 = new kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State("AFTER_HOUR", 4);
                getHighSpeedVideoFpsRanges = state5;
                kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State state6 = new kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State("AFTER_INIT_HOUR", 5);
                getHighSpeedVideoFpsRangesFor = state6;
                kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State state7 = new kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State("AFTER_MINUTE", 6);
                Camera2StreamConfigurationMap = state7;
                kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State state8 = new kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State("AFTER_COLON_MINUTE", 7);
                getHighResolutionOutputSizeshNQ4ISI = state8;
                kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State state9 = new kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State("IN_PART", 8);
                getInputSizeshNQ4ISI = state9;
                kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State state10 = new kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State("AFTER_SLASH", 9);
                getOutputFormats = state10;
                kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State state11 = new kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State("END", 10);
                getInputFormats = state11;
                kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State[] stateArr = {state, state2, state3, state4, state5, state6, state7, state8, state9, state10, state11};
                getOutputMinFrameDurationlomOqCM = stateArr;
                getOutputStallDurationlomOqCM = kotlin.enums.EnumEntriesKt.enumEntries(stateArr);
            }

            public static kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State valueOf(java.lang.String str) {
                return (kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State) java.lang.Enum.valueOf(kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.class, str);
            }

            public static kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State[] values() {
                return (kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State[]) getOutputMinFrameDurationlomOqCM.clone();
            }
        }

        private Companion() {
        }

        private static final boolean getHighSpeedVideoSizes(java.lang.CharSequence charSequence, kotlin.jvm.internal.Ref.IntRef intRef) {
            kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion companion = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.INSTANCE;
            if (!kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Character[]{'+', '-'}).contains(java.lang.Character.valueOf(charSequence.charAt(intRef.element)))) {
                return false;
            }
            intRef.element++;
            return true;
        }

        private static final boolean getHighSpeedVideoFpsRanges(kotlin.jvm.internal.Ref.IntRef intRef, java.lang.CharSequence charSequence, int i) {
            kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion companion = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.INSTANCE;
            java.lang.Iterable until = kotlin.ranges.RangesKt.until(intRef.element, intRef.element + i);
            if (!(until instanceof java.util.Collection) || !((java.util.Collection) until).isEmpty()) {
                java.util.Iterator it = until.iterator();
                while (it.hasNext()) {
                    java.lang.Character orNull = kotlin.text.StringsKt.getOrNull(charSequence, ((kotlin.collections.IntIterator) it).nextInt());
                    if (orNull == null || !kotlinx.datetime.internal.UtilKt.isAsciiDigit(orNull.charValue())) {
                        return false;
                    }
                }
            }
            intRef.element += i;
            return true;
        }

        private static final boolean Camera2StreamConfigurationMap(java.lang.CharSequence charSequence, kotlin.jvm.internal.Ref.IntRef intRef) {
            kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion companion = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.INSTANCE;
            if (charSequence.charAt(intRef.element) != ':') {
                return false;
            }
            intRef.element++;
            kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion companion2 = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.INSTANCE;
            if (getHighSpeedVideoFpsRanges(intRef, charSequence, 2)) {
                return true;
            }
            intRef.element--;
            return false;
        }

        private static final boolean getHighSpeedVideoFpsRanges(java.lang.CharSequence charSequence, kotlin.jvm.internal.Ref.IntRef intRef) {
            kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion companion = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.INSTANCE;
            char charAt = charSequence.charAt(intRef.element);
            if (!kotlinx.datetime.internal.UtilKt.isAsciiLetter(charAt) && charAt != '.' && charAt != '_') {
                return false;
            }
            intRef.element++;
            return true;
        }

        public static final /* synthetic */ int access$validateTimeZone(kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion companion, java.lang.CharSequence charSequence, int i) {
            int i2;
            java.lang.String str;
            java.lang.Object obj;
            kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
            intRef.element = i;
            kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State state = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getOutputSizeshNQ4ISI;
            while (true) {
                i2 = 1;
                if (intRef.element < charSequence.length()) {
                    switch (kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
                        case 1:
                            java.util.Iterator it = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC, "GMT", "UT"}).iterator();
                            while (true) {
                                str = null;
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (kotlin.text.StringsKt.startsWith$default(charSequence, (java.lang.CharSequence) obj, intRef.element, false, 4, (java.lang.Object) null)) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            java.lang.String str2 = (java.lang.String) obj;
                            if (str2 != null) {
                                intRef.element += str2.length();
                                str = str2;
                            }
                            if (str != null) {
                                state = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getHighSpeedVideoSizesFor;
                            } else if (!getHighSpeedVideoSizes(charSequence, intRef)) {
                                if (!getHighSpeedVideoFpsRanges(charSequence, intRef)) {
                                    break;
                                } else {
                                    state = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getInputSizeshNQ4ISI;
                                }
                            } else {
                                state = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getHighSpeedVideoSizes;
                            }
                        case 2:
                            if (getHighSpeedVideoSizes(charSequence, intRef)) {
                                state = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getOutputMinFrameDuration;
                            } else {
                                state = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getInputSizeshNQ4ISI;
                                continue;
                            }
                        case 3:
                            if (getHighSpeedVideoFpsRanges(intRef, charSequence, 2)) {
                                state = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getHighSpeedVideoFpsRanges;
                            } else {
                                state = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getInputSizeshNQ4ISI;
                                continue;
                            }
                        case 4:
                            if (!getHighSpeedVideoFpsRanges(intRef, charSequence, 2)) {
                                if (!getHighSpeedVideoFpsRanges(intRef, charSequence, 1)) {
                                    break;
                                } else {
                                    state = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getInputFormats;
                                }
                            } else {
                                state = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getHighSpeedVideoFpsRangesFor;
                            }
                        case 5:
                            if (Camera2StreamConfigurationMap(charSequence, intRef)) {
                                state = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getHighResolutionOutputSizeshNQ4ISI;
                            } else {
                                state = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getInputSizeshNQ4ISI;
                                continue;
                            }
                        case 6:
                            if (!Camera2StreamConfigurationMap(charSequence, intRef)) {
                                if (!getHighSpeedVideoFpsRanges(intRef, charSequence, 2)) {
                                    break;
                                } else {
                                    state = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.Camera2StreamConfigurationMap;
                                }
                            } else {
                                state = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getHighResolutionOutputSizeshNQ4ISI;
                            }
                        case 7:
                            if (!getHighSpeedVideoFpsRanges(intRef, charSequence, 2)) {
                                break;
                            } else {
                                state = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getInputFormats;
                            }
                        case 8:
                            if (!Camera2StreamConfigurationMap(charSequence, intRef)) {
                                break;
                            } else {
                                state = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getInputFormats;
                            }
                        case 9:
                            kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion companion2 = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.INSTANCE;
                            char charAt = charSequence.charAt(intRef.element);
                            if (kotlinx.datetime.internal.UtilKt.isAsciiLetter(charAt) || charAt == '.' || charAt == '_' || kotlinx.datetime.internal.UtilKt.isAsciiDigit(charAt) || charAt == '-' || charAt == '+') {
                                intRef.element++;
                                state = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getInputSizeshNQ4ISI;
                            } else {
                                kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion companion3 = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.INSTANCE;
                                if (charSequence.charAt(intRef.element) != '/') {
                                    break;
                                } else {
                                    intRef.element++;
                                    state = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getOutputFormats;
                                }
                            }
                            break;
                        case 10:
                            if (!getHighSpeedVideoFpsRanges(charSequence, intRef)) {
                                break;
                            } else {
                                state = kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getInputSizeshNQ4ISI;
                            }
                        case 11:
                            break;
                        default:
                            throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
            }
            int i3 = intRef.element;
            if (state != kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getOutputFormats && state != kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getHighSpeedVideoSizes) {
                i2 = 0;
            }
            return i3 - i2;
        }

        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.values().length];
                try {
                    iArr[kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getOutputSizeshNQ4ISI.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getHighSpeedVideoSizesFor.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getOutputMinFrameDuration.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getHighSpeedVideoSizes.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getHighSpeedVideoFpsRanges.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getHighSpeedVideoFpsRangesFor.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr[kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.Camera2StreamConfigurationMap.ordinal()] = 7;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                try {
                    iArr[kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getHighResolutionOutputSizeshNQ4ISI.ordinal()] = 8;
                } catch (java.lang.NoSuchFieldError unused8) {
                }
                try {
                    iArr[kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getInputSizeshNQ4ISI.ordinal()] = 9;
                } catch (java.lang.NoSuchFieldError unused9) {
                }
                try {
                    iArr[kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getOutputFormats.ordinal()] = 10;
                } catch (java.lang.NoSuchFieldError unused10) {
                }
                try {
                    iArr[kotlinx.datetime.internal.format.parser.TimeZoneParserOperation.Companion.State.getInputFormats.ordinal()] = 11;
                } catch (java.lang.NoSuchFieldError unused11) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ java.lang.String $r8$lambda$SFlrk74U7nhYHdI3kLs6J3MDaQg() {
        return "Invalid timezone format";
    }
}
