package Y2;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.emoji2.text.j;

/* loaded from: classes8.dex */
final class c extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    private final EditText f34541a;

    /* renamed from: b, reason: collision with root package name */
    private final a f34542b;

    public static class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(@NonNull EditText editText, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        super(inputConnection, false);
        a aVar = new a();
        this.f34541a = editText;
        this.f34542b = aVar;
        if (j.j()) {
            j.c().q(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i11, int i12) {
        Editable editableText = this.f34541a.getEditableText();
        this.f34542b.getClass();
        return j.g(this, editableText, i11, i12, false) || super.deleteSurroundingText(i11, i12);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i11, int i12) {
        Editable editableText = this.f34541a.getEditableText();
        this.f34542b.getClass();
        return j.g(this, editableText, i11, i12, true) || super.deleteSurroundingTextInCodePoints(i11, i12);
    }
}
