package org.betup.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.sdk.api.model.VKApiUserFull;
import io.sentry.Session;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: AdvancedRadioGroup.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\tJ$\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u000eH\u0016R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lorg/betup/ui/views/AdvancedRadioGroup;", "Landroid/widget/LinearLayout;", "Lorg/betup/ui/views/CheckedChangeListener;", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "checkableViews", "", "Lorg/betup/ui/views/ObservedCheckable;", "protectFromCheckedChange", "", "addView", "", VKApiUserFull.RelativeType.CHILD, "Landroid/view/View;", "index", "", "params", "Landroid/view/ViewGroup$LayoutParams;", "onCheckedChanged", "sender", "checked", "value", "checkedIndex", "getCheckedIndex", "()I", "setCheckedIndex", "(I)V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdvancedRadioGroup extends LinearLayout implements CheckedChangeListener {
    public static final int $stable = 8;
    private final List<ObservedCheckable> checkableViews;
    private boolean protectFromCheckedChange;

    public AdvancedRadioGroup(Context context) {
        super(context);
        this.checkableViews = new ArrayList();
    }

    public AdvancedRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.checkableViews = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        if (child instanceof ObservedCheckable) {
            ((ObservedCheckable) child).setCheckedChangeListener(this);
            this.checkableViews.add(child);
        }
        List<ObservedCheckable> list = this.checkableViews;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((ObservedCheckable) it.next()).isChecked()) {
                    return;
                }
            }
        }
        if (this.checkableViews.size() == 0) {
            return;
        }
        this.checkableViews.get(0).setChecked(true);
    }

    @Override // org.betup.ui.views.CheckedChangeListener
    public void onCheckedChanged(ObservedCheckable sender, boolean checked) {
        Intrinsics.checkNotNullParameter(sender, "sender");
        if (this.protectFromCheckedChange) {
            return;
        }
        this.protectFromCheckedChange = true;
        if (checked) {
            List<ObservedCheckable> list = this.checkableViews;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                ObservedCheckable observedCheckable = (ObservedCheckable) obj;
                if (observedCheckable.isChecked() && !Intrinsics.areEqual(observedCheckable, sender)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ObservedCheckable) it.next()).setChecked(false);
            }
        } else {
            sender.setChecked(true);
        }
        this.protectFromCheckedChange = false;
    }

    public final int getCheckedIndex() {
        Iterator<ObservedCheckable> it = this.checkableViews.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().isChecked()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void setCheckedIndex(int i) {
        this.checkableViews.get(i).setChecked(true);
    }
}
