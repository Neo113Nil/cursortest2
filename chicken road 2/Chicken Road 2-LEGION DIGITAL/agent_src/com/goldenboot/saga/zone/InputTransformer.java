package com.goldenboot.saga.zone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class InputTransformer implements FlingBuffer, androidx.compose.ui.layout.PanelUtil {
    public final HashMap attachConfig = new HashMap();
    public final PanelRouter connectPatch;
    public final ProgressHandler notifyMessage;
    public final SingletonPump reduceScope;

    public InputTransformer(SingletonPump singletonPump, ProgressHandler progressHandler) {
        this.reduceScope = singletonPump;
        this.notifyMessage = progressHandler;
        this.connectPatch = (PanelRouter) singletonPump.detachStream().invoke();
    }

    @Override // com.goldenboot.saga.zone.BackgroundCollection
    public long broadcastPacket(int i) {
        return this.notifyMessage.broadcastPacket(i);
    }

    @Override // androidx.compose.ui.layout.PanelUtil
    public ContentConfigurator cacheStack(int i, int i2, Map map, TouchRecord touchRecord, TouchRecord touchRecord2) {
        return this.notifyMessage.cacheStack(i, i2, map, touchRecord, touchRecord2);
    }

    @Override // com.goldenboot.saga.zone.BackgroundCollection
    public ChipSnapshot collectPolicy(DpRect dpRect) {
        return this.notifyMessage.collectPolicy(dpRect);
    }

    @Override // com.goldenboot.saga.zone.BackgroundCollection
    public long commitItem(float f) {
        return this.notifyMessage.commitItem(f);
    }

    @Override // com.goldenboot.saga.zone.FlingBuffer
    public List dispatchField(int i, long j) {
        List list = (List) this.attachConfig.get(Integer.valueOf(i));
        if (list != null) {
            return list;
        }
        Object evictLayout = this.connectPatch.evictLayout(i);
        List<BreadcrumbMerger> extractPosition = this.notifyMessage.extractPosition(evictLayout, this.reduceScope.growPayload(i, evictLayout, this.connectPatch.detachStream(i)));
        int size = extractPosition.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(extractPosition.get(i2).prependArchive(j));
        }
        this.attachConfig.put(Integer.valueOf(i), arrayList);
        return arrayList;
    }

    @Override // com.goldenboot.saga.zone.BackgroundCollection
    public float disposeVersion(long j) {
        return this.notifyMessage.disposeVersion(j);
    }

    @Override // com.goldenboot.saga.zone.BackgroundCollection
    public long evictOrigin(long j) {
        return this.notifyMessage.evictOrigin(j);
    }

    @Override // com.goldenboot.saga.zone.BackgroundCollection
    public long filterFormat(long j) {
        return this.notifyMessage.filterFormat(j);
    }

    @Override // com.goldenboot.saga.zone.SequenceFacilitator
    public long filterPayload(float f) {
        return this.notifyMessage.filterPayload(f);
    }

    @Override // com.goldenboot.saga.zone.BackgroundCollection
    public int flattenAsset(long j) {
        return this.notifyMessage.flattenAsset(j);
    }

    @Override // com.goldenboot.saga.zone.SequenceFacilitator
    /* renamed from: formatPosition */
    public float getFontScale() {
        return this.notifyMessage.getFontScale();
    }

    @Override // com.goldenboot.saga.zone.BackgroundCollection
    public float getDensity() {
        return this.notifyMessage.getDensity();
    }

    @Override // com.goldenboot.saga.zone.ProducerRecovery
    public LabelCache getLayoutDirection() {
        return this.notifyMessage.getLayoutDirection();
    }

    @Override // com.goldenboot.saga.zone.BackgroundCollection
    public int lookupStream(float f) {
        return this.notifyMessage.lookupStream(f);
    }

    @Override // com.goldenboot.saga.zone.SequenceFacilitator
    public float packPackage(long j) {
        return this.notifyMessage.packPackage(j);
    }

    @Override // com.goldenboot.saga.zone.BackgroundCollection
    public float purgeEdge(float f) {
        return this.notifyMessage.purgeEdge(f);
    }

    @Override // com.goldenboot.saga.zone.BackgroundCollection
    public float pushPatch(float f) {
        return this.notifyMessage.pushPatch(f);
    }

    @Override // com.goldenboot.saga.zone.BackgroundCollection
    public float reduceSchema(int i) {
        return this.notifyMessage.reduceSchema(i);
    }

    @Override // androidx.compose.ui.layout.PanelUtil
    public ContentConfigurator removeStrategy(int i, int i2, Map map, TouchRecord touchRecord) {
        return this.notifyMessage.removeStrategy(i, i2, map, touchRecord);
    }

    @Override // com.goldenboot.saga.zone.ProducerRecovery
    public boolean saveBlueprint() {
        return this.notifyMessage.saveBlueprint();
    }
}
