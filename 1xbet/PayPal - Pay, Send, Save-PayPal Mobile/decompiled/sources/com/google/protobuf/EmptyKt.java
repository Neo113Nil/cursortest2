package com.google.protobuf;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/protobuf/EmptyKt;", "", "<init>", "()V", "Dsl"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class EmptyKt {
    public static final com.google.protobuf.EmptyKt INSTANCE = new com.google.protobuf.EmptyKt();

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t"}, d2 = {"Lcom/google/protobuf/EmptyKt$Dsl;", "", "Lcom/google/protobuf/Empty$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/Empty$Builder;)V", "Lcom/google/protobuf/Empty;", "_build", "()Lcom/google/protobuf/Empty;", "Lcom/google/protobuf/Empty$Builder;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.google.protobuf.EmptyKt.Dsl.Companion INSTANCE = new com.google.protobuf.EmptyKt.Dsl.Companion(null);
        private final com.google.protobuf.Empty.Builder _builder;

        private Dsl(com.google.protobuf.Empty.Builder builder) {
            this._builder = builder;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/google/protobuf/EmptyKt$Dsl$Companion;", "", "<init>", "()V", "Lcom/google/protobuf/Empty$Builder;", "builder", "Lcom/google/protobuf/EmptyKt$Dsl;", "_create", "(Lcom/google/protobuf/Empty$Builder;)Lcom/google/protobuf/EmptyKt$Dsl;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final /* synthetic */ com.google.protobuf.EmptyKt.Dsl _create(com.google.protobuf.Empty.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                return new com.google.protobuf.EmptyKt.Dsl(builder, null);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final /* synthetic */ com.google.protobuf.Empty _build() {
            com.google.protobuf.Empty build = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            return build;
        }

        public /* synthetic */ Dsl(com.google.protobuf.Empty.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }

    private EmptyKt() {
    }
}
