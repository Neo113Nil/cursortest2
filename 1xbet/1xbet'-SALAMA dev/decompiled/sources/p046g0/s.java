package p046g0;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class s implements TextWatcher, SpanWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f13064b = new AtomicInteger(0);

    public s(Object obj) {
        this.f13063a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f13063a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        ((TextWatcher) this.f13063a).beforeTextChanged(charSequence, i7, i8, i9);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i7, int i8) {
        if (this.f13064b.get() <= 0 || !(obj instanceof u)) {
            ((SpanWatcher) this.f13063a).onSpanAdded(spannable, obj, i7, i8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001c A[PHI: r11
      0x001c: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0011, B:12:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        if (this.f13064b.get() <= 0 || !(obj instanceof u)) {
            if (Build.VERSION.SDK_INT >= 28) {
                i11 = i7;
                i12 = i9;
            } else {
                if (i7 > i8) {
                    i7 = 0;
                }
                if (i9 > i10) {
                    i11 = i7;
                    i12 = 0;
                } else {
                    i11 = i7;
                    i12 = i9;
                }
            }
            ((SpanWatcher) this.f13063a).onSpanChanged(spannable, obj, i11, i8, i12, i10);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i7, int i8) {
        if (this.f13064b.get() <= 0 || !(obj instanceof u)) {
            ((SpanWatcher) this.f13063a).onSpanRemoved(spannable, obj, i7, i8);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        ((TextWatcher) this.f13063a).onTextChanged(charSequence, i7, i8, i9);
    }
}
