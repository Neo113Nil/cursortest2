package Y2;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final C0632a f34535a;

    /* renamed from: Y2.a$a, reason: collision with other inner class name */
    private static class C0632a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final EditText f34536a;

        /* renamed from: b, reason: collision with root package name */
        private final g f34537b;

        C0632a(@NonNull EditText editText) {
            this.f34536a = editText;
            g gVar = new g(editText);
            this.f34537b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(Y2.b.getInstance());
        }

        final boolean a() {
            return this.f34537b.a();
        }

        final InputConnection b(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f34536a, inputConnection, editorInfo);
        }

        final void c(boolean z11) {
            this.f34537b.c(z11);
        }
    }

    static class b {
    }

    public a(@NonNull EditText editText) {
        this.f34535a = new C0632a(editText);
    }

    public final KeyListener a(KeyListener keyListener) {
        this.f34535a.getClass();
        if (keyListener instanceof e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
    }

    public final boolean b() {
        return this.f34535a.a();
    }

    public final InputConnection c(InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f34535a.b(inputConnection, editorInfo);
    }

    public final void d(boolean z11) {
        this.f34535a.c(z11);
    }
}
