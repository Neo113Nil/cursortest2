package gatewayprotocol.v1;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebugSettingsKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/DebugSettingsKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DebugSettingsKt {
    public static final DebugSettingsKt INSTANCE = new DebugSettingsKt();

    private DebugSettingsKt() {
    }

    /* compiled from: DebugSettingsKt.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e¨\u0006\u001a"}, d2 = {"Lgatewayprotocol/v1/DebugSettingsKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings$Builder;", "<init>", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings$Builder;)V", "_build", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;", "value", "", "webviewInspectable", "getWebviewInspectable", "()Z", "setWebviewInspectable", "(Z)V", "clearWebviewInspectable", "", "enableTracing", "getEnableTracing", "setEnableTracing", "clearEnableTracing", "cleanCache", "getCleanCache", "setCleanCache", "clearCleanCache", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final NativeConfigurationOuterClass.DebugSettings.Builder _builder;

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.DebugSettings.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(NativeConfigurationOuterClass.DebugSettings.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: DebugSettingsKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/DebugSettingsKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/DebugSettingsKt$Dsl;", "builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.DebugSettings.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ NativeConfigurationOuterClass.DebugSettings _build() {
            NativeConfigurationOuterClass.DebugSettings build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final boolean getWebviewInspectable() {
            return this._builder.getWebviewInspectable();
        }

        public final void setWebviewInspectable(boolean z) {
            this._builder.setWebviewInspectable(z);
        }

        public final void clearWebviewInspectable() {
            this._builder.clearWebviewInspectable();
        }

        public final boolean getEnableTracing() {
            return this._builder.getEnableTracing();
        }

        public final void setEnableTracing(boolean z) {
            this._builder.setEnableTracing(z);
        }

        public final void clearEnableTracing() {
            this._builder.clearEnableTracing();
        }

        public final boolean getCleanCache() {
            return this._builder.getCleanCache();
        }

        public final void setCleanCache(boolean z) {
            this._builder.setCleanCache(z);
        }

        public final void clearCleanCache() {
            this._builder.clearCleanCache();
        }
    }
}
