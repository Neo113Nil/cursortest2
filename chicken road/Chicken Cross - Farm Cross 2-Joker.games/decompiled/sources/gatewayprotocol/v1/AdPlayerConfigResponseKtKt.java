package gatewayprotocol.v1;

import gatewayprotocol.v1.AdPlayerConfigResponseKt;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.WebviewConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdPlayerConfigResponseKt.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"adPlayerConfigResponse", "Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/AdPlayerConfigResponseKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeadPlayerConfigResponse", "copy", "webviewConfigurationOrNull", "Lgatewayprotocol/v1/WebviewConfiguration$WebViewConfiguration;", "Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder;", "getWebviewConfigurationOrNull", "(Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder;)Lgatewayprotocol/v1/WebviewConfiguration$WebViewConfiguration;", "errorOrNull", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "getErrorOrNull", "(Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "campaignMetadataOrNull", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "getCampaignMetadataOrNull", "(Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder;)Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdPlayerConfigResponseKtKt {
    /* renamed from: -initializeadPlayerConfigResponse, reason: not valid java name */
    public static final AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse m7791initializeadPlayerConfigResponse(Function1<? super AdPlayerConfigResponseKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        AdPlayerConfigResponseKt.Dsl.Companion companion = AdPlayerConfigResponseKt.Dsl.INSTANCE;
        AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder newBuilder = AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        AdPlayerConfigResponseKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse copy(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse, Function1<? super AdPlayerConfigResponseKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(adPlayerConfigResponse, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        AdPlayerConfigResponseKt.Dsl.Companion companion = AdPlayerConfigResponseKt.Dsl.INSTANCE;
        AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder builder = adPlayerConfigResponse.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        AdPlayerConfigResponseKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final WebviewConfiguration.WebViewConfiguration getWebviewConfigurationOrNull(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder adPlayerConfigResponseOrBuilder) {
        Intrinsics.checkNotNullParameter(adPlayerConfigResponseOrBuilder, "<this>");
        if (adPlayerConfigResponseOrBuilder.hasWebviewConfiguration()) {
            return adPlayerConfigResponseOrBuilder.getWebviewConfiguration();
        }
        return null;
    }

    public static final ErrorOuterClass.Error getErrorOrNull(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder adPlayerConfigResponseOrBuilder) {
        Intrinsics.checkNotNullParameter(adPlayerConfigResponseOrBuilder, "<this>");
        if (adPlayerConfigResponseOrBuilder.hasError()) {
            return adPlayerConfigResponseOrBuilder.getError();
        }
        return null;
    }

    public static final CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadataOrNull(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder adPlayerConfigResponseOrBuilder) {
        Intrinsics.checkNotNullParameter(adPlayerConfigResponseOrBuilder, "<this>");
        if (adPlayerConfigResponseOrBuilder.hasCampaignMetadata()) {
            return adPlayerConfigResponseOrBuilder.getCampaignMetadata();
        }
        return null;
    }
}
