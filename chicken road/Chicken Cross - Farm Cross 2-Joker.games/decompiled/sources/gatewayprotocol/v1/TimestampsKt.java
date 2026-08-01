package gatewayprotocol.v1;

import com.google.protobuf.Timestamp;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import gatewayprotocol.v1.TimestampsOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TimestampsKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/TimestampsKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TimestampsKt {
    public static final TimestampsKt INSTANCE = new TimestampsKt();

    private TimestampsKt() {
    }

    /* compiled from: TimestampsKt.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001d\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018¨\u0006\u001f"}, d2 = {"Lgatewayprotocol/v1/TimestampsKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps$Builder;", "<init>", "(Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps$Builder;)V", "_build", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "value", "Lcom/google/protobuf/Timestamp;", "timestamp", "getTimestamp", "()Lcom/google/protobuf/Timestamp;", "setTimestamp", "(Lcom/google/protobuf/Timestamp;)V", "clearTimestamp", "", "hasTimestamp", "", "", "sessionTimestamp", "getSessionTimestamp", "()J", "setSessionTimestamp", "(J)V", "clearSessionTimestamp", "sessionDurationInForeground", "getSessionDurationInForeground", "setSessionDurationInForeground", "clearSessionDurationInForeground", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final TimestampsOuterClass.Timestamps.Builder _builder;

        public /* synthetic */ Dsl(TimestampsOuterClass.Timestamps.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(TimestampsOuterClass.Timestamps.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: TimestampsKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/TimestampsKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/TimestampsKt$Dsl;", "builder", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(TimestampsOuterClass.Timestamps.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ TimestampsOuterClass.Timestamps _build() {
            TimestampsOuterClass.Timestamps build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final Timestamp getTimestamp() {
            Timestamp timestamp = this._builder.getTimestamp();
            Intrinsics.checkNotNullExpressionValue(timestamp, "getTimestamp(...)");
            return timestamp;
        }

        public final void setTimestamp(Timestamp value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTimestamp(value);
        }

        public final void clearTimestamp() {
            this._builder.clearTimestamp();
        }

        public final boolean hasTimestamp() {
            return this._builder.hasTimestamp();
        }

        public final long getSessionTimestamp() {
            return this._builder.getSessionTimestamp();
        }

        public final void setSessionTimestamp(long j) {
            this._builder.setSessionTimestamp(j);
        }

        public final void clearSessionTimestamp() {
            this._builder.clearSessionTimestamp();
        }

        public final long getSessionDurationInForeground() {
            return this._builder.getSessionDurationInForeground();
        }

        public final void setSessionDurationInForeground(long j) {
            this._builder.setSessionDurationInForeground(j);
        }

        public final void clearSessionDurationInForeground() {
            this._builder.clearSessionDurationInForeground();
        }
    }
}
