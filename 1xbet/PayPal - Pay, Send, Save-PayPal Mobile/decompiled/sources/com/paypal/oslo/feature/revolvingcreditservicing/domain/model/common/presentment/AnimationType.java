package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/presentment/AnimationType;", "", "<init>", "(Ljava/lang/String;I)V", "CONFETTI", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnimationType {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.AnimationType CONFETTI;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.AnimationType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.AnimationType UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private AnimationType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.AnimationType animationType = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.AnimationType("CONFETTI", 0);
        CONFETTI = animationType;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.AnimationType animationType2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.AnimationType("UNKNOWN", 1);
        UNKNOWN = animationType2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.AnimationType[] animationTypeArr = {animationType, animationType2};
        Camera2StreamConfigurationMap = animationTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(animationTypeArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.AnimationType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.AnimationType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.AnimationType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.AnimationType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.AnimationType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.presentment.AnimationType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
