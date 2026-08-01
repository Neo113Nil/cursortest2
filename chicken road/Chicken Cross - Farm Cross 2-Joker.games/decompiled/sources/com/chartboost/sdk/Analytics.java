package com.chartboost.sdk;

import com.chartboost.sdk.impl.b4;
import com.chartboost.sdk.impl.k1;
import com.chartboost.sdk.impl.mb;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005&'()*B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJK\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u000eJ+\u0010\u0017\u001a\u00020\f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010!R\u0014\u0010%\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006+"}, d2 = {"Lcom/chartboost/sdk/Analytics;", "", "<init>", "()V", "", "title", "description", "price", "currency", SDKConstants.PARAM_PRODUCT_ID, "purchaseData", "purchaseSignature", "", "trackInAppGooglePlayPurchaseEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", SDKConstants.PARAM_USER_ID, "purchaseToken", "trackInAppAmazonStorePurchaseEvent", "Ljava/util/HashMap;", "Lcom/chartboost/sdk/Analytics$IAPPurchaseInfo;", "iAPPurchaseInfoMap", "Lcom/chartboost/sdk/Analytics$IAPType;", "iapType", "trackInAppPurchaseEvent", "(Ljava/util/HashMap;Lcom/chartboost/sdk/Analytics$IAPType;)V", "eventLabel", "Lcom/chartboost/sdk/Analytics$LevelType;", "type", "", "mainLevel", "trackLevelInfo", "(Ljava/lang/String;Lcom/chartboost/sdk/Analytics$LevelType;ILjava/lang/String;)V", "subLevel", "(Ljava/lang/String;Lcom/chartboost/sdk/Analytics$LevelType;IILjava/lang/String;)V", "Lcom/chartboost/sdk/impl/k1;", "getAnalyticsApi", "()Lcom/chartboost/sdk/impl/k1;", "analyticsApi", "IAPType", "IAPPurchaseInfo", "LevelType", "CustomEventType", "MiscRevenueGeneratingEventType", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Analytics {
    public static final Analytics INSTANCE = new Analytics();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/chartboost/sdk/Analytics$CustomEventType;", "", "<init>", "(Ljava/lang/String;I)V", "CustomEventType1", "CustomEventType2", "CustomEventType3", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CustomEventType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CustomEventType[] $VALUES;
        public static final CustomEventType CustomEventType1 = new CustomEventType("CustomEventType1", 0);
        public static final CustomEventType CustomEventType2 = new CustomEventType("CustomEventType2", 1);
        public static final CustomEventType CustomEventType3 = new CustomEventType("CustomEventType3", 2);

        private static final /* synthetic */ CustomEventType[] $values() {
            return new CustomEventType[]{CustomEventType1, CustomEventType2, CustomEventType3};
        }

        static {
            CustomEventType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private CustomEventType(String str, int i) {
        }

        public static EnumEntries<CustomEventType> getEntries() {
            return $ENTRIES;
        }

        public static CustomEventType valueOf(String str) {
            return (CustomEventType) Enum.valueOf(CustomEventType.class, str);
        }

        public static CustomEventType[] values() {
            return (CustomEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/chartboost/sdk/Analytics$IAPPurchaseInfo;", "", "<init>", "(Ljava/lang/String;I)V", "PRODUCT_ID", "PRODUCT_TITLE", "PRODUCT_DESCRIPTION", "PRODUCT_PRICE", "PRODUCT_CURRENCY_CODE", "GOOGLE_PURCHASE_DATA", "GOOGLE_PURCHASE_SIGNATURE", "AMAZON_PURCHASE_TOKEN", "AMAZON_USER_ID", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IAPPurchaseInfo {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAPPurchaseInfo[] $VALUES;
        public static final IAPPurchaseInfo PRODUCT_ID = new IAPPurchaseInfo("PRODUCT_ID", 0);
        public static final IAPPurchaseInfo PRODUCT_TITLE = new IAPPurchaseInfo("PRODUCT_TITLE", 1);
        public static final IAPPurchaseInfo PRODUCT_DESCRIPTION = new IAPPurchaseInfo("PRODUCT_DESCRIPTION", 2);
        public static final IAPPurchaseInfo PRODUCT_PRICE = new IAPPurchaseInfo("PRODUCT_PRICE", 3);
        public static final IAPPurchaseInfo PRODUCT_CURRENCY_CODE = new IAPPurchaseInfo("PRODUCT_CURRENCY_CODE", 4);
        public static final IAPPurchaseInfo GOOGLE_PURCHASE_DATA = new IAPPurchaseInfo("GOOGLE_PURCHASE_DATA", 5);
        public static final IAPPurchaseInfo GOOGLE_PURCHASE_SIGNATURE = new IAPPurchaseInfo("GOOGLE_PURCHASE_SIGNATURE", 6);
        public static final IAPPurchaseInfo AMAZON_PURCHASE_TOKEN = new IAPPurchaseInfo("AMAZON_PURCHASE_TOKEN", 7);
        public static final IAPPurchaseInfo AMAZON_USER_ID = new IAPPurchaseInfo("AMAZON_USER_ID", 8);

        private static final /* synthetic */ IAPPurchaseInfo[] $values() {
            return new IAPPurchaseInfo[]{PRODUCT_ID, PRODUCT_TITLE, PRODUCT_DESCRIPTION, PRODUCT_PRICE, PRODUCT_CURRENCY_CODE, GOOGLE_PURCHASE_DATA, GOOGLE_PURCHASE_SIGNATURE, AMAZON_PURCHASE_TOKEN, AMAZON_USER_ID};
        }

        static {
            IAPPurchaseInfo[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private IAPPurchaseInfo(String str, int i) {
        }

        public static EnumEntries<IAPPurchaseInfo> getEntries() {
            return $ENTRIES;
        }

        public static IAPPurchaseInfo valueOf(String str) {
            return (IAPPurchaseInfo) Enum.valueOf(IAPPurchaseInfo.class, str);
        }

        public static IAPPurchaseInfo[] values() {
            return (IAPPurchaseInfo[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/chartboost/sdk/Analytics$IAPType;", "", "<init>", "(Ljava/lang/String;I)V", "GOOGLE_PLAY", "AMAZON", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IAPType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAPType[] $VALUES;
        public static final IAPType GOOGLE_PLAY = new IAPType("GOOGLE_PLAY", 0);
        public static final IAPType AMAZON = new IAPType("AMAZON", 1);

        private static final /* synthetic */ IAPType[] $values() {
            return new IAPType[]{GOOGLE_PLAY, AMAZON};
        }

        static {
            IAPType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private IAPType(String str, int i) {
        }

        public static EnumEntries<IAPType> getEntries() {
            return $ENTRIES;
        }

        public static IAPType valueOf(String str) {
            return (IAPType) Enum.valueOf(IAPType.class, str);
        }

        public static IAPType[] values() {
            return (IAPType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/chartboost/sdk/Analytics$LevelType;", "", "levelType", "", "<init>", "(Ljava/lang/String;II)V", "getLevelType", "()I", "HIGHEST_LEVEL_REACHED", "CURRENT_AREA", "CHARACTER_LEVEL", "OTHER_SEQUENTIAL", "OTHER_NONSEQUENTIAL", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LevelType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LevelType[] $VALUES;
        private final int levelType;
        public static final LevelType HIGHEST_LEVEL_REACHED = new LevelType("HIGHEST_LEVEL_REACHED", 0, 1);
        public static final LevelType CURRENT_AREA = new LevelType("CURRENT_AREA", 1, 2);
        public static final LevelType CHARACTER_LEVEL = new LevelType("CHARACTER_LEVEL", 2, 3);
        public static final LevelType OTHER_SEQUENTIAL = new LevelType("OTHER_SEQUENTIAL", 3, 4);
        public static final LevelType OTHER_NONSEQUENTIAL = new LevelType("OTHER_NONSEQUENTIAL", 4, 5);

        private static final /* synthetic */ LevelType[] $values() {
            return new LevelType[]{HIGHEST_LEVEL_REACHED, CURRENT_AREA, CHARACTER_LEVEL, OTHER_SEQUENTIAL, OTHER_NONSEQUENTIAL};
        }

        static {
            LevelType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private LevelType(String str, int i, int i2) {
            this.levelType = i2;
        }

        public static EnumEntries<LevelType> getEntries() {
            return $ENTRIES;
        }

        public static LevelType valueOf(String str) {
            return (LevelType) Enum.valueOf(LevelType.class, str);
        }

        public static LevelType[] values() {
            return (LevelType[]) $VALUES.clone();
        }

        public final int getLevelType() {
            return this.levelType;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/chartboost/sdk/Analytics$MiscRevenueGeneratingEventType;", "", "<init>", "(Ljava/lang/String;I)V", "MiscRevenueGeneratingEventType1", "MiscRevenueGeneratingEventType2", "MiscRevenueGeneratingEventType3", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MiscRevenueGeneratingEventType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MiscRevenueGeneratingEventType[] $VALUES;
        public static final MiscRevenueGeneratingEventType MiscRevenueGeneratingEventType1 = new MiscRevenueGeneratingEventType("MiscRevenueGeneratingEventType1", 0);
        public static final MiscRevenueGeneratingEventType MiscRevenueGeneratingEventType2 = new MiscRevenueGeneratingEventType("MiscRevenueGeneratingEventType2", 1);
        public static final MiscRevenueGeneratingEventType MiscRevenueGeneratingEventType3 = new MiscRevenueGeneratingEventType("MiscRevenueGeneratingEventType3", 2);

        private static final /* synthetic */ MiscRevenueGeneratingEventType[] $values() {
            return new MiscRevenueGeneratingEventType[]{MiscRevenueGeneratingEventType1, MiscRevenueGeneratingEventType2, MiscRevenueGeneratingEventType3};
        }

        static {
            MiscRevenueGeneratingEventType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private MiscRevenueGeneratingEventType(String str, int i) {
        }

        public static EnumEntries<MiscRevenueGeneratingEventType> getEntries() {
            return $ENTRIES;
        }

        public static MiscRevenueGeneratingEventType valueOf(String str) {
            return (MiscRevenueGeneratingEventType) Enum.valueOf(MiscRevenueGeneratingEventType.class, str);
        }

        public static MiscRevenueGeneratingEventType[] values() {
            return (MiscRevenueGeneratingEventType[]) $VALUES.clone();
        }
    }

    private Analytics() {
    }

    private final k1 getAnalyticsApi() {
        return b4.b.j().b();
    }

    @JvmStatic
    public static final void trackInAppAmazonStorePurchaseEvent(String title, String description, String price, String currency, String productID, String userID, String purchaseToken) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(productID, "productID");
        if (Chartboost.isSdkStarted()) {
            INSTANCE.getAnalyticsApi().a(productID, title, description, price, currency, null, null, userID, purchaseToken, IAPType.AMAZON);
        } else {
            mb.b("You need to call Chartboost.startWithAppId() before tracking in-app purchases", (Throwable) null, 2, (Object) null);
        }
    }

    @JvmStatic
    public static final void trackInAppGooglePlayPurchaseEvent(String title, String description, String price, String currency, String productID, String purchaseData, String purchaseSignature) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(productID, "productID");
        if (Chartboost.isSdkStarted()) {
            INSTANCE.getAnalyticsApi().a(productID, title, description, price, currency, purchaseData, purchaseSignature, null, null, IAPType.GOOGLE_PLAY);
        } else {
            mb.b("You need to call Chartboost.startWithAppId() before tracking in-app purchases", (Throwable) null, 2, (Object) null);
        }
    }

    @JvmStatic
    public static final void trackInAppPurchaseEvent(HashMap<IAPPurchaseInfo, String> iAPPurchaseInfoMap, IAPType iapType) {
        Intrinsics.checkNotNullParameter(iAPPurchaseInfoMap, "iAPPurchaseInfoMap");
        Intrinsics.checkNotNullParameter(iapType, "iapType");
        if (!Chartboost.isSdkStarted()) {
            mb.b("You need to call Chartboost.startWithAppId() before tracking in-app purchases", (Throwable) null, 2, (Object) null);
            return;
        }
        String str = iAPPurchaseInfoMap.get(IAPPurchaseInfo.GOOGLE_PURCHASE_DATA);
        String str2 = iAPPurchaseInfoMap.get(IAPPurchaseInfo.GOOGLE_PURCHASE_SIGNATURE);
        String str3 = iAPPurchaseInfoMap.get(IAPPurchaseInfo.AMAZON_USER_ID);
        String str4 = iAPPurchaseInfoMap.get(IAPPurchaseInfo.AMAZON_PURCHASE_TOKEN);
        String str5 = iAPPurchaseInfoMap.get(IAPPurchaseInfo.PRODUCT_ID);
        String str6 = iAPPurchaseInfoMap.get(IAPPurchaseInfo.PRODUCT_TITLE);
        String str7 = iAPPurchaseInfoMap.get(IAPPurchaseInfo.PRODUCT_DESCRIPTION);
        String str8 = iAPPurchaseInfoMap.get(IAPPurchaseInfo.PRODUCT_PRICE);
        String str9 = iAPPurchaseInfoMap.get(IAPPurchaseInfo.PRODUCT_CURRENCY_CODE);
        if (str5 == null || str5.length() == 0 || str6 == null || str6.length() == 0 || str7 == null || str7.length() == 0 || str8 == null || str8.length() == 0 || str9 == null || str9.length() == 0) {
            mb.b("Null object is passed. Please pass a valid value object", (Throwable) null, 2, (Object) null);
        } else {
            INSTANCE.getAnalyticsApi().a(str5, str6, str7, str8, str9, str, str2, str3, str4, iapType);
        }
    }

    @JvmStatic
    public static final void trackLevelInfo(String eventLabel, LevelType type, int mainLevel, String description) {
        Intrinsics.checkNotNullParameter(eventLabel, "eventLabel");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(description, "description");
        trackLevelInfo(eventLabel, type, mainLevel, 0, description);
    }

    @JvmStatic
    public static final void trackLevelInfo(String eventLabel, LevelType type, int mainLevel, int subLevel, String description) {
        Intrinsics.checkNotNullParameter(eventLabel, "eventLabel");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(description, "description");
        if (Chartboost.isSdkStarted()) {
            INSTANCE.getAnalyticsApi().a(eventLabel, type, mainLevel, subLevel, description, System.currentTimeMillis());
        } else {
            mb.b("You need to call Chartboost.startWithAppId() before tracking in-app purchases", (Throwable) null, 2, (Object) null);
        }
    }
}
