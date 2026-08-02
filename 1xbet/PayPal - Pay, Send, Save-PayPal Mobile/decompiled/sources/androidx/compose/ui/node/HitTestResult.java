package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002KLB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0004J\u001d\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016J6\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018J>\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0086\b¢\u0006\u0004\b\u0017\u0010\u001aJ+\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0004\b\u001b\u0010\u0016J3\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0004\b\u001c\u0010\u0018J\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010#J\u001e\u0010%\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0086\b¢\u0006\u0004\b%\u0010&J\u0018\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b(\u0010)J\u001d\u0010,\u001a\u00020\u00052\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0018\u0010/\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u001dH\u0096\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0005H\u0016¢\u0006\u0004\b3\u0010\u0007J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020\u000204H\u0096\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b7\u00102J\u0015\u00109\u001a\b\u0012\u0004\u0012\u00020\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020\u0002082\u0006\u0010.\u001a\u00020\u001dH\u0016¢\u0006\u0004\b9\u0010;J%\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010<\u001a\u00020\u001d2\u0006\u0010=\u001a\u00020\u001dH\u0016¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\b¢\u0006\u0004\b@\u0010\u0004R\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010CR\u0016\u0010\"\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010FR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010GR\u0014\u0010J\u001a\u00020\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I"}, d2 = {"Landroidx/compose/ui/node/HitTestResult;", "", "Landroidx/compose/ui/Modifier$Node;", "<init>", "()V", "", "hasHit", "()Z", "", "acceptHits", "", "distanceFromEdge", "isInLayer", "isHitInMinimumTouchTargetBetter", "(FZ)Z", "Landroidx/compose/ui/node/DistanceAndFlags;", "getHighSpeedVideoFpsRanges", "()J", "node", "Lkotlin/Function0;", "childHitTest", "hit", "(Landroidx/compose/ui/Modifier$Node;ZLkotlin/jvm/functions/Function0;)V", "hitInMinimumTouchTarget", "(Landroidx/compose/ui/Modifier$Node;FZLkotlin/jvm/functions/Function0;)V", "isInExpandedBounds", "(Landroidx/compose/ui/Modifier$Node;FZZLkotlin/jvm/functions/Function0;)V", "hitExpandedTouchBounds", "speculativeHit", "", "p0", "getHighSpeedVideoFpsRangesFor", "(I)V", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(II)V", "block", "siblingHits", "(Lkotlin/jvm/functions/Function0;)V", "element", "contains", "(Landroidx/compose/ui/Modifier$Node;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Landroidx/compose/ui/Modifier$Node;", "indexOf", "(Landroidx/compose/ui/Modifier$Node;)I", "isEmpty", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "clear", "Landroidx/collection/MutableObjectList;", "", "Landroidx/collection/MutableObjectList;", "getHighSpeedVideoSizes", "Landroidx/collection/MutableLongList;", "Landroidx/collection/MutableLongList;", com.visa.cbp.getEncExpo.warmup, "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size, "HitTestResultIterator", "SubList"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HitTestResult implements java.util.List<androidx.compose.ui.Modifier.Node>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.collection.MutableObjectList<java.lang.Object> getHighSpeedVideoSizes = new androidx.collection.MutableObjectList<>(16);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.collection.MutableLongList getHighResolutionOutputSizeshNQ4ISI = new androidx.collection.MutableLongList(16);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor = -1;

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
    public final int size() {
        return getSize();
    }

    public final int getSize() {
        return this.getHighSpeedVideoSizes.getSize();
    }

    public final boolean hasHit() {
        long highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        return androidx.compose.ui.node.DistanceAndFlags.m7524getDistanceimpl(highSpeedVideoFpsRanges) < 0.0f && androidx.compose.ui.node.DistanceAndFlags.m7527isInLayerimpl(highSpeedVideoFpsRanges) && !androidx.compose.ui.node.DistanceAndFlags.m7526isInExpandedBoundsimpl(highSpeedVideoFpsRanges);
    }

    public final void acceptHits() {
        this.getHighSpeedVideoFpsRangesFor = size() - 1;
    }

    public final boolean isHitInMinimumTouchTargetBetter(float distanceFromEdge, boolean isInLayer) {
        long highSpeedVideoFpsRangesFor;
        if (this.getHighSpeedVideoFpsRangesFor == kotlin.collections.CollectionsKt.getLastIndex(this)) {
            return true;
        }
        highSpeedVideoFpsRangesFor = androidx.compose.ui.node.HitTestResultKt.getHighSpeedVideoFpsRangesFor(distanceFromEdge, isInLayer, false);
        return androidx.compose.ui.node.DistanceAndFlags.m7520compareTo9YPOF3E(getHighSpeedVideoFpsRanges(), highSpeedVideoFpsRangesFor) > 0;
    }

    private final long getHighSpeedVideoFpsRanges() {
        long highSpeedVideoFpsRangesFor;
        highSpeedVideoFpsRangesFor = androidx.compose.ui.node.HitTestResultKt.getHighSpeedVideoFpsRangesFor(Float.POSITIVE_INFINITY, false, false);
        int i = this.getHighSpeedVideoFpsRangesFor + 1;
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(this);
        if (i <= lastIndex) {
            while (true) {
                long m7521constructorimpl = androidx.compose.ui.node.DistanceAndFlags.m7521constructorimpl(this.getHighResolutionOutputSizeshNQ4ISI.get(i));
                if (androidx.compose.ui.node.DistanceAndFlags.m7520compareTo9YPOF3E(m7521constructorimpl, highSpeedVideoFpsRangesFor) < 0) {
                    highSpeedVideoFpsRangesFor = m7521constructorimpl;
                }
                if ((androidx.compose.ui.node.DistanceAndFlags.m7524getDistanceimpl(highSpeedVideoFpsRangesFor) < 0.0f && androidx.compose.ui.node.DistanceAndFlags.m7527isInLayerimpl(highSpeedVideoFpsRangesFor)) || i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return highSpeedVideoFpsRangesFor;
    }

    public final void hitInMinimumTouchTarget(androidx.compose.ui.Modifier.Node node, float distanceFromEdge, boolean isInLayer, boolean isInExpandedBounds, kotlin.jvm.functions.Function0<kotlin.Unit> childHitTest) {
        long highSpeedVideoFpsRangesFor;
        int i = this.getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor + 1, size());
        this.getHighSpeedVideoFpsRangesFor++;
        this.getHighSpeedVideoSizes.add(node);
        androidx.collection.MutableLongList mutableLongList = this.getHighResolutionOutputSizeshNQ4ISI;
        highSpeedVideoFpsRangesFor = androidx.compose.ui.node.HitTestResultKt.getHighSpeedVideoFpsRangesFor(distanceFromEdge, isInLayer, isInExpandedBounds);
        mutableLongList.add(highSpeedVideoFpsRangesFor);
        childHitTest.invoke();
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public final void hitExpandedTouchBounds(androidx.compose.ui.Modifier.Node node, boolean isInLayer, kotlin.jvm.functions.Function0<kotlin.Unit> childHitTest) {
        long highSpeedVideoFpsRangesFor;
        long highSpeedVideoFpsRangesFor2;
        long highSpeedVideoFpsRangesFor3;
        androidx.compose.ui.node.HitTestResult hitTestResult = this;
        if (this.getHighSpeedVideoFpsRangesFor == kotlin.collections.CollectionsKt.getLastIndex(hitTestResult)) {
            int i = this.getHighSpeedVideoFpsRangesFor;
            getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor + 1, size());
            this.getHighSpeedVideoFpsRangesFor++;
            this.getHighSpeedVideoSizes.add(node);
            androidx.collection.MutableLongList mutableLongList = this.getHighResolutionOutputSizeshNQ4ISI;
            highSpeedVideoFpsRangesFor3 = androidx.compose.ui.node.HitTestResultKt.getHighSpeedVideoFpsRangesFor(0.0f, isInLayer, true);
            mutableLongList.add(highSpeedVideoFpsRangesFor3);
            childHitTest.invoke();
            this.getHighSpeedVideoFpsRangesFor = i;
            return;
        }
        long highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        if (!androidx.compose.ui.node.DistanceAndFlags.m7526isInExpandedBoundsimpl(highSpeedVideoFpsRanges)) {
            if (androidx.compose.ui.node.DistanceAndFlags.m7524getDistanceimpl(highSpeedVideoFpsRanges) > 0.0f) {
                int i3 = this.getHighSpeedVideoFpsRangesFor;
                getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor + 1, size());
                this.getHighSpeedVideoFpsRangesFor++;
                this.getHighSpeedVideoSizes.add(node);
                androidx.collection.MutableLongList mutableLongList2 = this.getHighResolutionOutputSizeshNQ4ISI;
                highSpeedVideoFpsRangesFor = androidx.compose.ui.node.HitTestResultKt.getHighSpeedVideoFpsRangesFor(0.0f, isInLayer, true);
                mutableLongList2.add(highSpeedVideoFpsRangesFor);
                childHitTest.invoke();
                this.getHighSpeedVideoFpsRangesFor = i3;
                return;
            }
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.getLastIndex(hitTestResult);
        int i4 = this.getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor + 1, size());
        this.getHighSpeedVideoFpsRangesFor++;
        this.getHighSpeedVideoSizes.add(node);
        androidx.collection.MutableLongList mutableLongList3 = this.getHighResolutionOutputSizeshNQ4ISI;
        highSpeedVideoFpsRangesFor2 = androidx.compose.ui.node.HitTestResultKt.getHighSpeedVideoFpsRangesFor(0.0f, isInLayer, true);
        mutableLongList3.add(highSpeedVideoFpsRangesFor2);
        childHitTest.invoke();
        this.getHighSpeedVideoFpsRangesFor = i4;
        if (androidx.compose.ui.node.DistanceAndFlags.m7524getDistanceimpl(getHighSpeedVideoFpsRanges()) < 0.0f) {
            getHighResolutionOutputSizeshNQ4ISI(i2 + 1, this.getHighSpeedVideoFpsRangesFor + 1);
        }
        this.getHighSpeedVideoFpsRangesFor = i2;
    }

    public final void speculativeHit(androidx.compose.ui.Modifier.Node node, float distanceFromEdge, boolean isInLayer, kotlin.jvm.functions.Function0<kotlin.Unit> childHitTest) {
        long highSpeedVideoFpsRangesFor;
        int i;
        long highSpeedVideoFpsRangesFor2;
        androidx.compose.ui.node.HitTestResult hitTestResult = this;
        if (this.getHighSpeedVideoFpsRangesFor == kotlin.collections.CollectionsKt.getLastIndex(hitTestResult)) {
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor + 1, size());
            this.getHighSpeedVideoFpsRangesFor++;
            this.getHighSpeedVideoSizes.add(node);
            androidx.collection.MutableLongList mutableLongList = this.getHighResolutionOutputSizeshNQ4ISI;
            highSpeedVideoFpsRangesFor2 = androidx.compose.ui.node.HitTestResultKt.getHighSpeedVideoFpsRangesFor(distanceFromEdge, isInLayer, false);
            mutableLongList.add(highSpeedVideoFpsRangesFor2);
            childHitTest.invoke();
            this.getHighSpeedVideoFpsRangesFor = i2;
            if (this.getHighSpeedVideoFpsRangesFor + 1 == kotlin.collections.CollectionsKt.getLastIndex(hitTestResult) || androidx.compose.ui.node.DistanceAndFlags.m7526isInExpandedBoundsimpl(getHighSpeedVideoFpsRanges())) {
                getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor + 1);
                return;
            }
            return;
        }
        long highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        int i3 = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.getLastIndex(hitTestResult);
        int i4 = this.getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor + 1, size());
        this.getHighSpeedVideoFpsRangesFor++;
        this.getHighSpeedVideoSizes.add(node);
        androidx.collection.MutableLongList mutableLongList2 = this.getHighResolutionOutputSizeshNQ4ISI;
        highSpeedVideoFpsRangesFor = androidx.compose.ui.node.HitTestResultKt.getHighSpeedVideoFpsRangesFor(distanceFromEdge, isInLayer, false);
        mutableLongList2.add(highSpeedVideoFpsRangesFor);
        childHitTest.invoke();
        this.getHighSpeedVideoFpsRangesFor = i4;
        long highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges();
        if (this.getHighSpeedVideoFpsRangesFor + 1 < kotlin.collections.CollectionsKt.getLastIndex(hitTestResult) && androidx.compose.ui.node.DistanceAndFlags.m7520compareTo9YPOF3E(highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2) > 0) {
            if (androidx.compose.ui.node.DistanceAndFlags.m7526isInExpandedBoundsimpl(highSpeedVideoFpsRanges2)) {
                i = this.getHighSpeedVideoFpsRangesFor + 2;
            } else {
                i = this.getHighSpeedVideoFpsRangesFor + 1;
            }
            getHighResolutionOutputSizeshNQ4ISI(i3 + 1, i);
        } else {
            getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor + 1, size());
        }
        this.getHighSpeedVideoFpsRangesFor = i3;
    }

    private final void getHighSpeedVideoFpsRangesFor(int p0) {
        this.getHighSpeedVideoSizes.removeAt(p0);
        this.getHighResolutionOutputSizeshNQ4ISI.removeAt(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighResolutionOutputSizeshNQ4ISI(int p0, int p1) {
        if (p0 >= p1) {
            return;
        }
        this.getHighSpeedVideoSizes.removeRange(p0, p1);
        this.getHighResolutionOutputSizeshNQ4ISI.removeRange(p0, p1);
    }

    public final void siblingHits(kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        int i = this.getHighSpeedVideoFpsRangesFor;
        block.invoke();
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public final boolean contains(androidx.compose.ui.Modifier.Node element) {
        return indexOf((java.lang.Object) element) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection<?> elements) {
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
    public final androidx.compose.ui.Modifier.Node get(int index) {
        java.lang.Object obj = this.getHighSpeedVideoSizes.get(index);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return (androidx.compose.ui.Modifier.Node) obj;
    }

    public final int indexOf(androidx.compose.ui.Modifier.Node element) {
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(this);
        if (lastIndex < 0) {
            return -1;
        }
        int i = 0;
        while (!kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes.get(i), element)) {
            if (i == lastIndex) {
                return -1;
            }
            i++;
        }
        return i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.getHighSpeedVideoSizes.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<androidx.compose.ui.Modifier.Node> iterator() {
        return new androidx.compose.ui.node.HitTestResult.HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    public final int lastIndexOf(androidx.compose.ui.Modifier.Node element) {
        for (int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(this); lastIndex >= 0; lastIndex--) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes.get(lastIndex), element)) {
                return lastIndex;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final java.util.ListIterator<androidx.compose.ui.Modifier.Node> listIterator() {
        return new androidx.compose.ui.node.HitTestResult.HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final java.util.ListIterator<androidx.compose.ui.Modifier.Node> listIterator(int index) {
        return new androidx.compose.ui.node.HitTestResult.HitTestResultIterator(this, index, 0, 0, 6, null);
    }

    @Override // java.util.List
    public final java.util.List<androidx.compose.ui.Modifier.Node> subList(int fromIndex, int toIndex) {
        return new androidx.compose.ui.node.HitTestResult.SubList(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.getHighSpeedVideoFpsRangesFor = -1;
        this.getHighSpeedVideoSizes.clear();
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013"}, d2 = {"Landroidx/compose/ui/node/HitTestResult$HitTestResultIterator;", "", "Landroidx/compose/ui/Modifier$Node;", "", "p0", "p1", "p2", "<init>", "(Landroidx/compose/ui/node/HitTestResult;III)V", "", "hasNext", "()Z", "hasPrevious", "Camera2StreamConfigurationMap", "()Landroidx/compose/ui/Modifier$Node;", "nextIndex", "()I", "getHighSpeedVideoSizes", "previousIndex", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    final class HitTestResultIterator implements java.util.ListIterator<androidx.compose.ui.Modifier.Node>, kotlin.jvm.internal.markers.KMappedMarker {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        public int getHighSpeedVideoSizes;
        private final int getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final int getHighResolutionOutputSizeshNQ4ISI;

        public HitTestResultIterator(int i, int i2, int i3) {
            this.getHighSpeedVideoSizes = i;
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
            this.getHighSpeedVideoFpsRanges = i3;
        }

        public /* synthetic */ HitTestResultIterator(androidx.compose.ui.node.HitTestResult hitTestResult, int i, int i2, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? hitTestResult.size() : i3);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.getHighSpeedVideoSizes < this.getHighSpeedVideoFpsRanges;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.getHighSpeedVideoSizes > this.getHighResolutionOutputSizeshNQ4ISI;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public androidx.compose.ui.Modifier.Node next() {
            androidx.collection.MutableObjectList mutableObjectList = androidx.compose.ui.node.HitTestResult.this.getHighSpeedVideoSizes;
            int i = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i + 1;
            E e = mutableObjectList.get(i);
            kotlin.jvm.internal.Intrinsics.checkNotNull(e, "");
            return (androidx.compose.ui.Modifier.Node) e;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.ListIterator
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public androidx.compose.ui.Modifier.Node previous() {
            androidx.collection.MutableObjectList mutableObjectList = androidx.compose.ui.node.HitTestResult.this.getHighSpeedVideoSizes;
            int i = this.getHighSpeedVideoSizes - 1;
            this.getHighSpeedVideoSizes = i;
            E e = mutableObjectList.get(i);
            kotlin.jvm.internal.Intrinsics.checkNotNull(e, "");
            return (androidx.compose.ui.Modifier.Node) e;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) - 1;
        }

        @Override // java.util.ListIterator
        public final /* synthetic */ void set(androidx.compose.ui.Modifier.Node node) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final /* synthetic */ void add(androidx.compose.ui.Modifier.Node node) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\b\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0011J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001bJ%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0017\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010 "}, d2 = {"Landroidx/compose/ui/node/HitTestResult$SubList;", "", "Landroidx/compose/ui/Modifier$Node;", "", "p0", "p1", "<init>", "(Landroidx/compose/ui/node/HitTestResult;II)V", "", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/Modifier$Node;)Z", "", "containsAll", "(Ljava/util/Collection;)Z", "getHighSpeedVideoSizes", "(I)Landroidx/compose/ui/Modifier$Node;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/Modifier$Node;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "getHighSpeedVideoFpsRangesFor", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "subList", "(II)Ljava/util/List;", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    final class SubList implements java.util.List<androidx.compose.ui.Modifier.Node>, kotlin.jvm.internal.markers.KMappedMarker {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final int getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final int Camera2StreamConfigurationMap;

        public SubList(int i, int i2) {
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoFpsRangesFor = i2;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(java.lang.Object obj) {
            if (obj instanceof androidx.compose.ui.Modifier.Node) {
                return Camera2StreamConfigurationMap((androidx.compose.ui.Modifier.Node) obj);
            }
            return false;
        }

        @Override // java.util.List
        public final int indexOf(java.lang.Object obj) {
            if (obj instanceof androidx.compose.ui.Modifier.Node) {
                return getHighResolutionOutputSizeshNQ4ISI((androidx.compose.ui.Modifier.Node) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public final int lastIndexOf(java.lang.Object obj) {
            if (obj instanceof androidx.compose.ui.Modifier.Node) {
                return getHighSpeedVideoFpsRangesFor((androidx.compose.ui.Modifier.Node) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return getHighSpeedVideoSizes();
        }

        private int getHighSpeedVideoSizes() {
            return this.getHighSpeedVideoFpsRangesFor - this.Camera2StreamConfigurationMap;
        }

        private boolean Camera2StreamConfigurationMap(androidx.compose.ui.Modifier.Node p0) {
            return indexOf(p0) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(java.util.Collection<?> p0) {
            java.util.Iterator<T> it = p0.iterator();
            while (it.hasNext()) {
                if (!contains((androidx.compose.ui.Modifier.Node) it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public androidx.compose.ui.Modifier.Node get(int p0) {
            E e = androidx.compose.ui.node.HitTestResult.this.getHighSpeedVideoSizes.get(p0 + this.Camera2StreamConfigurationMap);
            kotlin.jvm.internal.Intrinsics.checkNotNull(e, "");
            return (androidx.compose.ui.Modifier.Node) e;
        }

        private int getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.Modifier.Node p0) {
            int i = this.Camera2StreamConfigurationMap;
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            if (i > i2) {
                return -1;
            }
            while (!kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.node.HitTestResult.this.getHighSpeedVideoSizes.get(i), p0)) {
                if (i == i2) {
                    return -1;
                }
                i++;
            }
            return i - this.Camera2StreamConfigurationMap;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<androidx.compose.ui.Modifier.Node> iterator() {
            androidx.compose.ui.node.HitTestResult hitTestResult = androidx.compose.ui.node.HitTestResult.this;
            int i = this.Camera2StreamConfigurationMap;
            return hitTestResult.new HitTestResultIterator(i, i, this.getHighSpeedVideoFpsRangesFor);
        }

        private int getHighSpeedVideoFpsRangesFor(androidx.compose.ui.Modifier.Node p0) {
            int i = this.getHighSpeedVideoFpsRangesFor;
            int i2 = this.Camera2StreamConfigurationMap;
            if (i2 > i) {
                return -1;
            }
            while (!kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.node.HitTestResult.this.getHighSpeedVideoSizes.get(i), p0)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.Camera2StreamConfigurationMap;
        }

        @Override // java.util.List
        public final java.util.ListIterator<androidx.compose.ui.Modifier.Node> listIterator() {
            androidx.compose.ui.node.HitTestResult hitTestResult = androidx.compose.ui.node.HitTestResult.this;
            int i = this.Camera2StreamConfigurationMap;
            return hitTestResult.new HitTestResultIterator(i, i, this.getHighSpeedVideoFpsRangesFor);
        }

        @Override // java.util.List
        public final java.util.ListIterator<androidx.compose.ui.Modifier.Node> listIterator(int p0) {
            androidx.compose.ui.node.HitTestResult hitTestResult = androidx.compose.ui.node.HitTestResult.this;
            int i = this.Camera2StreamConfigurationMap;
            return hitTestResult.new HitTestResultIterator(p0 + i, i, this.getHighSpeedVideoFpsRangesFor);
        }

        @Override // java.util.List
        public final java.util.List<androidx.compose.ui.Modifier.Node> subList(int p0, int p1) {
            androidx.compose.ui.node.HitTestResult hitTestResult = androidx.compose.ui.node.HitTestResult.this;
            int i = this.Camera2StreamConfigurationMap;
            return hitTestResult.new SubList(p0 + i, i + p1);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public final java.lang.Object[] toArray() {
            return kotlin.jvm.internal.CollectionToArray.toArray(this);
        }

        @Override // java.util.List
        public final void sort(java.util.Comparator<? super androidx.compose.ui.Modifier.Node> comparator) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* synthetic */ androidx.compose.ui.Modifier.Node set(int i, androidx.compose.ui.Modifier.Node node) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(java.util.Collection<?> collection) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void replaceAll(java.util.function.UnaryOperator<androidx.compose.ui.Modifier.Node> unaryOperator) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* synthetic */ java.lang.Object removeLast() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* synthetic */ java.lang.Object removeFirst() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(java.util.Collection<?> collection) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* synthetic */ androidx.compose.ui.Modifier.Node remove(int i) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* synthetic */ void addLast(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* synthetic */ void addFirst(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(java.util.Collection<? extends androidx.compose.ui.Modifier.Node> collection) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final boolean addAll(int i, java.util.Collection<? extends androidx.compose.ui.Modifier.Node> collection) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* synthetic */ boolean add(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* synthetic */ void add(int i, androidx.compose.ui.Modifier.Node node) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final void hit(androidx.compose.ui.Modifier.Node node, boolean isInLayer, kotlin.jvm.functions.Function0<kotlin.Unit> childHitTest) {
        long highSpeedVideoFpsRangesFor;
        int i = this.getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor + 1, size());
        this.getHighSpeedVideoFpsRangesFor++;
        this.getHighSpeedVideoSizes.add(node);
        androidx.collection.MutableLongList mutableLongList = this.getHighResolutionOutputSizeshNQ4ISI;
        highSpeedVideoFpsRangesFor = androidx.compose.ui.node.HitTestResultKt.getHighSpeedVideoFpsRangesFor(-1.0f, isInLayer, false);
        mutableLongList.add(highSpeedVideoFpsRangesFor);
        childHitTest.invoke();
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public final void hitInMinimumTouchTarget(androidx.compose.ui.Modifier.Node node, float distanceFromEdge, boolean isInLayer, kotlin.jvm.functions.Function0<kotlin.Unit> childHitTest) {
        long highSpeedVideoFpsRangesFor;
        int i = this.getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor + 1, size());
        this.getHighSpeedVideoFpsRangesFor++;
        this.getHighSpeedVideoSizes.add(node);
        androidx.collection.MutableLongList mutableLongList = this.getHighResolutionOutputSizeshNQ4ISI;
        highSpeedVideoFpsRangesFor = androidx.compose.ui.node.HitTestResultKt.getHighSpeedVideoFpsRangesFor(distanceFromEdge, isInLayer, false);
        mutableLongList.add(highSpeedVideoFpsRangesFor);
        childHitTest.invoke();
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.jvm.internal.CollectionToArray.toArray(this);
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator<? super androidx.compose.ui.Modifier.Node> comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ androidx.compose.ui.Modifier.Node set(int i, androidx.compose.ui.Modifier.Node node) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public final androidx.compose.ui.Modifier.Node set2(int i, androidx.compose.ui.Modifier.Node node) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(java.util.function.UnaryOperator<androidx.compose.ui.Modifier.Node> unaryOperator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: removeLast, reason: collision with other method in class */
    public final /* synthetic */ java.lang.Object m7544removeLast() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final androidx.compose.ui.Modifier.Node removeLast() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: removeFirst, reason: collision with other method in class */
    public final /* synthetic */ java.lang.Object m7543removeFirst() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final androidx.compose.ui.Modifier.Node removeFirst() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ androidx.compose.ui.Modifier.Node remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public final androidx.compose.ui.Modifier.Node remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void addLast(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addLast(androidx.compose.ui.Modifier.Node node) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void addFirst(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addFirst(androidx.compose.ui.Modifier.Node node) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends androidx.compose.ui.Modifier.Node> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends androidx.compose.ui.Modifier.Node> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean add(androidx.compose.ui.Modifier.Node node) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ void add(int i, androidx.compose.ui.Modifier.Node node) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public final void add2(int i, androidx.compose.ui.Modifier.Node node) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
