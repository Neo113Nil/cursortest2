package i0;

import B4.V;
import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import g0.C1124f;
import g0.j;
import h0.C1176b;
import java.nio.ByteBuffer;

/* renamed from: i0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1235b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f13813a;

    /* renamed from: b, reason: collision with root package name */
    public final V f13814b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1235b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        V v6 = new V(19);
        this.f13813a = editText;
        this.f13814b = v6;
        if (j.j != null) {
            j a2 = j.a();
            if (a2.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C1124f c1124f = a2.f13027e;
            c1124f.getClass();
            Bundle bundle = editorInfo.extras;
            C1176b c1176b = (C1176b) c1124f.f13018c.f17373b;
            int a4 = c1176b.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a4 != 0 ? ((ByteBuffer) c1176b.f5028d).getInt(a4 + c1176b.f5025a) : 0);
            Bundle bundle2 = editorInfo.extras;
            c1124f.f13016a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i8) {
        Editable editableText = this.f13813a.getEditableText();
        this.f13814b.getClass();
        return V.t(this, editableText, i7, i8, false) || super.deleteSurroundingText(i7, i8);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        Editable editableText = this.f13813a.getEditableText();
        this.f13814b.getClass();
        return V.t(this, editableText, i7, i8, true) || super.deleteSurroundingTextInCodePoints(i7, i8);
    }
}
