package kotlinx.serialization.descriptors;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t\u0082\u0001\u0005\f\r\u000e\u000f\u0010"}, d2 = {"Lkotlinx/serialization/descriptors/SerialKind;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "ENUM", "CONTEXTUAL", "Lkotlinx/serialization/descriptors/PolymorphicKind;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "Lkotlinx/serialization/descriptors/SerialKind$CONTEXTUAL;", "Lkotlinx/serialization/descriptors/SerialKind$ENUM;", "Lkotlinx/serialization/descriptors/StructureKind;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class SerialKind {
    private SerialKind() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/SerialKind$ENUM;", "Lkotlinx/serialization/descriptors/SerialKind;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ENUM extends kotlinx.serialization.descriptors.SerialKind {
        public static final kotlinx.serialization.descriptors.SerialKind.ENUM INSTANCE = new kotlinx.serialization.descriptors.SerialKind.ENUM();

        private ENUM() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/SerialKind$CONTEXTUAL;", "Lkotlinx/serialization/descriptors/SerialKind;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class CONTEXTUAL extends kotlinx.serialization.descriptors.SerialKind {
        public static final kotlinx.serialization.descriptors.SerialKind.CONTEXTUAL INSTANCE = new kotlinx.serialization.descriptors.SerialKind.CONTEXTUAL();

        private CONTEXTUAL() {
            super(null);
        }
    }

    public java.lang.String toString() {
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        kotlin.jvm.internal.Intrinsics.checkNotNull(simpleName);
        return simpleName;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public /* synthetic */ SerialKind(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
