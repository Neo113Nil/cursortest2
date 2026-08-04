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

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements InterfaceC0367x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E4.L f8274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F2.L0 f8275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0650x f8276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V.p f8277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0650x f8278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0646v f8279f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Y0.a(context);
        X0.a(getContext(), this);
        E4.L l7 = new E4.L(this);
        this.f8274a = l7;
        l7.q(attributeSet, i7);
        F2.L0 l8 = new F2.L0(this);
        this.f8275b = l8;
        l8.f(attributeSet, i7);
        l8.b();
        C0650x c0650x = new C0650x();
        c0650x.f8755b = this;
        this.f8276c = c0650x;
        this.f8277d = new V.p();
        C0650x c0650x2 = new C0650x(this);
        this.f8278e = c0650x2;
        c0650x2.b(attributeSet, i7);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = c0650x2.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private C0646v getSuperCaller() {
        if (this.f8279f == null) {
            this.f8279f = new C0646v(this);
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
        F2.L0 l8 = this.f8275b;
        if (l8 != null) {
            l8.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return p097n3.a.X(super.getCustomSelectionActionModeCallback());
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
        C0650x c0650x;
        if (Build.VERSION.SDK_INT >= 28 || (c0650x = this.f8276c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0650x.f8756c;
        return textClassifier == null ? L.a((TextView) c0650x.f8755b) : textClassifier;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b A[PHI: r1
      0x003b: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:23:0x0052, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i7;
        String[] strArrD;
        String[] stringArray;
        InputConnection eVar;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f8275b.getClass();
        F2.L0.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        p113p3.f.S(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && (i7 = Build.VERSION.SDK_INT) <= 30 && (strArrD = P.U.d(this)) != null) {
            U.c.a(editorInfo, strArrD);
            R5.F f7 = new R5.F(this, 4);
            if (i7 >= 25) {
                eVar = new U.d(inputConnectionOnCreateInputConnection, f7);
            } else {
                String[] strArr = U.c.f6370a;
                if (i7 >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                    if (stringArray != null) {
                        strArr = stringArray;
                    }
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                        if (stringArray != null) {
                            strArr = stringArray;
                        }
                    }
                }
                if (strArr.length != 0) {
                    eVar = new U.e(inputConnectionOnCreateInputConnection, f7);
                }
            }
            inputConnectionOnCreateInputConnection = eVar;
        }
        return this.f8278e.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
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
                zA = AbstractC0652y.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i7) {
        C0350f c0350f;
        InterfaceC0349e interfaceC0349e;
        int i8;
        p033e3.h hVar;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 31 || P.U.d(this) == null || !(i7 == 16908322 || i7 == 16908337)) {
            return super.onTextContextMenuItem(i7);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i9 >= 31) {
                hVar = new p033e3.h(primaryClip, 1);
            } else {
                c0350f = new C0350f();
                c0350f.f5056b = primaryClip;
                c0350f.f5057c = 1;
            }
            if (i7 == 16908322) {
                interfaceC0349e = c0350f;
                interfaceC0349e = hVar;
                i8 = 0;
            } else {
                interfaceC0349e = c0350f;
                interfaceC0349e = hVar;
                i8 = 1;
            }
            interfaceC0349e.A(i8);
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
        F2.L0 l7 = this.f8275b;
        if (l7 != null) {
            l7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        F2.L0 l7 = this.f8275b;
        if (l7 != null) {
            l7.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(p097n3.a.Y(callback, this));
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
        F2.L0 l7 = this.f8275b;
        l7.l(colorStateList);
        l7.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        F2.L0 l7 = this.f8275b;
        l7.m(mode);
        l7.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        F2.L0 l7 = this.f8275b;
        if (l7 != null) {
            l7.g(i7, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0650x c0650x;
        if (Build.VERSION.SDK_INT >= 28 || (c0650x = this.f8276c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0650x.f8756c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
