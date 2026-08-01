package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdRequestKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/AdRequestKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdRequestKt {
    public static final AdRequestKt INSTANCE = new AdRequestKt();

    private AdRequestKt() {
    }

    /* compiled from: AdRequestKt.kt */
    @Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u0093\u00012\u00020\u0001:\u0004\u0093\u0001\u0094\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010!\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0012J\u0006\u0010)\u001a\u00020\u0010J\u0006\u0010*\u001a\u00020\u0012J\u0006\u00101\u001a\u00020\u0010J\u0006\u00108\u001a\u00020\u0010J\u0006\u0010>\u001a\u00020\u0010J\u0006\u0010B\u001a\u00020\u0010J\u0006\u0010I\u001a\u00020\u0010J\u0006\u0010J\u001a\u00020\u0012J\u0006\u0010N\u001a\u00020\u0010J\u0006\u0010O\u001a\u00020\u0012J\u0006\u0010Y\u001a\u00020\u0010J\u0006\u0010Z\u001a\u00020\u0012J\u0006\u0010a\u001a\u00020\u0010J\u0006\u0010b\u001a\u00020\u0012J\u0006\u0010o\u001a\u00020\u0010J\u0006\u0010p\u001a\u00020\u0012J\u0006\u0010t\u001a\u00020\u0010J\u0006\u0010u\u001a\u00020\u0012J3\u0010{\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020x0w2\u0006\u0010|\u001a\u0002022\u0006\u0010\b\u001a\u000202H\u0007¢\u0006\u0002\b}J4\u0010~\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020x0w2\u0006\u0010|\u001a\u0002022\u0006\u0010\b\u001a\u000202H\u0087\n¢\u0006\u0002\b\u007fJ-\u0010\u0080\u0001\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020x0w2\u0006\u0010|\u001a\u000202H\u0007¢\u0006\u0003\b\u0081\u0001J;\u0010\u0082\u0001\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020x0w2\u0014\u0010\u0083\u0001\u001a\u000f\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002020\u0084\u0001H\u0007¢\u0006\u0003\b\u0085\u0001J%\u0010\u0086\u0001\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020x0wH\u0007¢\u0006\u0003\b\u0087\u0001J\u0007\u0010\u008e\u0001\u001a\u00020\u0010J\u0007\u0010\u008f\u0001\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010$\u001a\u00020#2\u0006\u0010\b\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010,\u001a\u00020+2\u0006\u0010\b\u001a\u00020+8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00103\u001a\u0002022\u0006\u0010\b\u001a\u0002028G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u00109\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010?\u001a\u00020+2\u0006\u0010\b\u001a\u00020+8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010.\"\u0004\bA\u00100R$\u0010D\u001a\u00020C2\u0006\u0010\b\u001a\u00020C8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010K\u001a\u00020+2\u0006\u0010\b\u001a\u00020+8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bL\u0010.\"\u0004\bM\u00100R$\u0010Q\u001a\u00020P2\u0006\u0010\b\u001a\u00020P8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010V\u001a\u00020C2\u0006\u0010\b\u001a\u00020C8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010F\"\u0004\bX\u0010HR$\u0010\\\u001a\u00020[2\u0006\u0010\b\u001a\u00020[8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0017\u0010c\u001a\u0004\u0018\u00010[*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bd\u0010eR$\u0010g\u001a\u00020f2\u0006\u0010\b\u001a\u00020f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR$\u0010l\u001a\u00020C2\u0006\u0010\b\u001a\u00020C8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bm\u0010F\"\u0004\bn\u0010HR$\u0010q\u001a\u0002022\u0006\u0010\b\u001a\u0002028G@GX\u0086\u000e¢\u0006\f\u001a\u0004\br\u00105\"\u0004\bs\u00107R#\u0010v\u001a\u0014\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020x0w8G¢\u0006\u0006\u001a\u0004\by\u0010zR+\u0010\u0089\u0001\u001a\u00030\u0088\u00012\u0007\u0010\b\u001a\u00030\u0088\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001b\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0088\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001¨\u0006\u0095\u0001"}, d2 = {"Lgatewayprotocol/v1/AdRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest$Builder;", "<init>", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest$Builder;)V", "_build", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "value", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "sessionCounters", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", "clearSessionCounters", "", "hasSessionCounters", "", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfo", "getStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "setStaticDeviceInfo", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;)V", "clearStaticDeviceInfo", "hasStaticDeviceInfo", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfo", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "setDynamicDeviceInfo", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;)V", "clearDynamicDeviceInfo", "hasDynamicDeviceInfo", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "campaignState", "getCampaignState", "()Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "setCampaignState", "(Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;)V", "clearCampaignState", "hasCampaignState", "Lcom/google/protobuf/ByteString;", "impressionOpportunityId", "getImpressionOpportunityId", "()Lcom/google/protobuf/ByteString;", "setImpressionOpportunityId", "(Lcom/google/protobuf/ByteString;)V", "clearImpressionOpportunityId", "", "placementId", "getPlacementId", "()Ljava/lang/String;", "setPlacementId", "(Ljava/lang/String;)V", "clearPlacementId", "requestImpressionConfiguration", "getRequestImpressionConfiguration", "()Z", "setRequestImpressionConfiguration", "(Z)V", "clearRequestImpressionConfiguration", "scarSignal", "getScarSignal", "setScarSignal", "clearScarSignal", "", "webviewVersion", "getWebviewVersion", "()I", "setWebviewVersion", "(I)V", "clearWebviewVersion", "hasWebviewVersion", "tcf", "getTcf", "setTcf", "clearTcf", "hasTcf", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestType;", "adRequestType", "getAdRequestType", "()Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestType;", "setAdRequestType", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestType;)V", "adRequestTypeValue", "getAdRequestTypeValue", "setAdRequestTypeValue", "clearAdRequestType", "hasAdRequestType", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "bannerSize", "getBannerSize", "()Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "setBannerSize", "(Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;)V", "clearBannerSize", "hasBannerSize", "bannerSizeOrNull", "getBannerSizeOrNull", "(Lgatewayprotocol/v1/AdRequestKt$Dsl;)Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "adFormat", "getAdFormat", "()Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "setAdFormat", "(Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;)V", "adFormatValue", "getAdFormatValue", "setAdFormatValue", "clearAdFormat", "hasAdFormat", "mediationAdUnitId", "getMediationAdUnitId", "setMediationAdUnitId", "clearMediationAdUnitId", "hasMediationAdUnitId", "extras", "Lcom/google/protobuf/kotlin/DslMap;", "Lgatewayprotocol/v1/AdRequestKt$Dsl$ExtrasProxy;", "getExtrasMap", "()Lcom/google/protobuf/kotlin/DslMap;", "put", "key", "putExtras", "set", "setExtras", "remove", "removeExtras", "putAll", "map", "", "putAllExtras", "clear", "clearExtras", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "mediationInfo", "getMediationInfo", "()Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "setMediationInfo", "(Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;)V", "clearMediationInfo", "hasMediationInfo", "mediationInfoOrNull", "getMediationInfoOrNull", "(Lgatewayprotocol/v1/AdRequestKt$Dsl;)Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", k.M, "ExtrasProxy", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AdRequestOuterClass.AdRequest.Builder _builder;

        public /* synthetic */ Dsl(AdRequestOuterClass.AdRequest.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(AdRequestOuterClass.AdRequest.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: AdRequestKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/AdRequestKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/AdRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(AdRequestOuterClass.AdRequest.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ AdRequestOuterClass.AdRequest _build() {
            AdRequestOuterClass.AdRequest build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            Intrinsics.checkNotNullExpressionValue(sessionCounters, "getSessionCounters(...)");
            return sessionCounters;
        }

        public final void setSessionCounters(SessionCountersOuterClass.SessionCounters value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSessionCounters(value);
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            Intrinsics.checkNotNullExpressionValue(staticDeviceInfo, "getStaticDeviceInfo(...)");
            return staticDeviceInfo;
        }

        public final void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            Intrinsics.checkNotNullExpressionValue(dynamicDeviceInfo, "getDynamicDeviceInfo(...)");
            return dynamicDeviceInfo;
        }

        public final void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDynamicDeviceInfo(value);
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState = this._builder.getCampaignState();
            Intrinsics.checkNotNullExpressionValue(campaignState, "getCampaignState(...)");
            return campaignState;
        }

        public final void setCampaignState(CampaignStateOuterClass.CampaignState value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCampaignState(value);
        }

        public final void clearCampaignState() {
            this._builder.clearCampaignState();
        }

        public final boolean hasCampaignState() {
            return this._builder.hasCampaignState();
        }

        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            Intrinsics.checkNotNullExpressionValue(impressionOpportunityId, "getImpressionOpportunityId(...)");
            return impressionOpportunityId;
        }

        public final void setImpressionOpportunityId(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setImpressionOpportunityId(value);
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            Intrinsics.checkNotNullExpressionValue(placementId, "getPlacementId(...)");
            return placementId;
        }

        public final void setPlacementId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPlacementId(value);
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final boolean getRequestImpressionConfiguration() {
            return this._builder.getRequestImpressionConfiguration();
        }

        public final void setRequestImpressionConfiguration(boolean z) {
            this._builder.setRequestImpressionConfiguration(z);
        }

        public final void clearRequestImpressionConfiguration() {
            this._builder.clearRequestImpressionConfiguration();
        }

        public final ByteString getScarSignal() {
            ByteString scarSignal = this._builder.getScarSignal();
            Intrinsics.checkNotNullExpressionValue(scarSignal, "getScarSignal(...)");
            return scarSignal;
        }

        public final void setScarSignal(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setScarSignal(value);
        }

        public final void clearScarSignal() {
            this._builder.clearScarSignal();
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

        public final ByteString getTcf() {
            ByteString tcf = this._builder.getTcf();
            Intrinsics.checkNotNullExpressionValue(tcf, "getTcf(...)");
            return tcf;
        }

        public final void setTcf(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTcf(value);
        }

        public final void clearTcf() {
            this._builder.clearTcf();
        }

        public final boolean hasTcf() {
            return this._builder.hasTcf();
        }

        public final AdRequestOuterClass.AdRequestType getAdRequestType() {
            AdRequestOuterClass.AdRequestType adRequestType = this._builder.getAdRequestType();
            Intrinsics.checkNotNullExpressionValue(adRequestType, "getAdRequestType(...)");
            return adRequestType;
        }

        public final void setAdRequestType(AdRequestOuterClass.AdRequestType value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdRequestType(value);
        }

        public final int getAdRequestTypeValue() {
            return this._builder.getAdRequestTypeValue();
        }

        public final void setAdRequestTypeValue(int i) {
            this._builder.setAdRequestTypeValue(i);
        }

        public final void clearAdRequestType() {
            this._builder.clearAdRequestType();
        }

        public final boolean hasAdRequestType() {
            return this._builder.hasAdRequestType();
        }

        public final AdRequestOuterClass.BannerSize getBannerSize() {
            AdRequestOuterClass.BannerSize bannerSize = this._builder.getBannerSize();
            Intrinsics.checkNotNullExpressionValue(bannerSize, "getBannerSize(...)");
            return bannerSize;
        }

        public final void setBannerSize(AdRequestOuterClass.BannerSize value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setBannerSize(value);
        }

        public final void clearBannerSize() {
            this._builder.clearBannerSize();
        }

        public final boolean hasBannerSize() {
            return this._builder.hasBannerSize();
        }

        public final AdRequestOuterClass.BannerSize getBannerSizeOrNull(Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return AdRequestKtKt.getBannerSizeOrNull(dsl._builder);
        }

        public final AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            Intrinsics.checkNotNullExpressionValue(adFormat, "getAdFormat(...)");
            return adFormat;
        }

        public final void setAdFormat(AdFormatOuterClass.AdFormat value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdFormat(value);
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        public final void setAdFormatValue(int i) {
            this._builder.setAdFormatValue(i);
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final String getMediationAdUnitId() {
            String mediationAdUnitId = this._builder.getMediationAdUnitId();
            Intrinsics.checkNotNullExpressionValue(mediationAdUnitId, "getMediationAdUnitId(...)");
            return mediationAdUnitId;
        }

        public final void setMediationAdUnitId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMediationAdUnitId(value);
        }

        public final void clearMediationAdUnitId() {
            this._builder.clearMediationAdUnitId();
        }

        public final boolean hasMediationAdUnitId() {
            return this._builder.hasMediationAdUnitId();
        }

        /* compiled from: AdRequestKt.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/AdRequestKt$Dsl$ExtrasProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ExtrasProxy extends DslProxy {
            private ExtrasProxy() {
            }
        }

        public final /* synthetic */ DslMap getExtrasMap() {
            Map<String, String> extrasMap = this._builder.getExtrasMap();
            Intrinsics.checkNotNullExpressionValue(extrasMap, "getExtrasMap(...)");
            return new DslMap(extrasMap);
        }

        public final void putExtras(DslMap<String, String, ExtrasProxy> dslMap, String key, String value) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.putExtras(key, value);
        }

        public final /* synthetic */ void setExtras(DslMap<String, String, ExtrasProxy> dslMap, String key, String value) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            putExtras(dslMap, key, value);
        }

        public final /* synthetic */ void removeExtras(DslMap dslMap, String key) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            this._builder.removeExtras(key);
        }

        public final /* synthetic */ void putAllExtras(DslMap dslMap, Map map) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(map, "map");
            this._builder.putAllExtras(map);
        }

        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            this._builder.clearExtras();
        }

        public final MediationInfoOuterClass.MediationInfo getMediationInfo() {
            MediationInfoOuterClass.MediationInfo mediationInfo = this._builder.getMediationInfo();
            Intrinsics.checkNotNullExpressionValue(mediationInfo, "getMediationInfo(...)");
            return mediationInfo;
        }

        public final void setMediationInfo(MediationInfoOuterClass.MediationInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMediationInfo(value);
        }

        public final void clearMediationInfo() {
            this._builder.clearMediationInfo();
        }

        public final boolean hasMediationInfo() {
            return this._builder.hasMediationInfo();
        }

        public final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return AdRequestKtKt.getMediationInfoOrNull(dsl._builder);
        }
    }
}
