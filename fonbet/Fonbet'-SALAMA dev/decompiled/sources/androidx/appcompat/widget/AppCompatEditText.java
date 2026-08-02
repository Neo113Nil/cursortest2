package androidx.appcompat.widget;

import P.C0350f;
import P.C0352h;
import P.InterfaceC0349e;
import P.InterfaceC0367x;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import e3.C1023h;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements InterfaceC0367x {

    /* renamed from: a, reason: collision with root package name */
    public final E4.L f8274a;

    /* renamed from: b, reason: collision with root package name */
    public final F2.L0 f8275b;

    /* renamed from: c, reason: collision with root package name */
    public final C0671x f8276c;

    /* renamed from: d, reason: collision with root package name */
    public final V.p f8277d;

    /* renamed from: e, reason: collision with root package name */
    public final C0671x f8278e;

    /* renamed from: f, reason: collision with root package name */
    public C0667v f8279f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Y0.a(context);
        X0.a(getContext(), this);
        E4.L l7 = new E4.L(this);
        this.f8274a = l7;
        l7.q(attributeSet, i7);
        F2.L0 l02 = new F2.L0(this);
        this.f8275b = l02;
        l02.f(attributeSet, i7);
        l02.b();
        C0671x c0671x = new C0671x();
        c0671x.f8755b = this;
        this.f8276c = c0671x;
        this.f8277d = new V.p();
        C0671x c0671x2 = new C0671x(this);
        this.f8278e = c0671x2;
        c0671x2.b(attributeSet, i7);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a2 = c0671x2.a(keyListener);
        if (a2 == keyListener) {
            return;
        }
        super.setKeyListener(a2);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private C0667v getSuperCaller() {
        if (this.f8279f == null) {
            this.f8279f = new C0667v(this);
        }
        return this.f8279f;
    }

    @Override // P.InterfaceC0367x
    public final C0352h a(C0352h c0352h) {
        return this.f8277d.a(this, c0352h);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        E4.L l7 = this.f8274a;
        if (l7 != null) {
            l7.l();
        }
        F2.L0 l02 = this.f8275b;
        if (l02 != null) {
            l02.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC1464a.X(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        E4.L l7 = this.f8274a;
        if (l7 != null) {
            return l7.n();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        E4.L l7 = this.f8274a;
        if (l7 != null) {
            return l7.o();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8275b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8275b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0671x c0671x;
        if (Build.VERSION.SDK_INT >= 28 || (c0671x = this.f8276c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0671x.f8756c;
        return textClassifier == null ? L.a((TextView) c0671x.f8755b) : textClassifier;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r1 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r1 != null) goto L16;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i7;
        String[] d7;
        String[] stringArray;
        InputConnection eVar;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f8275b.getClass();
        F2.L0.h(editorInfo, onCreateInputConnection, this);
        p3.f.S(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && (i7 = Build.VERSION.SDK_INT) <= 30 && (d7 = P.U.d(this)) != null) {
            U.c.a(editorInfo, d7);
            R5.F f7 = new R5.F(this, 4);
            if (i7 >= 25) {
                eVar = new U.d(onCreateInputConnection, f7);
            } else {
                String[] strArr = U.c.f6370a;
                if (i7 >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                    }
                    if (strArr.length != 0) {
                        eVar = new U.e(onCreateInputConnection, f7);
                    }
                }
            }
            onCreateInputConnection = eVar;
        }
        return this.f8278e.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z4 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && P.U.d(this) != null) {
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
                z4 = AbstractC0673y.a(dragEvent, this, activity);
            }
        }
        if (z4) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i7) {
        InterfaceC0349e interfaceC0349e;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 31 || P.U.d(this) == null || !(i7 == 16908322 || i7 == 16908337)) {
            return super.onTextContextMenuItem(i7);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i8 >= 31) {
                interfaceC0349e = new C1023h(primaryClip, 1);
            } else {
                C0350f c0350f = new C0350f();
                c0350f.f5056b = primaryClip;
                c0350f.f5057c = 1;
                interfaceC0349e = c0350f;
            }
            interfaceC0349e.A(i7 == 16908322 ? 0 : 1);
            P.U.f(this, interfaceC0349e.b());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        E4.L l7 = this.f8274a;
        if (l7 != null) {
            l7.r();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        E4.L l7 = this.f8274a;
        if (l7 != null) {
            l7.s(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        F2.L0 l02 = this.f8275b;
        if (l02 != null) {
            l02.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        F2.L0 l02 = this.f8275b;
        if (l02 != null) {
            l02.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1464a.Y(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        this.f8278e.d(z4);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f8278e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        E4.L l7 = this.f8274a;
        if (l7 != null) {
            l7.v(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        E4.L l7 = this.f8274a;
        if (l7 != null) {
            l7.w(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        F2.L0 l02 = this.f8275b;
        l02.l(colorStateList);
        l02.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        F2.L0 l02 = this.f8275b;
        l02.m(mode);
        l02.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        F2.L0 l02 = this.f8275b;
        if (l02 != null) {
            l02.g(i7, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0671x c0671x;
        if (Build.VERSION.SDK_INT >= 28 || (c0671x = this.f8276c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0671x.f8756c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
