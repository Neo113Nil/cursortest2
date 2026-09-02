package com.goldenboot.saga.zone;

import androidx.compose.ui.layout.GradientActivator;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class HoverAllocator implements FlexMaterializer {
    public final LongPressLoader evictLayout;
    public boolean growPayload;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends Lambda implements TouchRecord {
        public final /* synthetic */ List reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(List list) {
            super(1);
            this.reduceScope = list;
        }

        public final void evictLayout(GradientActivator.ActivityMutator activityMutator) {
            List list = this.reduceScope;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                GradientActivator.ActivityMutator.updateAction(activityMutator, (androidx.compose.ui.layout.GradientActivator) list.get(i), 0, 0, 0.0f, 4, null);
            }
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            evictLayout((GradientActivator.ActivityMutator) obj);
            return DpadBuilder.evictLayout;
        }
    }

    public HoverAllocator(LongPressLoader longPressLoader) {
        this.evictLayout = longPressLoader;
    }

    @Override // com.goldenboot.saga.zone.FlexMaterializer
    public int detachStream(ProducerRecovery producerRecovery, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((FrameRevision) list.get(0)).prepareCount(i));
            int reduceScope = CursorBuilder.reduceScope(list);
            int i2 = 1;
            if (1 <= reduceScope) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((FrameRevision) list.get(i2)).prepareCount(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == reduceScope) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v24 */
    @Override // com.goldenboot.saga.zone.FlexMaterializer
    public ContentConfigurator evictLayout(androidx.compose.ui.layout.PanelUtil panelUtil, List list, long j) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((BreadcrumbMerger) list.get(i)).prependArchive(j));
        }
        androidx.compose.ui.layout.GradientActivator gradientActivator = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int width = ((androidx.compose.ui.layout.GradientActivator) obj).getWidth();
            int reduceScope = CursorBuilder.reduceScope(arrayList);
            if (1 <= reduceScope) {
                int i2 = 1;
                while (true) {
                    Object obj2 = arrayList.get(i2);
                    int width2 = ((androidx.compose.ui.layout.GradientActivator) obj2).getWidth();
                    if (width < width2) {
                        obj = obj2;
                        width = width2;
                    }
                    if (i2 == reduceScope) {
                        break;
                    }
                    i2++;
                }
            }
        }
        androidx.compose.ui.layout.GradientActivator gradientActivator2 = (androidx.compose.ui.layout.GradientActivator) obj;
        int width3 = gradientActivator2 != null ? gradientActivator2.getWidth() : 0;
        if (!arrayList.isEmpty()) {
            ?? r12 = arrayList.get(0);
            int height = ((androidx.compose.ui.layout.GradientActivator) r12).getHeight();
            int reduceScope2 = CursorBuilder.reduceScope(arrayList);
            if (1 <= reduceScope2) {
                int i3 = 1;
                boolean z = r12;
                while (true) {
                    Object obj3 = arrayList.get(i3);
                    int height2 = ((androidx.compose.ui.layout.GradientActivator) obj3).getHeight();
                    r12 = z;
                    if (height < height2) {
                        r12 = obj3;
                        height = height2;
                    }
                    if (i3 == reduceScope2) {
                        break;
                    }
                    i3++;
                    z = r12;
                }
            }
            gradientActivator = r12;
        }
        androidx.compose.ui.layout.GradientActivator gradientActivator3 = gradientActivator;
        int height3 = gradientActivator3 != null ? gradientActivator3.getHeight() : 0;
        if (panelUtil.saveBlueprint()) {
            this.growPayload = true;
            this.evictLayout.evictLayout().setValue(ScaleSaver.growPayload(ProgressPatch.evictLayout(width3, height3)));
        } else if (!this.growPayload) {
            this.evictLayout.evictLayout().setValue(ScaleSaver.growPayload(ProgressPatch.evictLayout(width3, height3)));
        }
        return androidx.compose.ui.layout.PanelUtil.encodeOrigin(panelUtil, width3, height3, null, new ActivityMutator(arrayList), 4, null);
    }

    @Override // com.goldenboot.saga.zone.FlexMaterializer
    public int growPayload(ProducerRecovery producerRecovery, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((FrameRevision) list.get(0)).attachCallback(i));
            int reduceScope = CursorBuilder.reduceScope(list);
            int i2 = 1;
            if (1 <= reduceScope) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((FrameRevision) list.get(i2)).attachCallback(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == reduceScope) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // com.goldenboot.saga.zone.FlexMaterializer
    public int injectMetric(ProducerRecovery producerRecovery, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((FrameRevision) list.get(0)).protectChannel(i));
            int reduceScope = CursorBuilder.reduceScope(list);
            int i2 = 1;
            if (1 <= reduceScope) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((FrameRevision) list.get(i2)).protectChannel(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == reduceScope) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // com.goldenboot.saga.zone.FlexMaterializer
    public int releaseHeader(ProducerRecovery producerRecovery, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((FrameRevision) list.get(0)).applyData(i));
            int reduceScope = CursorBuilder.reduceScope(list);
            int i2 = 1;
            if (1 <= reduceScope) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((FrameRevision) list.get(i2)).applyData(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == reduceScope) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
