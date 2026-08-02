package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.core.view.C5311d;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements androidx.core.view.F, J {

    @NonNull
    private final C5065j mAppCompatEmojiEditTextHelper;
    private final C5060e mBackgroundTintHelper;
    private final androidx.core.widget.l mDefaultOnReceiveContentListener;
    private a mSuperCaller;
    private final C5079y mTextClassifierHelper;
    private final C5080z mTextHelper;

    /* loaded from: classes8.dex */
    class a {
        a() {
        }

        public final TextClassifier a() {
            return AppCompatEditText.super.getTextClassifier();
        }

        public final void b(TextClassifier textClassifier) {
            AppCompatEditText.super.setTextClassifier(textClassifier);
        }
    }

    public AppCompatEditText(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private a getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new a();
        }
        return this.mSuperCaller;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C5060e c5060e = this.mBackgroundTintHelper;
        if (c5060e != null) {
            c5060e.a();
        }
        C5080z c5080z = this.mTextHelper;
        if (c5080z != null) {
            c5080z.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.k.l(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5060e c5060e = this.mBackgroundTintHelper;
        if (c5060e != null) {
            return c5060e.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5060e c5060e = this.mBackgroundTintHelper;
        if (c5060e != null) {
            return c5060e.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.k();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        C5079y c5079y;
        return (Build.VERSION.SDK_INT >= 28 || (c5079y = this.mTextClassifierHelper) == null) ? getSuperCaller().a() : c5079y.a();
    }

    void initEmojiKeyListener(C5065j c5065j) {
        KeyListener keyListener = getKeyListener();
        c5065j.getClass();
        if (C5065j.b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a11 = c5065j.a(keyListener);
            if (a11 == keyListener) {
                return;
            }
            super.setKeyListener(a11);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.c();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        String[] m11;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 30 && onCreateInputConnection != null) {
            B2.a.b(editorInfo, getText());
        }
        C5067l.a(onCreateInputConnection, editorInfo, this);
        if (onCreateInputConnection != null && i11 <= 30 && (m11 = androidx.core.view.Y.m(this)) != null) {
            B2.a.a(editorInfo, m11);
            onCreateInputConnection = B2.c.b(this, onCreateInputConnection, editorInfo);
        }
        return this.mAppCompatEmojiEditTextHelper.e(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 30 || i11 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (C5073s.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // androidx.core.view.F
    public C5311d onReceiveContent(@NonNull C5311d c5311d) {
        return this.mDefaultOnReceiveContentListener.a(this, c5311d);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i11) {
        if (C5073s.b(this, i11)) {
            return true;
        }
        return super.onTextContextMenuItem(i11);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5060e c5060e = this.mBackgroundTintHelper;
        if (c5060e != null) {
            c5060e.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        C5060e c5060e = this.mBackgroundTintHelper;
        if (c5060e != null) {
            c5060e.f(i11);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5080z c5080z = this.mTextHelper;
        if (c5080z != null) {
            c5080z.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5080z c5080z = this.mTextHelper;
        if (c5080z != null) {
            c5080z.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.k.m(callback, this));
    }

    @Override // androidx.appcompat.widget.J
    public void setEmojiCompatEnabled(boolean z11) {
        this.mAppCompatEmojiEditTextHelper.f(z11);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5060e c5060e = this.mBackgroundTintHelper;
        if (c5060e != null) {
            c5060e.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5060e c5060e = this.mBackgroundTintHelper;
        if (c5060e != null) {
            c5060e.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.t(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.u(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        C5080z c5080z = this.mTextHelper;
        if (c5080z != null) {
            c5080z.o(i11, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C5079y c5079y;
        if (Build.VERSION.SDK_INT >= 28 || (c5079y = this.mTextClassifierHelper) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            c5079y.b(textClassifier);
        }
    }

    public AppCompatEditText(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Y.a(context);
        W.a(this, getContext());
        C5060e c5060e = new C5060e(this);
        this.mBackgroundTintHelper = c5060e;
        c5060e.d(attributeSet, i11);
        C5080z c5080z = new C5080z(this);
        this.mTextHelper = c5080z;
        c5080z.m(attributeSet, i11);
        c5080z.b();
        this.mTextClassifierHelper = new C5079y(this);
        this.mDefaultOnReceiveContentListener = new androidx.core.widget.l();
        C5065j c5065j = new C5065j(this);
        this.mAppCompatEmojiEditTextHelper = c5065j;
        c5065j.d(attributeSet, i11);
        initEmojiKeyListener(c5065j);
    }
}
