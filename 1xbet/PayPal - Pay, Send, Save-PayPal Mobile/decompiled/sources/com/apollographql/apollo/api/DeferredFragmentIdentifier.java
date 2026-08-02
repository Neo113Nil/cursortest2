package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/apollographql/apollo/api/DeferredFragmentIdentifier;", "", "", "path", "", "label", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/apollographql/apollo/api/DeferredFragmentIdentifier;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getPath", "Ljava/lang/String;", "getLabel"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DeferredFragmentIdentifier {
    private final java.lang.String label;
    private final java.util.List<java.lang.Object> path;

    public DeferredFragmentIdentifier(java.util.List<? extends java.lang.Object> list, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.path = list;
        this.label = str;
    }

    public final java.util.List<java.lang.Object> getPath() {
        return this.path;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeferredFragmentIdentifier(path=");
        sb.append(this.path);
        sb.append(", label=");
        sb.append(this.label);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.path.hashCode();
        java.lang.String str = this.label;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.apollographql.apollo.api.DeferredFragmentIdentifier)) {
            return false;
        }
        com.apollographql.apollo.api.DeferredFragmentIdentifier deferredFragmentIdentifier = (com.apollographql.apollo.api.DeferredFragmentIdentifier) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.path, deferredFragmentIdentifier.path) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, deferredFragmentIdentifier.label);
    }

    public final com.apollographql.apollo.api.DeferredFragmentIdentifier copy(java.util.List<? extends java.lang.Object> path, java.lang.String label) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        return new com.apollographql.apollo.api.DeferredFragmentIdentifier(path, label);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    public final java.util.List<java.lang.Object> component1() {
        return this.path;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.apollographql.apollo.api.DeferredFragmentIdentifier copy$default(com.apollographql.apollo.api.DeferredFragmentIdentifier deferredFragmentIdentifier, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = deferredFragmentIdentifier.path;
        }
        if ((i & 2) != 0) {
            str = deferredFragmentIdentifier.label;
        }
        return deferredFragmentIdentifier.copy(list, str);
    }
}
