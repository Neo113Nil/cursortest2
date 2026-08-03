package io.flutter.plugin.editing;

/* loaded from: classes.dex */
public final class f extends android.text.SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public int f7699a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f7700b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f7701c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f7702d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f7703e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f7704f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f7705g;

    /* renamed from: h, reason: collision with root package name */
    public int f7706h;

    /* renamed from: i, reason: collision with root package name */
    public int f7707i;

    /* renamed from: j, reason: collision with root package name */
    public int f7708j;

    /* renamed from: k, reason: collision with root package name */
    public int f7709k;

    /* renamed from: l, reason: collision with root package name */
    public final io.flutter.plugin.editing.d f7710l;

    public f(Z0.p pVar, P0.t tVar) {
        this.f7710l = new io.flutter.plugin.editing.d(tVar, this);
        if (pVar != null) {
            f(pVar);
        }
    }

    public final void a(io.flutter.plugin.editing.e eVar) {
        if (this.f7700b > 0) {
            android.util.Log.e("ListenableEditingState", "adding a listener " + eVar.toString() + " in a listener callback");
        }
        if (this.f7699a <= 0) {
            this.f7701c.add(eVar);
        } else {
            android.util.Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f7702d.add(eVar);
        }
    }

    public final void b() {
        this.f7699a++;
        if (this.f7700b > 0) {
            android.util.Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f7699a != 1 || this.f7701c.isEmpty()) {
            return;
        }
        this.f7705g = toString();
        this.f7706h = android.text.Selection.getSelectionStart(this);
        this.f7707i = android.text.Selection.getSelectionEnd(this);
        this.f7708j = android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this);
        this.f7709k = android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i2 = this.f7699a;
        if (i2 == 0) {
            android.util.Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        java.util.ArrayList arrayList = this.f7701c;
        java.util.ArrayList arrayList2 = this.f7702d;
        if (i2 == 1) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                io.flutter.plugin.editing.e eVar = (io.flutter.plugin.editing.e) it.next();
                this.f7700b++;
                eVar.a(true);
                this.f7700b--;
            }
            if (!arrayList.isEmpty()) {
                arrayList.size();
                d(!toString().equals(this.f7705g), (this.f7706h == android.text.Selection.getSelectionStart(this) && this.f7707i == android.text.Selection.getSelectionEnd(this)) ? false : true, (this.f7708j == android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this) && this.f7709k == android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f7699a--;
    }

    public final void d(boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            java.util.Iterator it = this.f7701c.iterator();
            while (it.hasNext()) {
                io.flutter.plugin.editing.e eVar = (io.flutter.plugin.editing.e) it.next();
                this.f7700b++;
                eVar.a(z2);
                this.f7700b--;
            }
        }
    }

    public final void e(io.flutter.plugin.editing.e eVar) {
        if (this.f7700b > 0) {
            android.util.Log.e("ListenableEditingState", "removing a listener " + eVar.toString() + " in a listener callback");
        }
        this.f7701c.remove(eVar);
        if (this.f7699a > 0) {
            this.f7702d.remove(eVar);
        }
    }

    public final void f(Z0.p pVar) {
        int i2;
        b();
        replace(0, length(), (java.lang.CharSequence) pVar.f1937a);
        int i3 = pVar.f1938b;
        if (i3 >= 0) {
            android.text.Selection.setSelection(this, i3, pVar.f1939c);
        } else {
            android.text.Selection.removeSelection(this);
        }
        int i4 = pVar.f1940d;
        if (i4 < 0 || i4 >= (i2 = pVar.f1941e)) {
            android.view.inputmethod.BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f7710l.setComposingRegion(i4, i2);
        }
        this.f7703e.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(java.lang.Object obj, int i2, int i3, int i4) {
        super.setSpan(obj, i2, i3, i4);
        java.util.ArrayList arrayList = this.f7703e;
        java.lang.String fVar = toString();
        int selectionStart = android.text.Selection.getSelectionStart(this);
        int selectionEnd = android.text.Selection.getSelectionEnd(this);
        int composingSpanStart = android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this);
        io.flutter.plugin.editing.h hVar = new io.flutter.plugin.editing.h();
        hVar.f7719e = selectionStart;
        hVar.f7720f = selectionEnd;
        hVar.f7721g = composingSpanStart;
        hVar.f7722h = composingSpanEnd;
        hVar.f7715a = fVar;
        hVar.f7716b = "";
        hVar.f7717c = -1;
        hVar.f7718d = -1;
        arrayList.add(hVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final java.lang.String toString() {
        java.lang.String str = this.f7704f;
        if (str != null) {
            return str;
        }
        java.lang.String spannableStringBuilder = super.toString();
        this.f7704f = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder replace(int i2, int i3, java.lang.CharSequence charSequence, int i4, int i5) {
        if (this.f7700b > 0) {
            android.util.Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        java.lang.String fVar = toString();
        int i6 = i3 - i2;
        boolean z2 = i6 != i5 - i4;
        for (int i7 = 0; i7 < i6 && !z2; i7++) {
            z2 |= charAt(i2 + i7) != charSequence.charAt(i4 + i7);
        }
        if (z2) {
            this.f7704f = null;
        }
        int selectionStart = android.text.Selection.getSelectionStart(this);
        int selectionEnd = android.text.Selection.getSelectionEnd(this);
        int composingSpanStart = android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this);
        android.text.SpannableStringBuilder replace = super.replace(i2, i3, charSequence, i4, i5);
        java.util.ArrayList arrayList = this.f7703e;
        int selectionStart2 = android.text.Selection.getSelectionStart(this);
        int selectionEnd2 = android.text.Selection.getSelectionEnd(this);
        int composingSpanStart2 = android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this);
        io.flutter.plugin.editing.h hVar = new io.flutter.plugin.editing.h();
        hVar.f7719e = selectionStart2;
        hVar.f7720f = selectionEnd2;
        hVar.f7721g = composingSpanStart2;
        hVar.f7722h = composingSpanEnd2;
        java.lang.String charSequence2 = charSequence.toString();
        hVar.f7715a = fVar;
        hVar.f7716b = charSequence2;
        hVar.f7717c = i2;
        hVar.f7718d = i3;
        arrayList.add(hVar);
        if (this.f7699a > 0) {
            return replace;
        }
        d(z2, (android.text.Selection.getSelectionStart(this) == selectionStart && android.text.Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }
}
