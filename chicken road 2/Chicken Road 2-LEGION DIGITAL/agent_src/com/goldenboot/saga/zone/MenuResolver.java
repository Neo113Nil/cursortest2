package com.goldenboot.saga.zone;

import androidx.compose.ui.RemoteCallback;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002RSB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0004J\u001d\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J.\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001bH\u0086\b¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001bH\u0086\b¢\u0006\u0004\b\u001f\u0010 J>\u0010\"\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001bH\u0086\b¢\u0006\u0004\b\"\u0010#J+\u0010$\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001b¢\u0006\u0004\b$\u0010\u001eJ3\u0010%\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001b¢\u0006\u0004\b%\u0010 J\u001e\u0010'\u001a\u00020\n2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\u001bH\u0086\b¢\u0006\u0004\b'\u0010(J\u0018\u0010*\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u001d\u0010.\u001a\u00020\u00112\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0018\u00101\u001a\u00020\u00022\u0006\u00100\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u0002H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0011H\u0016¢\u0006\u0004\b5\u0010\u0013J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\u000206H\u0096\u0002¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u0002H\u0016¢\u0006\u0004\b9\u00104J\u0015\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020:2\u0006\u00100\u001a\u00020\bH\u0016¢\u0006\u0004\b;\u0010=J%\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010>\u001a\u00020\b2\u0006\u0010?\u001a\u00020\bH\u0016¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020\n¢\u0006\u0004\bB\u0010\u0004R\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010N\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006T"}, d2 = {"Lcom/goldenboot/saga/zone/MenuResolver;", "", "Landroidx/compose/ui/RemoteCallback$LayerUseCase;", "<init>", "()V", "Lcom/goldenboot/saga/zone/ThemeNegotiator;", "flattenPackage", "()J", "", "depth", "Lcom/goldenboot/saga/zone/DpadBuilder;", "updateAction", "(I)V", "startDepth", "endDepth", "connectComponent", "(II)V", "", "filterPayload", "()Z", "releaseHeader", "", "distanceFromEdge", "isInLayer", "dispatchTimezone", "(FZ)Z", "node", "Lkotlin/Function0;", "childHitTest", "inflateEdge", "(Landroidx/compose/ui/RemoteCallback$LayerUseCase;ZLcom/goldenboot/saga/zone/ElevationNode;)V", "packPackage", "(Landroidx/compose/ui/RemoteCallback$LayerUseCase;FZLcom/goldenboot/saga/zone/ElevationNode;)V", "isInExpandedBounds", "unlockMessage", "(Landroidx/compose/ui/RemoteCallback$LayerUseCase;FZZLcom/goldenboot/saga/zone/ElevationNode;)V", "queryModel", "resumeSignature", "block", "formatPosition", "(Lcom/goldenboot/saga/zone/ElevationNode;)V", "element", "syncScope", "(Landroidx/compose/ui/RemoteCallback$LayerUseCase;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "injectConstraint", "(I)Landroidx/compose/ui/RemoteCallback$LayerUseCase;", "bindBody", "(Landroidx/compose/ui/RemoteCallback$LayerUseCase;)I", "isEmpty", "", "iterator", "()Ljava/util/Iterator;", "parseAsset", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "clear", "Lcom/goldenboot/saga/zone/SlotWorkflow;", "", "reduceScope", "Lcom/goldenboot/saga/zone/SlotWorkflow;", "values", "Lcom/goldenboot/saga/zone/RuntimeStage;", "notifyMessage", "Lcom/goldenboot/saga/zone/RuntimeStage;", "distanceFromEdgeAndFlags", "connectPatch", "I", "hitDepth", "storeCharset", "()I", "size", "ActivityMutator", "BounceHandler", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MenuResolver implements List<RemoteCallback.LayerUseCase>, KMappedMarker {
    public static final int attachConfig = 8;

    /* renamed from: reduceScope, reason: from kotlin metadata */
    private SlotWorkflow values = new SlotWorkflow(16);

    /* renamed from: notifyMessage, reason: from kotlin metadata */
    private RuntimeStage distanceFromEdgeAndFlags = new RuntimeStage(16);

    /* renamed from: connectPatch, reason: from kotlin metadata */
    private int hitDepth = -1;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u000f\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ%\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b'\u0010&R\u0014\u0010)\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&¨\u0006*"}, d2 = {"Lcom/goldenboot/saga/zone/MenuResolver$BounceHandler;", "", "Landroidx/compose/ui/RemoteCallback$LayerUseCase;", "", "minIndex", "maxIndex", "<init>", "(Lcom/goldenboot/saga/zone/MenuResolver;II)V", "element", "", "notifyMessage", "(Landroidx/compose/ui/RemoteCallback$LayerUseCase;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "inflateAdapter", "(I)Landroidx/compose/ui/RemoteCallback$LayerUseCase;", "mergeLocale", "(Landroidx/compose/ui/RemoteCallback$LayerUseCase;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "syncScope", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "reduceScope", "I", "expandArgs", "()I", "drawScope", "findTask", "size", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class BounceHandler implements List<RemoteCallback.LayerUseCase>, KMappedMarker {

        /* renamed from: notifyMessage, reason: from kotlin metadata */
        private final int maxIndex;

        /* renamed from: reduceScope, reason: from kotlin metadata */
        private final int minIndex;

        public BounceHandler(int i, int i2) {
            this.minIndex = i;
            this.maxIndex = i2;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i, RemoteCallback.LayerUseCase layerUseCase) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends RemoteCallback.LayerUseCase> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void applyTask(RemoteCallback.LayerUseCase layerUseCase) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean clipOrigin(RemoteCallback.LayerUseCase layerUseCase) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof RemoteCallback.LayerUseCase) {
                return notifyMessage((RemoteCallback.LayerUseCase) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<?> elements) {
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains((RemoteCallback.LayerUseCase) it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: drawScope, reason: from getter */
        public final int getMaxIndex() {
            return this.maxIndex;
        }

        /* renamed from: expandArgs, reason: from getter */
        public final int getMinIndex() {
            return this.minIndex;
        }

        public RemoteCallback.LayerUseCase filterPayload(int i, RemoteCallback.LayerUseCase layerUseCase) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public int findTask() {
            return this.maxIndex - this.minIndex;
        }

        public RemoteCallback.LayerUseCase flattenPackage(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof RemoteCallback.LayerUseCase) {
                return mergeLocale((RemoteCallback.LayerUseCase) obj);
            }
            return -1;
        }

        @Override // java.util.List
        /* renamed from: inflateAdapter, reason: merged with bridge method [inline-methods] */
        public RemoteCallback.LayerUseCase get(int index) {
            Object injectMetric = MenuResolver.this.values.injectMetric(index + this.minIndex);
            Intrinsics.checkNotNull(injectMetric, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (RemoteCallback.LayerUseCase) injectMetric;
        }

        public RemoteCallback.LayerUseCase injectConstraint() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<RemoteCallback.LayerUseCase> iterator() {
            MenuResolver menuResolver = MenuResolver.this;
            int i = this.minIndex;
            return menuResolver.new ActivityMutator(i, i, this.maxIndex);
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof RemoteCallback.LayerUseCase) {
                return syncScope((RemoteCallback.LayerUseCase) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator<RemoteCallback.LayerUseCase> listIterator() {
            MenuResolver menuResolver = MenuResolver.this;
            int i = this.minIndex;
            return menuResolver.new ActivityMutator(i, i, this.maxIndex);
        }

        public int mergeLocale(RemoteCallback.LayerUseCase element) {
            int i = this.minIndex;
            int i2 = this.maxIndex;
            if (i > i2) {
                return -1;
            }
            while (!Intrinsics.areEqual(MenuResolver.this.values.injectMetric(i), element)) {
                if (i == i2) {
                    return -1;
                }
                i++;
            }
            return i - this.minIndex;
        }

        public boolean notifyMessage(RemoteCallback.LayerUseCase element) {
            return indexOf(element) != -1;
        }

        public void releaseHeader(int i, RemoteCallback.LayerUseCase layerUseCase) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ RemoteCallback.LayerUseCase remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ Object removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ Object removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<RemoteCallback.LayerUseCase> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void serializeOffset(RemoteCallback.LayerUseCase layerUseCase) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ RemoteCallback.LayerUseCase set(int i, RemoteCallback.LayerUseCase layerUseCase) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return findTask();
        }

        @Override // java.util.List
        public void sort(Comparator<? super RemoteCallback.LayerUseCase> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public RemoteCallback.LayerUseCase storeCharset() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List<RemoteCallback.LayerUseCase> subList(int fromIndex, int toIndex) {
            MenuResolver menuResolver = MenuResolver.this;
            int i = this.minIndex;
            return menuResolver.new BounceHandler(fromIndex + i, i + toIndex);
        }

        public int syncScope(RemoteCallback.LayerUseCase element) {
            int i = this.maxIndex;
            int i2 = this.minIndex;
            if (i2 > i) {
                return -1;
            }
            while (!Intrinsics.areEqual(MenuResolver.this.values.injectMetric(i), element)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.minIndex;
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends RemoteCallback.LayerUseCase> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public ListIterator<RemoteCallback.LayerUseCase> listIterator(int index) {
            MenuResolver menuResolver = MenuResolver.this;
            int i = this.minIndex;
            return menuResolver.new ActivityMutator(index + i, i, this.maxIndex);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) CollectionToArray.toArray(this, tArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void connectComponent(int startDepth, int endDepth) {
        if (startDepth >= endDepth) {
            return;
        }
        this.values.resetDelta(startDepth, endDepth);
        this.distanceFromEdgeAndFlags.applyTask(startDepth, endDepth);
    }

    private final long flattenPackage() {
        long growPayload = FocusNotifier.growPayload(Float.POSITIVE_INFINITY, false, false, 4, null);
        int i = this.hitDepth + 1;
        int reduceScope = CursorBuilder.reduceScope(this);
        if (i <= reduceScope) {
            while (true) {
                long injectMetric = ThemeNegotiator.injectMetric(this.distanceFromEdgeAndFlags.evictLayout(i));
                if (ThemeNegotiator.growPayload(injectMetric, growPayload) < 0) {
                    growPayload = injectMetric;
                }
                if ((ThemeNegotiator.clipOrigin(growPayload) < 0.0f && ThemeNegotiator.popBlueprint(growPayload)) || i == reduceScope) {
                    break;
                }
                i++;
            }
        }
        return growPayload;
    }

    private final void updateAction(int depth) {
        this.values.attachConfig(depth);
        this.distanceFromEdgeAndFlags.updateTimer(depth);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, RemoteCallback.LayerUseCase layerUseCase) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends RemoteCallback.LayerUseCase> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public RemoteCallback.LayerUseCase attachCallback() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int bindBody(RemoteCallback.LayerUseCase element) {
        int reduceScope = CursorBuilder.reduceScope(this);
        if (reduceScope < 0) {
            return -1;
        }
        int i = 0;
        while (!Intrinsics.areEqual(this.values.injectMetric(i), element)) {
            if (i == reduceScope) {
                return -1;
            }
            i++;
        }
        return i;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.hitDepth = -1;
        this.values.serializeOffset();
        this.distanceFromEdgeAndFlags.clipOrigin();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof RemoteCallback.LayerUseCase) {
            return syncScope((RemoteCallback.LayerUseCase) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains((RemoteCallback.LayerUseCase) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean dispatchTimezone(float distanceFromEdge, boolean isInLayer) {
        if (this.hitDepth == CursorBuilder.reduceScope(this)) {
            return true;
        }
        return ThemeNegotiator.growPayload(flattenPackage(), FocusNotifier.growPayload(distanceFromEdge, isInLayer, false, 4, null)) > 0;
    }

    public void drawScope(int i, RemoteCallback.LayerUseCase layerUseCase) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean expandArgs(RemoteCallback.LayerUseCase layerUseCase) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean filterPayload() {
        long flattenPackage = flattenPackage();
        return ThemeNegotiator.clipOrigin(flattenPackage) < 0.0f && ThemeNegotiator.popBlueprint(flattenPackage) && !ThemeNegotiator.applyTask(flattenPackage);
    }

    public void findTask(RemoteCallback.LayerUseCase layerUseCase) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void formatPosition(ElevationNode block) {
        int i = this.hitDepth;
        block.invoke();
        this.hitDepth = i;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof RemoteCallback.LayerUseCase) {
            return bindBody((RemoteCallback.LayerUseCase) obj);
        }
        return -1;
    }

    public final void inflateEdge(RemoteCallback.LayerUseCase node, boolean isInLayer, ElevationNode childHitTest) {
        long evictLayout;
        int i = this.hitDepth;
        connectComponent(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.drawField(node);
        RuntimeStage runtimeStage = this.distanceFromEdgeAndFlags;
        evictLayout = FocusNotifier.evictLayout(-1.0f, isInLayer, false);
        runtimeStage.detachStream(evictLayout);
        childHitTest.invoke();
        this.hitDepth = i;
    }

    @Override // java.util.List
    /* renamed from: injectConstraint, reason: merged with bridge method [inline-methods] */
    public RemoteCallback.LayerUseCase get(int index) {
        Object injectMetric = this.values.injectMetric(index);
        Intrinsics.checkNotNull(injectMetric, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (RemoteCallback.LayerUseCase) injectMetric;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.values.clipOrigin();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<RemoteCallback.LayerUseCase> iterator() {
        return new ActivityMutator(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof RemoteCallback.LayerUseCase) {
            return parseAsset((RemoteCallback.LayerUseCase) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<RemoteCallback.LayerUseCase> listIterator() {
        return new ActivityMutator(this, 0, 0, 0, 7, null);
    }

    public RemoteCallback.LayerUseCase mapJob(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void mergeLocale(RemoteCallback.LayerUseCase layerUseCase) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void packPackage(RemoteCallback.LayerUseCase node, float distanceFromEdge, boolean isInLayer, ElevationNode childHitTest) {
        long evictLayout;
        int i = this.hitDepth;
        connectComponent(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.drawField(node);
        RuntimeStage runtimeStage = this.distanceFromEdgeAndFlags;
        evictLayout = FocusNotifier.evictLayout(distanceFromEdge, isInLayer, false);
        runtimeStage.detachStream(evictLayout);
        childHitTest.invoke();
        this.hitDepth = i;
    }

    public int parseAsset(RemoteCallback.LayerUseCase element) {
        for (int reduceScope = CursorBuilder.reduceScope(this); -1 < reduceScope; reduceScope--) {
            if (Intrinsics.areEqual(this.values.injectMetric(reduceScope), element)) {
                return reduceScope;
            }
        }
        return -1;
    }

    public RemoteCallback.LayerUseCase prepareTask() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void queryModel(RemoteCallback.LayerUseCase node, boolean isInLayer, ElevationNode childHitTest) {
        long evictLayout;
        long evictLayout2;
        long evictLayout3;
        if (this.hitDepth == CursorBuilder.reduceScope(this)) {
            int i = this.hitDepth;
            connectComponent(this.hitDepth + 1, size());
            this.hitDepth++;
            this.values.drawField(node);
            RuntimeStage runtimeStage = this.distanceFromEdgeAndFlags;
            evictLayout3 = FocusNotifier.evictLayout(0.0f, isInLayer, true);
            runtimeStage.detachStream(evictLayout3);
            childHitTest.invoke();
            this.hitDepth = i;
            return;
        }
        long flattenPackage = flattenPackage();
        int i2 = this.hitDepth;
        if (!ThemeNegotiator.applyTask(flattenPackage)) {
            if (ThemeNegotiator.clipOrigin(flattenPackage) > 0.0f) {
                int i3 = this.hitDepth;
                connectComponent(this.hitDepth + 1, size());
                this.hitDepth++;
                this.values.drawField(node);
                RuntimeStage runtimeStage2 = this.distanceFromEdgeAndFlags;
                evictLayout = FocusNotifier.evictLayout(0.0f, isInLayer, true);
                runtimeStage2.detachStream(evictLayout);
                childHitTest.invoke();
                this.hitDepth = i3;
                return;
            }
            return;
        }
        this.hitDepth = CursorBuilder.reduceScope(this);
        int i4 = this.hitDepth;
        connectComponent(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.drawField(node);
        RuntimeStage runtimeStage3 = this.distanceFromEdgeAndFlags;
        evictLayout2 = FocusNotifier.evictLayout(0.0f, isInLayer, true);
        runtimeStage3.detachStream(evictLayout2);
        childHitTest.invoke();
        this.hitDepth = i4;
        if (ThemeNegotiator.clipOrigin(flattenPackage()) < 0.0f) {
            connectComponent(i2 + 1, this.hitDepth + 1);
        }
        this.hitDepth = i2;
    }

    public final void releaseHeader() {
        this.hitDepth = size() - 1;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ RemoteCallback.LayerUseCase remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<RemoteCallback.LayerUseCase> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void resumeSignature(RemoteCallback.LayerUseCase node, float distanceFromEdge, boolean isInLayer, ElevationNode childHitTest) {
        long evictLayout;
        long evictLayout2;
        if (this.hitDepth == CursorBuilder.reduceScope(this)) {
            int i = this.hitDepth;
            connectComponent(this.hitDepth + 1, size());
            this.hitDepth++;
            this.values.drawField(node);
            RuntimeStage runtimeStage = this.distanceFromEdgeAndFlags;
            evictLayout2 = FocusNotifier.evictLayout(distanceFromEdge, isInLayer, false);
            runtimeStage.detachStream(evictLayout2);
            childHitTest.invoke();
            this.hitDepth = i;
            if (this.hitDepth + 1 == CursorBuilder.reduceScope(this) || ThemeNegotiator.applyTask(flattenPackage())) {
                updateAction(this.hitDepth + 1);
                return;
            }
            return;
        }
        long flattenPackage = flattenPackage();
        int i2 = this.hitDepth;
        this.hitDepth = CursorBuilder.reduceScope(this);
        int i3 = this.hitDepth;
        connectComponent(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.drawField(node);
        RuntimeStage runtimeStage2 = this.distanceFromEdgeAndFlags;
        evictLayout = FocusNotifier.evictLayout(distanceFromEdge, isInLayer, false);
        runtimeStage2.detachStream(evictLayout);
        childHitTest.invoke();
        this.hitDepth = i3;
        long flattenPackage2 = flattenPackage();
        if (this.hitDepth + 1 >= CursorBuilder.reduceScope(this) || ThemeNegotiator.growPayload(flattenPackage, flattenPackage2) <= 0) {
            connectComponent(this.hitDepth + 1, size());
        } else {
            connectComponent(i2 + 1, ThemeNegotiator.applyTask(flattenPackage2) ? this.hitDepth + 2 : this.hitDepth + 1);
        }
        this.hitDepth = i2;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ RemoteCallback.LayerUseCase set(int i, RemoteCallback.LayerUseCase layerUseCase) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return storeCharset();
    }

    @Override // java.util.List
    public void sort(Comparator<? super RemoteCallback.LayerUseCase> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public RemoteCallback.LayerUseCase startResource(int i, RemoteCallback.LayerUseCase layerUseCase) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int storeCharset() {
        return this.values.detachStream();
    }

    @Override // java.util.List
    public List<RemoteCallback.LayerUseCase> subList(int fromIndex, int toIndex) {
        return new BounceHandler(fromIndex, toIndex);
    }

    public boolean syncScope(RemoteCallback.LayerUseCase element) {
        return indexOf(element) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public final void unlockMessage(RemoteCallback.LayerUseCase node, float distanceFromEdge, boolean isInLayer, boolean isInExpandedBounds, ElevationNode childHitTest) {
        long evictLayout;
        int i = this.hitDepth;
        connectComponent(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.drawField(node);
        RuntimeStage runtimeStage = this.distanceFromEdgeAndFlags;
        evictLayout = FocusNotifier.evictLayout(distanceFromEdge, isInLayer, isInExpandedBounds);
        runtimeStage.detachStream(evictLayout);
        childHitTest.invoke();
        this.hitDepth = i;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends RemoteCallback.LayerUseCase> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<RemoteCallback.LayerUseCase> listIterator(int index) {
        return new ActivityMutator(this, index, 0, 0, 6, null);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.toArray(this, tArr);
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/goldenboot/saga/zone/MenuResolver$ActivityMutator;", "", "Landroidx/compose/ui/RemoteCallback$LayerUseCase;", "", "index", "minIndex", "maxIndex", "<init>", "(Lcom/goldenboot/saga/zone/MenuResolver;III)V", "", "hasNext", "()Z", "hasPrevious", "applyTask", "()Landroidx/compose/ui/RemoteCallback$LayerUseCase;", "nextIndex", "()I", "popBlueprint", "previousIndex", "reduceScope", "I", "detachStream", "notifyMessage", "(I)V", "clipOrigin", "connectPatch", "releaseHeader", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class ActivityMutator implements ListIterator<RemoteCallback.LayerUseCase>, KMappedMarker {

        /* renamed from: connectPatch, reason: from kotlin metadata */
        private final int maxIndex;

        /* renamed from: notifyMessage, reason: from kotlin metadata */
        private final int minIndex;

        /* renamed from: reduceScope, reason: from kotlin metadata */
        private int index;

        public ActivityMutator(int i, int i2, int i3) {
            this.index = i;
            this.minIndex = i2;
            this.maxIndex = i3;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(RemoteCallback.LayerUseCase layerUseCase) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: applyTask, reason: merged with bridge method [inline-methods] */
        public RemoteCallback.LayerUseCase next() {
            SlotWorkflow slotWorkflow = MenuResolver.this.values;
            int i = this.index;
            this.index = i + 1;
            Object injectMetric = slotWorkflow.injectMetric(i);
            Intrinsics.checkNotNull(injectMetric, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (RemoteCallback.LayerUseCase) injectMetric;
        }

        /* renamed from: clipOrigin, reason: from getter */
        public final int getMinIndex() {
            return this.minIndex;
        }

        /* renamed from: detachStream, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.maxIndex;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > this.minIndex;
        }

        public void injectMetric(RemoteCallback.LayerUseCase layerUseCase) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index - this.minIndex;
        }

        public final void notifyMessage(int i) {
            this.index = i;
        }

        @Override // java.util.ListIterator
        /* renamed from: popBlueprint, reason: merged with bridge method [inline-methods] */
        public RemoteCallback.LayerUseCase previous() {
            SlotWorkflow slotWorkflow = MenuResolver.this.values;
            int i = this.index - 1;
            this.index = i;
            Object injectMetric = slotWorkflow.injectMetric(i);
            Intrinsics.checkNotNull(injectMetric, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (RemoteCallback.LayerUseCase) injectMetric;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }

        /* renamed from: releaseHeader, reason: from getter */
        public final int getMaxIndex() {
            return this.maxIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void serializeOffset(RemoteCallback.LayerUseCase layerUseCase) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(RemoteCallback.LayerUseCase layerUseCase) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ ActivityMutator(MenuResolver menuResolver, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? menuResolver.size() : i3);
        }
    }
}
