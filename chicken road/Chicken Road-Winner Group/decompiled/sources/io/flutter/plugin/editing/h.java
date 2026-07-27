package io.flutter.plugin.editing;

import S1.o;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public int f9194a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f9195b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9196c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9197d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f9198e = new ArrayList();
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public String f9199g;

    /* renamed from: h, reason: collision with root package name */
    public int f9200h;

    /* renamed from: i, reason: collision with root package name */
    public int f9201i;

    /* renamed from: j, reason: collision with root package name */
    public int f9202j;

    /* renamed from: k, reason: collision with root package name */
    public int f9203k;

    /* renamed from: l, reason: collision with root package name */
    public final f f9204l;

    public h(o oVar, View view) {
        this.f9204l = new f(view, this);
        if (oVar != null) {
            f(oVar);
        }
    }

    public final void a(g gVar) {
        if (this.f9195b > 0) {
            Log.e("ListenableEditingState", "adding a listener " + gVar.toString() + " in a listener callback");
        }
        if (this.f9194a <= 0) {
            this.f9196c.add(gVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f9197d.add(gVar);
        }
    }

    public final void b() {
        this.f9194a++;
        if (this.f9195b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f9194a != 1 || this.f9196c.isEmpty()) {
            return;
        }
        this.f9199g = toString();
        this.f9200h = Selection.getSelectionStart(this);
        this.f9201i = Selection.getSelectionEnd(this);
        this.f9202j = BaseInputConnection.getComposingSpanStart(this);
        this.f9203k = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i3 = this.f9194a;
        if (i3 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f9196c;
        ArrayList arrayList2 = this.f9197d;
        if (i3 == 1) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                this.f9195b++;
                gVar.a(true);
                this.f9195b--;
            }
            if (!arrayList.isEmpty()) {
                arrayList.size();
                d(!toString().equals(this.f9199g), (this.f9200h == Selection.getSelectionStart(this) && this.f9201i == Selection.getSelectionEnd(this)) ? false : true, (this.f9202j == BaseInputConnection.getComposingSpanStart(this) && this.f9203k == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f9194a--;
    }

    public final void d(boolean z3, boolean z4, boolean z5) {
        if (z3 || z4 || z5) {
            Iterator it = this.f9196c.iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                this.f9195b++;
                gVar.a(z3);
                this.f9195b--;
            }
        }
    }

    public final void e(g gVar) {
        if (this.f9195b > 0) {
            Log.e("ListenableEditingState", "removing a listener " + gVar.toString() + " in a listener callback");
        }
        this.f9196c.remove(gVar);
        if (this.f9194a > 0) {
            this.f9197d.remove(gVar);
        }
    }

    public final void f(o oVar) {
        int i3;
        b();
        replace(0, length(), (CharSequence) oVar.f1453a);
        int i4 = oVar.f1454b;
        if (i4 >= 0) {
            Selection.setSelection(this, i4, oVar.f1455c);
        } else {
            Selection.removeSelection(this);
        }
        int i5 = oVar.f1456d;
        if (i5 < 0 || i5 >= (i3 = oVar.f1457e)) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f9204l.setComposingRegion(i5, i3);
        }
        this.f9198e.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i3, int i4, int i5) {
        super.setSpan(obj, i3, i4, i5);
        ArrayList arrayList = this.f9198e;
        String hVar = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        j jVar = new j();
        jVar.f9213e = selectionStart;
        jVar.f = selectionEnd;
        jVar.f9214g = composingSpanStart;
        jVar.f9215h = composingSpanEnd;
        jVar.f9209a = hVar;
        jVar.f9210b = "";
        jVar.f9211c = -1;
        jVar.f9212d = -1;
        arrayList.add(jVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i3, int i4, CharSequence charSequence, int i5, int i6) {
        if (this.f9195b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String hVar = toString();
        int i7 = i4 - i3;
        boolean z3 = i7 != i6 - i5;
        for (int i8 = 0; i8 < i7 && !z3; i8++) {
            z3 |= charAt(i3 + i8) != charSequence.charAt(i5 + i8);
        }
        if (z3) {
            this.f = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder replace = super.replace(i3, i4, charSequence, i5, i6);
        ArrayList arrayList = this.f9198e;
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        j jVar = new j();
        jVar.f9213e = selectionStart2;
        jVar.f = selectionEnd2;
        jVar.f9214g = composingSpanStart2;
        jVar.f9215h = composingSpanEnd2;
        String charSequence2 = charSequence.toString();
        jVar.f9209a = hVar;
        jVar.f9210b = charSequence2;
        jVar.f9211c = i3;
        jVar.f9212d = i4;
        arrayList.add(jVar);
        if (this.f9194a > 0) {
            return replace;
        }
        d(z3, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }
}
