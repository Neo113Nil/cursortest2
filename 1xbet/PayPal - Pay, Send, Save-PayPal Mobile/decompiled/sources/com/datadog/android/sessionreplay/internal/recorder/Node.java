package com.datadog.android.sessionreplay.internal.recorder;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ@\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/Node;", "", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "wireframes", "children", "parents", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/datadog/android/sessionreplay/internal/recorder/Node;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getChildren", "getParents", "getWireframes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Node {
    private final java.util.List<com.datadog.android.sessionreplay.internal.recorder.Node> children;
    private final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> parents;
    private final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> wireframes;

    /* JADX WARN: Multi-variable type inference failed */
    public Node(java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> list, java.util.List<com.datadog.android.sessionreplay.internal.recorder.Node> list2, java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> list3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        this.wireframes = list;
        this.children = list2;
        this.parents = list3;
    }

    public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> getWireframes() {
        return this.wireframes;
    }

    public /* synthetic */ Node(java.util.List list, java.util.List list2, java.util.List list3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3);
    }

    public final java.util.List<com.datadog.android.sessionreplay.internal.recorder.Node> getChildren() {
        return this.children;
    }

    public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> getParents() {
        return this.parents;
    }

    public final java.lang.String toString() {
        java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> list = this.wireframes;
        java.util.List<com.datadog.android.sessionreplay.internal.recorder.Node> list2 = this.children;
        java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> list3 = this.parents;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Node(wireframes=");
        sb.append(list);
        sb.append(", children=");
        sb.append(list2);
        sb.append(", parents=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.wireframes.hashCode() * 31) + this.children.hashCode()) * 31) + this.parents.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.sessionreplay.internal.recorder.Node)) {
            return false;
        }
        com.datadog.android.sessionreplay.internal.recorder.Node node = (com.datadog.android.sessionreplay.internal.recorder.Node) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.wireframes, node.wireframes) && kotlin.jvm.internal.Intrinsics.areEqual(this.children, node.children) && kotlin.jvm.internal.Intrinsics.areEqual(this.parents, node.parents);
    }

    public final com.datadog.android.sessionreplay.internal.recorder.Node copy(java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> wireframes, java.util.List<com.datadog.android.sessionreplay.internal.recorder.Node> children, java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> parents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wireframes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(children, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parents, "");
        return new com.datadog.android.sessionreplay.internal.recorder.Node(wireframes, children, parents);
    }

    public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> component3() {
        return this.parents;
    }

    public final java.util.List<com.datadog.android.sessionreplay.internal.recorder.Node> component2() {
        return this.children;
    }

    public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> component1() {
        return this.wireframes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.datadog.android.sessionreplay.internal.recorder.Node copy$default(com.datadog.android.sessionreplay.internal.recorder.Node node, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = node.wireframes;
        }
        if ((i & 2) != 0) {
            list2 = node.children;
        }
        if ((i & 4) != 0) {
            list3 = node.parents;
        }
        return node.copy(list, list2, list3);
    }
}
