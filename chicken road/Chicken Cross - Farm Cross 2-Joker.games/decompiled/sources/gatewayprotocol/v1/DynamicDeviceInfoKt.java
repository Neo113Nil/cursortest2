package gatewayprotocol.v1;

import com.facebook.internal.AnalyticsEvents;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.ironsource.U3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DynamicDeviceInfoKt.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0014\u0015\u0016\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u000bJ*\u0010\f\u001a\u00020\r2\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u000fJ*\u0010\u0010\u001a\u00020\u00112\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt;", "", "<init>", "()V", "android", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$AndroidKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeandroid", "ios", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl;", "-initializeios", AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_WEB, "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web;", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$WebKt$Dsl;", "-initializeweb", "Dsl", "AndroidKt", "IosKt", "WebKt", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DynamicDeviceInfoKt {
    public static final DynamicDeviceInfoKt INSTANCE = new DynamicDeviceInfoKt();

    private DynamicDeviceInfoKt() {
    }

    /* compiled from: DynamicDeviceInfoKt.kt */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b'\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0096\u00012\u00020\u0001:\u0002\u0096\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0012J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001c\u001a\u00020\u0012J\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010$\u001a\u00020\u0012J\u0006\u0010(\u001a\u00020\u0010J\u0006\u0010)\u001a\u00020\u0012J\u0006\u0010/\u001a\u00020\u0010J\u0006\u00100\u001a\u00020\u0012J\u0006\u00104\u001a\u00020\u0010J\u0006\u00105\u001a\u00020\u0012J\u0006\u00109\u001a\u00020\u0010J\u0006\u0010:\u001a\u00020\u0012J\u0006\u0010>\u001a\u00020\u0010J\u0006\u0010?\u001a\u00020\u0012J\u0006\u0010C\u001a\u00020\u0010J\u0006\u0010D\u001a\u00020\u0012J\u0006\u0010K\u001a\u00020\u0010J\u0006\u0010L\u001a\u00020\u0012J\u0006\u0010S\u001a\u00020\u0010J\u0006\u0010T\u001a\u00020\u0012J\u0006\u0010^\u001a\u00020\u0010J\u0006\u0010_\u001a\u00020\u0012J\u0006\u0010c\u001a\u00020\u0010J\u0006\u0010d\u001a\u00020\u0012J\u0006\u0010h\u001a\u00020\u0010J\u0006\u0010i\u001a\u00020\u0012J\u0006\u0010m\u001a\u00020\u0010J\u0006\u0010n\u001a\u00020\u0012J\u0006\u0010r\u001a\u00020\u0010J\u0006\u0010s\u001a\u00020\u0012J\u0006\u0010w\u001a\u00020\u0010J\u0006\u0010x\u001a\u00020\u0012J\u0006\u0010\u007f\u001a\u00020\u0010J\u0007\u0010\u0080\u0001\u001a\u00020\u0012J\u0007\u0010\u0087\u0001\u001a\u00020\u0010J\u0007\u0010\u0088\u0001\u001a\u00020\u0012J\u0007\u0010\u008f\u0001\u001a\u00020\u0010J\u0007\u0010\u0090\u0001\u001a\u00020\u0012J\u0007\u0010\u0095\u0001\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR$\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR$\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010%\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010 \"\u0004\b'\u0010\"R$\u0010*\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00101\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010\f\"\u0004\b3\u0010\u000eR$\u00106\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010 \"\u0004\b8\u0010\"R$\u0010;\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010,\"\u0004\b=\u0010.R$\u0010@\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010,\"\u0004\bB\u0010.R$\u0010F\u001a\u00020E2\u0006\u0010\b\u001a\u00020E8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010N\u001a\u00020M2\u0006\u0010\b\u001a\u00020M8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010V\u001a\u00020U2\u0006\u0010\b\u001a\u00020U8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010[\u001a\u00020M2\u0006\u0010\b\u001a\u00020M8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010P\"\u0004\b]\u0010RR$\u0010`\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010,\"\u0004\bb\u0010.R$\u0010e\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010,\"\u0004\bg\u0010.R$\u0010j\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010\f\"\u0004\bl\u0010\u000eR$\u0010o\u001a\u00020M2\u0006\u0010\b\u001a\u00020M8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bp\u0010P\"\u0004\bq\u0010RR$\u0010t\u001a\u00020M2\u0006\u0010\b\u001a\u00020M8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bu\u0010P\"\u0004\bv\u0010RR$\u0010z\u001a\u00020y2\u0006\u0010\b\u001a\u00020y8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R+\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\b\u001a\u00030\u0081\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R+\u0010\u008a\u0001\u001a\u00030\u0089\u00012\u0007\u0010\b\u001a\u00030\u0089\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0015\u0010\u0091\u0001\u001a\u00030\u0092\u00018G¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001¨\u0006\u0097\u0001"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder;", "<init>", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder;)V", "_build", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "value", "", "language", "getLanguage", "()Ljava/lang/String;", "setLanguage", "(Ljava/lang/String;)V", "clearLanguage", "", "hasLanguage", "", "networkOperator", "getNetworkOperator", "setNetworkOperator", "clearNetworkOperator", "hasNetworkOperator", "networkOperatorName", "getNetworkOperatorName", "setNetworkOperatorName", "clearNetworkOperatorName", "hasNetworkOperatorName", "", "freeDiskSpace", "getFreeDiskSpace", "()J", "setFreeDiskSpace", "(J)V", "clearFreeDiskSpace", "hasFreeDiskSpace", "freeRamMemory", "getFreeRamMemory", "setFreeRamMemory", "clearFreeRamMemory", "hasFreeRamMemory", "wiredHeadset", "getWiredHeadset", "()Z", "setWiredHeadset", "(Z)V", "clearWiredHeadset", "hasWiredHeadset", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "getTimeZone", "setTimeZone", "clearTimeZone", "hasTimeZone", "timeZoneOffset", "getTimeZoneOffset", "setTimeZoneOffset", "clearTimeZoneOffset", "hasTimeZoneOffset", "limitedTracking", "getLimitedTracking", "setLimitedTracking", "clearLimitedTracking", "hasLimitedTracking", "limitedOpenAdTracking", "getLimitedOpenAdTracking", "setLimitedOpenAdTracking", "clearLimitedOpenAdTracking", "hasLimitedOpenAdTracking", "", U3.j.Y, "getBatteryLevel", "()D", "setBatteryLevel", "(D)V", "clearBatteryLevel", "hasBatteryLevel", "", "batteryStatus", "getBatteryStatus", "()I", "setBatteryStatus", "(I)V", "clearBatteryStatus", "hasBatteryStatus", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$ConnectionType;", "connectionType", "getConnectionType", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$ConnectionType;", "setConnectionType", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$ConnectionType;)V", "connectionTypeValue", "getConnectionTypeValue", "setConnectionTypeValue", "clearConnectionType", "hasConnectionType", "appActive", "getAppActive", "setAppActive", "clearAppActive", "hasAppActive", "lowPowerMode", "getLowPowerMode", "setLowPowerMode", "clearLowPowerMode", "hasLowPowerMode", "userId", "getUserId", "setUserId", "clearUserId", "hasUserId", "screenWidth", "getScreenWidth", "setScreenWidth", "clearScreenWidth", "hasScreenWidth", "screenHeight", "getScreenHeight", "setScreenHeight", "clearScreenHeight", "hasScreenHeight", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "android", "getAndroid", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "setAndroid", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;)V", "clearAndroid", "hasAndroid", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "ios", "getIos", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "setIos", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;)V", "clearIos", "hasIos", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web;", AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_WEB, "getWeb", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web;", "setWeb", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web;)V", "clearWeb", "hasWeb", "platformSpecificCase", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$PlatformSpecificCase;", "getPlatformSpecificCase", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$PlatformSpecificCase;", "clearPlatformSpecific", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder _builder;

        public /* synthetic */ Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: DynamicDeviceInfoKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$Dsl;", "builder", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ DynamicDeviceInfoOuterClass.DynamicDeviceInfo _build() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final String getLanguage() {
            String language = this._builder.getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
            return language;
        }

        public final void setLanguage(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setLanguage(value);
        }

        public final void clearLanguage() {
            this._builder.clearLanguage();
        }

        public final boolean hasLanguage() {
            return this._builder.hasLanguage();
        }

        public final String getNetworkOperator() {
            String networkOperator = this._builder.getNetworkOperator();
            Intrinsics.checkNotNullExpressionValue(networkOperator, "getNetworkOperator(...)");
            return networkOperator;
        }

        public final void setNetworkOperator(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setNetworkOperator(value);
        }

        public final void clearNetworkOperator() {
            this._builder.clearNetworkOperator();
        }

        public final boolean hasNetworkOperator() {
            return this._builder.hasNetworkOperator();
        }

        public final String getNetworkOperatorName() {
            String networkOperatorName = this._builder.getNetworkOperatorName();
            Intrinsics.checkNotNullExpressionValue(networkOperatorName, "getNetworkOperatorName(...)");
            return networkOperatorName;
        }

        public final void setNetworkOperatorName(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setNetworkOperatorName(value);
        }

        public final void clearNetworkOperatorName() {
            this._builder.clearNetworkOperatorName();
        }

        public final boolean hasNetworkOperatorName() {
            return this._builder.hasNetworkOperatorName();
        }

        public final long getFreeDiskSpace() {
            return this._builder.getFreeDiskSpace();
        }

        public final void setFreeDiskSpace(long j) {
            this._builder.setFreeDiskSpace(j);
        }

        public final void clearFreeDiskSpace() {
            this._builder.clearFreeDiskSpace();
        }

        public final boolean hasFreeDiskSpace() {
            return this._builder.hasFreeDiskSpace();
        }

        public final long getFreeRamMemory() {
            return this._builder.getFreeRamMemory();
        }

        public final void setFreeRamMemory(long j) {
            this._builder.setFreeRamMemory(j);
        }

        public final void clearFreeRamMemory() {
            this._builder.clearFreeRamMemory();
        }

        public final boolean hasFreeRamMemory() {
            return this._builder.hasFreeRamMemory();
        }

        public final boolean getWiredHeadset() {
            return this._builder.getWiredHeadset();
        }

        public final void setWiredHeadset(boolean z) {
            this._builder.setWiredHeadset(z);
        }

        public final void clearWiredHeadset() {
            this._builder.clearWiredHeadset();
        }

        public final boolean hasWiredHeadset() {
            return this._builder.hasWiredHeadset();
        }

        public final String getTimeZone() {
            String timeZone = this._builder.getTimeZone();
            Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(...)");
            return timeZone;
        }

        public final void setTimeZone(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTimeZone(value);
        }

        public final void clearTimeZone() {
            this._builder.clearTimeZone();
        }

        public final boolean hasTimeZone() {
            return this._builder.hasTimeZone();
        }

        public final long getTimeZoneOffset() {
            return this._builder.getTimeZoneOffset();
        }

        public final void setTimeZoneOffset(long j) {
            this._builder.setTimeZoneOffset(j);
        }

        public final void clearTimeZoneOffset() {
            this._builder.clearTimeZoneOffset();
        }

        public final boolean hasTimeZoneOffset() {
            return this._builder.hasTimeZoneOffset();
        }

        public final boolean getLimitedTracking() {
            return this._builder.getLimitedTracking();
        }

        public final void setLimitedTracking(boolean z) {
            this._builder.setLimitedTracking(z);
        }

        public final void clearLimitedTracking() {
            this._builder.clearLimitedTracking();
        }

        public final boolean hasLimitedTracking() {
            return this._builder.hasLimitedTracking();
        }

        public final boolean getLimitedOpenAdTracking() {
            return this._builder.getLimitedOpenAdTracking();
        }

        public final void setLimitedOpenAdTracking(boolean z) {
            this._builder.setLimitedOpenAdTracking(z);
        }

        public final void clearLimitedOpenAdTracking() {
            this._builder.clearLimitedOpenAdTracking();
        }

        public final boolean hasLimitedOpenAdTracking() {
            return this._builder.hasLimitedOpenAdTracking();
        }

        public final double getBatteryLevel() {
            return this._builder.getBatteryLevel();
        }

        public final void setBatteryLevel(double d) {
            this._builder.setBatteryLevel(d);
        }

        public final void clearBatteryLevel() {
            this._builder.clearBatteryLevel();
        }

        public final boolean hasBatteryLevel() {
            return this._builder.hasBatteryLevel();
        }

        public final int getBatteryStatus() {
            return this._builder.getBatteryStatus();
        }

        public final void setBatteryStatus(int i) {
            this._builder.setBatteryStatus(i);
        }

        public final void clearBatteryStatus() {
            this._builder.clearBatteryStatus();
        }

        public final boolean hasBatteryStatus() {
            return this._builder.hasBatteryStatus();
        }

        public final DynamicDeviceInfoOuterClass.ConnectionType getConnectionType() {
            DynamicDeviceInfoOuterClass.ConnectionType connectionType = this._builder.getConnectionType();
            Intrinsics.checkNotNullExpressionValue(connectionType, "getConnectionType(...)");
            return connectionType;
        }

        public final void setConnectionType(DynamicDeviceInfoOuterClass.ConnectionType value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setConnectionType(value);
        }

        public final int getConnectionTypeValue() {
            return this._builder.getConnectionTypeValue();
        }

        public final void setConnectionTypeValue(int i) {
            this._builder.setConnectionTypeValue(i);
        }

        public final void clearConnectionType() {
            this._builder.clearConnectionType();
        }

        public final boolean hasConnectionType() {
            return this._builder.hasConnectionType();
        }

        public final boolean getAppActive() {
            return this._builder.getAppActive();
        }

        public final void setAppActive(boolean z) {
            this._builder.setAppActive(z);
        }

        public final void clearAppActive() {
            this._builder.clearAppActive();
        }

        public final boolean hasAppActive() {
            return this._builder.hasAppActive();
        }

        public final boolean getLowPowerMode() {
            return this._builder.getLowPowerMode();
        }

        public final void setLowPowerMode(boolean z) {
            this._builder.setLowPowerMode(z);
        }

        public final void clearLowPowerMode() {
            this._builder.clearLowPowerMode();
        }

        public final boolean hasLowPowerMode() {
            return this._builder.hasLowPowerMode();
        }

        public final String getUserId() {
            String userId = this._builder.getUserId();
            Intrinsics.checkNotNullExpressionValue(userId, "getUserId(...)");
            return userId;
        }

        public final void setUserId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setUserId(value);
        }

        public final void clearUserId() {
            this._builder.clearUserId();
        }

        public final boolean hasUserId() {
            return this._builder.hasUserId();
        }

        public final int getScreenWidth() {
            return this._builder.getScreenWidth();
        }

        public final void setScreenWidth(int i) {
            this._builder.setScreenWidth(i);
        }

        public final void clearScreenWidth() {
            this._builder.clearScreenWidth();
        }

        public final boolean hasScreenWidth() {
            return this._builder.hasScreenWidth();
        }

        public final int getScreenHeight() {
            return this._builder.getScreenHeight();
        }

        public final void setScreenHeight(int i) {
            this._builder.setScreenHeight(i);
        }

        public final void clearScreenHeight() {
            this._builder.clearScreenHeight();
        }

        public final boolean hasScreenHeight() {
            return this._builder.hasScreenHeight();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android getAndroid() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android android2 = this._builder.getAndroid();
            Intrinsics.checkNotNullExpressionValue(android2, "getAndroid(...)");
            return android2;
        }

        public final void setAndroid(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAndroid(value);
        }

        public final void clearAndroid() {
            this._builder.clearAndroid();
        }

        public final boolean hasAndroid() {
            return this._builder.hasAndroid();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios getIos() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios ios = this._builder.getIos();
            Intrinsics.checkNotNullExpressionValue(ios, "getIos(...)");
            return ios;
        }

        public final void setIos(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setIos(value);
        }

        public final void clearIos() {
            this._builder.clearIos();
        }

        public final boolean hasIos() {
            return this._builder.hasIos();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web getWeb() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web web = this._builder.getWeb();
            Intrinsics.checkNotNullExpressionValue(web, "getWeb(...)");
            return web;
        }

        public final void setWeb(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setWeb(value);
        }

        public final void clearWeb() {
            this._builder.clearWeb();
        }

        public final boolean hasWeb() {
            return this._builder.hasWeb();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.PlatformSpecificCase getPlatformSpecificCase() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo.PlatformSpecificCase platformSpecificCase = this._builder.getPlatformSpecificCase();
            Intrinsics.checkNotNullExpressionValue(platformSpecificCase, "getPlatformSpecificCase(...)");
            return platformSpecificCase;
        }

        public final void clearPlatformSpecific() {
            this._builder.clearPlatformSpecific();
        }
    }

    /* renamed from: -initializeandroid, reason: not valid java name */
    public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android m7813initializeandroid(Function1<? super AndroidKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        AndroidKt.Dsl.Companion companion = AndroidKt.Dsl.INSTANCE;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder newBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        AndroidKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    /* compiled from: DynamicDeviceInfoKt.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$AndroidKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AndroidKt {
        public static final AndroidKt INSTANCE = new AndroidKt();

        private AndroidKt() {
        }

        /* compiled from: DynamicDeviceInfoKt.kt */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0007\n\u0002\b\u0018\b\u0007\u0018\u0000 \u008f\u00012\u00020\u0001:\u0002\u008f\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\tJ\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u0019\u001a\u00020\tJ\u0006\u0010\u001d\u001a\u00020\u0010J\u0006\u0010\u001e\u001a\u00020\tJ\u0006\u0010\"\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\tJ\u0006\u0010'\u001a\u00020\u0010J\u0006\u0010(\u001a\u00020\tJ\u0006\u0010,\u001a\u00020\u0010J\u0006\u0010-\u001a\u00020\tJ\u0006\u00104\u001a\u00020\u0010J\u0006\u00105\u001a\u00020\tJ\u0006\u00109\u001a\u00020\u0010J\u0006\u0010:\u001a\u00020\tJ\u0006\u0010A\u001a\u00020\u0010J\u0006\u0010B\u001a\u00020\tJ\u0006\u0010F\u001a\u00020\u0010J\u0006\u0010G\u001a\u00020\tJ\u0006\u0010K\u001a\u00020\u0010J\u0006\u0010L\u001a\u00020\tJ\u0006\u0010P\u001a\u00020\u0010J\u0006\u0010Q\u001a\u00020\tJ\u0006\u0010U\u001a\u00020\u0010J\u0006\u0010V\u001a\u00020\tJ\u0006\u0010]\u001a\u00020\u0010J\u0006\u0010^\u001a\u00020\tJ\u0006\u0010b\u001a\u00020\u0010J\u0006\u0010c\u001a\u00020\tJ\u0006\u0010g\u001a\u00020\u0010J\u0006\u0010h\u001a\u00020\tJ\u0006\u0010l\u001a\u00020\u0010J\u0006\u0010m\u001a\u00020\tJ\u0006\u0010q\u001a\u00020\u0010J\u0006\u0010r\u001a\u00020\tJ\u0006\u0010v\u001a\u00020\u0010J\u0006\u0010w\u001a\u00020\tJ\u0006\u0010~\u001a\u00020\u0010J\u0006\u0010\u007f\u001a\u00020\tJ\u0007\u0010\u0083\u0001\u001a\u00020\u0010J\u0007\u0010\u0084\u0001\u001a\u00020\tJ\u0007\u0010\u0088\u0001\u001a\u00020\u0010J\u0007\u0010\u0089\u0001\u001a\u00020\tJ\u0007\u0010\u008d\u0001\u001a\u00020\u0010J\u0007\u0010\u008e\u0001\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001a\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR$\u0010\u001f\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R$\u0010$\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR$\u0010)\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010\u000eR$\u0010/\u001a\u00020.2\u0006\u0010\b\u001a\u00020.8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00106\u001a\u00020.2\u0006\u0010\b\u001a\u00020.8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00101\"\u0004\b8\u00103R$\u0010<\u001a\u00020;2\u0006\u0010\b\u001a\u00020;8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010C\u001a\u00020;2\u0006\u0010\b\u001a\u00020;8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010>\"\u0004\bE\u0010@R$\u0010H\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010\f\"\u0004\bJ\u0010\u000eR$\u0010M\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010\f\"\u0004\bO\u0010\u000eR$\u0010R\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010\f\"\u0004\bT\u0010\u000eR$\u0010X\u001a\u00020W2\u0006\u0010\b\u001a\u00020W8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010_\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010\u0015\"\u0004\ba\u0010\u0017R$\u0010d\u001a\u00020;2\u0006\u0010\b\u001a\u00020;8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\be\u0010>\"\u0004\bf\u0010@R$\u0010i\u001a\u00020.2\u0006\u0010\b\u001a\u00020.8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bj\u00101\"\u0004\bk\u00103R$\u0010n\u001a\u00020;2\u0006\u0010\b\u001a\u00020;8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bo\u0010>\"\u0004\bp\u0010@R$\u0010s\u001a\u00020;2\u0006\u0010\b\u001a\u00020;8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bt\u0010>\"\u0004\bu\u0010@R$\u0010y\u001a\u00020x2\u0006\u0010\b\u001a\u00020x8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R'\u0010\u0080\u0001\u001a\u00020x2\u0006\u0010\b\u001a\u00020x8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0081\u0001\u0010{\"\u0005\b\u0082\u0001\u0010}R'\u0010\u0085\u0001\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0086\u0001\u0010\u0015\"\u0005\b\u0087\u0001\u0010\u0017R'\u0010\u008a\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008b\u0001\u0010\f\"\u0005\b\u008c\u0001\u0010\u000e¨\u0006\u0090\u0001"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$AndroidKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder;", "<init>", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder;)V", "_build", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "value", "", "networkConnected", "getNetworkConnected", "()Z", "setNetworkConnected", "(Z)V", "clearNetworkConnected", "", "hasNetworkConnected", "", "networkType", "getNetworkType", "()I", "setNetworkType", "(I)V", "clearNetworkType", "hasNetworkType", "networkMetered", "getNetworkMetered", "setNetworkMetered", "clearNetworkMetered", "hasNetworkMetered", "telephonyManagerNetworkType", "getTelephonyManagerNetworkType", "setTelephonyManagerNetworkType", "clearTelephonyManagerNetworkType", "hasTelephonyManagerNetworkType", "adbEnabled", "getAdbEnabled", "setAdbEnabled", "clearAdbEnabled", "hasAdbEnabled", "usbConnected", "getUsbConnected", "setUsbConnected", "clearUsbConnected", "hasUsbConnected", "", "volume", "getVolume", "()D", "setVolume", "(D)V", "clearVolume", "hasVolume", "maxVolume", "getMaxVolume", "setMaxVolume", "clearMaxVolume", "hasMaxVolume", "", "deviceUpTime", "getDeviceUpTime", "()J", "setDeviceUpTime", "(J)V", "clearDeviceUpTime", "hasDeviceUpTime", "deviceElapsedRealtime", "getDeviceElapsedRealtime", "setDeviceElapsedRealtime", "clearDeviceElapsedRealtime", "hasDeviceElapsedRealtime", U3.j.m0, "getAirplaneMode", "setAirplaneMode", "clearAirplaneMode", "hasAirplaneMode", "stayOnWhilePluggedIn", "getStayOnWhilePluggedIn", "setStayOnWhilePluggedIn", "clearStayOnWhilePluggedIn", "hasStayOnWhilePluggedIn", "sdCardPresent", "getSdCardPresent", "setSdCardPresent", "clearSdCardPresent", "hasSdCardPresent", "Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "networkCapabilityTransports", "getNetworkCapabilityTransports", "()Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "setNetworkCapabilityTransports", "(Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;)V", "clearNetworkCapabilityTransports", "hasNetworkCapabilityTransports", U3.j.l0, "getChargingType", "setChargingType", "clearChargingType", "hasChargingType", "freeDiskSpaceInternal", "getFreeDiskSpaceInternal", "setFreeDiskSpaceInternal", "clearFreeDiskSpaceInternal", "hasFreeDiskSpaceInternal", U3.j.p0, "getScreenBrightness", "setScreenBrightness", "clearScreenBrightness", "hasScreenBrightness", "jvmFreeMemory", "getJvmFreeMemory", "setJvmFreeMemory", "clearJvmFreeMemory", "hasJvmFreeMemory", "jvmTotalMemory", "getJvmTotalMemory", "setJvmTotalMemory", "clearJvmTotalMemory", "hasJvmTotalMemory", "", "fontScale", "getFontScale", "()F", "setFontScale", "(F)V", "clearFontScale", "hasFontScale", "animatorScale", "getAnimatorScale", "setAnimatorScale", "clearAnimatorScale", "hasAnimatorScale", "accessibilityDisplayDaltonizer", "getAccessibilityDisplayDaltonizer", "setAccessibilityDisplayDaltonizer", "clearAccessibilityDisplayDaltonizer", "hasAccessibilityDisplayDaltonizer", "displayInversionEnabled", "getDisplayInversionEnabled", "setDisplayInversionEnabled", "clearDisplayInversionEnabled", "hasDisplayInversionEnabled", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder _builder;

            public /* synthetic */ Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder) {
                this._builder = builder;
            }

            /* compiled from: DynamicDeviceInfoKt.kt */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$AndroidKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$AndroidKt$Dsl;", "builder", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android _build() {
                DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android build = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                return build;
            }

            public final boolean getNetworkConnected() {
                return this._builder.getNetworkConnected();
            }

            public final void setNetworkConnected(boolean z) {
                this._builder.setNetworkConnected(z);
            }

            public final void clearNetworkConnected() {
                this._builder.clearNetworkConnected();
            }

            public final boolean hasNetworkConnected() {
                return this._builder.hasNetworkConnected();
            }

            public final int getNetworkType() {
                return this._builder.getNetworkType();
            }

            public final void setNetworkType(int i) {
                this._builder.setNetworkType(i);
            }

            public final void clearNetworkType() {
                this._builder.clearNetworkType();
            }

            public final boolean hasNetworkType() {
                return this._builder.hasNetworkType();
            }

            public final boolean getNetworkMetered() {
                return this._builder.getNetworkMetered();
            }

            public final void setNetworkMetered(boolean z) {
                this._builder.setNetworkMetered(z);
            }

            public final void clearNetworkMetered() {
                this._builder.clearNetworkMetered();
            }

            public final boolean hasNetworkMetered() {
                return this._builder.hasNetworkMetered();
            }

            public final int getTelephonyManagerNetworkType() {
                return this._builder.getTelephonyManagerNetworkType();
            }

            public final void setTelephonyManagerNetworkType(int i) {
                this._builder.setTelephonyManagerNetworkType(i);
            }

            public final void clearTelephonyManagerNetworkType() {
                this._builder.clearTelephonyManagerNetworkType();
            }

            public final boolean hasTelephonyManagerNetworkType() {
                return this._builder.hasTelephonyManagerNetworkType();
            }

            public final boolean getAdbEnabled() {
                return this._builder.getAdbEnabled();
            }

            public final void setAdbEnabled(boolean z) {
                this._builder.setAdbEnabled(z);
            }

            public final void clearAdbEnabled() {
                this._builder.clearAdbEnabled();
            }

            public final boolean hasAdbEnabled() {
                return this._builder.hasAdbEnabled();
            }

            public final boolean getUsbConnected() {
                return this._builder.getUsbConnected();
            }

            public final void setUsbConnected(boolean z) {
                this._builder.setUsbConnected(z);
            }

            public final void clearUsbConnected() {
                this._builder.clearUsbConnected();
            }

            public final boolean hasUsbConnected() {
                return this._builder.hasUsbConnected();
            }

            public final double getVolume() {
                return this._builder.getVolume();
            }

            public final void setVolume(double d) {
                this._builder.setVolume(d);
            }

            public final void clearVolume() {
                this._builder.clearVolume();
            }

            public final boolean hasVolume() {
                return this._builder.hasVolume();
            }

            public final double getMaxVolume() {
                return this._builder.getMaxVolume();
            }

            public final void setMaxVolume(double d) {
                this._builder.setMaxVolume(d);
            }

            public final void clearMaxVolume() {
                this._builder.clearMaxVolume();
            }

            public final boolean hasMaxVolume() {
                return this._builder.hasMaxVolume();
            }

            public final long getDeviceUpTime() {
                return this._builder.getDeviceUpTime();
            }

            public final void setDeviceUpTime(long j) {
                this._builder.setDeviceUpTime(j);
            }

            public final void clearDeviceUpTime() {
                this._builder.clearDeviceUpTime();
            }

            public final boolean hasDeviceUpTime() {
                return this._builder.hasDeviceUpTime();
            }

            public final long getDeviceElapsedRealtime() {
                return this._builder.getDeviceElapsedRealtime();
            }

            public final void setDeviceElapsedRealtime(long j) {
                this._builder.setDeviceElapsedRealtime(j);
            }

            public final void clearDeviceElapsedRealtime() {
                this._builder.clearDeviceElapsedRealtime();
            }

            public final boolean hasDeviceElapsedRealtime() {
                return this._builder.hasDeviceElapsedRealtime();
            }

            public final boolean getAirplaneMode() {
                return this._builder.getAirplaneMode();
            }

            public final void setAirplaneMode(boolean z) {
                this._builder.setAirplaneMode(z);
            }

            public final void clearAirplaneMode() {
                this._builder.clearAirplaneMode();
            }

            public final boolean hasAirplaneMode() {
                return this._builder.hasAirplaneMode();
            }

            public final boolean getStayOnWhilePluggedIn() {
                return this._builder.getStayOnWhilePluggedIn();
            }

            public final void setStayOnWhilePluggedIn(boolean z) {
                this._builder.setStayOnWhilePluggedIn(z);
            }

            public final void clearStayOnWhilePluggedIn() {
                this._builder.clearStayOnWhilePluggedIn();
            }

            public final boolean hasStayOnWhilePluggedIn() {
                return this._builder.hasStayOnWhilePluggedIn();
            }

            public final boolean getSdCardPresent() {
                return this._builder.getSdCardPresent();
            }

            public final void setSdCardPresent(boolean z) {
                this._builder.setSdCardPresent(z);
            }

            public final void clearSdCardPresent() {
                this._builder.clearSdCardPresent();
            }

            public final boolean hasSdCardPresent() {
                return this._builder.hasSdCardPresent();
            }

            public final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports() {
                NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports = this._builder.getNetworkCapabilityTransports();
                Intrinsics.checkNotNullExpressionValue(networkCapabilityTransports, "getNetworkCapabilityTransports(...)");
                return networkCapabilityTransports;
            }

            public final void setNetworkCapabilityTransports(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setNetworkCapabilityTransports(value);
            }

            public final void clearNetworkCapabilityTransports() {
                this._builder.clearNetworkCapabilityTransports();
            }

            public final boolean hasNetworkCapabilityTransports() {
                return this._builder.hasNetworkCapabilityTransports();
            }

            public final int getChargingType() {
                return this._builder.getChargingType();
            }

            public final void setChargingType(int i) {
                this._builder.setChargingType(i);
            }

            public final void clearChargingType() {
                this._builder.clearChargingType();
            }

            public final boolean hasChargingType() {
                return this._builder.hasChargingType();
            }

            public final long getFreeDiskSpaceInternal() {
                return this._builder.getFreeDiskSpaceInternal();
            }

            public final void setFreeDiskSpaceInternal(long j) {
                this._builder.setFreeDiskSpaceInternal(j);
            }

            public final void clearFreeDiskSpaceInternal() {
                this._builder.clearFreeDiskSpaceInternal();
            }

            public final boolean hasFreeDiskSpaceInternal() {
                return this._builder.hasFreeDiskSpaceInternal();
            }

            public final double getScreenBrightness() {
                return this._builder.getScreenBrightness();
            }

            public final void setScreenBrightness(double d) {
                this._builder.setScreenBrightness(d);
            }

            public final void clearScreenBrightness() {
                this._builder.clearScreenBrightness();
            }

            public final boolean hasScreenBrightness() {
                return this._builder.hasScreenBrightness();
            }

            public final long getJvmFreeMemory() {
                return this._builder.getJvmFreeMemory();
            }

            public final void setJvmFreeMemory(long j) {
                this._builder.setJvmFreeMemory(j);
            }

            public final void clearJvmFreeMemory() {
                this._builder.clearJvmFreeMemory();
            }

            public final boolean hasJvmFreeMemory() {
                return this._builder.hasJvmFreeMemory();
            }

            public final long getJvmTotalMemory() {
                return this._builder.getJvmTotalMemory();
            }

            public final void setJvmTotalMemory(long j) {
                this._builder.setJvmTotalMemory(j);
            }

            public final void clearJvmTotalMemory() {
                this._builder.clearJvmTotalMemory();
            }

            public final boolean hasJvmTotalMemory() {
                return this._builder.hasJvmTotalMemory();
            }

            public final float getFontScale() {
                return this._builder.getFontScale();
            }

            public final void setFontScale(float f) {
                this._builder.setFontScale(f);
            }

            public final void clearFontScale() {
                this._builder.clearFontScale();
            }

            public final boolean hasFontScale() {
                return this._builder.hasFontScale();
            }

            public final float getAnimatorScale() {
                return this._builder.getAnimatorScale();
            }

            public final void setAnimatorScale(float f) {
                this._builder.setAnimatorScale(f);
            }

            public final void clearAnimatorScale() {
                this._builder.clearAnimatorScale();
            }

            public final boolean hasAnimatorScale() {
                return this._builder.hasAnimatorScale();
            }

            public final int getAccessibilityDisplayDaltonizer() {
                return this._builder.getAccessibilityDisplayDaltonizer();
            }

            public final void setAccessibilityDisplayDaltonizer(int i) {
                this._builder.setAccessibilityDisplayDaltonizer(i);
            }

            public final void clearAccessibilityDisplayDaltonizer() {
                this._builder.clearAccessibilityDisplayDaltonizer();
            }

            public final boolean hasAccessibilityDisplayDaltonizer() {
                return this._builder.hasAccessibilityDisplayDaltonizer();
            }

            public final boolean getDisplayInversionEnabled() {
                return this._builder.getDisplayInversionEnabled();
            }

            public final void setDisplayInversionEnabled(boolean z) {
                this._builder.setDisplayInversionEnabled(z);
            }

            public final void clearDisplayInversionEnabled() {
                this._builder.clearDisplayInversionEnabled();
            }

            public final boolean hasDisplayInversionEnabled() {
                return this._builder.hasDisplayInversionEnabled();
            }
        }
    }

    /* renamed from: -initializeios, reason: not valid java name */
    public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios m7814initializeios(Function1<? super IosKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        IosKt.Dsl.Companion companion = IosKt.Dsl.INSTANCE;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder newBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        IosKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    /* compiled from: DynamicDeviceInfoKt.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IosKt {
        public static final IosKt INSTANCE = new IosKt();

        private IosKt() {
        }

        /* compiled from: DynamicDeviceInfoKt.kt */
        @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b+\b\u0007\u0018\u0000 v2\u00020\u0001:\u0003vwxB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0012J%\u0010 \u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b!J&\u0010\"\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\b\u001a\u00020\tH\u0087\n¢\u0006\u0002\b#J+\u0010$\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0&H\u0007¢\u0006\u0002\b'J,\u0010\"\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0&H\u0087\n¢\u0006\u0002\b(J.\u0010)\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010*\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b+J\u001d\u0010,\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001d0\u001cH\u0007¢\u0006\u0002\b-J%\u0010 \u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020/0\u001c2\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b1J&\u0010\"\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020/0\u001c2\u0006\u0010\b\u001a\u00020\tH\u0087\n¢\u0006\u0002\b2J+\u0010$\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020/0\u001c2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0&H\u0007¢\u0006\u0002\b3J,\u0010\"\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020/0\u001c2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0&H\u0087\n¢\u0006\u0002\b4J.\u0010)\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020/0\u001c2\u0006\u0010*\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b5J\u001d\u0010,\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020/0\u001cH\u0007¢\u0006\u0002\b6J\u0006\u0010:\u001a\u00020\u0010J\u0006\u0010;\u001a\u00020\u0012J\u0006\u0010?\u001a\u00020\u0010J\u0006\u0010@\u001a\u00020\u0012J\u0006\u0010G\u001a\u00020\u0010J\u0006\u0010H\u001a\u00020\u0012J\u0006\u0010L\u001a\u00020\u0010J\u0006\u0010M\u001a\u00020\u0012J\u0006\u0010T\u001a\u00020\u0010J\u0006\u0010U\u001a\u00020\u0012J\u0006\u0010Y\u001a\u00020\u0010J\u0006\u0010Z\u001a\u00020\u0012J\u0006\u0010^\u001a\u00020\u0010J\u0006\u0010_\u001a\u00020\u0012J\u0006\u0010e\u001a\u00020\u0010J\u0006\u0010f\u001a\u00020\u0012J\u0006\u0010j\u001a\u00020\u0010J\u0006\u0010k\u001a\u00020\u0012J\u0006\u0010o\u001a\u00020\u0010J\u0006\u0010p\u001a\u00020\u0012J\u0006\u0010t\u001a\u00020\u0010J\u0006\u0010u\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001d0\u001c8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020/0\u001c8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001fR$\u00107\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010\u0016\"\u0004\b9\u0010\u0018R$\u0010<\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010\f\"\u0004\b>\u0010\u000eR$\u0010B\u001a\u00020A2\u0006\u0010\b\u001a\u00020A8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010I\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010\u0016\"\u0004\bK\u0010\u0018R$\u0010O\u001a\u00020N2\u0006\u0010\b\u001a\u00020N8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010V\u001a\u00020N2\u0006\u0010\b\u001a\u00020N8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010Q\"\u0004\bX\u0010SR$\u0010[\u001a\u00020A2\u0006\u0010\b\u001a\u00020A8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010D\"\u0004\b]\u0010FR$\u0010`\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u0010g\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010b\"\u0004\bi\u0010dR$\u0010l\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bm\u0010b\"\u0004\bn\u0010dR$\u0010q\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\br\u0010\f\"\u0004\bs\u0010\u000e¨\u0006y"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder;", "<init>", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder;)V", "_build", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "value", "", "currentRadioAccessTechnology", "getCurrentRadioAccessTechnology", "()Ljava/lang/String;", "setCurrentRadioAccessTechnology", "(Ljava/lang/String;)V", "clearCurrentRadioAccessTechnology", "", "hasCurrentRadioAccessTechnology", "", "", "networkReachabilityFlags", "getNetworkReachabilityFlags", "()I", "setNetworkReachabilityFlags", "(I)V", "clearNetworkReachabilityFlags", "hasNetworkReachabilityFlags", "nwPathInterfaces", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl$NwPathInterfacesProxy;", "getNwPathInterfaces", "()Lcom/google/protobuf/kotlin/DslList;", "add", "addNwPathInterfaces", "plusAssign", "plusAssignNwPathInterfaces", "addAll", "values", "", "addAllNwPathInterfaces", "plusAssignAllNwPathInterfaces", "set", "index", "setNwPathInterfaces", "clear", "clearNwPathInterfaces", "localeList", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl$LocaleListProxy;", "getLocaleList", "addLocaleList", "plusAssignLocaleList", "addAllLocaleList", "plusAssignAllLocaleList", "setLocaleList", "clearLocaleList", "currentUiTheme", "getCurrentUiTheme", "setCurrentUiTheme", "clearCurrentUiTheme", "hasCurrentUiTheme", "deviceName", "getDeviceName", "setDeviceName", "clearDeviceName", "hasDeviceName", "", "volume", "getVolume", "()D", "setVolume", "(D)V", "clearVolume", "hasVolume", "trackingAuthStatus", "getTrackingAuthStatus", "setTrackingAuthStatus", "clearTrackingAuthStatus", "hasTrackingAuthStatus", "", "deviceUpTimeWithSleep", "getDeviceUpTimeWithSleep", "()J", "setDeviceUpTimeWithSleep", "(J)V", "clearDeviceUpTimeWithSleep", "hasDeviceUpTimeWithSleep", "deviceUpTimeWithoutSleep", "getDeviceUpTimeWithoutSleep", "setDeviceUpTimeWithoutSleep", "clearDeviceUpTimeWithoutSleep", "hasDeviceUpTimeWithoutSleep", U3.j.p0, "getScreenBrightness", "setScreenBrightness", "clearScreenBrightness", "hasScreenBrightness", "reduceMotionEnabled", "getReduceMotionEnabled", "()Z", "setReduceMotionEnabled", "(Z)V", "clearReduceMotionEnabled", "hasReduceMotionEnabled", "grayscaleEnabled", "getGrayscaleEnabled", "setGrayscaleEnabled", "clearGrayscaleEnabled", "hasGrayscaleEnabled", "invertColorsEnabled", "getInvertColorsEnabled", "setInvertColorsEnabled", "clearInvertColorsEnabled", "hasInvertColorsEnabled", "preferredContentSizeCategory", "getPreferredContentSizeCategory", "setPreferredContentSizeCategory", "clearPreferredContentSizeCategory", "hasPreferredContentSizeCategory", k.M, "NwPathInterfacesProxy", "LocaleListProxy", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder _builder;

            public /* synthetic */ Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder) {
                this._builder = builder;
            }

            /* compiled from: DynamicDeviceInfoKt.kt */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl;", "builder", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios _build() {
                DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios build = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                return build;
            }

            public final String getCurrentRadioAccessTechnology() {
                String currentRadioAccessTechnology = this._builder.getCurrentRadioAccessTechnology();
                Intrinsics.checkNotNullExpressionValue(currentRadioAccessTechnology, "getCurrentRadioAccessTechnology(...)");
                return currentRadioAccessTechnology;
            }

            public final void setCurrentRadioAccessTechnology(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setCurrentRadioAccessTechnology(value);
            }

            public final void clearCurrentRadioAccessTechnology() {
                this._builder.clearCurrentRadioAccessTechnology();
            }

            public final boolean hasCurrentRadioAccessTechnology() {
                return this._builder.hasCurrentRadioAccessTechnology();
            }

            public final int getNetworkReachabilityFlags() {
                return this._builder.getNetworkReachabilityFlags();
            }

            public final void setNetworkReachabilityFlags(int i) {
                this._builder.setNetworkReachabilityFlags(i);
            }

            public final void clearNetworkReachabilityFlags() {
                this._builder.clearNetworkReachabilityFlags();
            }

            public final boolean hasNetworkReachabilityFlags() {
                return this._builder.hasNetworkReachabilityFlags();
            }

            /* compiled from: DynamicDeviceInfoKt.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl$NwPathInterfacesProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class NwPathInterfacesProxy extends DslProxy {
                private NwPathInterfacesProxy() {
                }
            }

            public final DslList<String, NwPathInterfacesProxy> getNwPathInterfaces() {
                List<String> nwPathInterfacesList = this._builder.getNwPathInterfacesList();
                Intrinsics.checkNotNullExpressionValue(nwPathInterfacesList, "getNwPathInterfacesList(...)");
                return new DslList<>(nwPathInterfacesList);
            }

            public final /* synthetic */ void addNwPathInterfaces(DslList dslList, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.addNwPathInterfaces(value);
            }

            public final /* synthetic */ void plusAssignNwPathInterfaces(DslList<String, NwPathInterfacesProxy> dslList, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                addNwPathInterfaces(dslList, value);
            }

            public final /* synthetic */ void addAllNwPathInterfaces(DslList dslList, Iterable values) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                this._builder.addAllNwPathInterfaces(values);
            }

            public final /* synthetic */ void plusAssignAllNwPathInterfaces(DslList<String, NwPathInterfacesProxy> dslList, Iterable<String> values) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                addAllNwPathInterfaces(dslList, values);
            }

            public final /* synthetic */ void setNwPathInterfaces(DslList dslList, int i, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setNwPathInterfaces(i, value);
            }

            public final /* synthetic */ void clearNwPathInterfaces(DslList dslList) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                this._builder.clearNwPathInterfaces();
            }

            /* compiled from: DynamicDeviceInfoKt.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl$LocaleListProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class LocaleListProxy extends DslProxy {
                private LocaleListProxy() {
                }
            }

            public final DslList<String, LocaleListProxy> getLocaleList() {
                List<String> localeListList = this._builder.getLocaleListList();
                Intrinsics.checkNotNullExpressionValue(localeListList, "getLocaleListList(...)");
                return new DslList<>(localeListList);
            }

            public final /* synthetic */ void addLocaleList(DslList dslList, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.addLocaleList(value);
            }

            public final /* synthetic */ void plusAssignLocaleList(DslList<String, LocaleListProxy> dslList, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                addLocaleList(dslList, value);
            }

            public final /* synthetic */ void addAllLocaleList(DslList dslList, Iterable values) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                this._builder.addAllLocaleList(values);
            }

            public final /* synthetic */ void plusAssignAllLocaleList(DslList<String, LocaleListProxy> dslList, Iterable<String> values) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                addAllLocaleList(dslList, values);
            }

            public final /* synthetic */ void setLocaleList(DslList dslList, int i, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setLocaleList(i, value);
            }

            public final /* synthetic */ void clearLocaleList(DslList dslList) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                this._builder.clearLocaleList();
            }

            public final int getCurrentUiTheme() {
                return this._builder.getCurrentUiTheme();
            }

            public final void setCurrentUiTheme(int i) {
                this._builder.setCurrentUiTheme(i);
            }

            public final void clearCurrentUiTheme() {
                this._builder.clearCurrentUiTheme();
            }

            public final boolean hasCurrentUiTheme() {
                return this._builder.hasCurrentUiTheme();
            }

            public final String getDeviceName() {
                String deviceName = this._builder.getDeviceName();
                Intrinsics.checkNotNullExpressionValue(deviceName, "getDeviceName(...)");
                return deviceName;
            }

            public final void setDeviceName(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setDeviceName(value);
            }

            public final void clearDeviceName() {
                this._builder.clearDeviceName();
            }

            public final boolean hasDeviceName() {
                return this._builder.hasDeviceName();
            }

            public final double getVolume() {
                return this._builder.getVolume();
            }

            public final void setVolume(double d) {
                this._builder.setVolume(d);
            }

            public final void clearVolume() {
                this._builder.clearVolume();
            }

            public final boolean hasVolume() {
                return this._builder.hasVolume();
            }

            public final int getTrackingAuthStatus() {
                return this._builder.getTrackingAuthStatus();
            }

            public final void setTrackingAuthStatus(int i) {
                this._builder.setTrackingAuthStatus(i);
            }

            public final void clearTrackingAuthStatus() {
                this._builder.clearTrackingAuthStatus();
            }

            public final boolean hasTrackingAuthStatus() {
                return this._builder.hasTrackingAuthStatus();
            }

            public final long getDeviceUpTimeWithSleep() {
                return this._builder.getDeviceUpTimeWithSleep();
            }

            public final void setDeviceUpTimeWithSleep(long j) {
                this._builder.setDeviceUpTimeWithSleep(j);
            }

            public final void clearDeviceUpTimeWithSleep() {
                this._builder.clearDeviceUpTimeWithSleep();
            }

            public final boolean hasDeviceUpTimeWithSleep() {
                return this._builder.hasDeviceUpTimeWithSleep();
            }

            public final long getDeviceUpTimeWithoutSleep() {
                return this._builder.getDeviceUpTimeWithoutSleep();
            }

            public final void setDeviceUpTimeWithoutSleep(long j) {
                this._builder.setDeviceUpTimeWithoutSleep(j);
            }

            public final void clearDeviceUpTimeWithoutSleep() {
                this._builder.clearDeviceUpTimeWithoutSleep();
            }

            public final boolean hasDeviceUpTimeWithoutSleep() {
                return this._builder.hasDeviceUpTimeWithoutSleep();
            }

            public final double getScreenBrightness() {
                return this._builder.getScreenBrightness();
            }

            public final void setScreenBrightness(double d) {
                this._builder.setScreenBrightness(d);
            }

            public final void clearScreenBrightness() {
                this._builder.clearScreenBrightness();
            }

            public final boolean hasScreenBrightness() {
                return this._builder.hasScreenBrightness();
            }

            public final boolean getReduceMotionEnabled() {
                return this._builder.getReduceMotionEnabled();
            }

            public final void setReduceMotionEnabled(boolean z) {
                this._builder.setReduceMotionEnabled(z);
            }

            public final void clearReduceMotionEnabled() {
                this._builder.clearReduceMotionEnabled();
            }

            public final boolean hasReduceMotionEnabled() {
                return this._builder.hasReduceMotionEnabled();
            }

            public final boolean getGrayscaleEnabled() {
                return this._builder.getGrayscaleEnabled();
            }

            public final void setGrayscaleEnabled(boolean z) {
                this._builder.setGrayscaleEnabled(z);
            }

            public final void clearGrayscaleEnabled() {
                this._builder.clearGrayscaleEnabled();
            }

            public final boolean hasGrayscaleEnabled() {
                return this._builder.hasGrayscaleEnabled();
            }

            public final boolean getInvertColorsEnabled() {
                return this._builder.getInvertColorsEnabled();
            }

            public final void setInvertColorsEnabled(boolean z) {
                this._builder.setInvertColorsEnabled(z);
            }

            public final void clearInvertColorsEnabled() {
                this._builder.clearInvertColorsEnabled();
            }

            public final boolean hasInvertColorsEnabled() {
                return this._builder.hasInvertColorsEnabled();
            }

            public final String getPreferredContentSizeCategory() {
                String preferredContentSizeCategory = this._builder.getPreferredContentSizeCategory();
                Intrinsics.checkNotNullExpressionValue(preferredContentSizeCategory, "getPreferredContentSizeCategory(...)");
                return preferredContentSizeCategory;
            }

            public final void setPreferredContentSizeCategory(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setPreferredContentSizeCategory(value);
            }

            public final void clearPreferredContentSizeCategory() {
                this._builder.clearPreferredContentSizeCategory();
            }

            public final boolean hasPreferredContentSizeCategory() {
                return this._builder.hasPreferredContentSizeCategory();
            }
        }
    }

    /* renamed from: -initializeweb, reason: not valid java name */
    public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web m7815initializeweb(Function1<? super WebKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        WebKt.Dsl.Companion companion = WebKt.Dsl.INSTANCE;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web.Builder newBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        WebKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    /* compiled from: DynamicDeviceInfoKt.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$WebKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WebKt {
        public static final WebKt INSTANCE = new WebKt();

        private WebKt() {
        }

        /* compiled from: DynamicDeviceInfoKt.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001a\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010!\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0012J\u0006\u0010(\u001a\u00020\u0010J\u0006\u0010)\u001a\u00020\u0012J\u0006\u0010-\u001a\u00020\u0010J\u0006\u0010.\u001a\u00020\u0012J\u0006\u00102\u001a\u00020\u0010J\u0006\u00103\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010#\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010*\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010\u0018R$\u0010/\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010%\"\u0004\b1\u0010'¨\u00065"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$WebKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web$Builder;", "<init>", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web$Builder;)V", "_build", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web;", "value", "", "networkDownlink", "getNetworkDownlink", "()D", "setNetworkDownlink", "(D)V", "clearNetworkDownlink", "", "hasNetworkDownlink", "", "", "networkEffectiveType", "getNetworkEffectiveType", "()Ljava/lang/String;", "setNetworkEffectiveType", "(Ljava/lang/String;)V", "clearNetworkEffectiveType", "hasNetworkEffectiveType", "", "networkRtt", "getNetworkRtt", "()I", "setNetworkRtt", "(I)V", "clearNetworkRtt", "hasNetworkRtt", "networkSaveData", "getNetworkSaveData", "()Z", "setNetworkSaveData", "(Z)V", "clearNetworkSaveData", "hasNetworkSaveData", "prefersColorScheme", "getPrefersColorScheme", "setPrefersColorScheme", "clearPrefersColorScheme", "hasPrefersColorScheme", "prefersReducedMotion", "getPrefersReducedMotion", "setPrefersReducedMotion", "clearPrefersReducedMotion", "hasPrefersReducedMotion", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web.Builder _builder;

            public /* synthetic */ Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web.Builder builder) {
                this._builder = builder;
            }

            /* compiled from: DynamicDeviceInfoKt.kt */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$WebKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$WebKt$Dsl;", "builder", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Web$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web _build() {
                DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web build = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                return build;
            }

            public final double getNetworkDownlink() {
                return this._builder.getNetworkDownlink();
            }

            public final void setNetworkDownlink(double d) {
                this._builder.setNetworkDownlink(d);
            }

            public final void clearNetworkDownlink() {
                this._builder.clearNetworkDownlink();
            }

            public final boolean hasNetworkDownlink() {
                return this._builder.hasNetworkDownlink();
            }

            public final String getNetworkEffectiveType() {
                String networkEffectiveType = this._builder.getNetworkEffectiveType();
                Intrinsics.checkNotNullExpressionValue(networkEffectiveType, "getNetworkEffectiveType(...)");
                return networkEffectiveType;
            }

            public final void setNetworkEffectiveType(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setNetworkEffectiveType(value);
            }

            public final void clearNetworkEffectiveType() {
                this._builder.clearNetworkEffectiveType();
            }

            public final boolean hasNetworkEffectiveType() {
                return this._builder.hasNetworkEffectiveType();
            }

            public final int getNetworkRtt() {
                return this._builder.getNetworkRtt();
            }

            public final void setNetworkRtt(int i) {
                this._builder.setNetworkRtt(i);
            }

            public final void clearNetworkRtt() {
                this._builder.clearNetworkRtt();
            }

            public final boolean hasNetworkRtt() {
                return this._builder.hasNetworkRtt();
            }

            public final boolean getNetworkSaveData() {
                return this._builder.getNetworkSaveData();
            }

            public final void setNetworkSaveData(boolean z) {
                this._builder.setNetworkSaveData(z);
            }

            public final void clearNetworkSaveData() {
                this._builder.clearNetworkSaveData();
            }

            public final boolean hasNetworkSaveData() {
                return this._builder.hasNetworkSaveData();
            }

            public final String getPrefersColorScheme() {
                String prefersColorScheme = this._builder.getPrefersColorScheme();
                Intrinsics.checkNotNullExpressionValue(prefersColorScheme, "getPrefersColorScheme(...)");
                return prefersColorScheme;
            }

            public final void setPrefersColorScheme(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setPrefersColorScheme(value);
            }

            public final void clearPrefersColorScheme() {
                this._builder.clearPrefersColorScheme();
            }

            public final boolean hasPrefersColorScheme() {
                return this._builder.hasPrefersColorScheme();
            }

            public final boolean getPrefersReducedMotion() {
                return this._builder.getPrefersReducedMotion();
            }

            public final void setPrefersReducedMotion(boolean z) {
                this._builder.setPrefersReducedMotion(z);
            }

            public final void clearPrefersReducedMotion() {
                this._builder.clearPrefersReducedMotion();
            }

            public final boolean hasPrefersReducedMotion() {
                return this._builder.hasPrefersReducedMotion();
            }
        }
    }
}
