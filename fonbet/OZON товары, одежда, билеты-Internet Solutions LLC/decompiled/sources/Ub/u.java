package Ub;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class u implements Appendable, CharSequence {

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque f27521b = new ArrayDeque(8);

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f27520a = new StringBuilder((CharSequence) "");

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f27522a;

        /* renamed from: b, reason: collision with root package name */
        public int f27523b;

        /* renamed from: c, reason: collision with root package name */
        public int f27524c;

        /* renamed from: d, reason: collision with root package name */
        public final int f27525d;

        a(@NonNull Object obj, int i11, int i12, int i13) {
            this.f27522a = obj;
            this.f27523b = i11;
            this.f27524c = i12;
            this.f27525d = i13;
        }
    }

    static class b extends SpannableStringBuilder {
    }

    public u() {
        d(0, "");
    }

    private void d(int i11, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z11 = spanned instanceof b;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                ArrayDeque arrayDeque = this.f27521b;
                if (!z11) {
                    for (int i12 = 0; i12 < length; i12++) {
                        Object obj = spans[i12];
                        arrayDeque.push(new a(obj, spanned.getSpanStart(obj) + i11, spanned.getSpanEnd(obj) + i11, spanned.getSpanFlags(obj)));
                    }
                    return;
                }
                for (int i13 = length - 1; i13 >= 0; i13--) {
                    Object obj2 = spans[i13];
                    arrayDeque.push(new a(obj2, spanned.getSpanStart(obj2) + i11, spanned.getSpanEnd(obj2) + i11, spanned.getSpanFlags(obj2)));
                }
            }
        }
    }

    public static void f(@NonNull u uVar, Object obj, int i11, int i12) {
        if (obj != null) {
            int length = uVar.f27520a.length();
            if (i12 <= i11 || i11 < 0 || i12 > length) {
                return;
            }
            g(uVar, obj, i11, i12);
        }
    }

    private static void g(@NonNull u uVar, Object obj, int i11, int i12) {
        if (obj != null) {
            if (!obj.getClass().isArray()) {
                uVar.getClass();
                uVar.f27521b.push(new a(obj, i11, i12, 33));
            } else {
                for (Object obj2 : (Object[]) obj) {
                    g(uVar, obj2, i11, i12);
                }
            }
        }
    }

    @NonNull
    public final void a(char c11) {
        this.f27520a.append(c11);
    }

    @Override // java.lang.Appendable
    @NonNull
    public final /* bridge */ /* synthetic */ Appendable append(@NonNull CharSequence charSequence) throws IOException {
        b(charSequence);
        return this;
    }

    @NonNull
    public final void b(@NonNull CharSequence charSequence) {
        StringBuilder sb2 = this.f27520a;
        d(sb2.length(), charSequence);
        sb2.append(charSequence);
    }

    @NonNull
    public final void c(@NonNull String str) {
        this.f27520a.append(str);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i11) {
        return this.f27520a.charAt(i11);
    }

    public final char e() {
        return this.f27520a.charAt(r0.length() - 1);
    }

    @NonNull
    public final SpannableStringBuilder h() {
        b bVar = new b(this.f27520a);
        Iterator it = this.f27521b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            bVar.setSpan(aVar.f27522a, aVar.f27523b, aVar.f27524c, aVar.f27525d);
        }
        return bVar;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f27520a.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i11, int i12) {
        List<a> unmodifiableList;
        int i13;
        StringBuilder sb2 = this.f27520a;
        int length = sb2.length();
        if (i12 > i11 && i11 >= 0 && i12 <= length) {
            ArrayDeque arrayDeque = this.f27521b;
            if (i11 == 0 && length == i12) {
                ArrayList arrayList = new ArrayList(arrayDeque);
                Collections.reverse(arrayList);
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(0);
                Iterator descendingIterator = arrayDeque.descendingIterator();
                while (descendingIterator.hasNext()) {
                    a aVar = (a) descendingIterator.next();
                    int i14 = aVar.f27523b;
                    if ((i14 >= i11 && i14 < i12) || (((i13 = aVar.f27524c) <= i12 && i13 > i11) || (i14 < i11 && i13 > i12))) {
                        arrayList2.add(aVar);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList2);
            }
        } else {
            unmodifiableList = Collections.EMPTY_LIST;
        }
        if (unmodifiableList.isEmpty()) {
            return sb2.subSequence(i11, i12);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.subSequence(i11, i12));
        int length2 = spannableStringBuilder.length();
        for (a aVar2 : unmodifiableList) {
            int max = Math.max(0, aVar2.f27523b - i11);
            spannableStringBuilder.setSpan(aVar2.f27522a, max, Math.min(length2, (aVar2.f27524c - aVar2.f27523b) + max), aVar2.f27525d);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final String toString() {
        return this.f27520a.toString();
    }

    @Override // java.lang.Appendable
    @NonNull
    public final Appendable append(char c11) throws IOException {
        this.f27520a.append(c11);
        return this;
    }

    @Override // java.lang.Appendable
    @NonNull
    public final Appendable append(CharSequence charSequence, int i11, int i12) throws IOException {
        CharSequence subSequence = charSequence.subSequence(i11, i12);
        StringBuilder sb2 = this.f27520a;
        d(sb2.length(), subSequence);
        sb2.append(subSequence);
        return this;
    }
}
