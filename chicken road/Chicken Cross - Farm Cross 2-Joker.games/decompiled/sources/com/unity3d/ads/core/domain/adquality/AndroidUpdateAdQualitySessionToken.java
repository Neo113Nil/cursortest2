package com.unity3d.ads.core.domain.adquality;

import com.google.protobuf.ByteString;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidUpdateAdQualitySessionToken.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/adquality/AndroidUpdateAdQualitySessionToken;", "Lcom/unity3d/ads/core/domain/adquality/UpdateAdQualitySessionToken;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "adQualityVersionDataSource", "Lcom/unity3d/ads/core/data/datasource/AdQualityVersionDataSource;", "<init>", "(Lcom/unity3d/ads/core/log/Logger;Lcom/unity3d/ads/core/data/datasource/AdQualityVersionDataSource;)V", "invoke", "", "sessionToken", "Lcom/google/protobuf/ByteString;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidUpdateAdQualitySessionToken implements UpdateAdQualitySessionToken {
    private final AdQualityVersionDataSource adQualityVersionDataSource;
    private final Logger logger;

    public AndroidUpdateAdQualitySessionToken(Logger logger, AdQualityVersionDataSource adQualityVersionDataSource) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(adQualityVersionDataSource, "adQualityVersionDataSource");
        this.logger = logger;
        this.adQualityVersionDataSource = adQualityVersionDataSource;
    }

    @Override // com.unity3d.ads.core.domain.adquality.UpdateAdQualitySessionToken
    public void invoke(ByteString sessionToken) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        final String invoke = this.adQualityVersionDataSource.invoke();
        if (invoke == null) {
            return;
        }
        if (StringExtensionsKt.compareVersion(invoke, "9.5.1") < 0) {
            this.logger.debug(new Function0() { // from class: com.unity3d.ads.core.domain.adquality.AndroidUpdateAdQualitySessionToken$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String invoke$lambda$0;
                    invoke$lambda$0 = AndroidUpdateAdQualitySessionToken.invoke$lambda$0(invoke);
                    return invoke$lambda$0;
                }
            });
            return;
        }
        try {
            IronSourceAdQuality.getInstance().setMetaData(AdQualityConstants.SESSION_TOKEN_METADATA_KEY, ProtobufExtensionsKt.toBase64$default(sessionToken, false, 1, null));
        } catch (Throwable th) {
            this.logger.error("Ad Quality SDK setMetaData failed", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invoke$lambda$0(String str) {
        return "Ad Quality SDK version " + str + " is below minimum 9.5.1, skipping session token update";
    }
}
