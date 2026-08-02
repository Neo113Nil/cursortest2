package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003BC\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0001\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00018\u00018\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lkotlinx/datetime/internal/format/GenericFieldSpec;", "Target", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE, "Lkotlinx/datetime/internal/format/AbstractFieldSpec;", "Lkotlinx/datetime/internal/format/Accessor;", "accessor", "", "name", "defaultValue", "Lkotlinx/datetime/internal/format/FieldSign;", "sign", "<init>", "(Lkotlinx/datetime/internal/format/Accessor;Ljava/lang/String;Ljava/lang/Object;Lkotlinx/datetime/internal/format/FieldSign;)V", "Lkotlinx/datetime/internal/format/Accessor;", "getAccessor", "()Lkotlinx/datetime/internal/format/Accessor;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/lang/Object;", "getDefaultValue", "()Ljava/lang/Object;", "Lkotlinx/datetime/internal/format/FieldSign;", "getSign", "()Lkotlinx/datetime/internal/format/FieldSign;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class GenericFieldSpec<Target, Type> extends kotlinx.datetime.internal.format.AbstractFieldSpec<Target, Type> {
    private final kotlinx.datetime.internal.format.Accessor<Target, Type> accessor;
    private final Type defaultValue;
    private final java.lang.String name;
    private final kotlinx.datetime.internal.format.FieldSign<Target> sign;

    @Override // kotlinx.datetime.internal.format.FieldSpec
    public final kotlinx.datetime.internal.format.Accessor<Target, Type> getAccessor() {
        return this.accessor;
    }

    public /* synthetic */ GenericFieldSpec(kotlinx.datetime.internal.format.Accessor accessor, java.lang.String str, java.lang.Object obj, kotlinx.datetime.internal.format.FieldSign fieldSign, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(accessor, (i & 2) != 0 ? accessor.getName() : str, (i & 4) != 0 ? null : obj, (i & 8) != 0 ? null : fieldSign);
    }

    @Override // kotlinx.datetime.internal.format.FieldSpec
    public final java.lang.String getName() {
        return this.name;
    }

    @Override // kotlinx.datetime.internal.format.FieldSpec
    public final Type getDefaultValue() {
        return this.defaultValue;
    }

    @Override // kotlinx.datetime.internal.format.FieldSpec
    public final kotlinx.datetime.internal.format.FieldSign<Target> getSign() {
        return this.sign;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GenericFieldSpec(kotlinx.datetime.internal.format.Accessor<? super Target, Type> accessor, java.lang.String str, Type type, kotlinx.datetime.internal.format.FieldSign<? super Target> fieldSign) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.accessor = accessor;
        this.name = str;
        this.defaultValue = type;
        this.sign = fieldSign;
    }
}
