package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B'\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lkotlinx/datetime/internal/format/PropertyAccessor;", "Object", "Field", "Lkotlinx/datetime/internal/format/Accessor;", "Lkotlin/reflect/KMutableProperty1;", "property", "", "name", "<init>", "(Lkotlin/reflect/KMutableProperty1;Ljava/lang/String;)V", "container", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "trySetWithoutReassigning", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getter", "(Ljava/lang/Object;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/reflect/KMutableProperty1;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getName", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PropertyAccessor<Object, Field> implements kotlinx.datetime.internal.format.Accessor<Object, Field> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.reflect.KMutableProperty1<Object, Field> getHighSpeedVideoFpsRanges;
    private final java.lang.String name;

    public PropertyAccessor(kotlin.reflect.KMutableProperty1<Object, Field> kMutableProperty1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kMutableProperty1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoFpsRanges = kMutableProperty1;
        this.name = str;
    }

    public /* synthetic */ PropertyAccessor(kotlin.reflect.KMutableProperty1 kMutableProperty1, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(kMutableProperty1, (i & 2) != 0 ? kMutableProperty1.getName() : str);
    }

    @Override // kotlinx.datetime.internal.format.parser.AssignableField
    public final java.lang.String getName() {
        return this.name;
    }

    @Override // kotlinx.datetime.internal.format.parser.AssignableField
    public final Field trySetWithoutReassigning(Object container, Field newValue) {
        Field field = this.getHighSpeedVideoFpsRanges.get(container);
        if (field == null) {
            this.getHighSpeedVideoFpsRanges.set(container, newValue);
            return null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(field, newValue)) {
            return null;
        }
        return field;
    }

    @Override // kotlinx.datetime.internal.format.Accessor
    public final Field getter(Object container) {
        return this.getHighSpeedVideoFpsRanges.get(container);
    }
}
