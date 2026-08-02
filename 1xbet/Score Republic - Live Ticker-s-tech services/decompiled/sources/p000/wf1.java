package p000;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class wf1 implements Spannable {

    /* JADX INFO: renamed from: j */
    public boolean f8536j = false;

    /* JADX INFO: renamed from: k */
    public Spannable f8537k;

    public wf1(Spannable spannable) {
        this.f8537k = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f8537k.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f8537k.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f8537k.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f8537k.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f8537k.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f8537k.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f8537k.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f8537k.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f8537k.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        Spannable spannable = this.f8537k;
        if (!this.f8536j && (spannable instanceof PrecomputedText)) {
            this.f8537k = new SpannableString(spannable);
        }
        this.f8536j = true;
        this.f8537k.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        Spannable spannable = this.f8537k;
        if (!this.f8536j && (spannable instanceof PrecomputedText)) {
            this.f8537k = new SpannableString(spannable);
        }
        this.f8536j = true;
        this.f8537k.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f8537k.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f8537k.toString();
    }
}
