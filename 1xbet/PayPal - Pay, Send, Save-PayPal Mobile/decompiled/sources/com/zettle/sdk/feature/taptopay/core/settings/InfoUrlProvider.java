package com.zettle.sdk.feature.taptopay.core.settings;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00028'X¦\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000e\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/settings/InfoUrlProvider;", "", "", "getGeneralTermsUrlRes", "()I", "generalTermsUrlRes", "getPaymentsTermsUrlRes", "paymentsTermsUrlRes", "getPrivacyTermsUrlRes", "privacyTermsUrlRes", "", "getReadMoreUrl", "()Ljava/lang/String;", "readMoreUrl", "getReadMoreUrlRes", "getReadMoreUrlRes$annotations", "()V", "readMoreUrlRes", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface InfoUrlProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.settings.InfoUrlProvider.Companion INSTANCE = com.zettle.sdk.feature.taptopay.core.settings.InfoUrlProvider.Companion.getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getReadMoreUrlRes$annotations() {
        }
    }

    int getGeneralTermsUrlRes();

    int getPaymentsTermsUrlRes();

    int getPrivacyTermsUrlRes();

    java.lang.String getReadMoreUrl();

    int getReadMoreUrlRes();

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/settings/InfoUrlProvider$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.feature.taptopay.core.settings.InfoUrlProvider.Companion getHighSpeedVideoSizes = new com.zettle.sdk.feature.taptopay.core.settings.InfoUrlProvider.Companion();

        private Companion() {
        }
    }
}
