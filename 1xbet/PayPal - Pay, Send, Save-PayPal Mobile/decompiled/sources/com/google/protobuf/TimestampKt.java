package com.google.protobuf;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/protobuf/TimestampKt;", "", "<init>", "()V", "Dsl"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TimestampKt {
    public static final com.google.protobuf.TimestampKt INSTANCE = new com.google.protobuf.TimestampKt();

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/google/protobuf/TimestampKt$Dsl;", "", "Lcom/google/protobuf/Timestamp$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/Timestamp$Builder;)V", "Lcom/google/protobuf/Timestamp;", "_build", "()Lcom/google/protobuf/Timestamp;", "", "clearNanos", "()V", "clearSeconds", "Lcom/google/protobuf/Timestamp$Builder;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getNanos", "()I", "setNanos", "(I)V", "nanos", "", "getSeconds", "()J", "setSeconds", "(J)V", "seconds", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.google.protobuf.TimestampKt.Dsl.Companion INSTANCE = new com.google.protobuf.TimestampKt.Dsl.Companion(null);
        private final com.google.protobuf.Timestamp.Builder _builder;

        private Dsl(com.google.protobuf.Timestamp.Builder builder) {
            this._builder = builder;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/google/protobuf/TimestampKt$Dsl$Companion;", "", "<init>", "()V", "Lcom/google/protobuf/Timestamp$Builder;", "builder", "Lcom/google/protobuf/TimestampKt$Dsl;", "_create", "(Lcom/google/protobuf/Timestamp$Builder;)Lcom/google/protobuf/TimestampKt$Dsl;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final /* synthetic */ com.google.protobuf.TimestampKt.Dsl _create(com.google.protobuf.Timestamp.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                return new com.google.protobuf.TimestampKt.Dsl(builder, null);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final /* synthetic */ com.google.protobuf.Timestamp _build() {
            com.google.protobuf.Timestamp build = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            return build;
        }

        public final long getSeconds() {
            return this._builder.getSeconds();
        }

        public final void setSeconds(long j) {
            this._builder.setSeconds(j);
        }

        public final void clearSeconds() {
            this._builder.clearSeconds();
        }

        public final int getNanos() {
            return this._builder.getNanos();
        }

        public final void setNanos(int i) {
            this._builder.setNanos(i);
        }

        public final void clearNanos() {
            this._builder.clearNanos();
        }

        public /* synthetic */ Dsl(com.google.protobuf.Timestamp.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }

    private TimestampKt() {
    }
}
