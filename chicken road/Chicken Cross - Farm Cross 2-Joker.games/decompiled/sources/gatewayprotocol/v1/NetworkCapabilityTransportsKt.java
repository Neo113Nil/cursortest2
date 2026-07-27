package gatewayprotocol.v1;

import com.ironsource.Q3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkCapabilityTransportsKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/NetworkCapabilityTransportsKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetworkCapabilityTransportsKt {
    public static final NetworkCapabilityTransportsKt INSTANCE = new NetworkCapabilityTransportsKt();

    private NetworkCapabilityTransportsKt() {
    }

    /* compiled from: NetworkCapabilityTransportsKt.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b0\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\tJ\u0006\u0010\u0015\u001a\u00020\u0010J\u0006\u0010\u0016\u001a\u00020\tJ\u0006\u0010\u001a\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\tJ\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010 \u001a\u00020\tJ\u0006\u0010$\u001a\u00020\u0010J\u0006\u0010%\u001a\u00020\tJ\u0006\u0010)\u001a\u00020\u0010J\u0006\u0010*\u001a\u00020\tJ\u0006\u0010.\u001a\u00020\u0010J\u0006\u0010/\u001a\u00020\tJ\u0006\u00103\u001a\u00020\u0010J\u0006\u00104\u001a\u00020\tJ\u0006\u00108\u001a\u00020\u0010J\u0006\u00109\u001a\u00020\tJ\u0006\u0010=\u001a\u00020\u0010J\u0006\u0010>\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR$\u0010\u0017\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR$\u0010\u001c\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR$\u0010!\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR$\u0010&\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010\u000eR$\u0010+\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010\f\"\u0004\b-\u0010\u000eR$\u00100\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\f\"\u0004\b2\u0010\u000eR$\u00105\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010\f\"\u0004\b7\u0010\u000eR$\u0010:\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010\f\"\u0004\b<\u0010\u000e¨\u0006@"}, d2 = {"Lgatewayprotocol/v1/NetworkCapabilityTransportsKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder;", "<init>", "(Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder;)V", "_build", "Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "value", "", Q3.d, "getBluetooth", "()Z", "setBluetooth", "(Z)V", "clearBluetooth", "", "hasBluetooth", Q3.g, "getCellular", "setCellular", "clearCellular", "hasCellular", Q3.e, "getEthernet", "setEthernet", "clearEthernet", "hasEthernet", Q3.i, "getLowpan", "setLowpan", "clearLowpan", "hasLowpan", "satellite", "getSatellite", "setSatellite", "clearSatellite", "hasSatellite", "thread", "getThread", "setThread", "clearThread", "hasThread", "usb", "getUsb", "setUsb", "clearUsb", "hasUsb", "vpn", "getVpn", "setVpn", "clearVpn", "hasVpn", Q3.b, "getWifi", "setWifi", "clearWifi", "hasWifi", Q3.h, "getWifiAware", "setWifiAware", "clearWifiAware", "hasWifiAware", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder _builder;

        public /* synthetic */ Dsl(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: NetworkCapabilityTransportsKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/NetworkCapabilityTransportsKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/NetworkCapabilityTransportsKt$Dsl;", "builder", "Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports _build() {
            NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final boolean getBluetooth() {
            return this._builder.getBluetooth();
        }

        public final void setBluetooth(boolean z) {
            this._builder.setBluetooth(z);
        }

        public final void clearBluetooth() {
            this._builder.clearBluetooth();
        }

        public final boolean hasBluetooth() {
            return this._builder.hasBluetooth();
        }

        public final boolean getCellular() {
            return this._builder.getCellular();
        }

        public final void setCellular(boolean z) {
            this._builder.setCellular(z);
        }

        public final void clearCellular() {
            this._builder.clearCellular();
        }

        public final boolean hasCellular() {
            return this._builder.hasCellular();
        }

        public final boolean getEthernet() {
            return this._builder.getEthernet();
        }

        public final void setEthernet(boolean z) {
            this._builder.setEthernet(z);
        }

        public final void clearEthernet() {
            this._builder.clearEthernet();
        }

        public final boolean hasEthernet() {
            return this._builder.hasEthernet();
        }

        public final boolean getLowpan() {
            return this._builder.getLowpan();
        }

        public final void setLowpan(boolean z) {
            this._builder.setLowpan(z);
        }

        public final void clearLowpan() {
            this._builder.clearLowpan();
        }

        public final boolean hasLowpan() {
            return this._builder.hasLowpan();
        }

        public final boolean getSatellite() {
            return this._builder.getSatellite();
        }

        public final void setSatellite(boolean z) {
            this._builder.setSatellite(z);
        }

        public final void clearSatellite() {
            this._builder.clearSatellite();
        }

        public final boolean hasSatellite() {
            return this._builder.hasSatellite();
        }

        public final boolean getThread() {
            return this._builder.getThread();
        }

        public final void setThread(boolean z) {
            this._builder.setThread(z);
        }

        public final void clearThread() {
            this._builder.clearThread();
        }

        public final boolean hasThread() {
            return this._builder.hasThread();
        }

        public final boolean getUsb() {
            return this._builder.getUsb();
        }

        public final void setUsb(boolean z) {
            this._builder.setUsb(z);
        }

        public final void clearUsb() {
            this._builder.clearUsb();
        }

        public final boolean hasUsb() {
            return this._builder.hasUsb();
        }

        public final boolean getVpn() {
            return this._builder.getVpn();
        }

        public final void setVpn(boolean z) {
            this._builder.setVpn(z);
        }

        public final void clearVpn() {
            this._builder.clearVpn();
        }

        public final boolean hasVpn() {
            return this._builder.hasVpn();
        }

        public final boolean getWifi() {
            return this._builder.getWifi();
        }

        public final void setWifi(boolean z) {
            this._builder.setWifi(z);
        }

        public final void clearWifi() {
            this._builder.clearWifi();
        }

        public final boolean hasWifi() {
            return this._builder.hasWifi();
        }

        public final boolean getWifiAware() {
            return this._builder.getWifiAware();
        }

        public final void setWifiAware(boolean z) {
            this._builder.setWifiAware(z);
        }

        public final void clearWifiAware() {
            this._builder.clearWifiAware();
        }

        public final boolean hasWifiAware() {
            return this._builder.hasWifiAware();
        }
    }
}
