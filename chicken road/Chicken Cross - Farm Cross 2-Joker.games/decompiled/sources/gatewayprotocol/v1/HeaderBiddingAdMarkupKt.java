package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HeaderBiddingAdMarkupKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/HeaderBiddingAdMarkupKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HeaderBiddingAdMarkupKt {
    public static final HeaderBiddingAdMarkupKt INSTANCE = new HeaderBiddingAdMarkupKt();

    private HeaderBiddingAdMarkupKt() {
    }

    /* compiled from: HeaderBiddingAdMarkupKt.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001d"}, d2 = {"Lgatewayprotocol/v1/HeaderBiddingAdMarkupKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup$Builder;", "<init>", "(Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup$Builder;)V", "_build", "Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;", "value", "Lcom/google/protobuf/ByteString;", "adData", "getAdData", "()Lcom/google/protobuf/ByteString;", "setAdData", "(Lcom/google/protobuf/ByteString;)V", "clearAdData", "", "", "adDataVersion", "getAdDataVersion", "()I", "setAdDataVersion", "(I)V", "clearAdDataVersion", "configurationToken", "getConfigurationToken", "setConfigurationToken", "clearConfigurationToken", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder _builder;

        public /* synthetic */ Dsl(HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: HeaderBiddingAdMarkupKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/HeaderBiddingAdMarkupKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/HeaderBiddingAdMarkupKt$Dsl;", "builder", "Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup _build() {
            HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final ByteString getAdData() {
            ByteString adData = this._builder.getAdData();
            Intrinsics.checkNotNullExpressionValue(adData, "getAdData(...)");
            return adData;
        }

        public final void setAdData(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdData(value);
        }

        public final void clearAdData() {
            this._builder.clearAdData();
        }

        public final int getAdDataVersion() {
            return this._builder.getAdDataVersion();
        }

        public final void setAdDataVersion(int i) {
            this._builder.setAdDataVersion(i);
        }

        public final void clearAdDataVersion() {
            this._builder.clearAdDataVersion();
        }

        public final ByteString getConfigurationToken() {
            ByteString configurationToken = this._builder.getConfigurationToken();
            Intrinsics.checkNotNullExpressionValue(configurationToken, "getConfigurationToken(...)");
            return configurationToken;
        }

        public final void setConfigurationToken(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setConfigurationToken(value);
        }

        public final void clearConfigurationToken() {
            this._builder.clearConfigurationToken();
        }
    }
}
