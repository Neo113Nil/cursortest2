package androidx.glance.appwidget.translators;

import android.content.res.ColorStateList;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.appwidget.ApplyModifiersKt;
import androidx.glance.appwidget.EmittableCircularProgressIndicator;
import androidx.glance.appwidget.InsertedViewInfo;
import androidx.glance.appwidget.LayoutSelectionKt;
import androidx.glance.appwidget.LayoutType;
import androidx.glance.appwidget.TranslationContext;
import androidx.glance.color.DayNightColorProvider;
import androidx.glance.unit.ColorProvider;
import androidx.glance.unit.FixedColorProvider;
import androidx.glance.unit.ResourceColorProvider;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"translateEmittableCircularProgressIndicator", "", "Landroid/widget/RemoteViews;", "translationContext", "Landroidx/glance/appwidget/TranslationContext;", "element", "Landroidx/glance/appwidget/EmittableCircularProgressIndicator;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CircularProgressIndicatorTranslatorKt {
    public static final void translateEmittableCircularProgressIndicator(RemoteViews remoteViews, TranslationContext translationContext, EmittableCircularProgressIndicator emittableCircularProgressIndicator) {
        InsertedViewInfo insertView = LayoutSelectionKt.insertView(remoteViews, translationContext, LayoutType.CircularProgressIndicator, emittableCircularProgressIndicator.getModifier());
        remoteViews.setProgressBar(insertView.getMainViewId(), 0, 0, true);
        if (Build.VERSION.SDK_INT >= 31) {
            ColorProvider color = emittableCircularProgressIndicator.getColor();
            if (color instanceof FixedColorProvider) {
                RemoteViewsCompat.setProgressBarIndeterminateTintList(remoteViews, insertView.getMainViewId(), ColorStateList.valueOf(ColorKt.m562toArgb8_81llA(((FixedColorProvider) color).m1510getColor0d7_KjU())));
            } else if (color instanceof ResourceColorProvider) {
                RemoteViewsCompat.setProgressBarIndeterminateTintList(remoteViews, insertView.getMainViewId(), ((ResourceColorProvider) color).getResId());
            } else if (color instanceof DayNightColorProvider) {
                DayNightColorProvider dayNightColorProvider = (DayNightColorProvider) color;
                RemoteViewsCompat.setProgressBarIndeterminateTintList(remoteViews, insertView.getMainViewId(), ColorStateList.valueOf(ColorKt.m562toArgb8_81llA(dayNightColorProvider.m1358getDay0d7_KjU())), ColorStateList.valueOf(ColorKt.m562toArgb8_81llA(dayNightColorProvider.m1359getNight0d7_KjU())));
            } else {
                Objects.toString(color);
            }
        }
        ApplyModifiersKt.applyModifiers(translationContext, remoteViews, emittableCircularProgressIndicator.getModifier(), insertView);
    }
}
