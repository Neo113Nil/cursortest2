package io.flutter.plugin.editing;

/* loaded from: classes.dex */
public final class j implements io.flutter.plugin.editing.e {

    /* renamed from: a, reason: collision with root package name */
    public final P0.t f7724a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.inputmethod.InputMethodManager f7725b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.autofill.AutofillManager f7726c;

    /* renamed from: d, reason: collision with root package name */
    public final x0.e f7727d;

    /* renamed from: e, reason: collision with root package name */
    public P.C0039l f7728e = new P.C0039l(1, 0);

    /* renamed from: f, reason: collision with root package name */
    public Z0.n f7729f;

    /* renamed from: g, reason: collision with root package name */
    public android.util.SparseArray f7730g;

    /* renamed from: h, reason: collision with root package name */
    public io.flutter.plugin.editing.f f7731h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7732i;

    /* renamed from: j, reason: collision with root package name */
    public io.flutter.plugin.editing.c f7733j;

    /* renamed from: k, reason: collision with root package name */
    public final io.flutter.plugin.platform.k f7734k;

    /* renamed from: l, reason: collision with root package name */
    public final io.flutter.plugin.platform.j f7735l;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Rect f7736m;

    /* renamed from: n, reason: collision with root package name */
    public final io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback f7737n;

    /* renamed from: o, reason: collision with root package name */
    public Z0.p f7738o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7739p;

    public j(P0.t tVar, x0.e eVar, Z0.h hVar, io.flutter.plugin.platform.k kVar, io.flutter.plugin.platform.j jVar) {
        this.f7724a = tVar;
        this.f7731h = new io.flutter.plugin.editing.f(null, tVar);
        this.f7725b = (android.view.inputmethod.InputMethodManager) tVar.getContext().getSystemService("input_method");
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f7726c = P0.AbstractC0043a.e(tVar.getContext().getSystemService(P0.AbstractC0043a.j()));
        } else {
            this.f7726c = null;
        }
        if (i2 >= 30) {
            io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback(tVar);
            this.f7737n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            imeSyncDeferringInsetsCallback.setImeVisibilityListener(new io.flutter.plugin.editing.i(this));
        }
        this.f7727d = eVar;
        eVar.f8410c = new io.flutter.plugin.editing.i(this);
        ((I0.b) eVar.f8409b).G("TextInputClient.requestExistingInputState", null, null);
        this.f7734k = kVar;
        kVar.f7771f = this;
        this.f7735l = jVar;
        jVar.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (r10 == r0.f1941e) goto L38;
     */
    @Override // io.flutter.plugin.editing.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z2) {
        android.view.autofill.AutofillManager autofillManager;
        android.view.autofill.AutofillValue forText;
        if (z2) {
            java.lang.String fVar = this.f7731h.toString();
            if (android.os.Build.VERSION.SDK_INT >= 26 && (autofillManager = this.f7726c) != null && this.f7730g != null) {
                int hashCode = ((java.lang.String) this.f7729f.f1930j.f498a).hashCode();
                forText = android.view.autofill.AutofillValue.forText(fVar);
                autofillManager.notifyValueChanged(this.f7724a, hashCode, forText);
            }
        }
        io.flutter.plugin.editing.f fVar2 = this.f7731h;
        fVar2.getClass();
        int selectionStart = android.text.Selection.getSelectionStart(fVar2);
        io.flutter.plugin.editing.f fVar3 = this.f7731h;
        fVar3.getClass();
        int selectionEnd = android.text.Selection.getSelectionEnd(fVar3);
        io.flutter.plugin.editing.f fVar4 = this.f7731h;
        fVar4.getClass();
        int composingSpanStart = android.view.inputmethod.BaseInputConnection.getComposingSpanStart(fVar4);
        io.flutter.plugin.editing.f fVar5 = this.f7731h;
        fVar5.getClass();
        int composingSpanEnd = android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(fVar5);
        io.flutter.plugin.editing.f fVar6 = this.f7731h;
        fVar6.getClass();
        java.util.ArrayList arrayList = fVar6.f7703e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
        arrayList.clear();
        if (this.f7738o != null) {
            if (this.f7731h.toString().equals(this.f7738o.f1937a)) {
                Z0.p pVar = this.f7738o;
                if (selectionStart == pVar.f1938b) {
                    if (selectionEnd == pVar.f1939c) {
                        if (composingSpanStart == pVar.f1940d) {
                        }
                    }
                }
            }
            this.f7731h.toString();
            boolean z3 = this.f7729f.f1925e;
            x0.e eVar = this.f7727d;
            if (z3) {
                int i2 = this.f7728e.f1286c;
                eVar.getClass();
                arrayList2.size();
                java.util.HashMap hashMap = new java.util.HashMap();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    io.flutter.plugin.editing.h hVar = (io.flutter.plugin.editing.h) it.next();
                    hVar.getClass();
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("oldText", hVar.f7715a.toString());
                        jSONObject.put("deltaText", hVar.f7716b.toString());
                        jSONObject.put("deltaStart", hVar.f7717c);
                        jSONObject.put("deltaEnd", hVar.f7718d);
                        jSONObject.put("selectionBase", hVar.f7719e);
                        jSONObject.put("selectionExtent", hVar.f7720f);
                        jSONObject.put("composingBase", hVar.f7721g);
                        jSONObject.put("composingExtent", hVar.f7722h);
                    } catch (org.json.JSONException e2) {
                        android.util.Log.e("TextEditingDelta", "unable to create JSONObject: " + e2);
                    }
                    jSONArray.put(jSONObject);
                }
                hashMap.put("deltas", jSONArray);
                ((I0.b) eVar.f8409b).G("TextInputClient.updateEditingStateWithDeltas", java.util.Arrays.asList(java.lang.Integer.valueOf(i2), hashMap), null);
                this.f7731h.f7703e.clear();
            } else {
                int i3 = this.f7728e.f1286c;
                java.lang.String fVar7 = this.f7731h.toString();
                eVar.getClass();
                ((I0.b) eVar.f8409b).G("TextInputClient.updateEditingState", java.util.Arrays.asList(java.lang.Integer.valueOf(i3), x0.e.p(fVar7, selectionStart, selectionEnd, composingSpanStart, composingSpanEnd)), null);
            }
            this.f7738o = new Z0.p(this.f7731h.toString(), selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
            return;
        }
        this.f7731h.f7703e.clear();
    }

    public final void b() {
        this.f7734k.f7771f = null;
        this.f7735l.getClass();
        this.f7727d.f8410c = null;
        c();
        this.f7731h.e(this);
        io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f7737n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void c() {
        android.view.autofill.AutofillManager autofillManager;
        Z0.n nVar;
        F.C0014n c0014n;
        if (android.os.Build.VERSION.SDK_INT < 26 || (autofillManager = this.f7726c) == null || (nVar = this.f7729f) == null || (c0014n = nVar.f1930j) == null || this.f7730g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f7724a, ((java.lang.String) c0014n.f498a).hashCode());
    }

    public final void d(Z0.n nVar) {
        F.C0014n c0014n;
        android.view.autofill.AutofillValue forText;
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (nVar == null || (c0014n = nVar.f1930j) == null) {
            this.f7730g = null;
            return;
        }
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        this.f7730g = sparseArray;
        Z0.n[] nVarArr = nVar.f1932l;
        if (nVarArr == null) {
            sparseArray.put(((java.lang.String) c0014n.f498a).hashCode(), nVar);
            return;
        }
        for (Z0.n nVar2 : nVarArr) {
            F.C0014n c0014n2 = nVar2.f1930j;
            if (c0014n2 != null) {
                android.util.SparseArray sparseArray2 = this.f7730g;
                java.lang.String str = (java.lang.String) c0014n2.f498a;
                sparseArray2.put(str.hashCode(), nVar2);
                android.view.autofill.AutofillManager autofillManager = this.f7726c;
                int hashCode = str.hashCode();
                forText = android.view.autofill.AutofillValue.forText(((Z0.p) c0014n2.f500c).f1937a);
                autofillManager.notifyValueChanged(this.f7724a, hashCode, forText);
            }
        }
    }
}
