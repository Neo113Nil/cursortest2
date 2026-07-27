package gatewayprotocol.v1;

import com.google.protobuf.Timestamp;
import gatewayprotocol.v1.AdDataRefreshRequestOuterClass;
import gatewayprotocol.v1.AdPlayerConfigRequestOuterClass;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import gatewayprotocol.v1.AudienceManagementRequestOuterClass;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;
import gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.LifecycleEventRequestOuterClass;
import gatewayprotocol.v1.MonitoringEventRequestOuterClass;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.PrivacyUpdateRequestOuterClass;
import gatewayprotocol.v1.RewardedOffersRequestOuterClass;
import gatewayprotocol.v1.TestDataOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UniversalRequestKt.kt */
@Metadata(d1 = {"\u0000è\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\b\u001a\u00020\t*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\b\u001a\u00020&*\u00020&2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\"\u0017\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u0019*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u001d*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u0017\u0010 \u001a\u0004\u0018\u00010\u001d*\u00020\r8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001f\"\u0017\u0010\"\u001a\u0004\u0018\u00010#*\u00020\r8F¢\u0006\u0006\u001a\u0004\b$\u0010%\"\u0017\u0010(\u001a\u0004\u0018\u00010)*\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,\"\u0017\u0010-\u001a\u0004\u0018\u00010.*\u00020*8F¢\u0006\u0006\u001a\u0004\b/\u00100\"\u0017\u00101\u001a\u0004\u0018\u000102*\u00020*8F¢\u0006\u0006\u001a\u0004\b3\u00104\"\u0017\u00105\u001a\u0004\u0018\u000106*\u00020*8F¢\u0006\u0006\u001a\u0004\b7\u00108\"\u0017\u00109\u001a\u0004\u0018\u00010:*\u00020*8F¢\u0006\u0006\u001a\u0004\b;\u0010<\"\u0017\u0010=\u001a\u0004\u0018\u00010>*\u00020*8F¢\u0006\u0006\u001a\u0004\b?\u0010@\"\u0017\u0010A\u001a\u0004\u0018\u00010B*\u00020*8F¢\u0006\u0006\u001a\u0004\bC\u0010D\"\u0017\u0010E\u001a\u0004\u0018\u00010F*\u00020*8F¢\u0006\u0006\u001a\u0004\bG\u0010H\"\u0017\u0010I\u001a\u0004\u0018\u00010J*\u00020*8F¢\u0006\u0006\u001a\u0004\bK\u0010L\"\u0017\u0010M\u001a\u0004\u0018\u00010N*\u00020*8F¢\u0006\u0006\u001a\u0004\bO\u0010P\"\u0017\u0010Q\u001a\u0004\u0018\u00010R*\u00020*8F¢\u0006\u0006\u001a\u0004\bS\u0010T\"\u0017\u0010U\u001a\u0004\u0018\u00010V*\u00020*8F¢\u0006\u0006\u001a\u0004\bW\u0010X\"\u0017\u0010Y\u001a\u0004\u0018\u00010Z*\u00020*8F¢\u0006\u0006\u001a\u0004\b[\u0010\\\"\u0017\u0010]\u001a\u0004\u0018\u00010^*\u00020*8F¢\u0006\u0006\u001a\u0004\b_\u0010`\"\u0017\u0010a\u001a\u0004\u0018\u00010b*\u00020*8F¢\u0006\u0006\u001a\u0004\bc\u0010d\"\u0017\u0010e\u001a\u0004\u0018\u00010\t*\u00020f8F¢\u0006\u0006\u001a\u0004\bg\u0010h\"\u0017\u0010i\u001a\u0004\u0018\u00010&*\u00020f8F¢\u0006\u0006\u001a\u0004\bj\u0010k\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006l"}, d2 = {"universalRequest", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/UniversalRequestKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeuniversalRequest", "copy", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;", "timestampsOrNull", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;", "getTimestampsOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "piiOrNull", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "getPiiOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgatewayprotocol/v1/PiiOuterClass$Pii;", "developerConsentOrNull", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "getDeveloperConsentOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "testDataOrNull", "Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "getTestDataOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "appStartTimeOrNull", "Lcom/google/protobuf/Timestamp;", "getAppStartTimeOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lcom/google/protobuf/Timestamp;", "sdkStartTimeOrNull", "getSdkStartTimeOrNull", "limitedSessionTokenOrNull", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "getLimitedSessionTokenOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "Lgatewayprotocol/v1/UniversalRequestKt$PayloadKt$Dsl;", "initializationRequestOrNull", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;", "getInitializationRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "adRequestOrNull", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "getAdRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "operativeEventOrNull", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "getOperativeEventOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "diagnosticEventRequestOrNull", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;", "getDiagnosticEventRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;", "adPlayerConfigRequestOrNull", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "getAdPlayerConfigRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "getTokenEventRequestOrNull", "Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "getGetTokenEventRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "privacyUpdateRequestOrNull", "Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "getPrivacyUpdateRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "adDataRefreshRequestOrNull", "Lgatewayprotocol/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;", "getAdDataRefreshRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;", "initializationCompletedEventRequestOrNull", "Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "getInitializationCompletedEventRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "transactionEventRequestOrNull", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "getTransactionEventRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "audienceManagementRequestOrNull", "Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest;", "getAudienceManagementRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest;", "adRevenueEventRequestOrNull", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;", "getAdRevenueEventRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;", "monitoringEventRequestOrNull", "Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEventRequest;", "getMonitoringEventRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEventRequest;", "lifecycleEventRequestOrNull", "Lgatewayprotocol/v1/LifecycleEventRequestOuterClass$LifecycleEventRequest;", "getLifecycleEventRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/LifecycleEventRequestOuterClass$LifecycleEventRequest;", "rewardedOffersRequestOrNull", "Lgatewayprotocol/v1/RewardedOffersRequestOuterClass$RewardedOffersRequest;", "getRewardedOffersRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/RewardedOffersRequestOuterClass$RewardedOffersRequest;", "sharedDataOrNull", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequestOrBuilder;", "getSharedDataOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequestOrBuilder;)Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "payloadOrNull", "getPayloadOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequestOrBuilder;)Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UniversalRequestKtKt {
    /* renamed from: -initializeuniversalRequest, reason: not valid java name */
    public static final UniversalRequestOuterClass.UniversalRequest m7861initializeuniversalRequest(Function1<? super UniversalRequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        UniversalRequestKt.Dsl.Companion companion = UniversalRequestKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Builder newBuilder = UniversalRequestOuterClass.UniversalRequest.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        UniversalRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final UniversalRequestOuterClass.UniversalRequest copy(UniversalRequestOuterClass.UniversalRequest universalRequest, Function1<? super UniversalRequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(universalRequest, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        UniversalRequestKt.Dsl.Companion companion = UniversalRequestKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Builder builder = universalRequest.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        UniversalRequestKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final UniversalRequestOuterClass.UniversalRequest.SharedData copy(UniversalRequestOuterClass.UniversalRequest.SharedData sharedData, Function1<? super UniversalRequestKt.SharedDataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(sharedData, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        UniversalRequestKt.SharedDataKt.Dsl.Companion companion = UniversalRequestKt.SharedDataKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder = sharedData.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        UniversalRequestKt.SharedDataKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final TimestampsOuterClass.Timestamps getTimestampsOrNull(UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        Intrinsics.checkNotNullParameter(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasTimestamps()) {
            return sharedDataOrBuilder.getTimestamps();
        }
        return null;
    }

    public static final PiiOuterClass.Pii getPiiOrNull(UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        Intrinsics.checkNotNullParameter(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasPii()) {
            return sharedDataOrBuilder.getPii();
        }
        return null;
    }

    public static final DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsentOrNull(UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        Intrinsics.checkNotNullParameter(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasDeveloperConsent()) {
            return sharedDataOrBuilder.getDeveloperConsent();
        }
        return null;
    }

    public static final TestDataOuterClass.TestData getTestDataOrNull(UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        Intrinsics.checkNotNullParameter(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasTestData()) {
            return sharedDataOrBuilder.getTestData();
        }
        return null;
    }

    public static final Timestamp getAppStartTimeOrNull(UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        Intrinsics.checkNotNullParameter(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasAppStartTime()) {
            return sharedDataOrBuilder.getAppStartTime();
        }
        return null;
    }

    public static final Timestamp getSdkStartTimeOrNull(UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        Intrinsics.checkNotNullParameter(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasSdkStartTime()) {
            return sharedDataOrBuilder.getSdkStartTime();
        }
        return null;
    }

    public static final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        Intrinsics.checkNotNullParameter(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasLimitedSessionToken()) {
            return sharedDataOrBuilder.getLimitedSessionToken();
        }
        return null;
    }

    public static final UniversalRequestOuterClass.UniversalRequest.Payload copy(UniversalRequestOuterClass.UniversalRequest.Payload payload, Function1<? super UniversalRequestKt.PayloadKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(payload, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder = payload.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        UniversalRequestKt.PayloadKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final InitializationRequestOuterClass.InitializationRequest getInitializationRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasInitializationRequest()) {
            return payloadOrBuilder.getInitializationRequest();
        }
        return null;
    }

    public static final AdRequestOuterClass.AdRequest getAdRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdRequest()) {
            return payloadOrBuilder.getAdRequest();
        }
        return null;
    }

    public static final OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEventOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasOperativeEvent()) {
            return payloadOrBuilder.getOperativeEvent();
        }
        return null;
    }

    public static final DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasDiagnosticEventRequest()) {
            return payloadOrBuilder.getDiagnosticEventRequest();
        }
        return null;
    }

    public static final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdPlayerConfigRequest()) {
            return payloadOrBuilder.getAdPlayerConfigRequest();
        }
        return null;
    }

    public static final GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasGetTokenEventRequest()) {
            return payloadOrBuilder.getGetTokenEventRequest();
        }
        return null;
    }

    public static final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasPrivacyUpdateRequest()) {
            return payloadOrBuilder.getPrivacyUpdateRequest();
        }
        return null;
    }

    public static final AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdDataRefreshRequest()) {
            return payloadOrBuilder.getAdDataRefreshRequest();
        }
        return null;
    }

    public static final InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasInitializationCompletedEventRequest()) {
            return payloadOrBuilder.getInitializationCompletedEventRequest();
        }
        return null;
    }

    public static final TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasTransactionEventRequest()) {
            return payloadOrBuilder.getTransactionEventRequest();
        }
        return null;
    }

    public static final AudienceManagementRequestOuterClass.AudienceManagementRequest getAudienceManagementRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAudienceManagementRequest()) {
            return payloadOrBuilder.getAudienceManagementRequest();
        }
        return null;
    }

    public static final AdRevenueEventRequestOuterClass.AdRevenueEventRequest getAdRevenueEventRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdRevenueEventRequest()) {
            return payloadOrBuilder.getAdRevenueEventRequest();
        }
        return null;
    }

    public static final MonitoringEventRequestOuterClass.MonitoringEventRequest getMonitoringEventRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasMonitoringEventRequest()) {
            return payloadOrBuilder.getMonitoringEventRequest();
        }
        return null;
    }

    public static final LifecycleEventRequestOuterClass.LifecycleEventRequest getLifecycleEventRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasLifecycleEventRequest()) {
            return payloadOrBuilder.getLifecycleEventRequest();
        }
        return null;
    }

    public static final RewardedOffersRequestOuterClass.RewardedOffersRequest getRewardedOffersRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasRewardedOffersRequest()) {
            return payloadOrBuilder.getRewardedOffersRequest();
        }
        return null;
    }

    public static final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedDataOrNull(UniversalRequestOuterClass.UniversalRequestOrBuilder universalRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(universalRequestOrBuilder, "<this>");
        if (universalRequestOrBuilder.hasSharedData()) {
            return universalRequestOrBuilder.getSharedData();
        }
        return null;
    }

    public static final UniversalRequestOuterClass.UniversalRequest.Payload getPayloadOrNull(UniversalRequestOuterClass.UniversalRequestOrBuilder universalRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(universalRequestOrBuilder, "<this>");
        if (universalRequestOrBuilder.hasPayload()) {
            return universalRequestOrBuilder.getPayload();
        }
        return null;
    }
}
