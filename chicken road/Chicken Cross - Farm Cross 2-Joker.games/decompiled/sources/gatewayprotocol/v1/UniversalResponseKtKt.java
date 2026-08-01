package gatewayprotocol.v1;

import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.AudienceManagementResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import gatewayprotocol.v1.RewardedOffersResponseOuterClass;
import gatewayprotocol.v1.UniversalResponseKt;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UniversalResponseKt.kt */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\b\u001a\u00020\t*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\"\u0017\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u0019*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u001d*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u0017\u0010 \u001a\u0004\u0018\u00010!*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u0017\u0010$\u001a\u0004\u0018\u00010%*\u00020\r8F¢\u0006\u0006\u001a\u0004\b&\u0010'\"\u0017\u0010(\u001a\u0004\u0018\u00010\t*\u00020)8F¢\u0006\u0006\u001a\u0004\b*\u0010+\"\u0017\u0010,\u001a\u0004\u0018\u00010-*\u00020)8F¢\u0006\u0006\u001a\u0004\b.\u0010/\"\u0017\u00100\u001a\u0004\u0018\u000101*\u00020)8F¢\u0006\u0006\u001a\u0004\b2\u00103\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00064"}, d2 = {"universalResponse", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/UniversalResponseKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeuniversalResponse", "copy", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "Lgatewayprotocol/v1/UniversalResponseKt$PayloadKt$Dsl;", "initializationResponseOrNull", "Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;", "getInitializationResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;", "adResponseOrNull", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "getAdResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "adPlayerConfigResponseOrNull", "Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "getAdPlayerConfigResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "adDataRefreshResponseOrNull", "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "getAdDataRefreshResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "privacyUpdateResponseOrNull", "Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;", "getPrivacyUpdateResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;", "audienceManagementResponseOrNull", "Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse;", "getAudienceManagementResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse;", "rewardedOffersResponseOrNull", "Lgatewayprotocol/v1/RewardedOffersResponseOuterClass$RewardedOffersResponse;", "getRewardedOffersResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/RewardedOffersResponseOuterClass$RewardedOffersResponse;", "payloadOrNull", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponseOrBuilder;", "getPayloadOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponseOrBuilder;)Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "mutableDataOrNull", "Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "getMutableDataOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponseOrBuilder;)Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "errorOrNull", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "getErrorOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponseOrBuilder;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UniversalResponseKtKt {
    /* renamed from: -initializeuniversalResponse, reason: not valid java name */
    public static final UniversalResponseOuterClass.UniversalResponse m7863initializeuniversalResponse(Function1<? super UniversalResponseKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        UniversalResponseKt.Dsl.Companion companion = UniversalResponseKt.Dsl.INSTANCE;
        UniversalResponseOuterClass.UniversalResponse.Builder newBuilder = UniversalResponseOuterClass.UniversalResponse.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        UniversalResponseKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final UniversalResponseOuterClass.UniversalResponse copy(UniversalResponseOuterClass.UniversalResponse universalResponse, Function1<? super UniversalResponseKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(universalResponse, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        UniversalResponseKt.Dsl.Companion companion = UniversalResponseKt.Dsl.INSTANCE;
        UniversalResponseOuterClass.UniversalResponse.Builder builder = universalResponse.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        UniversalResponseKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final UniversalResponseOuterClass.UniversalResponse.Payload copy(UniversalResponseOuterClass.UniversalResponse.Payload payload, Function1<? super UniversalResponseKt.PayloadKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(payload, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        UniversalResponseKt.PayloadKt.Dsl.Companion companion = UniversalResponseKt.PayloadKt.Dsl.INSTANCE;
        UniversalResponseOuterClass.UniversalResponse.Payload.Builder builder = payload.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        UniversalResponseKt.PayloadKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final InitializationResponseOuterClass.InitializationResponse getInitializationResponseOrNull(UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasInitializationResponse()) {
            return payloadOrBuilder.getInitializationResponse();
        }
        return null;
    }

    public static final AdResponseOuterClass.AdResponse getAdResponseOrNull(UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdResponse()) {
            return payloadOrBuilder.getAdResponse();
        }
        return null;
    }

    public static final AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponseOrNull(UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdPlayerConfigResponse()) {
            return payloadOrBuilder.getAdPlayerConfigResponse();
        }
        return null;
    }

    public static final AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponseOrNull(UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdDataRefreshResponse()) {
            return payloadOrBuilder.getAdDataRefreshResponse();
        }
        return null;
    }

    public static final PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponseOrNull(UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasPrivacyUpdateResponse()) {
            return payloadOrBuilder.getPrivacyUpdateResponse();
        }
        return null;
    }

    public static final AudienceManagementResponseOuterClass.AudienceManagementResponse getAudienceManagementResponseOrNull(UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAudienceManagementResponse()) {
            return payloadOrBuilder.getAudienceManagementResponse();
        }
        return null;
    }

    public static final RewardedOffersResponseOuterClass.RewardedOffersResponse getRewardedOffersResponseOrNull(UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasRewardedOffersResponse()) {
            return payloadOrBuilder.getRewardedOffersResponse();
        }
        return null;
    }

    public static final UniversalResponseOuterClass.UniversalResponse.Payload getPayloadOrNull(UniversalResponseOuterClass.UniversalResponseOrBuilder universalResponseOrBuilder) {
        Intrinsics.checkNotNullParameter(universalResponseOrBuilder, "<this>");
        if (universalResponseOrBuilder.hasPayload()) {
            return universalResponseOrBuilder.getPayload();
        }
        return null;
    }

    public static final MutableDataOuterClass.MutableData getMutableDataOrNull(UniversalResponseOuterClass.UniversalResponseOrBuilder universalResponseOrBuilder) {
        Intrinsics.checkNotNullParameter(universalResponseOrBuilder, "<this>");
        if (universalResponseOrBuilder.hasMutableData()) {
            return universalResponseOrBuilder.getMutableData();
        }
        return null;
    }

    public static final ErrorOuterClass.Error getErrorOrNull(UniversalResponseOuterClass.UniversalResponseOrBuilder universalResponseOrBuilder) {
        Intrinsics.checkNotNullParameter(universalResponseOrBuilder, "<this>");
        if (universalResponseOrBuilder.hasError()) {
            return universalResponseOrBuilder.getError();
        }
        return null;
    }
}
