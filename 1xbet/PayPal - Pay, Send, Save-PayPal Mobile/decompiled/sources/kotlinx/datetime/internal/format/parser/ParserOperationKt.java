package kotlinx.datetime.internal.format.parser;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a_\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a_\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\r2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aG\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Output", "", "minDigits", "maxDigits", "spacePadding", "Lkotlinx/datetime/internal/format/parser/AssignableField;", "setter", "", "name", "plusOnExceedsWidth", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "SignedIntParser", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/datetime/internal/format/parser/AssignableField;Ljava/lang/String;Ljava/lang/Integer;)Lkotlinx/datetime/internal/format/parser/ParserStructure;", "Target", "", "withMinus", "spaceAndZeroPaddedUnsignedInt", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/datetime/internal/format/parser/AssignableField;Ljava/lang/String;Z)Lkotlinx/datetime/internal/format/parser/ParserStructure;", "digits", "base", "ReducedIntParser", "(IILkotlinx/datetime/internal/format/parser/AssignableField;Ljava/lang/String;)Lkotlinx/datetime/internal/format/parser/ParserStructure;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ParserOperationKt {
    public static final <Output> kotlinx.datetime.internal.format.parser.ParserStructure<Output> SignedIntParser(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, kotlinx.datetime.internal.format.parser.AssignableField<? super Output, java.lang.Integer> assignableField, java.lang.String str, java.lang.Integer num4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assignableField, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.List mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(spaceAndZeroPaddedUnsignedInt(num, num2, num3, assignableField, str, true));
        if (num4 != null) {
            mutableListOf.add(spaceAndZeroPaddedUnsignedInt$default(num, num4, num3, assignableField, str, false, 32, null));
            mutableListOf.add(new kotlinx.datetime.internal.format.parser.ParserStructure(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlinx.datetime.internal.format.parser.ParserOperation[]{new kotlinx.datetime.internal.format.parser.PlainStringParserOperation("+"), new kotlinx.datetime.internal.format.parser.NumberSpanParserOperation(kotlin.collections.CollectionsKt.listOf(new kotlinx.datetime.internal.format.parser.UnsignedIntConsumer(java.lang.Integer.valueOf(num4.intValue() + 1), num2, assignableField, str, false)))}), kotlin.collections.CollectionsKt.emptyList()));
        } else {
            mutableListOf.add(spaceAndZeroPaddedUnsignedInt$default(num, num2, num3, assignableField, str, false, 32, null));
        }
        return new kotlinx.datetime.internal.format.parser.ParserStructure<>(kotlin.collections.CollectionsKt.emptyList(), mutableListOf);
    }

    public static /* synthetic */ kotlinx.datetime.internal.format.parser.ParserStructure spaceAndZeroPaddedUnsignedInt$default(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, kotlinx.datetime.internal.format.parser.AssignableField assignableField, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            z = false;
        }
        return spaceAndZeroPaddedUnsignedInt(num, num2, num3, assignableField, str, z);
    }

    public static final <Target> kotlinx.datetime.internal.format.parser.ParserStructure<Target> spaceAndZeroPaddedUnsignedInt(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, kotlinx.datetime.internal.format.parser.AssignableField<? super Target, java.lang.Integer> assignableField, java.lang.String str, boolean z) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assignableField, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int intValue = (num != null ? num.intValue() : 1) + (z ? 1 : 0);
        if (num2 != null) {
            i = num2.intValue();
            if (z) {
                i++;
            }
        } else {
            i = Integer.MAX_VALUE;
        }
        int intValue2 = num3 != null ? num3.intValue() : 0;
        int min = java.lang.Math.min(i, intValue2);
        if (intValue >= min) {
            return getHighResolutionOutputSizeshNQ4ISI(z, assignableField, str, intValue, i);
        }
        kotlinx.datetime.internal.format.parser.ParserStructure<Target> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(z, assignableField, str, intValue, intValue);
        while (intValue < min) {
            intValue++;
            highResolutionOutputSizeshNQ4ISI = new kotlinx.datetime.internal.format.parser.ParserStructure<>(kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlinx.datetime.internal.format.parser.ParserStructure[]{getHighResolutionOutputSizeshNQ4ISI(z, assignableField, str, intValue, intValue), kotlinx.datetime.internal.format.parser.ParserKt.concat(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlinx.datetime.internal.format.parser.ParserStructure[]{new kotlinx.datetime.internal.format.parser.ParserStructure(kotlin.collections.CollectionsKt.listOf(new kotlinx.datetime.internal.format.parser.PlainStringParserOperation(" ")), kotlin.collections.CollectionsKt.emptyList()), highResolutionOutputSizeshNQ4ISI}))}));
        }
        if (intValue2 > i) {
            return kotlinx.datetime.internal.format.parser.ParserKt.concat(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlinx.datetime.internal.format.parser.ParserStructure[]{new kotlinx.datetime.internal.format.parser.ParserStructure(kotlin.collections.CollectionsKt.listOf(new kotlinx.datetime.internal.format.parser.PlainStringParserOperation(kotlin.text.StringsKt.repeat(" ", intValue2 - i))), kotlin.collections.CollectionsKt.emptyList()), highResolutionOutputSizeshNQ4ISI}));
        }
        return intValue2 == i ? highResolutionOutputSizeshNQ4ISI : new kotlinx.datetime.internal.format.parser.ParserStructure<>(kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlinx.datetime.internal.format.parser.ParserStructure[]{getHighResolutionOutputSizeshNQ4ISI(z, assignableField, str, intValue2 + 1, i), highResolutionOutputSizeshNQ4ISI}));
    }

    private static final <Target> kotlinx.datetime.internal.format.parser.ParserStructure<Target> getHighResolutionOutputSizeshNQ4ISI(boolean z, kotlinx.datetime.internal.format.parser.AssignableField<? super Target, java.lang.Integer> assignableField, java.lang.String str, int i, int i2) {
        if (i2 < (z ? 1 : 0) + 1) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        if (z) {
            createListBuilder.add(new kotlinx.datetime.internal.format.parser.PlainStringParserOperation("-"));
        }
        createListBuilder.add(new kotlinx.datetime.internal.format.parser.NumberSpanParserOperation(kotlin.collections.CollectionsKt.listOf(new kotlinx.datetime.internal.format.parser.UnsignedIntConsumer(java.lang.Integer.valueOf(i - (z ? 1 : 0)), java.lang.Integer.valueOf(i2 - (z ? 1 : 0)), assignableField, str, z))));
        return new kotlinx.datetime.internal.format.parser.ParserStructure<>(kotlin.collections.CollectionsKt.build(createListBuilder), kotlin.collections.CollectionsKt.emptyList());
    }

    public static final <Output> kotlinx.datetime.internal.format.parser.ParserStructure<Output> ReducedIntParser(int i, int i2, kotlinx.datetime.internal.format.parser.AssignableField<? super Output, java.lang.Integer> assignableField, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assignableField, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new kotlinx.datetime.internal.format.parser.ParserStructure<>(kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlinx.datetime.internal.format.parser.ParserStructure[]{new kotlinx.datetime.internal.format.parser.ParserStructure(kotlin.collections.CollectionsKt.listOf(new kotlinx.datetime.internal.format.parser.NumberSpanParserOperation(kotlin.collections.CollectionsKt.listOf(new kotlinx.datetime.internal.format.parser.ReducedIntConsumer(i, assignableField, str, i2)))), kotlin.collections.CollectionsKt.emptyList()), new kotlinx.datetime.internal.format.parser.ParserStructure(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlinx.datetime.internal.format.parser.ParserOperation[]{new kotlinx.datetime.internal.format.parser.PlainStringParserOperation("+"), new kotlinx.datetime.internal.format.parser.NumberSpanParserOperation(kotlin.collections.CollectionsKt.listOf(new kotlinx.datetime.internal.format.parser.UnsignedIntConsumer(null, null, assignableField, str, false)))}), kotlin.collections.CollectionsKt.emptyList()), new kotlinx.datetime.internal.format.parser.ParserStructure(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlinx.datetime.internal.format.parser.ParserOperation[]{new kotlinx.datetime.internal.format.parser.PlainStringParserOperation("-"), new kotlinx.datetime.internal.format.parser.NumberSpanParserOperation(kotlin.collections.CollectionsKt.listOf(new kotlinx.datetime.internal.format.parser.UnsignedIntConsumer(null, null, assignableField, str, true)))}), kotlin.collections.CollectionsKt.emptyList())}));
    }

    /* renamed from: $r8$lambda$sYunYp-mseW8se1GJahY-dcvAkI, reason: not valid java name */
    public static /* synthetic */ java.lang.String m24193$r8$lambda$sYunYpmseW8se1GJahYdcvAkI(java.lang.Object obj, java.lang.Object obj2, kotlinx.datetime.internal.format.parser.AssignableField assignableField) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Attempting to assign conflicting values '");
        sb.append(obj);
        sb.append("' and '");
        sb.append(obj2);
        sb.append("' to field '");
        sb.append(assignableField.getName());
        sb.append('\'');
        return sb.toString();
    }

    public static final /* synthetic */ java.lang.Object access$setWithoutReassigning(final kotlinx.datetime.internal.format.parser.AssignableField assignableField, java.lang.Object obj, final java.lang.Object obj2, int i, int i2) {
        final java.lang.Object trySetWithoutReassigning = assignableField.trySetWithoutReassigning(obj, obj2);
        if (trySetWithoutReassigning == null) {
            return kotlinx.datetime.internal.format.parser.ParseResult.INSTANCE.m24181OkQi1bsqg(i2);
        }
        return kotlinx.datetime.internal.format.parser.ParseResult.INSTANCE.m24180ErrorRg3Co2E(i, new kotlin.jvm.functions.Function0() { // from class: kotlinx.datetime.internal.format.parser.ParserOperationKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kotlinx.datetime.internal.format.parser.ParserOperationKt.m24193$r8$lambda$sYunYpmseW8se1GJahYdcvAkI(trySetWithoutReassigning, obj2, assignableField);
            }
        });
    }
}
