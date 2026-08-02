package g0;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
public final class t extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final Class f13059a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13060b;

    public t(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f13060b = new ArrayList();
        AbstractC1464a.i(cls, "watcherClass cannot be null");
        this.f13059a = cls;
    }

    public final void a() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f13060b;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i7)).f13058b.incrementAndGet();
            i7++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f13060b;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i7)).onTextChanged(this, 0, length(), length());
            i7++;
        }
    }

    public final s c(Object obj) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f13060b;
            if (i7 >= arrayList.size()) {
                return null;
            }
            s sVar = (s) arrayList.get(i7);
            if (sVar.f13057a == obj) {
                return sVar;
            }
            i7++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            if (this.f13059a == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i7, int i8) {
        super.delete(i7, i8);
        return this;
    }

    public final void e() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f13060b;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i7)).f13058b.decrementAndGet();
            i7++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        s c3;
        if (d(obj) && (c3 = c(obj)) != null) {
            obj = c3;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        s c3;
        if (d(obj) && (c3 = c(obj)) != null) {
            obj = c3;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        s c3;
        if (d(obj) && (c3 = c(obj)) != null) {
            obj = c3;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i7, int i8, Class cls) {
        if (this.f13059a != cls) {
            return super.getSpans(i7, i8, cls);
        }
        s[] sVarArr = (s[]) super.getSpans(i7, i8, s.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, sVarArr.length);
        for (int i9 = 0; i9 < sVarArr.length; i9++) {
            objArr[i9] = sVarArr[i9].f13057a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i7, CharSequence charSequence) {
        super.insert(i7, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i7, int i8, Class cls) {
        if (cls == null || this.f13059a == cls) {
            cls = s.class;
        }
        return super.nextSpanTransition(i7, i8, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        s sVar;
        if (d(obj)) {
            sVar = c(obj);
            if (sVar != null) {
                obj = sVar;
            }
        } else {
            sVar = null;
        }
        super.removeSpan(obj);
        if (sVar != null) {
            this.f13060b.remove(sVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i7, int i8, CharSequence charSequence) {
        replace(i7, i8, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i7, int i8, int i9) {
        if (d(obj)) {
            s sVar = new s(obj);
            this.f13060b.add(sVar);
            obj = sVar;
        }
        super.setSpan(obj, i7, i8, i9);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i8) {
        return new t(this.f13059a, this, i7, i8);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i7, int i8) {
        super.delete(i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i7, CharSequence charSequence) {
        super.insert(i7, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i7, int i8, CharSequence charSequence, int i9, int i10) {
        replace(i7, i8, charSequence, i9, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i7, CharSequence charSequence, int i8, int i9) {
        super.insert(i7, charSequence, i8, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i7, int i8, CharSequence charSequence) {
        a();
        super.replace(i7, i8, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c3) {
        super.append(c3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i7, CharSequence charSequence, int i8, int i9) {
        super.insert(i7, charSequence, i8, i9);
        return this;
    }

    public t(Class cls, t tVar, int i7, int i8) {
        super(tVar, i7, i8);
        this.f13060b = new ArrayList();
        AbstractC1464a.i(cls, "watcherClass cannot be null");
        this.f13059a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c3) {
        super.append(c3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c3) {
        super.append(c3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i7, int i8, CharSequence charSequence, int i9, int i10) {
        a();
        super.replace(i7, i8, charSequence, i9, i10);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i7, int i8) {
        super.append(charSequence, i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i7, int i8) {
        super.append(charSequence, i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i7, int i8) {
        super.append(charSequence, i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i7) {
        super.append(charSequence, obj, i7);
        return this;
    }
}
