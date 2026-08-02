package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public final class v extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final Class<?> f42753a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final ArrayList f42754b;

    private static class a implements TextWatcher, SpanWatcher {

        /* renamed from: a, reason: collision with root package name */
        final Object f42755a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicInteger f42756b = new AtomicInteger(0);

        a(Object obj) {
            this.f42755a = obj;
        }

        final void a() {
            this.f42756b.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f42755a).afterTextChanged(editable);
        }

        final void b() {
            this.f42756b.decrementAndGet();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            ((TextWatcher) this.f42755a).beforeTextChanged(charSequence, i11, i12, i13);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanAdded(Spannable spannable, Object obj, int i11, int i12) {
            if (this.f42756b.get() <= 0 || !(obj instanceof p)) {
                ((SpanWatcher) this.f42755a).onSpanAdded(spannable, obj, i11, i12);
            }
        }

        @Override // android.text.SpanWatcher
        public final void onSpanChanged(Spannable spannable, Object obj, int i11, int i12, int i13, int i14) {
            int i15;
            int i16;
            if (this.f42756b.get() <= 0 || !(obj instanceof p)) {
                if (Build.VERSION.SDK_INT < 28) {
                    if (i11 > i12) {
                        i11 = 0;
                    }
                    if (i13 > i14) {
                        i15 = i11;
                        i16 = 0;
                        ((SpanWatcher) this.f42755a).onSpanChanged(spannable, obj, i15, i12, i16, i14);
                    }
                }
                i15 = i11;
                i16 = i13;
                ((SpanWatcher) this.f42755a).onSpanChanged(spannable, obj, i15, i12, i16, i14);
            }
        }

        @Override // android.text.SpanWatcher
        public final void onSpanRemoved(Spannable spannable, Object obj, int i11, int i12) {
            if (this.f42756b.get() <= 0 || !(obj instanceof p)) {
                ((SpanWatcher) this.f42755a).onSpanRemoved(spannable, obj, i11, i12);
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            ((TextWatcher) this.f42755a).onTextChanged(charSequence, i11, i12, i13);
        }
    }

    v(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        super(charSequence);
        this.f42754b = new ArrayList();
        x2.i.e(cls, "watcherClass cannot be null");
        this.f42753a = cls;
    }

    private void b() {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f42754b;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i11)).a();
            i11++;
        }
    }

    @NonNull
    public static v c(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        return new v(cls, charSequence);
    }

    private a e(Object obj) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f42754b;
            if (i11 >= arrayList.size()) {
                return null;
            }
            a aVar = (a) arrayList.get(i11);
            if (aVar.f42755a == obj) {
                return aVar;
            }
            i11++;
        }
    }

    private boolean f(Object obj) {
        if (obj != null) {
            return this.f42753a == obj.getClass();
        }
        return false;
    }

    private void g() {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f42754b;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i11)).b();
            i11++;
        }
    }

    public final void a() {
        b();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void d() {
        g();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f42754b;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i11)).onTextChanged(this, 0, length(), length());
            i11++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable delete(int i11, int i12) {
        super.delete(i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        a e11;
        if (f(obj) && (e11 = e(obj)) != null) {
            obj = e11;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        a e11;
        if (f(obj) && (e11 = e(obj)) != null) {
            obj = e11;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        a e11;
        if (f(obj) && (e11 = e(obj)) != null) {
            obj = e11;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public final <T> T[] getSpans(int i11, int i12, @NonNull Class<T> cls) {
        if (this.f42753a != cls) {
            return (T[]) super.getSpans(i11, i12, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i11, i12, a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            tArr[i13] = aVarArr[i13].f42755a;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i11, CharSequence charSequence) {
        super.insert(i11, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i11, int i12, Class cls) {
        if (cls == null || this.f42753a == cls) {
            cls = a.class;
        }
        return super.nextSpanTransition(i11, i12, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        a aVar;
        if (f(obj)) {
            aVar = e(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f42754b.remove(aVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final /* bridge */ /* synthetic */ Editable replace(int i11, int i12, CharSequence charSequence) {
        replace(i11, i12, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i11, int i12, int i13) {
        if (f(obj)) {
            a aVar = new a(obj);
            this.f42754b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i11, i12, i13);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public final CharSequence subSequence(int i11, int i12) {
        return new v(this.f42753a, this, i11, i12);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder delete(int i11, int i12) {
        super.delete(i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder insert(int i11, CharSequence charSequence) {
        super.insert(i11, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final /* bridge */ /* synthetic */ Editable replace(int i11, int i12, CharSequence charSequence, int i13, int i14) {
        replace(i11, i12, charSequence, i13, i14);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) throws IOException {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i11, CharSequence charSequence, int i12, int i13) {
        super.insert(i11, charSequence, i12, i13);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i11, int i12, CharSequence charSequence) {
        b();
        super.replace(i11, i12, charSequence);
        g();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final Editable append(char c11) {
        super.append(c11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder insert(int i11, CharSequence charSequence, int i12, int i13) {
        super.insert(i11, charSequence, i12, i13);
        return this;
    }

    v(@NonNull Class cls, @NonNull v vVar, int i11, int i12) {
        super(vVar, i11, i12);
        this.f42754b = new ArrayList();
        x2.i.e(cls, "watcherClass cannot be null");
        this.f42753a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final SpannableStringBuilder append(char c11) {
        super.append(c11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final Appendable append(char c11) throws IOException {
        super.append(c11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i11, int i12, CharSequence charSequence, int i13, int i14) {
        b();
        super.replace(i11, i12, charSequence, i13, i14);
        g();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i11, int i12) {
        super.append(charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i11, int i12) {
        super.append(charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i11, int i12) throws IOException {
        super.append(charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i11) {
        super.append(charSequence, obj, i11);
        return this;
    }
}
