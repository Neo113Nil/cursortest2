package com.paypal.oslo.feature.bnplservicing.domain.model.common;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\"#$B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$InstrumentFormat;", "instrumentFormat", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$UsageChannel;", "usageChannel", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$AutopayRequirement;", "autopayRequirement", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$InstrumentFormat;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$UsageChannel;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$AutopayRequirement;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$InstrumentFormat;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$UsageChannel;", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$AutopayRequirement;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$InstrumentFormat;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$UsageChannel;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$AutopayRequirement;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$InstrumentFormat;", "getInstrumentFormat", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$UsageChannel;", "getUsageChannel", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$AutopayRequirement;", "getAutopayRequirement", "InstrumentFormat", "UsageChannel", "AutopayRequirement"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class VariantPolicy {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement autopayRequirement;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat instrumentFormat;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel usageChannel;

    public VariantPolicy(com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat instrumentFormat, com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel usageChannel, com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement autopayRequirement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentFormat, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(usageChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayRequirement, "");
        this.instrumentFormat = instrumentFormat;
        this.usageChannel = usageChannel;
        this.autopayRequirement = autopayRequirement;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat getInstrumentFormat() {
        return this.instrumentFormat;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel getUsageChannel() {
        return this.usageChannel;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement getAutopayRequirement() {
        return this.autopayRequirement;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$InstrumentFormat;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "CREDIT_FINANCIAL_INSTRUMENT", "VIRTUAL_CREDIT_CARD", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InstrumentFormat {
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat CREDIT_FINANCIAL_INSTRUMENT;
        private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat[] Camera2StreamConfigurationMap;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat.Companion INSTANCE;
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat UNKNOWN;
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat VIRTUAL_CREDIT_CARD;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

        private InstrumentFormat(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat instrumentFormat = new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat("CREDIT_FINANCIAL_INSTRUMENT", 0);
            CREDIT_FINANCIAL_INSTRUMENT = instrumentFormat;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat instrumentFormat2 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat("VIRTUAL_CREDIT_CARD", 1);
            VIRTUAL_CREDIT_CARD = instrumentFormat2;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat instrumentFormat3 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat("UNKNOWN", 2);
            UNKNOWN = instrumentFormat3;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat[] instrumentFormatArr = {instrumentFormat, instrumentFormat2, instrumentFormat3};
            Camera2StreamConfigurationMap = instrumentFormatArr;
            getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(instrumentFormatArr);
            INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat.Companion(null);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$InstrumentFormat$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$InstrumentFormat;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$InstrumentFormat;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat from(java.lang.String value) {
                java.lang.Object obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
                java.util.Iterator<E> it = com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat) obj).name(), value)) {
                        break;
                    }
                }
                com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat instrumentFormat = (com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat) obj;
                return instrumentFormat == null ? com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat.UNKNOWN : instrumentFormat;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public static com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat[] values() {
            return (com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat[]) Camera2StreamConfigurationMap.clone();
        }

        public static com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat> getEntries() {
            return getHighSpeedVideoFpsRangesFor;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$UsageChannel;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "CHECKOUT", com.paypal.oslo.feature.bnplacquisition.domain.utilities.RequestUsageChannel.CONTACTLESS_MOBILE_WALLET, "EXTERNAL_ECOMMERCE", "TRANSACTION_FUNDING_FLIP", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UsageChannel {
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel CHECKOUT;
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel CONTACTLESS_MOBILE_WALLET;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel.Companion INSTANCE;
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel EXTERNAL_ECOMMERCE;
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel TRANSACTION_FUNDING_FLIP;
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel UNKNOWN;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel[] getHighSpeedVideoFpsRangesFor;

        private UsageChannel(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel usageChannel = new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel("CHECKOUT", 0);
            CHECKOUT = usageChannel;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel usageChannel2 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel(com.paypal.oslo.feature.bnplacquisition.domain.utilities.RequestUsageChannel.CONTACTLESS_MOBILE_WALLET, 1);
            CONTACTLESS_MOBILE_WALLET = usageChannel2;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel usageChannel3 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel("EXTERNAL_ECOMMERCE", 2);
            EXTERNAL_ECOMMERCE = usageChannel3;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel usageChannel4 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel("TRANSACTION_FUNDING_FLIP", 3);
            TRANSACTION_FUNDING_FLIP = usageChannel4;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel usageChannel5 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel("UNKNOWN", 4);
            UNKNOWN = usageChannel5;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel[] usageChannelArr = {usageChannel, usageChannel2, usageChannel3, usageChannel4, usageChannel5};
            getHighSpeedVideoFpsRangesFor = usageChannelArr;
            getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(usageChannelArr);
            INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel.Companion(null);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$UsageChannel$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$UsageChannel;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$UsageChannel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel from(java.lang.String value) {
                java.lang.Object obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
                java.util.Iterator<E> it = com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel) obj).name(), value)) {
                        break;
                    }
                }
                com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel usageChannel = (com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel) obj;
                return usageChannel == null ? com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel.UNKNOWN : usageChannel;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public static com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel[] values() {
            return (com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        public static com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel> getEntries() {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$AutopayRequirement;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "AUTOPAY_OPTIONAL", "AUTOPAY_REQUIRED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AutopayRequirement {
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement AUTOPAY_OPTIONAL;
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement AUTOPAY_REQUIRED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement.Companion INSTANCE;
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement UNKNOWN;
        private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement[] getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

        private AutopayRequirement(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement autopayRequirement = new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement("AUTOPAY_OPTIONAL", 0);
            AUTOPAY_OPTIONAL = autopayRequirement;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement autopayRequirement2 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement("AUTOPAY_REQUIRED", 1);
            AUTOPAY_REQUIRED = autopayRequirement2;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement autopayRequirement3 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement("UNKNOWN", 2);
            UNKNOWN = autopayRequirement3;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement[] autopayRequirementArr = {autopayRequirement, autopayRequirement2, autopayRequirement3};
            getHighResolutionOutputSizeshNQ4ISI = autopayRequirementArr;
            getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(autopayRequirementArr);
            INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement.Companion(null);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$AutopayRequirement$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$AutopayRequirement;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$AutopayRequirement;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement from(java.lang.String value) {
                java.lang.Object obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
                java.util.Iterator<E> it = com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement) obj).name(), value)) {
                        break;
                    }
                }
                com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement autopayRequirement = (com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement) obj;
                return autopayRequirement == null ? com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement.UNKNOWN : autopayRequirement;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public static com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement[] values() {
            return (com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        }

        public static com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement> getEntries() {
            return getHighSpeedVideoFpsRangesFor;
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat instrumentFormat = this.instrumentFormat;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel usageChannel = this.usageChannel;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement autopayRequirement = this.autopayRequirement;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VariantPolicy(instrumentFormat=");
        sb.append(instrumentFormat);
        sb.append(", usageChannel=");
        sb.append(usageChannel);
        sb.append(", autopayRequirement=");
        sb.append(autopayRequirement);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.instrumentFormat.hashCode() * 31) + this.usageChannel.hashCode()) * 31) + this.autopayRequirement.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy variantPolicy = (com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy) other;
        return this.instrumentFormat == variantPolicy.instrumentFormat && this.usageChannel == variantPolicy.usageChannel && this.autopayRequirement == variantPolicy.autopayRequirement;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy copy(com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat instrumentFormat, com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel usageChannel, com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement autopayRequirement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentFormat, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(usageChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayRequirement, "");
        return new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy(instrumentFormat, usageChannel, autopayRequirement);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement getAutopayRequirement() {
        return this.autopayRequirement;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel getUsageChannel() {
        return this.usageChannel;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat getInstrumentFormat() {
        return this.instrumentFormat;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy variantPolicy, com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat instrumentFormat, com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel usageChannel, com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement autopayRequirement, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            instrumentFormat = variantPolicy.instrumentFormat;
        }
        if ((i & 2) != 0) {
            usageChannel = variantPolicy.usageChannel;
        }
        if ((i & 4) != 0) {
            autopayRequirement = variantPolicy.autopayRequirement;
        }
        return variantPolicy.copy(instrumentFormat, usageChannel, autopayRequirement);
    }
}
