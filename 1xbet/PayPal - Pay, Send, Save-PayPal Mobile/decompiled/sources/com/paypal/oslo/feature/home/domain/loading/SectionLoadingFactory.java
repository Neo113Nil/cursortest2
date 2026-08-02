package com.paypal.oslo.feature.home.domain.loading;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \t2\u00020\u0001:\u0001\tJ#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/loading/SectionLoadingFactory;", "", "", "sectionId", "", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "Lcom/paypal/oslo/feature/home/domain/model/SectionLoading;", "createLoadingSections", "(Ljava/lang/String;)Ljava/util/List;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface SectionLoadingFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.home.domain.loading.SectionLoadingFactory.Companion INSTANCE = com.paypal.oslo.feature.home.domain.loading.SectionLoadingFactory.Companion.getHighSpeedVideoFpsRanges;
    public static final java.lang.String PLACEHOLDER_BUTTON = "-";
    public static final java.lang.String PLACEHOLDER_LABEL = " ";

    java.util.List<com.paypal.oslo.feature.home.domain.model.Section<com.paypal.oslo.feature.home.domain.model.SectionLoading>> createLoadingSections(java.lang.String sectionId);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/loading/SectionLoadingFactory$Companion;", "", "<init>", "()V", "", "PLACEHOLDER_LABEL", "Ljava/lang/String;", "PLACEHOLDER_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static final java.lang.String PLACEHOLDER_BUTTON = "-";
        public static final java.lang.String PLACEHOLDER_LABEL = " ";
        static final /* synthetic */ com.paypal.oslo.feature.home.domain.loading.SectionLoadingFactory.Companion getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.home.domain.loading.SectionLoadingFactory.Companion();

        private Companion() {
        }
    }
}
