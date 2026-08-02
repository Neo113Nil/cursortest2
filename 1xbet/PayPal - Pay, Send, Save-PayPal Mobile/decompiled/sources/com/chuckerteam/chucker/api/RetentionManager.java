package com.chuckerteam.chucker.api;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\nB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/chuckerteam/chucker/api/RetentionManager;", "", "Landroid/content/Context;", "context", "retentionPeriod", "<init>", "(Landroid/content/Context;Ljava/lang/Object;)V", "", "doMaintenance", "()V", "Period"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RetentionManager {
    public RetentionManager(android.content.Context context, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }

    public /* synthetic */ RetentionManager(android.content.Context context, java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : obj);
    }

    public final void doMaintenance() {
        synchronized (this) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/chuckerteam/chucker/api/RetentionManager$Period;", "", "<init>", "(Ljava/lang/String;I)V", "ONE_HOUR", "ONE_DAY", "ONE_WEEK", "FOREVER"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Period {
        private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
        public static final com.chuckerteam.chucker.api.RetentionManager.Period FOREVER;
        public static final com.chuckerteam.chucker.api.RetentionManager.Period ONE_DAY;
        public static final com.chuckerteam.chucker.api.RetentionManager.Period ONE_HOUR;
        public static final com.chuckerteam.chucker.api.RetentionManager.Period ONE_WEEK;
        private static final /* synthetic */ com.chuckerteam.chucker.api.RetentionManager.Period[] getHighResolutionOutputSizeshNQ4ISI;

        private Period(java.lang.String str, int i) {
        }

        static {
            com.chuckerteam.chucker.api.RetentionManager.Period period = new com.chuckerteam.chucker.api.RetentionManager.Period("ONE_HOUR", 0);
            ONE_HOUR = period;
            com.chuckerteam.chucker.api.RetentionManager.Period period2 = new com.chuckerteam.chucker.api.RetentionManager.Period("ONE_DAY", 1);
            ONE_DAY = period2;
            com.chuckerteam.chucker.api.RetentionManager.Period period3 = new com.chuckerteam.chucker.api.RetentionManager.Period("ONE_WEEK", 2);
            ONE_WEEK = period3;
            com.chuckerteam.chucker.api.RetentionManager.Period period4 = new com.chuckerteam.chucker.api.RetentionManager.Period("FOREVER", 3);
            FOREVER = period4;
            com.chuckerteam.chucker.api.RetentionManager.Period[] periodArr = {period, period2, period3, period4};
            getHighResolutionOutputSizeshNQ4ISI = periodArr;
            Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(periodArr);
        }

        public static com.chuckerteam.chucker.api.RetentionManager.Period[] values() {
            return (com.chuckerteam.chucker.api.RetentionManager.Period[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        }

        public static com.chuckerteam.chucker.api.RetentionManager.Period valueOf(java.lang.String str) {
            return (com.chuckerteam.chucker.api.RetentionManager.Period) java.lang.Enum.valueOf(com.chuckerteam.chucker.api.RetentionManager.Period.class, str);
        }

        public static kotlin.enums.EnumEntries<com.chuckerteam.chucker.api.RetentionManager.Period> getEntries() {
            return Camera2StreamConfigurationMap;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RetentionManager(android.content.Context context) {
        this(context, r0, 2, r0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
    }
}
