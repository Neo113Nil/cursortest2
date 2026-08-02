package com.google.protobuf;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/protobuf/AnyKt;", "", "<init>", "()V", "Dsl"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AnyKt {
    public static final com.google.protobuf.AnyKt INSTANCE = new com.google.protobuf.AnyKt();

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u000f\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/google/protobuf/AnyKt$Dsl;", "", "Lcom/google/protobuf/Any$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/Any$Builder;)V", "Lcom/google/protobuf/Any;", "_build", "()Lcom/google/protobuf/Any;", "", "clearTypeUrl", "()V", "clearValue", "Lcom/google/protobuf/Any$Builder;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getTypeUrl", "()Ljava/lang/String;", "setTypeUrl", "(Ljava/lang/String;)V", "typeUrl", "Lcom/google/protobuf/ByteString;", "getValue", "()Lcom/google/protobuf/ByteString;", "setValue", "(Lcom/google/protobuf/ByteString;)V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.google.protobuf.AnyKt.Dsl.Companion INSTANCE = new com.google.protobuf.AnyKt.Dsl.Companion(null);
        private final com.google.protobuf.Any.Builder _builder;

        private Dsl(com.google.protobuf.Any.Builder builder) {
            this._builder = builder;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/google/protobuf/AnyKt$Dsl$Companion;", "", "<init>", "()V", "Lcom/google/protobuf/Any$Builder;", "builder", "Lcom/google/protobuf/AnyKt$Dsl;", "_create", "(Lcom/google/protobuf/Any$Builder;)Lcom/google/protobuf/AnyKt$Dsl;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final /* synthetic */ com.google.protobuf.AnyKt.Dsl _create(com.google.protobuf.Any.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                return new com.google.protobuf.AnyKt.Dsl(builder, null);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final /* synthetic */ com.google.protobuf.Any _build() {
            com.google.protobuf.Any build = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            return build;
        }

        public final java.lang.String getTypeUrl() {
            java.lang.String typeUrl = this._builder.getTypeUrl();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeUrl, "");
            return typeUrl;
        }

        public final void setTypeUrl(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this._builder.setTypeUrl(str);
        }

        public final void clearTypeUrl() {
            this._builder.clearTypeUrl();
        }

        public final com.google.protobuf.ByteString getValue() {
            com.google.protobuf.ByteString value = this._builder.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
            return value;
        }

        public final void setValue(com.google.protobuf.ByteString byteString) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
            this._builder.setValue(byteString);
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public /* synthetic */ Dsl(com.google.protobuf.Any.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }

    private AnyKt() {
    }
}
