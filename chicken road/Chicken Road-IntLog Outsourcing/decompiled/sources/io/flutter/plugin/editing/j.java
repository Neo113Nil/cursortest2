package io.flutter.plugin.editing;

import B0.n;
import E.C0042q;
import G2.o;
import android.graphics.Rect;
import android.os.Build;
import android.text.Selection;
import android.util.Log;
import android.util.SparseArray;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.plugin.platform.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w2.m;

/* loaded from: classes.dex */
public final class j implements f {

    /* renamed from: a, reason: collision with root package name */
    public final m f10193a;

    /* renamed from: b, reason: collision with root package name */
    public final InputMethodManager f10194b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f10195c;

    /* renamed from: d, reason: collision with root package name */
    public final x1.e f10196d;

    /* renamed from: e, reason: collision with root package name */
    public C0042q f10197e = new C0042q(1, 0);

    /* renamed from: f, reason: collision with root package name */
    public G2.m f10198f;

    /* renamed from: g, reason: collision with root package name */
    public SparseArray f10199g;

    /* renamed from: h, reason: collision with root package name */
    public g f10200h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10201i;

    /* renamed from: j, reason: collision with root package name */
    public d f10202j;

    /* renamed from: k, reason: collision with root package name */
    public final io.flutter.plugin.platform.m f10203k;

    /* renamed from: l, reason: collision with root package name */
    public final l f10204l;

    /* renamed from: m, reason: collision with root package name */
    public Rect f10205m;

    /* renamed from: n, reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f10206n;

    /* renamed from: o, reason: collision with root package name */
    public o f10207o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10208p;

    public j(m mVar, x1.e eVar, B1.g gVar, io.flutter.plugin.platform.m mVar2, l lVar) {
        this.f10193a = mVar;
        this.f10200h = new g(null, mVar);
        this.f10194b = (InputMethodManager) mVar.getContext().getSystemService("input_method");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f10195c = W1.h.e(mVar.getContext().getSystemService(W1.h.j()));
        } else {
            this.f10195c = null;
        }
        if (i2 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(mVar);
            this.f10206n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            imeSyncDeferringInsetsCallback.setImeVisibilityListener(new U.e(this));
        }
        this.f10196d = eVar;
        eVar.f12266b = new V0.j(13, this);
        ((H2.o) eVar.f12265a).a("TextInputClient.requestExistingInputState", null, null);
        this.f10203k = mVar2;
        mVar2.f10240f = this;
        this.f10204l = lVar;
        lVar.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (r10 == r0.f1001e) goto L38;
     */
    @Override // io.flutter.plugin.editing.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        AutofillManager autofillManager;
        AutofillValue forText;
        if (z) {
            String gVar = this.f10200h.toString();
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = this.f10195c) != null && this.f10199g != null) {
                int hashCode = ((String) this.f10198f.f990j.f167a).hashCode();
                forText = AutofillValue.forText(gVar);
                autofillManager.notifyValueChanged(this.f10193a, hashCode, forText);
            }
        }
        g gVar2 = this.f10200h;
        gVar2.getClass();
        int selectionStart = Selection.getSelectionStart(gVar2);
        g gVar3 = this.f10200h;
        gVar3.getClass();
        int selectionEnd = Selection.getSelectionEnd(gVar3);
        g gVar4 = this.f10200h;
        gVar4.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(gVar4);
        g gVar5 = this.f10200h;
        gVar5.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(gVar5);
        g gVar6 = this.f10200h;
        gVar6.getClass();
        ArrayList arrayList = gVar6.f10173e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.f10207o != null) {
            if (this.f10200h.toString().equals(this.f10207o.f997a)) {
                o oVar = this.f10207o;
                if (selectionStart == oVar.f998b) {
                    if (selectionEnd == oVar.f999c) {
                        if (composingSpanStart == oVar.f1000d) {
                        }
                    }
                }
            }
            this.f10200h.toString();
            boolean z5 = this.f10198f.f985e;
            x1.e eVar = this.f10196d;
            if (z5) {
                int i2 = this.f10197e.f632c;
                eVar.getClass();
                arrayList2.size();
                HashMap hashMap = new HashMap();
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    iVar.getClass();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("oldText", iVar.f10185a.toString());
                        jSONObject.put("deltaText", iVar.f10186b.toString());
                        jSONObject.put("deltaStart", iVar.f10187c);
                        jSONObject.put("deltaEnd", iVar.f10188d);
                        jSONObject.put("selectionBase", iVar.f10189e);
                        jSONObject.put("selectionExtent", iVar.f10190f);
                        jSONObject.put("composingBase", iVar.f10191g);
                        jSONObject.put("composingExtent", iVar.f10192h);
                    } catch (JSONException e3) {
                        Log.e("TextEditingDelta", "unable to create JSONObject: " + e3);
                    }
                    jSONArray.put(jSONObject);
                }
                hashMap.put("deltas", jSONArray);
                ((H2.o) eVar.f12265a).a("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i2), hashMap), null);
                this.f10200h.f10173e.clear();
            } else {
                int i3 = this.f10197e.f632c;
                String gVar7 = this.f10200h.toString();
                eVar.getClass();
                ((H2.o) eVar.f12265a).a("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i3), x1.e.q(gVar7, selectionStart, selectionEnd, composingSpanStart, composingSpanEnd)), null);
            }
            this.f10207o = new o(this.f10200h.toString(), selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
            return;
        }
        this.f10200h.f10173e.clear();
    }

    public final void b() {
        this.f10203k.f10240f = null;
        this.f10204l.getClass();
        this.f10196d.f12266b = null;
        c();
        this.f10200h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f10206n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void c() {
        AutofillManager autofillManager;
        G2.m mVar;
        n nVar;
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = this.f10195c) == null || (mVar = this.f10198f) == null || (nVar = mVar.f990j) == null || this.f10199g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f10193a, ((String) nVar.f167a).hashCode());
    }

    public final void d(G2.m mVar) {
        n nVar;
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (mVar == null || (nVar = mVar.f990j) == null) {
            this.f10199g = null;
            return;
        }
        SparseArray sparseArray = new SparseArray();
        this.f10199g = sparseArray;
        G2.m[] mVarArr = mVar.f992l;
        if (mVarArr == null) {
            sparseArray.put(((String) nVar.f167a).hashCode(), mVar);
            return;
        }
        for (G2.m mVar2 : mVarArr) {
            n nVar2 = mVar2.f990j;
            if (nVar2 != null) {
                SparseArray sparseArray2 = this.f10199g;
                String str = (String) nVar2.f167a;
                sparseArray2.put(str.hashCode(), mVar2);
                AutofillManager autofillManager = this.f10195c;
                int hashCode = str.hashCode();
                forText = AutofillValue.forText(((o) nVar2.f169c).f997a);
                autofillManager.notifyValueChanged(this.f10193a, hashCode, forText);
            }
        }
    }
}
