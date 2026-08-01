package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import gatewayprotocol.v1.AudienceManagementResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AudienceManagementResponseKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/AudienceManagementResponseKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AudienceManagementResponseKt {
    public static final AudienceManagementResponseKt INSTANCE = new AudienceManagementResponseKt();

    private AudienceManagementResponseKt() {
    }

    /* compiled from: AudienceManagementResponseKt.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u0011*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lgatewayprotocol/v1/AudienceManagementResponseKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse$Builder;", "<init>", "(Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse$Builder;)V", "_build", "Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse;", "value", "Lcom/google/protobuf/ByteString;", "audienceManagementData", "getAudienceManagementData", "()Lcom/google/protobuf/ByteString;", "setAudienceManagementData", "(Lcom/google/protobuf/ByteString;)V", "clearAudienceManagementData", "", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "error", "getError", "()Lgatewayprotocol/v1/ErrorOuterClass$Error;", "setError", "(Lgatewayprotocol/v1/ErrorOuterClass$Error;)V", "clearError", "hasError", "", "errorOrNull", "getErrorOrNull", "(Lgatewayprotocol/v1/AudienceManagementResponseKt$Dsl;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder _builder;

        public /* synthetic */ Dsl(AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: AudienceManagementResponseKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/AudienceManagementResponseKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/AudienceManagementResponseKt$Dsl;", "builder", "Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ AudienceManagementResponseOuterClass.AudienceManagementResponse _build() {
            AudienceManagementResponseOuterClass.AudienceManagementResponse build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final ByteString getAudienceManagementData() {
            ByteString audienceManagementData = this._builder.getAudienceManagementData();
            Intrinsics.checkNotNullExpressionValue(audienceManagementData, "getAudienceManagementData(...)");
            return audienceManagementData;
        }

        public final void setAudienceManagementData(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAudienceManagementData(value);
        }

        public final void clearAudienceManagementData() {
            this._builder.clearAudienceManagementData();
        }

        public final ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this._builder.getError();
            Intrinsics.checkNotNullExpressionValue(error, "getError(...)");
            return error;
        }

        public final void setError(ErrorOuterClass.Error value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setError(value);
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final ErrorOuterClass.Error getErrorOrNull(Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return AudienceManagementResponseKtKt.getErrorOrNull(dsl._builder);
        }
    }
}
