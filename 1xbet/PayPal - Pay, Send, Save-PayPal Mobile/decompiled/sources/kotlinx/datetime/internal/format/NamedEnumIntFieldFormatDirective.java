package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001bB7\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016"}, d2 = {"Lkotlinx/datetime/internal/format/NamedEnumIntFieldFormatDirective;", "Target", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE, "Lkotlinx/datetime/internal/format/FieldFormatDirective;", "Lkotlinx/datetime/internal/format/FieldSpec;", "field", "", "", "mapping", "name", "<init>", "(Lkotlinx/datetime/internal/format/FieldSpec;Ljava/util/Map;Ljava/lang/String;)V", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "formatter", "()Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "parser", "()Lkotlinx/datetime/internal/format/parser/ParserStructure;", "Lkotlinx/datetime/internal/format/FieldSpec;", "getField", "()Lkotlinx/datetime/internal/format/FieldSpec;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "AssignableString"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class NamedEnumIntFieldFormatDirective<Target, Type> implements kotlinx.datetime.internal.format.FieldFormatDirective<Target> {
    private final kotlinx.datetime.internal.format.FieldSpec<Target, Type> field;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, Type> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<Type, java.lang.String> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public NamedEnumIntFieldFormatDirective(kotlinx.datetime.internal.format.FieldSpec<? super Target, Type> fieldSpec, java.util.Map<Type, java.lang.String> map, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldSpec, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.field = fieldSpec;
        this.Camera2StreamConfigurationMap = map;
        this.getHighSpeedVideoFpsRanges = str;
        java.util.Set<java.util.Map.Entry<Type, java.lang.String>> entrySet = map.entrySet();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entrySet, 10)), 16));
        java.util.Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            kotlin.Pair pair = kotlin.TuplesKt.to(entry.getValue(), entry.getKey());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this.getHighSpeedVideoSizes = linkedHashMap;
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public final kotlinx.datetime.internal.format.FieldSpec<Target, Type> getField() {
        return this.field;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/datetime/internal/format/NamedEnumIntFieldFormatDirective$AssignableString;", "Lkotlinx/datetime/internal/format/parser/AssignableField;", "", "<init>", "(Lkotlinx/datetime/internal/format/NamedEnumIntFieldFormatDirective;)V", "getName", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class AssignableString implements kotlinx.datetime.internal.format.parser.AssignableField<Target, java.lang.String> {
        public AssignableString() {
        }

        @Override // kotlinx.datetime.internal.format.parser.AssignableField
        public final /* synthetic */ java.lang.String trySetWithoutReassigning(java.lang.Object obj, java.lang.String str) {
            java.lang.String str2 = str;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlinx.datetime.internal.format.Accessor<Target, Type> accessor = kotlinx.datetime.internal.format.NamedEnumIntFieldFormatDirective.this.getField().getAccessor();
            java.lang.Object obj2 = ((kotlinx.datetime.internal.format.NamedEnumIntFieldFormatDirective) kotlinx.datetime.internal.format.NamedEnumIntFieldFormatDirective.this).getHighSpeedVideoSizes.get(str2);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2);
            Type trySetWithoutReassigning = accessor.trySetWithoutReassigning(obj, obj2);
            if (trySetWithoutReassigning != null) {
                return (java.lang.String) ((kotlinx.datetime.internal.format.NamedEnumIntFieldFormatDirective) kotlinx.datetime.internal.format.NamedEnumIntFieldFormatDirective.this).Camera2StreamConfigurationMap.get(trySetWithoutReassigning);
            }
            return null;
        }

        @Override // kotlinx.datetime.internal.format.parser.AssignableField
        public final java.lang.String getName() {
            return ((kotlinx.datetime.internal.format.NamedEnumIntFieldFormatDirective) kotlinx.datetime.internal.format.NamedEnumIntFieldFormatDirective.this).getHighSpeedVideoFpsRanges;
        }
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public kotlinx.datetime.internal.format.formatter.FormatterStructure<Target> formatter() {
        return new kotlinx.datetime.internal.format.formatter.StringFormatterStructure(new kotlinx.datetime.internal.format.NamedEnumIntFieldFormatDirective$formatter$1(this));
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public kotlinx.datetime.internal.format.parser.ParserStructure<Target> parser() {
        java.util.Collection<java.lang.String> values = this.Camera2StreamConfigurationMap.values();
        kotlinx.datetime.internal.format.NamedEnumIntFieldFormatDirective.AssignableString assignableString = new kotlinx.datetime.internal.format.NamedEnumIntFieldFormatDirective.AssignableString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("one of ");
        sb.append(this.Camera2StreamConfigurationMap.values());
        sb.append(" for ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        return new kotlinx.datetime.internal.format.parser.ParserStructure<>(kotlin.collections.CollectionsKt.listOf(new kotlinx.datetime.internal.format.parser.StringSetParserOperation(values, assignableString, sb.toString())), kotlin.collections.CollectionsKt.emptyList());
    }

    public static final /* synthetic */ java.lang.String access$getStringValue(kotlinx.datetime.internal.format.NamedEnumIntFieldFormatDirective namedEnumIntFieldFormatDirective, java.lang.Object obj) {
        Type type = namedEnumIntFieldFormatDirective.field.getAccessor().getterNotNull(obj);
        java.lang.String str = namedEnumIntFieldFormatDirective.Camera2StreamConfigurationMap.get(namedEnumIntFieldFormatDirective.field.getAccessor().getterNotNull(obj));
        if (str != null) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The value ");
        sb.append(type);
        sb.append(" of ");
        sb.append(namedEnumIntFieldFormatDirective.field.getName());
        sb.append(" does not have a corresponding string representation");
        return sb.toString();
    }
}
