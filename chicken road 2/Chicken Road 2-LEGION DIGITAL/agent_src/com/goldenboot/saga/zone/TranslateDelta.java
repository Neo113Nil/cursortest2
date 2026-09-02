package com.goldenboot.saga.zone;

import android.os.Parcel;
import android.os.Parcelable;
import com.goldenboot.saga.zone.DragHub;
import com.goldenboot.saga.zone.TranslateDelta;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class TranslateDelta implements Parcelable, BorderHook, List, RandomAccess, KMutableList {
    public ScopedFormer reduceScope;
    public static final BounceHandler notifyMessage = new BounceHandler(null);
    public static final Parcelable.Creator<TranslateDelta> CREATOR = new ActivityMutator();

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator implements Parcelable.ClassLoaderCreator {
        public static final Object detachStream(Parcel parcel, ClassLoader classLoader, int i) {
            return parcel.readValue(classLoader);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: growPayload, reason: merged with bridge method [inline-methods] */
        public TranslateDelta createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: injectMetric, reason: merged with bridge method [inline-methods] */
        public TranslateDelta createFromParcel(final Parcel parcel, final ClassLoader classLoader) {
            if (classLoader == null) {
                classLoader = ActivityMutator.class.getClassLoader();
            }
            return TouchTransformer.evictLayout(parcel.readInt(), new TouchRecord() { // from class: com.goldenboot.saga.zone.PipelineToggle
                @Override // com.goldenboot.saga.zone.TouchRecord
                public final Object invoke(Object obj) {
                    Object detachStream;
                    detachStream = TranslateDelta.ActivityMutator.detachStream(parcel, classLoader, ((Integer) obj).intValue());
                    return detachStream;
                }
            });
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: releaseHeader, reason: merged with bridge method [inline-methods] */
        public TranslateDelta[] newArray(int i) {
            return new TranslateDelta[i];
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler {
        public /* synthetic */ BounceHandler(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public BounceHandler() {
        }
    }

    public TranslateDelta(DragHub dragHub) {
        this.reduceScope = TouchTransformer.connectJob(this, dragHub);
    }

    public static final boolean expandArgs(int i, Collection collection, List list) {
        return list.addAll(i, collection);
    }

    public static final boolean flattenPackage(Collection collection, List list) {
        return list.retainAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        int popBlueprint;
        DragHub applyTask;
        ItemGovernor injectMetric;
        boolean clipOrigin;
        do {
            synchronized (TouchTransformer.evictLayout) {
                ScopedFormer releaseHeader = releaseHeader();
                Intrinsics.checkNotNull(releaseHeader, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                PatternComposer patternComposer = (PatternComposer) WaveBenchmark.unlockMessage((PatternComposer) releaseHeader);
                popBlueprint = patternComposer.popBlueprint();
                applyTask = patternComposer.applyTask();
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            }
            Intrinsics.checkNotNull(applyTask);
            DragHub add = applyTask.add(obj);
            if (Intrinsics.areEqual(add, applyTask)) {
                return false;
            }
            ScopedFormer releaseHeader2 = releaseHeader();
            Intrinsics.checkNotNull(releaseHeader2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            PatternComposer patternComposer2 = (PatternComposer) releaseHeader2;
            synchronized (WaveBenchmark.mapJob()) {
                injectMetric = ItemGovernor.releaseHeader.injectMetric();
                clipOrigin = TouchTransformer.clipOrigin((PatternComposer) WaveBenchmark.growCallback(patternComposer2, this, injectMetric), popBlueprint, add, true);
            }
            WaveBenchmark.cancelArchive(injectMetric, this);
        } while (!clipOrigin);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(final int i, final Collection collection) {
        return TouchTransformer.drawField(this, new TouchRecord() { // from class: com.goldenboot.saga.zone.ContentEntry
            @Override // com.goldenboot.saga.zone.TouchRecord
            public final Object invoke(Object obj) {
                boolean expandArgs;
                expandArgs = TranslateDelta.expandArgs(i, collection, (List) obj);
                return Boolean.valueOf(expandArgs);
            }
        });
    }

    @Override // com.goldenboot.saga.zone.BorderHook
    public void applyTask(ScopedFormer scopedFormer) {
        scopedFormer.flushSample(releaseHeader());
        Intrinsics.checkNotNull(scopedFormer, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.reduceScope = (PatternComposer) scopedFormer;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        ItemGovernor injectMetric;
        ScopedFormer releaseHeader = releaseHeader();
        Intrinsics.checkNotNull(releaseHeader, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        PatternComposer patternComposer = (PatternComposer) releaseHeader;
        synchronized (WaveBenchmark.mapJob()) {
            injectMetric = ItemGovernor.releaseHeader.injectMetric();
            PatternComposer patternComposer2 = (PatternComposer) WaveBenchmark.growCallback(patternComposer, this, injectMetric);
            synchronized (TouchTransformer.evictLayout) {
                patternComposer2.connectJob(PopupOperation.growPayload());
                patternComposer2.peekRevision(patternComposer2.popBlueprint() + 1);
                patternComposer2.serializeOffset(patternComposer2.drawField() + 1);
            }
        }
        WaveBenchmark.cancelArchive(injectMetric, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return TouchTransformer.flushSample(this).applyTask().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        return TouchTransformer.flushSample(this).applyTask().containsAll(collection);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int findTask() {
        return TouchTransformer.flushSample(this).applyTask().size();
    }

    @Override // java.util.List
    public Object get(int i) {
        return TouchTransformer.flushSample(this).applyTask().get(i);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return TouchTransformer.flushSample(this).applyTask().indexOf(obj);
    }

    public final int injectConstraint(Collection collection, int i, int i2) {
        int popBlueprint;
        DragHub applyTask;
        ItemGovernor injectMetric;
        boolean clipOrigin;
        int size = size();
        do {
            synchronized (TouchTransformer.evictLayout) {
                ScopedFormer releaseHeader = releaseHeader();
                Intrinsics.checkNotNull(releaseHeader, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                PatternComposer patternComposer = (PatternComposer) WaveBenchmark.unlockMessage((PatternComposer) releaseHeader);
                popBlueprint = patternComposer.popBlueprint();
                applyTask = patternComposer.applyTask();
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            }
            Intrinsics.checkNotNull(applyTask);
            DragHub.ActivityMutator builder = applyTask.builder();
            builder.subList(i, i2).retainAll(collection);
            DragHub build = builder.build();
            if (Intrinsics.areEqual(build, applyTask)) {
                break;
            }
            ScopedFormer releaseHeader2 = releaseHeader();
            Intrinsics.checkNotNull(releaseHeader2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            PatternComposer patternComposer2 = (PatternComposer) releaseHeader2;
            synchronized (WaveBenchmark.mapJob()) {
                injectMetric = ItemGovernor.releaseHeader.injectMetric();
                clipOrigin = TouchTransformer.clipOrigin((PatternComposer) WaveBenchmark.growCallback(patternComposer2, this, injectMetric), popBlueprint, build, true);
            }
            WaveBenchmark.cancelArchive(injectMetric, this);
        } while (!clipOrigin);
        return size - size();
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return TouchTransformer.flushSample(this).applyTask().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return TouchTransformer.flushSample(this).applyTask().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new ToastInterpreter(this, 0);
    }

    public Object mergeLocale(int i) {
        int popBlueprint;
        DragHub applyTask;
        ItemGovernor injectMetric;
        boolean clipOrigin;
        Object obj = get(i);
        do {
            synchronized (TouchTransformer.evictLayout) {
                ScopedFormer releaseHeader = releaseHeader();
                Intrinsics.checkNotNull(releaseHeader, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                PatternComposer patternComposer = (PatternComposer) WaveBenchmark.unlockMessage((PatternComposer) releaseHeader);
                popBlueprint = patternComposer.popBlueprint();
                applyTask = patternComposer.applyTask();
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            }
            Intrinsics.checkNotNull(applyTask);
            DragHub drawField = applyTask.drawField(i);
            if (Intrinsics.areEqual(drawField, applyTask)) {
                return obj;
            }
            ScopedFormer releaseHeader2 = releaseHeader();
            Intrinsics.checkNotNull(releaseHeader2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            PatternComposer patternComposer2 = (PatternComposer) releaseHeader2;
            synchronized (WaveBenchmark.mapJob()) {
                injectMetric = ItemGovernor.releaseHeader.injectMetric();
                clipOrigin = TouchTransformer.clipOrigin((PatternComposer) WaveBenchmark.growCallback(patternComposer2, this, injectMetric), popBlueprint, drawField, true);
            }
            WaveBenchmark.cancelArchive(injectMetric, this);
        } while (!clipOrigin);
        return obj;
    }

    @Override // com.goldenboot.saga.zone.BorderHook
    public ScopedFormer releaseHeader() {
        return this.reduceScope;
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        return mergeLocale(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        int popBlueprint;
        DragHub applyTask;
        ItemGovernor injectMetric;
        boolean clipOrigin;
        do {
            synchronized (TouchTransformer.evictLayout) {
                ScopedFormer releaseHeader = releaseHeader();
                Intrinsics.checkNotNull(releaseHeader, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                PatternComposer patternComposer = (PatternComposer) WaveBenchmark.unlockMessage((PatternComposer) releaseHeader);
                popBlueprint = patternComposer.popBlueprint();
                applyTask = patternComposer.applyTask();
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            }
            Intrinsics.checkNotNull(applyTask);
            DragHub removeAll = applyTask.removeAll(collection);
            if (Intrinsics.areEqual(removeAll, applyTask)) {
                return false;
            }
            ScopedFormer releaseHeader2 = releaseHeader();
            Intrinsics.checkNotNull(releaseHeader2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            PatternComposer patternComposer2 = (PatternComposer) releaseHeader2;
            synchronized (WaveBenchmark.mapJob()) {
                injectMetric = ItemGovernor.releaseHeader.injectMetric();
                clipOrigin = TouchTransformer.clipOrigin((PatternComposer) WaveBenchmark.growCallback(patternComposer2, this, injectMetric), popBlueprint, removeAll, true);
            }
            WaveBenchmark.cancelArchive(injectMetric, this);
        } while (!clipOrigin);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(final Collection collection) {
        return TouchTransformer.drawField(this, new TouchRecord() { // from class: com.goldenboot.saga.zone.SlideProcess
            @Override // com.goldenboot.saga.zone.TouchRecord
            public final Object invoke(Object obj) {
                boolean flattenPackage;
                flattenPackage = TranslateDelta.flattenPackage(collection, (List) obj);
                return Boolean.valueOf(flattenPackage);
            }
        });
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        int popBlueprint;
        DragHub applyTask;
        ItemGovernor injectMetric;
        boolean clipOrigin;
        Object obj2 = get(i);
        do {
            synchronized (TouchTransformer.evictLayout) {
                ScopedFormer releaseHeader = releaseHeader();
                Intrinsics.checkNotNull(releaseHeader, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                PatternComposer patternComposer = (PatternComposer) WaveBenchmark.unlockMessage((PatternComposer) releaseHeader);
                popBlueprint = patternComposer.popBlueprint();
                applyTask = patternComposer.applyTask();
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            }
            Intrinsics.checkNotNull(applyTask);
            DragHub dragHub = applyTask.set(i, obj);
            if (Intrinsics.areEqual(dragHub, applyTask)) {
                return obj2;
            }
            ScopedFormer releaseHeader2 = releaseHeader();
            Intrinsics.checkNotNull(releaseHeader2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            PatternComposer patternComposer2 = (PatternComposer) releaseHeader2;
            synchronized (WaveBenchmark.mapJob()) {
                injectMetric = ItemGovernor.releaseHeader.injectMetric();
                clipOrigin = TouchTransformer.clipOrigin((PatternComposer) WaveBenchmark.growCallback(patternComposer2, this, injectMetric), popBlueprint, dragHub, false);
            }
            WaveBenchmark.cancelArchive(injectMetric, this);
        } while (!clipOrigin);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return findTask();
    }

    public final List storeCharset() {
        return TouchTransformer.flushSample(this).applyTask();
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            NotificationCoordinator.evictLayout("fromIndex or toIndex are out of bounds");
        }
        return new BridgeReceiver(this, i, i2);
    }

    public final void syncScope(int i, int i2) {
        int popBlueprint;
        DragHub applyTask;
        ItemGovernor injectMetric;
        boolean clipOrigin;
        do {
            synchronized (TouchTransformer.evictLayout) {
                ScopedFormer releaseHeader = releaseHeader();
                Intrinsics.checkNotNull(releaseHeader, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                PatternComposer patternComposer = (PatternComposer) WaveBenchmark.unlockMessage((PatternComposer) releaseHeader);
                popBlueprint = patternComposer.popBlueprint();
                applyTask = patternComposer.applyTask();
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            }
            Intrinsics.checkNotNull(applyTask);
            DragHub.ActivityMutator builder = applyTask.builder();
            builder.subList(i, i2).clear();
            DragHub build = builder.build();
            if (Intrinsics.areEqual(build, applyTask)) {
                return;
            }
            ScopedFormer releaseHeader2 = releaseHeader();
            Intrinsics.checkNotNull(releaseHeader2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            PatternComposer patternComposer2 = (PatternComposer) releaseHeader2;
            synchronized (WaveBenchmark.mapJob()) {
                injectMetric = ItemGovernor.releaseHeader.injectMetric();
                clipOrigin = TouchTransformer.clipOrigin((PatternComposer) WaveBenchmark.growCallback(patternComposer2, this, injectMetric), popBlueprint, build, true);
            }
            WaveBenchmark.cancelArchive(injectMetric, this);
        } while (!clipOrigin);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public String toString() {
        ScopedFormer releaseHeader = releaseHeader();
        Intrinsics.checkNotNull(releaseHeader, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((PatternComposer) WaveBenchmark.unlockMessage((PatternComposer) releaseHeader)).applyTask() + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        List storeCharset = storeCharset();
        int size = storeCharset.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeValue(storeCharset.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        int popBlueprint;
        DragHub applyTask;
        ItemGovernor injectMetric;
        boolean clipOrigin;
        do {
            synchronized (TouchTransformer.evictLayout) {
                ScopedFormer releaseHeader = releaseHeader();
                Intrinsics.checkNotNull(releaseHeader, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                PatternComposer patternComposer = (PatternComposer) WaveBenchmark.unlockMessage((PatternComposer) releaseHeader);
                popBlueprint = patternComposer.popBlueprint();
                applyTask = patternComposer.applyTask();
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            }
            Intrinsics.checkNotNull(applyTask);
            DragHub addAll = applyTask.addAll(collection);
            if (Intrinsics.areEqual(addAll, applyTask)) {
                return false;
            }
            ScopedFormer releaseHeader2 = releaseHeader();
            Intrinsics.checkNotNull(releaseHeader2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            PatternComposer patternComposer2 = (PatternComposer) releaseHeader2;
            synchronized (WaveBenchmark.mapJob()) {
                injectMetric = ItemGovernor.releaseHeader.injectMetric();
                clipOrigin = TouchTransformer.clipOrigin((PatternComposer) WaveBenchmark.growCallback(patternComposer2, this, injectMetric), popBlueprint, addAll, true);
            }
            WaveBenchmark.cancelArchive(injectMetric, this);
        } while (!clipOrigin);
        return true;
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return new ToastInterpreter(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int popBlueprint;
        DragHub applyTask;
        ItemGovernor injectMetric;
        boolean clipOrigin;
        do {
            synchronized (TouchTransformer.evictLayout) {
                ScopedFormer releaseHeader = releaseHeader();
                Intrinsics.checkNotNull(releaseHeader, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                PatternComposer patternComposer = (PatternComposer) WaveBenchmark.unlockMessage((PatternComposer) releaseHeader);
                popBlueprint = patternComposer.popBlueprint();
                applyTask = patternComposer.applyTask();
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            }
            Intrinsics.checkNotNull(applyTask);
            DragHub remove = applyTask.remove(obj);
            if (Intrinsics.areEqual(remove, applyTask)) {
                return false;
            }
            ScopedFormer releaseHeader2 = releaseHeader();
            Intrinsics.checkNotNull(releaseHeader2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            PatternComposer patternComposer2 = (PatternComposer) releaseHeader2;
            synchronized (WaveBenchmark.mapJob()) {
                injectMetric = ItemGovernor.releaseHeader.injectMetric();
                clipOrigin = TouchTransformer.clipOrigin((PatternComposer) WaveBenchmark.growCallback(patternComposer2, this, injectMetric), popBlueprint, remove, true);
            }
            WaveBenchmark.cancelArchive(injectMetric, this);
        } while (!clipOrigin);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return CollectionToArray.toArray(this, objArr);
    }

    public TranslateDelta() {
        this(PopupOperation.growPayload());
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        int popBlueprint;
        DragHub applyTask;
        ItemGovernor injectMetric;
        boolean clipOrigin;
        do {
            synchronized (TouchTransformer.evictLayout) {
                ScopedFormer releaseHeader = releaseHeader();
                Intrinsics.checkNotNull(releaseHeader, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                PatternComposer patternComposer = (PatternComposer) WaveBenchmark.unlockMessage((PatternComposer) releaseHeader);
                popBlueprint = patternComposer.popBlueprint();
                applyTask = patternComposer.applyTask();
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            }
            Intrinsics.checkNotNull(applyTask);
            DragHub add = applyTask.add(i, obj);
            if (Intrinsics.areEqual(add, applyTask)) {
                return;
            }
            ScopedFormer releaseHeader2 = releaseHeader();
            Intrinsics.checkNotNull(releaseHeader2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            PatternComposer patternComposer2 = (PatternComposer) releaseHeader2;
            synchronized (WaveBenchmark.mapJob()) {
                injectMetric = ItemGovernor.releaseHeader.injectMetric();
                clipOrigin = TouchTransformer.clipOrigin((PatternComposer) WaveBenchmark.growCallback(patternComposer2, this, injectMetric), popBlueprint, add, true);
            }
            WaveBenchmark.cancelArchive(injectMetric, this);
        } while (!clipOrigin);
    }
}
