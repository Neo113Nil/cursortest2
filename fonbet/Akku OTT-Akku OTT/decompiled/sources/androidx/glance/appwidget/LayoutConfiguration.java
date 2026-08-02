package androidx.glance.appwidget;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.glance.Emittable;
import androidx.glance.appwidget.proto.LayoutProto;
import androidx.glance.state.GlanceState;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014BS\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u0011\u0010\u0011\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/glance/appwidget/LayoutConfiguration;", "", "context", "Landroid/content/Context;", "layoutConfig", "", "Landroidx/glance/appwidget/proto/LayoutProto$LayoutNode;", "", "nextIndex", "appWidgetId", "usedLayoutIds", "", "existingLayoutIds", "(Landroid/content/Context;Ljava/util/Map;IILjava/util/Set;Ljava/util/Set;)V", "addLayout", "layoutRoot", "Landroidx/glance/Emittable;", "save", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutConfiguration {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int appWidgetId;
    private final Context context;
    private final Set<Integer> existingLayoutIds;
    private final Map<LayoutProto.LayoutNode, Integer> layoutConfig;
    private int nextIndex;
    private final Set<Integer> usedLayoutIds;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ5\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0001¢\u0006\u0002\b\tJ#\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroidx/glance/appwidget/LayoutConfiguration$Companion;", "", "()V", "create", "Landroidx/glance/appwidget/LayoutConfiguration;", "context", "Landroid/content/Context;", "appWidgetId", "", "create$glance_appwidget_release", "nextIndex", "existingLayoutIds", "", "load", "load$glance_appwidget_release", "(Landroid/content/Context;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nWidgetLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetLayout.kt\nandroidx/glance/appwidget/LayoutConfiguration$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,369:1\n1179#2,2:370\n1253#2,4:372\n*S KotlinDebug\n*F\n+ 1 WidgetLayout.kt\nandroidx/glance/appwidget/LayoutConfiguration$Companion\n*L\n117#1:370,2\n117#1:372,4\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LayoutConfiguration create$glance_appwidget_release$default(Companion companion, Context context, int i, int i2, Collection collection, int i3, Object obj) {
            if ((i3 & 8) != 0) {
                collection = CollectionsKt.emptyList();
            }
            return companion.create$glance_appwidget_release(context, i, i2, collection);
        }

        public final LayoutConfiguration create$glance_appwidget_release(Context context, int appWidgetId) {
            return new LayoutConfiguration(context, new LinkedHashMap(), 0, appWidgetId, null, null, 48, null);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:23|24))(3:25|26|(1:28))|12|13|14|(2:17|15)|18|19|20))|31|6|7|(0)(0)|12|13|14|(1:15)|18|19|20) */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
        
            r12 = androidx.glance.appwidget.proto.LayoutProto.LayoutConfig.getDefaultInstance();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0054, code lost:
        
            r12 = androidx.glance.appwidget.proto.LayoutProto.LayoutConfig.getDefaultInstance();
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x007f A[LOOP:0: B:15:0x0079->B:17:0x007f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object load$glance_appwidget_release(Context context, int i, Continuation<? super LayoutConfiguration> continuation) {
            LayoutConfiguration$Companion$load$1 layoutConfiguration$Companion$load$1;
            int i2;
            int collectionSizeOrDefault;
            String layoutDatastoreKey;
            if (continuation instanceof LayoutConfiguration$Companion$load$1) {
                layoutConfiguration$Companion$load$1 = (LayoutConfiguration$Companion$load$1) continuation;
                int i3 = layoutConfiguration$Companion$load$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    layoutConfiguration$Companion$load$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = layoutConfiguration$Companion$load$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = layoutConfiguration$Companion$load$1.label;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        GlanceState glanceState = GlanceState.INSTANCE;
                        LayoutStateDefinition layoutStateDefinition = LayoutStateDefinition.INSTANCE;
                        layoutDatastoreKey = WidgetLayoutKt.layoutDatastoreKey(i);
                        layoutConfiguration$Companion$load$1.L$0 = context;
                        layoutConfiguration$Companion$load$1.I$0 = i;
                        layoutConfiguration$Companion$load$1.label = 1;
                        obj = glanceState.getValue(context, layoutStateDefinition, layoutDatastoreKey, layoutConfiguration$Companion$load$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i = layoutConfiguration$Companion$load$1.I$0;
                        context = (Context) layoutConfiguration$Companion$load$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    LayoutProto.LayoutConfig defaultInstance = (LayoutProto.LayoutConfig) obj;
                    Context context2 = context;
                    int i4 = i;
                    List<LayoutProto.LayoutDefinition> layoutList = defaultInstance.getLayoutList();
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(layoutList, 10);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(collectionSizeOrDefault), 16));
                    for (LayoutProto.LayoutDefinition layoutDefinition : layoutList) {
                        Pair pair = TuplesKt.to(layoutDefinition.getLayout(), Boxing.boxInt(layoutDefinition.getLayoutIndex()));
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    }
                    Map mutableMap = MapsKt.toMutableMap(linkedHashMap);
                    return new LayoutConfiguration(context2, mutableMap, defaultInstance.getNextIndex(), i4, null, CollectionsKt.toMutableSet(mutableMap.values()), 16, null);
                }
            }
            layoutConfiguration$Companion$load$1 = new LayoutConfiguration$Companion$load$1(this, continuation);
            Object obj2 = layoutConfiguration$Companion$load$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i2 = layoutConfiguration$Companion$load$1.label;
            if (i2 != 0) {
            }
            LayoutProto.LayoutConfig defaultInstance2 = (LayoutProto.LayoutConfig) obj2;
            Context context22 = context;
            int i42 = i;
            List<LayoutProto.LayoutDefinition> layoutList2 = defaultInstance2.getLayoutList();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(layoutList2, 10);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(collectionSizeOrDefault), 16));
            while (r10.hasNext()) {
            }
            Map mutableMap2 = MapsKt.toMutableMap(linkedHashMap2);
            return new LayoutConfiguration(context22, mutableMap2, defaultInstance2.getNextIndex(), i42, null, CollectionsKt.toMutableSet(mutableMap2.values()), 16, null);
        }

        private Companion() {
        }

        @VisibleForTesting
        public final LayoutConfiguration create$glance_appwidget_release(Context context, int appWidgetId, int nextIndex, Collection<Integer> existingLayoutIds) {
            return new LayoutConfiguration(context, new LinkedHashMap(), nextIndex, appWidgetId, null, CollectionsKt.toMutableSet(existingLayoutIds), 16, null);
        }
    }

    private LayoutConfiguration(Context context, Map<LayoutProto.LayoutNode, Integer> map, int i, int i2, Set<Integer> set, Set<Integer> set2) {
        this.context = context;
        this.layoutConfig = map;
        this.nextIndex = i;
        this.appWidgetId = i2;
        this.usedLayoutIds = set;
        this.existingLayoutIds = set2;
    }

    public final int addLayout(Emittable layoutRoot) {
        LayoutProto.LayoutNode createNode = WidgetLayoutKt.createNode(this.context, layoutRoot);
        synchronized (this) {
            Integer num = this.layoutConfig.get(createNode);
            if (num != null) {
                int intValue = num.intValue();
                this.usedLayoutIds.add(Integer.valueOf(intValue));
                return intValue;
            }
            int i = this.nextIndex;
            while (this.existingLayoutIds.contains(Integer.valueOf(i))) {
                i = (i + 1) % LayoutSelectionKt.getTopLevelLayoutsCount();
                if (i == this.nextIndex) {
                    throw new IllegalArgumentException("Cannot assign a valid layout index to the new layout: no free index left.");
                }
            }
            this.nextIndex = (i + 1) % LayoutSelectionKt.getTopLevelLayoutsCount();
            this.usedLayoutIds.add(Integer.valueOf(i));
            this.existingLayoutIds.add(Integer.valueOf(i));
            this.layoutConfig.put(createNode, Integer.valueOf(i));
            return i;
        }
    }

    public final Object save(Continuation<? super Unit> continuation) {
        String layoutDatastoreKey;
        GlanceState glanceState = GlanceState.INSTANCE;
        Context context = this.context;
        LayoutStateDefinition layoutStateDefinition = LayoutStateDefinition.INSTANCE;
        layoutDatastoreKey = WidgetLayoutKt.layoutDatastoreKey(this.appWidgetId);
        Object updateValue = glanceState.updateValue(context, layoutStateDefinition, layoutDatastoreKey, new LayoutConfiguration$save$2(this, null), continuation);
        return updateValue == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateValue : Unit.INSTANCE;
    }

    public /* synthetic */ LayoutConfiguration(Context context, Map map, int i, int i2, Set set, Set set2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, map, i, i2, (i3 & 16) != 0 ? new LinkedHashSet() : set, (i3 & 32) != 0 ? new LinkedHashSet() : set2);
    }
}
