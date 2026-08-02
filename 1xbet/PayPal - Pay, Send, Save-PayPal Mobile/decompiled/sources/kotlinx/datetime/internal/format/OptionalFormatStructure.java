package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\"B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR*\u0010 \u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u001f0\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lkotlinx/datetime/internal/format/OptionalFormatStructure;", "T", "Lkotlinx/datetime/internal/format/NonConcatenatedFormatStructure;", "", "onZero", "Lkotlinx/datetime/internal/format/FormatStructure;", "format", "<init>", "(Ljava/lang/String;Lkotlinx/datetime/internal/format/FormatStructure;)V", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "parser", "()Lkotlinx/datetime/internal/format/parser/ParserStructure;", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "formatter", "()Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Ljava/lang/String;", "getOnZero", "Lkotlinx/datetime/internal/format/FormatStructure;", "getFormat", "()Lkotlinx/datetime/internal/format/FormatStructure;", "", "Lkotlinx/datetime/internal/format/OptionalFormatStructure$PropertyWithDefault;", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "PropertyWithDefault"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OptionalFormatStructure<T> implements kotlinx.datetime.internal.format.NonConcatenatedFormatStructure<T> {
    private final kotlinx.datetime.internal.format.FormatStructure<T> format;
    private final java.util.List<kotlinx.datetime.internal.format.OptionalFormatStructure.PropertyWithDefault<T, ? extends java.lang.Object>> getHighSpeedVideoFpsRanges;
    private final java.lang.String onZero;

    /* JADX WARN: Multi-variable type inference failed */
    public OptionalFormatStructure(java.lang.String str, kotlinx.datetime.internal.format.FormatStructure<? super T> formatStructure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatStructure, "");
        this.onZero = str;
        this.format = formatStructure;
        java.util.List access$basicFormats = kotlinx.datetime.internal.format.FormatStructureKt.access$basicFormats(formatStructure);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(access$basicFormats, 10));
        java.util.Iterator<T> it = access$basicFormats.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlinx.datetime.internal.format.FieldFormatDirective) it.next()).getField());
        }
        java.util.List distinct = kotlin.collections.CollectionsKt.distinct(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(distinct, 10));
        java.util.Iterator<T> it2 = distinct.iterator();
        while (it2.hasNext()) {
            arrayList2.add(kotlinx.datetime.internal.format.OptionalFormatStructure.PropertyWithDefault.INSTANCE.fromField((kotlinx.datetime.internal.format.FieldSpec) it2.next()));
        }
        this.getHighSpeedVideoFpsRanges = arrayList2;
    }

    public final java.lang.String getOnZero() {
        return this.onZero;
    }

    public final kotlinx.datetime.internal.format.FormatStructure<T> getFormat() {
        return this.format;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Optional(");
        sb.append(this.onZero);
        sb.append(", ");
        sb.append(this.format);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof kotlinx.datetime.internal.format.OptionalFormatStructure)) {
            return false;
        }
        kotlinx.datetime.internal.format.OptionalFormatStructure optionalFormatStructure = (kotlinx.datetime.internal.format.OptionalFormatStructure) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.onZero, optionalFormatStructure.onZero) && kotlin.jvm.internal.Intrinsics.areEqual(this.format, optionalFormatStructure.format);
    }

    public final int hashCode() {
        return (this.onZero.hashCode() * 31) + this.format.hashCode();
    }

    @Override // kotlinx.datetime.internal.format.FormatStructure
    public final kotlinx.datetime.internal.format.parser.ParserStructure<T> parser() {
        java.util.List listOf;
        java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
        kotlinx.datetime.internal.format.parser.ParserStructure[] parserStructureArr = new kotlinx.datetime.internal.format.parser.ParserStructure[2];
        parserStructureArr[0] = this.format.parser();
        kotlinx.datetime.internal.format.parser.ParserStructure[] parserStructureArr2 = new kotlinx.datetime.internal.format.parser.ParserStructure[2];
        parserStructureArr2[0] = new kotlinx.datetime.internal.format.ConstantFormatStructure(this.onZero).parser();
        if (this.getHighSpeedVideoFpsRanges.isEmpty()) {
            listOf = kotlin.collections.CollectionsKt.emptyList();
        } else {
            listOf = kotlin.collections.CollectionsKt.listOf(new kotlinx.datetime.internal.format.parser.UnconditionalModification(new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.internal.format.OptionalFormatStructure$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kotlinx.datetime.internal.format.OptionalFormatStructure.$r8$lambda$zV75gARTMyCdpsiZ0cTheYXASfI(kotlinx.datetime.internal.format.OptionalFormatStructure.this, obj);
                }
            }));
        }
        parserStructureArr2[1] = new kotlinx.datetime.internal.format.parser.ParserStructure(listOf, kotlin.collections.CollectionsKt.emptyList());
        parserStructureArr[1] = kotlinx.datetime.internal.format.parser.ParserKt.concat(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) parserStructureArr2));
        return new kotlinx.datetime.internal.format.parser.ParserStructure<>(emptyList, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) parserStructureArr));
    }

    @Override // kotlinx.datetime.internal.format.FormatStructure
    public final kotlinx.datetime.internal.format.formatter.FormatterStructure<T> formatter() {
        kotlinx.datetime.internal.format.formatter.FormatterStructure<T> formatter = this.format.formatter();
        java.util.List<kotlinx.datetime.internal.format.OptionalFormatStructure.PropertyWithDefault<T, ? extends java.lang.Object>> list = this.getHighSpeedVideoFpsRanges;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlinx.datetime.internal.format.OptionalFormatStructure.PropertyWithDefault propertyWithDefault = (kotlinx.datetime.internal.format.OptionalFormatStructure.PropertyWithDefault) it.next();
            arrayList.add(new kotlinx.datetime.internal.format.ComparisonPredicate(propertyWithDefault.getHighResolutionOutputSizeshNQ4ISI, new kotlinx.datetime.internal.format.OptionalFormatStructure$PropertyWithDefault$isDefaultComparisonPredicate$1(propertyWithDefault.getHighSpeedVideoFpsRangesFor)));
        }
        kotlinx.datetime.internal.format.Predicate conjunctionPredicate = kotlinx.datetime.internal.format.PredicateKt.conjunctionPredicate(arrayList);
        if (conjunctionPredicate instanceof kotlinx.datetime.internal.format.Truth) {
            return new kotlinx.datetime.internal.format.formatter.ConstantStringFormatterStructure(this.onZero);
        }
        return new kotlinx.datetime.internal.format.formatter.ConditionalFormatter(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{kotlin.TuplesKt.to(new kotlinx.datetime.internal.format.OptionalFormatStructure$formatter$1(conjunctionPredicate), new kotlinx.datetime.internal.format.formatter.ConstantStringFormatterStructure(this.onZero)), kotlin.TuplesKt.to(new kotlinx.datetime.internal.format.OptionalFormatStructure$formatter$2(kotlinx.datetime.internal.format.Truth.INSTANCE), formatter)}));
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000 \u000e*\u0006\b\u0001\u0010\u0001 \u0000*\u0004\b\u0002\u0010\u00022\u00020\u0003:\u0001\u000eB%\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\t\u001a\u00028\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lkotlinx/datetime/internal/format/OptionalFormatStructure$PropertyWithDefault;", "T", "E", "", "Lkotlinx/datetime/internal/format/Accessor;", "p0", "p1", "<init>", "(Lkotlinx/datetime/internal/format/Accessor;Ljava/lang/Object;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/datetime/internal/format/Accessor;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class PropertyWithDefault<T, E> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final kotlinx.datetime.internal.format.OptionalFormatStructure.PropertyWithDefault.Companion INSTANCE = new kotlinx.datetime.internal.format.OptionalFormatStructure.PropertyWithDefault.Companion(null);

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final kotlinx.datetime.internal.format.Accessor<T, E> getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final E getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: Multi-variable type inference failed */
        private PropertyWithDefault(kotlinx.datetime.internal.format.Accessor<? super T, E> accessor, E e) {
            this.getHighSpeedVideoFpsRangesFor = accessor;
            this.getHighResolutionOutputSizeshNQ4ISI = e;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\b\"\u0004\b\u0003\u0010\u0004\"\u0004\b\u0004\u0010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlinx/datetime/internal/format/OptionalFormatStructure$PropertyWithDefault$Companion;", "", "<init>", "()V", "T", "E", "Lkotlinx/datetime/internal/format/FieldSpec;", "field", "Lkotlinx/datetime/internal/format/OptionalFormatStructure$PropertyWithDefault;", "fromField", "(Lkotlinx/datetime/internal/format/FieldSpec;)Lkotlinx/datetime/internal/format/OptionalFormatStructure$PropertyWithDefault;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final <T, E> kotlinx.datetime.internal.format.OptionalFormatStructure.PropertyWithDefault<T, E> fromField(kotlinx.datetime.internal.format.FieldSpec<? super T, E> field) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
                E defaultValue = field.getDefaultValue();
                if (defaultValue == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("The field '");
                    sb.append(field.getName());
                    sb.append("' does not define a default value");
                    throw new java.lang.IllegalArgumentException(sb.toString().toString());
                }
                return new kotlinx.datetime.internal.format.OptionalFormatStructure.PropertyWithDefault<>(field.getAccessor(), defaultValue, null);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ PropertyWithDefault(kotlinx.datetime.internal.format.Accessor accessor, java.lang.Object obj, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(accessor, obj);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zV75gARTMyCdpsiZ0cTheYXASfI(kotlinx.datetime.internal.format.OptionalFormatStructure optionalFormatStructure, java.lang.Object obj) {
        for (kotlinx.datetime.internal.format.OptionalFormatStructure.PropertyWithDefault<T, ? extends java.lang.Object> propertyWithDefault : optionalFormatStructure.getHighSpeedVideoFpsRanges) {
            ((kotlinx.datetime.internal.format.OptionalFormatStructure.PropertyWithDefault) propertyWithDefault).getHighSpeedVideoFpsRangesFor.trySetWithoutReassigning(obj, ((kotlinx.datetime.internal.format.OptionalFormatStructure.PropertyWithDefault) propertyWithDefault).getHighResolutionOutputSizeshNQ4ISI);
        }
        return kotlin.Unit.INSTANCE;
    }
}
