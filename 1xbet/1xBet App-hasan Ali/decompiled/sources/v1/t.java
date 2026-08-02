package v1;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class t implements TextWatcher, SpanWatcher {

    /* renamed from: k, reason: collision with root package name */
    public final Object f20376k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f20377l = new AtomicInteger(0);

    public t(Object obj) {
        this.f20376k = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f20376k).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i5, int i6) {
        ((TextWatcher) this.f20376k).beforeTextChanged(charSequence, i, i5, i6);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i5) {
        if (this.f20377l.get() <= 0 || !(obj instanceof w)) {
            ((SpanWatcher) this.f20376k).onSpanAdded(spannable, obj, i, i5);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i5, int i6, int i7) {
        int i8;
        int i9;
        if (this.f20377l.get() <= 0 || !(obj instanceof w)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i > i5) {
                    i = 0;
                }
                if (i6 > i7) {
                    i8 = i;
                    i9 = 0;
                    ((SpanWatcher) this.f20376k).onSpanChanged(spannable, obj, i8, i5, i9, i7);
                }
            }
            i8 = i;
            i9 = i6;
            ((SpanWatcher) this.f20376k).onSpanChanged(spannable, obj, i8, i5, i9, i7);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i5) {
        if (this.f20377l.get() <= 0 || !(obj instanceof w)) {
            ((SpanWatcher) this.f20376k).onSpanRemoved(spannable, obj, i, i5);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i5, int i6) {
        ((TextWatcher) this.f20376k).onTextChanged(charSequence, i, i5, i6);
    }
}
