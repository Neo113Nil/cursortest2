package v1;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import k4.AbstractC2036a;

/* loaded from: classes.dex */
public final class u extends SpannableStringBuilder {

    /* renamed from: k, reason: collision with root package name */
    public final Class f20378k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f20379l;

    public u(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f20379l = new ArrayList();
        AbstractC2036a.o("watcherClass cannot be null", cls);
        this.f20378k = cls;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f20379l;
            if (i >= arrayList.size()) {
                return;
            }
            ((t) arrayList.get(i)).f20377l.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f20379l;
            if (i >= arrayList.size()) {
                return;
            }
            ((t) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    public final t c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f20379l;
            if (i >= arrayList.size()) {
                return null;
            }
            t tVar = (t) arrayList.get(i);
            if (tVar.f20376k == obj) {
                return tVar;
            }
            i++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f20378k == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i5) {
        super.delete(i, i5);
        return this;
    }

    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f20379l;
            if (i >= arrayList.size()) {
                return;
            }
            ((t) arrayList.get(i)).f20377l.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        t c5;
        if (d(obj) && (c5 = c(obj)) != null) {
            obj = c5;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        t c5;
        if (d(obj) && (c5 = c(obj)) != null) {
            obj = c5;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        t c5;
        if (d(obj) && (c5 = c(obj)) != null) {
            obj = c5;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i5, Class cls) {
        if (this.f20378k != cls) {
            return super.getSpans(i, i5, cls);
        }
        t[] tVarArr = (t[]) super.getSpans(i, i5, t.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, tVarArr.length);
        for (int i6 = 0; i6 < tVarArr.length; i6++) {
            objArr[i6] = tVarArr[i6].f20376k;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i5, Class cls) {
        if (cls == null || this.f20378k == cls) {
            cls = t.class;
        }
        return super.nextSpanTransition(i, i5, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        t tVar;
        if (d(obj)) {
            tVar = c(obj);
            if (tVar != null) {
                obj = tVar;
            }
        } else {
            tVar = null;
        }
        super.removeSpan(obj);
        if (tVar != null) {
            this.f20379l.remove(tVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i5, CharSequence charSequence) {
        replace(i, i5, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i5, int i6) {
        if (d(obj)) {
            t tVar = new t(obj);
            this.f20379l.add(tVar);
            obj = tVar;
        }
        super.setSpan(obj, i, i5, i6);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i5) {
        return new u(this.f20378k, this, i, i5);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i5) {
        super.delete(i, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i5, CharSequence charSequence, int i6, int i7) {
        replace(i, i5, charSequence, i6, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i5, int i6) {
        super.insert(i, charSequence, i5, i6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i5, CharSequence charSequence) {
        a();
        super.replace(i, i5, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c5) {
        super.append(c5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i5, int i6) {
        super.insert(i, charSequence, i5, i6);
        return this;
    }

    public u(Class cls, u uVar, int i, int i5) {
        super(uVar, i, i5);
        this.f20379l = new ArrayList();
        AbstractC2036a.o("watcherClass cannot be null", cls);
        this.f20378k = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c5) {
        super.append(c5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c5) {
        super.append(c5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i5, CharSequence charSequence, int i6, int i7) {
        a();
        super.replace(i, i5, charSequence, i6, i7);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i5) {
        super.append(charSequence, i, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i5) {
        super.append(charSequence, i, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i5) {
        super.append(charSequence, i, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
