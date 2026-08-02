package p000;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* JADX INFO: renamed from: tv */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0743tv extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final TextView f7605a;

    /* JADX INFO: renamed from: b */
    public final nc1 f7606b;

    public C0743tv(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        nc1 nc1Var = new nc1(21);
        super(inputConnection, false);
        this.f7605a = textView;
        this.f7606b = nc1Var;
        if (C0595pv.f6261k != null) {
            C0595pv c0595pvM3994a = C0595pv.m3994a();
            if (c0595pvM3994a.m3995b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C0447lv c0447lv = c0595pvM3994a.f6266e;
            c0447lv.getClass();
            Bundle bundle = editorInfo.extras;
            rp0 rp0Var = (rp0) c0447lv.f4913c.f2334k;
            int iM3375a = rp0Var.m3375a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM3375a != 0 ? rp0Var.f5024b.getInt(iM3375a + rp0Var.f5023a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f7605a.getEditableText();
        this.f7606b.getClass();
        return nc1.m3515I(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f7605a.getEditableText();
        this.f7606b.getClass();
        return nc1.m3515I(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
