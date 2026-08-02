package kotlinx.datetime.internal.format.parser;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003:\u0001\u001eB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0011\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000eJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0088\u0001\u0005\u0092\u0001\b\u0012\u0004\u0012\u00028\u00000\u0004"}, d2 = {"Lkotlinx/datetime/internal/format/parser/Parser;", "Lkotlinx/datetime/internal/format/parser/Copyable;", "Output", "", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "commands", "constructor-impl", "(Lkotlinx/datetime/internal/format/parser/ParserStructure;)Lkotlinx/datetime/internal/format/parser/ParserStructure;", "", "input", "initialContainer", "", "startIndex", "match-impl", "(Lkotlinx/datetime/internal/format/parser/ParserStructure;Ljava/lang/CharSequence;Lkotlinx/datetime/internal/format/parser/Copyable;I)Lkotlinx/datetime/internal/format/parser/Copyable;", "match", "matchOrNull-impl", "matchOrNull", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "getHighResolutionOutputSizeshNQ4ISI", "ParserState"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes17.dex */
public final class Parser<Output extends kotlinx.datetime.internal.format.parser.Copyable<Output>> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.datetime.internal.format.parser.ParserStructure<Output> getHighResolutionOutputSizeshNQ4ISI;

    private /* synthetic */ Parser(kotlinx.datetime.internal.format.parser.ParserStructure parserStructure) {
        this.getHighResolutionOutputSizeshNQ4ISI = parserStructure;
    }

    /* renamed from: match-impl$default, reason: not valid java name */
    public static /* synthetic */ kotlinx.datetime.internal.format.parser.Copyable m24188matchimpl$default(kotlinx.datetime.internal.format.parser.ParserStructure parserStructure, java.lang.CharSequence charSequence, kotlinx.datetime.internal.format.parser.Copyable copyable, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m24187matchimpl(parserStructure, charSequence, copyable, i);
    }

    /* renamed from: match-impl, reason: not valid java name */
    public static final Output m24187matchimpl(kotlinx.datetime.internal.format.parser.ParserStructure<? super Output> parserStructure, java.lang.CharSequence charSequence, Output output, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(new kotlinx.datetime.internal.format.parser.Parser.ParserState(output, parserStructure, i));
        while (true) {
            kotlinx.datetime.internal.format.parser.Parser.ParserState parserState = (kotlinx.datetime.internal.format.parser.Parser.ParserState) kotlin.collections.CollectionsKt.removeLastOrNull(mutableListOf);
            if (parserState != null) {
                Output output2 = (Output) ((kotlinx.datetime.internal.format.parser.Copyable) parserState.getHighSpeedVideoFpsRangesFor).copy();
                int i2 = parserState.Camera2StreamConfigurationMap;
                kotlinx.datetime.internal.format.parser.ParserStructure<Output> parserStructure2 = parserState.getHighResolutionOutputSizeshNQ4ISI;
                int size = parserStructure2.getOperations().size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        java.lang.Object mo24171consumeFANa98k = ((kotlinx.datetime.internal.format.parser.ParserOperation) parserStructure2.getOperations().get(i3)).mo24171consumeFANa98k(output2, charSequence, i2);
                        if (mo24171consumeFANa98k instanceof java.lang.Integer) {
                            i2 = ((java.lang.Number) mo24171consumeFANa98k).intValue();
                            i3++;
                        } else if (mo24171consumeFANa98k instanceof kotlinx.datetime.internal.format.parser.ParseError) {
                            arrayList.add((kotlinx.datetime.internal.format.parser.ParseError) mo24171consumeFANa98k);
                        } else {
                            throw new java.lang.IllegalStateException("Unexpected parse result: ".concat(java.lang.String.valueOf(mo24171consumeFANa98k)).toString());
                        }
                    } else if (parserStructure2.getFollowedBy().isEmpty()) {
                        if (i2 == charSequence.length()) {
                            return output2;
                        }
                        arrayList.add(new kotlinx.datetime.internal.format.parser.ParseError(i2, kotlinx.datetime.internal.format.parser.Parser$parse$1$3.INSTANCE));
                    } else {
                        int size2 = parserStructure2.getFollowedBy().size() - 1;
                        if (size2 >= 0) {
                            while (true) {
                                int i4 = size2 - 1;
                                mutableListOf.add(new kotlinx.datetime.internal.format.parser.Parser.ParserState(output2, (kotlinx.datetime.internal.format.parser.ParserStructure) parserStructure2.getFollowedBy().get(size2), i2));
                                if (i4 >= 0) {
                                    size2 = i4;
                                }
                            }
                        }
                    }
                }
            } else {
                if (arrayList.size() > 1) {
                    kotlin.collections.CollectionsKt.sortWith(arrayList, new java.util.Comparator() { // from class: kotlinx.datetime.internal.format.parser.Parser$match-impl$$inlined$sortByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((kotlinx.datetime.internal.format.parser.ParseError) t2).getPosition()), java.lang.Integer.valueOf(((kotlinx.datetime.internal.format.parser.ParseError) t).getPosition()));
                        }
                    });
                }
                throw new kotlinx.datetime.internal.format.parser.ParseException(arrayList);
            }
        }
    }

    /* renamed from: matchOrNull-impl$default, reason: not valid java name */
    public static /* synthetic */ kotlinx.datetime.internal.format.parser.Copyable m24190matchOrNullimpl$default(kotlinx.datetime.internal.format.parser.ParserStructure parserStructure, java.lang.CharSequence charSequence, kotlinx.datetime.internal.format.parser.Copyable copyable, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m24189matchOrNullimpl(parserStructure, charSequence, copyable, i);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00028\u00018\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlinx/datetime/internal/format/parser/Parser$ParserState;", "Output", "", "p0", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "p1", "", "p2", "<init>", "(Ljava/lang/Object;Lkotlinx/datetime/internal/format/parser/ParserStructure;I)V", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class ParserState<Output> {
        final kotlinx.datetime.internal.format.parser.ParserStructure<Output> getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        final Output getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        final int Camera2StreamConfigurationMap;

        /* JADX WARN: Multi-variable type inference failed */
        public ParserState(Output output, kotlinx.datetime.internal.format.parser.ParserStructure<? super Output> parserStructure, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parserStructure, "");
            this.getHighSpeedVideoFpsRangesFor = output;
            this.getHighResolutionOutputSizeshNQ4ISI = parserStructure;
            this.Camera2StreamConfigurationMap = i;
        }
    }

    /* renamed from: matchOrNull-impl, reason: not valid java name */
    public static final Output m24189matchOrNullimpl(kotlinx.datetime.internal.format.parser.ParserStructure<? super Output> parserStructure, java.lang.CharSequence charSequence, Output output, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        java.util.List mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(new kotlinx.datetime.internal.format.parser.Parser.ParserState(output, parserStructure, i));
        while (true) {
            kotlinx.datetime.internal.format.parser.Parser.ParserState parserState = (kotlinx.datetime.internal.format.parser.Parser.ParserState) kotlin.collections.CollectionsKt.removeLastOrNull(mutableListOf);
            if (parserState == null) {
                return null;
            }
            Output output2 = (Output) ((kotlinx.datetime.internal.format.parser.Copyable) parserState.getHighSpeedVideoFpsRangesFor).copy();
            int i2 = parserState.Camera2StreamConfigurationMap;
            kotlinx.datetime.internal.format.parser.ParserStructure<Output> parserStructure2 = parserState.getHighResolutionOutputSizeshNQ4ISI;
            int size = parserStructure2.getOperations().size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    java.lang.Object mo24171consumeFANa98k = ((kotlinx.datetime.internal.format.parser.ParserOperation) parserStructure2.getOperations().get(i3)).mo24171consumeFANa98k(output2, charSequence, i2);
                    if (mo24171consumeFANa98k instanceof java.lang.Integer) {
                        i2 = ((java.lang.Number) mo24171consumeFANa98k).intValue();
                        i3++;
                    } else {
                        if (!(mo24171consumeFANa98k instanceof kotlinx.datetime.internal.format.parser.ParseError)) {
                            throw new java.lang.IllegalStateException("Unexpected parse result: ".concat(java.lang.String.valueOf(mo24171consumeFANa98k)).toString());
                        }
                    }
                } else if (parserStructure2.getFollowedBy().isEmpty()) {
                    if (i2 == charSequence.length()) {
                        return output2;
                    }
                    new kotlinx.datetime.internal.format.parser.ParseError(i2, kotlinx.datetime.internal.format.parser.Parser$parse$1$3.INSTANCE);
                } else {
                    int size2 = parserStructure2.getFollowedBy().size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i4 = size2 - 1;
                            mutableListOf.add(new kotlinx.datetime.internal.format.parser.Parser.ParserState(output2, (kotlinx.datetime.internal.format.parser.ParserStructure) parserStructure2.getFollowedBy().get(size2), i2));
                            if (i4 >= 0) {
                                size2 = i4;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ kotlinx.datetime.internal.format.parser.ParserStructure getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        return m24191toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int hashCode() {
        return m24186hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object other) {
        return m24184equalsimpl(this.getHighResolutionOutputSizeshNQ4ISI, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m24191toStringimpl(kotlinx.datetime.internal.format.parser.ParserStructure<? super Output> parserStructure) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Parser(commands=");
        sb.append(parserStructure);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24186hashCodeimpl(kotlinx.datetime.internal.format.parser.ParserStructure<? super Output> parserStructure) {
        return parserStructure.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24185equalsimpl0(kotlinx.datetime.internal.format.parser.ParserStructure<? super Output> parserStructure, kotlinx.datetime.internal.format.parser.ParserStructure<? super Output> parserStructure2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(parserStructure, parserStructure2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24184equalsimpl(kotlinx.datetime.internal.format.parser.ParserStructure<? super Output> parserStructure, java.lang.Object obj) {
        return (obj instanceof kotlinx.datetime.internal.format.parser.Parser) && kotlin.jvm.internal.Intrinsics.areEqual(parserStructure, ((kotlinx.datetime.internal.format.parser.Parser) obj).getGetHighResolutionOutputSizeshNQ4ISI());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <Output extends kotlinx.datetime.internal.format.parser.Copyable<Output>> kotlinx.datetime.internal.format.parser.ParserStructure<Output> m24183constructorimpl(kotlinx.datetime.internal.format.parser.ParserStructure<? super Output> parserStructure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parserStructure, "");
        return parserStructure;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlinx.datetime.internal.format.parser.Parser m24182boximpl(kotlinx.datetime.internal.format.parser.ParserStructure parserStructure) {
        return new kotlinx.datetime.internal.format.parser.Parser(parserStructure);
    }
}
