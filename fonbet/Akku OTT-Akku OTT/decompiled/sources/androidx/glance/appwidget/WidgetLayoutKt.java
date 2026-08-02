package androidx.glance.appwidget;

import android.content.Context;
import android.os.Build;
import android.support.v4.media.a;
import androidx.glance.Emittable;
import androidx.glance.EmittableButton;
import androidx.glance.EmittableImage;
import androidx.glance.EmittableWithChildren;
import androidx.glance.GlanceModifier;
import androidx.glance.ImageKt;
import androidx.glance.action.ActionModifier;
import androidx.glance.appwidget.lazy.EmittableLazyColumn;
import androidx.glance.appwidget.lazy.EmittableLazyList;
import androidx.glance.appwidget.lazy.EmittableLazyListItem;
import androidx.glance.appwidget.lazy.EmittableLazyVerticalGrid;
import androidx.glance.appwidget.lazy.EmittableLazyVerticalGridListItem;
import androidx.glance.appwidget.proto.LayoutProto;
import androidx.glance.layout.Alignment;
import androidx.glance.layout.ContentScale;
import androidx.glance.layout.EmittableBox;
import androidx.glance.layout.EmittableColumn;
import androidx.glance.layout.EmittableRow;
import androidx.glance.layout.EmittableSpacer;
import androidx.glance.layout.HeightModifier;
import androidx.glance.layout.WidthModifier;
import androidx.glance.text.EmittableText;
import androidx.glance.unit.Dimension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\fH\u0002\u001a\u0014\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u0016H\u0002\u001a\u0014\u0010\u0017\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u0018H\u0002\u001a\u0014\u0010\u0019\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u001aH\u0002\u001a\u0014\u0010\u001b\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u001cH\u0002\u001a\u0014\u0010\u001d\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u001eH\u0002\u001a\u0019\u0010\u001f\u001a\u00020 *\u00020!H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a\u0019\u0010\u001f\u001a\u00020$*\u00020%H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001a\u0014\u0010\u001f\u001a\u00020(*\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, d2 = {"heightModifier", "Landroidx/glance/unit/Dimension;", "Landroidx/glance/GlanceModifier;", "getHeightModifier", "(Landroidx/glance/GlanceModifier;)Landroidx/glance/unit/Dimension;", "widthModifier", "getWidthModifier", "createNode", "Landroidx/glance/appwidget/proto/LayoutProto$LayoutNode;", "context", "Landroid/content/Context;", "element", "Landroidx/glance/Emittable;", "layoutDatastoreKey", "", "appWidgetId", "", "getLayoutType", "Landroidx/glance/appwidget/proto/LayoutProto$LayoutType;", "setBoxNode", "", "Landroidx/glance/appwidget/proto/LayoutProto$LayoutNode$Builder;", "Landroidx/glance/layout/EmittableBox;", "setColumnNode", "Landroidx/glance/layout/EmittableColumn;", "setImageNode", "Landroidx/glance/EmittableImage;", "setLazyListColumn", "Landroidx/glance/appwidget/lazy/EmittableLazyColumn;", "setRowNode", "Landroidx/glance/layout/EmittableRow;", "toProto", "Landroidx/glance/appwidget/proto/LayoutProto$HorizontalAlignment;", "Landroidx/glance/layout/Alignment$Horizontal;", "toProto-uMT2-20", "(I)Landroidx/glance/appwidget/proto/LayoutProto$HorizontalAlignment;", "Landroidx/glance/appwidget/proto/LayoutProto$VerticalAlignment;", "Landroidx/glance/layout/Alignment$Vertical;", "toProto-Je2gTW8", "(I)Landroidx/glance/appwidget/proto/LayoutProto$VerticalAlignment;", "Landroidx/glance/appwidget/proto/LayoutProto$DimensionType;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWidgetLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetLayout.kt\nandroidx/glance/appwidget/WidgetLayoutKt\n+ 2 Utils.kt\nandroidx/glance/UtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,369:1\n23#2,7:370\n23#2,7:377\n23#2,7:388\n23#2,7:395\n1549#3:384\n1620#3,3:385\n*S KotlinDebug\n*F\n+ 1 WidgetLayout.kt\nandroidx/glance/appwidget/WidgetLayoutKt\n*L\n232#1:370,7\n233#1:377,7\n276#1:388,7\n279#1:395,7\n244#1:384\n244#1:385,3\n*E\n"})
/* loaded from: classes.dex */
public final class WidgetLayoutKt {
    public static final LayoutProto.LayoutNode createNode(Context context, Emittable emittable) {
        int collectionSizeOrDefault;
        LayoutProto.LayoutNode.Builder newBuilder = LayoutProto.LayoutNode.newBuilder();
        newBuilder.setType(getLayoutType(emittable));
        newBuilder.setWidth(toProto(getWidthModifier(emittable.getModifier()), context));
        newBuilder.setHeight(toProto(getHeightModifier(emittable.getModifier()), context));
        newBuilder.setHasAction(emittable.getModifier().foldIn(null, new Function2<ActionModifier, GlanceModifier.Element, ActionModifier>() { // from class: androidx.glance.appwidget.WidgetLayoutKt$createNode$lambda$1$$inlined$findModifier$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final ActionModifier invoke(ActionModifier actionModifier, GlanceModifier.Element element) {
                return element instanceof ActionModifier ? element : actionModifier;
            }
        }) != null);
        if (emittable.getModifier().foldIn(null, new Function2<AppWidgetBackgroundModifier, GlanceModifier.Element, AppWidgetBackgroundModifier>() { // from class: androidx.glance.appwidget.WidgetLayoutKt$createNode$lambda$1$$inlined$findModifier$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final AppWidgetBackgroundModifier invoke(AppWidgetBackgroundModifier appWidgetBackgroundModifier, GlanceModifier.Element element) {
                return element instanceof AppWidgetBackgroundModifier ? element : appWidgetBackgroundModifier;
            }
        }) != null) {
            newBuilder.setIdentity(LayoutProto.NodeIdentity.BACKGROUND_NODE);
        }
        if (emittable instanceof EmittableImage) {
            setImageNode(newBuilder, (EmittableImage) emittable);
        } else if (emittable instanceof EmittableColumn) {
            setColumnNode(newBuilder, (EmittableColumn) emittable);
        } else if (emittable instanceof EmittableRow) {
            setRowNode(newBuilder, (EmittableRow) emittable);
        } else if (emittable instanceof EmittableBox) {
            setBoxNode(newBuilder, (EmittableBox) emittable);
        } else if (emittable instanceof EmittableLazyColumn) {
            setLazyListColumn(newBuilder, (EmittableLazyColumn) emittable);
        }
        if ((emittable instanceof EmittableWithChildren) && !(emittable instanceof EmittableLazyList)) {
            List<Emittable> children = ((EmittableWithChildren) emittable).getChildren();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(children, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                arrayList.add(createNode(context, (Emittable) it.next()));
            }
            newBuilder.addAllChildren(arrayList);
        }
        return (LayoutProto.LayoutNode) newBuilder.build();
    }

    private static final Dimension getHeightModifier(GlanceModifier glanceModifier) {
        Dimension height;
        HeightModifier heightModifier = (HeightModifier) glanceModifier.foldIn(null, new Function2<HeightModifier, GlanceModifier.Element, HeightModifier>() { // from class: androidx.glance.appwidget.WidgetLayoutKt$special$$inlined$findModifier$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final HeightModifier invoke(HeightModifier heightModifier2, GlanceModifier.Element element) {
                return element instanceof HeightModifier ? element : heightModifier2;
            }
        });
        return (heightModifier == null || (height = heightModifier.getHeight()) == null) ? Dimension.Wrap.INSTANCE : height;
    }

    private static final LayoutProto.LayoutType getLayoutType(Emittable emittable) {
        if (emittable instanceof EmittableBox) {
            return LayoutProto.LayoutType.BOX;
        }
        if (emittable instanceof EmittableButton) {
            return LayoutProto.LayoutType.BUTTON;
        }
        if (emittable instanceof EmittableRow) {
            return RadioButtonKt.isSelectableGroup(emittable.getModifier()) ? LayoutProto.LayoutType.RADIO_ROW : LayoutProto.LayoutType.ROW;
        }
        if (emittable instanceof EmittableColumn) {
            return RadioButtonKt.isSelectableGroup(emittable.getModifier()) ? LayoutProto.LayoutType.RADIO_COLUMN : LayoutProto.LayoutType.COLUMN;
        }
        if (emittable instanceof EmittableText) {
            return LayoutProto.LayoutType.TEXT;
        }
        if (emittable instanceof EmittableLazyListItem) {
            return LayoutProto.LayoutType.LIST_ITEM;
        }
        if (emittable instanceof EmittableLazyColumn) {
            return LayoutProto.LayoutType.LAZY_COLUMN;
        }
        if (emittable instanceof EmittableAndroidRemoteViews) {
            return LayoutProto.LayoutType.ANDROID_REMOTE_VIEWS;
        }
        if (emittable instanceof EmittableCheckBox) {
            return LayoutProto.LayoutType.CHECK_BOX;
        }
        if (emittable instanceof EmittableSpacer) {
            return LayoutProto.LayoutType.SPACER;
        }
        if (emittable instanceof EmittableSwitch) {
            return LayoutProto.LayoutType.SWITCH;
        }
        if (emittable instanceof EmittableImage) {
            return LayoutProto.LayoutType.IMAGE;
        }
        if (emittable instanceof EmittableLinearProgressIndicator) {
            return LayoutProto.LayoutType.LINEAR_PROGRESS_INDICATOR;
        }
        if (emittable instanceof EmittableCircularProgressIndicator) {
            return LayoutProto.LayoutType.CIRCULAR_PROGRESS_INDICATOR;
        }
        if (emittable instanceof EmittableLazyVerticalGrid) {
            return LayoutProto.LayoutType.LAZY_VERTICAL_GRID;
        }
        if (emittable instanceof EmittableLazyVerticalGridListItem) {
            return LayoutProto.LayoutType.LIST_ITEM;
        }
        if (emittable instanceof RemoteViewsRoot) {
            return LayoutProto.LayoutType.REMOTE_VIEWS_ROOT;
        }
        if (emittable instanceof EmittableRadioButton) {
            return LayoutProto.LayoutType.RADIO_BUTTON;
        }
        if (emittable instanceof EmittableSizeBox) {
            return LayoutProto.LayoutType.SIZE_BOX;
        }
        throw new IllegalArgumentException("Unknown element type " + emittable.getClass().getCanonicalName());
    }

    private static final Dimension getWidthModifier(GlanceModifier glanceModifier) {
        Dimension width;
        WidthModifier widthModifier = (WidthModifier) glanceModifier.foldIn(null, new Function2<WidthModifier, GlanceModifier.Element, WidthModifier>() { // from class: androidx.glance.appwidget.WidgetLayoutKt$special$$inlined$findModifier$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final WidthModifier invoke(WidthModifier widthModifier2, GlanceModifier.Element element) {
                return element instanceof WidthModifier ? element : widthModifier2;
            }
        });
        return (widthModifier == null || (width = widthModifier.getWidth()) == null) ? Dimension.Wrap.INSTANCE : width;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String layoutDatastoreKey(int i) {
        return a.a(i, "appWidgetLayout-");
    }

    private static final void setBoxNode(LayoutProto.LayoutNode.Builder builder, EmittableBox emittableBox) {
        builder.setHorizontalAlignment(m1329toProtouMT220(emittableBox.getContentAlignment().getHorizontal()));
        builder.setVerticalAlignment(m1328toProtoJe2gTW8(emittableBox.getContentAlignment().getVertical()));
    }

    private static final void setColumnNode(LayoutProto.LayoutNode.Builder builder, EmittableColumn emittableColumn) {
        builder.setHorizontalAlignment(m1329toProtouMT220(emittableColumn.getHorizontalAlignment()));
    }

    private static final void setImageNode(LayoutProto.LayoutNode.Builder builder, EmittableImage emittableImage) {
        LayoutProto.ContentScale contentScale;
        int contentScale2 = emittableImage.getContentScale();
        ContentScale.Companion companion = ContentScale.INSTANCE;
        if (ContentScale.m1395equalsimpl0(contentScale2, companion.m1401getFitAe3V0ko())) {
            contentScale = LayoutProto.ContentScale.FIT;
        } else if (ContentScale.m1395equalsimpl0(contentScale2, companion.m1399getCropAe3V0ko())) {
            contentScale = LayoutProto.ContentScale.CROP;
        } else {
            if (!ContentScale.m1395equalsimpl0(contentScale2, companion.m1400getFillBoundsAe3V0ko())) {
                throw new IllegalStateException(("Unknown content scale " + ((Object) ContentScale.m1397toStringimpl(emittableImage.getContentScale()))).toString());
            }
            contentScale = LayoutProto.ContentScale.FILL_BOUNDS;
        }
        builder.setImageScale(contentScale);
        builder.setHasImageDescription(!ImageKt.isDecorative(emittableImage));
    }

    private static final void setLazyListColumn(LayoutProto.LayoutNode.Builder builder, EmittableLazyColumn emittableLazyColumn) {
        builder.setHorizontalAlignment(m1329toProtouMT220(emittableLazyColumn.getHorizontalAlignment()));
    }

    private static final void setRowNode(LayoutProto.LayoutNode.Builder builder, EmittableRow emittableRow) {
        builder.setVerticalAlignment(m1328toProtoJe2gTW8(emittableRow.getVerticalAlignment()));
    }

    private static final LayoutProto.DimensionType toProto(Dimension dimension, Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return WidgetLayoutImpl31.INSTANCE.toProto(dimension);
        }
        Dimension resolveDimension = LayoutSelectionKt.resolveDimension(dimension, context);
        if (resolveDimension instanceof Dimension.Dp) {
            return LayoutProto.DimensionType.EXACT;
        }
        if (resolveDimension instanceof Dimension.Wrap) {
            return LayoutProto.DimensionType.WRAP;
        }
        if (resolveDimension instanceof Dimension.Fill) {
            return LayoutProto.DimensionType.FILL;
        }
        if (resolveDimension instanceof Dimension.Expand) {
            return LayoutProto.DimensionType.EXPAND;
        }
        throw new IllegalStateException("After resolution, no other type should be present");
    }

    /* renamed from: toProto-Je2gTW8, reason: not valid java name */
    private static final LayoutProto.VerticalAlignment m1328toProtoJe2gTW8(int i) {
        Alignment.Vertical.Companion companion = Alignment.Vertical.INSTANCE;
        if (Alignment.Vertical.m1382equalsimpl0(i, companion.m1388getTopmnfRV0w())) {
            return LayoutProto.VerticalAlignment.TOP;
        }
        if (Alignment.Vertical.m1382equalsimpl0(i, companion.m1387getCenterVerticallymnfRV0w())) {
            return LayoutProto.VerticalAlignment.CENTER_VERTICALLY;
        }
        if (Alignment.Vertical.m1382equalsimpl0(i, companion.m1386getBottommnfRV0w())) {
            return LayoutProto.VerticalAlignment.BOTTOM;
        }
        throw new IllegalStateException(("unknown vertical alignment " + ((Object) Alignment.Vertical.m1384toStringimpl(i))).toString());
    }

    /* renamed from: toProto-uMT2-20, reason: not valid java name */
    private static final LayoutProto.HorizontalAlignment m1329toProtouMT220(int i) {
        Alignment.Horizontal.Companion companion = Alignment.Horizontal.INSTANCE;
        if (Alignment.Horizontal.m1372equalsimpl0(i, companion.m1378getStartPGIyAqw())) {
            return LayoutProto.HorizontalAlignment.START;
        }
        if (Alignment.Horizontal.m1372equalsimpl0(i, companion.m1376getCenterHorizontallyPGIyAqw())) {
            return LayoutProto.HorizontalAlignment.CENTER_HORIZONTALLY;
        }
        if (Alignment.Horizontal.m1372equalsimpl0(i, companion.m1377getEndPGIyAqw())) {
            return LayoutProto.HorizontalAlignment.END;
        }
        throw new IllegalStateException(("unknown horizontal alignment " + ((Object) Alignment.Horizontal.m1374toStringimpl(i))).toString());
    }
}
