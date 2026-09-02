package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.NotificationFence;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ElevationStack {
    public static final ActivityMutator drawScope = new ActivityMutator(null);
    public static final int expandArgs = 8;
    public int applyTask;
    public ServerBuilder clipOrigin;
    public int connectJob;
    public StartupNode decodePath;
    public ArrayList detachStream;
    public int drawField;
    public final ComponentSender evictLayout;
    public int flushSample;
    public boolean gatherAdapter;
    public int[] growPayload;
    public int inflateAdapter;
    public Object[] injectMetric;
    public int peekRevision;
    public int popBlueprint;
    public int purgeNode;
    public int reduceScope;
    public HashMap releaseHeader;
    public ServerBuilder resetDelta;
    public int serializeOffset;
    public int updateTimer;
    public final RemoteDeserializer notifyMessage = new RemoteDeserializer();
    public final RemoteDeserializer connectPatch = new RemoteDeserializer();
    public final RemoteDeserializer attachConfig = new RemoteDeserializer();
    public int drawRequest = -1;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public /* synthetic */ ActivityMutator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ List injectMetric(ActivityMutator activityMutator, ElevationStack elevationStack, int i, ElevationStack elevationStack2, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            if ((i2 & 32) != 0) {
                z3 = true;
            }
            return activityMutator.growPayload(elevationStack, i, elevationStack2, z, z2, z3);
        }

        public final List growPayload(ElevationStack elevationStack, int i, ElevationStack elevationStack2, boolean z, boolean z2, boolean z3) {
            boolean z4;
            int connectPatch;
            int connectPatch2;
            List list;
            int connectPatch3;
            int purgeMetric = elevationStack.purgeMetric(i);
            int i2 = i + purgeMetric;
            int parseAsset = elevationStack.parseAsset(i);
            int parseAsset2 = elevationStack.parseAsset(i2);
            int i3 = parseAsset2 - parseAsset;
            boolean unlockMessage = elevationStack.unlockMessage(i);
            elevationStack2.transformCurrency(purgeMetric);
            elevationStack2.validateOffset(i3, elevationStack2.resetValue());
            if (elevationStack.flushSample < i2) {
                elevationStack.formatMessage(i2);
            }
            if (elevationStack.drawField < parseAsset2) {
                elevationStack.commitKey(parseAsset2, i2);
            }
            int[] iArr = elevationStack2.growPayload;
            int resetValue = elevationStack2.resetValue();
            int i4 = resetValue * 5;
            InsetsReader.updateTimer(elevationStack.growPayload, iArr, i4, i * 5, i2 * 5);
            Object[] objArr = elevationStack2.injectMetric;
            int i5 = elevationStack2.applyTask;
            System.arraycopy(elevationStack.injectMetric, parseAsset, objArr, i5, i3);
            int serializeTask = elevationStack2.serializeTask();
            iArr[i4 + 2] = serializeTask;
            int i6 = resetValue - i;
            int i7 = resetValue + purgeMetric;
            int mapJob = i5 - elevationStack2.mapJob(iArr, resetValue);
            int i8 = elevationStack2.peekRevision;
            int i9 = elevationStack2.connectJob;
            int length = objArr.length;
            int i10 = i8;
            int i11 = resetValue;
            while (true) {
                z4 = false;
                if (i11 >= i7) {
                    break;
                }
                if (i11 != resetValue) {
                    int i12 = (i11 * 5) + 2;
                    iArr[i12] = iArr[i12] + i6;
                }
                int[] iArr2 = iArr;
                int i13 = resetValue;
                iArr2[(i11 * 5) + 4] = elevationStack2.prepareTask(elevationStack2.mapJob(iArr, i11) + mapJob, i10 >= i11 ? elevationStack2.drawField : 0, i9, length);
                if (i11 == i10) {
                    i10++;
                }
                i11++;
                resetValue = i13;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            elevationStack2.peekRevision = i10;
            connectPatch = RotateJob.connectPatch(elevationStack.detachStream, i, elevationStack.injectField());
            connectPatch2 = RotateJob.connectPatch(elevationStack.detachStream, i2, elevationStack.injectField());
            if (connectPatch < connectPatch2) {
                ArrayList arrayList = elevationStack.detachStream;
                ArrayList arrayList2 = new ArrayList(connectPatch2 - connectPatch);
                for (int i14 = connectPatch; i14 < connectPatch2; i14++) {
                    TouchEvaluator touchEvaluator = (TouchEvaluator) arrayList.get(i14);
                    touchEvaluator.injectMetric(touchEvaluator.evictLayout() + i6);
                    arrayList2.add(touchEvaluator);
                }
                connectPatch3 = RotateJob.connectPatch(elevationStack2.detachStream, elevationStack2.resetValue(), elevationStack2.injectField());
                elevationStack2.detachStream.addAll(connectPatch3, arrayList2);
                arrayList.subList(connectPatch, connectPatch2).clear();
                list = arrayList2;
            } else {
                list = CursorBuilder.peekRevision();
            }
            if (!list.isEmpty()) {
                HashMap hashMap = elevationStack.releaseHeader;
                HashMap hashMap2 = elevationStack2.releaseHeader;
                if (hashMap != null && hashMap2 != null) {
                    int size = list.size();
                    for (int i15 = 0; i15 < size; i15++) {
                    }
                }
            }
            elevationStack2.serializeTask();
            elevationStack2.updateRule(serializeTask);
            int updateConstraint = elevationStack.updateConstraint(i);
            if (z3) {
                if (z) {
                    boolean z5 = updateConstraint >= 0;
                    if (z5) {
                        elevationStack.prependOptions();
                        elevationStack.findTask(updateConstraint - elevationStack.resetValue());
                        elevationStack.prependOptions();
                    }
                    elevationStack.findTask(i - elevationStack.resetValue());
                    boolean acquireAsset = elevationStack.acquireAsset();
                    if (z5) {
                        elevationStack.closeComponent();
                        elevationStack.updateAction();
                        elevationStack.closeComponent();
                        elevationStack.updateAction();
                    }
                    z4 = acquireAsset;
                } else {
                    z4 = elevationStack.flattenToken(i, purgeMetric);
                    elevationStack.prepareCount(parseAsset, i3, i - 1);
                }
            }
            if (z4) {
                MorphPatch.inflateAdapter("Unexpectedly removed anchors");
            }
            int i16 = elevationStack2.reduceScope;
            int i17 = iArr3[i4 + 1];
            elevationStack2.reduceScope = i16 + ((1073741824 & i17) == 0 ? i17 & TooltipPatch.injectMetric : 1);
            if (z2) {
                elevationStack2.inflateAdapter = i7;
                elevationStack2.applyTask = i5 + i3;
            }
            if (unlockMessage) {
                elevationStack2.clipRule(serializeTask);
            }
            return list;
        }

        public ActivityMutator() {
        }
    }

    public ElevationStack(ComponentSender componentSender) {
        this.evictLayout = componentSender;
        this.growPayload = componentSender.mergeLocale();
        this.injectMetric = componentSender.flattenPackage();
        this.detachStream = componentSender.expandArgs();
        this.releaseHeader = componentSender.storeCharset();
        this.clipOrigin = componentSender.findTask();
        this.flushSample = componentSender.syncScope();
        this.updateTimer = (this.growPayload.length / 5) - componentSender.syncScope();
        this.drawField = componentSender.injectConstraint();
        this.connectJob = this.injectMetric.length - componentSender.injectConstraint();
        this.peekRevision = componentSender.syncScope();
        this.purgeNode = componentSender.syncScope();
    }

    public static /* synthetic */ void normalizeBundle(ElevationStack elevationStack, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = elevationStack.drawRequest;
        }
        elevationStack.drawConfig(i);
    }

    public final int acquireArchive(int[] iArr, int i) {
        return offerHash(iArr[(locateSignal(i) * 5) + 2]);
    }

    public final boolean acquireAsset() {
        if (!(this.serializeOffset == 0)) {
            MorphPatch.inflateAdapter("Cannot remove group while inserting");
        }
        int i = this.inflateAdapter;
        int i2 = this.applyTask;
        int mapJob = mapJob(this.growPayload, locateSignal(i));
        int closeSource = closeSource();
        updateRule(this.drawRequest);
        StartupNode startupNode = this.decodePath;
        if (startupNode != null) {
            while (SpringThread.detachStream(startupNode) && SpringThread.releaseHeader(startupNode) >= i) {
                SpringThread.clipOrigin(startupNode);
            }
        }
        boolean flattenToken = flattenToken(i, this.inflateAdapter - i);
        prepareCount(mapJob, this.applyTask - mapJob, i - 1);
        this.inflateAdapter = i;
        this.applyTask = i2;
        this.reduceScope -= closeSource;
        return flattenToken;
    }

    public final Object appendEvent(TouchEvaluator touchEvaluator) {
        return subscribeEvent(touchEvaluator.releaseHeader(this));
    }

    public final ComponentSender appendKey() {
        return this.evictLayout;
    }

    public final int attachCallback(int i) {
        return i + (this.connectJob * (i < this.drawField ? 0 : 1));
    }

    public final boolean bindBody(int i) {
        return i >= 0 && (this.growPayload[(locateSignal(i) * 5) + 1] & 67108864) != 0;
    }

    public final int cancelArchive() {
        return this.growPayload.length / 5;
    }

    public final void clipRule(int i) {
        if (i >= 0) {
            StartupNode startupNode = this.decodePath;
            if (startupNode == null) {
                startupNode = SpringThread.injectMetric(null, 1, null);
                this.decodePath = startupNode;
            }
            SpringThread.evictLayout(startupNode, i);
        }
    }

    public final void closeComponent() {
        int i = this.purgeNode;
        this.inflateAdapter = i;
        this.applyTask = mapJob(this.growPayload, locateSignal(i));
    }

    public final List closePayload(ComponentSender componentSender, int i, boolean z) {
        int reduceScope;
        if (!(this.serializeOffset > 0)) {
            MorphPatch.inflateAdapter("Check failed");
        }
        if (i == 0 && this.inflateAdapter == 0 && this.evictLayout.syncScope() == 0) {
            reduceScope = RotateJob.reduceScope(componentSender.mergeLocale(), i);
            if (reduceScope == componentSender.syncScope()) {
                int[] iArr = this.growPayload;
                Object[] objArr = this.injectMetric;
                ArrayList arrayList = this.detachStream;
                HashMap hashMap = this.releaseHeader;
                ServerBuilder serverBuilder = this.clipOrigin;
                int[] mergeLocale = componentSender.mergeLocale();
                int syncScope = componentSender.syncScope();
                Object[] flattenPackage = componentSender.flattenPackage();
                int injectConstraint = componentSender.injectConstraint();
                HashMap storeCharset = componentSender.storeCharset();
                ServerBuilder findTask = componentSender.findTask();
                this.growPayload = mergeLocale;
                this.injectMetric = flattenPackage;
                this.detachStream = componentSender.expandArgs();
                this.flushSample = syncScope;
                this.updateTimer = (mergeLocale.length / 5) - syncScope;
                this.drawField = injectConstraint;
                this.connectJob = flattenPackage.length - injectConstraint;
                this.peekRevision = syncScope;
                this.releaseHeader = storeCharset;
                this.clipOrigin = findTask;
                componentSender.parseAsset(iArr, 0, objArr, 0, arrayList, hashMap, serverBuilder);
                return this.detachStream;
            }
        }
        ElevationStack bindBody = componentSender.bindBody();
        try {
            List growPayload = drawScope.growPayload(bindBody, i, this, true, true, z);
            bindBody.packPackage(true);
            return growPayload;
        } catch (Throwable th) {
            bindBody.packPackage(false);
            throw th;
        }
    }

    public final int closeSource() {
        int reduceScope;
        int locateSignal = locateSignal(this.inflateAdapter);
        int i = this.inflateAdapter;
        reduceScope = RotateJob.reduceScope(this.growPayload, locateSignal);
        int i2 = i + reduceScope;
        this.inflateAdapter = i2;
        this.applyTask = mapJob(this.growPayload, locateSignal(i2));
        int i3 = this.growPayload[(locateSignal * 5) + 1];
        if ((1073741824 & i3) != 0) {
            return 1;
        }
        return i3 & TooltipPatch.injectMetric;
    }

    public final void collectPolicy(Object obj) {
        int locateSignal = locateSignal(this.inflateAdapter);
        if (!((this.growPayload[(locateSignal * 5) + 1] & 268435456) != 0)) {
            MorphPatch.inflateAdapter("Updating the data of a group that was not created with a data slot");
        }
        this.injectMetric[attachCallback(injectConstraint(this.growPayload, locateSignal))] = obj;
    }

    public final void commitBounds(int i, int i2, int i3) {
        int connectPatch;
        int connectPatch2;
        TouchEvaluator touchEvaluator;
        int syncScope;
        int i4 = i3 + i;
        int injectField = injectField();
        connectPatch = RotateJob.connectPatch(this.detachStream, i, injectField);
        ArrayList arrayList = new ArrayList();
        if (connectPatch >= 0) {
            while (connectPatch < this.detachStream.size() && (syncScope = syncScope((touchEvaluator = (TouchEvaluator) this.detachStream.get(connectPatch)))) >= i && syncScope < i4) {
                arrayList.add(touchEvaluator);
            }
        }
        int i5 = i2 - i;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            TouchEvaluator touchEvaluator2 = (TouchEvaluator) arrayList.get(i6);
            int syncScope2 = syncScope(touchEvaluator2) + i5;
            if (syncScope2 >= this.flushSample) {
                touchEvaluator2.injectMetric(-(injectField - syncScope2));
            } else {
                touchEvaluator2.injectMetric(syncScope2);
            }
            connectPatch2 = RotateJob.connectPatch(this.detachStream, syncScope2, injectField);
            this.detachStream.add(connectPatch2, touchEvaluator2);
        }
    }

    public final void commitKey(int i, int i2) {
        int i3 = this.connectJob;
        int i4 = this.drawField;
        int i5 = this.peekRevision;
        if (i4 != i) {
            Object[] objArr = this.injectMetric;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int min = Math.min(i2 + 1, injectField());
        if (i5 != min) {
            int length = this.injectMetric.length - i3;
            if (min < i5) {
                int locateSignal = locateSignal(min);
                int locateSignal2 = locateSignal(i5);
                int i7 = this.flushSample;
                while (locateSignal < locateSignal2) {
                    int i8 = (locateSignal * 5) + 4;
                    int i9 = this.growPayload[i8];
                    if (!(i9 >= 0)) {
                        MorphPatch.inflateAdapter("Unexpected anchor value, expected a positive anchor");
                    }
                    this.growPayload[i8] = -((length - i9) + 1);
                    locateSignal++;
                    if (locateSignal == i7) {
                        locateSignal += this.updateTimer;
                    }
                }
            } else {
                int locateSignal3 = locateSignal(i5);
                int locateSignal4 = locateSignal(min);
                while (locateSignal3 < locateSignal4) {
                    int i10 = (locateSignal3 * 5) + 4;
                    int i11 = this.growPayload[i10];
                    if (!(i11 < 0)) {
                        MorphPatch.inflateAdapter("Unexpected anchor value, expected a negative anchor");
                    }
                    this.growPayload[i10] = i11 + length + 1;
                    locateSignal3++;
                    if (locateSignal3 == this.flushSample) {
                        locateSignal3 += this.updateTimer;
                    }
                }
            }
            this.peekRevision = min;
        }
        this.drawField = i;
    }

    public final void compressBody(TouchEvaluator touchEvaluator) {
        findTask(touchEvaluator.releaseHeader(this) - this.inflateAdapter);
    }

    public final boolean compressVersion(int i) {
        int i2 = this.drawRequest;
        if (i <= i2 || i >= this.purgeNode) {
            return i2 == 0 && i == 0;
        }
        return true;
    }

    public final Object computeTarget(int i) {
        int locateSignal = locateSignal(i);
        int[] iArr = this.growPayload;
        return (iArr[(locateSignal * 5) + 1] & 268435456) != 0 ? this.injectMetric[injectConstraint(iArr, locateSignal)] : NotificationFence.evictLayout.evictLayout();
    }

    public final void connectComponent() {
        if (!(this.serializeOffset > 0)) {
            NotificationCoordinator.growPayload("Unbalanced begin/end insert");
        }
        int i = this.serializeOffset - 1;
        this.serializeOffset = i;
        if (i == 0) {
            if (!(this.attachConfig.growPayload == this.notifyMessage.growPayload)) {
                MorphPatch.inflateAdapter("startGroup/endGroup mismatch while inserting");
            }
            protectChannel();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    public final void connectPool(int i, Object obj, boolean z, Object obj2) {
        int reduceScope;
        int i2;
        int i3 = this.drawRequest;
        Object[] objArr = this.serializeOffset > 0;
        this.attachConfig.updateTimer(this.reduceScope);
        if (objArr == true) {
            int i4 = this.inflateAdapter;
            int mapJob = mapJob(this.growPayload, locateSignal(i4));
            transformCurrency(1);
            this.applyTask = mapJob;
            this.popBlueprint = mapJob;
            int locateSignal = locateSignal(i4);
            NotificationFence.ActivityMutator activityMutator = NotificationFence.evictLayout;
            ?? r12 = obj != activityMutator.evictLayout() ? 1 : 0;
            ?? r13 = (z || obj2 == activityMutator.evictLayout()) ? 0 : 1;
            int prepareTask = prepareTask(mapJob, this.drawField, this.connectJob, this.injectMetric.length);
            if (prepareTask >= 0 && this.peekRevision < i4) {
                prepareTask = -(((this.injectMetric.length - this.connectJob) - prepareTask) + 1);
            }
            RotateJob.notifyMessage(this.growPayload, locateSignal, i, z, r12, r13, this.drawRequest, prepareTask);
            int i5 = (z ? 1 : 0) + r12 + r13;
            if (i5 > 0) {
                validateOffset(i5, i4);
                Object[] objArr2 = this.injectMetric;
                int i6 = this.applyTask;
                if (z) {
                    objArr2[i6] = obj2;
                    i6++;
                }
                if (r12 != 0) {
                    objArr2[i6] = obj;
                    i6++;
                }
                if (r13 != 0) {
                    objArr2[i6] = obj2;
                    i6++;
                }
                this.applyTask = i6;
            }
            this.reduceScope = 0;
            i2 = i4 + 1;
            this.drawRequest = i4;
            this.inflateAdapter = i2;
            if (i3 >= 0) {
                updateRule(i3);
            }
        } else {
            this.notifyMessage.updateTimer(i3);
            unwrapRecord();
            int i7 = this.inflateAdapter;
            int locateSignal2 = locateSignal(i7);
            if (!Intrinsics.areEqual(obj2, NotificationFence.evictLayout.evictLayout())) {
                if (z) {
                    escapeDelta(obj2);
                } else {
                    collectPolicy(obj2);
                }
            }
            this.applyTask = escapeBounds(this.growPayload, locateSignal2);
            this.popBlueprint = mapJob(this.growPayload, locateSignal(this.inflateAdapter + 1));
            int[] iArr = this.growPayload;
            this.reduceScope = iArr[(locateSignal2 * 5) + 1] & TooltipPatch.injectMetric;
            this.drawRequest = i7;
            this.inflateAdapter = i7 + 1;
            reduceScope = RotateJob.reduceScope(iArr, locateSignal2);
            i2 = i7 + reduceScope;
        }
        this.purgeNode = i2;
    }

    public final int dispatchTimezone(int i, int i2, int i3) {
        return i < 0 ? (i3 - i2) + i + 1 : i;
    }

    public final void drawConfig(int i) {
        int locateSignal = locateSignal(i);
        int[] iArr = this.growPayload;
        int i2 = (locateSignal * 5) + 1;
        if ((iArr[i2] & 134217728) != 0) {
            return;
        }
        RotateJob.decodePath(iArr, locateSignal, true);
        if ((this.growPayload[i2] & 67108864) != 0) {
            return;
        }
        clipRule(updateConstraint(i));
    }

    public final int emitStrategy(int i) {
        return this.growPayload[locateSignal(i) * 5];
    }

    public final int escapeBounds(int[] iArr, int i) {
        int inflateAdapter;
        if (i >= cancelArchive()) {
            return this.injectMetric.length - this.connectJob;
        }
        inflateAdapter = RotateJob.inflateAdapter(iArr, i);
        return dispatchTimezone(inflateAdapter, this.connectJob, this.injectMetric.length);
    }

    public final void escapeDelta(Object obj) {
        filterSchema(this.inflateAdapter, obj);
    }

    public final void evictOrigin(int i, Object obj, Object obj2) {
        connectPool(i, obj, false, obj2);
    }

    public final int executeConfig(int i) {
        return this.growPayload[(locateSignal(i) * 5) + 1] & TooltipPatch.injectMetric;
    }

    public final List executeRecord(int i, ComponentSender componentSender, int i2) {
        if (!(this.serializeOffset <= 0 && purgeMetric(this.inflateAdapter + i) == 1)) {
            MorphPatch.inflateAdapter("Check failed");
        }
        int i3 = this.inflateAdapter;
        int i4 = this.applyTask;
        int i5 = this.popBlueprint;
        findTask(i);
        prependOptions();
        storeCharset();
        ElevationStack bindBody = componentSender.bindBody();
        try {
            List injectMetric = ActivityMutator.injectMetric(drawScope, bindBody, i2, this, false, true, false, 32, null);
            bindBody.packPackage(true);
            connectComponent();
            updateAction();
            this.inflateAdapter = i3;
            this.applyTask = i4;
            this.popBlueprint = i5;
            return injectMetric;
        } catch (Throwable th) {
            bindBody.packPackage(false);
            throw th;
        }
    }

    public final void expandScope(int i) {
        int reduceScope;
        int reduceScope2;
        boolean z = true;
        if (!(this.serializeOffset == 0)) {
            MorphPatch.inflateAdapter("Cannot move a group while inserting");
        }
        if (!(i >= 0)) {
            MorphPatch.inflateAdapter("Parameter offset is out of bounds");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.inflateAdapter;
        int i3 = this.drawRequest;
        int i4 = this.purgeNode;
        int i5 = i2;
        for (int i6 = i; i6 > 0; i6--) {
            reduceScope2 = RotateJob.reduceScope(this.growPayload, locateSignal(i5));
            i5 += reduceScope2;
            if (!(i5 <= i4)) {
                MorphPatch.inflateAdapter("Parameter offset is out of bounds");
            }
        }
        reduceScope = RotateJob.reduceScope(this.growPayload, locateSignal(i5));
        int mapJob = mapJob(this.growPayload, locateSignal(this.inflateAdapter));
        int mapJob2 = mapJob(this.growPayload, locateSignal(i5));
        int i7 = i5 + reduceScope;
        int mapJob3 = mapJob(this.growPayload, locateSignal(i7));
        int i8 = mapJob3 - mapJob2;
        validateOffset(i8, Math.max(this.inflateAdapter - 1, 0));
        transformCurrency(reduceScope);
        int[] iArr = this.growPayload;
        int locateSignal = locateSignal(i7) * 5;
        InsetsReader.updateTimer(iArr, iArr, locateSignal(i2) * 5, locateSignal, (reduceScope * 5) + locateSignal);
        if (i8 > 0) {
            Object[] objArr = this.injectMetric;
            int attachCallback = attachCallback(mapJob2 + i8);
            System.arraycopy(objArr, attachCallback, objArr, mapJob, attachCallback(mapJob3 + i8) - attachCallback);
        }
        int i9 = mapJob2 + i8;
        int i10 = i9 - mapJob;
        int i11 = this.drawField;
        int i12 = this.connectJob;
        int length = this.injectMetric.length;
        int i13 = this.peekRevision;
        int i14 = i2 + reduceScope;
        int i15 = i2;
        while (i15 < i14) {
            boolean z2 = z;
            int locateSignal2 = locateSignal(i15);
            int i16 = i15;
            int i17 = i10;
            resetComponent(iArr, locateSignal2, prepareTask(mapJob(iArr, locateSignal2) - i10, i13 < locateSignal2 ? 0 : i11, i12, length));
            i15 = i16 + 1;
            z = z2;
            i10 = i17;
        }
        commitBounds(i7, i2, reduceScope);
        if (flattenToken(i7, reduceScope)) {
            MorphPatch.inflateAdapter("Unexpectedly removed anchors");
        }
        resumeSignature(i3, this.purgeNode, i2);
        if (i8 > 0) {
            prepareCount(i9, i8, i7 - 1);
        }
    }

    public final boolean filterPayload(int i) {
        int i2 = i + 1;
        int purgeMetric = i + purgeMetric(i);
        while (i2 < purgeMetric) {
            if ((this.growPayload[(locateSignal(i2) * 5) + 1] & 201326592) != 0) {
                return true;
            }
            i2 += purgeMetric(i2);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r1[(r0 * 5) + 1] & 1073741824) != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void filterSchema(int i, Object obj) {
        int locateSignal = locateSignal(i);
        int[] iArr = this.growPayload;
        boolean z = locateSignal < iArr.length;
        if (!z) {
            MorphPatch.inflateAdapter("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.injectMetric[attachCallback(loadItem(this.growPayload, locateSignal))] = obj;
    }

    public final void filterTimer(int i) {
        if (!(i > 0)) {
            MorphPatch.inflateAdapter("Check failed");
        }
        int i2 = this.drawRequest;
        int escapeBounds = escapeBounds(this.growPayload, locateSignal(i2));
        int mapJob = mapJob(this.growPayload, locateSignal(i2 + 1)) - i;
        if (!(mapJob >= escapeBounds)) {
            MorphPatch.inflateAdapter("Check failed");
        }
        prepareCount(mapJob, i, i2);
        int i3 = this.applyTask;
        if (i3 >= escapeBounds) {
            this.applyTask = i3 - i;
        }
    }

    public final void findTask(int i) {
        boolean z = false;
        if (!(i >= 0)) {
            MorphPatch.inflateAdapter("Cannot seek backwards");
        }
        if (!(this.serializeOffset <= 0)) {
            NotificationCoordinator.growPayload("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.inflateAdapter + i;
        if (i2 >= this.drawRequest && i2 <= this.purgeNode) {
            z = true;
        }
        if (!z) {
            MorphPatch.inflateAdapter("Cannot seek outside the current group (" + this.drawRequest + '-' + this.purgeNode + ')');
        }
        this.inflateAdapter = i2;
        int mapJob = mapJob(this.growPayload, locateSignal(i2));
        this.applyTask = mapJob;
        this.popBlueprint = mapJob;
    }

    public final void flattenPackage(TouchEvaluator touchEvaluator, Object obj) {
        if (!(this.serializeOffset == 0)) {
            MorphPatch.inflateAdapter("Can only append a slot if not current inserting");
        }
        int i = this.applyTask;
        int i2 = this.popBlueprint;
        int syncScope = syncScope(touchEvaluator);
        int mapJob = mapJob(this.growPayload, locateSignal(syncScope + 1));
        this.applyTask = mapJob;
        this.popBlueprint = mapJob;
        validateOffset(1, syncScope);
        if (i >= mapJob) {
            i++;
            i2++;
        }
        this.injectMetric[mapJob] = obj;
        this.applyTask = i;
        this.popBlueprint = i2;
    }

    public final boolean flattenToken(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.detachStream;
            formatMessage(i);
            r0 = arrayList.isEmpty() ? false : syncPool(i, i2, this.releaseHeader);
            this.flushSample = i;
            this.updateTimer += i2;
            int i3 = this.peekRevision;
            if (i3 > i) {
                this.peekRevision = Math.max(i, i3 - i2);
            }
            int i4 = this.purgeNode;
            if (i4 >= this.flushSample) {
                this.purgeNode = i4 - i2;
            }
            int i5 = this.drawRequest;
            if (bindBody(i5)) {
                clipRule(i5);
            }
        }
        return r0;
    }

    public final void flushHeader(int i, Object obj) {
        connectPool(i, obj, false, NotificationFence.evictLayout.evictLayout());
    }

    public final void formatMessage(int i) {
        int i2 = this.updateTimer;
        int i3 = this.flushSample;
        if (i3 != i) {
            if (!this.detachStream.isEmpty()) {
                queryDigest(i3, i);
            }
            if (i2 > 0) {
                int[] iArr = this.growPayload;
                int i4 = i * 5;
                int i5 = i2 * 5;
                int i6 = i3 * 5;
                if (i < i3) {
                    InsetsReader.updateTimer(iArr, iArr, i5 + i4, i4, i6);
                } else {
                    InsetsReader.updateTimer(iArr, iArr, i6, i6 + i5, i4 + i5);
                }
            }
            if (i < i3) {
                i3 = i + i2;
            }
            int cancelArchive = cancelArchive();
            if (!(i3 < cancelArchive)) {
                MorphPatch.inflateAdapter("Check failed");
            }
            while (i3 < cancelArchive) {
                int i7 = (i3 * 5) + 2;
                int i8 = this.growPayload[i7];
                int searchHolder = searchHolder(offerHash(i8), i);
                if (searchHolder != i8) {
                    this.growPayload[i7] = searchHolder;
                }
                i3++;
                if (i3 == i) {
                    i3 += i2;
                }
            }
        }
        this.flushSample = i;
    }

    public final void formatPosition(TouchEvaluator touchEvaluator) {
        startResource(touchEvaluator.releaseHeader(this));
    }

    public final void groupArchive(int i, IconExporter iconExporter) {
        int i2;
        int i3;
        TouchEvaluator evictLayout;
        IconExporter iconExporter2 = iconExporter;
        int updateConstraint = updateConstraint(i);
        int injectField = injectField();
        int purgeMetric = purgeMetric(i) + i;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i4 = i;
        SlideMulticaster slideMulticaster = null;
        StartupNode startupNode = null;
        while (i4 < purgeMetric) {
            int parseAsset = parseAsset(i4);
            int i5 = i4 + 1;
            int parseAsset2 = parseAsset(i5);
            while (true) {
                i2 = 0;
                if (parseAsset >= parseAsset2) {
                    break;
                }
                Object obj = this.injectMetric[attachCallback(parseAsset)];
                if ((obj instanceof TimelineHeap) && (evictLayout = ((TimelineHeap) obj).evictLayout()) != null && evictLayout.growPayload()) {
                    int syncScope = syncScope(evictLayout);
                    if (slideMulticaster == null) {
                        slideMulticaster = EndpointCache.growPayload();
                    }
                    if (startupNode == null) {
                        startupNode = new StartupNode(i2, 1, defaultConstructorMarker);
                    }
                    slideMulticaster.flushSample(syncScope);
                    startupNode.flushSample(syncScope);
                    startupNode.flushSample(parseAsset);
                } else {
                    iconExporter2.invoke(Integer.valueOf(parseAsset), obj);
                }
                parseAsset++;
            }
            int updateConstraint2 = i5 < injectField ? updateConstraint(i5) : -1;
            if (updateConstraint2 != i4) {
                while (true) {
                    if (startupNode == null || slideMulticaster == null || !slideMulticaster.attachConfig(i4)) {
                        i3 = injectField;
                    } else {
                        int i6 = startupNode.growPayload;
                        int i7 = i6 / 2;
                        int i8 = i2;
                        int i9 = i8;
                        while (i9 < i7) {
                            int i10 = i9 * 2;
                            int i11 = injectField;
                            int growPayload = startupNode.growPayload(i10);
                            if (growPayload == i4) {
                                int growPayload2 = startupNode.growPayload(i10 + 1);
                                iconExporter2.invoke(Integer.valueOf(growPayload2), this.injectMetric[attachCallback(growPayload2)]);
                            } else if (i10 != i8) {
                                int i12 = i8 + 1;
                                startupNode.serializeOffset(i8, growPayload);
                                i8 += 2;
                                startupNode.serializeOffset(i12, startupNode.growPayload(i10 + 1));
                            } else {
                                i8 += 2;
                            }
                            i9++;
                            iconExporter2 = iconExporter;
                            injectField = i11;
                        }
                        i3 = injectField;
                        if (i8 != i6) {
                            startupNode.peekRevision(i8, i6);
                        }
                    }
                    if (i4 != i && updateConstraint != updateConstraint2) {
                        i4 = updateConstraint;
                        injectField = i3;
                        i2 = 0;
                        updateConstraint = updateConstraint(updateConstraint);
                        iconExporter2 = iconExporter;
                    }
                }
            } else {
                i3 = injectField;
            }
            iconExporter2 = iconExporter;
            updateConstraint = updateConstraint2;
            i4 = i5;
            injectField = i3;
            defaultConstructorMarker = null;
        }
    }

    public final boolean growCallback(int i) {
        return (this.growPayload[(locateSignal(i) * 5) + 1] & 1073741824) != 0;
    }

    public final Object handleFooter(int i) {
        int attachConfig;
        int locateSignal = locateSignal(i);
        int[] iArr = this.growPayload;
        if ((iArr[(locateSignal * 5) + 1] & 536870912) == 0) {
            return null;
        }
        Object[] objArr = this.injectMetric;
        attachConfig = RotateJob.attachConfig(iArr, locateSignal);
        return objArr[attachConfig];
    }

    public final Object inflateEdge(int i) {
        int attachCallback = attachCallback(i);
        Object[] objArr = this.injectMetric;
        Object obj = objArr[attachCallback];
        objArr[attachCallback] = NotificationFence.evictLayout.evictLayout();
        return obj;
    }

    public final int injectConstraint(int[] iArr, int i) {
        return mapJob(iArr, i) + Integer.bitCount(iArr[(i * 5) + 1] >> 29);
    }

    public final int injectField() {
        return cancelArchive() - this.updateTimer;
    }

    public final int loadItem(int[] iArr, int i) {
        return mapJob(iArr, i);
    }

    public final int locateSignal(int i) {
        return i + (this.updateTimer * (i < this.flushSample ? 0 : 1));
    }

    public final int mapJob(int[] iArr, int i) {
        return i >= cancelArchive() ? this.injectMetric.length - this.connectJob : dispatchTimezone(iArr[(i * 5) + 4], this.connectJob, this.injectMetric.length);
    }

    public final Object measureEndpoint(int i, int i2, Object obj) {
        int attachCallback = attachCallback(openJob(i, i2));
        Object[] objArr = this.injectMetric;
        Object obj2 = objArr[attachCallback];
        objArr[attachCallback] = obj;
        return obj2;
    }

    public final TouchEvaluator mergeLocale(int i) {
        int resetDelta;
        ArrayList arrayList = this.detachStream;
        resetDelta = RotateJob.resetDelta(arrayList, i, injectField());
        if (resetDelta >= 0) {
            return (TouchEvaluator) arrayList.get(resetDelta);
        }
        if (i > this.flushSample) {
            i = -(injectField() - i);
        }
        TouchEvaluator touchEvaluator = new TouchEvaluator(i);
        arrayList.add(-(resetDelta + 1), touchEvaluator);
        return touchEvaluator;
    }

    public final void normalizeMetadata(int i, StartupNode startupNode) {
        int locateSignal = locateSignal(i);
        boolean filterPayload = filterPayload(i);
        int[] iArr = this.growPayload;
        if (((iArr[(locateSignal * 5) + 1] & 67108864) != 0) != filterPayload) {
            RotateJob.drawRequest(iArr, locateSignal, filterPayload);
            int updateConstraint = updateConstraint(i);
            if (updateConstraint >= 0) {
                SpringThread.evictLayout(startupNode, updateConstraint);
            }
        }
    }

    public final Object observeNode(int i, int i2) {
        int escapeBounds = escapeBounds(this.growPayload, locateSignal(i));
        int mapJob = mapJob(this.growPayload, locateSignal(i + 1));
        int i3 = i2 + escapeBounds;
        if (escapeBounds > i3 || i3 >= mapJob) {
            return NotificationFence.evictLayout.evictLayout();
        }
        return this.injectMetric[attachCallback(i3)];
    }

    public final int offerHash(int i) {
        return i > -2 ? i : (injectField() + i) - (-2);
    }

    public final int openJob(int i, int i2) {
        int escapeBounds = escapeBounds(this.growPayload, locateSignal(i));
        int i3 = escapeBounds + i2;
        if (!(i3 >= escapeBounds && i3 < mapJob(this.growPayload, locateSignal(i + 1)))) {
            MorphPatch.inflateAdapter("Write to an invalid slot index " + i2 + " for group " + i);
        }
        return i3;
    }

    public final void packPackage(boolean z) {
        this.gatherAdapter = true;
        if (z && this.notifyMessage.growPayload == 0) {
            formatMessage(injectField());
            commitKey(this.injectMetric.length - this.connectJob, this.flushSample);
            queryModel();
            queryData();
        }
        this.evictLayout.serializeOffset(this, this.growPayload, this.flushSample, this.injectMetric, this.drawField, this.detachStream, this.releaseHeader, this.clipOrigin);
    }

    public final int parseAsset(int i) {
        return mapJob(this.growPayload, locateSignal(i));
    }

    public final boolean peekDescriptor() {
        int i = this.inflateAdapter;
        return i < this.purgeNode && (this.growPayload[(locateSignal(i) * 5) + 1] & 1073741824) != 0;
    }

    public final void popScope(int i, Object obj) {
        connectPool(i, obj, true, NotificationFence.evictLayout.evictLayout());
    }

    public final void prepareCount(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.connectJob;
            int i5 = i + i2;
            commitKey(i5, i3);
            this.drawField = i;
            this.connectJob = i4 + i2;
            InsetsReader.inflateAdapter(this.injectMetric, null, i, i5);
            int i6 = this.popBlueprint;
            if (i6 >= i) {
                this.popBlueprint = i6 - i2;
            }
        }
    }

    public final int prepareTask(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public final void prependArchive(Object obj) {
        if (!(this.applyTask <= this.popBlueprint)) {
            MorphPatch.inflateAdapter("Writing to an invalid slot");
        }
        this.injectMetric[attachCallback(this.applyTask - 1)] = obj;
    }

    public final void prependOptions() {
        if (!(this.serializeOffset == 0)) {
            MorphPatch.inflateAdapter("Key must be supplied when inserting");
        }
        NotificationFence.ActivityMutator activityMutator = NotificationFence.evictLayout;
        connectPool(0, activityMutator.evictLayout(), false, activityMutator.evictLayout());
    }

    public final int protectChannel() {
        int cancelArchive = (cancelArchive() - this.updateTimer) - this.connectPatch.flushSample();
        this.purgeNode = cancelArchive;
        return cancelArchive;
    }

    public final boolean protectGauge(int i) {
        return refreshCounter(i, this.inflateAdapter);
    }

    public final int purgeMetric(int i) {
        int reduceScope;
        reduceScope = RotateJob.reduceScope(this.growPayload, locateSignal(i));
        return reduceScope;
    }

    public final void queryData() {
        StartupNode startupNode = this.decodePath;
        if (startupNode != null) {
            while (SpringThread.detachStream(startupNode)) {
                normalizeMetadata(SpringThread.clipOrigin(startupNode), startupNode);
            }
        }
    }

    public final int queryDescriptor(int i) {
        return mapJob(this.growPayload, locateSignal(i + 1));
    }

    public final void queryDigest(int i, int i2) {
        int connectPatch;
        TouchEvaluator touchEvaluator;
        int evictLayout;
        int connectPatch2;
        TouchEvaluator touchEvaluator2;
        int evictLayout2;
        int i3;
        int cancelArchive = cancelArchive() - this.updateTimer;
        if (i >= i2) {
            for (connectPatch = RotateJob.connectPatch(this.detachStream, i2, cancelArchive); connectPatch < this.detachStream.size() && (evictLayout = (touchEvaluator = (TouchEvaluator) this.detachStream.get(connectPatch)).evictLayout()) >= 0; connectPatch++) {
                touchEvaluator.injectMetric(-(cancelArchive - evictLayout));
            }
            return;
        }
        for (connectPatch2 = RotateJob.connectPatch(this.detachStream, i, cancelArchive); connectPatch2 < this.detachStream.size() && (evictLayout2 = (touchEvaluator2 = (TouchEvaluator) this.detachStream.get(connectPatch2)).evictLayout()) < 0 && (i3 = evictLayout2 + cancelArchive) < i2; connectPatch2++) {
            touchEvaluator2.injectMetric(i3);
        }
    }

    public final void queryModel() {
        int i = this.drawField;
        InsetsReader.inflateAdapter(this.injectMetric, null, i, this.connectJob + i);
    }

    public final boolean refreshCounter(int i, int i2) {
        int cancelArchive;
        int purgeMetric;
        if (i2 == this.drawRequest) {
            cancelArchive = this.purgeNode;
        } else {
            if (i2 > this.notifyMessage.clipOrigin(0)) {
                purgeMetric = purgeMetric(i2);
            } else {
                int growPayload = this.notifyMessage.growPayload(i2);
                if (growPayload < 0) {
                    purgeMetric = purgeMetric(i2);
                } else {
                    cancelArchive = (cancelArchive() - this.updateTimer) - this.connectPatch.detachStream(growPayload);
                }
            }
            cancelArchive = purgeMetric + i2;
        }
        return i > i2 && i < cancelArchive;
    }

    public final int removeCount(int i) {
        SlotWorkflow slotWorkflow;
        int transformCount = this.applyTask - transformCount(i);
        ServerBuilder serverBuilder = this.resetDelta;
        return transformCount + ((serverBuilder == null || (slotWorkflow = (SlotWorkflow) serverBuilder.growPayload(i)) == null) ? 0 : slotWorkflow.detachStream());
    }

    public final TouchEvaluator removeSource(int i) {
        TouchEvaluator serializeOffset;
        if (i < 0 || i >= injectField()) {
            return null;
        }
        serializeOffset = RotateJob.serializeOffset(this.detachStream, i, injectField());
        return serializeOffset;
    }

    public final void resetComponent(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 4] = prepareTask(i2, this.drawField, this.connectJob, this.injectMetric.length);
    }

    public final int resetValue() {
        return this.inflateAdapter;
    }

    public final boolean resolveDelta() {
        return this.gatherAdapter;
    }

    public final void resumeSignature(int i, int i2, int i3) {
        int reduceScope;
        int searchHolder = searchHolder(i, this.flushSample);
        while (i3 < i2) {
            this.growPayload[(locateSignal(i3) * 5) + 2] = searchHolder;
            reduceScope = RotateJob.reduceScope(this.growPayload, locateSignal(i3));
            int i4 = reduceScope + i3;
            resumeSignature(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public final Object saveMessage(Object obj) {
        if (this.serializeOffset <= 0 || this.applyTask == this.drawField) {
            return saveSnapshot(obj);
        }
        ServerBuilder serverBuilder = this.resetDelta;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i = 1;
        int i2 = 0;
        if (serverBuilder == null) {
            serverBuilder = new ServerBuilder(i2, i, defaultConstructorMarker);
        }
        this.resetDelta = serverBuilder;
        int i3 = this.drawRequest;
        Object growPayload = serverBuilder.growPayload(i3);
        if (growPayload == null) {
            growPayload = new SlotWorkflow(i2, i, defaultConstructorMarker);
            serverBuilder.attachConfig(i3, growPayload);
        }
        ((SlotWorkflow) growPayload).drawField(obj);
        return NotificationFence.evictLayout.evictLayout();
    }

    public final Object saveSnapshot(Object obj) {
        Object trimCallback = trimCallback();
        prependArchive(obj);
        return trimCallback;
    }

    public final int searchHolder(int i, int i2) {
        return i < i2 ? i : -((injectField() - i) + 2);
    }

    public final int serializeTask() {
        return this.drawRequest;
    }

    public final void sortSnapshot() {
        if (!(this.serializeOffset == 0)) {
            MorphPatch.inflateAdapter("Cannot reset when inserting");
        }
        queryData();
        this.inflateAdapter = 0;
        this.purgeNode = cancelArchive() - this.updateTimer;
        this.applyTask = 0;
        this.popBlueprint = 0;
        this.reduceScope = 0;
    }

    public final void startResource(int i) {
        boolean z = false;
        if (!(this.serializeOffset <= 0)) {
            MorphPatch.inflateAdapter("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.drawRequest;
        if (i2 != i) {
            if (i >= i2 && i < this.purgeNode) {
                z = true;
            }
            if (!z) {
                MorphPatch.inflateAdapter("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.inflateAdapter;
            int i4 = this.applyTask;
            int i5 = this.popBlueprint;
            this.inflateAdapter = i;
            prependOptions();
            this.inflateAdapter = i3;
            this.applyTask = i4;
            this.popBlueprint = i5;
        }
    }

    public final void storeCharset() {
        int i = this.serializeOffset;
        this.serializeOffset = i + 1;
        if (i == 0) {
            unwrapRecord();
        }
    }

    public final Object subscribeEvent(int i) {
        int locateSignal = locateSignal(i);
        int[] iArr = this.growPayload;
        if ((iArr[(locateSignal * 5) + 1] & 1073741824) != 0) {
            return this.injectMetric[attachCallback(loadItem(iArr, locateSignal))];
        }
        return null;
    }

    public final boolean syncPool(int i, int i2, HashMap hashMap) {
        int connectPatch;
        int i3 = i2 + i;
        connectPatch = RotateJob.connectPatch(this.detachStream, i3, cancelArchive() - this.updateTimer);
        if (connectPatch >= this.detachStream.size()) {
            connectPatch--;
        }
        int i4 = connectPatch + 1;
        int i5 = 0;
        while (connectPatch >= 0) {
            TouchEvaluator touchEvaluator = (TouchEvaluator) this.detachStream.get(connectPatch);
            int syncScope = syncScope(touchEvaluator);
            if (syncScope < i) {
                break;
            }
            if (syncScope < i3) {
                touchEvaluator.injectMetric(Integer.MIN_VALUE);
                if (hashMap != null) {
                }
                if (i5 == 0) {
                    i5 = connectPatch + 1;
                }
                i4 = connectPatch;
            }
            connectPatch--;
        }
        boolean z = i4 < i5;
        if (z) {
            this.detachStream.subList(i4, i5).clear();
        }
        return z;
    }

    public final int syncScope(TouchEvaluator touchEvaluator) {
        int evictLayout = touchEvaluator.evictLayout();
        return evictLayout < 0 ? injectField() + evictLayout : evictLayout;
    }

    public String toString() {
        return "SlotWriter(current = " + this.inflateAdapter + " end=" + this.purgeNode + " size = " + injectField() + " gap=" + this.flushSample + '-' + (this.flushSample + this.updateTimer) + ')';
    }

    public final int transformCount(int i) {
        return escapeBounds(this.growPayload, locateSignal(i));
    }

    public final void transformCurrency(int i) {
        if (i > 0) {
            int i2 = this.inflateAdapter;
            formatMessage(i2);
            int i3 = this.flushSample;
            int i4 = this.updateTimer;
            int[] iArr = this.growPayload;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i6 = max - i5;
                InsetsReader.updateTimer(iArr, iArr2, 0, 0, i3 * 5);
                InsetsReader.updateTimer(iArr, iArr2, (i3 + i6) * 5, (i4 + i3) * 5, length * 5);
                this.growPayload = iArr2;
                i4 = i6;
            }
            int i7 = this.purgeNode;
            if (i7 >= i3) {
                this.purgeNode = i7 + i;
            }
            int i8 = i3 + i;
            this.flushSample = i8;
            this.updateTimer = i4 - i;
            int prepareTask = prepareTask(i5 > 0 ? parseAsset(i2 + i) : 0, this.peekRevision >= i3 ? this.drawField : 0, this.connectJob, this.injectMetric.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.growPayload[(i9 * 5) + 4] = prepareTask;
            }
            int i10 = this.peekRevision;
            if (i10 >= i3) {
                this.peekRevision = i10 + i;
            }
        }
    }

    public final Object trimCallback() {
        if (this.serializeOffset > 0) {
            validateOffset(1, this.drawRequest);
        }
        Object[] objArr = this.injectMetric;
        int i = this.applyTask;
        this.applyTask = i + 1;
        return objArr[attachCallback(i)];
    }

    public final Object trimState(TouchEvaluator touchEvaluator, int i) {
        return observeNode(syncScope(touchEvaluator), i);
    }

    public final boolean unlockMessage(int i) {
        return i >= 0 && (this.growPayload[(locateSignal(i) * 5) + 1] & 201326592) != 0;
    }

    public final void unwrapRecord() {
        this.connectPatch.updateTimer((cancelArchive() - this.updateTimer) - this.purgeNode);
    }

    public final int updateAction() {
        int reduceScope;
        int reduceScope2;
        SlotWorkflow slotWorkflow;
        boolean z = this.serializeOffset > 0;
        int i = this.inflateAdapter;
        int i2 = this.purgeNode;
        int i3 = this.drawRequest;
        int locateSignal = locateSignal(i3);
        int i4 = this.reduceScope;
        int i5 = i - i3;
        int i6 = (locateSignal * 5) + 1;
        boolean z2 = (this.growPayload[i6] & 1073741824) != 0;
        if (z) {
            ServerBuilder serverBuilder = this.resetDelta;
            if (serverBuilder != null && (slotWorkflow = (SlotWorkflow) serverBuilder.growPayload(i3)) != null) {
                Object[] objArr = slotWorkflow.evictLayout;
                int i7 = slotWorkflow.growPayload;
                for (int i8 = 0; i8 < i7; i8++) {
                    saveSnapshot(objArr[i8]);
                }
            }
            RotateJob.gatherAdapter(this.growPayload, locateSignal, i5);
            RotateJob.drawScope(this.growPayload, locateSignal, i4);
            this.reduceScope = this.attachConfig.flushSample() + (z2 ? 1 : i4);
            int acquireArchive = acquireArchive(this.growPayload, i3);
            this.drawRequest = acquireArchive;
            int injectField = acquireArchive < 0 ? injectField() : locateSignal(acquireArchive + 1);
            int mapJob = injectField >= 0 ? mapJob(this.growPayload, injectField) : 0;
            this.applyTask = mapJob;
            this.popBlueprint = mapJob;
            return i4;
        }
        if (!(i == i2)) {
            MorphPatch.inflateAdapter("Expected to be at the end of a group");
        }
        reduceScope = RotateJob.reduceScope(this.growPayload, locateSignal);
        int[] iArr = this.growPayload;
        int i9 = iArr[i6] & TooltipPatch.injectMetric;
        RotateJob.gatherAdapter(iArr, locateSignal, i5);
        RotateJob.drawScope(this.growPayload, locateSignal, i4);
        int flushSample = this.notifyMessage.flushSample();
        protectChannel();
        this.drawRequest = flushSample;
        int acquireArchive2 = acquireArchive(this.growPayload, i3);
        int flushSample2 = this.attachConfig.flushSample();
        this.reduceScope = flushSample2;
        if (acquireArchive2 == flushSample) {
            this.reduceScope = flushSample2 + (z2 ? 0 : i4 - i9);
            return i4;
        }
        int i10 = i5 - reduceScope;
        int i11 = z2 ? 0 : i4 - i9;
        if (i10 != 0 || i11 != 0) {
            while (acquireArchive2 != 0 && acquireArchive2 != flushSample && (i11 != 0 || i10 != 0)) {
                int locateSignal2 = locateSignal(acquireArchive2);
                if (i10 != 0) {
                    reduceScope2 = RotateJob.reduceScope(this.growPayload, locateSignal2);
                    RotateJob.gatherAdapter(this.growPayload, locateSignal2, reduceScope2 + i10);
                }
                if (i11 != 0) {
                    int[] iArr2 = this.growPayload;
                    RotateJob.drawScope(iArr2, locateSignal2, (iArr2[(locateSignal2 * 5) + 1] & TooltipPatch.injectMetric) + i11);
                }
                int[] iArr3 = this.growPayload;
                if ((iArr3[(locateSignal2 * 5) + 1] & 1073741824) != 0) {
                    i11 = 0;
                }
                acquireArchive2 = acquireArchive(iArr3, acquireArchive2);
            }
        }
        this.reduceScope += i11;
        return i4;
    }

    public final int updateConstraint(int i) {
        return acquireArchive(this.growPayload, i);
    }

    public final AccentPatch updateRule(int i) {
        TouchEvaluator removeSource;
        HashMap hashMap = this.releaseHeader;
        if (hashMap == null || (removeSource = removeSource(i)) == null) {
            return null;
        }
        return (AccentPatch) hashMap.get(removeSource);
    }

    public final void validateOffset(int i, int i2) {
        if (i > 0) {
            commitKey(this.applyTask, i2);
            int i3 = this.drawField;
            int i4 = this.connectJob;
            if (i4 < i) {
                Object[] objArr = this.injectMetric;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.injectMetric = objArr2;
                i4 = i7;
            }
            int i9 = this.popBlueprint;
            if (i9 >= i3) {
                this.popBlueprint = i9 + i;
            }
            this.drawField = i3 + i;
            this.connectJob = i4 - i;
        }
    }

    public final void wrapConfig() {
        this.releaseHeader = this.evictLayout.storeCharset();
        this.clipOrigin = this.evictLayout.findTask();
    }

    public final void wrapModel(TouchEvaluator touchEvaluator, Object obj) {
        filterSchema(touchEvaluator.releaseHeader(this), obj);
    }
}
