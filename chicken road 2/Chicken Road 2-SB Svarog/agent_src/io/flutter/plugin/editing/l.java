package io.flutter.plugin.editing;

import F.AbstractC0000a;
import F.t;
import O.p;
import O.r;
import android.graphics.Rect;
import android.os.Build;
import android.text.Selection;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    public final View f646a;

    /* renamed from: b, reason: collision with root package name */
    public final InputMethodManager f647b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f648c;

    /* renamed from: d, reason: collision with root package name */
    public final C.a f649d;

    /* renamed from: e, reason: collision with root package name */
    public k f650e = new k(1, 0);

    /* renamed from: f, reason: collision with root package name */
    public p f651f;

    /* renamed from: g, reason: collision with root package name */
    public SparseArray f652g;

    /* renamed from: h, reason: collision with root package name */
    public f f653h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f654i;

    /* renamed from: j, reason: collision with root package name */
    public c f655j;

    /* renamed from: k, reason: collision with root package name */
    public final io.flutter.plugin.platform.k f656k;

    /* renamed from: l, reason: collision with root package name */
    public final io.flutter.plugin.platform.j f657l;

    /* renamed from: m, reason: collision with root package name */
    public Rect f658m;

    /* renamed from: n, reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f659n;

    /* renamed from: o, reason: collision with root package name */
    public r f660o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f661p;

    public l(View view, C.a aVar, t tVar, io.flutter.plugin.platform.k kVar, io.flutter.plugin.platform.j jVar) {
        this.f646a = view;
        this.f653h = new f(null, view);
        this.f647b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f648c = AbstractC0000a.d(view.getContext().getSystemService(AbstractC0000a.j()));
        } else {
            this.f648c = null;
        }
        if (i2 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f659n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            imeSyncDeferringInsetsCallback.setImeVisibilityListener(new i(this));
        }
        this.f649d = aVar;
        aVar.f5d = new i(this);
        ((E.b) aVar.f4c).e("TextInputClient.requestExistingInputState", null, null);
        this.f656k = kVar;
        kVar.f695g = this;
        this.f657l = jVar;
        jVar.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r7 == r0.f358e) goto L38;
     */
    @Override // io.flutter.plugin.editing.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z2) {
        AutofillManager autofillManager;
        AutofillValue forText;
        if (z2) {
            String fVar = this.f653h.toString();
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = this.f648c) != null && this.f652g != null) {
                int hashCode = ((String) this.f651f.f347j.f8a).hashCode();
                forText = AutofillValue.forText(fVar);
                autofillManager.notifyValueChanged(this.f646a, hashCode, forText);
            }
        }
        f fVar2 = this.f653h;
        fVar2.getClass();
        int selectionStart = Selection.getSelectionStart(fVar2);
        f fVar3 = this.f653h;
        fVar3.getClass();
        int selectionEnd = Selection.getSelectionEnd(fVar3);
        f fVar4 = this.f653h;
        fVar4.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(fVar4);
        f fVar5 = this.f653h;
        fVar5.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(fVar5);
        f fVar6 = this.f653h;
        fVar6.getClass();
        ArrayList arrayList = fVar6.f620f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.f660o != null) {
            if (this.f653h.toString().equals(this.f660o.f354a)) {
                r rVar = this.f660o;
                if (selectionStart == rVar.f355b) {
                    if (selectionEnd == rVar.f356c) {
                        if (composingSpanStart == rVar.f357d) {
                        }
                    }
                }
            }
            this.f653h.toString();
            boolean z3 = this.f651f.f342e;
            C.a aVar = this.f649d;
            if (z3) {
                int i2 = this.f650e.f645b;
                aVar.getClass();
                arrayList2.size();
                HashMap hashMap = new HashMap();
                JSONArray jSONArray = new JSONArray();
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    int i4 = i3 + 1;
                    h hVar = (h) arrayList2.get(i3);
                    hVar.getClass();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("oldText", hVar.f632a.toString());
                        jSONObject.put("deltaText", hVar.f633b.toString());
                        jSONObject.put("deltaStart", hVar.f634c);
                        jSONObject.put("deltaEnd", hVar.f635d);
                        jSONObject.put("selectionBase", hVar.f636e);
                        jSONObject.put("selectionExtent", hVar.f637f);
                        jSONObject.put("composingBase", hVar.f638g);
                        jSONObject.put("composingExtent", hVar.f639h);
                    } catch (JSONException e2) {
                        Log.e("TextEditingDelta", "unable to create JSONObject: " + e2);
                    }
                    jSONArray.put(jSONObject);
                    i3 = i4;
                }
                hashMap.put("deltas", jSONArray);
                ((E.b) aVar.f4c).e("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i2), hashMap), null);
                this.f653h.f620f.clear();
            } else {
                int i5 = this.f650e.f645b;
                String fVar7 = this.f653h.toString();
                aVar.getClass();
                ((E.b) aVar.f4c).e("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i5), C.a.x(fVar7, selectionStart, selectionEnd, composingSpanStart, composingSpanEnd)), null);
            }
            this.f660o = new r(this.f653h.toString(), selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
            return;
        }
        this.f653h.f620f.clear();
    }

    public final void b() {
        this.f656k.f695g = null;
        this.f657l.getClass();
        this.f649d.f5d = null;
        c();
        this.f653h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f659n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void c() {
        AutofillManager autofillManager;
        p pVar;
        C.e eVar;
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = this.f648c) == null || (pVar = this.f651f) == null || (eVar = pVar.f347j) == null || this.f652g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f646a, ((String) eVar.f8a).hashCode());
    }

    public final void d(p pVar) {
        C.e eVar;
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (pVar == null || (eVar = pVar.f347j) == null) {
            this.f652g = null;
            return;
        }
        p[] pVarArr = pVar.f349l;
        SparseArray sparseArray = new SparseArray();
        this.f652g = sparseArray;
        if (pVarArr == null) {
            sparseArray.put(((String) eVar.f8a).hashCode(), pVar);
            return;
        }
        for (p pVar2 : pVarArr) {
            C.e eVar2 = pVar2.f347j;
            if (eVar2 != null) {
                String str = (String) eVar2.f8a;
                this.f652g.put(str.hashCode(), pVar2);
                AutofillManager autofillManager = this.f648c;
                int hashCode = str.hashCode();
                forText = AutofillValue.forText(((r) eVar2.f10c).f354a);
                autofillManager.notifyValueChanged(this.f646a, hashCode, forText);
            }
        }
    }
}
