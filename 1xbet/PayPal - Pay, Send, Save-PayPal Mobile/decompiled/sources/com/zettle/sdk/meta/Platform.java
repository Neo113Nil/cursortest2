package com.zettle.sdk.meta;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eR\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/meta/Platform;", "", "Lcom/zettle/sdk/meta/BluetoothInfo;", "getBluetooth", "()Lcom/zettle/sdk/meta/BluetoothInfo;", "bluetooth", "Lcom/zettle/sdk/meta/PlatformClock;", "getClock", "()Lcom/zettle/sdk/meta/PlatformClock;", "clock", "Lcom/zettle/sdk/meta/PlatformInfo;", "getInfo", "()Lcom/zettle/sdk/meta/PlatformInfo;", "info", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface Platform {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.meta.Platform.Companion INSTANCE = com.zettle.sdk.meta.Platform.Companion.getHighResolutionOutputSizeshNQ4ISI;

    com.zettle.sdk.meta.BluetoothInfo getBluetooth();

    com.zettle.sdk.meta.PlatformClock getClock();

    com.zettle.sdk.meta.PlatformInfo getInfo();

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/meta/Platform$Companion;", "Lcom/zettle/sdk/meta/Platform;", "<init>", "()V", "Lcom/zettle/sdk/meta/BluetoothInfo;", "getBluetooth", "()Lcom/zettle/sdk/meta/BluetoothInfo;", "bluetooth", "Lcom/zettle/sdk/meta/PlatformClock;", "getClock", "()Lcom/zettle/sdk/meta/PlatformClock;", "clock", "Lcom/zettle/sdk/meta/PlatformInfo;", "getInfo", "()Lcom/zettle/sdk/meta/PlatformInfo;", "info"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements com.zettle.sdk.meta.Platform {
        static final /* synthetic */ com.zettle.sdk.meta.Platform.Companion getHighResolutionOutputSizeshNQ4ISI = new com.zettle.sdk.meta.Platform.Companion();
        private final /* synthetic */ com.zettle.sdk.meta.PlatformImpl Camera2StreamConfigurationMap = new com.zettle.sdk.meta.PlatformImpl();

        private Companion() {
        }

        @Override // com.zettle.sdk.meta.Platform
        public final com.zettle.sdk.meta.PlatformInfo getInfo() {
            return this.Camera2StreamConfigurationMap.getInfo();
        }

        @Override // com.zettle.sdk.meta.Platform
        public final com.zettle.sdk.meta.PlatformClock getClock() {
            return this.Camera2StreamConfigurationMap.getClock();
        }

        @Override // com.zettle.sdk.meta.Platform
        public final com.zettle.sdk.meta.BluetoothInfo getBluetooth() {
            return this.Camera2StreamConfigurationMap.getBluetooth();
        }
    }
}
