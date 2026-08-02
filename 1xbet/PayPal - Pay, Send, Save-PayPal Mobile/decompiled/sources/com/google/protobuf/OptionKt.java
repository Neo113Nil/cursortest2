package com.google.protobuf;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/protobuf/OptionKt;", "", "<init>", "()V", "Dsl"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OptionKt {
    public static final com.google.protobuf.OptionKt INSTANCE = new com.google.protobuf.OptionKt();

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0012\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/google/protobuf/OptionKt$Dsl;", "", "Lcom/google/protobuf/Option$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/Option$Builder;)V", "Lcom/google/protobuf/Option;", "_build", "()Lcom/google/protobuf/Option;", "", "clearName", "()V", "clearValue", "", "hasValue", "()Z", "Lcom/google/protobuf/Option$Builder;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "Lcom/google/protobuf/Any;", "getValue", "()Lcom/google/protobuf/Any;", "setValue", "(Lcom/google/protobuf/Any;)V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.google.protobuf.OptionKt.Dsl.Companion INSTANCE = new com.google.protobuf.OptionKt.Dsl.Companion(null);
        private final com.google.protobuf.Option.Builder _builder;

        private Dsl(com.google.protobuf.Option.Builder builder) {
            this._builder = builder;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/google/protobuf/OptionKt$Dsl$Companion;", "", "<init>", "()V", "Lcom/google/protobuf/Option$Builder;", "builder", "Lcom/google/protobuf/OptionKt$Dsl;", "_create", "(Lcom/google/protobuf/Option$Builder;)Lcom/google/protobuf/OptionKt$Dsl;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final /* synthetic */ com.google.protobuf.OptionKt.Dsl _create(com.google.protobuf.Option.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                return new com.google.protobuf.OptionKt.Dsl(builder, null);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final /* synthetic */ com.google.protobuf.Option _build() {
            com.google.protobuf.Option build = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            return build;
        }

        public final java.lang.String getName() {
            java.lang.String name2 = this._builder.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            return name2;
        }

        public final void setName(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this._builder.setName(str);
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final com.google.protobuf.Any getValue() {
            com.google.protobuf.Any value = this._builder.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
            return value;
        }

        public final void setValue(com.google.protobuf.Any any) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(any, "");
            this._builder.setValue(any);
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final boolean hasValue() {
            return this._builder.hasValue();
        }

        public /* synthetic */ Dsl(com.google.protobuf.Option.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }

    private OptionKt() {
    }
}
