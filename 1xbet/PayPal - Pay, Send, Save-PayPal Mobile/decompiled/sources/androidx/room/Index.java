package androidx.room;

@java.lang.annotation.Target({})
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB,\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\bR\u0019\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0007\u0010\fR\u0011\u0010\t\u001a\u00020\b8\u0007¢\u0006\u0006\u001a\u0004\b\t\u0010\r"}, d2 = {"Landroidx/room/Index;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "Landroidx/room/Index$Order;", "orders", "name", "", "unique", "()[Ljava/lang/String;", "()[Landroidx/room/Index$Order;", "()Ljava/lang/String;", "()Z", "Order"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: classes.dex */
public @interface Index {
    java.lang.String name() default "";

    androidx.room.Index.Order[] orders() default {};

    boolean unique() default false;

    java.lang.String[] value();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/room/Index$Order;", "", "<init>", "(Ljava/lang/String;I)V", "ASC", "DESC"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Order {
        public static final androidx.room.Index.Order ASC;
        public static final androidx.room.Index.Order DESC;
        private static final /* synthetic */ androidx.room.Index.Order[] getHighSpeedVideoFpsRangesFor;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

        private Order(java.lang.String str, int i) {
        }

        static {
            androidx.room.Index.Order order = new androidx.room.Index.Order("ASC", 0);
            ASC = order;
            androidx.room.Index.Order order2 = new androidx.room.Index.Order("DESC", 1);
            DESC = order2;
            androidx.room.Index.Order[] orderArr = {order, order2};
            getHighSpeedVideoFpsRangesFor = orderArr;
            getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(orderArr);
        }

        public static androidx.room.Index.Order[] values() {
            return (androidx.room.Index.Order[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        public static androidx.room.Index.Order valueOf(java.lang.String str) {
            return (androidx.room.Index.Order) java.lang.Enum.valueOf(androidx.room.Index.Order.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.room.Index.Order> getEntries() {
            return getHighSpeedVideoSizes;
        }
    }
}
