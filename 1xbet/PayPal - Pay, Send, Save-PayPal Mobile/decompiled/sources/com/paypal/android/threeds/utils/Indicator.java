package com.paypal.android.threeds.utils;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/android/threeds/utils/Indicator;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Yes", "No", "Lcom/paypal/android/threeds/utils/Indicator$No;", "Lcom/paypal/android/threeds/utils/Indicator$Yes;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class Indicator {
    public static final int $stable = 0;
    private final java.lang.String value;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/android/threeds/utils/Indicator$Yes;", "Lcom/paypal/android/threeds/utils/Indicator;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Yes extends com.paypal.android.threeds.utils.Indicator {
        public static final int $stable = 0;
        public static final com.paypal.android.threeds.utils.Indicator.Yes INSTANCE = new com.paypal.android.threeds.utils.Indicator.Yes();

        private Yes() {
            super("Y", null);
        }
    }

    private Indicator(java.lang.String str) {
        this.value = str;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/android/threeds/utils/Indicator$No;", "Lcom/paypal/android/threeds/utils/Indicator;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class No extends com.paypal.android.threeds.utils.Indicator {
        public static final int $stable = 0;
        public static final com.paypal.android.threeds.utils.Indicator.No INSTANCE = new com.paypal.android.threeds.utils.Indicator.No();

        private No() {
            super("N", null);
        }
    }

    public /* synthetic */ Indicator(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
