package kotlinx.serialization.descriptors;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind;", "Lkotlinx/serialization/descriptors/SerialKind;", "<init>", "()V", "BOOLEAN", "BYTE", "CHAR", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "STRING", "Lkotlinx/serialization/descriptors/PrimitiveKind$BOOLEAN;", "Lkotlinx/serialization/descriptors/PrimitiveKind$BYTE;", "Lkotlinx/serialization/descriptors/PrimitiveKind$CHAR;", "Lkotlinx/serialization/descriptors/PrimitiveKind$DOUBLE;", "Lkotlinx/serialization/descriptors/PrimitiveKind$FLOAT;", "Lkotlinx/serialization/descriptors/PrimitiveKind$INT;", "Lkotlinx/serialization/descriptors/PrimitiveKind$LONG;", "Lkotlinx/serialization/descriptors/PrimitiveKind$SHORT;", "Lkotlinx/serialization/descriptors/PrimitiveKind$STRING;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PrimitiveKind extends kotlinx.serialization.descriptors.SerialKind {
    private PrimitiveKind() {
        super(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$BOOLEAN;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class BOOLEAN extends kotlinx.serialization.descriptors.PrimitiveKind {
        public static final kotlinx.serialization.descriptors.PrimitiveKind.BOOLEAN INSTANCE = new kotlinx.serialization.descriptors.PrimitiveKind.BOOLEAN();

        private BOOLEAN() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$BYTE;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class BYTE extends kotlinx.serialization.descriptors.PrimitiveKind {
        public static final kotlinx.serialization.descriptors.PrimitiveKind.BYTE INSTANCE = new kotlinx.serialization.descriptors.PrimitiveKind.BYTE();

        private BYTE() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$CHAR;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class CHAR extends kotlinx.serialization.descriptors.PrimitiveKind {
        public static final kotlinx.serialization.descriptors.PrimitiveKind.CHAR INSTANCE = new kotlinx.serialization.descriptors.PrimitiveKind.CHAR();

        private CHAR() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$SHORT;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class SHORT extends kotlinx.serialization.descriptors.PrimitiveKind {
        public static final kotlinx.serialization.descriptors.PrimitiveKind.SHORT INSTANCE = new kotlinx.serialization.descriptors.PrimitiveKind.SHORT();

        private SHORT() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$INT;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class INT extends kotlinx.serialization.descriptors.PrimitiveKind {
        public static final kotlinx.serialization.descriptors.PrimitiveKind.INT INSTANCE = new kotlinx.serialization.descriptors.PrimitiveKind.INT();

        private INT() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$LONG;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class LONG extends kotlinx.serialization.descriptors.PrimitiveKind {
        public static final kotlinx.serialization.descriptors.PrimitiveKind.LONG INSTANCE = new kotlinx.serialization.descriptors.PrimitiveKind.LONG();

        private LONG() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$FLOAT;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class FLOAT extends kotlinx.serialization.descriptors.PrimitiveKind {
        public static final kotlinx.serialization.descriptors.PrimitiveKind.FLOAT INSTANCE = new kotlinx.serialization.descriptors.PrimitiveKind.FLOAT();

        private FLOAT() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$DOUBLE;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class DOUBLE extends kotlinx.serialization.descriptors.PrimitiveKind {
        public static final kotlinx.serialization.descriptors.PrimitiveKind.DOUBLE INSTANCE = new kotlinx.serialization.descriptors.PrimitiveKind.DOUBLE();

        private DOUBLE() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$STRING;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class STRING extends kotlinx.serialization.descriptors.PrimitiveKind {
        public static final kotlinx.serialization.descriptors.PrimitiveKind.STRING INSTANCE = new kotlinx.serialization.descriptors.PrimitiveKind.STRING();

        private STRING() {
            super(null);
        }
    }

    public /* synthetic */ PrimitiveKind(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
