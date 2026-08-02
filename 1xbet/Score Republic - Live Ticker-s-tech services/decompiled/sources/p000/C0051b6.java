package p000;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: b6 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0051b6 extends EditText implements nu0 {

    /* JADX INFO: renamed from: j */
    public final C0864x4 f728j;

    /* JADX INFO: renamed from: k */
    public final C0164e7 f729k;

    /* JADX INFO: renamed from: l */
    public final yc1 f730l;

    /* JADX INFO: renamed from: m */
    public final C0312i6 f731m;

    /* JADX INFO: renamed from: n */
    public C0007a6 f732n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0051b6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        md1.m3376a(context);
        zc1.m5876a(this, getContext());
        C0864x4 c0864x4 = new C0864x4(this);
        this.f728j = c0864x4;
        c0864x4.m5518d(attributeSet, R.attr.editTextStyle);
        C0164e7 c0164e7 = new C0164e7(this);
        this.f729k = c0164e7;
        c0164e7.m1379f(attributeSet, R.attr.editTextStyle);
        c0164e7.m1376b();
        this.f730l = new yc1();
        C0312i6 c0312i6 = new C0312i6(this, 8);
        this.f731m = c0312i6;
        c0312i6.mo2544o(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerM2542m = c0312i6.m2542m(keyListener);
        if (keyListenerM2542m == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM2542m);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    private C0007a6 getSuperCaller() {
        if (this.f732n == null) {
            this.f732n = new C0007a6(this);
        }
        return this.f732n;
    }

    @Override // p000.nu0
    /* JADX INFO: renamed from: a */
    public final C0549om mo596a(C0549om c0549om) {
        this.f730l.getClass();
        return yc1.m5755a(this, c0549om);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0864x4 c0864x4 = this.f728j;
        if (c0864x4 != null) {
            c0864x4.m5515a();
        }
        C0164e7 c0164e7 = this.f729k;
        if (c0164e7 != null) {
            c0164e7.m1376b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0864x4 c0864x4 = this.f728j;
        if (c0864x4 != null) {
            return c0864x4.m5516b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0864x4 c0864x4 = this.f728j;
        if (c0864x4 != null) {
            return c0864x4.m5517c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f729k.m1377d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f729k.m1378e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM250c;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f729k.getClass();
        C0164e7.m1374h(editorInfo, inputConnectionOnCreateInputConnection, this);
        vt1.m5195g(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (strArrM250c = ai1.m250c(this)) != null) {
            editorInfo.contentMimeTypes = strArrM250c;
            inputConnectionOnCreateInputConnection = new ud0(inputConnectionOnCreateInputConnection, new C0468mf(7, this));
        }
        return this.f731m.m2545p(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zM3181a = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && ai1.m250c(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zM3181a = AbstractC0422l6.m3181a(dragEvent, this, activity);
            }
        }
        if (zM3181a) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        C0475mm c0475mm;
        InterfaceC0438lm interfaceC0438lm;
        int i2;
        C0401km c0401km;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || ai1.m250c(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                c0401km = new C0401km(primaryClip, 1);
            } else {
                c0475mm = new C0475mm();
                c0475mm.f5090b = primaryClip;
                c0475mm.f5091c = 1;
            }
            if (i == 16908322) {
                interfaceC0438lm = c0475mm;
                interfaceC0438lm = c0401km;
                i2 = 0;
            } else {
                interfaceC0438lm = c0475mm;
                interfaceC0438lm = c0401km;
                i2 = 1;
            }
            interfaceC0438lm.mo3054f(i2);
            ai1.m251d(this, interfaceC0438lm.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0864x4 c0864x4 = this.f728j;
        if (c0864x4 != null) {
            c0864x4.m5519e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0864x4 c0864x4 = this.f728j;
        if (c0864x4 != null) {
            c0864x4.m5520f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0164e7 c0164e7 = this.f729k;
        if (c0164e7 != null) {
            c0164e7.m1376b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0164e7 c0164e7 = this.f729k;
        if (c0164e7 != null) {
            c0164e7.m1376b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f731m.m2554z(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f731m.m2542m(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0864x4 c0864x4 = this.f728j;
        if (c0864x4 != null) {
            c0864x4.m5522h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0864x4 c0864x4 = this.f728j;
        if (c0864x4 != null) {
            c0864x4.m5523i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0164e7 c0164e7 = this.f729k;
        c0164e7.m1381i(colorStateList);
        c0164e7.m1376b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0164e7 c0164e7 = this.f729k;
        c0164e7.m1382j(mode);
        c0164e7.m1376b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0164e7 c0164e7 = this.f729k;
        if (c0164e7 != null) {
            c0164e7.m1380g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }
}
