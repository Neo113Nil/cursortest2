package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u001aB+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lkotlinx/datetime/internal/format/NamedUnsignedIntFieldFormatDirective;", "Target", "Lkotlinx/datetime/internal/format/FieldFormatDirective;", "Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "field", "", "", "values", "name", "<init>", "(Lkotlinx/datetime/internal/format/UnsignedFieldSpec;Ljava/util/List;Ljava/lang/String;)V", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "formatter", "()Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "parser", "()Lkotlinx/datetime/internal/format/parser/ParserStructure;", "Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "getField", "()Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "AssignableString"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class NamedUnsignedIntFieldFormatDirective<Target> implements kotlinx.datetime.internal.format.FieldFormatDirective<Target> {
    private final kotlinx.datetime.internal.format.UnsignedFieldSpec<Target> field;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.List<java.lang.String> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public NamedUnsignedIntFieldFormatDirective(kotlinx.datetime.internal.format.UnsignedFieldSpec<? super Target> unsignedFieldSpec, java.util.List<java.lang.String> list, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsignedFieldSpec, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.field = unsignedFieldSpec;
        this.Camera2StreamConfigurationMap = list;
        this.getHighSpeedVideoFpsRanges = str;
        if (list.size() == (unsignedFieldSpec.getMaxValue() - unsignedFieldSpec.getMinValue()) + 1) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The number of values (");
        sb.append(list.size());
        sb.append(") in ");
        sb.append(list);
        sb.append(" does not match the range of the field (");
        sb.append((unsignedFieldSpec.getMaxValue() - unsignedFieldSpec.getMinValue()) + 1);
        sb.append(')');
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public /* bridge */ /* synthetic */ kotlinx.datetime.internal.format.FieldSpec getField() {
        return this.field;
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public final kotlinx.datetime.internal.format.UnsignedFieldSpec<Target> getField() {
        return this.field;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/datetime/internal/format/NamedUnsignedIntFieldFormatDirective$AssignableString;", "Lkotlinx/datetime/internal/format/parser/AssignableField;", "", "<init>", "(Lkotlinx/datetime/internal/format/NamedUnsignedIntFieldFormatDirective;)V", "getName", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class AssignableString implements kotlinx.datetime.internal.format.parser.AssignableField<Target, java.lang.String> {
        public AssignableString() {
        }

        @Override // kotlinx.datetime.internal.format.parser.AssignableField
        public final /* synthetic */ java.lang.String trySetWithoutReassigning(java.lang.Object obj, java.lang.String str) {
            java.lang.String str2 = str;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            java.lang.Integer trySetWithoutReassigning = kotlinx.datetime.internal.format.NamedUnsignedIntFieldFormatDirective.this.getField().getAccessor().trySetWithoutReassigning(obj, java.lang.Integer.valueOf(((kotlinx.datetime.internal.format.NamedUnsignedIntFieldFormatDirective) kotlinx.datetime.internal.format.NamedUnsignedIntFieldFormatDirective.this).Camera2StreamConfigurationMap.indexOf(str2) + kotlinx.datetime.internal.format.NamedUnsignedIntFieldFormatDirective.this.getField().getMinValue()));
            if (trySetWithoutReassigning == null) {
                return null;
            }
            kotlinx.datetime.internal.format.NamedUnsignedIntFieldFormatDirective<Target> namedUnsignedIntFieldFormatDirective = kotlinx.datetime.internal.format.NamedUnsignedIntFieldFormatDirective.this;
            return (java.lang.String) ((kotlinx.datetime.internal.format.NamedUnsignedIntFieldFormatDirective) namedUnsignedIntFieldFormatDirective).Camera2StreamConfigurationMap.get(trySetWithoutReassigning.intValue() - namedUnsignedIntFieldFormatDirective.getField().getMinValue());
        }

        @Override // kotlinx.datetime.internal.format.parser.AssignableField
        public final java.lang.String getName() {
            return ((kotlinx.datetime.internal.format.NamedUnsignedIntFieldFormatDirective) kotlinx.datetime.internal.format.NamedUnsignedIntFieldFormatDirective.this).getHighSpeedVideoFpsRanges;
        }
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public kotlinx.datetime.internal.format.formatter.FormatterStructure<Target> formatter() {
        return new kotlinx.datetime.internal.format.formatter.StringFormatterStructure(new kotlinx.datetime.internal.format.NamedUnsignedIntFieldFormatDirective$formatter$1(this));
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public kotlinx.datetime.internal.format.parser.ParserStructure<Target> parser() {
        java.util.List<java.lang.String> list = this.Camera2StreamConfigurationMap;
        kotlinx.datetime.internal.format.NamedUnsignedIntFieldFormatDirective.AssignableString assignableString = new kotlinx.datetime.internal.format.NamedUnsignedIntFieldFormatDirective.AssignableString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("one of ");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(" for ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        return new kotlinx.datetime.internal.format.parser.ParserStructure<>(kotlin.collections.CollectionsKt.listOf(new kotlinx.datetime.internal.format.parser.StringSetParserOperation(list, assignableString, sb.toString())), kotlin.collections.CollectionsKt.emptyList());
    }

    public static final /* synthetic */ java.lang.String access$getStringValue(kotlinx.datetime.internal.format.NamedUnsignedIntFieldFormatDirective namedUnsignedIntFieldFormatDirective, java.lang.Object obj) {
        int intValue = namedUnsignedIntFieldFormatDirective.field.getAccessor().getterNotNull(obj).intValue();
        java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(namedUnsignedIntFieldFormatDirective.Camera2StreamConfigurationMap, intValue - namedUnsignedIntFieldFormatDirective.field.getMinValue());
        if (str != null) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The value ");
        sb.append(intValue);
        sb.append(" of ");
        sb.append(namedUnsignedIntFieldFormatDirective.field.getName());
        sb.append(" does not have a corresponding string representation");
        return sb.toString();
    }
}
