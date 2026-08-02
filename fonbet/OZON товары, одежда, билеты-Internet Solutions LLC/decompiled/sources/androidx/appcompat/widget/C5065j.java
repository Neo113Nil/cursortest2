package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;
import i.C6977a;

/* renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5065j {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final EditText f37952a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final Y2.a f37953b;

    C5065j(@NonNull EditText editText) {
        this.f37952a = editText;
        this.f37953b = new Y2.a(editText);
    }

    static boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    final KeyListener a(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener) ? this.f37953b.a(keyListener) : keyListener;
    }

    final boolean c() {
        return this.f37953b.b();
    }

    final void d(AttributeSet attributeSet, int i11) {
        TypedArray obtainStyledAttributes = this.f37952a.getContext().obtainStyledAttributes(attributeSet, C6977a.f65655i, i11, 0);
        try {
            boolean z11 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            f(z11);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    final InputConnection e(InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        return this.f37953b.c(inputConnection, editorInfo);
    }

    final void f(boolean z11) {
        this.f37953b.d(z11);
    }
}
