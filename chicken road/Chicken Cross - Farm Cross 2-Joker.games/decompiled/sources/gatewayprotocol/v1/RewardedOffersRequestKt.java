package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import gatewayprotocol.v1.RewardedOffersRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardedOffersRequestKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/RewardedOffersRequestKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RewardedOffersRequestKt {
    public static final RewardedOffersRequestKt INSTANCE = new RewardedOffersRequestKt();

    private RewardedOffersRequestKt() {
    }

    /* compiled from: RewardedOffersRequestKt.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u001d\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lgatewayprotocol/v1/RewardedOffersRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/RewardedOffersRequestOuterClass$RewardedOffersRequest$Builder;", "<init>", "(Lgatewayprotocol/v1/RewardedOffersRequestOuterClass$RewardedOffersRequest$Builder;)V", "_build", "Lgatewayprotocol/v1/RewardedOffersRequestOuterClass$RewardedOffersRequest;", "value", "Lgatewayprotocol/v1/RewardedOffersRequestOuterClass$RewardedOffersEntryPoint;", "entryPoint", "getEntryPoint", "()Lgatewayprotocol/v1/RewardedOffersRequestOuterClass$RewardedOffersEntryPoint;", "setEntryPoint", "(Lgatewayprotocol/v1/RewardedOffersRequestOuterClass$RewardedOffersEntryPoint;)V", "", "entryPointValue", "getEntryPointValue", "()I", "setEntryPointValue", "(I)V", "clearEntryPoint", "", "Lcom/google/protobuf/ByteString;", "cursor", "getCursor", "()Lcom/google/protobuf/ByteString;", "setCursor", "(Lcom/google/protobuf/ByteString;)V", "clearCursor", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final RewardedOffersRequestOuterClass.RewardedOffersRequest.Builder _builder;

        public /* synthetic */ Dsl(RewardedOffersRequestOuterClass.RewardedOffersRequest.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(RewardedOffersRequestOuterClass.RewardedOffersRequest.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: RewardedOffersRequestKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/RewardedOffersRequestKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/RewardedOffersRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/RewardedOffersRequestOuterClass$RewardedOffersRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(RewardedOffersRequestOuterClass.RewardedOffersRequest.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ RewardedOffersRequestOuterClass.RewardedOffersRequest _build() {
            RewardedOffersRequestOuterClass.RewardedOffersRequest build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final RewardedOffersRequestOuterClass.RewardedOffersEntryPoint getEntryPoint() {
            RewardedOffersRequestOuterClass.RewardedOffersEntryPoint entryPoint = this._builder.getEntryPoint();
            Intrinsics.checkNotNullExpressionValue(entryPoint, "getEntryPoint(...)");
            return entryPoint;
        }

        public final void setEntryPoint(RewardedOffersRequestOuterClass.RewardedOffersEntryPoint value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setEntryPoint(value);
        }

        public final int getEntryPointValue() {
            return this._builder.getEntryPointValue();
        }

        public final void setEntryPointValue(int i) {
            this._builder.setEntryPointValue(i);
        }

        public final void clearEntryPoint() {
            this._builder.clearEntryPoint();
        }

        public final ByteString getCursor() {
            ByteString cursor = this._builder.getCursor();
            Intrinsics.checkNotNullExpressionValue(cursor, "getCursor(...)");
            return cursor;
        }

        public final void setCursor(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCursor(value);
        }

        public final void clearCursor() {
            this._builder.clearCursor();
        }
    }
}
