package androidx.glance.appwidget.translators;

import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.appwidget.ApplyModifiersKt;
import androidx.glance.appwidget.EmittableSwitch;
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

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"translateEmittableSwitch", "", "Landroid/widget/RemoteViews;", "translationContext", "Landroidx/glance/appwidget/TranslationContext;", "element", "Landroidx/glance/appwidget/EmittableSwitch;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSwitchTranslator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwitchTranslator.kt\nandroidx/glance/appwidget/translators/SwitchTranslatorKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
/* loaded from: classes.dex */
public final class SwitchTranslatorKt {
    public static final void translateEmittableSwitch(RemoteViews remoteViews, TranslationContext translationContext, EmittableSwitch emittableSwitch) {
        RemoteViews remoteViews2;
        TranslationContext translationContext2;
        int inflateViewStub$default;
        int i = Build.VERSION.SDK_INT;
        LayoutType layoutType = i >= 31 ? LayoutType.Swtch : LayoutType.SwtchBackport;
        Context context = translationContext.getContext();
        InsertedViewInfo insertView = LayoutSelectionKt.insertView(remoteViews, translationContext, layoutType, emittableSwitch.getModifier());
        if (i >= 31) {
            inflateViewStub$default = insertView.getMainViewId();
            CompoundButtonApi31Impl.INSTANCE.setCompoundButtonChecked(remoteViews, insertView.getMainViewId(), emittableSwitch.getChecked());
            CheckableColorProvider thumb$glance_appwidget_release = emittableSwitch.getColors().getThumb$glance_appwidget_release();
            if (thumb$glance_appwidget_release instanceof CheckedUncheckedColorProvider) {
                DayNightColorStateList dayNightColorStateList = CompoundButtonTranslatorKt.toDayNightColorStateList((CheckedUncheckedColorProvider) thumb$glance_appwidget_release, context);
                RemoteViewsCompat.setSwitchThumbTintList(remoteViews, insertView.getMainViewId(), dayNightColorStateList.getDay(), dayNightColorStateList.getNight());
            } else {
                if (!(thumb$glance_appwidget_release instanceof ResourceCheckableColorProvider)) {
                    throw new NoWhenBranchMatchedException();
                }
                RemoteViewsCompat.setSwitchThumbTintList(remoteViews, insertView.getMainViewId(), ((ResourceCheckableColorProvider) thumb$glance_appwidget_release).getResId());
            }
            Unit unit = Unit.INSTANCE;
            CheckableColorProvider track$glance_appwidget_release = emittableSwitch.getColors().getTrack$glance_appwidget_release();
            if (track$glance_appwidget_release instanceof CheckedUncheckedColorProvider) {
                DayNightColorStateList dayNightColorStateList2 = CompoundButtonTranslatorKt.toDayNightColorStateList((CheckedUncheckedColorProvider) track$glance_appwidget_release, context);
                RemoteViewsCompat.setSwitchTrackTintList(remoteViews, insertView.getMainViewId(), dayNightColorStateList2.getDay(), dayNightColorStateList2.getNight());
            } else {
                if (!(track$glance_appwidget_release instanceof ResourceCheckableColorProvider)) {
                    throw new NoWhenBranchMatchedException();
                }
                RemoteViewsCompat.setSwitchTrackTintList(remoteViews, insertView.getMainViewId(), ((ResourceCheckableColorProvider) track$glance_appwidget_release).getResId());
            }
            remoteViews2 = remoteViews;
            translationContext2 = translationContext;
        } else {
            remoteViews2 = remoteViews;
            translationContext2 = translationContext;
            inflateViewStub$default = UtilsKt.inflateViewStub$default(remoteViews2, translationContext2, R.id.switchText, 0, null, 12, null);
            int inflateViewStub$default2 = UtilsKt.inflateViewStub$default(remoteViews2, translationContext2, R.id.switchThumb, 0, null, 12, null);
            int inflateViewStub$default3 = UtilsKt.inflateViewStub$default(remoteViews2, translationContext2, R.id.switchTrack, 0, null, 12, null);
            UtilsKt.setViewEnabled(remoteViews2, inflateViewStub$default2, emittableSwitch.getChecked());
            UtilsKt.setViewEnabled(remoteViews2, inflateViewStub$default3, emittableSwitch.getChecked());
            CompoundButtonTranslatorKt.m1346setImageViewColorFiltermxwnekA(remoteViews2, inflateViewStub$default2, CompoundButtonTranslatorKt.getColor(emittableSwitch.getColors().getThumb$glance_appwidget_release(), context, emittableSwitch.getChecked()));
            CompoundButtonTranslatorKt.m1346setImageViewColorFiltermxwnekA(remoteViews2, inflateViewStub$default3, CompoundButtonTranslatorKt.getColor(emittableSwitch.getColors().getTrack$glance_appwidget_release(), context, emittableSwitch.getChecked()));
        }
        TextTranslatorKt.setText(remoteViews2, translationContext2, inflateViewStub$default, emittableSwitch.getText(), emittableSwitch.getStyle(), emittableSwitch.getMaxLines(), 16);
        ApplyModifiersKt.applyModifiers(translationContext2, remoteViews2, emittableSwitch.getModifier(), insertView);
    }
}
