package com.zettle.sdk.core.context;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\b\u0002\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0006\u0018\u0001H\u0086\n¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0006\u0018\u0001H\u0086\n¢\u0006\u0004\b\t\u0010\bJ\u0018\u0010\n\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0006\u0018\u0001H\u0086\n¢\u0006\u0004\b\n\u0010\bJ\u0018\u0010\u000b\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0006\u0018\u0001H\u0086\n¢\u0006\u0004\b\u000b\u0010\bJ\u0018\u0010\f\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0006\u0018\u0001H\u0086\n¢\u0006\u0004\b\f\u0010\bJ \u0010\u000f\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0006\u0018\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\u0018\u0010\u0014\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0006\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0014\u0010\bJ!\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0006\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0016\u0010\bJ#\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/zettle/sdk/core/context/ZettleContextParameters;", "", "", "p0", "<init>", "(Ljava/util/List;)V", "T", "component1", "()Ljava/lang/Object;", "component2", "component3", "component4", "component5", "", "i", "elementAt", "(I)Ljava/lang/Object;", "Ljava/lang/Class;", "clazz", "(ILjava/lang/Class;)Ljava/lang/Object;", "first", "(Ljava/lang/Class;)Ljava/lang/Object;", "firstOrNull", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "Static"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ZettleContextParameters {

    /* renamed from: Static, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.context.ZettleContextParameters.Companion INSTANCE = new com.zettle.sdk.core.context.ZettleContextParameters.Companion(null);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<java.lang.Object> getHighSpeedVideoFpsRangesFor;

    private ZettleContextParameters(java.util.List<? extends java.lang.Object> list) {
        this.getHighSpeedVideoFpsRangesFor = list;
    }

    public final <T> T elementAt(int i, java.lang.Class<T> clazz) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "");
        if (this.getHighSpeedVideoFpsRangesFor.size() > i) {
            return (T) this.getHighSpeedVideoFpsRangesFor.get(i);
        }
        java.lang.String name2 = clazz.getName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't get injected parameter #");
        sb.append(i);
        sb.append(" from ");
        sb.append(this);
        sb.append(" for type '");
        sb.append(name2);
        sb.append("'");
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    public final <T> T firstOrNull(java.lang.Class<T> clazz) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "");
        java.util.List<java.lang.Object> list = this.getHighSpeedVideoFpsRangesFor;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t : list) {
            if (!clazz.isInstance(t) || t == null) {
                t = null;
            }
            if (t != null) {
                arrayList.add(t);
            }
        }
        return (T) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList);
    }

    public final <T> T first(java.lang.Class<T> clazz) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "");
        T t = (T) firstOrNull(clazz);
        if (t != null) {
            return t;
        }
        java.lang.String name2 = clazz.getName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("No value found for type '");
        sb.append(name2);
        sb.append("'");
        throw new java.util.NoSuchElementException(sb.toString());
    }

    public final /* synthetic */ <T> T first() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) first(java.lang.Object.class);
    }

    public final /* synthetic */ <T> T firstOrNull() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) firstOrNull(java.lang.Object.class);
    }

    public final /* synthetic */ <T> T elementAt(int i) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) elementAt(i, java.lang.Object.class);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/core/context/ZettleContextParameters$Static;", "", "<init>", "()V", "", "parameters", "Lcom/zettle/sdk/core/context/ZettleContextParameters;", "of", "(Ljava/util/List;)Lcom/zettle/sdk/core/context/ZettleContextParameters;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.zettle.sdk.core.context.ZettleContextParameters$Static, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final com.zettle.sdk.core.context.ZettleContextParameters of(java.util.List<? extends java.lang.Object> parameters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "");
            if (parameters.size() > 5) {
                throw new java.lang.IllegalArgumentException("Max amount of parameters is 5");
            }
            return new com.zettle.sdk.core.context.ZettleContextParameters(kotlin.collections.CollectionsKt.toList(parameters), null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final /* synthetic */ <T> T component1() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) elementAt(0, java.lang.Object.class);
    }

    public final /* synthetic */ <T> T component2() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) elementAt(1, java.lang.Object.class);
    }

    public final /* synthetic */ <T> T component3() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) elementAt(2, java.lang.Object.class);
    }

    public final /* synthetic */ <T> T component4() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) elementAt(3, java.lang.Object.class);
    }

    public final /* synthetic */ <T> T component5() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) elementAt(4, java.lang.Object.class);
    }

    public /* synthetic */ ZettleContextParameters(java.util.List list, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }
}
