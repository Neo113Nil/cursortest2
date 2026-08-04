package p059i0;

import B4.V;
import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;
import p046g0.f;
import p046g0.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f13819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f13820b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        V v6 = new V(19);
        super(inputConnection, false);
        this.f13819a = editText;
        this.f13820b = v6;
        if (j.j != null) {
            j jVarA = j.a();
            if (jVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            f fVar = jVarA.f13033e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            p052h0.b bVar = (p052h0.b) fVar.f13024c.f17379b;
            int iA = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar.f5028d).getInt(iA + bVar.f5025a) : 0);
            Bundle bundle2 = editorInfo.extras;
            fVar.f13022a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i8) {
        Editable editableText = this.f13819a.getEditableText();
        this.f13820b.getClass();
        return V.t(this, editableText, i7, i8, false) || super.deleteSurroundingText(i7, i8);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        Editable editableText = this.f13819a.getEditableText();
        this.f13820b.getClass();
        return V.t(this, editableText, i7, i8, true) || super.deleteSurroundingTextInCodePoints(i7, i8);
    }
}
