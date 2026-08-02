package v1;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import l3.C2054a;

/* loaded from: classes.dex */
public final class y implements Spannable {

    /* renamed from: k, reason: collision with root package name */
    public boolean f20389k = false;

    /* renamed from: l, reason: collision with root package name */
    public Spannable f20390l;

    public y(Spannable spannable) {
        this.f20390l = spannable;
    }

    public final void a() {
        Spannable spannable = this.f20390l;
        if (!this.f20389k) {
            if ((Build.VERSION.SDK_INT < 28 ? new C2054a(13) : new x(13)).k(spannable)) {
                this.f20390l = new SpannableString(spannable);
            }
        }
        this.f20389k = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f20390l.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        IntStream chars;
        chars = this.f20390l.chars();
        return chars;
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        IntStream codePoints;
        codePoints = this.f20390l.codePoints();
        return codePoints;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f20390l.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f20390l.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f20390l.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i5, Class cls) {
        return this.f20390l.getSpans(i, i5, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f20390l.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i5, Class cls) {
        return this.f20390l.nextSpanTransition(i, i5, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f20390l.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i5, int i6) {
        a();
        this.f20390l.setSpan(obj, i, i5, i6);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i5) {
        return this.f20390l.subSequence(i, i5);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f20390l.toString();
    }
}
