package androidx.glance.appwidget.translators;

import android.graphics.Color;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.AndroidResourceImageProvider;
import androidx.glance.BitmapImageProvider;
import androidx.glance.ColorFilterParams;
import androidx.glance.EmittableImage;
import androidx.glance.GlanceModifier;
import androidx.glance.IconImageProvider;
import androidx.glance.ImageKt;
import androidx.glance.ImageProvider;
import androidx.glance.TintColorFilterParams;
import androidx.glance.appwidget.ApplyModifiersKt;
import androidx.glance.appwidget.InsertedViewInfo;
import androidx.glance.appwidget.LayoutSelectionKt;
import androidx.glance.appwidget.LayoutType;
import androidx.glance.appwidget.TintAndAlphaColorFilterParams;
import androidx.glance.appwidget.TranslationContext;
import androidx.glance.appwidget.UriImageProvider;
import androidx.glance.layout.ContentScale;
import androidx.glance.layout.HeightModifier;
import androidx.glance.layout.WidthModifier;
import androidx.glance.unit.ColorProvider;
import androidx.glance.unit.Dimension;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a \u0010\n\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0002\u001a1\u0010\u0012\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001c\u0010\u0018\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0011H\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"applyColorFilter", "", "translationContext", "Landroidx/glance/appwidget/TranslationContext;", "rv", "Landroid/widget/RemoteViews;", "colorFilterParams", "Landroidx/glance/ColorFilterParams;", "viewDef", "Landroidx/glance/appwidget/InsertedViewInfo;", "setImageViewIcon", "viewId", "", "provider", "Landroidx/glance/IconImageProvider;", "getLayoutSelector", "Landroidx/glance/appwidget/LayoutType;", "Landroidx/glance/EmittableImage;", "setImageViewColorFilter", "notNight", "Landroidx/compose/ui/graphics/Color;", "night", "setImageViewColorFilter-0YGnOg8", "(Landroid/widget/RemoteViews;IJJ)V", "translateEmittableImage", "element", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImageTranslator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageTranslator.kt\nandroidx/glance/appwidget/translators/ImageTranslatorKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Utils.kt\nandroidx/glance/UtilsKt\n*L\n1#1,203:1\n1#2:204\n23#3,7:205\n23#3,7:212\n*S KotlinDebug\n*F\n+ 1 ImageTranslator.kt\nandroidx/glance/appwidget/translators/ImageTranslatorKt\n*L\n80#1:205,7\n81#1:212,7\n*E\n"})
/* loaded from: classes.dex */
public final class ImageTranslatorKt {
    private static final void applyColorFilter(TranslationContext translationContext, RemoteViews remoteViews, ColorFilterParams colorFilterParams, InsertedViewInfo insertedViewInfo) {
        if (colorFilterParams instanceof TintColorFilterParams) {
            ColorProvider colorProvider = ((TintColorFilterParams) colorFilterParams).getColorProvider();
            if (Build.VERSION.SDK_INT >= 31) {
                ImageTranslatorApi31Impl.INSTANCE.applyTintColorFilter(translationContext, remoteViews, colorProvider, insertedViewInfo.getMainViewId());
                return;
            } else {
                RemoteViewsCompat.setImageViewColorFilter(remoteViews, insertedViewInfo.getMainViewId(), ColorKt.m562toArgb8_81llA(colorProvider.mo1356getColorvNxB06k(translationContext.getContext())));
                return;
            }
        }
        if (!(colorFilterParams instanceof TintAndAlphaColorFilterParams)) {
            throw new IllegalArgumentException("An unsupported ColorFilter was used.");
        }
        if (Build.VERSION.SDK_INT > 30) {
            throw new IllegalStateException("There is no use case yet to support this colorFilter in S+ versions.");
        }
        int m562toArgb8_81llA = ColorKt.m562toArgb8_81llA(((TintAndAlphaColorFilterParams) colorFilterParams).getColorProvider().mo1356getColorvNxB06k(translationContext.getContext()));
        RemoteViewsCompat.setImageViewColorFilter(remoteViews, insertedViewInfo.getMainViewId(), m562toArgb8_81llA);
        RemoteViewsCompat.setImageViewImageAlpha(remoteViews, insertedViewInfo.getMainViewId(), Color.alpha(m562toArgb8_81llA));
    }

    private static final LayoutType getLayoutSelector(EmittableImage emittableImage) {
        boolean isDecorative = ImageKt.isDecorative(emittableImage);
        int contentScale = emittableImage.getContentScale();
        ContentScale.Companion companion = ContentScale.INSTANCE;
        if (ContentScale.m1395equalsimpl0(contentScale, companion.m1399getCropAe3V0ko())) {
            return isDecorative ? LayoutType.ImageCropDecorative : LayoutType.ImageCrop;
        }
        if (ContentScale.m1395equalsimpl0(contentScale, companion.m1401getFitAe3V0ko())) {
            return isDecorative ? LayoutType.ImageFitDecorative : LayoutType.ImageFit;
        }
        if (ContentScale.m1395equalsimpl0(contentScale, companion.m1400getFillBoundsAe3V0ko())) {
            return isDecorative ? LayoutType.ImageFillBoundsDecorative : LayoutType.ImageFillBounds;
        }
        ContentScale.m1397toStringimpl(emittableImage.getContentScale());
        return LayoutType.ImageFit;
    }

    @RequiresApi(31)
    /* renamed from: setImageViewColorFilter-0YGnOg8, reason: not valid java name */
    public static final void m1347setImageViewColorFilter0YGnOg8(RemoteViews remoteViews, int i, long j, long j2) {
        RemoteViewsCompat.setImageViewColorFilter(remoteViews, i, ColorKt.m562toArgb8_81llA(j), ColorKt.m562toArgb8_81llA(j2));
    }

    private static final void setImageViewIcon(RemoteViews remoteViews, int i, IconImageProvider iconImageProvider) {
        ImageTranslatorApi23Impl.INSTANCE.setImageViewIcon(remoteViews, i, iconImageProvider.getIcon());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a6, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4 != null ? r4.getHeight() : null, r1) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void translateEmittableImage(RemoteViews remoteViews, TranslationContext translationContext, EmittableImage emittableImage) {
        boolean z;
        InsertedViewInfo insertView = LayoutSelectionKt.insertView(remoteViews, translationContext, getLayoutSelector(emittableImage), emittableImage.getModifier());
        ImageProvider provider = emittableImage.getProvider();
        if (provider instanceof AndroidResourceImageProvider) {
            remoteViews.setImageViewResource(insertView.getMainViewId(), ((AndroidResourceImageProvider) provider).getResId());
        } else if (provider instanceof BitmapImageProvider) {
            remoteViews.setImageViewBitmap(insertView.getMainViewId(), ((BitmapImageProvider) provider).getBitmap());
        } else if (provider instanceof UriImageProvider) {
            remoteViews.setImageViewUri(insertView.getMainViewId(), ((UriImageProvider) provider).getUri());
        } else {
            if (!(provider instanceof IconImageProvider)) {
                throw new IllegalArgumentException("An unsupported ImageProvider type was used.");
            }
            setImageViewIcon(remoteViews, insertView.getMainViewId(), (IconImageProvider) provider);
        }
        ColorFilterParams colorFilterParams = emittableImage.getColorFilterParams();
        if (colorFilterParams != null) {
            applyColorFilter(translationContext, remoteViews, colorFilterParams, insertView);
        }
        ApplyModifiersKt.applyModifiers(translationContext, remoteViews, emittableImage.getModifier(), insertView);
        if (ContentScale.m1395equalsimpl0(emittableImage.getContentScale(), ContentScale.INSTANCE.m1401getFitAe3V0ko())) {
            WidthModifier widthModifier = (WidthModifier) emittableImage.getModifier().foldIn(null, new Function2<WidthModifier, GlanceModifier.Element, WidthModifier>() { // from class: androidx.glance.appwidget.translators.ImageTranslatorKt$translateEmittableImage$$inlined$findModifier$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final WidthModifier invoke(WidthModifier widthModifier2, GlanceModifier.Element element) {
                    return element instanceof WidthModifier ? element : widthModifier2;
                }
            });
            Dimension width = widthModifier != null ? widthModifier.getWidth() : null;
            Dimension.Wrap wrap = Dimension.Wrap.INSTANCE;
            if (!Intrinsics.areEqual(width, wrap)) {
                HeightModifier heightModifier = (HeightModifier) emittableImage.getModifier().foldIn(null, new Function2<HeightModifier, GlanceModifier.Element, HeightModifier>() { // from class: androidx.glance.appwidget.translators.ImageTranslatorKt$translateEmittableImage$$inlined$findModifier$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function2
                    public final HeightModifier invoke(HeightModifier heightModifier2, GlanceModifier.Element element) {
                        return element instanceof HeightModifier ? element : heightModifier2;
                    }
                });
            }
            z = true;
            RemoteViewsCompat.setImageViewAdjustViewBounds(remoteViews, insertView.getMainViewId(), z);
        }
        z = false;
        RemoteViewsCompat.setImageViewAdjustViewBounds(remoteViews, insertView.getMainViewId(), z);
    }
}
