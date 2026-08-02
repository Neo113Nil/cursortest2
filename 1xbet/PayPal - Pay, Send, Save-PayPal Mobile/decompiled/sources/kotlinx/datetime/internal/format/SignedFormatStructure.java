package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 0\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lkotlinx/datetime/internal/format/SignedFormatStructure;", "T", "Lkotlinx/datetime/internal/format/NonConcatenatedFormatStructure;", "Lkotlinx/datetime/internal/format/FormatStructure;", "format", "", "withPlusSign", "<init>", "(Lkotlinx/datetime/internal/format/FormatStructure;Z)V", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "parser", "()Lkotlinx/datetime/internal/format/parser/ParserStructure;", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "formatter", "()Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Lkotlinx/datetime/internal/format/FormatStructure;", "getFormat", "()Lkotlinx/datetime/internal/format/FormatStructure;", "Z", "getWithPlusSign", "()Z", "", "Lkotlinx/datetime/internal/format/FieldSign;", "Camera2StreamConfigurationMap", "Ljava/util/Set;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SignedFormatStructure<T> implements kotlinx.datetime.internal.format.NonConcatenatedFormatStructure<T> {
    private final java.util.Set<kotlinx.datetime.internal.format.FieldSign<T>> Camera2StreamConfigurationMap;
    private final kotlinx.datetime.internal.format.FormatStructure<T> format;
    private final boolean withPlusSign;

    /* JADX WARN: Multi-variable type inference failed */
    public SignedFormatStructure(kotlinx.datetime.internal.format.FormatStructure<? super T> formatStructure, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatStructure, "");
        this.format = formatStructure;
        this.withPlusSign = z;
        java.util.List access$basicFormats = kotlinx.datetime.internal.format.FormatStructureKt.access$basicFormats(formatStructure);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = access$basicFormats.iterator();
        while (it.hasNext()) {
            kotlinx.datetime.internal.format.FieldSign sign = ((kotlinx.datetime.internal.format.FieldFormatDirective) it.next()).getField().getSign();
            if (sign != null) {
                arrayList.add(sign);
            }
        }
        java.util.Set<kotlinx.datetime.internal.format.FieldSign<T>> set = kotlin.collections.CollectionsKt.toSet(arrayList);
        this.Camera2StreamConfigurationMap = set;
        if (set.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Signed format must contain at least one field with a sign".toString());
        }
    }

    public final kotlinx.datetime.internal.format.FormatStructure<T> getFormat() {
        return this.format;
    }

    public final boolean getWithPlusSign() {
        return this.withPlusSign;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SignedFormatStructure(");
        sb.append(this.format);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof kotlinx.datetime.internal.format.SignedFormatStructure)) {
            return false;
        }
        kotlinx.datetime.internal.format.SignedFormatStructure signedFormatStructure = (kotlinx.datetime.internal.format.SignedFormatStructure) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.format, signedFormatStructure.format) && this.withPlusSign == signedFormatStructure.withPlusSign;
    }

    public final int hashCode() {
        return (this.format.hashCode() * 31) + java.lang.Boolean.hashCode(this.withPlusSign);
    }

    @Override // kotlinx.datetime.internal.format.FormatStructure
    public final kotlinx.datetime.internal.format.parser.ParserStructure<T> parser() {
        kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: kotlinx.datetime.internal.format.SignedFormatStructure$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return kotlinx.datetime.internal.format.SignedFormatStructure.m24170$r8$lambda$PsOeCTaOgBh6aM5uwNTX4_Id9M(kotlinx.datetime.internal.format.SignedFormatStructure.this, obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        };
        boolean z = this.withPlusSign;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("sign for ");
        sb.append(this.Camera2StreamConfigurationMap);
        return kotlinx.datetime.internal.format.parser.ParserKt.concat(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlinx.datetime.internal.format.parser.ParserStructure[]{new kotlinx.datetime.internal.format.parser.ParserStructure(kotlin.collections.CollectionsKt.listOf(new kotlinx.datetime.internal.format.parser.SignParser(function2, z, sb.toString())), kotlin.collections.CollectionsKt.emptyList()), this.format.parser()}));
    }

    @Override // kotlinx.datetime.internal.format.FormatStructure
    public final kotlinx.datetime.internal.format.formatter.FormatterStructure<T> formatter() {
        return new kotlinx.datetime.internal.format.formatter.SignedFormatter(this.format.formatter(), new kotlinx.datetime.internal.format.SignedFormatStructure$formatter$1(this), this.withPlusSign);
    }

    /* renamed from: $r8$lambda$PsOeCTaOgBh6aM-5uwNTX4_Id9M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m24170$r8$lambda$PsOeCTaOgBh6aM5uwNTX4_Id9M(kotlinx.datetime.internal.format.SignedFormatStructure signedFormatStructure, java.lang.Object obj, boolean z) {
        for (kotlinx.datetime.internal.format.FieldSign<T> fieldSign : signedFormatStructure.Camera2StreamConfigurationMap) {
            fieldSign.isNegative().trySetWithoutReassigning(obj, java.lang.Boolean.valueOf(z != kotlin.jvm.internal.Intrinsics.areEqual(fieldSign.isNegative().getter(obj), java.lang.Boolean.TRUE)));
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ boolean access$formatter$checkIfAllNegative(kotlinx.datetime.internal.format.SignedFormatStructure signedFormatStructure, java.lang.Object obj) {
        boolean z = false;
        for (kotlinx.datetime.internal.format.FieldSign<T> fieldSign : signedFormatStructure.Camera2StreamConfigurationMap) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(fieldSign.isNegative().getter(obj), java.lang.Boolean.TRUE)) {
                z = true;
            } else if (!fieldSign.isZero(obj)) {
                return false;
            }
        }
        return z;
    }
}
