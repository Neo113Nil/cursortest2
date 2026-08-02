package p000;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class f91 extends SpannableStringBuilder {

    /* JADX INFO: renamed from: j */
    public final Class f2353j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f2354k;

    public f91(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f2354k = new ArrayList();
        hn0.m2313g(cls, "watcherClass cannot be null");
        this.f2353j = cls;
    }

    /* JADX INFO: renamed from: a */
    public final void m1746a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2354k;
            if (i >= arrayList.size()) {
                return;
            }
            ((e91) arrayList.get(i)).f2019k.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m1747b() {
        m1750e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2354k;
            if (i >= arrayList.size()) {
                return;
            }
            ((e91) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final e91 m1748c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2354k;
            if (i >= arrayList.size()) {
                return null;
            }
            e91 e91Var = (e91) arrayList.get(i);
            if (e91Var.f2018j == obj) {
                return e91Var;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1749d(Object obj) {
        if (obj != null) {
            return this.f2353j == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m1750e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2354k;
            if (i >= arrayList.size()) {
                return;
            }
            ((e91) arrayList.get(i)).f2019k.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        e91 e91VarM1748c;
        if (m1749d(obj) && (e91VarM1748c = m1748c(obj)) != null) {
            obj = e91VarM1748c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        e91 e91VarM1748c;
        if (m1749d(obj) && (e91VarM1748c = m1748c(obj)) != null) {
            obj = e91VarM1748c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        e91 e91VarM1748c;
        if (m1749d(obj) && (e91VarM1748c = m1748c(obj)) != null) {
            obj = e91VarM1748c;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.f2353j != cls) {
            return super.getSpans(i, i2, cls);
        }
        e91[] e91VarArr = (e91[]) super.getSpans(i, i2, e91.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, e91VarArr.length);
        for (int i3 = 0; i3 < e91VarArr.length; i3++) {
            objArr[i3] = e91VarArr[i3].f2018j;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.f2353j == cls) {
            cls = e91.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        e91 e91VarM1748c;
        if (m1749d(obj)) {
            e91VarM1748c = m1748c(obj);
            if (e91VarM1748c != null) {
                obj = e91VarM1748c;
            }
        } else {
            e91VarM1748c = null;
        }
        super.removeSpan(obj);
        if (e91VarM1748c != null) {
            this.f2354k.remove(e91VarM1748c);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m1746a();
        super.replace(i, i2, charSequence);
        m1750e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m1749d(obj)) {
            e91 e91Var = new e91(obj);
            this.f2354k.add(e91Var);
            obj = e91Var;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new f91(this.f2353j, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m1746a();
        super.replace(i, i2, charSequence, i3, i4);
        m1750e();
        return this;
    }

    public f91(Class cls, f91 f91Var, int i, int i2) {
        super(f91Var, i, i2);
        this.f2354k = new ArrayList();
        hn0.m2313g(cls, "watcherClass cannot be null");
        this.f2353j = cls;
    }
}
