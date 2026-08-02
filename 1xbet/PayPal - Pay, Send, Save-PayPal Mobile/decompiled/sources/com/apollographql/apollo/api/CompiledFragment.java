package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0013B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010"}, d2 = {"Lcom/apollographql/apollo/api/CompiledFragment;", "Lcom/apollographql/apollo/api/CompiledSelection;", "", "typeCondition", "", "possibleTypes", "Lcom/apollographql/apollo/api/CompiledCondition;", "condition", "selections", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "getTypeCondition", "()Ljava/lang/String;", "Ljava/util/List;", "getPossibleTypes", "()Ljava/util/List;", "getCondition", "getSelections", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CompiledFragment extends com.apollographql.apollo.api.CompiledSelection {
    private final java.util.List<com.apollographql.apollo.api.CompiledCondition> condition;
    private final java.util.List<java.lang.String> possibleTypes;
    private final java.util.List<com.apollographql.apollo.api.CompiledSelection> selections;
    private final java.lang.String typeCondition;

    public final java.lang.String getTypeCondition() {
        return this.typeCondition;
    }

    public final java.util.List<java.lang.String> getPossibleTypes() {
        return this.possibleTypes;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledCondition> getCondition() {
        return this.condition;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> getSelections() {
        return this.selections;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CompiledFragment(java.lang.String str, java.util.List<java.lang.String> list, java.util.List<com.apollographql.apollo.api.CompiledCondition> list2, java.util.List<? extends com.apollographql.apollo.api.CompiledSelection> list3) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        this.typeCondition = str;
        this.possibleTypes = list;
        this.condition = list2;
        this.selections = list3;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\nJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015\"\u0004\b\u0017\u0010\u0018R(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0018"}, d2 = {"Lcom/apollographql/apollo/api/CompiledFragment$Builder;", "", "", "typeCondition", "", "possibleTypes", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Lcom/apollographql/apollo/api/CompiledCondition;", "condition", "(Ljava/util/List;)Lcom/apollographql/apollo/api/CompiledFragment$Builder;", "Lcom/apollographql/apollo/api/CompiledSelection;", "selections", "Lcom/apollographql/apollo/api/CompiledFragment;", "build", "()Lcom/apollographql/apollo/api/CompiledFragment;", "Ljava/lang/String;", "getTypeCondition", "()Ljava/lang/String;", "Ljava/util/List;", "getPossibleTypes", "()Ljava/util/List;", "getCondition", "setCondition", "(Ljava/util/List;)V", "getSelections", "setSelections"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private java.util.List<com.apollographql.apollo.api.CompiledCondition> condition;
        private final java.util.List<java.lang.String> possibleTypes;
        private java.util.List<? extends com.apollographql.apollo.api.CompiledSelection> selections;
        private final java.lang.String typeCondition;

        public Builder(java.lang.String str, java.util.List<java.lang.String> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.typeCondition = str;
            this.possibleTypes = list;
            this.condition = kotlin.collections.CollectionsKt.emptyList();
            this.selections = kotlin.collections.CollectionsKt.emptyList();
        }

        public final java.util.List<java.lang.String> getPossibleTypes() {
            return this.possibleTypes;
        }

        public final java.lang.String getTypeCondition() {
            return this.typeCondition;
        }

        public final java.util.List<com.apollographql.apollo.api.CompiledCondition> getCondition() {
            return this.condition;
        }

        public final void setCondition(java.util.List<com.apollographql.apollo.api.CompiledCondition> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.condition = list;
        }

        public final java.util.List<com.apollographql.apollo.api.CompiledSelection> getSelections() {
            return this.selections;
        }

        public final void setSelections(java.util.List<? extends com.apollographql.apollo.api.CompiledSelection> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.selections = list;
        }

        public final com.apollographql.apollo.api.CompiledFragment.Builder condition(java.util.List<com.apollographql.apollo.api.CompiledCondition> condition) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(condition, "");
            this.condition = condition;
            return this;
        }

        public final com.apollographql.apollo.api.CompiledFragment.Builder selections(java.util.List<? extends com.apollographql.apollo.api.CompiledSelection> selections) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selections, "");
            this.selections = selections;
            return this;
        }

        public final com.apollographql.apollo.api.CompiledFragment build() {
            return new com.apollographql.apollo.api.CompiledFragment(this.typeCondition, this.possibleTypes, this.condition, this.selections);
        }
    }
}
