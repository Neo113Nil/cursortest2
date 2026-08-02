package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0016B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001d\u0010\u0013\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0013\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\u0012"}, d2 = {"Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/String;ZZ)V", "Lcom/apollographql/apollo/api/CompiledArgumentDefinition$Builder;", "newBuilder", "()Lcom/apollographql/apollo/api/CompiledArgumentDefinition$Builder;", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "isKey", "Z", "()Z", "isPagination", "isPagination$annotations", "()V", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompiledArgumentDefinition {
    private final boolean isKey;
    private final boolean isPagination;
    private final java.lang.String name;

    public static /* synthetic */ void isPagination$annotations() {
    }

    private CompiledArgumentDefinition(java.lang.String str, boolean z, boolean z2) {
        this.name = str;
        this.isKey = z;
        this.isPagination = z2;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: isKey, reason: from getter */
    public final boolean getIsKey() {
        return this.isKey;
    }

    /* renamed from: isPagination, reason: from getter */
    public final boolean getIsPagination() {
        return this.isPagination;
    }

    public final com.apollographql.apollo.api.CompiledArgumentDefinition.Builder newBuilder() {
        return new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder(this);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u000f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013"}, d2 = {"Lcom/apollographql/apollo/api/CompiledArgumentDefinition$Builder;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "argumentDefinition", "(Lcom/apollographql/apollo/api/CompiledArgumentDefinition;)V", "", "isKey", "(Z)Lcom/apollographql/apollo/api/CompiledArgumentDefinition$Builder;", "isPagination", "build", "()Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Builder {
        private boolean getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private boolean getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoFpsRanges;

        public Builder(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.getHighSpeedVideoFpsRanges = str;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(com.apollographql.apollo.api.CompiledArgumentDefinition compiledArgumentDefinition) {
            this(compiledArgumentDefinition.getName());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compiledArgumentDefinition, "");
            this.getHighResolutionOutputSizeshNQ4ISI = compiledArgumentDefinition.getIsKey();
            this.getHighSpeedVideoFpsRangesFor = compiledArgumentDefinition.getIsPagination();
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition.Builder isKey(boolean isKey) {
            this.getHighResolutionOutputSizeshNQ4ISI = isKey;
            return this;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition.Builder isPagination(boolean isPagination) {
            this.getHighSpeedVideoFpsRangesFor = isPagination;
            return this;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition build() {
            return new com.apollographql.apollo.api.CompiledArgumentDefinition(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, null);
        }
    }

    public /* synthetic */ CompiledArgumentDefinition(java.lang.String str, boolean z, boolean z2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, z2);
    }
}
