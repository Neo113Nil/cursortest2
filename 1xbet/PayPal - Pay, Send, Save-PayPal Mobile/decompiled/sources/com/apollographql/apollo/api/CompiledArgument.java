package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001bB'\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR(\u0010\r\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00178GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/apollographql/apollo/api/CompiledArgument;", "", "Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "p0", "Lcom/apollographql/apollo/api/Optional;", "Lcom/apollographql/apollo/api/CompiledValue;", "p1", "<init>", "(Lcom/apollographql/apollo/api/CompiledArgumentDefinition;Lcom/apollographql/apollo/api/Optional;)V", "definition", "Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "getDefinition", "()Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/apollographql/apollo/api/Optional;", "getValue", "()Lcom/apollographql/apollo/api/Optional;", "", "getName", "()Ljava/lang/String;", "getName$annotations", "()V", "name", "", "isKey", "()Z", "isKey$annotations", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompiledArgument {
    private final com.apollographql.apollo.api.CompiledArgumentDefinition definition;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> value;

    @kotlin.Deprecated(message = "Use definition.name instead", replaceWith = @kotlin.ReplaceWith(expression = "definition.name", imports = {}))
    public static /* synthetic */ void getName$annotations() {
    }

    @kotlin.Deprecated(message = "Use definition.isKey instead", replaceWith = @kotlin.ReplaceWith(expression = "definition.isKey", imports = {}))
    public static /* synthetic */ void isKey$annotations() {
    }

    private CompiledArgument(com.apollographql.apollo.api.CompiledArgumentDefinition compiledArgumentDefinition, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional) {
        this.definition = compiledArgumentDefinition;
        this.value = optional;
    }

    public final com.apollographql.apollo.api.CompiledArgumentDefinition getDefinition() {
        return this.definition;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getValue() {
        return this.value;
    }

    public final java.lang.String getName() {
        return this.definition.getName();
    }

    public final boolean isKey() {
        return this.definition.getIsKey();
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0007\u001a\u00020\u00002\u000e\u0010\u0007\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\f\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00060\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/apollographql/apollo/api/CompiledArgument$Builder;", "", "Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "definition", "<init>", "(Lcom/apollographql/apollo/api/CompiledArgumentDefinition;)V", "Lcom/apollographql/apollo/api/CompiledValue;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(Ljava/lang/Object;)Lcom/apollographql/apollo/api/CompiledArgument$Builder;", "Lcom/apollographql/apollo/api/CompiledArgument;", "build", "()Lcom/apollographql/apollo/api/CompiledArgument;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/api/Optional;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/api/Optional;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private com.apollographql.apollo.api.Optional<? extends java.lang.Object> getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final com.apollographql.apollo.api.CompiledArgumentDefinition getHighSpeedVideoFpsRanges;

        public Builder(com.apollographql.apollo.api.CompiledArgumentDefinition compiledArgumentDefinition) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compiledArgumentDefinition, "");
            this.getHighSpeedVideoFpsRanges = compiledArgumentDefinition;
            this.getHighSpeedVideoSizes = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        }

        public final com.apollographql.apollo.api.CompiledArgument.Builder value(java.lang.Object value) {
            this.getHighSpeedVideoSizes = com.apollographql.apollo.api.Optional.INSTANCE.present(value);
            return this;
        }

        public final com.apollographql.apollo.api.CompiledArgument build() {
            return new com.apollographql.apollo.api.CompiledArgument(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, null);
        }
    }

    public /* synthetic */ CompiledArgument(com.apollographql.apollo.api.CompiledArgumentDefinition compiledArgumentDefinition, com.apollographql.apollo.api.Optional optional, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(compiledArgumentDefinition, optional);
    }
}
