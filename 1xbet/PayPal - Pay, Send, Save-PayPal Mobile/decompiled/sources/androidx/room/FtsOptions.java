package androidx.room;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\n\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Landroidx/room/FtsOptions;", "", "<init>", "()V", "", "TOKENIZER_SIMPLE", "Ljava/lang/String;", "TOKENIZER_PORTER", "TOKENIZER_ICU", "TOKENIZER_UNICODE61", "MatchInfo", "Order"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FtsOptions {
    public static final androidx.room.FtsOptions INSTANCE = new androidx.room.FtsOptions();
    public static final java.lang.String TOKENIZER_ICU = "icu";
    public static final java.lang.String TOKENIZER_PORTER = "porter";
    public static final java.lang.String TOKENIZER_SIMPLE = "simple";
    public static final java.lang.String TOKENIZER_UNICODE61 = "unicode61";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/room/FtsOptions$MatchInfo;", "", "<init>", "(Ljava/lang/String;I)V", "FTS3", "FTS4"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class MatchInfo {
        private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
        public static final androidx.room.FtsOptions.MatchInfo FTS3;
        public static final androidx.room.FtsOptions.MatchInfo FTS4;
        private static final /* synthetic */ androidx.room.FtsOptions.MatchInfo[] getHighResolutionOutputSizeshNQ4ISI;

        private MatchInfo(java.lang.String str, int i) {
        }

        static {
            androidx.room.FtsOptions.MatchInfo matchInfo = new androidx.room.FtsOptions.MatchInfo("FTS3", 0);
            FTS3 = matchInfo;
            androidx.room.FtsOptions.MatchInfo matchInfo2 = new androidx.room.FtsOptions.MatchInfo("FTS4", 1);
            FTS4 = matchInfo2;
            androidx.room.FtsOptions.MatchInfo[] matchInfoArr = {matchInfo, matchInfo2};
            getHighResolutionOutputSizeshNQ4ISI = matchInfoArr;
            Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(matchInfoArr);
        }

        public static androidx.room.FtsOptions.MatchInfo[] values() {
            return (androidx.room.FtsOptions.MatchInfo[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        }

        public static androidx.room.FtsOptions.MatchInfo valueOf(java.lang.String str) {
            return (androidx.room.FtsOptions.MatchInfo) java.lang.Enum.valueOf(androidx.room.FtsOptions.MatchInfo.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.room.FtsOptions.MatchInfo> getEntries() {
            return Camera2StreamConfigurationMap;
        }
    }

    private FtsOptions() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/room/FtsOptions$Order;", "", "<init>", "(Ljava/lang/String;I)V", "ASC", "DESC"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Order {
        public static final androidx.room.FtsOptions.Order ASC;
        public static final androidx.room.FtsOptions.Order DESC;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ androidx.room.FtsOptions.Order[] getHighSpeedVideoFpsRangesFor;

        private Order(java.lang.String str, int i) {
        }

        static {
            androidx.room.FtsOptions.Order order = new androidx.room.FtsOptions.Order("ASC", 0);
            ASC = order;
            androidx.room.FtsOptions.Order order2 = new androidx.room.FtsOptions.Order("DESC", 1);
            DESC = order2;
            androidx.room.FtsOptions.Order[] orderArr = {order, order2};
            getHighSpeedVideoFpsRangesFor = orderArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(orderArr);
        }

        public static androidx.room.FtsOptions.Order[] values() {
            return (androidx.room.FtsOptions.Order[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        public static androidx.room.FtsOptions.Order valueOf(java.lang.String str) {
            return (androidx.room.FtsOptions.Order) java.lang.Enum.valueOf(androidx.room.FtsOptions.Order.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.room.FtsOptions.Order> getEntries() {
            return getHighSpeedVideoFpsRanges;
        }
    }
}
