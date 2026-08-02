package androidx.glance.appwidget;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.widget.RemoteViews;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.AndroidResourceImageProvider;
import androidx.glance.BackgroundModifier;
import androidx.glance.GlanceModifier;
import androidx.glance.ImageProvider;
import androidx.glance.Visibility;
import androidx.glance.VisibilityModifier;
import androidx.glance.action.ActionModifier;
import androidx.glance.appwidget.action.ApplyActionKt;
import androidx.glance.color.DayNightColorProvider;
import androidx.glance.layout.HeightModifier;
import androidx.glance.layout.PaddingInDp;
import androidx.glance.layout.PaddingModifier;
import androidx.glance.layout.WidthModifier;
import androidx.glance.semantics.SemanticsModifier;
import androidx.glance.semantics.SemanticsProperties;
import androidx.glance.unit.ColorProvider;
import androidx.glance.unit.Dimension;
import androidx.glance.unit.FixedColorProvider;
import androidx.glance.unit.ResourceColorProvider;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002\u001a(\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\rH\u0000\u001a \u0010\u0013\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0002\u001a(\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a(\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a4\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\f\u0010\u001e\u001a\u00020\u0015*\u00020\u001fH\u0002\"\u001a\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006 "}, d2 = {"isFixed", "", "Landroidx/glance/unit/Dimension;", "(Landroidx/glance/unit/Dimension;)Z", "applyBackgroundModifier", "", "context", "Landroid/content/Context;", "rv", "Landroid/widget/RemoteViews;", "modifier", "Landroidx/glance/BackgroundModifier;", "viewDef", "Landroidx/glance/appwidget/InsertedViewInfo;", "applyModifiers", "translationContext", "Landroidx/glance/appwidget/TranslationContext;", "modifiers", "Landroidx/glance/GlanceModifier;", "applyRoundedCorners", "viewId", "", "radius", "applySimpleHeightModifier", "Landroidx/glance/layout/HeightModifier;", "applySimpleWidthModifier", "Landroidx/glance/layout/WidthModifier;", "applySizeModifiers", "widthModifier", "heightModifier", "toViewVisibility", "Landroidx/glance/Visibility;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nApplyModifiers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApplyModifiers.kt\nandroidx/glance/appwidget/ApplyModifiersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n1#2:361\n*E\n"})
/* loaded from: classes.dex */
public final class ApplyModifiersKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Visibility.values().length];
            try {
                iArr[Visibility.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Visibility.Invisible.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Visibility.Gone.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyBackgroundModifier(Context context, RemoteViews remoteViews, BackgroundModifier backgroundModifier, InsertedViewInfo insertedViewInfo) {
        int mainViewId = insertedViewInfo.getMainViewId();
        ImageProvider imageProvider = backgroundModifier.getImageProvider();
        if (imageProvider != null) {
            if (imageProvider instanceof AndroidResourceImageProvider) {
                RemoteViewsCompat.setViewBackgroundResource(remoteViews, mainViewId, ((AndroidResourceImageProvider) imageProvider).getResId());
                return;
            }
            return;
        }
        ColorProvider colorProvider = backgroundModifier.getColorProvider();
        if (colorProvider instanceof FixedColorProvider) {
            RemoteViewsCompat.setViewBackgroundColor(remoteViews, mainViewId, ColorKt.m562toArgb8_81llA(((FixedColorProvider) colorProvider).m1510getColor0d7_KjU()));
            return;
        }
        if (colorProvider instanceof ResourceColorProvider) {
            RemoteViewsCompat.setViewBackgroundColorResource(remoteViews, mainViewId, ((ResourceColorProvider) colorProvider).getResId());
            return;
        }
        if (!(colorProvider instanceof DayNightColorProvider)) {
            Objects.toString(colorProvider);
        } else if (Build.VERSION.SDK_INT < 31) {
            RemoteViewsCompat.setViewBackgroundColor(remoteViews, mainViewId, ColorKt.m562toArgb8_81llA(((DayNightColorProvider) colorProvider).mo1356getColorvNxB06k(context)));
        } else {
            DayNightColorProvider dayNightColorProvider = (DayNightColorProvider) colorProvider;
            RemoteViewsCompat.setViewBackgroundColor(remoteViews, mainViewId, ColorKt.m562toArgb8_81llA(dayNightColorProvider.m1358getDay0d7_KjU()), ColorKt.m562toArgb8_81llA(dayNightColorProvider.m1359getNight0d7_KjU()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, androidx.glance.Visibility] */
    public static final void applyModifiers(final TranslationContext translationContext, final RemoteViews remoteViews, GlanceModifier glanceModifier, final InsertedViewInfo insertedViewInfo) {
        List list;
        String joinToString$default;
        final Context context = translationContext.getContext();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
        objectRef5.element = Visibility.Visible;
        final Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef8 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef9 = new Ref.ObjectRef();
        glanceModifier.foldIn(Unit.INSTANCE, new Function2<Unit, GlanceModifier.Element, Unit>() { // from class: androidx.glance.appwidget.ApplyModifiersKt$applyModifiers$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Unit unit, GlanceModifier.Element element) {
                invoke2(unit, element);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
            
                if (r0 == null) goto L24;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v3, types: [T, androidx.glance.unit.Dimension] */
            /* JADX WARN: Type inference failed for: r4v5, types: [T, androidx.glance.Visibility] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke2(Unit unit, GlanceModifier.Element element) {
                T t;
                if (element instanceof ActionModifier) {
                    Ref.ObjectRef<ActionModifier> objectRef10 = objectRef6;
                    ActionModifier actionModifier = objectRef10.element;
                    objectRef10.element = element;
                    return;
                }
                if (element instanceof WidthModifier) {
                    objectRef.element = element;
                    return;
                }
                if (element instanceof HeightModifier) {
                    objectRef2.element = element;
                    return;
                }
                if (element instanceof BackgroundModifier) {
                    ApplyModifiersKt.applyBackgroundModifier(context, remoteViews, (BackgroundModifier) element, insertedViewInfo);
                    return;
                }
                if (element instanceof PaddingModifier) {
                    Ref.ObjectRef<PaddingModifier> objectRef11 = objectRef3;
                    PaddingModifier paddingModifier = objectRef11.element;
                    if (paddingModifier != null) {
                        PaddingModifier plus = paddingModifier.plus((PaddingModifier) element);
                        t = plus;
                    }
                    t = (PaddingModifier) element;
                    objectRef11.element = t;
                    return;
                }
                if (element instanceof VisibilityModifier) {
                    objectRef5.element = ((VisibilityModifier) element).getVisibility();
                    return;
                }
                if (element instanceof CornerRadiusModifier) {
                    objectRef4.element = ((CornerRadiusModifier) element).getRadius();
                    return;
                }
                if (element instanceof AppWidgetBackgroundModifier) {
                    return;
                }
                if (element instanceof SelectableGroupModifier) {
                    if (!translationContext.getCanUseSelectableGroup()) {
                        throw new IllegalStateException("GlanceModifier.selectableGroup() can only be used on Row or Column composables.");
                    }
                    return;
                }
                if (element instanceof AlignmentModifier) {
                    return;
                }
                if (element instanceof ClipToOutlineModifier) {
                    objectRef8.element = element;
                    return;
                }
                if (element instanceof EnabledModifier) {
                    objectRef7.element = element;
                } else if (element instanceof SemanticsModifier) {
                    objectRef9.element = element;
                } else {
                    Objects.toString(element);
                }
            }
        });
        applySizeModifiers(translationContext, remoteViews, (WidthModifier) objectRef.element, (HeightModifier) objectRef2.element, insertedViewInfo);
        ActionModifier actionModifier = (ActionModifier) objectRef6.element;
        if (actionModifier != null) {
            ApplyActionKt.applyAction(translationContext, remoteViews, actionModifier.getAction(), insertedViewInfo.getMainViewId());
        }
        Dimension dimension = (Dimension) objectRef4.element;
        if (dimension != null) {
            applyRoundedCorners(remoteViews, insertedViewInfo.getMainViewId(), dimension);
        }
        PaddingModifier paddingModifier = (PaddingModifier) objectRef3.element;
        if (paddingModifier != null) {
            PaddingInDp absolute = paddingModifier.toDp(context.getResources()).toAbsolute(translationContext.isRtl());
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            remoteViews.setViewPadding(insertedViewInfo.getMainViewId(), UtilsKt.m1327toPixelsD5KLDUw(absolute.m1424getLeftD9Ej5fM(), displayMetrics), UtilsKt.m1327toPixelsD5KLDUw(absolute.m1427getTopD9Ej5fM(), displayMetrics), UtilsKt.m1327toPixelsD5KLDUw(absolute.m1425getRightD9Ej5fM(), displayMetrics), UtilsKt.m1327toPixelsD5KLDUw(absolute.m1422getBottomD9Ej5fM(), displayMetrics));
        }
        if (((ClipToOutlineModifier) objectRef8.element) != null && Build.VERSION.SDK_INT >= 31) {
            remoteViews.setBoolean(insertedViewInfo.getMainViewId(), "setClipToOutline", true);
        }
        EnabledModifier enabledModifier = (EnabledModifier) objectRef7.element;
        if (enabledModifier != null) {
            remoteViews.setBoolean(insertedViewInfo.getMainViewId(), "setEnabled", enabledModifier.getEnabled());
        }
        SemanticsModifier semanticsModifier = (SemanticsModifier) objectRef9.element;
        if (semanticsModifier != null && (list = (List) semanticsModifier.getConfiguration().getOrNull(SemanticsProperties.INSTANCE.getContentDescription())) != null) {
            int mainViewId = insertedViewInfo.getMainViewId();
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, null, null, null, 0, null, null, 63, null);
            remoteViews.setContentDescription(mainViewId, joinToString$default);
        }
        remoteViews.setViewVisibility(insertedViewInfo.getMainViewId(), toViewVisibility((Visibility) objectRef5.element));
    }

    private static final void applyRoundedCorners(RemoteViews remoteViews, int i, Dimension dimension) {
        if (Build.VERSION.SDK_INT >= 31) {
            ApplyModifiersApi31Impl.INSTANCE.applyRoundedCorners(remoteViews, i, dimension);
        }
    }

    public static final void applySimpleHeightModifier(Context context, RemoteViews remoteViews, HeightModifier heightModifier, int i) {
        Dimension height = heightModifier.getHeight();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            if (i2 >= 33 || !CollectionsKt.listOf((Object[]) new Dimension[]{Dimension.Wrap.INSTANCE, Dimension.Expand.INSTANCE}).contains(height)) {
                ApplyModifiersApi31Impl.INSTANCE.setViewHeight(remoteViews, i, height);
                return;
            }
            return;
        }
        if (CollectionsKt.listOf((Object[]) new Dimension[]{Dimension.Wrap.INSTANCE, Dimension.Fill.INSTANCE, Dimension.Expand.INSTANCE}).contains(LayoutSelectionKt.resolveDimension(height, context))) {
            return;
        }
        throw new IllegalArgumentException("Using a height of " + height + " requires a complex layout before API 31");
    }

    public static final void applySimpleWidthModifier(Context context, RemoteViews remoteViews, WidthModifier widthModifier, int i) {
        Dimension width = widthModifier.getWidth();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            if (i2 >= 33 || !CollectionsKt.listOf((Object[]) new Dimension[]{Dimension.Wrap.INSTANCE, Dimension.Expand.INSTANCE}).contains(width)) {
                ApplyModifiersApi31Impl.INSTANCE.setViewWidth(remoteViews, i, width);
                return;
            }
            return;
        }
        if (CollectionsKt.listOf((Object[]) new Dimension[]{Dimension.Wrap.INSTANCE, Dimension.Fill.INSTANCE, Dimension.Expand.INSTANCE}).contains(LayoutSelectionKt.resolveDimension(width, context))) {
            return;
        }
        throw new IllegalArgumentException("Using a width of " + width + " requires a complex layout before API 31");
    }

    private static final void applySizeModifiers(TranslationContext translationContext, RemoteViews remoteViews, WidthModifier widthModifier, HeightModifier heightModifier, InsertedViewInfo insertedViewInfo) {
        Context context = translationContext.getContext();
        if (LayoutSelectionKt.isSimple(insertedViewInfo)) {
            if (widthModifier != null) {
                applySimpleWidthModifier(context, remoteViews, widthModifier, insertedViewInfo.getMainViewId());
            }
            if (heightModifier != null) {
                applySimpleHeightModifier(context, remoteViews, heightModifier, insertedViewInfo.getMainViewId());
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            throw new IllegalStateException("There is currently no valid use case where a complex view is used on Android S");
        }
        Dimension width = widthModifier != null ? widthModifier.getWidth() : null;
        Dimension height = heightModifier != null ? heightModifier.getHeight() : null;
        if (isFixed(width) || isFixed(height)) {
            boolean z = (width instanceof Dimension.Fill) || (width instanceof Dimension.Expand);
            boolean z2 = (height instanceof Dimension.Fill) || (height instanceof Dimension.Expand);
            int inflateViewStub$default = UtilsKt.inflateViewStub$default(remoteViews, translationContext, R.id.sizeViewStub, (z && z2) ? R.layout.size_match_match : z ? R.layout.size_match_wrap : z2 ? R.layout.size_wrap_match : R.layout.size_wrap_wrap, null, 8, null);
            if (width instanceof Dimension.Dp) {
                RemoteViewsCompat.setTextViewWidth(remoteViews, inflateViewStub$default, applySizeModifiers$toPixels((Dimension.Dp) width, context));
            } else if (width instanceof Dimension.Resource) {
                RemoteViewsCompat.setTextViewWidth(remoteViews, inflateViewStub$default, applySizeModifiers$toPixels$9((Dimension.Resource) width, context));
            } else {
                if (!((Intrinsics.areEqual(width, Dimension.Expand.INSTANCE) ? true : Intrinsics.areEqual(width, Dimension.Fill.INSTANCE) ? true : Intrinsics.areEqual(width, Dimension.Wrap.INSTANCE)) || width == null)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            Unit unit = Unit.INSTANCE;
            if (height instanceof Dimension.Dp) {
                RemoteViewsCompat.setTextViewHeight(remoteViews, inflateViewStub$default, applySizeModifiers$toPixels((Dimension.Dp) height, context));
            } else if (height instanceof Dimension.Resource) {
                RemoteViewsCompat.setTextViewHeight(remoteViews, inflateViewStub$default, applySizeModifiers$toPixels$9((Dimension.Resource) height, context));
            } else {
                if (!((Intrinsics.areEqual(height, Dimension.Expand.INSTANCE) ? true : Intrinsics.areEqual(height, Dimension.Fill.INSTANCE) ? true : Intrinsics.areEqual(height, Dimension.Wrap.INSTANCE)) || height == null)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    private static final int applySizeModifiers$toPixels(Dimension.Dp dp, Context context) {
        return UtilsKt.m1326toPixelsD5KLDUw(dp.getDp(), context);
    }

    private static final int applySizeModifiers$toPixels$9(Dimension.Resource resource, Context context) {
        return context.getResources().getDimensionPixelSize(resource.getRes());
    }

    private static final boolean isFixed(Dimension dimension) {
        boolean z = true;
        if (dimension instanceof Dimension.Dp ? true : dimension instanceof Dimension.Resource) {
            return true;
        }
        if (!(Intrinsics.areEqual(dimension, Dimension.Expand.INSTANCE) ? true : Intrinsics.areEqual(dimension, Dimension.Fill.INSTANCE) ? true : Intrinsics.areEqual(dimension, Dimension.Wrap.INSTANCE)) && dimension != null) {
            z = false;
        }
        if (z) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final int toViewVisibility(Visibility visibility) {
        int i = WhenMappings.$EnumSwitchMapping$0[visibility.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 8;
        }
        throw new NoWhenBranchMatchedException();
    }
}
