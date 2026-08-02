package p000;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: uv */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0780uv extends AbstractC0484mv {

    /* JADX INFO: renamed from: a */
    public final WeakReference f7911a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f7912b;

    public C0780uv(TextView textView, C0817vv c0817vv) {
        this.f7911a = new WeakReference(textView);
        this.f7912b = new WeakReference(c0817vv);
    }

    @Override // p000.AbstractC0484mv
    /* JADX INFO: renamed from: a */
    public final void mo786a() throws Throwable {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f7911a.get();
        InputFilter inputFilter = (InputFilter) this.f7912b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C0595pv c0595pvM3994a = C0595pv.m3994a();
                    if (text == null) {
                        length = 0;
                    } else {
                        c0595pvM3994a.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM3998e = c0595pvM3994a.m3998e(text, 0, length);
                    if (text == charSequenceM3998e) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM3998e);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM3998e);
                    textView.setText(charSequenceM3998e);
                    if (charSequenceM3998e instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM3998e;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
