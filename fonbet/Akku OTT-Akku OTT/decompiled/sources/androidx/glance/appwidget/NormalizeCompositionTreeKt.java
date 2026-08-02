package androidx.glance.appwidget;

import android.os.Build;
import androidx.compose.ui.unit.Dp;
import androidx.glance.BackgroundModifier;
import androidx.glance.ButtonKt;
import androidx.glance.Emittable;
import androidx.glance.EmittableButton;
import androidx.glance.EmittableImage;
import androidx.glance.EmittableLazyItemWithChildren;
import androidx.glance.EmittableWithChildren;
import androidx.glance.GlanceModifier;
import androidx.glance.ImageKt;
import androidx.glance.ImageProvider;
import androidx.glance.action.Action;
import androidx.glance.action.ActionModifier;
import androidx.glance.action.LambdaAction;
import androidx.glance.appwidget.action.CompoundButtonAction;
import androidx.glance.layout.Alignment;
import androidx.glance.layout.ContentScale;
import androidx.glance.layout.EmittableBox;
import androidx.glance.layout.HeightModifier;
import androidx.glance.layout.PaddingKt;
import androidx.glance.layout.PaddingModifier;
import androidx.glance.layout.SizeModifiersKt;
import androidx.glance.layout.WidthModifier;
import androidx.glance.unit.ColorProvider;
import androidx.glance.unit.Dimension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u0014\u0010\n\u001a\u00020\u000b*\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\fH\u0002\u001a\u001a\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u000b0\u000e*\u00020\u000bH\u0002\u001a\f\u0010\u0010\u001a\u00020\u0011*\u00020\u000bH\u0002\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0014H\u0002\u001a\f\u0010\u0015\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\f\u0010\u0016\u001a\u00020\u0014*\u00020\u0014H\u0002\u001a \u0010\u0017\u001a\u00020\u0001*\u00020\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0019H\u0002\u001a\u001e\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001d0\u001b*\u00020\u0003H\u0000\u001a\f\u0010\u001e\u001a\u00020\u0001*\u00020\u000bH\u0002¨\u0006\u001f"}, d2 = {"coerceToOneChild", "", "container", "Landroidx/glance/EmittableWithChildren;", "normalizeCompositionTree", "root", "Landroidx/glance/appwidget/RemoteViewsRoot;", "normalizeLazyListItem", "view", "Landroidx/glance/EmittableLazyItemWithChildren;", "collect", "Landroidx/glance/GlanceModifier;", "", "extractLambdaAction", "Lkotlin/Pair;", "Landroidx/glance/action/LambdaAction;", "extractSizeAndCornerRadiusModifiers", "Landroidx/glance/appwidget/ExtractedSizeModifiers;", "hasBuiltinRipple", "", "Landroidx/glance/Emittable;", "normalizeSizes", "transformBackgroundImageAndActionRipple", "transformTree", "block", "Lkotlin/Function1;", "updateLambdaActionKeys", "", "", "", "warnIfMultipleClickableActions", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNormalizeCompositionTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NormalizeCompositionTree.kt\nandroidx/glance/appwidget/NormalizeCompositionTreeKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Utils.kt\nandroidx/glance/UtilsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,343:1\n1726#2,3:344\n1855#2,2:347\n1747#2,2:356\n1749#2:365\n1747#2,2:373\n1749#2:382\n1864#2,3:383\n1804#2,3:386\n1807#2:405\n1789#2,3:448\n23#3,7:349\n23#3,7:358\n23#3,7:366\n23#3,7:375\n38#3,11:406\n38#3,11:418\n38#3,11:429\n23#3,7:440\n361#4,7:389\n361#4,7:397\n215#5:396\n216#5:404\n1#6:417\n155#7:447\n*S KotlinDebug\n*F\n+ 1 NormalizeCompositionTree.kt\nandroidx/glance/appwidget/NormalizeCompositionTreeKt\n*L\n66#1:344,3\n92#1:347,2\n98#1:356,2\n98#1:365\n105#1:373,2\n105#1:382\n115#1:383,3\n137#1:386,3\n137#1:405\n340#1:448,3\n97#1:349,7\n99#1:358,7\n104#1:366,7\n106#1:375,7\n159#1:406,11\n216#1:418,11\n256#1:429,11\n278#1:440,7\n147#1:389,7\n152#1:397,7\n151#1:396\n151#1:404\n279#1:447\n*E\n"})
/* loaded from: classes.dex */
public final class NormalizeCompositionTreeKt {
    private static final void coerceToOneChild(EmittableWithChildren emittableWithChildren) {
        if (!emittableWithChildren.getChildren().isEmpty()) {
            List<Emittable> children = emittableWithChildren.getChildren();
            if (children == null || !children.isEmpty()) {
                Iterator<T> it = children.iterator();
                while (it.hasNext()) {
                    if (!(((Emittable) it.next()) instanceof EmittableSizeBox)) {
                    }
                }
            }
            for (Emittable emittable : emittableWithChildren.getChildren()) {
                Intrinsics.checkNotNull(emittable, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
                EmittableSizeBox emittableSizeBox = (EmittableSizeBox) emittable;
                if (emittableSizeBox.getChildren().size() != 1) {
                    EmittableBox emittableBox = new EmittableBox();
                    CollectionsKt__MutableCollectionsKt.addAll(emittableBox.getChildren(), emittableSizeBox.getChildren());
                    emittableSizeBox.getChildren().clear();
                    emittableSizeBox.getChildren().add(emittableBox);
                }
            }
            return;
        }
        if (emittableWithChildren.getChildren().size() == 1) {
            return;
        }
        EmittableBox emittableBox2 = new EmittableBox();
        CollectionsKt__MutableCollectionsKt.addAll(emittableBox2.getChildren(), emittableWithChildren.getChildren());
        emittableWithChildren.getChildren().clear();
        emittableWithChildren.getChildren().add(emittableBox2);
    }

    private static final GlanceModifier collect(List<GlanceModifier> list) {
        GlanceModifier then;
        GlanceModifier.Companion companion = GlanceModifier.INSTANCE;
        for (GlanceModifier glanceModifier : list) {
            if (glanceModifier != null && (then = companion.then(glanceModifier)) != null) {
                companion = then;
            }
        }
        return companion;
    }

    private static final Pair<LambdaAction, GlanceModifier> extractLambdaAction(GlanceModifier glanceModifier) {
        Pair pair = glanceModifier.any(new Function1<GlanceModifier.Element, Boolean>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$extractLambdaAction$$inlined$extractModifier$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(GlanceModifier.Element element) {
                return Boolean.valueOf(element instanceof ActionModifier);
            }
        }) ? (Pair) glanceModifier.foldIn(TuplesKt.to(null, GlanceModifier.INSTANCE), new Function2<Pair<? extends ActionModifier, ? extends GlanceModifier>, GlanceModifier.Element, Pair<? extends ActionModifier, ? extends GlanceModifier>>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$extractLambdaAction$$inlined$extractModifier$2
            @Override // kotlin.jvm.functions.Function2
            public final Pair<ActionModifier, GlanceModifier> invoke(Pair<? extends ActionModifier, ? extends GlanceModifier> pair2, GlanceModifier.Element element) {
                return element instanceof ActionModifier ? TuplesKt.to(element, pair2.getSecond()) : TuplesKt.to(pair2.getFirst(), pair2.getSecond().then(element));
            }
        }) : TuplesKt.to(null, glanceModifier);
        ActionModifier actionModifier = (ActionModifier) pair.component1();
        GlanceModifier glanceModifier2 = (GlanceModifier) pair.component2();
        Action action = actionModifier != null ? actionModifier.getAction() : null;
        if (action instanceof LambdaAction) {
            return TuplesKt.to(action, glanceModifier2);
        }
        if (action instanceof CompoundButtonAction) {
            CompoundButtonAction compoundButtonAction = (CompoundButtonAction) action;
            if (compoundButtonAction.getInnerAction() instanceof LambdaAction) {
                return TuplesKt.to(compoundButtonAction.getInnerAction(), glanceModifier2);
            }
        }
        return TuplesKt.to(null, glanceModifier2);
    }

    private static final ExtractedSizeModifiers extractSizeAndCornerRadiusModifiers(GlanceModifier glanceModifier) {
        return glanceModifier.any(new Function1<GlanceModifier.Element, Boolean>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$extractSizeAndCornerRadiusModifiers$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(GlanceModifier.Element element) {
                return Boolean.valueOf((element instanceof WidthModifier) || (element instanceof HeightModifier) || (element instanceof CornerRadiusModifier));
            }
        }) ? (ExtractedSizeModifiers) glanceModifier.foldIn(new ExtractedSizeModifiers(null, null, 3, null), new Function2<ExtractedSizeModifiers, GlanceModifier.Element, ExtractedSizeModifiers>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$extractSizeAndCornerRadiusModifiers$2
            @Override // kotlin.jvm.functions.Function2
            public final ExtractedSizeModifiers invoke(ExtractedSizeModifiers extractedSizeModifiers, GlanceModifier.Element element) {
                return ((element instanceof WidthModifier) || (element instanceof HeightModifier) || (element instanceof CornerRadiusModifier)) ? ExtractedSizeModifiers.copy$default(extractedSizeModifiers, extractedSizeModifiers.getSizeModifiers().then(element), null, 2, null) : ExtractedSizeModifiers.copy$default(extractedSizeModifiers, null, extractedSizeModifiers.getNonSizeModifiers().then(element), 1, null);
            }
        }) : new ExtractedSizeModifiers(null, glanceModifier, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasBuiltinRipple(Emittable emittable) {
        if ((emittable instanceof EmittableSwitch) || (emittable instanceof EmittableRadioButton) || (emittable instanceof EmittableCheckBox)) {
            return true;
        }
        return (emittable instanceof EmittableButton) && Build.VERSION.SDK_INT >= 31;
    }

    public static final void normalizeCompositionTree(RemoteViewsRoot remoteViewsRoot) {
        coerceToOneChild(remoteViewsRoot);
        normalizeSizes(remoteViewsRoot);
        transformTree(remoteViewsRoot, new Function1<Emittable, Emittable>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$normalizeCompositionTree$1
            @Override // kotlin.jvm.functions.Function1
            public final Emittable invoke(Emittable emittable) {
                Emittable transformBackgroundImageAndActionRipple;
                if (emittable instanceof EmittableLazyItemWithChildren) {
                    NormalizeCompositionTreeKt.normalizeLazyListItem((EmittableLazyItemWithChildren) emittable);
                }
                transformBackgroundImageAndActionRipple = NormalizeCompositionTreeKt.transformBackgroundImageAndActionRipple(emittable);
                return transformBackgroundImageAndActionRipple;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void normalizeLazyListItem(EmittableLazyItemWithChildren emittableLazyItemWithChildren) {
        EmittableBox emittableBox = new EmittableBox();
        CollectionsKt__MutableCollectionsKt.addAll(emittableBox.getChildren(), emittableLazyItemWithChildren.getChildren());
        emittableBox.setContentAlignment(emittableLazyItemWithChildren.getAlignment());
        emittableBox.setModifier(emittableLazyItemWithChildren.getModifier());
        emittableLazyItemWithChildren.getChildren().clear();
        emittableLazyItemWithChildren.getChildren().add(emittableBox);
        emittableLazyItemWithChildren.setAlignment(Alignment.INSTANCE.getCenterStart());
    }

    private static final void normalizeSizes(EmittableWithChildren emittableWithChildren) {
        Dimension dimension;
        Dimension dimension2;
        List<Emittable> children;
        for (Emittable emittable : emittableWithChildren.getChildren()) {
            if (emittable instanceof EmittableWithChildren) {
                normalizeSizes((EmittableWithChildren) emittable);
            }
        }
        HeightModifier heightModifier = (HeightModifier) emittableWithChildren.getModifier().foldIn(null, new Function2<HeightModifier, GlanceModifier.Element, HeightModifier>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$normalizeSizes$$inlined$findModifier$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final HeightModifier invoke(HeightModifier heightModifier2, GlanceModifier.Element element) {
                return element instanceof HeightModifier ? element : heightModifier2;
            }
        });
        if (heightModifier == null || (dimension = heightModifier.getHeight()) == null) {
            dimension = Dimension.Wrap.INSTANCE;
        }
        if ((dimension instanceof Dimension.Wrap) && ((children = emittableWithChildren.getChildren()) == null || !children.isEmpty())) {
            Iterator<T> it = children.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                HeightModifier heightModifier2 = (HeightModifier) ((Emittable) it.next()).getModifier().foldIn(null, new Function2<HeightModifier, GlanceModifier.Element, HeightModifier>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$normalizeSizes$lambda$2$$inlined$findModifier$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function2
                    public final HeightModifier invoke(HeightModifier heightModifier3, GlanceModifier.Element element) {
                        return element instanceof HeightModifier ? element : heightModifier3;
                    }
                });
                if ((heightModifier2 != null ? heightModifier2.getHeight() : null) instanceof Dimension.Fill) {
                    emittableWithChildren.setModifier(SizeModifiersKt.fillMaxHeight(emittableWithChildren.getModifier()));
                    break;
                }
            }
        }
        WidthModifier widthModifier = (WidthModifier) emittableWithChildren.getModifier().foldIn(null, new Function2<WidthModifier, GlanceModifier.Element, WidthModifier>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$normalizeSizes$$inlined$findModifier$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final WidthModifier invoke(WidthModifier widthModifier2, GlanceModifier.Element element) {
                return element instanceof WidthModifier ? element : widthModifier2;
            }
        });
        if (widthModifier == null || (dimension2 = widthModifier.getWidth()) == null) {
            dimension2 = Dimension.Wrap.INSTANCE;
        }
        if (dimension2 instanceof Dimension.Wrap) {
            List<Emittable> children2 = emittableWithChildren.getChildren();
            if (children2 == null || !children2.isEmpty()) {
                Iterator<T> it2 = children2.iterator();
                while (it2.hasNext()) {
                    WidthModifier widthModifier2 = (WidthModifier) ((Emittable) it2.next()).getModifier().foldIn(null, new Function2<WidthModifier, GlanceModifier.Element, WidthModifier>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$normalizeSizes$lambda$3$$inlined$findModifier$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final WidthModifier invoke(WidthModifier widthModifier3, GlanceModifier.Element element) {
                            return element instanceof WidthModifier ? element : widthModifier3;
                        }
                    });
                    if ((widthModifier2 != null ? widthModifier2.getWidth() : null) instanceof Dimension.Fill) {
                        emittableWithChildren.setModifier(SizeModifiersKt.fillMaxWidth(emittableWithChildren.getModifier()));
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Emittable transformBackgroundImageAndActionRipple(final Emittable emittable) {
        EmittableImage emittableImage;
        ActionModifier actionModifier;
        EmittableImage emittableImage2;
        if (emittable instanceof EmittableLazyItemWithChildren) {
            return emittable;
        }
        if (emittable instanceof EmittableSizeBox) {
            return emittable;
        }
        final boolean z = emittable instanceof EmittableButton;
        if (!emittable.getModifier().any(new Function1<GlanceModifier.Element, Boolean>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$shouldWrapTargetInABox$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
            
                if (r3 == false) goto L14;
             */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Boolean invoke(GlanceModifier.Element element) {
                boolean z2;
                boolean hasBuiltinRipple;
                if ((!(element instanceof BackgroundModifier) || ((BackgroundModifier) element).getImageProvider() == null) && (!z || Build.VERSION.SDK_INT > 30)) {
                    if (element instanceof ActionModifier) {
                        hasBuiltinRipple = NormalizeCompositionTreeKt.hasBuiltinRipple(emittable);
                    }
                    z2 = false;
                    return Boolean.valueOf(z2);
                }
                z2 = true;
                return Boolean.valueOf(z2);
            }
        })) {
            return emittable;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        GlanceModifier modifier = emittable.getModifier();
        Pair pair = modifier.any(new Function1<GlanceModifier.Element, Boolean>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(GlanceModifier.Element element) {
                return Boolean.valueOf(element instanceof BackgroundModifier);
            }
        }) ? (Pair) modifier.foldIn(TuplesKt.to(null, GlanceModifier.INSTANCE), new Function2<Pair<? extends BackgroundModifier, ? extends GlanceModifier>, GlanceModifier.Element, Pair<? extends BackgroundModifier, ? extends GlanceModifier>>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$2
            @Override // kotlin.jvm.functions.Function2
            public final Pair<BackgroundModifier, GlanceModifier> invoke(Pair<? extends BackgroundModifier, ? extends GlanceModifier> pair2, GlanceModifier.Element element) {
                return element instanceof BackgroundModifier ? TuplesKt.to(element, pair2.getSecond()) : TuplesKt.to(pair2.getFirst(), pair2.getSecond().then(element));
            }
        }) : TuplesKt.to(null, modifier);
        BackgroundModifier backgroundModifier = (BackgroundModifier) pair.component1();
        GlanceModifier glanceModifier = (GlanceModifier) pair.component2();
        if (backgroundModifier != null) {
            if (z) {
                emittableImage = new EmittableImage();
                emittableImage.setModifier(SizeModifiersKt.fillMaxSize(GlanceModifier.INSTANCE));
                emittableImage.setProvider(ImageKt.ImageProvider(R.drawable.glance_button_outline));
                ColorProvider colorProvider = backgroundModifier.getColorProvider();
                if (colorProvider != null) {
                    emittableImage.setColorFilterParams(new TintAndAlphaColorFilterParams(colorProvider));
                }
                emittableImage.m1275setContentScaleHwT0Evw(ContentScale.INSTANCE.m1400getFillBoundsAe3V0ko());
            } else if (backgroundModifier.getImageProvider() != null) {
                emittableImage = new EmittableImage();
                emittableImage.setModifier(SizeModifiersKt.fillMaxSize(GlanceModifier.INSTANCE));
                emittableImage.setProvider(backgroundModifier.getImageProvider());
                emittableImage.m1275setContentScaleHwT0Evw(backgroundModifier.getContentScale());
            } else {
                arrayList2.add(backgroundModifier);
            }
            warnIfMultipleClickableActions(glanceModifier);
            Pair pair2 = !glanceModifier.any(new Function1<GlanceModifier.Element, Boolean>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$3
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(GlanceModifier.Element element) {
                    return Boolean.valueOf(element instanceof ActionModifier);
                }
            }) ? (Pair) glanceModifier.foldIn(TuplesKt.to(null, GlanceModifier.INSTANCE), new Function2<Pair<? extends ActionModifier, ? extends GlanceModifier>, GlanceModifier.Element, Pair<? extends ActionModifier, ? extends GlanceModifier>>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$4
                @Override // kotlin.jvm.functions.Function2
                public final Pair<ActionModifier, GlanceModifier> invoke(Pair<? extends ActionModifier, ? extends GlanceModifier> pair3, GlanceModifier.Element element) {
                    return element instanceof ActionModifier ? TuplesKt.to(element, pair3.getSecond()) : TuplesKt.to(pair3.getFirst(), pair3.getSecond().then(element));
                }
            }) : TuplesKt.to(null, glanceModifier);
            actionModifier = (ActionModifier) pair2.component1();
            GlanceModifier glanceModifier2 = (GlanceModifier) pair2.component2();
            arrayList.add(actionModifier);
            if (actionModifier != null || hasBuiltinRipple(emittable)) {
                emittableImage2 = null;
            } else {
                ImageProvider ImageProvider = z ? ImageKt.ImageProvider(R.drawable.glance_button_ripple) : ImageKt.ImageProvider(R.drawable.glance_ripple);
                emittableImage2 = new EmittableImage();
                emittableImage2.setModifier(SizeModifiersKt.fillMaxSize(GlanceModifier.INSTANCE));
                emittableImage2.setProvider(ImageProvider);
            }
            ExtractedSizeModifiers extractSizeAndCornerRadiusModifiers = extractSizeAndCornerRadiusModifiers(glanceModifier2);
            GlanceModifier sizeModifiers = extractSizeAndCornerRadiusModifiers.getSizeModifiers();
            GlanceModifier nonSizeModifiers = extractSizeAndCornerRadiusModifiers.getNonSizeModifiers();
            arrayList.add(sizeModifiers);
            arrayList2.add(SizeModifiersKt.fillMaxSize(nonSizeModifiers));
            if (emittable instanceof EmittableButton) {
                GlanceModifier.Companion companion = GlanceModifier.INSTANCE;
                EmittableButton emittableButton = (EmittableButton) emittable;
                arrayList.add(AppWidgetModifiersKt.enabled(companion, emittableButton.getEnabled()));
                emittable = ButtonKt.toEmittableText(emittableButton);
                if (emittable.getModifier().foldIn(null, new Function2<PaddingModifier, GlanceModifier.Element, PaddingModifier>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$findModifier$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function2
                    public final PaddingModifier invoke(PaddingModifier paddingModifier, GlanceModifier.Element element) {
                        return element instanceof PaddingModifier ? element : paddingModifier;
                    }
                }) == null) {
                    arrayList2.add(PaddingKt.m1431paddingVpY3zN4(companion, Dp.m1021constructorimpl(16), Dp.m1021constructorimpl(8)));
                }
            }
            EmittableBox emittableBox = new EmittableBox();
            emittableBox.setModifier(collect(arrayList));
            if (z) {
                emittableBox.setContentAlignment(Alignment.INSTANCE.getCenter());
            }
            if (emittableImage != null) {
                emittableBox.getChildren().add(emittableImage);
            }
            List<Emittable> children = emittableBox.getChildren();
            emittable.setModifier(collect(arrayList2));
            children.add(emittable);
            if (emittableImage2 != null) {
                emittableBox.getChildren().add(emittableImage2);
            }
            return emittableBox;
        }
        emittableImage = null;
        warnIfMultipleClickableActions(glanceModifier);
        if (!glanceModifier.any(new Function1<GlanceModifier.Element, Boolean>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$3
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(GlanceModifier.Element element) {
                return Boolean.valueOf(element instanceof ActionModifier);
            }
        })) {
        }
        actionModifier = (ActionModifier) pair2.component1();
        GlanceModifier glanceModifier22 = (GlanceModifier) pair2.component2();
        arrayList.add(actionModifier);
        if (actionModifier != null) {
        }
        emittableImage2 = null;
        ExtractedSizeModifiers extractSizeAndCornerRadiusModifiers2 = extractSizeAndCornerRadiusModifiers(glanceModifier22);
        GlanceModifier sizeModifiers2 = extractSizeAndCornerRadiusModifiers2.getSizeModifiers();
        GlanceModifier nonSizeModifiers2 = extractSizeAndCornerRadiusModifiers2.getNonSizeModifiers();
        arrayList.add(sizeModifiers2);
        arrayList2.add(SizeModifiersKt.fillMaxSize(nonSizeModifiers2));
        if (emittable instanceof EmittableButton) {
        }
        EmittableBox emittableBox2 = new EmittableBox();
        emittableBox2.setModifier(collect(arrayList));
        if (z) {
        }
        if (emittableImage != null) {
        }
        List<Emittable> children2 = emittableBox2.getChildren();
        emittable.setModifier(collect(arrayList2));
        children2.add(emittable);
        if (emittableImage2 != null) {
        }
        return emittableBox2;
    }

    private static final void transformTree(EmittableWithChildren emittableWithChildren, Function1<? super Emittable, ? extends Emittable> function1) {
        int i = 0;
        for (Object obj : emittableWithChildren.getChildren()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Emittable invoke = function1.invoke((Emittable) obj);
            emittableWithChildren.getChildren().set(i, invoke);
            if (invoke instanceof EmittableWithChildren) {
                transformTree((EmittableWithChildren) invoke, function1);
            }
            i = i2;
        }
    }

    public static final Map<String, List<LambdaAction>> updateLambdaActionKeys(EmittableWithChildren emittableWithChildren) {
        List<Emittable> children = emittableWithChildren.getChildren();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : children) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Emittable emittable = (Emittable) obj;
            Pair<LambdaAction, GlanceModifier> extractLambdaAction = extractLambdaAction(emittable.getModifier());
            LambdaAction component1 = extractLambdaAction.component1();
            GlanceModifier component2 = extractLambdaAction.component2();
            if (component1 != null && !(emittable instanceof EmittableSizeBox) && !(emittable instanceof EmittableLazyItemWithChildren)) {
                String str = component1.getKey() + '+' + i;
                LambdaAction lambdaAction = new LambdaAction(str, component1.getBlock());
                Object obj2 = linkedHashMap.get(str);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(str, obj2);
                }
                ((List) obj2).add(lambdaAction);
                emittable.setModifier(component2.then(new ActionModifier(lambdaAction)));
            }
            if (emittable instanceof EmittableWithChildren) {
                for (Map.Entry<String, List<LambdaAction>> entry : updateLambdaActionKeys((EmittableWithChildren) emittable).entrySet()) {
                    String key = entry.getKey();
                    List<LambdaAction> value = entry.getValue();
                    Object obj3 = linkedHashMap.get(key);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(key, obj3);
                    }
                    ((List) obj3).addAll(value);
                }
            }
            i = i2;
        }
        return linkedHashMap;
    }

    private static final void warnIfMultipleClickableActions(GlanceModifier glanceModifier) {
        ((Number) glanceModifier.foldIn(0, new Function2<Integer, GlanceModifier.Element, Integer>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$warnIfMultipleClickableActions$actionCount$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, GlanceModifier.Element element) {
                return invoke(num.intValue(), element);
            }

            public final Integer invoke(int i, GlanceModifier.Element element) {
                if (element instanceof ActionModifier) {
                    i++;
                }
                return Integer.valueOf(i);
            }
        })).intValue();
    }
}
