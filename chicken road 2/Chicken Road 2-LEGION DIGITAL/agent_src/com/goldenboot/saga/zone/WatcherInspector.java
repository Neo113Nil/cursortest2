package com.goldenboot.saga.zone;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.layout.GradientActivator;
import com.goldenboot.saga.zone.FrameIndex;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class WatcherInspector {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler extends Lambda implements TouchRecord {
        public final /* synthetic */ SlotDispatcher attachConfig;
        public final /* synthetic */ boolean connectPatch;
        public final /* synthetic */ ProxySteward notifyMessage;
        public final /* synthetic */ List reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BounceHandler(List list, ProxySteward proxySteward, boolean z, SlotDispatcher slotDispatcher) {
            super(1);
            this.reduceScope = list;
            this.notifyMessage = proxySteward;
            this.connectPatch = z;
            this.attachConfig = slotDispatcher;
        }

        public final void evictLayout(GradientActivator.ActivityMutator activityMutator) {
            List list = this.reduceScope;
            ProxySteward proxySteward = this.notifyMessage;
            boolean z = this.connectPatch;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ProxySteward proxySteward2 = (ProxySteward) list.get(i);
                if (proxySteward2 != proxySteward) {
                    proxySteward2.connectPatch(activityMutator, z);
                }
            }
            ProxySteward proxySteward3 = this.notifyMessage;
            if (proxySteward3 != null) {
                proxySteward3.connectPatch(activityMutator, this.connectPatch);
            }
            TabTable.evictLayout(this.attachConfig);
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            evictLayout((GradientActivator.ActivityMutator) obj);
            return DpadBuilder.evictLayout;
        }
    }

    public static final List detachStream(int i, ConnectionFactory connectionFactory, int i2, List list) {
        ConnectionFactory connectionFactory2;
        int max = Math.max(0, i - i2);
        int i3 = i - 1;
        ArrayList arrayList = null;
        if (max <= i3) {
            int i4 = i3;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                connectionFactory2 = connectionFactory;
                arrayList.add(ConnectionFactory.releaseHeader(connectionFactory2, i4, 0L, 2, null));
                if (i4 == max) {
                    break;
                }
                i4--;
                connectionFactory = connectionFactory2;
            }
        } else {
            connectionFactory2 = connectionFactory;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i5 = size - 1;
                int intValue = ((Number) list.get(size)).intValue();
                if (intValue < max) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(ConnectionFactory.releaseHeader(connectionFactory2, intValue, 0L, 2, null));
                }
                if (i5 < 0) {
                    break;
                }
                size = i5;
            }
        }
        return arrayList == null ? CursorBuilder.peekRevision() : arrayList;
    }

    public static final List evictLayout(List list, List list2, List list3, int i, int i2, int i3, int i4, int i5, boolean z, FrameIndex.HoverThrottle hoverThrottle, FrameIndex.LayerUseCase layerUseCase, boolean z2, BackgroundCollection backgroundCollection) {
        int i6 = z ? i2 : i;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3 && i5 != 0) {
            throw new IllegalStateException("non-zero itemsScrollOffset");
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (!z3) {
            int size = list2.size();
            int i7 = i5;
            for (int i8 = 0; i8 < size; i8++) {
                ProxySteward proxySteward = (ProxySteward) list2.get(i8);
                i7 -= proxySteward.detachStream();
                proxySteward.attachConfig(i7, i, i2);
                arrayList.add(proxySteward);
            }
            int size2 = list.size();
            int i9 = i5;
            for (int i10 = 0; i10 < size2; i10++) {
                ProxySteward proxySteward2 = (ProxySteward) list.get(i10);
                proxySteward2.attachConfig(i9, i, i2);
                arrayList.add(proxySteward2);
                i9 += proxySteward2.detachStream();
            }
            int size3 = list3.size();
            for (int i11 = 0; i11 < size3; i11++) {
                ProxySteward proxySteward3 = (ProxySteward) list3.get(i11);
                proxySteward3.attachConfig(i9, i, i2);
                arrayList.add(proxySteward3);
                i9 += proxySteward3.detachStream();
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no extra items");
            }
            int size4 = list.size();
            int[] iArr = new int[size4];
            for (int i12 = 0; i12 < size4; i12++) {
                iArr[i12] = ((ProxySteward) list.get(growPayload(i12, z2, size4))).evictLayout();
            }
            int[] iArr2 = new int[size4];
            for (int i13 = 0; i13 < size4; i13++) {
                iArr2[i13] = 0;
            }
            if (z) {
                if (hoverThrottle == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                }
                hoverThrottle.growPayload(backgroundCollection, i6, iArr, iArr2);
            } else {
                if (layerUseCase == null) {
                    throw new IllegalArgumentException("null horizontalArrangement when isVertical == false");
                }
                layerUseCase.injectMetric(backgroundCollection, i6, iArr, LabelCache.reduceScope, iArr2);
            }
            ProgressIndex resumeSignature = PluginInspector.resumeSignature(iArr2);
            if (z2) {
                resumeSignature = CellEntry.notifyMessage(resumeSignature);
            }
            int applyTask = resumeSignature.applyTask();
            int serializeOffset = resumeSignature.serializeOffset();
            int notifyMessage = resumeSignature.notifyMessage();
            if ((notifyMessage > 0 && applyTask <= serializeOffset) || (notifyMessage < 0 && serializeOffset <= applyTask)) {
                while (true) {
                    int i14 = iArr2[applyTask];
                    ProxySteward proxySteward4 = (ProxySteward) list.get(growPayload(applyTask, z2, size4));
                    if (z2) {
                        i14 = (i6 - i14) - proxySteward4.evictLayout();
                    }
                    proxySteward4.attachConfig(i14, i, i2);
                    arrayList.add(proxySteward4);
                    if (applyTask == serializeOffset) {
                        break;
                    }
                    applyTask += notifyMessage;
                }
            }
        }
        return arrayList;
    }

    public static final int growPayload(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        r6 = (com.goldenboot.saga.zone.WaveBatch) r6.get(r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List injectMetric(List list, ConnectionFactory connectionFactory, int i, int i2, List list2, float f, boolean z, BottomBarDownloader bottomBarDownloader) {
        ArrayList arrayList;
        WaveBatch waveBatch;
        ProxySteward proxySteward;
        Object obj;
        int detachStream;
        Object obj2;
        int index;
        int min;
        ProxySteward proxySteward2;
        Object obj3;
        int i3 = i - 1;
        int min2 = Math.min(((ProxySteward) CursorCollector.emitStrategy(list)).getIndex() + i2, i3);
        int index2 = ((ProxySteward) CursorCollector.emitStrategy(list)).getIndex() + 1;
        if (index2 <= min2) {
            int i4 = index2;
            arrayList = null;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ConnectionFactory.releaseHeader(connectionFactory, i4, 0L, 2, null));
                if (i4 == min2) {
                    break;
                }
                i4++;
            }
        } else {
            arrayList = null;
        }
        if (z && bottomBarDownloader != null && !bottomBarDownloader.applyTask().isEmpty()) {
            List applyTask = bottomBarDownloader.applyTask();
            int size = applyTask.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    waveBatch = null;
                    break;
                }
                if (((WaveBatch) applyTask.get(size)).getIndex() <= min2 || (size != 0 && ((WaveBatch) applyTask.get(size - 1)).getIndex() > min2)) {
                }
            }
            WaveBatch waveBatch2 = (WaveBatch) CursorCollector.emitStrategy(bottomBarDownloader.applyTask());
            if (waveBatch != null && (index = waveBatch.getIndex()) <= (min = Math.min(waveBatch2.getIndex(), i3))) {
                int i5 = index;
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                obj3 = null;
                                break;
                            }
                            obj3 = arrayList.get(i6);
                            if (((ProxySteward) obj3).getIndex() == i5) {
                                break;
                            }
                            i6++;
                        }
                        proxySteward2 = (ProxySteward) obj3;
                    } else {
                        proxySteward2 = null;
                    }
                    if (proxySteward2 == null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(ConnectionFactory.releaseHeader(connectionFactory, i5, 0L, 2, null));
                    }
                    if (i5 == min) {
                        break;
                    }
                    i5++;
                }
            }
            float injectMetric = ((bottomBarDownloader.injectMetric() - waveBatch2.getOffset()) - waveBatch2.evictLayout()) - f;
            if (injectMetric > 0.0f) {
                int index3 = waveBatch2.getIndex() + 1;
                int i7 = 0;
                while (index3 < i && i7 < injectMetric) {
                    if (index3 <= min2) {
                        int size3 = list.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size3) {
                                obj2 = null;
                                break;
                            }
                            obj2 = list.get(i8);
                            if (((ProxySteward) obj2).getIndex() == index3) {
                                break;
                            }
                            i8++;
                        }
                        proxySteward = (ProxySteward) obj2;
                    } else if (arrayList != null) {
                        int size4 = arrayList.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size4) {
                                obj = null;
                                break;
                            }
                            obj = arrayList.get(i9);
                            if (((ProxySteward) obj).getIndex() == index3) {
                                break;
                            }
                            i9++;
                        }
                        proxySteward = (ProxySteward) obj;
                    } else {
                        proxySteward = null;
                    }
                    if (proxySteward != null) {
                        index3++;
                        detachStream = proxySteward.detachStream();
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(ConnectionFactory.releaseHeader(connectionFactory, index3, 0L, 2, null));
                        index3++;
                        detachStream = ((ProxySteward) CursorCollector.emitStrategy(arrayList)).detachStream();
                    }
                    i7 += detachStream;
                }
            }
        }
        if (arrayList != null && ((ProxySteward) CursorCollector.emitStrategy(arrayList)).getIndex() > min2) {
            min2 = ((ProxySteward) CursorCollector.emitStrategy(arrayList)).getIndex();
        }
        int size5 = list2.size();
        for (int i10 = 0; i10 < size5; i10++) {
            int intValue = ((Number) list2.get(i10)).intValue();
            if (intValue > min2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ConnectionFactory.releaseHeader(connectionFactory, intValue, 0L, 2, null));
            }
        }
        return arrayList == null ? CursorBuilder.peekRevision() : arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x038a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SpringEntry releaseHeader(int i, ConnectionFactory connectionFactory, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, List list, FrameIndex.HoverThrottle hoverThrottle, FrameIndex.LayerUseCase layerUseCase, boolean z2, BackgroundCollection backgroundCollection, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i8, List list2, boolean z3, boolean z4, BottomBarDownloader bottomBarDownloader, ProgressValve progressValve, SlotDispatcher slotDispatcher, LayerBenchmark layerBenchmark, ConfigListener configListener) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        List list3;
        int i19;
        int i20 = i3;
        if (i20 < 0) {
            throw new IllegalArgumentException("invalid beforeContentPadding");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("invalid afterContentPadding");
        }
        if (i <= 0) {
            int attachConfig = PagerPlanner.attachConfig(j);
            int connectPatch = PagerPlanner.connectPatch(j);
            lazyLayoutItemAnimator.connectJob(0, attachConfig, connectPatch, new ArrayList(), connectionFactory.flushSample(), connectionFactory, z, z4, 1, z3, 0, 0, progressValve, layerBenchmark);
            if (!z4) {
                long updateTimer = lazyLayoutItemAnimator.updateTimer();
                if (!ScaleSaver.updateTimer(updateTimer, ScaleSaver.INSTANCE.evictLayout())) {
                    attachConfig = SubscriberCache.applyTask(j, ScaleSaver.peekRevision(updateTimer));
                    connectPatch = SubscriberCache.updateTimer(j, ScaleSaver.popBlueprint(updateTimer));
                }
            }
            return new SpringEntry(null, 0, false, 0.0f, (ContentConfigurator) configListener.invoke(Integer.valueOf(attachConfig), Integer.valueOf(connectPatch), ActivityMutator.reduceScope), 0.0f, false, progressValve, backgroundCollection, connectionFactory.clipOrigin(), CursorBuilder.peekRevision(), -i20, i2 + i4, 0, z2, z ? BounceSplitter.Vertical : BounceSplitter.Horizontal, i4, i5, null);
        }
        int i21 = i6;
        if (i21 >= i) {
            i21 = i - 1;
            i9 = 0;
        } else {
            i9 = i7;
        }
        int round = Math.round(f);
        int i22 = i9 - round;
        if (i21 == 0 && i22 < 0) {
            round += i22;
            i22 = 0;
        }
        int i23 = round;
        CursorMaker cursorMaker = new CursorMaker();
        int i24 = -i20;
        int i25 = (i5 < 0 ? i5 : 0) + i24;
        int i26 = i22 + i25;
        int i27 = 0;
        while (i26 < 0 && i21 > 0) {
            int i28 = i21 - 1;
            int i29 = i25;
            ProxySteward releaseHeader = ConnectionFactory.releaseHeader(connectionFactory, i28, 0L, 2, null);
            cursorMaker.add(0, releaseHeader);
            i27 = Math.max(i27, releaseHeader.connectJob());
            i26 = releaseHeader.detachStream() + i26;
            i21 = i28;
            i25 = i29;
            i24 = i24;
            i23 = i23;
        }
        int i30 = i27;
        int i31 = i23;
        int i32 = i24;
        int i33 = i26;
        int i34 = i25;
        if (i33 < i34) {
            i11 = i31 + i33;
            i10 = i34;
        } else {
            i10 = i33;
            i11 = i31;
        }
        int i35 = i10 - i34;
        int i36 = i2 + i4;
        int releaseHeader2 = CellEntry.releaseHeader(i36, 0);
        int i37 = -i35;
        int i38 = i21;
        int i39 = 0;
        boolean z5 = false;
        while (i39 < cursorMaker.size()) {
            if (i37 >= releaseHeader2) {
                cursorMaker.remove(i39);
                z5 = true;
            } else {
                i38++;
                i37 += ((ProxySteward) cursorMaker.get(i39)).detachStream();
                i39++;
            }
        }
        int i40 = i21;
        int i41 = i30;
        int i42 = i35;
        int i43 = i37;
        boolean z6 = z5;
        int i44 = i36;
        int i45 = i38;
        while (i45 < i && (i43 < releaseHeader2 || i43 <= 0 || cursorMaker.isEmpty())) {
            int i46 = i44;
            int i47 = i43;
            int i48 = releaseHeader2;
            int i49 = i40;
            int i50 = i42;
            int i51 = i41;
            ProxySteward releaseHeader3 = ConnectionFactory.releaseHeader(connectionFactory, i45, 0L, 2, null);
            int i52 = i45;
            int detachStream = releaseHeader3.detachStream() + i47;
            if (detachStream > i34 || i52 == i - 1) {
                int max = Math.max(i51, releaseHeader3.connectJob());
                cursorMaker.add(releaseHeader3);
                i42 = i50;
                i51 = max;
                i19 = i49;
            } else {
                i19 = i52 + 1;
                i42 = i50 - releaseHeader3.detachStream();
                z6 = true;
            }
            i43 = detachStream;
            i44 = i46;
            i45 = i52 + 1;
            i41 = i51;
            i40 = i19;
            releaseHeader2 = i48;
        }
        int i53 = i44;
        int i54 = i40;
        int i55 = i42;
        int i56 = i41;
        int i57 = i45;
        int i58 = i43;
        if (i58 < i2) {
            int i59 = i2 - i58;
            int i60 = i58 + i59;
            int i61 = i55 - i59;
            i14 = i54;
            while (i61 < i20 && i14 > 0) {
                i14--;
                int i62 = i61;
                ProxySteward releaseHeader4 = ConnectionFactory.releaseHeader(connectionFactory, i14, 0L, 2, null);
                cursorMaker.add(0, releaseHeader4);
                i56 = Math.max(i56, releaseHeader4.connectJob());
                i61 = i62 + releaseHeader4.detachStream();
                i57 = i57;
                i20 = i3;
            }
            i12 = i57;
            int i63 = i61;
            i13 = 0;
            i15 = i59 + i11;
            if (i63 < 0) {
                i15 += i63;
                int i64 = i60 + i63;
                i17 = 0;
                i16 = i64;
            } else {
                i16 = i60;
                i17 = i63;
            }
        } else {
            i12 = i57;
            i13 = 0;
            i14 = i54;
            i15 = i11;
            i16 = i58;
            i17 = i55;
        }
        float f2 = (ChipChain.evictLayout(Math.round(f)) != ChipChain.evictLayout(i15) || Math.abs(Math.round(f)) < Math.abs(i15)) ? f : i15;
        float f3 = f - f2;
        float f4 = 0.0f;
        if (z4 && i15 > i11 && f3 <= 0.0f) {
            f4 = (i15 - i11) + f3;
        }
        float f5 = f4;
        if (i17 < 0) {
            throw new IllegalArgumentException("negative currentFirstItemScrollOffset");
        }
        int i65 = -i17;
        ProxySteward proxySteward = (ProxySteward) cursorMaker.first();
        if (i3 > 0 || i5 < 0) {
            int size = cursorMaker.size();
            int i66 = i13;
            while (i66 < size) {
                int detachStream2 = ((ProxySteward) cursorMaker.get(i66)).detachStream();
                if (i17 == 0 || detachStream2 > i17 || i66 == CursorBuilder.reduceScope(cursorMaker)) {
                    break;
                }
                i17 -= detachStream2;
                i66++;
                proxySteward = (ProxySteward) cursorMaker.get(i66);
            }
        }
        ConnectionFactory connectionFactory2 = connectionFactory;
        int i67 = i17;
        ProxySteward proxySteward2 = proxySteward;
        List detachStream3 = detachStream(i14, connectionFactory2, i8, list2);
        int size2 = detachStream3.size();
        int i68 = 0;
        while (i68 < size2) {
            i56 = Math.max(i56, ((ProxySteward) detachStream3.get(i68)).connectJob());
            i68++;
            connectionFactory2 = connectionFactory;
        }
        List injectMetric = injectMetric(cursorMaker, connectionFactory2, i, i8, list2, f2, z4, bottomBarDownloader);
        int size3 = injectMetric.size();
        for (int i69 = 0; i69 < size3; i69++) {
            i56 = Math.max(i56, ((ProxySteward) injectMetric.get(i69)).connectJob());
        }
        boolean z7 = Intrinsics.areEqual(proxySteward2, cursorMaker.first()) && detachStream3.isEmpty() && injectMetric.isEmpty();
        int applyTask = SubscriberCache.applyTask(j, z ? i56 : i16);
        if (z) {
            i56 = i16;
        }
        int updateTimer2 = SubscriberCache.updateTimer(j, i56);
        int i70 = applyTask;
        float f6 = f2;
        List evictLayout = evictLayout(cursorMaker, detachStream3, injectMetric, i70, updateTimer2, i16, i2, i65, z, hoverThrottle, layerUseCase, z2, backgroundCollection);
        lazyLayoutItemAnimator.connectJob((int) f6, i70, updateTimer2, evictLayout, connectionFactory.flushSample(), connectionFactory, z, z4, 1, z3, i67, i16, progressValve, layerBenchmark);
        int i71 = i16;
        if (!z4) {
            long updateTimer3 = lazyLayoutItemAnimator.updateTimer();
            if (!ScaleSaver.updateTimer(updateTimer3, ScaleSaver.INSTANCE.evictLayout())) {
                int i72 = z ? updateTimer2 : i70;
                i70 = SubscriberCache.applyTask(j, Math.max(i70, ScaleSaver.peekRevision(updateTimer3)));
                int updateTimer4 = SubscriberCache.updateTimer(j, Math.max(updateTimer2, ScaleSaver.popBlueprint(updateTimer3)));
                int i73 = z ? updateTimer4 : i70;
                if (i73 != i72) {
                    int size4 = evictLayout.size();
                    for (int i74 = 0; i74 < size4; i74++) {
                        ((ProxySteward) evictLayout.get(i74)).resetDelta(i73);
                    }
                }
                i18 = updateTimer4;
                int i75 = i70;
                ProxySteward evictLayout2 = list.isEmpty() ? EndpointProcessor.evictLayout(evictLayout, connectionFactory, list, i3, i75, i18) : null;
                boolean z8 = i12 >= i || i71 > i2;
                ContentConfigurator contentConfigurator = (ContentConfigurator) configListener.invoke(Integer.valueOf(i75), Integer.valueOf(i18), new BounceHandler(evictLayout, evictLayout2, z4, slotDispatcher));
                if (z7) {
                    ArrayList arrayList = new ArrayList(evictLayout.size());
                    int size5 = evictLayout.size();
                    for (int i76 = 0; i76 < size5; i76++) {
                        Object obj = evictLayout.get(i76);
                        ProxySteward proxySteward3 = (ProxySteward) obj;
                        if ((proxySteward3.getIndex() >= ((ProxySteward) cursorMaker.first()).getIndex() && proxySteward3.getIndex() <= ((ProxySteward) cursorMaker.last()).getIndex()) || proxySteward3 == evictLayout2) {
                            arrayList.add(obj);
                        }
                    }
                    list3 = arrayList;
                } else {
                    list3 = evictLayout;
                }
                return new SpringEntry(proxySteward2, i67, z8, f6, contentConfigurator, f5, z6, progressValve, backgroundCollection, connectionFactory.clipOrigin(), list3, i32, i53, i, z2, !z ? BounceSplitter.Vertical : BounceSplitter.Horizontal, i4, i5, null);
            }
        }
        i18 = updateTimer2;
        int i752 = i70;
        if (list.isEmpty()) {
        }
        if (i12 >= i) {
        }
        ContentConfigurator contentConfigurator2 = (ContentConfigurator) configListener.invoke(Integer.valueOf(i752), Integer.valueOf(i18), new BounceHandler(evictLayout, evictLayout2, z4, slotDispatcher));
        if (z7) {
        }
        return new SpringEntry(proxySteward2, i67, z8, f6, contentConfigurator2, f5, z6, progressValve, backgroundCollection, connectionFactory.clipOrigin(), list3, i32, i53, i, z2, !z ? BounceSplitter.Vertical : BounceSplitter.Horizontal, i4, i5, null);
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends Lambda implements TouchRecord {
        public static final ActivityMutator reduceScope = new ActivityMutator();

        public ActivityMutator() {
            super(1);
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            evictLayout((GradientActivator.ActivityMutator) obj);
            return DpadBuilder.evictLayout;
        }

        public final void evictLayout(GradientActivator.ActivityMutator activityMutator) {
        }
    }
}
