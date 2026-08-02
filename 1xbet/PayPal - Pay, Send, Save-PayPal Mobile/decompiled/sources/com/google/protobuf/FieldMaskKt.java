package com.google.protobuf;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/protobuf/FieldMaskKt;", "", "<init>", "()V", "Dsl"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FieldMaskKt {
    public static final com.google.protobuf.FieldMaskKt INSTANCE = new com.google.protobuf.FieldMaskKt();

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0002 !B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u0016\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\nH\u0086\n¢\u0006\u0004\b\u0016\u0010\u000fJ.\u0010\u0017\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0086\n¢\u0006\u0004\b\u0017\u0010\u0013J0\u0010\u001a\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u001d\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/google/protobuf/FieldMaskKt$Dsl;", "", "Lcom/google/protobuf/FieldMask$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/FieldMask$Builder;)V", "Lcom/google/protobuf/FieldMask;", "_build", "()Lcom/google/protobuf/FieldMask;", "Lcom/google/protobuf/kotlin/DslList;", "", "Lcom/google/protobuf/FieldMaskKt$Dsl$PathsProxy;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "addPaths", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/String;)V", "", "values", "addAllPaths", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "clearPaths", "(Lcom/google/protobuf/kotlin/DslList;)V", "plusAssignPaths", "plusAssignAllPaths", "", "index", "setPaths", "(Lcom/google/protobuf/kotlin/DslList;ILjava/lang/String;)V", "Lcom/google/protobuf/FieldMask$Builder;", "getPaths", "()Lcom/google/protobuf/kotlin/DslList;", "paths", "Companion", "PathsProxy"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.google.protobuf.FieldMaskKt.Dsl.Companion INSTANCE = new com.google.protobuf.FieldMaskKt.Dsl.Companion(null);
        private final com.google.protobuf.FieldMask.Builder _builder;

        private Dsl(com.google.protobuf.FieldMask.Builder builder) {
            this._builder = builder;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/google/protobuf/FieldMaskKt$Dsl$Companion;", "", "<init>", "()V", "Lcom/google/protobuf/FieldMask$Builder;", "builder", "Lcom/google/protobuf/FieldMaskKt$Dsl;", "_create", "(Lcom/google/protobuf/FieldMask$Builder;)Lcom/google/protobuf/FieldMaskKt$Dsl;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final /* synthetic */ com.google.protobuf.FieldMaskKt.Dsl _create(com.google.protobuf.FieldMask.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                return new com.google.protobuf.FieldMaskKt.Dsl(builder, null);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final /* synthetic */ com.google.protobuf.FieldMask _build() {
            com.google.protobuf.FieldMask build = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            return build;
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/protobuf/FieldMaskKt$Dsl$PathsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class PathsProxy extends com.google.protobuf.kotlin.DslProxy {
            private PathsProxy() {
            }
        }

        public final com.google.protobuf.kotlin.DslList<java.lang.String, com.google.protobuf.FieldMaskKt.Dsl.PathsProxy> getPaths() {
            java.util.List<java.lang.String> pathsList = this._builder.getPathsList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathsList, "");
            return new com.google.protobuf.kotlin.DslList<>(pathsList);
        }

        public final /* synthetic */ void addPaths(com.google.protobuf.kotlin.DslList dslList, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this._builder.addPaths(str);
        }

        public final /* synthetic */ void plusAssignPaths(com.google.protobuf.kotlin.DslList<java.lang.String, com.google.protobuf.FieldMaskKt.Dsl.PathsProxy> dslList, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            addPaths(dslList, str);
        }

        public final /* synthetic */ void addAllPaths(com.google.protobuf.kotlin.DslList dslList, java.lang.Iterable iterable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
            this._builder.addAllPaths(iterable);
        }

        public final /* synthetic */ void plusAssignAllPaths(com.google.protobuf.kotlin.DslList<java.lang.String, com.google.protobuf.FieldMaskKt.Dsl.PathsProxy> dslList, java.lang.Iterable<java.lang.String> iterable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
            addAllPaths(dslList, iterable);
        }

        public final /* synthetic */ void setPaths(com.google.protobuf.kotlin.DslList dslList, int i, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this._builder.setPaths(i, str);
        }

        public final /* synthetic */ void clearPaths(com.google.protobuf.kotlin.DslList dslList) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "");
            this._builder.clearPaths();
        }

        public /* synthetic */ Dsl(com.google.protobuf.FieldMask.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }

    private FieldMaskKt() {
    }
}
