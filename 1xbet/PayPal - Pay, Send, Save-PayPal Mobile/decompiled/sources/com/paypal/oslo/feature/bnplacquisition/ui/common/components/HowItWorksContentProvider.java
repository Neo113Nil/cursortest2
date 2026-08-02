package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/HowItWorksContentProvider;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "configContext", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "", "imageUrl", "()Ljava/lang/String;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/SupportedCpisConfig$CpiType;", "availableCpiTypes", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "footer", "(Ljava/util/List;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/HowItWorksContent;", "content", "(Ljava/util/List;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/HowItWorksContent;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HowItWorksContentProvider {
    public static final java.lang.String HOW_IT_WORKS_IMAGE_URL_DE = "https://www.paypalobjects.com/webstatic/GPL/DE/PayMonthly/productOverview/howToPayMonthlyInstoreHalfSheet.png";
    public static final java.lang.String HOW_IT_WORKS_IMAGE_URL_US = "https://www.paypalobjects.com/webstatic/GPL/US/PayMonthly/productOverview/howToPayMonthlyInstore.png";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;

    @javax.inject.Inject
    public HowItWorksContentProvider(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
        this.getHighSpeedVideoFpsRangesFor = configContext;
    }

    public final java.lang.String imageUrl() {
        if (com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContentProvider.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoFpsRangesFor.getCountry().ordinal()] == 1) {
            return HOW_IT_WORKS_IMAGE_URL_DE;
        }
        return HOW_IT_WORKS_IMAGE_URL_US;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText footer(java.util.List<? extends com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType> availableCpiTypes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableCpiTypes, "");
        if (availableCpiTypes.contains(com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType.SHORT_TERM)) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_how_it_works_footer_multi_product, new java.lang.Object[0]);
        }
        if (availableCpiTypes.contains(com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType.LONG_TERM)) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_how_it_works_footer_long_term, new java.lang.Object[0]);
        }
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContent content$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContentProvider howItWorksContentProvider, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        return howItWorksContentProvider.content(list);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContent content(java.util.List<? extends com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType> availableCpiTypes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableCpiTypes, "");
        if (com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContentProvider.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoFpsRangesFor.getCountry().ordinal()] == 1) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_how_it_works_title, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_how_it_works_step_1, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_how_it_works_step_2, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_how_it_works_step_3, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_how_it_works_image_content_description, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_close, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(""), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(""), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_got_it, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(""), imageUrl(), null, null, null, com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon.Card, com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon.Mobile, com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon.Contactless, 14336, null);
        }
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_how_it_works_title, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_how_it_works_step_1, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_how_it_works_step_2, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_how_it_works_step_3, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_how_it_works_image_content_description, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_close, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_pay_monthly, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_pay_in_4, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_got_it, new java.lang.Object[0]), footer(availableCpiTypes), imageUrl(), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_1, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_2, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_3, new java.lang.Object[0]), null, null, null, 114688, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.config.Country.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.config.Country.DE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
