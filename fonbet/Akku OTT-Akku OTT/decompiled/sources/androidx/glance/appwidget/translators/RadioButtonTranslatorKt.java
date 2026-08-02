package androidx.glance.appwidget.translators;

import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.appwidget.ApplyModifiersKt;
import androidx.glance.appwidget.EmittableRadioButton;
import androidx.glance.appwidget.InsertedViewInfo;
import androidx.glance.appwidget.LayoutSelectionKt;
import androidx.glance.appwidget.LayoutType;
import androidx.glance.appwidget.R;
import androidx.glance.appwidget.TranslationContext;
import androidx.glance.appwidget.UtilsKt;
import androidx.glance.appwidget.unit.CheckableColorProvider;
import androidx.glance.appwidget.unit.CheckedUncheckedColorProvider;
import androidx.glance.appwidget.unit.ResourceCheckableColorProvider;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"translateEmittableRadioButton", "", "Landroid/widget/RemoteViews;", "translationContext", "Landroidx/glance/appwidget/TranslationContext;", "element", "Landroidx/glance/appwidget/EmittableRadioButton;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RadioButtonTranslatorKt {
    public static final void translateEmittableRadioButton(RemoteViews remoteViews, TranslationContext translationContext, EmittableRadioButton emittableRadioButton) {
        RemoteViews remoteViews2;
        TranslationContext translationContext2;
        int inflateViewStub$default;
        int i = Build.VERSION.SDK_INT;
        LayoutType layoutType = i >= 31 ? LayoutType.RadioButton : LayoutType.RadioButtonBackport;
        Context context = translationContext.getContext();
        InsertedViewInfo insertView = LayoutSelectionKt.insertView(remoteViews, translationContext, layoutType, emittableRadioButton.getModifier());
        if (i >= 31) {
            inflateViewStub$default = insertView.getMainViewId();
            CompoundButtonApi31Impl.INSTANCE.setCompoundButtonChecked(remoteViews, insertView.getMainViewId(), emittableRadioButton.getChecked());
            CheckableColorProvider radio = emittableRadioButton.getColors().getRadio();
            if (radio instanceof CheckedUncheckedColorProvider) {
                DayNightColorStateList dayNightColorStateList = CompoundButtonTranslatorKt.toDayNightColorStateList((CheckedUncheckedColorProvider) radio, context);
                RemoteViewsCompat.setCompoundButtonTintList(remoteViews, insertView.getMainViewId(), dayNightColorStateList.getDay(), dayNightColorStateList.getNight());
            } else if (radio instanceof ResourceCheckableColorProvider) {
                RemoteViewsCompat.setCompoundButtonTintList(remoteViews, insertView.getMainViewId(), ((ResourceCheckableColorProvider) radio).getResId());
            }
            remoteViews2 = remoteViews;
            translationContext2 = translationContext;
        } else {
            remoteViews2 = remoteViews;
            translationContext2 = translationContext;
            inflateViewStub$default = UtilsKt.inflateViewStub$default(remoteViews2, translationContext2, R.id.radioText, 0, null, 12, null);
            int inflateViewStub$default2 = UtilsKt.inflateViewStub$default(remoteViews2, translationContext2, R.id.radioIcon, 0, null, 12, null);
            UtilsKt.setViewEnabled(remoteViews2, inflateViewStub$default2, emittableRadioButton.getChecked());
            CompoundButtonTranslatorKt.m1346setImageViewColorFiltermxwnekA(remoteViews2, inflateViewStub$default2, CompoundButtonTranslatorKt.getColor(emittableRadioButton.getColors().getRadio(), context, emittableRadioButton.getChecked()));
        }
        TextTranslatorKt.setText(remoteViews2, translationContext2, inflateViewStub$default, emittableRadioButton.getText(), emittableRadioButton.getStyle(), emittableRadioButton.getMaxLines(), 16);
        remoteViews2.setBoolean(insertView.getMainViewId(), "setEnabled", emittableRadioButton.getEnabled());
        ApplyModifiersKt.applyModifiers(translationContext2, remoteViews2, emittableRadioButton.getModifier(), insertView);
    }
}
