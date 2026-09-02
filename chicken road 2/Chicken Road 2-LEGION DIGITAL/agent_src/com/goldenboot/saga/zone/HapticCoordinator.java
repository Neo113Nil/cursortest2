package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.AccentSerializer;
import com.goldenboot.saga.zone.DefaultRelay;
import com.goldenboot.saga.zone.PlatformParagraphStyle;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\" \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\" \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004\" \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0004\"$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0000*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\u0000*\u00020\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/goldenboot/saga/zone/PaletteMap;", "Lcom/goldenboot/saga/zone/IconUpgrade;", "", "evictLayout", "Lcom/goldenboot/saga/zone/PaletteMap;", "PlatformParagraphStyleSaver", "Lcom/goldenboot/saga/zone/AccentSerializer;", "growPayload", "LineBreakSaver", "Lcom/goldenboot/saga/zone/DefaultRelay;", "injectMetric", "TextMotionSaver", "Lcom/goldenboot/saga/zone/IconUpgrade$ActivityMutator;", "serializeOffset", "(Lcom/goldenboot/saga/zone/IconUpgrade$ActivityMutator;)Lcom/goldenboot/saga/zone/PaletteMap;", "Saver", "Lcom/goldenboot/saga/zone/AccentSerializer$ActivityMutator;", "peekRevision", "(Lcom/goldenboot/saga/zone/AccentSerializer$ActivityMutator;)Lcom/goldenboot/saga/zone/PaletteMap;", "Lcom/goldenboot/saga/zone/DefaultRelay$ActivityMutator;", "reduceScope", "(Lcom/goldenboot/saga/zone/DefaultRelay$ActivityMutator;)Lcom/goldenboot/saga/zone/PaletteMap;", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HapticCoordinator {
    private static final PaletteMap evictLayout = MarginEncoder.releaseHeader(new IconExporter() { // from class: com.goldenboot.saga.zone.BackgroundTransformer
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object applyTask;
            applyTask = HapticCoordinator.applyTask((ItemStore) obj, (PlatformParagraphStyle) obj2);
            return applyTask;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.ColorBeacon
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            PlatformParagraphStyle popBlueprint;
            popBlueprint = HapticCoordinator.popBlueprint(obj);
            return popBlueprint;
        }
    });
    private static final PaletteMap growPayload = MarginEncoder.releaseHeader(new IconExporter() { // from class: com.goldenboot.saga.zone.SharedExecutor
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object flushSample;
            flushSample = HapticCoordinator.flushSample((ItemStore) obj, (AccentSerializer) obj2);
            return flushSample;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.SaveArbitrator
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            AccentSerializer updateTimer;
            updateTimer = HapticCoordinator.updateTimer(obj);
            return updateTimer;
        }
    });
    private static final PaletteMap injectMetric = MarginEncoder.releaseHeader(new IconExporter() { // from class: com.goldenboot.saga.zone.ServerSaver
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object drawField;
            drawField = HapticCoordinator.drawField((ItemStore) obj, (DefaultRelay) obj2);
            return drawField;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.ContentWorkflow
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            DefaultRelay connectJob;
            connectJob = HapticCoordinator.connectJob(obj);
            return connectJob;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object applyTask(ItemStore itemStore, PlatformParagraphStyle platformParagraphStyle) {
        return CursorBuilder.flushSample(ElevationMaker.popScope(Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding())), ElevationMaker.popScope(HoverCurator.detachStream(platformParagraphStyle.getEmojiSupportMatch())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultRelay connectJob(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        DefaultRelay.BounceHandler bounceHandler = obj2 != null ? (DefaultRelay.BounceHandler) obj2 : null;
        Intrinsics.checkNotNull(bounceHandler);
        int value = bounceHandler.getValue();
        Object obj3 = list.get(1);
        Boolean bool = obj3 != null ? (Boolean) obj3 : null;
        Intrinsics.checkNotNull(bool);
        return new DefaultRelay(value, bool.booleanValue(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object drawField(ItemStore itemStore, DefaultRelay defaultRelay) {
        return CursorBuilder.flushSample(ElevationMaker.popScope(DefaultRelay.BounceHandler.detachStream(defaultRelay.getLinearity())), ElevationMaker.popScope(Boolean.valueOf(defaultRelay.getSubpixelTextPositioning())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object flushSample(ItemStore itemStore, AccentSerializer accentSerializer) {
        return Integer.valueOf(accentSerializer.getMask());
    }

    public static final PaletteMap peekRevision(AccentSerializer.Companion companion) {
        return growPayload;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlatformParagraphStyle popBlueprint(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Boolean bool = obj2 != null ? (Boolean) obj2 : null;
        Intrinsics.checkNotNull(bool);
        boolean booleanValue = bool.booleanValue();
        Object obj3 = list.get(1);
        HoverCurator hoverCurator = obj3 != null ? (HoverCurator) obj3 : null;
        Intrinsics.checkNotNull(hoverCurator);
        return new PlatformParagraphStyle(hoverCurator.getValue(), booleanValue, (DefaultConstructorMarker) null);
    }

    public static final PaletteMap reduceScope(DefaultRelay.Companion companion) {
        return injectMetric;
    }

    public static final PaletteMap serializeOffset(PlatformParagraphStyle.Companion companion) {
        return evictLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccentSerializer updateTimer(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        return AccentSerializer.releaseHeader(AccentSerializer.clipOrigin(((Integer) obj).intValue()));
    }
}
