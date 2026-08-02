package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005"}, d2 = {"Lcom/zettle/sdk/analytics/Herd;", "", "Adapter", "Event", "Result", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface Herd {

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/zettle/sdk/analytics/Herd$Event;", "Lcom/zettle/sdk/analytics/Analytics$Event;", "Lcom/zettle/sdk/analytics/Herd$Type;", "type", "", "started", "ended", "Lcom/zettle/sdk/analytics/Herd$Result;", "result", "<init>", "(Lcom/zettle/sdk/analytics/Herd$Type;JJLcom/zettle/sdk/analytics/Herd$Result;)V", "J", "getEnded", "()J", "Lcom/zettle/sdk/analytics/Herd$Result;", "getResult", "()Lcom/zettle/sdk/analytics/Herd$Result;", "getStarted", "Lcom/zettle/sdk/analytics/Herd$Type;", "getType", "()Lcom/zettle/sdk/analytics/Herd$Type;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Event implements com.zettle.sdk.analytics.Analytics.Event {
        private final long ended;
        private final com.zettle.sdk.analytics.Herd.Result result;
        private final long started;
        private final com.zettle.sdk.analytics.Herd.Type type;

        public Event(com.zettle.sdk.analytics.Herd.Type type, long j, long j2, com.zettle.sdk.analytics.Herd.Result result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            this.type = type;
            this.started = j;
            this.ended = j2;
            this.result = result;
        }

        public final long getEnded() {
            return this.ended;
        }

        public final com.zettle.sdk.analytics.Herd.Result getResult() {
            return this.result;
        }

        public final long getStarted() {
            return this.started;
        }

        public final com.zettle.sdk.analytics.Herd.Type getType() {
            return this.type;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/analytics/Herd$Type;", "", "<init>", "()V", "Checkout", "PayPalQrc", "Payment", "TapToPayAttestation", "TapToPayCVMLimits", "TapToPayConfiguration", "TapToPayPayment", "Lcom/zettle/sdk/analytics/Herd$Type$Checkout;", "Lcom/zettle/sdk/analytics/Herd$Type$PayPalQrc;", "Lcom/zettle/sdk/analytics/Herd$Type$Payment;", "Lcom/zettle/sdk/analytics/Herd$Type$TapToPayAttestation;", "Lcom/zettle/sdk/analytics/Herd$Type$TapToPayCVMLimits;", "Lcom/zettle/sdk/analytics/Herd$Type$TapToPayConfiguration;", "Lcom/zettle/sdk/analytics/Herd$Type$TapToPayPayment;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Type {

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/analytics/Herd$Type$PayPalQrc;", "Lcom/zettle/sdk/analytics/Herd$Type;", "", "variant", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getVariant", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class PayPalQrc extends com.zettle.sdk.analytics.Herd.Type {
            private final java.lang.String variant;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PayPalQrc(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.variant = str;
            }

            public final java.lang.String getVariant() {
                return this.variant;
            }
        }

        private Type() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/analytics/Herd$Type$Payment;", "Lcom/zettle/sdk/analytics/Herd$Type;", "", "entryMode", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getEntryMode", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Payment extends com.zettle.sdk.analytics.Herd.Type {
            private final java.lang.String entryMode;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Payment(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.entryMode = str;
            }

            public final java.lang.String getEntryMode() {
                return this.entryMode;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/analytics/Herd$Type$Checkout;", "Lcom/zettle/sdk/analytics/Herd$Type;", "", "createCheckout", "<init>", "(I)V", com.visa.cbp.getEncExpo.warmup, "getCreateCheckout", "()I"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Checkout extends com.zettle.sdk.analytics.Herd.Type {
            private final int createCheckout;

            public Checkout(int i) {
                super(null);
                this.createCheckout = i;
            }

            public final int getCreateCheckout() {
                return this.createCheckout;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/analytics/Herd$Type$TapToPayPayment;", "Lcom/zettle/sdk/analytics/Herd$Type;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class TapToPayPayment extends com.zettle.sdk.analytics.Herd.Type {
            public static final com.zettle.sdk.analytics.Herd.Type.TapToPayPayment INSTANCE = new com.zettle.sdk.analytics.Herd.Type.TapToPayPayment();

            private TapToPayPayment() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/analytics/Herd$Type$TapToPayAttestation;", "Lcom/zettle/sdk/analytics/Herd$Type;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class TapToPayAttestation extends com.zettle.sdk.analytics.Herd.Type {
            public static final com.zettle.sdk.analytics.Herd.Type.TapToPayAttestation INSTANCE = new com.zettle.sdk.analytics.Herd.Type.TapToPayAttestation();

            private TapToPayAttestation() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/analytics/Herd$Type$TapToPayConfiguration;", "Lcom/zettle/sdk/analytics/Herd$Type;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class TapToPayConfiguration extends com.zettle.sdk.analytics.Herd.Type {
            public static final com.zettle.sdk.analytics.Herd.Type.TapToPayConfiguration INSTANCE = new com.zettle.sdk.analytics.Herd.Type.TapToPayConfiguration();

            private TapToPayConfiguration() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/analytics/Herd$Type$TapToPayCVMLimits;", "Lcom/zettle/sdk/analytics/Herd$Type;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class TapToPayCVMLimits extends com.zettle.sdk.analytics.Herd.Type {
            public static final com.zettle.sdk.analytics.Herd.Type.TapToPayCVMLimits INSTANCE = new com.zettle.sdk.analytics.Herd.Type.TapToPayCVMLimits();

            private TapToPayCVMLimits() {
                super(null);
            }
        }

        public /* synthetic */ Type(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/analytics/Herd$Result;", "", "<init>", "()V", "Failure", "Success", "Lcom/zettle/sdk/analytics/Herd$Result$Failure;", "Lcom/zettle/sdk/analytics/Herd$Result$Success;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Result {

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/analytics/Herd$Result$Success;", "Lcom/zettle/sdk/analytics/Herd$Result;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Success extends com.zettle.sdk.analytics.Herd.Result {
            public static final com.zettle.sdk.analytics.Herd.Result.Success INSTANCE = new com.zettle.sdk.analytics.Herd.Result.Success();

            private Success() {
                super(null);
            }
        }

        private Result() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/analytics/Herd$Result$Failure;", "Lcom/zettle/sdk/analytics/Herd$Result;", "", "reason", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Failure extends com.zettle.sdk.analytics.Herd.Result {
            private final java.lang.String reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.reason = str;
            }

            public final java.lang.String getReason() {
                return this.reason;
            }
        }

        public /* synthetic */ Result(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002"}, d2 = {"Lcom/zettle/sdk/analytics/Herd$Adapter;", "Lcom/zettle/sdk/analytics/Analytics$Adapter;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Adapter extends com.zettle.sdk.analytics.Analytics.Adapter {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.zettle.sdk.analytics.Herd.Adapter.Companion INSTANCE = com.zettle.sdk.analytics.Herd.Adapter.Companion.getHighResolutionOutputSizeshNQ4ISI;

        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/zettle/sdk/analytics/Herd$Adapter$Companion;", "", "<init>", "()V", "Lcom/zettle/sdk/core/user/UserModule;", "userModule", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "Lcom/zettle/sdk/analytics/Herd$Adapter;", "create", "(Lcom/zettle/sdk/core/user/UserModule;Lcom/zettle/sdk/meta/AppInfo;)Lcom/zettle/sdk/analytics/Herd$Adapter;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ com.zettle.sdk.analytics.Herd.Adapter.Companion getHighResolutionOutputSizeshNQ4ISI = new com.zettle.sdk.analytics.Herd.Adapter.Companion();

            private Companion() {
            }

            public final com.zettle.sdk.analytics.Herd.Adapter create(com.zettle.sdk.core.user.UserModule userModule, com.zettle.sdk.meta.AppInfo appInfo) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userModule, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
                return new com.zettle.sdk.analytics.HerdAdapterImpl(userModule, appInfo, com.zettle.sdk.meta.Platform.INSTANCE, new kotlin.jvm.functions.Function1<java.lang.Long, java.lang.String>() { // from class: com.zettle.sdk.analytics.Herd$Adapter$Companion$create$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ java.lang.String invoke(java.lang.Long l) {
                        return getHighSpeedVideoFpsRanges(l.longValue());
                    }

                    public final java.lang.String getHighSpeedVideoFpsRanges(long j) {
                        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", java.util.Locale.ENGLISH);
                        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
                        java.lang.String format = simpleDateFormat.format(new java.util.Date(j));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                        return format;
                    }
                });
            }
        }
    }
}
