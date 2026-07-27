package io.flutter.plugin.editing;

import G2.o;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;
import w2.m;

/* loaded from: classes.dex */
public final class g extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public int f10169a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f10170b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10171c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10172d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f10173e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public String f10174f;

    /* renamed from: g, reason: collision with root package name */
    public String f10175g;

    /* renamed from: h, reason: collision with root package name */
    public int f10176h;

    /* renamed from: i, reason: collision with root package name */
    public int f10177i;

    /* renamed from: j, reason: collision with root package name */
    public int f10178j;

    /* renamed from: k, reason: collision with root package name */
    public int f10179k;

    /* renamed from: l, reason: collision with root package name */
    public final e f10180l;

    public g(o oVar, m mVar) {
        this.f10180l = new e(mVar, this);
        if (oVar != null) {
            f(oVar);
        }
    }

    public final void a(f fVar) {
        if (this.f10170b > 0) {
            Log.e("ListenableEditingState", "adding a listener " + fVar.toString() + " in a listener callback");
        }
        if (this.f10169a <= 0) {
            this.f10171c.add(fVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f10172d.add(fVar);
        }
    }

    public final void b() {
        this.f10169a++;
        if (this.f10170b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f10169a != 1 || this.f10171c.isEmpty()) {
            return;
        }
        this.f10175g = toString();
        this.f10176h = Selection.getSelectionStart(this);
        this.f10177i = Selection.getSelectionEnd(this);
        this.f10178j = BaseInputConnection.getComposingSpanStart(this);
        this.f10179k = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i2 = this.f10169a;
        if (i2 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f10171c;
        ArrayList arrayList2 = this.f10172d;
        if (i2 == 1) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                this.f10170b++;
                fVar.a(true);
                this.f10170b--;
            }
            if (!arrayList.isEmpty()) {
                arrayList.size();
                d(!toString().equals(this.f10175g), (this.f10176h == Selection.getSelectionStart(this) && this.f10177i == Selection.getSelectionEnd(this)) ? false : true, (this.f10178j == BaseInputConnection.getComposingSpanStart(this) && this.f10179k == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f10169a--;
    }

    public final void d(boolean z, boolean z5, boolean z6) {
        if (z || z5 || z6) {
            Iterator it = this.f10171c.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                this.f10170b++;
                fVar.a(z);
                this.f10170b--;
            }
        }
    }

    public final void e(f fVar) {
        if (this.f10170b > 0) {
            Log.e("ListenableEditingState", "removing a listener " + fVar.toString() + " in a listener callback");
        }
        this.f10171c.remove(fVar);
        if (this.f10169a > 0) {
            this.f10172d.remove(fVar);
        }
    }

    public final void f(o oVar) {
        int i2;
        b();
        replace(0, length(), (CharSequence) oVar.f997a);
        int i3 = oVar.f998b;
        if (i3 >= 0) {
            Selection.setSelection(this, i3, oVar.f999c);
        } else {
            Selection.removeSelection(this);
        }
        int i6 = oVar.f1000d;
        if (i6 < 0 || i6 >= (i2 = oVar.f1001e)) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f10180l.setComposingRegion(i6, i2);
        }
        this.f10173e.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i6) {
        super.setSpan(obj, i2, i3, i6);
        ArrayList arrayList = this.f10173e;
        String gVar = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        i iVar = new i();
        iVar.f10189e = selectionStart;
        iVar.f10190f = selectionEnd;
        iVar.f10191g = composingSpanStart;
        iVar.f10192h = composingSpanEnd;
        iVar.f10185a = gVar;
        iVar.f10186b = "";
        iVar.f10187c = -1;
        iVar.f10188d = -1;
        arrayList.add(iVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f10174f;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f10174f = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i6, int i7) {
        if (this.f10170b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String gVar = toString();
        int i8 = i3 - i2;
        boolean z = i8 != i7 - i6;
        for (int i9 = 0; i9 < i8 && !z; i9++) {
            z |= charAt(i2 + i9) != charSequence.charAt(i6 + i9);
        }
        if (z) {
            this.f10174f = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder replace = super.replace(i2, i3, charSequence, i6, i7);
        ArrayList arrayList = this.f10173e;
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        i iVar = new i();
        iVar.f10189e = selectionStart2;
        iVar.f10190f = selectionEnd2;
        iVar.f10191g = composingSpanStart2;
        iVar.f10192h = composingSpanEnd2;
        String charSequence2 = charSequence.toString();
        iVar.f10185a = gVar;
        iVar.f10186b = charSequence2;
        iVar.f10187c = i2;
        iVar.f10188d = i3;
        arrayList.add(iVar);
        if (this.f10169a > 0) {
            return replace;
        }
        d(z, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }
}
