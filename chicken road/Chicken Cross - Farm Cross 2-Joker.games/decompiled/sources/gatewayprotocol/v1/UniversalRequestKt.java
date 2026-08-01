package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
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
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UniversalRequestKt.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u000bJ*\u0010\f\u001a\u00020\r2\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt;", "", "<init>", "()V", "sharedData", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializesharedData", "payload", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "Lgatewayprotocol/v1/UniversalRequestKt$PayloadKt$Dsl;", "-initializepayload", "Dsl", "SharedDataKt", "PayloadKt", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UniversalRequestKt {
    public static final UniversalRequestKt INSTANCE = new UniversalRequestKt();

    private UniversalRequestKt() {
    }

    /* compiled from: UniversalRequestKt.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Builder;", "<init>", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Builder;)V", "_build", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "value", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "sharedData", "getSharedData", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "setSharedData", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;)V", "clearSharedData", "", "hasSharedData", "", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "payload", "getPayload", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "setPayload", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;)V", "clearPayload", "hasPayload", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final UniversalRequestOuterClass.UniversalRequest.Builder _builder;

        public /* synthetic */ Dsl(UniversalRequestOuterClass.UniversalRequest.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(UniversalRequestOuterClass.UniversalRequest.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: UniversalRequestKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/UniversalRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.UniversalRequest.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest _build() {
            UniversalRequestOuterClass.UniversalRequest build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
            UniversalRequestOuterClass.UniversalRequest.SharedData sharedData = this._builder.getSharedData();
            Intrinsics.checkNotNullExpressionValue(sharedData, "getSharedData(...)");
            return sharedData;
        }

        public final void setSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSharedData(value);
        }

        public final void clearSharedData() {
            this._builder.clearSharedData();
        }

        public final boolean hasSharedData() {
            return this._builder.hasSharedData();
        }

        public final UniversalRequestOuterClass.UniversalRequest.Payload getPayload() {
            UniversalRequestOuterClass.UniversalRequest.Payload payload = this._builder.getPayload();
            Intrinsics.checkNotNullExpressionValue(payload, "getPayload(...)");
            return payload;
        }

        public final void setPayload(UniversalRequestOuterClass.UniversalRequest.Payload value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPayload(value);
        }

        public final void clearPayload() {
            this._builder.clearPayload();
        }

        public final boolean hasPayload() {
            return this._builder.hasPayload();
        }
    }

    /* renamed from: -initializesharedData, reason: not valid java name */
    public final UniversalRequestOuterClass.UniversalRequest.SharedData m7860initializesharedData(Function1<? super SharedDataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        SharedDataKt.Dsl.Companion companion = SharedDataKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.SharedData.Builder newBuilder = UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        SharedDataKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    /* compiled from: UniversalRequestKt.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SharedDataKt {
        public static final SharedDataKt INSTANCE = new SharedDataKt();

        private SharedDataKt() {
        }

        /* compiled from: UniversalRequestKt.kt */
        @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 a2\u00020\u0001:\u0001aB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010!\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0012J\u0006\u0010,\u001a\u00020\u0010J\u0006\u0010-\u001a\u00020\u0012J\u0006\u00107\u001a\u00020\u0010J\u0006\u00108\u001a\u00020\u0012J\u0006\u0010<\u001a\u00020\u0010J\u0006\u0010=\u001a\u00020\u0012J\u0006\u0010D\u001a\u00020\u0010J\u0006\u0010E\u001a\u00020\u0012J\u0006\u0010O\u001a\u00020\u0010J\u0006\u0010P\u001a\u00020\u0012J\u0006\u0010T\u001a\u00020\u0010J\u0006\u0010U\u001a\u00020\u0012J\u0006\u0010\\\u001a\u00020\u0010J\u0006\u0010]\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010#\u001a\u0004\u0018\u00010\u001b*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b$\u0010%R$\u0010'\u001a\u00020&2\u0006\u0010\b\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0017\u0010.\u001a\u0004\u0018\u00010&*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b/\u00100R$\u00102\u001a\u0002012\u0006\u0010\b\u001a\u0002018G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00109\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010\f\"\u0004\b;\u0010\u000eR$\u0010?\u001a\u00020>2\u0006\u0010\b\u001a\u00020>8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0017\u0010F\u001a\u0004\u0018\u00010>*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bG\u0010HR$\u0010J\u001a\u00020I2\u0006\u0010\b\u001a\u00020I8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010Q\u001a\u00020I2\u0006\u0010\b\u001a\u00020I8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010L\"\u0004\bS\u0010NR$\u0010W\u001a\u00020V2\u0006\u0010\b\u001a\u00020V8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0017\u0010^\u001a\u0004\u0018\u00010V*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b_\u0010`¨\u0006b"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData$Builder;", "<init>", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData$Builder;)V", "_build", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "value", "Lcom/google/protobuf/ByteString;", "sessionToken", "getSessionToken", "()Lcom/google/protobuf/ByteString;", "setSessionToken", "(Lcom/google/protobuf/ByteString;)V", "clearSessionToken", "", "hasSessionToken", "", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "timestamps", "getTimestamps", "()Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "setTimestamps", "(Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;)V", "clearTimestamps", "hasTimestamps", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "pii", "getPii", "()Lgatewayprotocol/v1/PiiOuterClass$Pii;", "setPii", "(Lgatewayprotocol/v1/PiiOuterClass$Pii;)V", "clearPii", "hasPii", "piiOrNull", "getPiiOrNull", "(Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;)Lgatewayprotocol/v1/PiiOuterClass$Pii;", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "developerConsent", "getDeveloperConsent", "()Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "setDeveloperConsent", "(Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;)V", "clearDeveloperConsent", "hasDeveloperConsent", "developerConsentOrNull", "getDeveloperConsentOrNull", "(Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;)Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "", "webviewVersion", "getWebviewVersion", "()I", "setWebviewVersion", "(I)V", "clearWebviewVersion", "hasWebviewVersion", "currentState", "getCurrentState", "setCurrentState", "clearCurrentState", "hasCurrentState", "Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "testData", "getTestData", "()Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "setTestData", "(Lgatewayprotocol/v1/TestDataOuterClass$TestData;)V", "clearTestData", "hasTestData", "testDataOrNull", "getTestDataOrNull", "(Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;)Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "Lcom/google/protobuf/Timestamp;", "appStartTime", "getAppStartTime", "()Lcom/google/protobuf/Timestamp;", "setAppStartTime", "(Lcom/google/protobuf/Timestamp;)V", "clearAppStartTime", "hasAppStartTime", "sdkStartTime", "getSdkStartTime", "setSdkStartTime", "clearSdkStartTime", "hasSdkStartTime", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "limitedSessionToken", "getLimitedSessionToken", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "setLimitedSessionToken", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;)V", "clearLimitedSessionToken", "hasLimitedSessionToken", "limitedSessionTokenOrNull", "getLimitedSessionTokenOrNull", "(Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;)Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final UniversalRequestOuterClass.UniversalRequest.SharedData.Builder _builder;

            public /* synthetic */ Dsl(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder) {
                this._builder = builder;
            }

            /* compiled from: UniversalRequestKt.kt */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;", "builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest.SharedData _build() {
                UniversalRequestOuterClass.UniversalRequest.SharedData build = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                return build;
            }

            public final ByteString getSessionToken() {
                ByteString sessionToken = this._builder.getSessionToken();
                Intrinsics.checkNotNullExpressionValue(sessionToken, "getSessionToken(...)");
                return sessionToken;
            }

            public final void setSessionToken(ByteString value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setSessionToken(value);
            }

            public final void clearSessionToken() {
                this._builder.clearSessionToken();
            }

            public final boolean hasSessionToken() {
                return this._builder.hasSessionToken();
            }

            public final TimestampsOuterClass.Timestamps getTimestamps() {
                TimestampsOuterClass.Timestamps timestamps = this._builder.getTimestamps();
                Intrinsics.checkNotNullExpressionValue(timestamps, "getTimestamps(...)");
                return timestamps;
            }

            public final void setTimestamps(TimestampsOuterClass.Timestamps value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setTimestamps(value);
            }

            public final void clearTimestamps() {
                this._builder.clearTimestamps();
            }

            public final boolean hasTimestamps() {
                return this._builder.hasTimestamps();
            }

            public final PiiOuterClass.Pii getPii() {
                PiiOuterClass.Pii pii = this._builder.getPii();
                Intrinsics.checkNotNullExpressionValue(pii, "getPii(...)");
                return pii;
            }

            public final void setPii(PiiOuterClass.Pii value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setPii(value);
            }

            public final void clearPii() {
                this._builder.clearPii();
            }

            public final boolean hasPii() {
                return this._builder.hasPii();
            }

            public final PiiOuterClass.Pii getPiiOrNull(Dsl dsl) {
                Intrinsics.checkNotNullParameter(dsl, "<this>");
                return UniversalRequestKtKt.getPiiOrNull(dsl._builder);
            }

            public final DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
                DeveloperConsentOuterClass.DeveloperConsent developerConsent = this._builder.getDeveloperConsent();
                Intrinsics.checkNotNullExpressionValue(developerConsent, "getDeveloperConsent(...)");
                return developerConsent;
            }

            public final void setDeveloperConsent(DeveloperConsentOuterClass.DeveloperConsent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setDeveloperConsent(value);
            }

            public final void clearDeveloperConsent() {
                this._builder.clearDeveloperConsent();
            }

            public final boolean hasDeveloperConsent() {
                return this._builder.hasDeveloperConsent();
            }

            public final DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsentOrNull(Dsl dsl) {
                Intrinsics.checkNotNullParameter(dsl, "<this>");
                return UniversalRequestKtKt.getDeveloperConsentOrNull(dsl._builder);
            }

            public final int getWebviewVersion() {
                return this._builder.getWebviewVersion();
            }

            public final void setWebviewVersion(int i) {
                this._builder.setWebviewVersion(i);
            }

            public final void clearWebviewVersion() {
                this._builder.clearWebviewVersion();
            }

            public final boolean hasWebviewVersion() {
                return this._builder.hasWebviewVersion();
            }

            public final ByteString getCurrentState() {
                ByteString currentState = this._builder.getCurrentState();
                Intrinsics.checkNotNullExpressionValue(currentState, "getCurrentState(...)");
                return currentState;
            }

            public final void setCurrentState(ByteString value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setCurrentState(value);
            }

            public final void clearCurrentState() {
                this._builder.clearCurrentState();
            }

            public final boolean hasCurrentState() {
                return this._builder.hasCurrentState();
            }

            public final TestDataOuterClass.TestData getTestData() {
                TestDataOuterClass.TestData testData = this._builder.getTestData();
                Intrinsics.checkNotNullExpressionValue(testData, "getTestData(...)");
                return testData;
            }

            public final void setTestData(TestDataOuterClass.TestData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setTestData(value);
            }

            public final void clearTestData() {
                this._builder.clearTestData();
            }

            public final boolean hasTestData() {
                return this._builder.hasTestData();
            }

            public final TestDataOuterClass.TestData getTestDataOrNull(Dsl dsl) {
                Intrinsics.checkNotNullParameter(dsl, "<this>");
                return UniversalRequestKtKt.getTestDataOrNull(dsl._builder);
            }

            public final Timestamp getAppStartTime() {
                Timestamp appStartTime = this._builder.getAppStartTime();
                Intrinsics.checkNotNullExpressionValue(appStartTime, "getAppStartTime(...)");
                return appStartTime;
            }

            public final void setAppStartTime(Timestamp value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAppStartTime(value);
            }

            public final void clearAppStartTime() {
                this._builder.clearAppStartTime();
            }

            public final boolean hasAppStartTime() {
                return this._builder.hasAppStartTime();
            }

            public final Timestamp getSdkStartTime() {
                Timestamp sdkStartTime = this._builder.getSdkStartTime();
                Intrinsics.checkNotNullExpressionValue(sdkStartTime, "getSdkStartTime(...)");
                return sdkStartTime;
            }

            public final void setSdkStartTime(Timestamp value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setSdkStartTime(value);
            }

            public final void clearSdkStartTime() {
                this._builder.clearSdkStartTime();
            }

            public final boolean hasSdkStartTime() {
                return this._builder.hasSdkStartTime();
            }

            public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
                UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken = this._builder.getLimitedSessionToken();
                Intrinsics.checkNotNullExpressionValue(limitedSessionToken, "getLimitedSessionToken(...)");
                return limitedSessionToken;
            }

            public final void setLimitedSessionToken(UniversalRequestOuterClass.LimitedSessionToken value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setLimitedSessionToken(value);
            }

            public final void clearLimitedSessionToken() {
                this._builder.clearLimitedSessionToken();
            }

            public final boolean hasLimitedSessionToken() {
                return this._builder.hasLimitedSessionToken();
            }

            public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(Dsl dsl) {
                Intrinsics.checkNotNullParameter(dsl, "<this>");
                return UniversalRequestKtKt.getLimitedSessionTokenOrNull(dsl._builder);
            }
        }
    }

    /* renamed from: -initializepayload, reason: not valid java name */
    public final UniversalRequestOuterClass.UniversalRequest.Payload m7859initializepayload(Function1<? super PayloadKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        PayloadKt.Dsl.Companion companion = PayloadKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        PayloadKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    /* compiled from: UniversalRequestKt.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt$PayloadKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PayloadKt {
        public static final PayloadKt INSTANCE = new PayloadKt();

        private PayloadKt() {
        }

        /* compiled from: UniversalRequestKt.kt */
        @Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0088\u00012\u00020\u0001:\u0002\u0088\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010!\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0012J\u0006\u0010)\u001a\u00020\u0010J\u0006\u0010*\u001a\u00020\u0012J\u0006\u00101\u001a\u00020\u0010J\u0006\u00102\u001a\u00020\u0012J\u0006\u00109\u001a\u00020\u0010J\u0006\u0010:\u001a\u00020\u0012J\u0006\u0010A\u001a\u00020\u0010J\u0006\u0010B\u001a\u00020\u0012J\u0006\u0010I\u001a\u00020\u0010J\u0006\u0010J\u001a\u00020\u0012J\u0006\u0010Q\u001a\u00020\u0010J\u0006\u0010R\u001a\u00020\u0012J\u0006\u0010Y\u001a\u00020\u0010J\u0006\u0010Z\u001a\u00020\u0012J\u0006\u0010a\u001a\u00020\u0010J\u0006\u0010b\u001a\u00020\u0012J\u0006\u0010i\u001a\u00020\u0010J\u0006\u0010j\u001a\u00020\u0012J\u0006\u0010q\u001a\u00020\u0010J\u0006\u0010r\u001a\u00020\u0012J\u0006\u0010y\u001a\u00020\u0010J\u0006\u0010z\u001a\u00020\u0012J\u0007\u0010\u0081\u0001\u001a\u00020\u0010J\u0007\u0010\u0082\u0001\u001a\u00020\u0012J\u0007\u0010\u0087\u0001\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010$\u001a\u00020#2\u0006\u0010\b\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010,\u001a\u00020+2\u0006\u0010\b\u001a\u00020+8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00104\u001a\u0002032\u0006\u0010\b\u001a\u0002038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010<\u001a\u00020;2\u0006\u0010\b\u001a\u00020;8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010D\u001a\u00020C2\u0006\u0010\b\u001a\u00020C8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010L\u001a\u00020K2\u0006\u0010\b\u001a\u00020K8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010T\u001a\u00020S2\u0006\u0010\b\u001a\u00020S8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010\\\u001a\u00020[2\u0006\u0010\b\u001a\u00020[8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010d\u001a\u00020c2\u0006\u0010\b\u001a\u00020c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR$\u0010l\u001a\u00020k2\u0006\u0010\b\u001a\u00020k8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR$\u0010t\u001a\u00020s2\u0006\u0010\b\u001a\u00020s8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR%\u0010|\u001a\u00020{2\u0006\u0010\b\u001a\u00020{8G@GX\u0086\u000e¢\u0006\r\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R\u0015\u0010\u0083\u0001\u001a\u00030\u0084\u00018G¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001¨\u0006\u0089\u0001"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt$PayloadKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload$Builder;", "<init>", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload$Builder;)V", "_build", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "value", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "initializationRequest", "getInitializationRequest", "()Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "setInitializationRequest", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;)V", "clearInitializationRequest", "", "hasInitializationRequest", "", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "adRequest", "getAdRequest", "()Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "setAdRequest", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;)V", "clearAdRequest", "hasAdRequest", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "operativeEvent", "getOperativeEvent", "()Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "setOperativeEvent", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;)V", "clearOperativeEvent", "hasOperativeEvent", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;", "diagnosticEventRequest", "getDiagnosticEventRequest", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;", "setDiagnosticEventRequest", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;)V", "clearDiagnosticEventRequest", "hasDiagnosticEventRequest", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "adPlayerConfigRequest", "getAdPlayerConfigRequest", "()Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "setAdPlayerConfigRequest", "(Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;)V", "clearAdPlayerConfigRequest", "hasAdPlayerConfigRequest", "Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "getTokenEventRequest", "getGetTokenEventRequest", "()Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "setGetTokenEventRequest", "(Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;)V", "clearGetTokenEventRequest", "hasGetTokenEventRequest", "Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "privacyUpdateRequest", "getPrivacyUpdateRequest", "()Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "setPrivacyUpdateRequest", "(Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;)V", "clearPrivacyUpdateRequest", "hasPrivacyUpdateRequest", "Lgatewayprotocol/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;", "adDataRefreshRequest", "getAdDataRefreshRequest", "()Lgatewayprotocol/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;", "setAdDataRefreshRequest", "(Lgatewayprotocol/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;)V", "clearAdDataRefreshRequest", "hasAdDataRefreshRequest", "Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "initializationCompletedEventRequest", "getInitializationCompletedEventRequest", "()Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "setInitializationCompletedEventRequest", "(Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;)V", "clearInitializationCompletedEventRequest", "hasInitializationCompletedEventRequest", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "transactionEventRequest", "getTransactionEventRequest", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "setTransactionEventRequest", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;)V", "clearTransactionEventRequest", "hasTransactionEventRequest", "Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest;", "audienceManagementRequest", "getAudienceManagementRequest", "()Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest;", "setAudienceManagementRequest", "(Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest;)V", "clearAudienceManagementRequest", "hasAudienceManagementRequest", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;", "adRevenueEventRequest", "getAdRevenueEventRequest", "()Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;", "setAdRevenueEventRequest", "(Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;)V", "clearAdRevenueEventRequest", "hasAdRevenueEventRequest", "Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEventRequest;", "monitoringEventRequest", "getMonitoringEventRequest", "()Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEventRequest;", "setMonitoringEventRequest", "(Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEventRequest;)V", "clearMonitoringEventRequest", "hasMonitoringEventRequest", "Lgatewayprotocol/v1/LifecycleEventRequestOuterClass$LifecycleEventRequest;", "lifecycleEventRequest", "getLifecycleEventRequest", "()Lgatewayprotocol/v1/LifecycleEventRequestOuterClass$LifecycleEventRequest;", "setLifecycleEventRequest", "(Lgatewayprotocol/v1/LifecycleEventRequestOuterClass$LifecycleEventRequest;)V", "clearLifecycleEventRequest", "hasLifecycleEventRequest", "Lgatewayprotocol/v1/RewardedOffersRequestOuterClass$RewardedOffersRequest;", "rewardedOffersRequest", "getRewardedOffersRequest", "()Lgatewayprotocol/v1/RewardedOffersRequestOuterClass$RewardedOffersRequest;", "setRewardedOffersRequest", "(Lgatewayprotocol/v1/RewardedOffersRequestOuterClass$RewardedOffersRequest;)V", "clearRewardedOffersRequest", "hasRewardedOffersRequest", "valueCase", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload$ValueCase;", "getValueCase", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload$ValueCase;", "clearValue", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final UniversalRequestOuterClass.UniversalRequest.Payload.Builder _builder;

            public /* synthetic */ Dsl(UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder) {
                this._builder = builder;
            }

            /* compiled from: UniversalRequestKt.kt */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt$PayloadKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/UniversalRequestKt$PayloadKt$Dsl;", "builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest.Payload _build() {
                UniversalRequestOuterClass.UniversalRequest.Payload build = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                return build;
            }

            public final InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
                InitializationRequestOuterClass.InitializationRequest initializationRequest = this._builder.getInitializationRequest();
                Intrinsics.checkNotNullExpressionValue(initializationRequest, "getInitializationRequest(...)");
                return initializationRequest;
            }

            public final void setInitializationRequest(InitializationRequestOuterClass.InitializationRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setInitializationRequest(value);
            }

            public final void clearInitializationRequest() {
                this._builder.clearInitializationRequest();
            }

            public final boolean hasInitializationRequest() {
                return this._builder.hasInitializationRequest();
            }

            public final AdRequestOuterClass.AdRequest getAdRequest() {
                AdRequestOuterClass.AdRequest adRequest = this._builder.getAdRequest();
                Intrinsics.checkNotNullExpressionValue(adRequest, "getAdRequest(...)");
                return adRequest;
            }

            public final void setAdRequest(AdRequestOuterClass.AdRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAdRequest(value);
            }

            public final void clearAdRequest() {
                this._builder.clearAdRequest();
            }

            public final boolean hasAdRequest() {
                return this._builder.hasAdRequest();
            }

            public final OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEvent() {
                OperativeEventRequestOuterClass.OperativeEventRequest operativeEvent = this._builder.getOperativeEvent();
                Intrinsics.checkNotNullExpressionValue(operativeEvent, "getOperativeEvent(...)");
                return operativeEvent;
            }

            public final void setOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setOperativeEvent(value);
            }

            public final void clearOperativeEvent() {
                this._builder.clearOperativeEvent();
            }

            public final boolean hasOperativeEvent() {
                return this._builder.hasOperativeEvent();
            }

            public final DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequest() {
                DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest = this._builder.getDiagnosticEventRequest();
                Intrinsics.checkNotNullExpressionValue(diagnosticEventRequest, "getDiagnosticEventRequest(...)");
                return diagnosticEventRequest;
            }

            public final void setDiagnosticEventRequest(DiagnosticEventRequestOuterClass.DiagnosticEventRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setDiagnosticEventRequest(value);
            }

            public final void clearDiagnosticEventRequest() {
                this._builder.clearDiagnosticEventRequest();
            }

            public final boolean hasDiagnosticEventRequest() {
                return this._builder.hasDiagnosticEventRequest();
            }

            public final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequest() {
                AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest = this._builder.getAdPlayerConfigRequest();
                Intrinsics.checkNotNullExpressionValue(adPlayerConfigRequest, "getAdPlayerConfigRequest(...)");
                return adPlayerConfigRequest;
            }

            public final void setAdPlayerConfigRequest(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAdPlayerConfigRequest(value);
            }

            public final void clearAdPlayerConfigRequest() {
                this._builder.clearAdPlayerConfigRequest();
            }

            public final boolean hasAdPlayerConfigRequest() {
                return this._builder.hasAdPlayerConfigRequest();
            }

            public final GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequest() {
                GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest = this._builder.getGetTokenEventRequest();
                Intrinsics.checkNotNullExpressionValue(getTokenEventRequest, "getGetTokenEventRequest(...)");
                return getTokenEventRequest;
            }

            public final void setGetTokenEventRequest(GetTokenEventRequestOuterClass.GetTokenEventRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setGetTokenEventRequest(value);
            }

            public final void clearGetTokenEventRequest() {
                this._builder.clearGetTokenEventRequest();
            }

            public final boolean hasGetTokenEventRequest() {
                return this._builder.hasGetTokenEventRequest();
            }

            public final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequest() {
                PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest = this._builder.getPrivacyUpdateRequest();
                Intrinsics.checkNotNullExpressionValue(privacyUpdateRequest, "getPrivacyUpdateRequest(...)");
                return privacyUpdateRequest;
            }

            public final void setPrivacyUpdateRequest(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setPrivacyUpdateRequest(value);
            }

            public final void clearPrivacyUpdateRequest() {
                this._builder.clearPrivacyUpdateRequest();
            }

            public final boolean hasPrivacyUpdateRequest() {
                return this._builder.hasPrivacyUpdateRequest();
            }

            public final AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequest() {
                AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest = this._builder.getAdDataRefreshRequest();
                Intrinsics.checkNotNullExpressionValue(adDataRefreshRequest, "getAdDataRefreshRequest(...)");
                return adDataRefreshRequest;
            }

            public final void setAdDataRefreshRequest(AdDataRefreshRequestOuterClass.AdDataRefreshRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAdDataRefreshRequest(value);
            }

            public final void clearAdDataRefreshRequest() {
                this._builder.clearAdDataRefreshRequest();
            }

            public final boolean hasAdDataRefreshRequest() {
                return this._builder.hasAdDataRefreshRequest();
            }

            public final InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequest() {
                InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest = this._builder.getInitializationCompletedEventRequest();
                Intrinsics.checkNotNullExpressionValue(initializationCompletedEventRequest, "getInitializationCompletedEventRequest(...)");
                return initializationCompletedEventRequest;
            }

            public final void setInitializationCompletedEventRequest(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setInitializationCompletedEventRequest(value);
            }

            public final void clearInitializationCompletedEventRequest() {
                this._builder.clearInitializationCompletedEventRequest();
            }

            public final boolean hasInitializationCompletedEventRequest() {
                return this._builder.hasInitializationCompletedEventRequest();
            }

            public final TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequest() {
                TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest = this._builder.getTransactionEventRequest();
                Intrinsics.checkNotNullExpressionValue(transactionEventRequest, "getTransactionEventRequest(...)");
                return transactionEventRequest;
            }

            public final void setTransactionEventRequest(TransactionEventRequestOuterClass.TransactionEventRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setTransactionEventRequest(value);
            }

            public final void clearTransactionEventRequest() {
                this._builder.clearTransactionEventRequest();
            }

            public final boolean hasTransactionEventRequest() {
                return this._builder.hasTransactionEventRequest();
            }

            public final AudienceManagementRequestOuterClass.AudienceManagementRequest getAudienceManagementRequest() {
                AudienceManagementRequestOuterClass.AudienceManagementRequest audienceManagementRequest = this._builder.getAudienceManagementRequest();
                Intrinsics.checkNotNullExpressionValue(audienceManagementRequest, "getAudienceManagementRequest(...)");
                return audienceManagementRequest;
            }

            public final void setAudienceManagementRequest(AudienceManagementRequestOuterClass.AudienceManagementRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAudienceManagementRequest(value);
            }

            public final void clearAudienceManagementRequest() {
                this._builder.clearAudienceManagementRequest();
            }

            public final boolean hasAudienceManagementRequest() {
                return this._builder.hasAudienceManagementRequest();
            }

            public final AdRevenueEventRequestOuterClass.AdRevenueEventRequest getAdRevenueEventRequest() {
                AdRevenueEventRequestOuterClass.AdRevenueEventRequest adRevenueEventRequest = this._builder.getAdRevenueEventRequest();
                Intrinsics.checkNotNullExpressionValue(adRevenueEventRequest, "getAdRevenueEventRequest(...)");
                return adRevenueEventRequest;
            }

            public final void setAdRevenueEventRequest(AdRevenueEventRequestOuterClass.AdRevenueEventRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAdRevenueEventRequest(value);
            }

            public final void clearAdRevenueEventRequest() {
                this._builder.clearAdRevenueEventRequest();
            }

            public final boolean hasAdRevenueEventRequest() {
                return this._builder.hasAdRevenueEventRequest();
            }

            public final MonitoringEventRequestOuterClass.MonitoringEventRequest getMonitoringEventRequest() {
                MonitoringEventRequestOuterClass.MonitoringEventRequest monitoringEventRequest = this._builder.getMonitoringEventRequest();
                Intrinsics.checkNotNullExpressionValue(monitoringEventRequest, "getMonitoringEventRequest(...)");
                return monitoringEventRequest;
            }

            public final void setMonitoringEventRequest(MonitoringEventRequestOuterClass.MonitoringEventRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setMonitoringEventRequest(value);
            }

            public final void clearMonitoringEventRequest() {
                this._builder.clearMonitoringEventRequest();
            }

            public final boolean hasMonitoringEventRequest() {
                return this._builder.hasMonitoringEventRequest();
            }

            public final LifecycleEventRequestOuterClass.LifecycleEventRequest getLifecycleEventRequest() {
                LifecycleEventRequestOuterClass.LifecycleEventRequest lifecycleEventRequest = this._builder.getLifecycleEventRequest();
                Intrinsics.checkNotNullExpressionValue(lifecycleEventRequest, "getLifecycleEventRequest(...)");
                return lifecycleEventRequest;
            }

            public final void setLifecycleEventRequest(LifecycleEventRequestOuterClass.LifecycleEventRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setLifecycleEventRequest(value);
            }

            public final void clearLifecycleEventRequest() {
                this._builder.clearLifecycleEventRequest();
            }

            public final boolean hasLifecycleEventRequest() {
                return this._builder.hasLifecycleEventRequest();
            }

            public final RewardedOffersRequestOuterClass.RewardedOffersRequest getRewardedOffersRequest() {
                RewardedOffersRequestOuterClass.RewardedOffersRequest rewardedOffersRequest = this._builder.getRewardedOffersRequest();
                Intrinsics.checkNotNullExpressionValue(rewardedOffersRequest, "getRewardedOffersRequest(...)");
                return rewardedOffersRequest;
            }

            public final void setRewardedOffersRequest(RewardedOffersRequestOuterClass.RewardedOffersRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setRewardedOffersRequest(value);
            }

            public final void clearRewardedOffersRequest() {
                this._builder.clearRewardedOffersRequest();
            }

            public final boolean hasRewardedOffersRequest() {
                return this._builder.hasRewardedOffersRequest();
            }

            public final UniversalRequestOuterClass.UniversalRequest.Payload.ValueCase getValueCase() {
                UniversalRequestOuterClass.UniversalRequest.Payload.ValueCase valueCase = this._builder.getValueCase();
                Intrinsics.checkNotNullExpressionValue(valueCase, "getValueCase(...)");
                return valueCase;
            }

            public final void clearValue() {
                this._builder.clearValue();
            }
        }
    }
}
