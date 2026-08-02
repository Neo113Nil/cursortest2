package io.ktor.utils.io.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lio/ktor/utils/io/core/ByteOrder;", "", "Ljava/nio/ByteOrder;", "p0", "<init>", "(Ljava/lang/String;ILjava/nio/ByteOrder;)V", "nioOrder", "Ljava/nio/ByteOrder;", "getNioOrder", "()Ljava/nio/ByteOrder;", "Companion", "BIG_ENDIAN", "LITTLE_ENDIAN"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ByteOrder {
    public static final io.ktor.utils.io.core.ByteOrder BIG_ENDIAN;
    private static final io.ktor.utils.io.core.ByteOrder Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.utils.io.core.ByteOrder.Companion INSTANCE;
    public static final io.ktor.utils.io.core.ByteOrder LITTLE_ENDIAN;
    private static final /* synthetic */ io.ktor.utils.io.core.ByteOrder[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final java.nio.ByteOrder nioOrder;

    private ByteOrder(java.lang.String str, int i, java.nio.ByteOrder byteOrder) {
        this.nioOrder = byteOrder;
    }

    public final java.nio.ByteOrder getNioOrder() {
        return this.nioOrder;
    }

    static {
        java.nio.ByteOrder byteOrder = java.nio.ByteOrder.BIG_ENDIAN;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteOrder, "");
        io.ktor.utils.io.core.ByteOrder byteOrder2 = new io.ktor.utils.io.core.ByteOrder("BIG_ENDIAN", 0, byteOrder);
        BIG_ENDIAN = byteOrder2;
        java.nio.ByteOrder byteOrder3 = java.nio.ByteOrder.LITTLE_ENDIAN;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteOrder3, "");
        io.ktor.utils.io.core.ByteOrder byteOrder4 = new io.ktor.utils.io.core.ByteOrder("LITTLE_ENDIAN", 1, byteOrder3);
        LITTLE_ENDIAN = byteOrder4;
        io.ktor.utils.io.core.ByteOrder[] byteOrderArr = {byteOrder2, byteOrder4};
        getHighResolutionOutputSizeshNQ4ISI = byteOrderArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(byteOrderArr);
        INSTANCE = new io.ktor.utils.io.core.ByteOrder.Companion(null);
        java.nio.ByteOrder nativeOrder = java.nio.ByteOrder.nativeOrder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nativeOrder, "");
        Camera2StreamConfigurationMap = io.ktor.utils.io.core.ByteOrderJVMKt.access$orderOf(nativeOrder);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lio/ktor/utils/io/core/ByteOrder$Companion;", "", "<init>", "()V", "Ljava/nio/ByteOrder;", "nioOrder", "Lio/ktor/utils/io/core/ByteOrder;", "of", "(Ljava/nio/ByteOrder;)Lio/ktor/utils/io/core/ByteOrder;", "nativeOrder", "()Lio/ktor/utils/io/core/ByteOrder;", "Camera2StreamConfigurationMap", "Lio/ktor/utils/io/core/ByteOrder;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final io.ktor.utils.io.core.ByteOrder of(java.nio.ByteOrder nioOrder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nioOrder, "");
            return io.ktor.utils.io.core.ByteOrderJVMKt.access$orderOf(nioOrder);
        }

        public final io.ktor.utils.io.core.ByteOrder nativeOrder() {
            return io.ktor.utils.io.core.ByteOrder.Camera2StreamConfigurationMap;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static io.ktor.utils.io.core.ByteOrder valueOf(java.lang.String str) {
        return (io.ktor.utils.io.core.ByteOrder) java.lang.Enum.valueOf(io.ktor.utils.io.core.ByteOrder.class, str);
    }

    public static io.ktor.utils.io.core.ByteOrder[] values() {
        return (io.ktor.utils.io.core.ByteOrder[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static kotlin.enums.EnumEntries<io.ktor.utils.io.core.ByteOrder> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
