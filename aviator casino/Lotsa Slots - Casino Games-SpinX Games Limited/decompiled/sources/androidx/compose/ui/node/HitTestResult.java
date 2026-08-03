package androidx.compose.ui.node;

/* compiled from: HitTestResult.kt */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000289B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u0011\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\u0016\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\u0015\u0010\u001a\u001a\u00020\u001bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0007H\u0096\u0002J\u0006\u0010 \u001a\u00020\u0014J$\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00142\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110%J,\u0010&\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010'\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00142\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110%J\u0010\u0010)\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010*\u001a\u00020\u0014H\u0016J\u0016\u0010+\u001a\u00020\u00142\u0006\u0010'\u001a\u00020(2\u0006\u0010#\u001a\u00020\u0014J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020-H\u0096\u0002J\u0010\u0010.\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000200H\u0016J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0002002\u0006\u0010\u001f\u001a\u00020\u0007H\u0016J\b\u00101\u001a\u00020\u0011H\u0002J\u0017\u00102\u001a\u00020\u00112\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00110%H\u0086\bJ,\u00104\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010'\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00142\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110%J\u001e\u00105\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"Landroidx/compose/ui/node/HitTestResult;", "", "Landroidx/compose/ui/Modifier$Node;", "()V", "distanceFromEdgeAndInLayer", "", "hitDepth", "", "<set-?>", "size", "getSize", "()I", "values", "", "", "[Ljava/lang/Object;", "acceptHits", "", "clear", "contains", "", "element", "containsAll", "elements", "", "ensureContainerSize", "findBestHitDistance", "Landroidx/compose/ui/node/DistanceAndInLayer;", "findBestHitDistance-ptXAw2c", "()J", "get", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "hasHit", "hit", "node", "isInLayer", "childHitTest", "Lkotlin/Function0;", "hitInMinimumTouchTarget", "distanceFromEdge", "", "indexOf", "isEmpty", "isHitInMinimumTouchTargetBetter", "iterator", "", "lastIndexOf", "listIterator", "", "resizeToHitDepth", "siblingHits", "block", "speculativeHit", "subList", "fromIndex", "toIndex", "HitTestResultIterator", "SubList", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HitTestResult implements java.util.List<androidx.compose.ui.Modifier.Node>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final int $stable = 8;
    private int size;
    private java.lang.Object[] values = new java.lang.Object[16];
    private long[] distanceFromEdgeAndInLayer = new long[16];
    private int hitDepth = -1;

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i, androidx.compose.ui.Modifier.Node node) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, androidx.compose.ui.Modifier.Node node) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(androidx.compose.ui.Modifier.Node node) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, java.util.Collection<? extends androidx.compose.ui.Modifier.Node> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection<? extends androidx.compose.ui.Modifier.Node> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public androidx.compose.ui.Modifier.Node remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ androidx.compose.ui.Modifier.Node remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(java.util.function.UnaryOperator<androidx.compose.ui.Modifier.Node> unaryOperator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public androidx.compose.ui.Modifier.Node set2(int i, androidx.compose.ui.Modifier.Node node) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ androidx.compose.ui.Modifier.Node set(int i, androidx.compose.ui.Modifier.Node node) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void sort(java.util.Comparator<? super androidx.compose.ui.Modifier.Node> comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
        return kotlin.jvm.internal.CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof androidx.compose.ui.Modifier.Node) {
            return contains((androidx.compose.ui.Modifier.Node) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof androidx.compose.ui.Modifier.Node) {
            return indexOf((androidx.compose.ui.Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof androidx.compose.ui.Modifier.Node) {
            return lastIndexOf((androidx.compose.ui.Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    public int getSize() {
        return this.size;
    }

    public final boolean hasHit() {
        long m3529findBestHitDistanceptXAw2c = m3529findBestHitDistanceptXAw2c();
        return androidx.compose.ui.node.DistanceAndInLayer.m3524getDistanceimpl(m3529findBestHitDistanceptXAw2c) < 0.0f && androidx.compose.ui.node.DistanceAndInLayer.m3526isInLayerimpl(m3529findBestHitDistanceptXAw2c);
    }

    public final void acceptHits() {
        this.hitDepth = size() - 1;
    }

    private final void resizeToHitDepth() {
        int i = this.hitDepth + 1;
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(this);
        if (i <= lastIndex) {
            while (true) {
                this.values[i] = null;
                if (i == lastIndex) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.size = this.hitDepth + 1;
    }

    public final boolean isHitInMinimumTouchTargetBetter(float distanceFromEdge, boolean isInLayer) {
        long DistanceAndInLayer;
        if (this.hitDepth == kotlin.collections.CollectionsKt.getLastIndex(this)) {
            return true;
        }
        DistanceAndInLayer = androidx.compose.ui.node.HitTestResultKt.DistanceAndInLayer(distanceFromEdge, isInLayer);
        return androidx.compose.ui.node.DistanceAndInLayer.m3520compareToS_HNhKs(m3529findBestHitDistanceptXAw2c(), DistanceAndInLayer) > 0;
    }

    /* renamed from: findBestHitDistance-ptXAw2c, reason: not valid java name */
    private final long m3529findBestHitDistanceptXAw2c() {
        long DistanceAndInLayer;
        DistanceAndInLayer = androidx.compose.ui.node.HitTestResultKt.DistanceAndInLayer(Float.POSITIVE_INFINITY, false);
        int i = this.hitDepth + 1;
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(this);
        if (i <= lastIndex) {
            while (true) {
                long m3521constructorimpl = androidx.compose.ui.node.DistanceAndInLayer.m3521constructorimpl(this.distanceFromEdgeAndInLayer[i]);
                if (androidx.compose.ui.node.DistanceAndInLayer.m3520compareToS_HNhKs(m3521constructorimpl, DistanceAndInLayer) < 0) {
                    DistanceAndInLayer = m3521constructorimpl;
                }
                if (androidx.compose.ui.node.DistanceAndInLayer.m3524getDistanceimpl(DistanceAndInLayer) < 0.0f && androidx.compose.ui.node.DistanceAndInLayer.m3526isInLayerimpl(DistanceAndInLayer)) {
                    return DistanceAndInLayer;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return DistanceAndInLayer;
    }

    public final void hit(androidx.compose.ui.Modifier.Node node, boolean isInLayer, kotlin.jvm.functions.Function0<kotlin.Unit> childHitTest) {
        hitInMinimumTouchTarget(node, -1.0f, isInLayer, childHitTest);
    }

    public final void hitInMinimumTouchTarget(androidx.compose.ui.Modifier.Node node, float distanceFromEdge, boolean isInLayer, kotlin.jvm.functions.Function0<kotlin.Unit> childHitTest) {
        long DistanceAndInLayer;
        int i = this.hitDepth;
        this.hitDepth = i + 1;
        ensureContainerSize();
        java.lang.Object[] objArr = this.values;
        int i2 = this.hitDepth;
        objArr[i2] = node;
        long[] jArr = this.distanceFromEdgeAndInLayer;
        DistanceAndInLayer = androidx.compose.ui.node.HitTestResultKt.DistanceAndInLayer(distanceFromEdge, isInLayer);
        jArr[i2] = DistanceAndInLayer;
        resizeToHitDepth();
        childHitTest.invoke();
        this.hitDepth = i;
    }

    public final void speculativeHit(androidx.compose.ui.Modifier.Node node, float distanceFromEdge, boolean isInLayer, kotlin.jvm.functions.Function0<kotlin.Unit> childHitTest) {
        androidx.compose.ui.node.HitTestResult hitTestResult = this;
        if (this.hitDepth == kotlin.collections.CollectionsKt.getLastIndex(hitTestResult)) {
            hitInMinimumTouchTarget(node, distanceFromEdge, isInLayer, childHitTest);
            if (this.hitDepth + 1 == kotlin.collections.CollectionsKt.getLastIndex(hitTestResult)) {
                resizeToHitDepth();
                return;
            }
            return;
        }
        long m3529findBestHitDistanceptXAw2c = m3529findBestHitDistanceptXAw2c();
        int i = this.hitDepth;
        this.hitDepth = kotlin.collections.CollectionsKt.getLastIndex(hitTestResult);
        hitInMinimumTouchTarget(node, distanceFromEdge, isInLayer, childHitTest);
        if (this.hitDepth + 1 < kotlin.collections.CollectionsKt.getLastIndex(hitTestResult) && androidx.compose.ui.node.DistanceAndInLayer.m3520compareToS_HNhKs(m3529findBestHitDistanceptXAw2c, m3529findBestHitDistanceptXAw2c()) > 0) {
            int i2 = this.hitDepth + 1;
            int i3 = i + 1;
            java.lang.Object[] objArr = this.values;
            kotlin.collections.ArraysKt.copyInto(objArr, objArr, i3, i2, size());
            long[] jArr = this.distanceFromEdgeAndInLayer;
            kotlin.collections.ArraysKt.copyInto(jArr, jArr, i3, i2, size());
            this.hitDepth = ((size() + i) - this.hitDepth) - 1;
        }
        resizeToHitDepth();
        this.hitDepth = i;
    }

    public final void siblingHits(kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        int i = this.hitDepth;
        block.invoke();
        this.hitDepth = i;
    }

    private final void ensureContainerSize() {
        int i = this.hitDepth;
        java.lang.Object[] objArr = this.values;
        if (i >= objArr.length) {
            int length = objArr.length + 16;
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, length);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.values = copyOf;
            long[] copyOf2 = java.util.Arrays.copyOf(this.distanceFromEdgeAndInLayer, length);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.distanceFromEdgeAndInLayer = copyOf2;
        }
    }

    public boolean contains(androidx.compose.ui.Modifier.Node element) {
        return indexOf((java.lang.Object) element) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection<? extends java.lang.Object> elements) {
        java.util.Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public androidx.compose.ui.Modifier.Node get(int index) {
        java.lang.Object obj = this.values[index];
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (androidx.compose.ui.Modifier.Node) obj;
    }

    public int indexOf(androidx.compose.ui.Modifier.Node element) {
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(this);
        if (lastIndex < 0) {
            return -1;
        }
        int i = 0;
        while (!kotlin.jvm.internal.Intrinsics.areEqual(this.values[i], element)) {
            if (i == lastIndex) {
                return -1;
            }
            i++;
        }
        return i;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<androidx.compose.ui.Modifier.Node> iterator() {
        return new androidx.compose.ui.node.HitTestResult.HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    public int lastIndexOf(androidx.compose.ui.Modifier.Node element) {
        for (int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(this); -1 < lastIndex; lastIndex--) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.values[lastIndex], element)) {
                return lastIndex;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public java.util.ListIterator<androidx.compose.ui.Modifier.Node> listIterator() {
        return new androidx.compose.ui.node.HitTestResult.HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public java.util.ListIterator<androidx.compose.ui.Modifier.Node> listIterator(int index) {
        return new androidx.compose.ui.node.HitTestResult.HitTestResultIterator(this, index, 0, 0, 6, null);
    }

    @Override // java.util.List
    public java.util.List<androidx.compose.ui.Modifier.Node> subList(int fromIndex, int toIndex) {
        return new androidx.compose.ui.node.HitTestResult.SubList(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.hitDepth = -1;
        resizeToHitDepth();
    }

    /* compiled from: HitTestResult.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\t\u0010\u0011\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/node/HitTestResult$HitTestResultIterator;", "", "Landroidx/compose/ui/Modifier$Node;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "minIndex", "maxIndex", "(Landroidx/compose/ui/node/HitTestResult;III)V", "getIndex", "()I", "setIndex", "(I)V", "getMaxIndex", "getMinIndex", "hasNext", "", "hasPrevious", io.ktor.http.LinkHeader.Rel.Next, "nextIndex", "previous", "previousIndex", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class HitTestResultIterator implements java.util.ListIterator<androidx.compose.ui.Modifier.Node>, kotlin.jvm.internal.markers.KMappedMarker {
        private int index;
        private final int maxIndex;
        private final int minIndex;

        /* renamed from: add, reason: avoid collision after fix types in other method */
        public void add2(androidx.compose.ui.Modifier.Node node) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(androidx.compose.ui.Modifier.Node node) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(androidx.compose.ui.Modifier.Node node) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(androidx.compose.ui.Modifier.Node node) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public HitTestResultIterator(int i, int i2, int i3) {
            this.index = i;
            this.minIndex = i2;
            this.maxIndex = i3;
        }

        public final int getIndex() {
            return this.index;
        }

        public final void setIndex(int i) {
            this.index = i;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        public /* synthetic */ HitTestResultIterator(androidx.compose.ui.node.HitTestResult hitTestResult, int i, int i2, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? hitTestResult.size() : i3);
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.maxIndex;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > this.minIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public androidx.compose.ui.Modifier.Node next() {
            java.lang.Object[] objArr = androidx.compose.ui.node.HitTestResult.this.values;
            int i = this.index;
            this.index = i + 1;
            java.lang.Object obj = objArr[i];
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (androidx.compose.ui.Modifier.Node) obj;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index - this.minIndex;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.ListIterator
        public androidx.compose.ui.Modifier.Node previous() {
            java.lang.Object[] objArr = androidx.compose.ui.node.HitTestResult.this.values;
            int i = this.index - 1;
            this.index = i;
            java.lang.Object obj = objArr[i];
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (androidx.compose.ui.Modifier.Node) obj;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }
    }

    /* compiled from: HitTestResult.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\u000f\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016J\u0011\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0004H\u0096\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0016R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/node/HitTestResult$SubList;", "", "Landroidx/compose/ui/Modifier$Node;", "minIndex", "", "maxIndex", "(Landroidx/compose/ui/node/HitTestResult;II)V", "getMaxIndex", "()I", "getMinIndex", "size", "getSize", "contains", "", "element", "containsAll", "elements", "", "get", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class SubList implements java.util.List<androidx.compose.ui.Modifier.Node>, kotlin.jvm.internal.markers.KMappedMarker {
        private final int maxIndex;
        private final int minIndex;

        /* renamed from: add, reason: avoid collision after fix types in other method */
        public void add2(int i, androidx.compose.ui.Modifier.Node node) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i, androidx.compose.ui.Modifier.Node node) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean add(androidx.compose.ui.Modifier.Node node) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i, java.util.Collection<? extends androidx.compose.ui.Modifier.Node> collection) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(java.util.Collection<? extends androidx.compose.ui.Modifier.Node> collection) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.List
        public androidx.compose.ui.Modifier.Node remove(int i) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ androidx.compose.ui.Modifier.Node remove(int i) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(java.util.Collection<? extends java.lang.Object> collection) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(java.util.function.UnaryOperator<androidx.compose.ui.Modifier.Node> unaryOperator) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(java.util.Collection<? extends java.lang.Object> collection) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public androidx.compose.ui.Modifier.Node set2(int i, androidx.compose.ui.Modifier.Node node) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ androidx.compose.ui.Modifier.Node set(int i, androidx.compose.ui.Modifier.Node node) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void sort(java.util.Comparator<? super androidx.compose.ui.Modifier.Node> comparator) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public java.lang.Object[] toArray() {
            return kotlin.jvm.internal.CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
        }

        public SubList(int i, int i2) {
            this.minIndex = i;
            this.maxIndex = i2;
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(java.lang.Object obj) {
            if (obj instanceof androidx.compose.ui.Modifier.Node) {
                return contains((androidx.compose.ui.Modifier.Node) obj);
            }
            return false;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(java.lang.Object obj) {
            if (obj instanceof androidx.compose.ui.Modifier.Node) {
                return indexOf((androidx.compose.ui.Modifier.Node) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
            if (obj instanceof androidx.compose.ui.Modifier.Node) {
                return lastIndexOf((androidx.compose.ui.Modifier.Node) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        public int getSize() {
            return this.maxIndex - this.minIndex;
        }

        public boolean contains(androidx.compose.ui.Modifier.Node element) {
            return indexOf((java.lang.Object) element) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(java.util.Collection<? extends java.lang.Object> elements) {
            java.util.Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.List
        public androidx.compose.ui.Modifier.Node get(int index) {
            java.lang.Object obj = androidx.compose.ui.node.HitTestResult.this.values[index + this.minIndex];
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (androidx.compose.ui.Modifier.Node) obj;
        }

        public int indexOf(androidx.compose.ui.Modifier.Node element) {
            int i = this.minIndex;
            int i2 = this.maxIndex;
            if (i > i2) {
                return -1;
            }
            while (!kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.node.HitTestResult.this.values[i], element)) {
                if (i == i2) {
                    return -1;
                }
                i++;
            }
            return i - this.minIndex;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<androidx.compose.ui.Modifier.Node> iterator() {
            androidx.compose.ui.node.HitTestResult hitTestResult = androidx.compose.ui.node.HitTestResult.this;
            int i = this.minIndex;
            return hitTestResult.new HitTestResultIterator(i, i, this.maxIndex);
        }

        public int lastIndexOf(androidx.compose.ui.Modifier.Node element) {
            int i = this.maxIndex;
            int i2 = this.minIndex;
            if (i2 > i) {
                return -1;
            }
            while (!kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.node.HitTestResult.this.values[i], element)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.minIndex;
        }

        @Override // java.util.List
        public java.util.ListIterator<androidx.compose.ui.Modifier.Node> listIterator() {
            androidx.compose.ui.node.HitTestResult hitTestResult = androidx.compose.ui.node.HitTestResult.this;
            int i = this.minIndex;
            return hitTestResult.new HitTestResultIterator(i, i, this.maxIndex);
        }

        @Override // java.util.List
        public java.util.ListIterator<androidx.compose.ui.Modifier.Node> listIterator(int index) {
            androidx.compose.ui.node.HitTestResult hitTestResult = androidx.compose.ui.node.HitTestResult.this;
            int i = this.minIndex;
            return hitTestResult.new HitTestResultIterator(index + i, i, this.maxIndex);
        }

        @Override // java.util.List
        public java.util.List<androidx.compose.ui.Modifier.Node> subList(int fromIndex, int toIndex) {
            androidx.compose.ui.node.HitTestResult hitTestResult = androidx.compose.ui.node.HitTestResult.this;
            int i = this.minIndex;
            return hitTestResult.new SubList(fromIndex + i, i + toIndex);
        }
    }
}
