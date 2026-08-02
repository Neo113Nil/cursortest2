package org.betup.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import io.sentry.Session;
import kotlin.Metadata;
import org.betup.utils.TouchHelper;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: CheckableAlphaPressButton.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\tB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\fJ\b\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u000eH\u0016J\b\u0010\u001f\u001a\u00020\u0017H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lorg/betup/ui/views/CheckableAlphaPressButton;", "Lorg/betup/ui/views/AlphaPressButton;", "Lorg/betup/ui/views/ObservedCheckable;", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttrs", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "checked", "", "checkedChangeListener", "Lorg/betup/ui/views/CheckedChangeListener;", "getCheckedChangeListener", "()Lorg/betup/ui/views/CheckedChangeListener;", "setCheckedChangeListener", "(Lorg/betup/ui/views/CheckedChangeListener;)V", "isChecked", "toggle", "", "setChecked", "onTouch", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "performClick", "updateState", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckableAlphaPressButton extends AlphaPressButton implements ObservedCheckable {
    public static final int $stable = 8;
    private boolean checked;
    private CheckedChangeListener checkedChangeListener;

    public CheckableAlphaPressButton(Context context) {
        super(context);
        setAlpha(0.4f);
    }

    public CheckableAlphaPressButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setAlpha(0.4f);
    }

    public CheckableAlphaPressButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setAlpha(0.4f);
    }

    @Override // org.betup.ui.views.ObservedCheckable
    public CheckedChangeListener getCheckedChangeListener() {
        return this.checkedChangeListener;
    }

    @Override // org.betup.ui.views.ObservedCheckable
    public void setCheckedChangeListener(CheckedChangeListener checkedChangeListener) {
        this.checkedChangeListener = checkedChangeListener;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.checked;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.checked);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        if (this.checked != checked) {
            this.checked = checked;
            updateState();
            CheckedChangeListener checkedChangeListener = getCheckedChangeListener();
            if (checkedChangeListener != null) {
                checkedChangeListener.onCheckedChanged(this, checked);
            }
        }
    }

    @Override // org.betup.ui.views.AlphaPressButton, android.view.View.OnTouchListener
    public boolean onTouch(View v, MotionEvent event) {
        if (this.checked) {
            return super.onTouch(v, event);
        }
        if (event != null && event.getAction() == 1 && TouchHelper.isTouchWithinBounds(event, v)) {
            performClick();
        }
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean performClick = super.performClick();
        toggle();
        return performClick;
    }

    private final void updateState() {
        setAlpha(this.checked ? 1.0f : 0.4f);
    }
}
