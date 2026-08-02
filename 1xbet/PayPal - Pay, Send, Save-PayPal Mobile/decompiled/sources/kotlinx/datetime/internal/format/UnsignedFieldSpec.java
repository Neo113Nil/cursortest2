package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002BS\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0014"}, d2 = {"Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "Target", "Lkotlinx/datetime/internal/format/AbstractFieldSpec;", "", "Lkotlinx/datetime/internal/format/Accessor;", "accessor", "minValue", "maxValue", "", "name", "defaultValue", "Lkotlinx/datetime/internal/format/FieldSign;", "sign", "<init>", "(Lkotlinx/datetime/internal/format/Accessor;IILjava/lang/String;Ljava/lang/Integer;Lkotlinx/datetime/internal/format/FieldSign;)V", "Lkotlinx/datetime/internal/format/Accessor;", "getAccessor", "()Lkotlinx/datetime/internal/format/Accessor;", com.visa.cbp.getEncExpo.warmup, "getMinValue", "()I", "getMaxValue", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getDefaultValue", "()Ljava/lang/Integer;", "Lkotlinx/datetime/internal/format/FieldSign;", "getSign", "()Lkotlinx/datetime/internal/format/FieldSign;", "maxDigits", "getMaxDigits"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UnsignedFieldSpec<Target> extends kotlinx.datetime.internal.format.AbstractFieldSpec<Target, java.lang.Integer> {
    private final kotlinx.datetime.internal.format.Accessor<Target, java.lang.Integer> accessor;
    private final java.lang.Integer defaultValue;
    private final int maxDigits;
    private final int maxValue;
    private final int minValue;
    private final java.lang.String name;
    private final kotlinx.datetime.internal.format.FieldSign<Target> sign;

    @Override // kotlinx.datetime.internal.format.FieldSpec
    public final kotlinx.datetime.internal.format.Accessor<Target, java.lang.Integer> getAccessor() {
        return this.accessor;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public /* synthetic */ UnsignedFieldSpec(kotlinx.datetime.internal.format.Accessor accessor, int i, int i2, java.lang.String str, java.lang.Integer num, kotlinx.datetime.internal.format.FieldSign fieldSign, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(accessor, i, i2, (i3 & 8) != 0 ? accessor.getName() : str, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : fieldSign);
    }

    @Override // kotlinx.datetime.internal.format.FieldSpec
    public final java.lang.String getName() {
        return this.name;
    }

    @Override // kotlinx.datetime.internal.format.FieldSpec
    public final java.lang.Integer getDefaultValue() {
        return this.defaultValue;
    }

    @Override // kotlinx.datetime.internal.format.FieldSpec
    public final kotlinx.datetime.internal.format.FieldSign<Target> getSign() {
        return this.sign;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnsignedFieldSpec(kotlinx.datetime.internal.format.Accessor<? super Target, java.lang.Integer> accessor, int i, int i2, java.lang.String str, java.lang.Integer num, kotlinx.datetime.internal.format.FieldSign<? super Target> fieldSign) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.accessor = accessor;
        this.minValue = i;
        this.maxValue = i2;
        this.name = str;
        this.defaultValue = num;
        this.sign = fieldSign;
        if (i2 < 10) {
            i3 = 1;
        } else if (i2 < 100) {
            i3 = 2;
        } else {
            if (i2 >= 1000) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Max value ");
                sb.append(i2);
                sb.append(" is too large");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            i3 = 3;
        }
        this.maxDigits = i3;
    }

    public final int getMaxDigits() {
        return this.maxDigits;
    }
}
