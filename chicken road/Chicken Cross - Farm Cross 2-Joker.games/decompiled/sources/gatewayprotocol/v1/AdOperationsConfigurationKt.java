package gatewayprotocol.v1;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdOperationsConfigurationKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/AdOperationsConfigurationKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdOperationsConfigurationKt {
    public static final AdOperationsConfigurationKt INSTANCE = new AdOperationsConfigurationKt();

    private AdOperationsConfigurationKt() {
    }

    /* compiled from: AdOperationsConfigurationKt.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e¨\u0006\u001a"}, d2 = {"Lgatewayprotocol/v1/AdOperationsConfigurationKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration$Builder;", "<init>", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration$Builder;)V", "_build", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "value", "", "loadTimeoutMs", "getLoadTimeoutMs", "()I", "setLoadTimeoutMs", "(I)V", "clearLoadTimeoutMs", "", "showTimeoutMs", "getShowTimeoutMs", "setShowTimeoutMs", "clearShowTimeoutMs", "getTokenTimeoutMs", "getGetTokenTimeoutMs", "setGetTokenTimeoutMs", "clearGetTokenTimeoutMs", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final NativeConfigurationOuterClass.AdOperationsConfiguration.Builder _builder;

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: AdOperationsConfigurationKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/AdOperationsConfigurationKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/AdOperationsConfigurationKt$Dsl;", "builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ NativeConfigurationOuterClass.AdOperationsConfiguration _build() {
            NativeConfigurationOuterClass.AdOperationsConfiguration build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final int getLoadTimeoutMs() {
            return this._builder.getLoadTimeoutMs();
        }

        public final void setLoadTimeoutMs(int i) {
            this._builder.setLoadTimeoutMs(i);
        }

        public final void clearLoadTimeoutMs() {
            this._builder.clearLoadTimeoutMs();
        }

        public final int getShowTimeoutMs() {
            return this._builder.getShowTimeoutMs();
        }

        public final void setShowTimeoutMs(int i) {
            this._builder.setShowTimeoutMs(i);
        }

        public final void clearShowTimeoutMs() {
            this._builder.clearShowTimeoutMs();
        }

        public final int getGetTokenTimeoutMs() {
            return this._builder.getGetTokenTimeoutMs();
        }

        public final void setGetTokenTimeoutMs(int i) {
            this._builder.setGetTokenTimeoutMs(i);
        }

        public final void clearGetTokenTimeoutMs() {
            this._builder.clearGetTokenTimeoutMs();
        }
    }
}
