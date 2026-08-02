package kotlinx.serialization.descriptors;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lkotlinx/serialization/descriptors/PolymorphicKind;", "Lkotlinx/serialization/descriptors/SerialKind;", "<init>", "()V", "SEALED", "OPEN", "Lkotlinx/serialization/descriptors/PolymorphicKind$OPEN;", "Lkotlinx/serialization/descriptors/PolymorphicKind$SEALED;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.ExperimentalSerializationApi
/* loaded from: classes3.dex */
public abstract class PolymorphicKind extends kotlinx.serialization.descriptors.SerialKind {
    private PolymorphicKind() {
        super(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/PolymorphicKind$SEALED;", "Lkotlinx/serialization/descriptors/PolymorphicKind;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class SEALED extends kotlinx.serialization.descriptors.PolymorphicKind {
        public static final kotlinx.serialization.descriptors.PolymorphicKind.SEALED INSTANCE = new kotlinx.serialization.descriptors.PolymorphicKind.SEALED();

        private SEALED() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/PolymorphicKind$OPEN;", "Lkotlinx/serialization/descriptors/PolymorphicKind;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OPEN extends kotlinx.serialization.descriptors.PolymorphicKind {
        public static final kotlinx.serialization.descriptors.PolymorphicKind.OPEN INSTANCE = new kotlinx.serialization.descriptors.PolymorphicKind.OPEN();

        private OPEN() {
            super(null);
        }
    }

    public /* synthetic */ PolymorphicKind(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
