package androidx.glance.appwidget.translators;

import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.appwidget.ApplyModifiersKt;
import androidx.glance.appwidget.EmittableCheckBox;
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
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"translateEmittableCheckBox", "", "Landroid/widget/RemoteViews;", "translationContext", "Landroidx/glance/appwidget/TranslationContext;", "element", "Landroidx/glance/appwidget/EmittableCheckBox;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCheckBoxTranslator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckBoxTranslator.kt\nandroidx/glance/appwidget/translators/CheckBoxTranslatorKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1#2:92\n*E\n"})
/* loaded from: classes.dex */
public final class CheckBoxTranslatorKt {
    public static final void translateEmittableCheckBox(RemoteViews remoteViews, TranslationContext translationContext, EmittableCheckBox emittableCheckBox) {
        RemoteViews remoteViews2;
        TranslationContext translationContext2;
        int i;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        InsertedViewInfo insertView = LayoutSelectionKt.insertView(remoteViews, translationContext, i3 >= 31 ? LayoutType.CheckBox : LayoutType.CheckBoxBackport, emittableCheckBox.getModifier());
        if (i3 >= 31) {
            remoteViews2 = remoteViews;
            translationContext2 = translationContext;
            i2 = UtilsKt.inflateViewStub$default(remoteViews2, translationContext2, R.id.checkBox, 0, null, 12, null);
            CompoundButtonApi31Impl.INSTANCE.setCompoundButtonChecked(remoteViews2, i2, emittableCheckBox.getChecked());
            CheckableColorProvider checkBox$glance_appwidget_release = emittableCheckBox.getColors().getCheckBox$glance_appwidget_release();
            if (checkBox$glance_appwidget_release instanceof CheckedUncheckedColorProvider) {
                DayNightColorStateList dayNightColorStateList = CompoundButtonTranslatorKt.toDayNightColorStateList((CheckedUncheckedColorProvider) checkBox$glance_appwidget_release, translationContext2.getContext());
                RemoteViewsCompat.setCompoundButtonTintList(remoteViews2, i2, dayNightColorStateList.getDay(), dayNightColorStateList.getNight());
            } else {
                if (!(checkBox$glance_appwidget_release instanceof ResourceCheckableColorProvider)) {
                    throw new NoWhenBranchMatchedException();
                }
                RemoteViewsCompat.setCompoundButtonTintList(remoteViews2, i2, ((ResourceCheckableColorProvider) checkBox$glance_appwidget_release).getResId());
            }
            Unit unit = Unit.INSTANCE;
            i = i2;
        } else {
            remoteViews2 = remoteViews;
            translationContext2 = translationContext;
            int inflateViewStub$default = UtilsKt.inflateViewStub$default(remoteViews2, translationContext2, R.id.checkBoxIcon, 0, null, 12, null);
            int inflateViewStub$default2 = UtilsKt.inflateViewStub$default(remoteViews2, translationContext2, R.id.checkBoxText, 0, null, 12, null);
            int mainViewId = insertView.getMainViewId();
            UtilsKt.setViewEnabled(remoteViews2, inflateViewStub$default, emittableCheckBox.getChecked());
            CompoundButtonTranslatorKt.m1346setImageViewColorFiltermxwnekA(remoteViews2, inflateViewStub$default, CompoundButtonTranslatorKt.getColor(emittableCheckBox.getColors().getCheckBox$glance_appwidget_release(), translationContext2.getContext(), emittableCheckBox.getChecked()));
            i = inflateViewStub$default2;
            i2 = mainViewId;
        }
        TextTranslatorKt.setText(remoteViews2, translationContext2, i, emittableCheckBox.getText(), emittableCheckBox.getStyle(), emittableCheckBox.getMaxLines(), 16);
        ApplyModifiersKt.applyModifiers(translationContext2.forActionTargetId(i2), remoteViews2, emittableCheckBox.getModifier(), insertView);
    }
}
