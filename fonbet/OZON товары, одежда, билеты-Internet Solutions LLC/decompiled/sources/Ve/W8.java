package Ve;

import android.text.Editable;
import androidx.appcompat.widget.AppCompatEditText;

/* loaded from: classes10.dex */
public final class W8 extends AppCompatEditText {
    @Override // android.widget.TextView
    public final void onSelectionChanged(int i11, int i12) {
        Editable text = getText();
        if (text == null || (i11 == text.length() && i12 == text.length())) {
            super.onSelectionChanged(i11, i12);
        } else {
            setSelection(text.length(), text.length());
        }
    }
}
