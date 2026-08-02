package com.paypal.oslo.feature.bnplservicing.domain.model.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Channel;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", com.paypal.oslo.feature.bnplacquisition.domain.utilities.NetworkConstants.MOBILE_APP, "MOBILE_WEB", "WEB", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Channel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel MOBILE_APP;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel MOBILE_WEB;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel UNKNOWN;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel WEB;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private Channel(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel channel = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel(com.paypal.oslo.feature.bnplacquisition.domain.utilities.NetworkConstants.MOBILE_APP, 0);
        MOBILE_APP = channel;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel channel2 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel("MOBILE_WEB", 1);
        MOBILE_WEB = channel2;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel channel3 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel("WEB", 2);
        WEB = channel3;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel channel4 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel("UNKNOWN", 3);
        UNKNOWN = channel4;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel[] channelArr = {channel, channel2, channel3, channel4};
        getHighResolutionOutputSizeshNQ4ISI = channelArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(channelArr);
        INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Channel$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Channel;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Channel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel channel = (com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel) obj;
            return channel == null ? com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel.UNKNOWN : channel;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
