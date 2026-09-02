package com.goldenboot.saga.zone;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableSet;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class CardOrchestrator extends OverlayRevision implements Set, KMutableSet {
    public final CustomStore notifyMessage;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator implements Iterator, KMutableIterator {
        public final Iterator notifyMessage;
        public int reduceScope = -1;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        /* renamed from: com.goldenboot.saga.zone.CardOrchestrator$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public static final class C0092ActivityMutator extends EmbeddedEdge implements IconExporter {
            public Object attachConfig;
            public Object connectPatch;
            public int decodePath;
            public int drawRequest;
            public /* synthetic */ Object drawScope;
            public final /* synthetic */ CardOrchestrator expandArgs;
            public final /* synthetic */ ActivityMutator findTask;
            public long gatherAdapter;
            public int inflateAdapter;
            public Object notifyMessage;
            public int purgeNode;
            public int resetDelta;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0092ActivityMutator(CardOrchestrator cardOrchestrator, ActivityMutator activityMutator, ServiceRegulator serviceRegulator) {
                super(2, serviceRegulator);
                this.expandArgs = cardOrchestrator;
                this.findTask = activityMutator;
            }

            @Override // com.goldenboot.saga.zone.ConfigValidator
            public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
                C0092ActivityMutator c0092ActivityMutator = new C0092ActivityMutator(this.expandArgs, this.findTask, serviceRegulator);
                c0092ActivityMutator.drawScope = obj;
                return c0092ActivityMutator;
            }

            @Override // com.goldenboot.saga.zone.IconExporter
            /* renamed from: detachStream, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ConnectionOrganizer connectionOrganizer, ServiceRegulator serviceRegulator) {
                return ((C0092ActivityMutator) create(connectionOrganizer, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x00aa  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x00b5  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0075  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x00a4 -> B:5:0x00a7). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005d -> B:15:0x00b3). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005f -> B:6:0x0073). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x007c -> B:5:0x00a7). Please report as a decompilation issue!!! */
            @Override // com.goldenboot.saga.zone.ConfigValidator
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                ConnectionOrganizer connectionOrganizer;
                ActivityMutator activityMutator;
                CardOrchestrator cardOrchestrator;
                long[] jArr;
                int length;
                int i;
                long j;
                Object releaseHeader = RotateReceiver.releaseHeader();
                int i2 = this.decodePath;
                if (i2 == 0) {
                    ColumnForger.growPayload(obj);
                    connectionOrganizer = (ConnectionOrganizer) this.drawScope;
                    CustomStore customStore = this.expandArgs.notifyMessage;
                    activityMutator = this.findTask;
                    cardOrchestrator = this.expandArgs;
                    jArr = customStore.evictLayout;
                    length = jArr.length - 2;
                    if (length >= 0) {
                        i = 0;
                        j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i != length) {
                        }
                    }
                    return DpadBuilder.evictLayout;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = this.drawRequest;
                int i4 = this.purgeNode;
                long j2 = this.gatherAdapter;
                int i5 = this.inflateAdapter;
                int i6 = this.resetDelta;
                long[] jArr2 = (long[]) this.attachConfig;
                CardOrchestrator cardOrchestrator2 = (CardOrchestrator) this.connectPatch;
                ActivityMutator activityMutator2 = (ActivityMutator) this.notifyMessage;
                ConnectionOrganizer connectionOrganizer2 = (ConnectionOrganizer) this.drawScope;
                ColumnForger.growPayload(obj);
                j2 >>= 8;
                i3++;
                if (i3 < i4) {
                    if (i4 == 8) {
                        int i7 = i6;
                        i = i5;
                        length = i7;
                        jArr = jArr2;
                        cardOrchestrator = cardOrchestrator2;
                        activityMutator = activityMutator2;
                        connectionOrganizer = connectionOrganizer2;
                        if (i != length) {
                            i++;
                            j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = 8 - ((~(i - length)) >>> 31);
                                int i9 = i;
                                i6 = length;
                                i5 = i9;
                                connectionOrganizer2 = connectionOrganizer;
                                i3 = 0;
                                jArr2 = jArr;
                                cardOrchestrator2 = cardOrchestrator;
                                i4 = i8;
                                activityMutator2 = activityMutator;
                                j2 = j;
                                if (i3 < i4) {
                                    if ((255 & j2) < 128) {
                                        int i10 = (i5 << 3) + i3;
                                        activityMutator2.injectMetric(i10);
                                        Object obj2 = cardOrchestrator2.notifyMessage.growPayload[i10];
                                        this.drawScope = connectionOrganizer2;
                                        this.notifyMessage = activityMutator2;
                                        this.connectPatch = cardOrchestrator2;
                                        this.attachConfig = jArr2;
                                        this.resetDelta = i6;
                                        this.inflateAdapter = i5;
                                        this.gatherAdapter = j2;
                                        this.purgeNode = i4;
                                        this.drawRequest = i3;
                                        this.decodePath = 1;
                                        if (connectionOrganizer2.injectMetric(obj2, this) == releaseHeader) {
                                            return releaseHeader;
                                        }
                                    }
                                    j2 >>= 8;
                                    i3++;
                                    if (i3 < i4) {
                                    }
                                }
                            }
                            if (i != length) {
                            }
                        }
                    }
                    return DpadBuilder.evictLayout;
                }
            }
        }

        public ActivityMutator() {
            this.notifyMessage = LabelMeter.evictLayout(new C0092ActivityMutator(CardOrchestrator.this, this, null));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.notifyMessage.hasNext();
        }

        public final void injectMetric(int i) {
            this.reduceScope = i;
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.notifyMessage.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.reduceScope != -1) {
                CardOrchestrator.this.notifyMessage.findTask(this.reduceScope);
                this.reduceScope = -1;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardOrchestrator(CustomStore parent) {
        super(parent);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.notifyMessage = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        return this.notifyMessage.updateTimer(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.notifyMessage.popBlueprint(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.notifyMessage.peekRevision();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new ActivityMutator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.notifyMessage.drawScope(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.notifyMessage.expandArgs(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.notifyMessage.syncScope(elements);
    }
}
