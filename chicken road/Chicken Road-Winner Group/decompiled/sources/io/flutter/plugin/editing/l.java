package io.flutter.plugin.editing;

import D.C0009j;
import S1.m;
import S1.o;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.text.Selection;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.startapp.sdk.internal.I;
import io.flutter.plugin.platform.q;
import io.flutter.plugin.platform.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l implements g {

    /* renamed from: a, reason: collision with root package name */
    public final View f9217a;

    /* renamed from: b, reason: collision with root package name */
    public final InputMethodManager f9218b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f9219c;

    /* renamed from: d, reason: collision with root package name */
    public final a1.e f9220d;

    /* renamed from: e, reason: collision with root package name */
    public C0009j f9221e = new C0009j(1, 0);
    public m f;

    /* renamed from: g, reason: collision with root package name */
    public SparseArray f9222g;

    /* renamed from: h, reason: collision with root package name */
    public h f9223h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9224i;

    /* renamed from: j, reason: collision with root package name */
    public InputConnection f9225j;

    /* renamed from: k, reason: collision with root package name */
    public final r f9226k;

    /* renamed from: l, reason: collision with root package name */
    public final q f9227l;

    /* renamed from: m, reason: collision with root package name */
    public Rect f9228m;

    /* renamed from: n, reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f9229n;

    /* renamed from: o, reason: collision with root package name */
    public o f9230o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9231p;

    public l(View view, a1.e eVar, b0.i iVar, r rVar, q qVar) {
        this.f9217a = view;
        this.f9223h = new h(null, view);
        this.f9218b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            this.f9219c = I.c(view.getContext().getSystemService(I.i()));
        } else {
            this.f9219c = null;
        }
        if (i3 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f9229n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            imeSyncDeferringInsetsCallback.setImeVisibilityListener(new k(this));
        }
        this.f9220d = eVar;
        eVar.f1789c = new b0.j(this);
        ((T1.o) eVar.f1788b).a("TextInputClient.requestExistingInputState", null, null);
        this.f9226k = rVar;
        rVar.f9306g = this;
        this.f9227l = qVar;
        qVar.f = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (r10 == r0.f1457e) goto L44;
     */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // io.flutter.plugin.editing.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z3) {
        AutofillManager autofillManager;
        AutofillValue forText;
        if (z3) {
            String hVar = this.f9223h.toString();
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = this.f9219c) != null && this.f9222g != null) {
                int hashCode = ((String) this.f.f1446j.f264d).hashCode();
                forText = AutofillValue.forText(hVar);
                autofillManager.notifyValueChanged(this.f9217a, hashCode, forText);
            }
        }
        h hVar2 = this.f9223h;
        hVar2.getClass();
        int selectionStart = Selection.getSelectionStart(hVar2);
        h hVar3 = this.f9223h;
        hVar3.getClass();
        int selectionEnd = Selection.getSelectionEnd(hVar3);
        h hVar4 = this.f9223h;
        hVar4.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(hVar4);
        h hVar5 = this.f9223h;
        hVar5.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(hVar5);
        h hVar6 = this.f9223h;
        hVar6.getClass();
        ArrayList arrayList = hVar6.f9198e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.f9230o != null) {
            if (this.f9223h.toString().equals(this.f9230o.f1453a)) {
                o oVar = this.f9230o;
                if (selectionStart == oVar.f1454b) {
                    if (selectionEnd == oVar.f1455c) {
                        if (composingSpanStart == oVar.f1456d) {
                        }
                    }
                }
            }
            this.f9223h.toString();
            boolean z4 = this.f.f1442e;
            a1.e eVar = this.f9220d;
            if (z4) {
                int i3 = this.f9221e.f246c;
                eVar.getClass();
                arrayList2.size();
                HashMap hashMap = new HashMap();
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    jVar.getClass();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("oldText", jVar.f9209a.toString());
                        jSONObject.put("deltaText", jVar.f9210b.toString());
                        jSONObject.put("deltaStart", jVar.f9211c);
                        jSONObject.put("deltaEnd", jVar.f9212d);
                        jSONObject.put("selectionBase", jVar.f9213e);
                        jSONObject.put("selectionExtent", jVar.f);
                        jSONObject.put("composingBase", jVar.f9214g);
                        jSONObject.put("composingExtent", jVar.f9215h);
                    } catch (JSONException e3) {
                        Log.e("TextEditingDelta", "unable to create JSONObject: " + e3);
                    }
                    jSONArray.put(jSONObject);
                }
                hashMap.put("deltas", jSONArray);
                ((T1.o) eVar.f1788b).a("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i3), hashMap), null);
                this.f9223h.f9198e.clear();
            } else {
                int i4 = this.f9221e.f246c;
                String hVar7 = this.f9223h.toString();
                eVar.getClass();
                ((T1.o) eVar.f1788b).a("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i4), a1.e.v(hVar7, selectionStart, selectionEnd, composingSpanStart, composingSpanEnd)), null);
            }
            this.f9230o = new o(this.f9223h.toString(), selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
            return;
        }
        this.f9223h.f9198e.clear();
    }

    public final void b(int i3) {
        C0009j c0009j = this.f9221e;
        int i4 = c0009j.f245b;
        if ((i4 == 3 || i4 == 4) && c0009j.f246c == i3) {
            this.f9221e = new C0009j(1, 0);
            d();
            View view = this.f9217a;
            IBinder applicationWindowToken = view.getApplicationWindowToken();
            InputMethodManager inputMethodManager = this.f9218b;
            inputMethodManager.hideSoftInputFromWindow(applicationWindowToken, 0);
            inputMethodManager.restartInput(view);
            this.f9224i = false;
        }
    }

    public final void c() {
        this.f9226k.f9306g = null;
        this.f9227l.f = null;
        this.f9220d.f1789c = null;
        d();
        this.f9223h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f9229n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void d() {
        AutofillManager autofillManager;
        m mVar;
        D0.a aVar;
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = this.f9219c) == null || (mVar = this.f) == null || (aVar = mVar.f1446j) == null || this.f9222g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f9217a, ((String) aVar.f264d).hashCode());
    }

    public final void e(m mVar) {
        D0.a aVar;
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (mVar == null || (aVar = mVar.f1446j) == null) {
            this.f9222g = null;
            return;
        }
        SparseArray sparseArray = new SparseArray();
        this.f9222g = sparseArray;
        m[] mVarArr = mVar.f1448l;
        if (mVarArr == null) {
            sparseArray.put(((String) aVar.f264d).hashCode(), mVar);
            return;
        }
        for (m mVar2 : mVarArr) {
            D0.a aVar2 = mVar2.f1446j;
            if (aVar2 != null) {
                SparseArray sparseArray2 = this.f9222g;
                String str = (String) aVar2.f264d;
                sparseArray2.put(str.hashCode(), mVar2);
                AutofillManager autofillManager = this.f9219c;
                int hashCode = str.hashCode();
                forText = AutofillValue.forText(((o) aVar2.f262b).f1453a);
                autofillManager.notifyValueChanged(this.f9217a, hashCode, forText);
            }
        }
    }
}
