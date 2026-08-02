package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import java.util.stream.IntStream;

/* loaded from: classes8.dex */
final class y implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    private boolean f42762a = false;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private Spannable f42763b;

    static class a {
        boolean a(CharSequence charSequence) {
            return charSequence instanceof androidx.core.text.g;
        }
    }

    static class b extends a {
        @Override // androidx.emoji2.text.y.a
        final boolean a(CharSequence charSequence) {
            return z.b(charSequence) || (charSequence instanceof androidx.core.text.g);
        }
    }

    y(@NonNull Spannable spannable) {
        this.f42763b = spannable;
    }

    private void a() {
        Spannable spannable = this.f42763b;
        if (!this.f42762a) {
            if ((Build.VERSION.SDK_INT < 28 ? new a() : new b()).a(spannable)) {
                this.f42763b = new SpannableString(spannable);
            }
        }
        this.f42762a = true;
    }

    final Spannable b() {
        return this.f42763b;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i11) {
        return this.f42763b.charAt(i11);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final IntStream chars() {
        return this.f42763b.chars();
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final IntStream codePoints() {
        return this.f42763b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f42763b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f42763b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f42763b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i11, int i12, Class<T> cls) {
        return (T[]) this.f42763b.getSpans(i11, i12, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f42763b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i11, int i12, Class cls) {
        return this.f42763b.nextSpanTransition(i11, i12, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f42763b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i11, int i12, int i13) {
        a();
        this.f42763b.setSpan(obj, i11, i12, i13);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final CharSequence subSequence(int i11, int i12) {
        return this.f42763b.subSequence(i11, i12);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final String toString() {
        return this.f42763b.toString();
    }

    y(@NonNull CharSequence charSequence) {
        this.f42763b = new SpannableString(charSequence);
    }
}
