package com.goldenboot.saga.zone;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class BaseTransformer {
    public Object[] detachStream;
    public int evictLayout;
    public int growPayload;
    public final ServerTunnel injectMetric;
    public static final ActivityMutator releaseHeader = new ActivityMutator(null);
    public static final int clipOrigin = 8;
    public static final BaseTransformer flushSample = new BaseTransformer(0, 0, new Object[0]);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public /* synthetic */ ActivityMutator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BaseTransformer evictLayout() {
            return BaseTransformer.flushSample;
        }

        public ActivityMutator() {
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler {
        public BaseTransformer evictLayout;
        public final int growPayload;

        public BounceHandler(BaseTransformer baseTransformer, int i) {
            this.evictLayout = baseTransformer;
            this.growPayload = i;
        }

        public final BaseTransformer evictLayout() {
            return this.evictLayout;
        }

        public final int growPayload() {
            return this.growPayload;
        }

        public final void injectMetric(BaseTransformer baseTransformer) {
            this.evictLayout = baseTransformer;
        }
    }

    public BaseTransformer(int i, int i2, Object[] objArr, ServerTunnel serverTunnel) {
        this.evictLayout = i;
        this.growPayload = i2;
        this.injectMetric = serverTunnel;
        this.detachStream = objArr;
    }

    public final BaseTransformer applyTask(Object obj) {
        ProgressIndex connectPatch = CellEntry.connectPatch(CellEntry.attachConfig(0, this.detachStream.length), 2);
        int applyTask = connectPatch.applyTask();
        int serializeOffset = connectPatch.serializeOffset();
        int notifyMessage = connectPatch.notifyMessage();
        if ((notifyMessage > 0 && applyTask <= serializeOffset) || (notifyMessage < 0 && serializeOffset <= applyTask)) {
            while (!Intrinsics.areEqual(obj, inflateAdapter(applyTask))) {
                if (applyTask != serializeOffset) {
                    applyTask += notifyMessage;
                }
            }
            return popBlueprint(applyTask);
        }
        return this;
    }

    public final BounceHandler attachCallback(int i, Object obj, Object obj2, int i2) {
        BounceHandler attachCallback;
        int clipOrigin2 = 1 << DimenProbe.clipOrigin(i, i2);
        if (connectPatch(clipOrigin2)) {
            int serializeOffset = serializeOffset(clipOrigin2);
            if (!Intrinsics.areEqual(obj, inflateAdapter(serializeOffset))) {
                return drawRequest(serializeOffset, clipOrigin2, i, obj, obj2, i2).growPayload();
            }
            if (groupArchive(serializeOffset) == obj2) {
                return null;
            }
            return resumeSignature(serializeOffset, obj2).injectMetric();
        }
        if (!attachConfig(clipOrigin2)) {
            return resetDelta(clipOrigin2, obj, obj2).growPayload();
        }
        int mapJob = mapJob(clipOrigin2);
        BaseTransformer parseAsset = parseAsset(mapJob);
        if (i2 == 30) {
            attachCallback = parseAsset.updateTimer(obj, obj2);
            if (attachCallback == null) {
                return null;
            }
        } else {
            attachCallback = parseAsset.attachCallback(i, obj, obj2, i2 + 5);
            if (attachCallback == null) {
                return null;
            }
        }
        attachCallback.injectMetric(formatPosition(mapJob, clipOrigin2, attachCallback.evictLayout()));
        return attachCallback;
    }

    public final boolean attachConfig(int i) {
        return (this.growPayload & i) != 0;
    }

    public final BaseTransformer bindBody(int i, BaseTransformer baseTransformer, ServerTunnel serverTunnel) {
        Object[] objArr = this.detachStream;
        if (objArr.length == 1 && baseTransformer.detachStream.length == 2 && baseTransformer.growPayload == 0) {
            baseTransformer.evictLayout = this.growPayload;
            return baseTransformer;
        }
        if (this.injectMetric == serverTunnel) {
            objArr[i] = baseTransformer;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        copyOf[i] = baseTransformer;
        return new BaseTransformer(this.evictLayout, this.growPayload, copyOf, serverTunnel);
    }

    public final boolean clipOrigin(Object obj) {
        ProgressIndex connectPatch = CellEntry.connectPatch(CellEntry.attachConfig(0, this.detachStream.length), 2);
        int applyTask = connectPatch.applyTask();
        int serializeOffset = connectPatch.serializeOffset();
        int notifyMessage = connectPatch.notifyMessage();
        if ((notifyMessage > 0 && applyTask <= serializeOffset) || (notifyMessage < 0 && serializeOffset <= applyTask)) {
            while (!Intrinsics.areEqual(obj, this.detachStream[applyTask])) {
                if (applyTask != serializeOffset) {
                    applyTask += notifyMessage;
                }
            }
            return true;
        }
        return false;
    }

    public final BaseTransformer connectComponent(int i, int i2) {
        Object[] applyTask;
        Object[] objArr = this.detachStream;
        if (objArr.length == 1) {
            return null;
        }
        applyTask = DimenProbe.applyTask(objArr, i);
        return new BaseTransformer(this.evictLayout, this.growPayload ^ i2, applyTask);
    }

    public final boolean connectJob(BaseTransformer baseTransformer) {
        if (this == baseTransformer) {
            return true;
        }
        if (this.growPayload != baseTransformer.growPayload || this.evictLayout != baseTransformer.evictLayout) {
            return false;
        }
        int length = this.detachStream.length;
        for (int i = 0; i < length; i++) {
            if (this.detachStream[i] != baseTransformer.detachStream[i]) {
                return false;
            }
        }
        return true;
    }

    public final boolean connectPatch(int i) {
        return (this.evictLayout & i) != 0;
    }

    public final BaseTransformer decodePath(BaseTransformer baseTransformer, DividerMux dividerMux, ServerTunnel serverTunnel) {
        CoreGraph.evictLayout(this.growPayload == 0);
        CoreGraph.evictLayout(this.evictLayout == 0);
        CoreGraph.evictLayout(baseTransformer.growPayload == 0);
        CoreGraph.evictLayout(baseTransformer.evictLayout == 0);
        Object[] objArr = this.detachStream;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + baseTransformer.detachStream.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        int length = this.detachStream.length;
        ProgressIndex connectPatch = CellEntry.connectPatch(CellEntry.attachConfig(0, baseTransformer.detachStream.length), 2);
        int applyTask = connectPatch.applyTask();
        int serializeOffset = connectPatch.serializeOffset();
        int notifyMessage = connectPatch.notifyMessage();
        if ((notifyMessage > 0 && applyTask <= serializeOffset) || (notifyMessage < 0 && serializeOffset <= applyTask)) {
            while (true) {
                if (clipOrigin(baseTransformer.detachStream[applyTask])) {
                    dividerMux.injectMetric(dividerMux.evictLayout() + 1);
                } else {
                    Object[] objArr2 = baseTransformer.detachStream;
                    copyOf[length] = objArr2[applyTask];
                    copyOf[length + 1] = objArr2[applyTask + 1];
                    length += 2;
                }
                if (applyTask == serializeOffset) {
                    break;
                }
                applyTask += notifyMessage;
            }
        }
        if (length == this.detachStream.length) {
            return this;
        }
        if (length == baseTransformer.detachStream.length) {
            return baseTransformer;
        }
        if (length == copyOf.length) {
            return new BaseTransformer(0, 0, copyOf, serverTunnel);
        }
        Object[] copyOf2 = Arrays.copyOf(copyOf, length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
        return new BaseTransformer(0, 0, copyOf2, serverTunnel);
    }

    public final Object[] detachStream(int i, int i2, int i3, Object obj, Object obj2, int i4, ServerTunnel serverTunnel) {
        Object[] popBlueprint;
        Object inflateAdapter = inflateAdapter(i);
        popBlueprint = DimenProbe.popBlueprint(this.detachStream, i, mapJob(i2) + 1, purgeNode(inflateAdapter != null ? inflateAdapter.hashCode() : 0, inflateAdapter, groupArchive(i), i3, obj, obj2, i4 + 5, serverTunnel));
        return popBlueprint;
    }

    public final BaseTransformer dispatchTimezone(int i, Object obj, PaddingGraph paddingGraph) {
        if (this.injectMetric == paddingGraph.notifyMessage()) {
            this.detachStream[i + 1] = obj;
            return this;
        }
        paddingGraph.resetDelta(paddingGraph.popBlueprint() + 1);
        Object[] objArr = this.detachStream;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        copyOf[i + 1] = obj;
        return new BaseTransformer(this.evictLayout, this.growPayload, copyOf, paddingGraph.notifyMessage());
    }

    public final boolean drawField(int i, Object obj, int i2) {
        int clipOrigin2 = 1 << DimenProbe.clipOrigin(i, i2);
        if (connectPatch(clipOrigin2)) {
            return Intrinsics.areEqual(obj, inflateAdapter(serializeOffset(clipOrigin2)));
        }
        if (!attachConfig(clipOrigin2)) {
            return false;
        }
        BaseTransformer parseAsset = parseAsset(mapJob(clipOrigin2));
        return i2 == 30 ? parseAsset.clipOrigin(obj) : parseAsset.drawField(i, obj, i2 + 5);
    }

    public final BaseTransformer drawRequest(int i, int i2, int i3, Object obj, Object obj2, int i4) {
        return new BaseTransformer(this.evictLayout ^ i2, this.growPayload | i2, detachStream(i, i2, i3, obj, obj2, i4, null));
    }

    public final BaseTransformer drawScope(Object obj, PaddingGraph paddingGraph) {
        ProgressIndex connectPatch = CellEntry.connectPatch(CellEntry.attachConfig(0, this.detachStream.length), 2);
        int applyTask = connectPatch.applyTask();
        int serializeOffset = connectPatch.serializeOffset();
        int notifyMessage = connectPatch.notifyMessage();
        if ((notifyMessage > 0 && applyTask <= serializeOffset) || (notifyMessage < 0 && serializeOffset <= applyTask)) {
            while (!Intrinsics.areEqual(obj, inflateAdapter(applyTask))) {
                if (applyTask != serializeOffset) {
                    applyTask += notifyMessage;
                }
            }
            return findTask(applyTask, paddingGraph);
        }
        return this;
    }

    public final BaseTransformer expandArgs(Object obj, Object obj2, PaddingGraph paddingGraph) {
        ProgressIndex connectPatch = CellEntry.connectPatch(CellEntry.attachConfig(0, this.detachStream.length), 2);
        int applyTask = connectPatch.applyTask();
        int serializeOffset = connectPatch.serializeOffset();
        int notifyMessage = connectPatch.notifyMessage();
        if ((notifyMessage > 0 && applyTask <= serializeOffset) || (notifyMessage < 0 && serializeOffset <= applyTask)) {
            while (true) {
                if (!Intrinsics.areEqual(obj, inflateAdapter(applyTask)) || !Intrinsics.areEqual(obj2, groupArchive(applyTask))) {
                    if (applyTask == serializeOffset) {
                        break;
                    }
                    applyTask += notifyMessage;
                } else {
                    return findTask(applyTask, paddingGraph);
                }
            }
        }
        return this;
    }

    public final BaseTransformer filterPayload(int i, Object obj, int i2, PaddingGraph paddingGraph) {
        int clipOrigin2 = 1 << DimenProbe.clipOrigin(i, i2);
        if (connectPatch(clipOrigin2)) {
            int serializeOffset = serializeOffset(clipOrigin2);
            if (Intrinsics.areEqual(obj, inflateAdapter(serializeOffset))) {
                return queryModel(serializeOffset, clipOrigin2, paddingGraph);
            }
        } else if (attachConfig(clipOrigin2)) {
            int mapJob = mapJob(clipOrigin2);
            BaseTransformer parseAsset = parseAsset(mapJob);
            return unlockMessage(parseAsset, i2 == 30 ? parseAsset.drawScope(obj, paddingGraph) : parseAsset.filterPayload(i, obj, i2 + 5, paddingGraph), mapJob, clipOrigin2, paddingGraph.notifyMessage());
        }
        return this;
    }

    public final BaseTransformer findTask(int i, PaddingGraph paddingGraph) {
        Object[] updateTimer;
        Object[] updateTimer2;
        paddingGraph.gatherAdapter(paddingGraph.size() - 1);
        paddingGraph.inflateAdapter(groupArchive(i));
        if (this.detachStream.length == 2) {
            return null;
        }
        if (this.injectMetric != paddingGraph.notifyMessage()) {
            updateTimer = DimenProbe.updateTimer(this.detachStream, i);
            return new BaseTransformer(0, 0, updateTimer, paddingGraph.notifyMessage());
        }
        updateTimer2 = DimenProbe.updateTimer(this.detachStream, i);
        this.detachStream = updateTimer2;
        return this;
    }

    public final BaseTransformer flattenPackage(int i, Object obj, Object obj2, int i2, PaddingGraph paddingGraph) {
        int clipOrigin2 = 1 << DimenProbe.clipOrigin(i, i2);
        if (connectPatch(clipOrigin2)) {
            int serializeOffset = serializeOffset(clipOrigin2);
            if (Intrinsics.areEqual(obj, inflateAdapter(serializeOffset))) {
                paddingGraph.inflateAdapter(groupArchive(serializeOffset));
                return groupArchive(serializeOffset) == obj2 ? this : dispatchTimezone(serializeOffset, obj2, paddingGraph);
            }
            paddingGraph.gatherAdapter(paddingGraph.size() + 1);
            return syncScope(serializeOffset, clipOrigin2, i, obj, obj2, i2, paddingGraph.notifyMessage());
        }
        if (!attachConfig(clipOrigin2)) {
            paddingGraph.gatherAdapter(paddingGraph.size() + 1);
            return mergeLocale(clipOrigin2, obj, obj2, paddingGraph.notifyMessage());
        }
        int mapJob = mapJob(clipOrigin2);
        BaseTransformer parseAsset = parseAsset(mapJob);
        BaseTransformer gatherAdapter = i2 == 30 ? parseAsset.gatherAdapter(obj, obj2, paddingGraph) : parseAsset.flattenPackage(i, obj, obj2, i2 + 5, paddingGraph);
        return parseAsset == gatherAdapter ? this : bindBody(mapJob, gatherAdapter, paddingGraph.notifyMessage());
    }

    public final Object flushSample(Object obj) {
        ProgressIndex connectPatch = CellEntry.connectPatch(CellEntry.attachConfig(0, this.detachStream.length), 2);
        int applyTask = connectPatch.applyTask();
        int serializeOffset = connectPatch.serializeOffset();
        int notifyMessage = connectPatch.notifyMessage();
        if ((notifyMessage <= 0 || applyTask > serializeOffset) && (notifyMessage >= 0 || serializeOffset > applyTask)) {
            return null;
        }
        while (!Intrinsics.areEqual(obj, inflateAdapter(applyTask))) {
            if (applyTask == serializeOffset) {
                return null;
            }
            applyTask += notifyMessage;
        }
        return groupArchive(applyTask);
    }

    public final BaseTransformer formatPosition(int i, int i2, BaseTransformer baseTransformer) {
        Object[] drawField;
        Object[] objArr = baseTransformer.detachStream;
        if (objArr.length != 2 || baseTransformer.growPayload != 0) {
            Object[] objArr2 = this.detachStream;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            copyOf[i] = baseTransformer;
            return new BaseTransformer(this.evictLayout, this.growPayload, copyOf);
        }
        if (this.detachStream.length == 1) {
            baseTransformer.evictLayout = this.growPayload;
            return baseTransformer;
        }
        drawField = DimenProbe.drawField(this.detachStream, i, serializeOffset(i2), objArr[0], objArr[1]);
        return new BaseTransformer(this.evictLayout ^ i2, this.growPayload ^ i2, drawField);
    }

    public final BaseTransformer gatherAdapter(Object obj, Object obj2, PaddingGraph paddingGraph) {
        Object[] flushSample2;
        ProgressIndex connectPatch = CellEntry.connectPatch(CellEntry.attachConfig(0, this.detachStream.length), 2);
        int applyTask = connectPatch.applyTask();
        int serializeOffset = connectPatch.serializeOffset();
        int notifyMessage = connectPatch.notifyMessage();
        if ((notifyMessage > 0 && applyTask <= serializeOffset) || (notifyMessage < 0 && serializeOffset <= applyTask)) {
            while (!Intrinsics.areEqual(obj, inflateAdapter(applyTask))) {
                if (applyTask != serializeOffset) {
                    applyTask += notifyMessage;
                }
            }
            paddingGraph.inflateAdapter(groupArchive(applyTask));
            if (this.injectMetric == paddingGraph.notifyMessage()) {
                this.detachStream[applyTask + 1] = obj2;
                return this;
            }
            paddingGraph.resetDelta(paddingGraph.popBlueprint() + 1);
            Object[] objArr = this.detachStream;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            copyOf[applyTask + 1] = obj2;
            return new BaseTransformer(0, 0, copyOf, paddingGraph.notifyMessage());
        }
        paddingGraph.gatherAdapter(paddingGraph.size() + 1);
        flushSample2 = DimenProbe.flushSample(this.detachStream, 0, obj, obj2);
        return new BaseTransformer(0, 0, flushSample2, paddingGraph.notifyMessage());
    }

    public final Object groupArchive(int i) {
        return this.detachStream[i + 1];
    }

    public final BounceHandler growPayload() {
        return new BounceHandler(this, 1);
    }

    public final Object inflateAdapter(int i) {
        return this.detachStream[i];
    }

    public final BaseTransformer inflateEdge(int i, Object obj, Object obj2, int i2, PaddingGraph paddingGraph) {
        PaddingGraph paddingGraph2;
        BaseTransformer inflateEdge;
        int clipOrigin2 = 1 << DimenProbe.clipOrigin(i, i2);
        if (connectPatch(clipOrigin2)) {
            int serializeOffset = serializeOffset(clipOrigin2);
            return (Intrinsics.areEqual(obj, inflateAdapter(serializeOffset)) && Intrinsics.areEqual(obj2, groupArchive(serializeOffset))) ? queryModel(serializeOffset, clipOrigin2, paddingGraph) : this;
        }
        if (!attachConfig(clipOrigin2)) {
            return this;
        }
        int mapJob = mapJob(clipOrigin2);
        BaseTransformer parseAsset = parseAsset(mapJob);
        if (i2 == 30) {
            inflateEdge = parseAsset.expandArgs(obj, obj2, paddingGraph);
            paddingGraph2 = paddingGraph;
        } else {
            paddingGraph2 = paddingGraph;
            inflateEdge = parseAsset.inflateEdge(i, obj, obj2, i2 + 5, paddingGraph2);
        }
        return unlockMessage(parseAsset, inflateEdge, mapJob, clipOrigin2, paddingGraph2.notifyMessage());
    }

    public final BaseTransformer injectConstraint(BaseTransformer baseTransformer, int i, DividerMux dividerMux, PaddingGraph paddingGraph) {
        if (this == baseTransformer) {
            dividerMux.growPayload(releaseHeader());
            return this;
        }
        int i2 = i;
        if (i2 > 30) {
            return decodePath(baseTransformer, dividerMux, paddingGraph.notifyMessage());
        }
        int i3 = this.growPayload | baseTransformer.growPayload;
        int i4 = this.evictLayout;
        int i5 = baseTransformer.evictLayout;
        int i6 = (i4 ^ i5) & (~i3);
        int i7 = i4 & i5;
        while (i7 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i7);
            if (Intrinsics.areEqual(inflateAdapter(serializeOffset(lowestOneBit)), baseTransformer.inflateAdapter(baseTransformer.serializeOffset(lowestOneBit)))) {
                i6 |= lowestOneBit;
            } else {
                i3 |= lowestOneBit;
            }
            i7 ^= lowestOneBit;
        }
        int i8 = 0;
        if (!((i3 & i6) == 0)) {
            NotificationCoordinator.growPayload("Check failed.");
        }
        BaseTransformer baseTransformer2 = (Intrinsics.areEqual(this.injectMetric, paddingGraph.notifyMessage()) && this.evictLayout == i6 && this.growPayload == i3) ? this : new BaseTransformer(i6, i3, new Object[(Integer.bitCount(i6) * 2) + Integer.bitCount(i3)]);
        int i9 = i3;
        int i10 = 0;
        while (i9 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i9);
            Object[] objArr = baseTransformer2.detachStream;
            objArr[(objArr.length - 1) - i10] = storeCharset(baseTransformer, lowestOneBit2, i2, dividerMux, paddingGraph);
            i10++;
            i9 ^= lowestOneBit2;
            i2 = i;
        }
        while (i6 != 0) {
            int lowestOneBit3 = Integer.lowestOneBit(i6);
            int i11 = i8 * 2;
            if (baseTransformer.connectPatch(lowestOneBit3)) {
                int serializeOffset = baseTransformer.serializeOffset(lowestOneBit3);
                baseTransformer2.detachStream[i11] = baseTransformer.inflateAdapter(serializeOffset);
                baseTransformer2.detachStream[i11 + 1] = baseTransformer.groupArchive(serializeOffset);
                if (connectPatch(lowestOneBit3)) {
                    dividerMux.injectMetric(dividerMux.evictLayout() + 1);
                }
            } else {
                int serializeOffset2 = serializeOffset(lowestOneBit3);
                baseTransformer2.detachStream[i11] = inflateAdapter(serializeOffset2);
                baseTransformer2.detachStream[i11 + 1] = groupArchive(serializeOffset2);
            }
            i8++;
            i6 ^= lowestOneBit3;
        }
        return connectJob(baseTransformer2) ? this : baseTransformer.connectJob(baseTransformer2) ? baseTransformer : baseTransformer2;
    }

    public final BounceHandler injectMetric() {
        return new BounceHandler(this, 0);
    }

    public final int mapJob(int i) {
        return (this.detachStream.length - 1) - Integer.bitCount(this.growPayload & (i - 1));
    }

    public final BaseTransformer mergeLocale(int i, Object obj, Object obj2, ServerTunnel serverTunnel) {
        Object[] flushSample2;
        Object[] flushSample3;
        int serializeOffset = serializeOffset(i);
        if (this.injectMetric != serverTunnel) {
            flushSample2 = DimenProbe.flushSample(this.detachStream, serializeOffset, obj, obj2);
            return new BaseTransformer(i | this.evictLayout, this.growPayload, flushSample2, serverTunnel);
        }
        flushSample3 = DimenProbe.flushSample(this.detachStream, serializeOffset, obj, obj2);
        this.detachStream = flushSample3;
        this.evictLayout = i | this.evictLayout;
        return this;
    }

    public final Object[] notifyMessage() {
        return this.detachStream;
    }

    public final BaseTransformer packPackage(int i, int i2, ServerTunnel serverTunnel) {
        Object[] applyTask;
        Object[] applyTask2;
        Object[] objArr = this.detachStream;
        if (objArr.length == 1) {
            return null;
        }
        if (this.injectMetric != serverTunnel) {
            applyTask = DimenProbe.applyTask(objArr, i);
            return new BaseTransformer(this.evictLayout, this.growPayload ^ i2, applyTask, serverTunnel);
        }
        applyTask2 = DimenProbe.applyTask(objArr, i);
        this.detachStream = applyTask2;
        this.growPayload ^= i2;
        return this;
    }

    public final BaseTransformer parseAsset(int i) {
        Object obj = this.detachStream[i];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (BaseTransformer) obj;
    }

    public final int peekRevision() {
        return Integer.bitCount(this.evictLayout);
    }

    public final BaseTransformer popBlueprint(int i) {
        Object[] updateTimer;
        Object[] objArr = this.detachStream;
        if (objArr.length == 2) {
            return null;
        }
        updateTimer = DimenProbe.updateTimer(objArr, i);
        return new BaseTransformer(0, 0, updateTimer);
    }

    public final BaseTransformer prepareTask(int i, Object obj, int i2) {
        int clipOrigin2 = 1 << DimenProbe.clipOrigin(i, i2);
        if (connectPatch(clipOrigin2)) {
            int serializeOffset = serializeOffset(clipOrigin2);
            return Intrinsics.areEqual(obj, inflateAdapter(serializeOffset)) ? updateAction(serializeOffset, clipOrigin2) : this;
        }
        if (!attachConfig(clipOrigin2)) {
            return this;
        }
        int mapJob = mapJob(clipOrigin2);
        BaseTransformer parseAsset = parseAsset(mapJob);
        return startResource(parseAsset, i2 == 30 ? parseAsset.applyTask(obj) : parseAsset.prepareTask(i, obj, i2 + 5), mapJob, clipOrigin2);
    }

    public final BaseTransformer purgeNode(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, ServerTunnel serverTunnel) {
        if (i3 > 30) {
            return new BaseTransformer(0, 0, new Object[]{obj, obj2, obj3, obj4}, serverTunnel);
        }
        int clipOrigin2 = DimenProbe.clipOrigin(i, i3);
        int clipOrigin3 = DimenProbe.clipOrigin(i2, i3);
        if (clipOrigin2 != clipOrigin3) {
            return new BaseTransformer((1 << clipOrigin2) | (1 << clipOrigin3), 0, clipOrigin2 < clipOrigin3 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, serverTunnel);
        }
        return new BaseTransformer(0, 1 << clipOrigin2, new Object[]{purgeNode(i, obj, obj2, i2, obj3, obj4, i3 + 5, serverTunnel)}, serverTunnel);
    }

    public final BaseTransformer queryModel(int i, int i2, PaddingGraph paddingGraph) {
        Object[] updateTimer;
        Object[] updateTimer2;
        paddingGraph.gatherAdapter(paddingGraph.size() - 1);
        paddingGraph.inflateAdapter(groupArchive(i));
        if (this.detachStream.length == 2) {
            return null;
        }
        if (this.injectMetric != paddingGraph.notifyMessage()) {
            updateTimer = DimenProbe.updateTimer(this.detachStream, i);
            return new BaseTransformer(i2 ^ this.evictLayout, this.growPayload, updateTimer, paddingGraph.notifyMessage());
        }
        updateTimer2 = DimenProbe.updateTimer(this.detachStream, i);
        this.detachStream = updateTimer2;
        this.evictLayout ^= i2;
        return this;
    }

    public final Object reduceScope(int i, Object obj, int i2) {
        int clipOrigin2 = 1 << DimenProbe.clipOrigin(i, i2);
        if (connectPatch(clipOrigin2)) {
            int serializeOffset = serializeOffset(clipOrigin2);
            if (Intrinsics.areEqual(obj, inflateAdapter(serializeOffset))) {
                return groupArchive(serializeOffset);
            }
            return null;
        }
        if (!attachConfig(clipOrigin2)) {
            return null;
        }
        BaseTransformer parseAsset = parseAsset(mapJob(clipOrigin2));
        return i2 == 30 ? parseAsset.flushSample(obj) : parseAsset.reduceScope(i, obj, i2 + 5);
    }

    public final int releaseHeader() {
        if (this.growPayload == 0) {
            return this.detachStream.length / 2;
        }
        int bitCount = Integer.bitCount(this.evictLayout);
        int length = this.detachStream.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += parseAsset(i).releaseHeader();
        }
        return bitCount;
    }

    public final BaseTransformer resetDelta(int i, Object obj, Object obj2) {
        Object[] flushSample2;
        flushSample2 = DimenProbe.flushSample(this.detachStream, serializeOffset(i), obj, obj2);
        return new BaseTransformer(i | this.evictLayout, this.growPayload, flushSample2);
    }

    public final BaseTransformer resumeSignature(int i, Object obj) {
        Object[] objArr = this.detachStream;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        copyOf[i + 1] = obj;
        return new BaseTransformer(this.evictLayout, this.growPayload, copyOf);
    }

    public final int serializeOffset(int i) {
        return Integer.bitCount(this.evictLayout & (i - 1)) * 2;
    }

    public final BaseTransformer startResource(BaseTransformer baseTransformer, BaseTransformer baseTransformer2, int i, int i2) {
        return baseTransformer2 == null ? connectComponent(i, i2) : baseTransformer != baseTransformer2 ? formatPosition(i, i2, baseTransformer2) : this;
    }

    public final BaseTransformer storeCharset(BaseTransformer baseTransformer, int i, int i2, DividerMux dividerMux, PaddingGraph paddingGraph) {
        if (attachConfig(i)) {
            BaseTransformer parseAsset = parseAsset(mapJob(i));
            if (baseTransformer.attachConfig(i)) {
                return parseAsset.injectConstraint(baseTransformer.parseAsset(baseTransformer.mapJob(i)), i2 + 5, dividerMux, paddingGraph);
            }
            if (!baseTransformer.connectPatch(i)) {
                return parseAsset;
            }
            int serializeOffset = baseTransformer.serializeOffset(i);
            Object inflateAdapter = baseTransformer.inflateAdapter(serializeOffset);
            Object groupArchive = baseTransformer.groupArchive(serializeOffset);
            int size = paddingGraph.size();
            BaseTransformer flattenPackage = parseAsset.flattenPackage(inflateAdapter != null ? inflateAdapter.hashCode() : 0, inflateAdapter, groupArchive, i2 + 5, paddingGraph);
            if (paddingGraph.size() == size) {
                dividerMux.injectMetric(dividerMux.evictLayout() + 1);
            }
            return flattenPackage;
        }
        if (!baseTransformer.attachConfig(i)) {
            int serializeOffset2 = serializeOffset(i);
            Object inflateAdapter2 = inflateAdapter(serializeOffset2);
            Object groupArchive2 = groupArchive(serializeOffset2);
            int serializeOffset3 = baseTransformer.serializeOffset(i);
            Object inflateAdapter3 = baseTransformer.inflateAdapter(serializeOffset3);
            return purgeNode(inflateAdapter2 != null ? inflateAdapter2.hashCode() : 0, inflateAdapter2, groupArchive2, inflateAdapter3 != null ? inflateAdapter3.hashCode() : 0, inflateAdapter3, baseTransformer.groupArchive(serializeOffset3), i2 + 5, paddingGraph.notifyMessage());
        }
        BaseTransformer parseAsset2 = baseTransformer.parseAsset(baseTransformer.mapJob(i));
        if (!connectPatch(i)) {
            return parseAsset2;
        }
        int serializeOffset4 = serializeOffset(i);
        Object inflateAdapter4 = inflateAdapter(serializeOffset4);
        int i3 = i2 + 5;
        if (!parseAsset2.drawField(inflateAdapter4 != null ? inflateAdapter4.hashCode() : 0, inflateAdapter4, i3)) {
            return parseAsset2.flattenPackage(inflateAdapter4 != null ? inflateAdapter4.hashCode() : 0, inflateAdapter4, groupArchive(serializeOffset4), i3, paddingGraph);
        }
        dividerMux.injectMetric(dividerMux.evictLayout() + 1);
        return parseAsset2;
    }

    public final BaseTransformer syncScope(int i, int i2, int i3, Object obj, Object obj2, int i4, ServerTunnel serverTunnel) {
        if (this.injectMetric != serverTunnel) {
            return new BaseTransformer(this.evictLayout ^ i2, this.growPayload | i2, detachStream(i, i2, i3, obj, obj2, i4, serverTunnel), serverTunnel);
        }
        this.detachStream = detachStream(i, i2, i3, obj, obj2, i4, serverTunnel);
        this.evictLayout ^= i2;
        this.growPayload |= i2;
        return this;
    }

    public final BaseTransformer unlockMessage(BaseTransformer baseTransformer, BaseTransformer baseTransformer2, int i, int i2, ServerTunnel serverTunnel) {
        return baseTransformer2 == null ? packPackage(i, i2, serverTunnel) : (this.injectMetric == serverTunnel || baseTransformer != baseTransformer2) ? bindBody(i, baseTransformer2, serverTunnel) : this;
    }

    public final BaseTransformer updateAction(int i, int i2) {
        Object[] updateTimer;
        Object[] objArr = this.detachStream;
        if (objArr.length == 2) {
            return null;
        }
        updateTimer = DimenProbe.updateTimer(objArr, i);
        return new BaseTransformer(i2 ^ this.evictLayout, this.growPayload, updateTimer);
    }

    public final BounceHandler updateTimer(Object obj, Object obj2) {
        Object[] flushSample2;
        ProgressIndex connectPatch = CellEntry.connectPatch(CellEntry.attachConfig(0, this.detachStream.length), 2);
        int applyTask = connectPatch.applyTask();
        int serializeOffset = connectPatch.serializeOffset();
        int notifyMessage = connectPatch.notifyMessage();
        if ((notifyMessage > 0 && applyTask <= serializeOffset) || (notifyMessage < 0 && serializeOffset <= applyTask)) {
            while (!Intrinsics.areEqual(obj, inflateAdapter(applyTask))) {
                if (applyTask != serializeOffset) {
                    applyTask += notifyMessage;
                }
            }
            if (obj2 == groupArchive(applyTask)) {
                return null;
            }
            Object[] objArr = this.detachStream;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            copyOf[applyTask + 1] = obj2;
            return new BaseTransformer(0, 0, copyOf).injectMetric();
        }
        flushSample2 = DimenProbe.flushSample(this.detachStream, 0, obj, obj2);
        return new BaseTransformer(0, 0, flushSample2).growPayload();
    }

    public BaseTransformer(int i, int i2, Object[] objArr) {
        this(i, i2, objArr, null);
    }
}
