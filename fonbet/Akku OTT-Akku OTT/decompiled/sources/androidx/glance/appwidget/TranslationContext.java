package androidx.glance.appwidget;

import android.content.ComponentName;
import android.content.Context;
import androidx.collection.g;
import androidx.compose.ui.unit.DpSize;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u009a\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u0016\u001a\u00020\u0000J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u0019\u00104\u001a\u00020\u0013HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u0010/J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010:\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0007HÆ\u0003J\t\u0010@\u001a\u00020\rHÆ\u0003J\t\u0010A\u001a\u00020\u000fHÆ\u0003J\t\u0010B\u001a\u00020\u0011HÆ\u0003J²\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u0013\u0010F\u001a\u00020\u00072\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010H\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u0005J\u0016\u0010J\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u000f2\u0006\u0010L\u001a\u00020\u0005J\u000e\u0010M\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u0005J\u0018\u0010N\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\u00052\b\b\u0002\u0010P\u001a\u00020\u0005J\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020SJ#\u0010T\u001a\u00020\u00002\u0006\u0010R\u001a\u00020S2\u0006\u0010\u0012\u001a\u00020\u0013ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bU\u0010VJ\t\u0010W\u001a\u00020\u0005HÖ\u0001J\u0006\u0010X\u001a\u00020\u0005J\u0010\u0010Y\u001a\u00020\u00002\b\b\u0002\u0010P\u001a\u00020\u0005J\t\u0010Z\u001a\u00020[HÖ\u0001R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0016\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010&R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010#R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010#R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001c\u0010\u0012\u001a\u00020\u0013ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b1\u00102\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\\"}, d2 = {"Landroidx/glance/appwidget/TranslationContext;", "", "context", "Landroid/content/Context;", "appWidgetId", "", "isRtl", "", "layoutConfiguration", "Landroidx/glance/appwidget/LayoutConfiguration;", "itemPosition", "isLazyCollectionDescendant", "lastViewId", "Ljava/util/concurrent/atomic/AtomicInteger;", "parentContext", "Landroidx/glance/appwidget/InsertedViewInfo;", "isBackgroundSpecified", "Ljava/util/concurrent/atomic/AtomicBoolean;", "layoutSize", "Landroidx/compose/ui/unit/DpSize;", "layoutCollectionViewId", "layoutCollectionItemId", "canUseSelectableGroup", "actionTargetId", "actionBroadcastReceiver", "Landroid/content/ComponentName;", "(Landroid/content/Context;IZLandroidx/glance/appwidget/LayoutConfiguration;IZLjava/util/concurrent/atomic/AtomicInteger;Landroidx/glance/appwidget/InsertedViewInfo;Ljava/util/concurrent/atomic/AtomicBoolean;JIIZLjava/lang/Integer;Landroid/content/ComponentName;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getActionBroadcastReceiver", "()Landroid/content/ComponentName;", "getActionTargetId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAppWidgetId", "()I", "getCanUseSelectableGroup", "()Z", "getContext", "()Landroid/content/Context;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "getItemPosition", "getLastViewId", "()Ljava/util/concurrent/atomic/AtomicInteger;", "getLayoutCollectionItemId", "getLayoutCollectionViewId", "getLayoutConfiguration", "()Landroidx/glance/appwidget/LayoutConfiguration;", "getLayoutSize-MYxV2XQ", "()J", "J", "getParentContext", "()Landroidx/glance/appwidget/InsertedViewInfo;", "component1", "component10", "component10-MYxV2XQ", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copy-tbIExKY", "(Landroid/content/Context;IZLandroidx/glance/appwidget/LayoutConfiguration;IZLjava/util/concurrent/atomic/AtomicInteger;Landroidx/glance/appwidget/InsertedViewInfo;Ljava/util/concurrent/atomic/AtomicBoolean;JIIZLjava/lang/Integer;Landroid/content/ComponentName;)Landroidx/glance/appwidget/TranslationContext;", "equals", "other", "forActionTargetId", "viewId", "forChild", "parent", "pos", "forLazyCollection", "forLazyViewItem", "itemId", "newViewId", "forRoot", "root", "Landroidx/glance/appwidget/RemoteViewsInfo;", "forRootAndSize", "forRootAndSize-6HolHcs", "(Landroidx/glance/appwidget/RemoteViewsInfo;J)Landroidx/glance/appwidget/TranslationContext;", "hashCode", "nextViewId", "resetViewId", "toString", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TranslationContext {
    private final ComponentName actionBroadcastReceiver;
    private final Integer actionTargetId;
    private final int appWidgetId;
    private final boolean canUseSelectableGroup;
    private final Context context;
    private final AtomicBoolean isBackgroundSpecified;
    private final boolean isLazyCollectionDescendant;
    private final boolean isRtl;
    private final int itemPosition;
    private final AtomicInteger lastViewId;
    private final int layoutCollectionItemId;
    private final int layoutCollectionViewId;
    private final LayoutConfiguration layoutConfiguration;
    private final long layoutSize;
    private final InsertedViewInfo parentContext;

    public /* synthetic */ TranslationContext(Context context, int i, boolean z, LayoutConfiguration layoutConfiguration, int i2, boolean z2, AtomicInteger atomicInteger, InsertedViewInfo insertedViewInfo, AtomicBoolean atomicBoolean, long j, int i3, int i4, boolean z3, Integer num, ComponentName componentName, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, z, layoutConfiguration, i2, z2, atomicInteger, insertedViewInfo, atomicBoolean, j, i3, i4, z3, num, componentName);
    }

    /* renamed from: copy-tbIExKY$default, reason: not valid java name */
    public static /* synthetic */ TranslationContext m1321copytbIExKY$default(TranslationContext translationContext, Context context, int i, boolean z, LayoutConfiguration layoutConfiguration, int i2, boolean z2, AtomicInteger atomicInteger, InsertedViewInfo insertedViewInfo, AtomicBoolean atomicBoolean, long j, int i3, int i4, boolean z3, Integer num, ComponentName componentName, int i5, Object obj) {
        return translationContext.m1323copytbIExKY((i5 & 1) != 0 ? translationContext.context : context, (i5 & 2) != 0 ? translationContext.appWidgetId : i, (i5 & 4) != 0 ? translationContext.isRtl : z, (i5 & 8) != 0 ? translationContext.layoutConfiguration : layoutConfiguration, (i5 & 16) != 0 ? translationContext.itemPosition : i2, (i5 & 32) != 0 ? translationContext.isLazyCollectionDescendant : z2, (i5 & 64) != 0 ? translationContext.lastViewId : atomicInteger, (i5 & 128) != 0 ? translationContext.parentContext : insertedViewInfo, (i5 & 256) != 0 ? translationContext.isBackgroundSpecified : atomicBoolean, (i5 & 512) != 0 ? translationContext.layoutSize : j, (i5 & 1024) != 0 ? translationContext.layoutCollectionViewId : i3, (i5 & 2048) != 0 ? translationContext.layoutCollectionItemId : i4, (i5 & 4096) != 0 ? translationContext.canUseSelectableGroup : z3, (i5 & 8192) != 0 ? translationContext.actionTargetId : num, (i5 & 16384) != 0 ? translationContext.actionBroadcastReceiver : componentName);
    }

    public static /* synthetic */ TranslationContext forLazyViewItem$default(TranslationContext translationContext, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return translationContext.forLazyViewItem(i, i2);
    }

    public static /* synthetic */ TranslationContext resetViewId$default(TranslationContext translationContext, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return translationContext.resetViewId(i);
    }

    public final TranslationContext canUseSelectableGroup() {
        return m1321copytbIExKY$default(this, null, 0, false, null, 0, false, null, null, null, 0L, 0, 0, true, null, null, 28671, null);
    }

    /* renamed from: component1, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* renamed from: component10-MYxV2XQ, reason: not valid java name and from getter */
    public final long getLayoutSize() {
        return this.layoutSize;
    }

    /* renamed from: component11, reason: from getter */
    public final int getLayoutCollectionViewId() {
        return this.layoutCollectionViewId;
    }

    /* renamed from: component12, reason: from getter */
    public final int getLayoutCollectionItemId() {
        return this.layoutCollectionItemId;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getCanUseSelectableGroup() {
        return this.canUseSelectableGroup;
    }

    /* renamed from: component14, reason: from getter */
    public final Integer getActionTargetId() {
        return this.actionTargetId;
    }

    /* renamed from: component15, reason: from getter */
    public final ComponentName getActionBroadcastReceiver() {
        return this.actionBroadcastReceiver;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAppWidgetId() {
        return this.appWidgetId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsRtl() {
        return this.isRtl;
    }

    /* renamed from: component4, reason: from getter */
    public final LayoutConfiguration getLayoutConfiguration() {
        return this.layoutConfiguration;
    }

    /* renamed from: component5, reason: from getter */
    public final int getItemPosition() {
        return this.itemPosition;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLazyCollectionDescendant() {
        return this.isLazyCollectionDescendant;
    }

    /* renamed from: component7, reason: from getter */
    public final AtomicInteger getLastViewId() {
        return this.lastViewId;
    }

    /* renamed from: component8, reason: from getter */
    public final InsertedViewInfo getParentContext() {
        return this.parentContext;
    }

    /* renamed from: component9, reason: from getter */
    public final AtomicBoolean getIsBackgroundSpecified() {
        return this.isBackgroundSpecified;
    }

    /* renamed from: copy-tbIExKY, reason: not valid java name */
    public final TranslationContext m1323copytbIExKY(Context context, int appWidgetId, boolean isRtl, LayoutConfiguration layoutConfiguration, int itemPosition, boolean isLazyCollectionDescendant, AtomicInteger lastViewId, InsertedViewInfo parentContext, AtomicBoolean isBackgroundSpecified, long layoutSize, int layoutCollectionViewId, int layoutCollectionItemId, boolean canUseSelectableGroup, Integer actionTargetId, ComponentName actionBroadcastReceiver) {
        return new TranslationContext(context, appWidgetId, isRtl, layoutConfiguration, itemPosition, isLazyCollectionDescendant, lastViewId, parentContext, isBackgroundSpecified, layoutSize, layoutCollectionViewId, layoutCollectionItemId, canUseSelectableGroup, actionTargetId, actionBroadcastReceiver, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TranslationContext)) {
            return false;
        }
        TranslationContext translationContext = (TranslationContext) other;
        return Intrinsics.areEqual(this.context, translationContext.context) && this.appWidgetId == translationContext.appWidgetId && this.isRtl == translationContext.isRtl && Intrinsics.areEqual(this.layoutConfiguration, translationContext.layoutConfiguration) && this.itemPosition == translationContext.itemPosition && this.isLazyCollectionDescendant == translationContext.isLazyCollectionDescendant && Intrinsics.areEqual(this.lastViewId, translationContext.lastViewId) && Intrinsics.areEqual(this.parentContext, translationContext.parentContext) && Intrinsics.areEqual(this.isBackgroundSpecified, translationContext.isBackgroundSpecified) && DpSize.m1116equalsimpl0(this.layoutSize, translationContext.layoutSize) && this.layoutCollectionViewId == translationContext.layoutCollectionViewId && this.layoutCollectionItemId == translationContext.layoutCollectionItemId && this.canUseSelectableGroup == translationContext.canUseSelectableGroup && Intrinsics.areEqual(this.actionTargetId, translationContext.actionTargetId) && Intrinsics.areEqual(this.actionBroadcastReceiver, translationContext.actionBroadcastReceiver);
    }

    public final TranslationContext forActionTargetId(int viewId) {
        return m1321copytbIExKY$default(this, null, 0, false, null, 0, false, null, null, null, 0L, 0, 0, false, Integer.valueOf(viewId), null, 24575, null);
    }

    public final TranslationContext forChild(InsertedViewInfo parent, int pos) {
        return m1321copytbIExKY$default(this, null, 0, false, null, pos, false, null, parent, null, 0L, 0, 0, false, null, null, 32623, null);
    }

    public final TranslationContext forLazyCollection(int viewId) {
        return m1321copytbIExKY$default(this, null, 0, false, null, 0, true, null, null, null, 0L, viewId, 0, false, null, null, 31711, null);
    }

    public final TranslationContext forLazyViewItem(int itemId, int newViewId) {
        return m1321copytbIExKY$default(this, null, 0, false, null, 0, false, new AtomicInteger(newViewId), null, null, 0L, itemId, 0, false, null, null, 31679, null);
    }

    public final TranslationContext forRoot(RemoteViewsInfo root) {
        return m1321copytbIExKY$default(forChild(root.getView(), 0), null, 0, false, null, 0, false, new AtomicInteger(1), null, new AtomicBoolean(false), 0L, 0, 0, false, null, null, 32447, null);
    }

    /* renamed from: forRootAndSize-6HolHcs, reason: not valid java name */
    public final TranslationContext m1324forRootAndSize6HolHcs(RemoteViewsInfo root, long layoutSize) {
        return m1321copytbIExKY$default(forChild(root.getView(), 0), null, 0, false, null, 0, false, new AtomicInteger(1), null, new AtomicBoolean(false), layoutSize, 0, 0, false, null, null, 31935, null);
    }

    public final ComponentName getActionBroadcastReceiver() {
        return this.actionBroadcastReceiver;
    }

    public final Integer getActionTargetId() {
        return this.actionTargetId;
    }

    public final int getAppWidgetId() {
        return this.appWidgetId;
    }

    public final boolean getCanUseSelectableGroup() {
        return this.canUseSelectableGroup;
    }

    public final Context getContext() {
        return this.context;
    }

    public final int getItemPosition() {
        return this.itemPosition;
    }

    public final AtomicInteger getLastViewId() {
        return this.lastViewId;
    }

    public final int getLayoutCollectionItemId() {
        return this.layoutCollectionItemId;
    }

    public final int getLayoutCollectionViewId() {
        return this.layoutCollectionViewId;
    }

    public final LayoutConfiguration getLayoutConfiguration() {
        return this.layoutConfiguration;
    }

    /* renamed from: getLayoutSize-MYxV2XQ, reason: not valid java name */
    public final long m1325getLayoutSizeMYxV2XQ() {
        return this.layoutSize;
    }

    public final InsertedViewInfo getParentContext() {
        return this.parentContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a = g.a(this.appWidgetId, this.context.hashCode() * 31, 31);
        boolean z = this.isRtl;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (a + i) * 31;
        LayoutConfiguration layoutConfiguration = this.layoutConfiguration;
        int a2 = g.a(this.itemPosition, (i2 + (layoutConfiguration == null ? 0 : layoutConfiguration.hashCode())) * 31, 31);
        boolean z2 = this.isLazyCollectionDescendant;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int a3 = g.a(this.layoutCollectionItemId, g.a(this.layoutCollectionViewId, (DpSize.m1121hashCodeimpl(this.layoutSize) + ((this.isBackgroundSpecified.hashCode() + ((this.parentContext.hashCode() + ((this.lastViewId.hashCode() + ((a2 + i3) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31);
        boolean z3 = this.canUseSelectableGroup;
        int i4 = (a3 + (z3 ? 1 : z3 ? 1 : 0)) * 31;
        Integer num = this.actionTargetId;
        int hashCode = (i4 + (num == null ? 0 : num.hashCode())) * 31;
        ComponentName componentName = this.actionBroadcastReceiver;
        return hashCode + (componentName != null ? componentName.hashCode() : 0);
    }

    public final AtomicBoolean isBackgroundSpecified() {
        return this.isBackgroundSpecified;
    }

    public final boolean isLazyCollectionDescendant() {
        return this.isLazyCollectionDescendant;
    }

    public final boolean isRtl() {
        return this.isRtl;
    }

    public final int nextViewId() {
        return this.lastViewId.incrementAndGet();
    }

    public final TranslationContext resetViewId(int newViewId) {
        return m1321copytbIExKY$default(this, null, 0, false, null, 0, false, new AtomicInteger(newViewId), null, null, 0L, 0, 0, false, null, null, 32703, null);
    }

    public String toString() {
        return "TranslationContext(context=" + this.context + ", appWidgetId=" + this.appWidgetId + ", isRtl=" + this.isRtl + ", layoutConfiguration=" + this.layoutConfiguration + ", itemPosition=" + this.itemPosition + ", isLazyCollectionDescendant=" + this.isLazyCollectionDescendant + ", lastViewId=" + this.lastViewId + ", parentContext=" + this.parentContext + ", isBackgroundSpecified=" + this.isBackgroundSpecified + ", layoutSize=" + ((Object) DpSize.m1126toStringimpl(this.layoutSize)) + ", layoutCollectionViewId=" + this.layoutCollectionViewId + ", layoutCollectionItemId=" + this.layoutCollectionItemId + ", canUseSelectableGroup=" + this.canUseSelectableGroup + ", actionTargetId=" + this.actionTargetId + ", actionBroadcastReceiver=" + this.actionBroadcastReceiver + ')';
    }

    private TranslationContext(Context context, int i, boolean z, LayoutConfiguration layoutConfiguration, int i2, boolean z2, AtomicInteger atomicInteger, InsertedViewInfo insertedViewInfo, AtomicBoolean atomicBoolean, long j, int i3, int i4, boolean z3, Integer num, ComponentName componentName) {
        this.context = context;
        this.appWidgetId = i;
        this.isRtl = z;
        this.layoutConfiguration = layoutConfiguration;
        this.itemPosition = i2;
        this.isLazyCollectionDescendant = z2;
        this.lastViewId = atomicInteger;
        this.parentContext = insertedViewInfo;
        this.isBackgroundSpecified = atomicBoolean;
        this.layoutSize = j;
        this.layoutCollectionViewId = i3;
        this.layoutCollectionItemId = i4;
        this.canUseSelectableGroup = z3;
        this.actionTargetId = num;
        this.actionBroadcastReceiver = componentName;
    }

    public /* synthetic */ TranslationContext(Context context, int i, boolean z, LayoutConfiguration layoutConfiguration, int i2, boolean z2, AtomicInteger atomicInteger, InsertedViewInfo insertedViewInfo, AtomicBoolean atomicBoolean, long j, int i3, int i4, boolean z3, Integer num, ComponentName componentName, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, z, layoutConfiguration, i2, (i5 & 32) != 0 ? false : z2, (i5 & 64) != 0 ? new AtomicInteger(1) : atomicInteger, (i5 & 128) != 0 ? new InsertedViewInfo(0, 0, null, 7, null) : insertedViewInfo, (i5 & 256) != 0 ? new AtomicBoolean(false) : atomicBoolean, (i5 & 512) != 0 ? DpSize.INSTANCE.m1129getZeroMYxV2XQ() : j, (i5 & 1024) != 0 ? -1 : i3, (i5 & 2048) != 0 ? -1 : i4, (i5 & 4096) != 0 ? false : z3, (i5 & 8192) != 0 ? null : num, (i5 & 16384) != 0 ? null : componentName, null);
    }
}
