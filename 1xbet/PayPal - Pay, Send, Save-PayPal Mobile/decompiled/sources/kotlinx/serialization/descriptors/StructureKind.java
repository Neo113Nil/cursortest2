package kotlinx.serialization.descriptors;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lkotlinx/serialization/descriptors/StructureKind;", "Lkotlinx/serialization/descriptors/SerialKind;", "<init>", "()V", "CLASS", "LIST", "MAP", "OBJECT", "Lkotlinx/serialization/descriptors/StructureKind$CLASS;", "Lkotlinx/serialization/descriptors/StructureKind$LIST;", "Lkotlinx/serialization/descriptors/StructureKind$MAP;", "Lkotlinx/serialization/descriptors/StructureKind$OBJECT;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class StructureKind extends kotlinx.serialization.descriptors.SerialKind {
    private StructureKind() {
        super(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/StructureKind$CLASS;", "Lkotlinx/serialization/descriptors/StructureKind;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CLASS extends kotlinx.serialization.descriptors.StructureKind {
        public static final kotlinx.serialization.descriptors.StructureKind.CLASS INSTANCE = new kotlinx.serialization.descriptors.StructureKind.CLASS();

        private CLASS() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/StructureKind$LIST;", "Lkotlinx/serialization/descriptors/StructureKind;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class LIST extends kotlinx.serialization.descriptors.StructureKind {
        public static final kotlinx.serialization.descriptors.StructureKind.LIST INSTANCE = new kotlinx.serialization.descriptors.StructureKind.LIST();

        private LIST() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/StructureKind$MAP;", "Lkotlinx/serialization/descriptors/StructureKind;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class MAP extends kotlinx.serialization.descriptors.StructureKind {
        public static final kotlinx.serialization.descriptors.StructureKind.MAP INSTANCE = new kotlinx.serialization.descriptors.StructureKind.MAP();

        private MAP() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/StructureKind$OBJECT;", "Lkotlinx/serialization/descriptors/StructureKind;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OBJECT extends kotlinx.serialization.descriptors.StructureKind {
        public static final kotlinx.serialization.descriptors.StructureKind.OBJECT INSTANCE = new kotlinx.serialization.descriptors.StructureKind.OBJECT();

        private OBJECT() {
            super(null);
        }
    }

    public /* synthetic */ StructureKind(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
