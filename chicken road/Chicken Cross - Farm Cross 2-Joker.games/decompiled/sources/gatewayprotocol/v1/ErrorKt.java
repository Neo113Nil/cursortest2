package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/ErrorKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ErrorKt {
    public static final ErrorKt INSTANCE = new ErrorKt();

    private ErrorKt() {
    }

    /* compiled from: ErrorKt.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u001d\u001a\u00020\u0010J\u0006\u0010$\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lgatewayprotocol/v1/ErrorKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/ErrorOuterClass$Error$Builder;", "<init>", "(Lgatewayprotocol/v1/ErrorOuterClass$Error$Builder;)V", "_build", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "value", "", "errorText", "getErrorText", "()Ljava/lang/String;", "setErrorText", "(Ljava/lang/String;)V", "clearErrorText", "", "Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;", IronSourceConstants.EVENTS_ERROR_CODE, "getErrorCode", "()Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;", "setErrorCode", "(Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;)V", "", "errorCodeValue", "getErrorCodeValue", "()I", "setErrorCodeValue", "(I)V", "clearErrorCode", "Lcom/google/protobuf/ByteString;", "errorToken", "getErrorToken", "()Lcom/google/protobuf/ByteString;", "setErrorToken", "(Lcom/google/protobuf/ByteString;)V", "clearErrorToken", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ErrorOuterClass.Error.Builder _builder;

        public /* synthetic */ Dsl(ErrorOuterClass.Error.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(ErrorOuterClass.Error.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: ErrorKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/ErrorKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/ErrorKt$Dsl;", "builder", "Lgatewayprotocol/v1/ErrorOuterClass$Error$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(ErrorOuterClass.Error.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ ErrorOuterClass.Error _build() {
            ErrorOuterClass.Error build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final String getErrorText() {
            String errorText = this._builder.getErrorText();
            Intrinsics.checkNotNullExpressionValue(errorText, "getErrorText(...)");
            return errorText;
        }

        public final void setErrorText(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setErrorText(value);
        }

        public final void clearErrorText() {
            this._builder.clearErrorText();
        }

        public final ErrorOuterClass.PublicErrorCode getErrorCode() {
            ErrorOuterClass.PublicErrorCode errorCode = this._builder.getErrorCode();
            Intrinsics.checkNotNullExpressionValue(errorCode, "getErrorCode(...)");
            return errorCode;
        }

        public final void setErrorCode(ErrorOuterClass.PublicErrorCode value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setErrorCode(value);
        }

        public final int getErrorCodeValue() {
            return this._builder.getErrorCodeValue();
        }

        public final void setErrorCodeValue(int i) {
            this._builder.setErrorCodeValue(i);
        }

        public final void clearErrorCode() {
            this._builder.clearErrorCode();
        }

        public final ByteString getErrorToken() {
            ByteString errorToken = this._builder.getErrorToken();
            Intrinsics.checkNotNullExpressionValue(errorToken, "getErrorToken(...)");
            return errorToken;
        }

        public final void setErrorToken(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setErrorToken(value);
        }

        public final void clearErrorToken() {
            this._builder.clearErrorToken();
        }
    }
}
