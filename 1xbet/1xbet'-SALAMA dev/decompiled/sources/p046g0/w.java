package p046g0;

import M4.e;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13070a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Spannable f13071b;

    public w(Spannable spannable) {
        this.f13071b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f13071b;
        if (!this.f13070a) {
            if ((Build.VERSION.SDK_INT < 28 ? new e() : new v()).w(spannable)) {
                this.f13071b = new SpannableString(spannable);
            }
        }
        this.f13070a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i7) {
        return this.f13071b.charAt(i7);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f13071b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f13071b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f13071b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f13071b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f13071b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i7, int i8, Class cls) {
        return this.f13071b.getSpans(i7, i8, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f13071b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i7, int i8, Class cls) {
        return this.f13071b.nextSpanTransition(i7, i8, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f13071b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i7, int i8, int i9) {
        a();
        this.f13071b.setSpan(obj, i7, i8, i9);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i8) {
        return this.f13071b.subSequence(i7, i8);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f13071b.toString();
    }

    public w(CharSequence charSequence) {
        this.f13071b = new SpannableString(charSequence);
    }
}
