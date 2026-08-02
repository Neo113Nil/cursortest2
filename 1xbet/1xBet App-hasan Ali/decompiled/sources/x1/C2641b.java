package x1;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import l3.C2054a;
import v1.k;

/* renamed from: x1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2641b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f21070a;

    /* renamed from: b, reason: collision with root package name */
    public final C2054a f21071b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2641b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        C2054a c2054a = new C2054a(16);
        this.f21070a = editText;
        this.f21071b = c2054a;
        if (k.d()) {
            k.a().i(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i5) {
        Editable editableText = this.f21070a.getEditableText();
        this.f21071b.getClass();
        return C2054a.j(this, editableText, i, i5, false) || super.deleteSurroundingText(i, i5);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i5) {
        Editable editableText = this.f21070a.getEditableText();
        this.f21071b.getClass();
        return C2054a.j(this, editableText, i, i5, true) || super.deleteSurroundingTextInCodePoints(i, i5);
    }
}
