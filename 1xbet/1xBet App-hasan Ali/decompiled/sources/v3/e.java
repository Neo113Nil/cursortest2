package v3;

import A0.C;
import A0.C0040k0;
import A0.F;
import A0.InterfaceC0044l1;
import D3.h;
import D3.o;
import E.X;
import L4.C0229l;
import O0.q;
import P.InterfaceC0284c;
import R1.j;
import W0.m;
import X.k;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractServiceC0494x;
import androidx.lifecycle.C0493w;
import androidx.lifecycle.EnumC0486o;
import androidx.lifecycle.Q;
import androidx.work.OverwritingInputMerger;
import androidx.work.impl.WorkDatabase_Impl;
import c0.C0533b;
import com.google.android.gms.internal.ads.Q7;
import e2.C1930k;
import f1.AbstractC1940b;
import f1.InterfaceC1942d;
import f2.C1945c;
import f2.C1947e;
import f2.C1948f;
import g1.AbstractC1970d;
import g3.InterfaceC1983a;
import i0.InterfaceC2009n;
import i4.InterfaceC2015a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import k0.C2022b;
import k0.C2023c;
import kotlin.jvm.internal.l;
import l3.C2054a;
import n.C2138i;
import o2.i;
import org.xmlpull.v1.XmlPullParserException;
import p2.ExecutorC2251i;
import r.C2321G;
import r.r;
import r0.AbstractC2346c;
import r2.InterfaceC2348a;
import t2.C2421i;
import v1.n;
import v1.p;
import v1.s;
import v1.v;
import v1.w;
import w0.AbstractC2540a;
import w1.C2542a;
import x0.K;
import z0.C2731G;
import z0.EnumC2762t;
import z0.c0;
import z0.w0;

/* loaded from: classes.dex */
public final class e implements InterfaceC1983a, D2.f, R0.c, Y.e, InterfaceC2348a, InterfaceC0284c {

    /* renamed from: o, reason: collision with root package name */
    public static e f20430o;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f20431k;

    /* renamed from: l, reason: collision with root package name */
    public Object f20432l;

    /* renamed from: m, reason: collision with root package name */
    public Object f20433m;

    /* renamed from: n, reason: collision with root package name */
    public Object f20434n;

    public e(Q7 q7, Context context, Uri uri) {
        this.f20431k = 11;
        this.f20433m = q7;
        this.f20432l = context;
        this.f20434n = uri;
    }

    public static e G(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new e(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public static final SharedPreferences S(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void T(Context context) {
        if (S(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
        throw new d("Failed to store the app set ID last used time.");
    }

    public static final void m(e eVar, Network network, boolean z3) {
        boolean z5;
        Network[] allNetworks = ((ConnectivityManager) eVar.f20432l).getAllNetworks();
        int length = allNetworks.length;
        boolean z6 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (l.a(network2, network)) {
                z5 = z3;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) eVar.f20432l).getNetworkCapabilities(network2);
                z5 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z5) {
                z6 = true;
                break;
            }
            i++;
        }
        H2.l lVar = (H2.l) eVar.f20433m;
        synchronized (lVar) {
            try {
                if (((C2421i) lVar.f2303k.get()) != null) {
                    lVar.f2307o = z6;
                } else {
                    lVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean s(Editable editable, KeyEvent keyEvent, boolean z3) {
        w[] wVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (wVarArr = (w[]) editable.getSpans(selectionStart, selectionEnd, w.class)) != null && wVarArr.length > 0) {
                for (w wVar : wVarArr) {
                    int spanStart = editable.getSpanStart(wVar);
                    int spanEnd = editable.getSpanEnd(wVar);
                    if ((z3 && spanStart == selectionStart) || ((!z3 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public long A() {
        return ((C2022b) this.f20434n).f17539k.f17538d;
    }

    public o2.d B(String str) {
        j b3 = j.b("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            b3.i(1);
        } else {
            b3.k(str, 1);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f20432l;
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(b3);
        try {
            return g5.moveToFirst() ? new o2.d(g5.getString(G4.d.t(g5, "work_spec_id")), g5.getInt(G4.d.t(g5, "system_id"))) : null;
        } finally {
            g5.close();
            b3.l();
        }
    }

    public boolean C(CharSequence charSequence, int i, int i5, v vVar) {
        if ((vVar.f20383c & 3) == 0) {
            v1.e eVar = (v1.e) this.f20434n;
            C2542a b3 = vVar.b();
            int a5 = b3.a(8);
            if (a5 != 0) {
                ((ByteBuffer) b3.f6158n).getShort(a5 + b3.f6155k);
            }
            eVar.getClass();
            ThreadLocal threadLocal = v1.e.f20337b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i5) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = eVar.f20338a.hasGlyph(sb.toString());
            int i6 = vVar.f20383c & 4;
            vVar.f20383c = hasGlyph ? i6 | 2 : i6 | 1;
        }
        return (vVar.f20383c & 3) == 2;
    }

    public void D(o2.d dVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f20432l;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((o2.b) this.f20433m).e(dVar);
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    public boolean E() {
        return !(((w0) ((C2138i) this.f20432l).f18249l).isEmpty() && ((w0) ((C2138i) this.f20434n).f18249l).isEmpty() && ((w0) ((C2138i) this.f20433m).f18249l).isEmpty());
    }

    public boolean F() {
        if (((q) this.f20432l).f4042k != this.f20434n) {
            return true;
        }
        e eVar = (e) this.f20433m;
        return eVar != null && eVar.F();
    }

    public void H(EnumC0486o enumC0486o) {
        Q q5 = (Q) this.f20434n;
        if (q5 != null) {
            q5.run();
        }
        Q q6 = new Q((C0493w) this.f20432l, enumC0486o);
        this.f20434n = q6;
        ((Handler) this.f20433m).postAtFrontOfQueue(q6);
    }

    public Object I(CharSequence charSequence, int i, int i5, int i6, boolean z3, n nVar) {
        int i7;
        char c5;
        p pVar = new p((s) ((m2.g) this.f20433m).f17996n);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z5 = true;
        int i8 = 0;
        int i9 = i;
        loop0: while (true) {
            i7 = i9;
            while (i9 < i5 && i8 < i6 && z5) {
                SparseArray sparseArray = pVar.f20359c.f20374a;
                s sVar = sparseArray == null ? null : (s) sparseArray.get(codePointAt);
                if (pVar.f20357a == 2) {
                    if (sVar != null) {
                        pVar.f20359c = sVar;
                        pVar.f++;
                    } else {
                        if (codePointAt == 65038) {
                            pVar.a();
                        } else if (codePointAt != 65039) {
                            s sVar2 = pVar.f20359c;
                            if (sVar2.f20375b != null) {
                                if (pVar.f != 1) {
                                    pVar.f20360d = sVar2;
                                    pVar.a();
                                } else if (pVar.b()) {
                                    pVar.f20360d = pVar.f20359c;
                                    pVar.a();
                                } else {
                                    pVar.a();
                                }
                                c5 = 3;
                            } else {
                                pVar.a();
                            }
                        }
                        c5 = 1;
                    }
                    c5 = 2;
                } else if (sVar == null) {
                    pVar.a();
                    c5 = 1;
                } else {
                    pVar.f20357a = 2;
                    pVar.f20359c = sVar;
                    pVar.f = 1;
                    c5 = 2;
                }
                pVar.f20361e = codePointAt;
                if (c5 == 1) {
                    i9 = Character.charCount(Character.codePointAt(charSequence, i7)) + i7;
                    if (i9 < i5) {
                        codePointAt = Character.codePointAt(charSequence, i9);
                    }
                } else if (c5 == 2) {
                    int charCount = Character.charCount(codePointAt) + i9;
                    if (charCount < i5) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i9 = charCount;
                } else if (c5 == 3) {
                    if (z3 || !C(charSequence, i7, i9, pVar.f20360d.f20375b)) {
                        z5 = nVar.b(charSequence, i7, i9, pVar.f20360d.f20375b);
                        i8++;
                    }
                }
            }
        }
        if (pVar.f20357a == 2 && pVar.f20359c.f20375b != null && ((pVar.f > 1 || pVar.b()) && i8 < i6 && z5 && (z3 || !C(charSequence, i7, i9, pVar.f20359c.f20375b)))) {
            nVar.b(charSequence, i7, i9, pVar.f20359c.f20375b);
        }
        return nVar.a();
    }

    public void J() {
        ((TypedArray) this.f20433m).recycle();
    }

    public void K(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f20432l;
        workDatabase_Impl.b();
        o2.e eVar = (o2.e) this.f20434n;
        Y1.f a5 = eVar.a();
        if (str == null) {
            a5.h(1);
        } else {
            a5.i(str, 1);
        }
        workDatabase_Impl.c();
        try {
            a5.r();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(a5);
        }
    }

    public void L(Object obj) {
        long b3 = X.e.b();
        if (b3 == X.l.f6064a) {
            this.f20434n = obj;
            return;
        }
        synchronized (this.f20433m) {
            k kVar = (k) ((AtomicReference) this.f20432l).get();
            int a5 = kVar.a(b3);
            if (a5 < 0) {
                ((AtomicReference) this.f20432l).set(kVar.b(b3, obj));
            } else {
                kVar.f6063c[a5] = obj;
            }
        }
    }

    public void M(InterfaceC2009n interfaceC2009n) {
        ((C2022b) this.f20434n).f17539k.f17537c = interfaceC2009n;
    }

    public void N(W0.c cVar) {
        ((C2022b) this.f20434n).f17539k.f17535a = cVar;
    }

    public void O(m mVar) {
        ((C2022b) this.f20434n).f17539k.f17536b = mVar;
    }

    public void P(long j5) {
        ((C2022b) this.f20434n).f17539k.f17538d = j5;
    }

    public void Q() {
        C2321G c2321g = (C2321G) this.f20432l;
        String str = (String) this.f20433m;
        List list = (List) c2321g.k(str);
        if (list != null) {
            list.remove((InterfaceC2015a) this.f20434n);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        c2321g.m(str, list);
    }

    public void R(String str, double d5, double d6) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i = 0;
        while (true) {
            arrayList = (ArrayList) this.f20432l;
            int size = arrayList.size();
            arrayList2 = (ArrayList) this.f20433m;
            arrayList3 = (ArrayList) this.f20434n;
            if (i >= size) {
                break;
            }
            double doubleValue = ((Double) arrayList3.get(i)).doubleValue();
            double doubleValue2 = ((Double) arrayList2.get(i)).doubleValue();
            if (d5 < doubleValue || (doubleValue == d5 && d6 < doubleValue2)) {
                break;
            } else {
                i++;
            }
        }
        arrayList.add(i, str);
        arrayList3.add(i, Double.valueOf(d5));
        arrayList2.add(i, Double.valueOf(d6));
    }

    @Override // P.InterfaceC0284c
    public void a(int i, Object obj) {
        ((C2731G) this.f20434n).B(i, (C2731G) obj);
    }

    @Override // R0.c
    public R0.b b() {
        LocaleList localeList;
        int size;
        Locale locale;
        localeList = LocaleList.getDefault();
        synchronized (((Q1.j) this.f20434n)) {
            try {
                R0.b bVar = (R0.b) this.f20433m;
                if (bVar != null && localeList == ((LocaleList) this.f20432l)) {
                    return bVar;
                }
                size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    locale = localeList.get(i);
                    arrayList.add(new R0.a(locale));
                }
                R0.b bVar2 = new R0.b(arrayList);
                this.f20432l = localeList;
                this.f20433m = bVar2;
                return bVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // P.InterfaceC0284c
    public void c(Object obj) {
        ((ArrayList) this.f20433m).add(this.f20434n);
        this.f20434n = obj;
    }

    @Override // g3.InterfaceC1983a
    public o d() {
        D3.f fVar = new D3.f();
        ((ExecutorService) this.f20434n).execute(new h(28, this, fVar, false));
        return fVar.f946a;
    }

    @Override // P.InterfaceC0284c
    public void e(i4.e eVar, Object obj) {
        eVar.invoke(this.f20434n, obj);
    }

    @Override // P.InterfaceC0284c
    public void f() {
        C0533b c0533b;
        C2731G c2731g = (C2731G) this.f20434n;
        if (!c2731g.I()) {
            AbstractC2540a.a("onReuse is only expected on attached node");
        }
        Z0.q qVar = c2731g.f21637x;
        if (qVar != null) {
            View view = qVar.f6295l;
            if (view.getParent() != qVar) {
                qVar.addView(view);
            } else {
                qVar.f6299p.invoke();
            }
        }
        K k5 = c2731g.f21614Q;
        if (k5 != null) {
            k5.c(false);
        }
        c2731g.f21602C = false;
        boolean z3 = c2731g.f21623Z;
        c0 c0Var = c2731g.f21612O;
        if (z3) {
            c2731g.f21623Z = false;
        } else {
            for (b0.o oVar = c0Var.f21770e; oVar != null; oVar = oVar.f7166o) {
                if (oVar.f7175x) {
                    oVar.t0();
                }
            }
            b0.o oVar2 = c0Var.f21770e;
            for (b0.o oVar3 = oVar2; oVar3 != null; oVar3 = oVar3.f7166o) {
                if (oVar3.f7175x) {
                    oVar3.v0();
                }
            }
            while (oVar2 != null) {
                if (oVar2.f7175x) {
                    oVar2.n0();
                }
                oVar2 = oVar2.f7166o;
            }
        }
        int i = c2731g.f21625l;
        c2731g.f21625l = H0.k.f2107a.addAndGet(1);
        F f = c2731g.f21636w;
        if (f != null) {
            f.getLayoutNodes().f(i);
            f.getLayoutNodes().g(c2731g.f21625l, c2731g);
        }
        for (b0.o oVar4 = c0Var.f; oVar4 != null; oVar4 = oVar4.f7167p) {
            oVar4.m0();
        }
        c0Var.e();
        if (c0Var.d(8)) {
            c2731g.G();
        }
        C2731G.X(c2731g);
        F f5 = c2731g.f21636w;
        if (f5 != null) {
            if (F.g() && (c0533b = f5.f217P) != null) {
                r.w wVar = c0533b.f7383g;
                boolean e3 = wVar.e(i);
                F f6 = c0533b.f7380c;
                C1930k c1930k = c0533b.f7378a;
                if (e3) {
                    c1930k.l(f6, i, false);
                }
                H0.j w5 = c2731g.w();
                if (w5 != null) {
                    if (w5.f2103k.b(H0.s.f2171q)) {
                        wVar.a(c2731g.f21625l);
                        c1930k.l(f6, c2731g.f21625l, true);
                    }
                }
            }
            f5.getRectManager().g(c2731g, true);
        }
    }

    @Override // D2.f
    public boolean g() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f20432l;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // P.InterfaceC0284c
    public /* bridge */ /* synthetic */ void h(int i, Object obj) {
    }

    @Override // P.InterfaceC0284c
    public void i() {
        F f = ((C2731G) this.f20432l).f21636w;
        if (f != null) {
            f.A();
        }
    }

    @Override // P.InterfaceC0284c
    public void j(int i, int i5, int i6) {
        ((C2731G) this.f20434n).M(i, i5, i6);
    }

    @Override // P.InterfaceC0284c
    public void k(int i, int i5) {
        ((C2731G) this.f20434n).R(i, i5);
    }

    @Override // R0.c
    public Locale l(String str) {
        Locale forLanguageTag = Locale.forLanguageTag(str);
        if (l.a(forLanguageTag.toLanguageTag(), "und")) {
            Log.e("Locale", "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return forLanguageTag;
    }

    public void n(C2731G c2731g, EnumC2762t enumC2762t) {
        int ordinal = enumC2762t.ordinal();
        C2138i c2138i = (C2138i) this.f20432l;
        C2138i c2138i2 = (C2138i) this.f20434n;
        if (ordinal == 0) {
            c2138i.b(c2731g);
            c2138i2.b(c2731g);
            return;
        }
        C2138i c2138i3 = (C2138i) this.f20433m;
        if (ordinal == 1) {
            c2138i3.b(c2731g);
            c2138i2.b(c2731g);
            return;
        }
        if (ordinal == 2) {
            if (c2731g.f21630q != null) {
                c2138i2.b(c2731g);
                return;
            } else {
                c2138i.b(c2731g);
                return;
            }
        }
        if (ordinal != 3) {
            throw new D2.e();
        }
        if (c2731g.f21630q != null) {
            c2138i2.b(c2731g);
        } else {
            c2138i3.b(c2731g);
        }
    }

    @Override // P.InterfaceC0284c
    public void o() {
        this.f20434n = ((ArrayList) this.f20433m).remove(r0.size() - 1);
    }

    public f2.n p() {
        UUID uuid = (UUID) this.f20432l;
        i iVar = (i) this.f20433m;
        HashSet hashSet = (HashSet) this.f20434n;
        f2.n nVar = new f2.n();
        nVar.f17004a = uuid;
        nVar.f17005b = iVar;
        nVar.f17006c = hashSet;
        C1945c c1945c = iVar.f18640j;
        boolean z3 = (Build.VERSION.SDK_INT >= 24 && c1945c.f16988h.f16991a.size() > 0) || c1945c.f16985d || c1945c.f16983b || c1945c.f16984c;
        if (((i) this.f20433m).f18647q && z3) {
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }
        this.f20432l = UUID.randomUUID();
        i iVar2 = (i) this.f20433m;
        i iVar3 = new i();
        iVar3.f18634b = 1;
        C1948f c1948f = C1948f.f16993c;
        iVar3.f18637e = c1948f;
        iVar3.f = c1948f;
        iVar3.f18640j = C1945c.i;
        iVar3.f18642l = 1;
        iVar3.f18643m = 30000L;
        iVar3.f18646p = -1L;
        iVar3.f18648r = 1;
        iVar3.f18633a = iVar2.f18633a;
        iVar3.f18635c = iVar2.f18635c;
        iVar3.f18634b = iVar2.f18634b;
        iVar3.f18636d = iVar2.f18636d;
        iVar3.f18637e = new C1948f(iVar2.f18637e);
        iVar3.f = new C1948f(iVar2.f);
        iVar3.f18638g = iVar2.f18638g;
        iVar3.f18639h = iVar2.f18639h;
        iVar3.i = iVar2.i;
        C1945c c1945c2 = iVar2.f18640j;
        C1945c c1945c3 = new C1945c();
        c1945c3.f16982a = 1;
        c1945c3.f = -1L;
        c1945c3.f16987g = -1L;
        c1945c3.f16988h = new C1947e();
        c1945c3.f16983b = c1945c2.f16983b;
        c1945c3.f16984c = c1945c2.f16984c;
        c1945c3.f16982a = c1945c2.f16982a;
        c1945c3.f16985d = c1945c2.f16985d;
        c1945c3.f16986e = c1945c2.f16986e;
        c1945c3.f16988h = c1945c2.f16988h;
        iVar3.f18640j = c1945c3;
        iVar3.f18641k = iVar2.f18641k;
        iVar3.f18642l = iVar2.f18642l;
        iVar3.f18643m = iVar2.f18643m;
        iVar3.f18644n = iVar2.f18644n;
        iVar3.f18645o = iVar2.f18645o;
        iVar3.f18646p = iVar2.f18646p;
        iVar3.f18647q = iVar2.f18647q;
        iVar3.f18648r = iVar2.f18648r;
        this.f20433m = iVar3;
        iVar3.f18633a = ((UUID) this.f20432l).toString();
        return nVar;
    }

    public void q() {
        ((ArrayList) this.f20433m).clear();
        this.f20434n = (C2731G) this.f20432l;
        ((C2731G) this.f20432l).Q();
    }

    public boolean r(C2731G c2731g) {
        return !(c2731g.f21630q == null) && (((w0) ((C2138i) this.f20432l).f18249l).contains(c2731g) || ((w0) ((C2138i) this.f20433m).f18249l).contains(c2731g));
    }

    @Override // D2.f
    public void shutdown() {
        ((ConnectivityManager) this.f20432l).unregisterNetworkCallback((D2.g) this.f20434n);
    }

    public void t(Runnable runnable) {
        ((ExecutorC2251i) this.f20432l).execute(runnable);
    }

    public String toString() {
        switch (this.f20431k) {
            case 5:
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f20432l;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                String str = (String) this.f20433m;
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
                String str2 = (String) this.f20434n;
                if (str2 != null) {
                    sb.append(" mimetype=");
                    sb.append(str2);
                }
                sb.append(" }");
                String sb2 = sb.toString();
                l.e("sb.toString()", sb2);
                return sb2;
            default:
                return super.toString();
        }
    }

    public Object u() {
        long b3 = X.e.b();
        if (b3 == X.l.f6064a) {
            return this.f20434n;
        }
        k kVar = (k) ((AtomicReference) this.f20432l).get();
        int a5 = kVar.a(b3);
        if (a5 >= 0) {
            return kVar.f6063c[a5];
        }
        return null;
    }

    public InterfaceC2009n v() {
        return ((C2022b) this.f20434n).f17539k.f17537c;
    }

    public ColorStateList w(int i) {
        int resourceId;
        ColorStateList o5;
        TypedArray typedArray = (TypedArray) this.f20433m;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (o5 = AbstractC2346c.o((Context) this.f20432l, resourceId)) == null) ? typedArray.getColorStateList(i) : o5;
    }

    public Drawable x(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f20433m;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AbstractC2346c.p((Context) this.f20432l, resourceId);
    }

    public Typeface y(int i, int i5, M0.e eVar) {
        int i6 = 3;
        int resourceId = ((TypedArray) this.f20433m).getResourceId(i, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.f20434n) == null) {
                this.f20434n = new TypedValue();
            }
            TypedValue typedValue = (TypedValue) this.f20434n;
            ThreadLocal threadLocal = f1.j.f16961a;
            Context context = (Context) this.f20432l;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String charSequence2 = charSequence.toString();
                if (!charSequence2.startsWith("res/")) {
                    eVar.a(-3);
                    return null;
                }
                int i7 = typedValue.assetCookie;
                r rVar = AbstractC1970d.f17080b;
                Typeface typeface = (Typeface) rVar.b(AbstractC1970d.b(resources, resourceId, charSequence2, i7, i5));
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new Q3.g(i6, eVar, typeface));
                    return typeface;
                }
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        InterfaceC1942d g5 = AbstractC1940b.g(resources.getXml(resourceId), resources);
                        if (g5 != null) {
                            return AbstractC1970d.a(context, g5, resources, resourceId, charSequence2, typedValue.assetCookie, i5, eVar, true);
                        }
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        eVar.a(-3);
                        return null;
                    }
                    int i8 = typedValue.assetCookie;
                    Typeface t5 = AbstractC1970d.f17079a.t(context, resources, resourceId, charSequence2, i5);
                    if (t5 != null) {
                        rVar.c(AbstractC1970d.b(resources, resourceId, charSequence2, i8, i5), t5);
                    }
                    if (t5 != null) {
                        new Handler(Looper.getMainLooper()).post(new Q3.g(i6, eVar, t5));
                    } else {
                        eVar.a(-3);
                    }
                    return t5;
                } catch (IOException e3) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e3);
                    eVar.a(-3);
                    return null;
                } catch (XmlPullParserException e5) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e5);
                    eVar.a(-3);
                    return null;
                }
            }
        }
        return null;
    }

    public X z() {
        X x5 = (X) this.f20433m;
        if (x5 != null) {
            return x5;
        }
        l.k("keyboardActions");
        throw null;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i) {
        this.f20431k = i;
        this.f20432l = obj;
        this.f20433m = obj2;
        this.f20434n = obj3;
    }

    public e(Context context, int i) {
        this.f20431k = i;
        switch (i) {
            case 23:
                this.f20432l = context.getApplicationContext();
                this.f20433m = H2.d.f2283a;
                this.f20434n = new H2.i();
                break;
            default:
                ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                this.f20433m = newSingleThreadScheduledExecutor;
                this.f20434n = Executors.newSingleThreadExecutor();
                this.f20432l = context;
                newSingleThreadScheduledExecutor.scheduleAtFixedRate(new C(22, this), 0L, 86400L, TimeUnit.SECONDS);
                break;
        }
    }

    public e(Context context, U2.a aVar) {
        this.f20431k = 15;
        this.f20432l = context;
        this.f20433m = context.getPackageName();
        this.f20434n = aVar.f5852k;
    }

    public e(WorkDatabase_Impl workDatabase_Impl) {
        this.f20431k = 21;
        this.f20432l = workDatabase_Impl;
        this.f20433m = new o2.b(workDatabase_Impl, 2);
        this.f20434n = new o2.e(workDatabase_Impl, 0);
    }

    public e(AbstractServiceC0494x abstractServiceC0494x) {
        this.f20431k = 14;
        this.f20432l = new C0493w(abstractServiceC0494x, true);
        this.f20433m = new Handler(Looper.getMainLooper());
    }

    public e(InterfaceC0044l1 interfaceC0044l1) {
        this.f20431k = 4;
        this.f20432l = interfaceC0044l1;
    }

    public e(ExecutorService executorService) {
        this.f20431k = 22;
        this.f20433m = new Handler(Looper.getMainLooper());
        this.f20434n = new D3.n(2, this);
        this.f20432l = new ExecutorC2251i(executorService);
    }

    public e(int i) {
        this.f20431k = i;
        switch (i) {
            case 9:
                this.f20432l = new WeakHashMap();
                this.f20433m = new WeakHashMap();
                this.f20434n = new WeakHashMap();
                break;
            case 10:
                this.f20432l = new ArrayList();
                this.f20433m = new ArrayList();
                this.f20434n = new ArrayList();
                break;
            case 12:
                this.f20432l = new AtomicReference(X.e.f6056c);
                this.f20433m = new Object();
                break;
            case 17:
                List list = Collections.EMPTY_LIST;
                this.f20432l = list;
                this.f20433m = list;
                break;
            case 19:
                break;
            case 25:
                String uuid = UUID.randomUUID().toString();
                l.e("randomUUID().toString()", uuid);
                C0229l c0229l = C0229l.f3092n;
                this.f20432l = j3.i.q(uuid);
                this.f20433m = y4.s.f21377e;
                this.f20434n = new ArrayList();
                break;
            case 26:
                this.f20432l = new C2138i(15);
                this.f20433m = new C2138i(15);
                this.f20434n = new C2138i(15);
                break;
            default:
                this.f20434n = new Q1.j(2);
                break;
        }
    }

    public e(Intent intent) {
        this.f20431k = 5;
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.f20432l = data;
        this.f20433m = action;
        this.f20434n = type;
    }

    public e(View view) {
        this.f20431k = 6;
        this.f20432l = view;
        this.f20433m = G4.d.D(W3.f.f6034k, new C0040k0(18, this));
        this.f20434n = new C2138i(view);
    }

    public e(C2022b c2022b) {
        this.f20431k = 18;
        this.f20434n = c2022b;
        this.f20432l = new C2023c(0, this);
    }

    public e(Context context, TypedArray typedArray) {
        this.f20431k = 20;
        this.f20432l = context;
        this.f20433m = typedArray;
    }

    public e(ConnectivityManager connectivityManager, H2.l lVar) {
        this.f20431k = 3;
        this.f20432l = connectivityManager;
        this.f20433m = lVar;
        D2.g gVar = new D2.g(0, this);
        this.f20434n = gVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(i4.c cVar, i4.c cVar2, X.d dVar) {
        this.f20431k = 1;
        this.f20432l = (kotlin.jvm.internal.m) cVar;
        this.f20433m = (kotlin.jvm.internal.m) cVar2;
        this.f20434n = dVar;
    }

    public e(Class cls) {
        this.f20431k = 16;
        this.f20434n = new HashSet();
        this.f20432l = UUID.randomUUID();
        this.f20433m = new i(((UUID) this.f20432l).toString(), cls.getName());
        ((HashSet) this.f20434n).add(cls.getName());
        ((i) this.f20433m).f18636d = OverwritingInputMerger.class.getName();
    }

    public e(m2.g gVar, C2054a c2054a, v1.e eVar, Set set) {
        this.f20431k = 24;
        this.f20432l = c2054a;
        this.f20433m = gVar;
        this.f20434n = eVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            I(str, 0, str.length(), 1, true, new H3.g(str, 6));
        }
    }

    public e(q qVar, e eVar) {
        this.f20431k = 8;
        this.f20432l = qVar;
        this.f20433m = eVar;
        this.f20434n = qVar.f4042k;
    }

    public e(C2731G c2731g) {
        this.f20431k = 27;
        this.f20432l = c2731g;
        this.f20433m = new ArrayList();
        this.f20434n = c2731g;
    }
}
