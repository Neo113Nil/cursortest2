package com.google.protobuf;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/protobuf/BoolValueKt;", "", "<init>", "()V", "Dsl"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BoolValueKt {
    public static final com.google.protobuf.BoolValueKt INSTANCE = new com.google.protobuf.BoolValueKt();

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/google/protobuf/BoolValueKt$Dsl;", "", "Lcom/google/protobuf/BoolValue$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/BoolValue$Builder;)V", "Lcom/google/protobuf/BoolValue;", "_build", "()Lcom/google/protobuf/BoolValue;", "", "clearValue", "()V", "Lcom/google/protobuf/BoolValue$Builder;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getValue", "()Z", "setValue", "(Z)V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.google.protobuf.BoolValueKt.Dsl.Companion INSTANCE = new com.google.protobuf.BoolValueKt.Dsl.Companion(null);
        private final com.google.protobuf.BoolValue.Builder _builder;

        private Dsl(com.google.protobuf.BoolValue.Builder builder) {
            this._builder = builder;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/google/protobuf/BoolValueKt$Dsl$Companion;", "", "<init>", "()V", "Lcom/google/protobuf/BoolValue$Builder;", "builder", "Lcom/google/protobuf/BoolValueKt$Dsl;", "_create", "(Lcom/google/protobuf/BoolValue$Builder;)Lcom/google/protobuf/BoolValueKt$Dsl;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final /* synthetic */ com.google.protobuf.BoolValueKt.Dsl _create(com.google.protobuf.BoolValue.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                return new com.google.protobuf.BoolValueKt.Dsl(builder, null);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final /* synthetic */ com.google.protobuf.BoolValue _build() {
            com.google.protobuf.BoolValue build = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            return build;
        }

        public final boolean getValue() {
            return this._builder.getValue();
        }

        public final void setValue(boolean z) {
            this._builder.setValue(z);
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public /* synthetic */ Dsl(com.google.protobuf.BoolValue.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }

    private BoolValueKt() {
    }
}
