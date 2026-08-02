package com.google.android.gms.common.internal;

import A1.x0;
import F.AbstractC0210f;
import P.U;
import P.b0;
import a.AbstractC0603a;
import android.app.Application;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.work.impl.WorkDatabase_Impl;
import b4.C0784d;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.consent_sdk.zzj;
import com.google.android.gms.internal.p002firebaseauthapi.zzads;
import com.google.android.gms.internal.p002firebaseauthapi.zzag;
import com.google.android.gms.internal.p002firebaseauthapi.zzagm;
import com.google.android.gms.internal.p002firebaseauthapi.zzx;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.FirebaseAuth;
import d4.InterfaceC0965b;
import d6.C0977k;
import e3.C1023h;
import e6.C1054c;
import g0.C1122d;
import g4.C1142o;
import h0.C1175a;
import i2.C1254j;
import i2.C1257m;
import i2.C1260p;
import i2.InterfaceC1261q;
import io.sentry.protocol.Request;
import j2.C1305b;
import j2.InterfaceC1309f;
import j4.C1316b;
import j4.C1317c;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import l.AbstractC1364b;
import l.C1373k;
import l.InterfaceC1363a;
import m1.C1427b;
import m1.C1428c;
import n1.C1450e;
import n4.AbstractC1472f;
import n4.C1468b;
import n4.C1473g;
import n4.C1479m;
import o1.C1501k;
import o5.C1512b;
import q5.AbstractActivityC1559c;
import s4.C1593a;
import s4.C1595c;
import s4.C1598f;
import t1.C1604a;
import v2.AbstractC1664a;
import w1.AbstractC1706i0;
import w1.AbstractC1707i1;
import w1.AbstractC1715k1;
import w1.C1718l0;
import w1.C1722m0;
import w1.C1738q0;
import w1.C1740r0;
import w1.C1760y;
import w1.F0;
import w1.P2;
import w4.C1777c;
import w4.C1778d;

/* loaded from: classes.dex */
public final class w implements d1.s, Continuation, InterfaceC1363a, InterfaceC1261q, n4.G, l4.u, A5.q, InterfaceC1309f, q5.s, B3.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11334a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11335b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11336c;

    public /* synthetic */ w(int i7, Object obj, Object obj2) {
        this.f11334a = i7;
        this.f11335b = obj;
        this.f11336c = obj2;
    }

    public static boolean A(Editable editable, KeyEvent keyEvent, boolean z4) {
        g0.u[] uVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (uVarArr = (g0.u[]) editable.getSpans(selectionStart, selectionEnd, g0.u.class)) != null && uVarArr.length > 0) {
            for (g0.u uVar : uVarArr) {
                int spanStart = editable.getSpanStart(uVar);
                int spanEnd = editable.getSpanEnd(uVar);
                if ((z4 && spanStart == selectionStart) || ((!z4 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static String l() {
        DataInputStream dataInputStream;
        File fileStreamPath = AbstractC1707i1.f17743c.getFileStreamPath(".flurryb.");
        String str = null;
        if (fileStreamPath == null || !fileStreamPath.exists()) {
            return null;
        }
        try {
            dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
            try {
                if (1 == dataInputStream.readInt()) {
                    str = dataInputStream.readUTF();
                }
            } catch (Throwable th) {
                th = th;
                try {
                    Log.getStackTraceString(th);
                    return str;
                } finally {
                    AbstractC1706i0.h(dataInputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            dataInputStream = null;
        }
        return str;
    }

    public static void o(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File fileStreamPath = AbstractC1707i1.f17743c.getFileStreamPath(".flurryb.");
        if (!AbstractC1715k1.g(fileStreamPath)) {
            return;
        }
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(new FileOutputStream(fileStreamPath));
            try {
                dataOutputStream2.writeInt(1);
                dataOutputStream2.writeUTF(str);
                AbstractC1706i0.h(dataOutputStream2);
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                try {
                    Log.getStackTraceString(th);
                } finally {
                    AbstractC1706i0.h(dataOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String u() {
        String[] list;
        DataInputStream dataInputStream;
        File filesDir = AbstractC1707i1.f17743c.getFilesDir();
        String str = null;
        if (filesDir != null && (list = filesDir.list(new C1760y())) != null && list.length != 0) {
            File fileStreamPath = AbstractC1707i1.f17743c.getFileStreamPath(list[0]);
            if (fileStreamPath != null && fileStreamPath.exists()) {
                try {
                    dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = null;
                }
                try {
                    if (46586 == dataInputStream.readUnsignedShort() && 2 == dataInputStream.readUnsignedShort()) {
                        dataInputStream.readUTF();
                        str = dataInputStream.readUTF();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        Log.getStackTraceString(th);
                        return str;
                    } finally {
                        AbstractC1706i0.h(dataInputStream);
                    }
                }
                return str;
            }
        }
        return null;
    }

    public static void v(String str) {
        AbstractC1706i0.m();
        Objects.toString(AbstractC1707i1.f17743c.getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str))));
        File fileStreamPath = AbstractC1707i1.f17743c.getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str)));
        if (fileStreamPath.exists()) {
            fileStreamPath.delete();
        }
    }

    public static String z(String str) {
        return ".YFlurrySenderIndex.info.".concat(String.valueOf(str));
    }

    public void B(ArrayList arrayList, int i7, ArrayList arrayList2, List list, v4.l lVar) {
        C1595c c1595c;
        v4.c cVar;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C1595c c1595c2 = (C1595c) it.next();
            if (t.e.b(c1595c2.f16153a, i7)) {
                arrayList3.add(c1595c2);
            }
        }
        Collections.sort(arrayList3, new C1598f(this));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            C1595c c1595c3 = (C1595c) it2.next();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                AbstractC1472f abstractC1472f = (AbstractC1472f) it3.next();
                if (abstractC1472f.g(i7)) {
                    if (t.e.b(c1595c3.f16153a, 5) || t.e.b(c1595c3.f16153a, 1)) {
                        c1595c = c1595c3;
                    } else {
                        v4.r rVar = c1595c3.f16154b.f17186a;
                        v4.m mVar = v4.m.f17189a;
                        v4.k kVar = lVar.f17188c;
                        if (!kVar.equals(mVar) && !kVar.equals((v4.k) this.f11336c)) {
                            throw new IllegalArgumentException("Index not available in IndexedNode!");
                        }
                        lVar.l();
                        boolean m7 = D.m(lVar.f17187b, v4.l.f17185d);
                        v4.c cVar2 = c1595c3.f16156d;
                        if (m7) {
                            cVar = lVar.f17186a.n(cVar2);
                        } else {
                            v4.p pVar = (v4.p) lVar.f17187b.f14775a.A(new v4.p(cVar2, rVar));
                            cVar = pVar != null ? pVar.f17195a : null;
                        }
                        c1595c = new C1595c(c1595c3.f16153a, c1595c3.f16154b, c1595c3.f16156d, cVar, c1595c3.f16155c);
                    }
                    arrayList.add(abstractC1472f.b(c1595c, (s4.h) this.f11335b));
                }
            }
        }
    }

    public v4.r C() {
        C1593a c1593a = (C1593a) this.f11335b;
        if (c1593a.f16148b) {
            return c1593a.f16147a.f17186a;
        }
        return null;
    }

    public v4.r D() {
        C1593a c1593a = (C1593a) this.f11336c;
        if (c1593a.f16148b) {
            return c1593a.f16147a.f17186a;
        }
        return null;
    }

    public Long E(String str) {
        D0.k c3 = D0.k.c(1, "SELECT long_value FROM Preference where `key`=?");
        c3.f(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f11335b;
        workDatabase_Impl.b();
        Cursor g3 = workDatabase_Impl.g(c3);
        try {
            Long l7 = null;
            if (g3.moveToFirst() && !g3.isNull(0)) {
                l7 = Long.valueOf(g3.getLong(0));
            }
            return l7;
        } finally {
            g3.close();
            c3.g();
        }
    }

    public synchronized Map F() {
        try {
            if (((Map) this.f11336c) == null) {
                this.f11336c = Collections.unmodifiableMap(new HashMap((HashMap) this.f11335b));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f11336c;
    }

    public ArrayList G(String str) {
        D0.k c3 = D0.k.c(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            c3.e(1);
        } else {
            c3.f(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f11335b;
        workDatabase_Impl.b();
        Cursor g3 = workDatabase_Impl.g(c3);
        try {
            ArrayList arrayList = new ArrayList(g3.getCount());
            while (g3.moveToNext()) {
                arrayList.add(g3.getString(0));
            }
            return arrayList;
        } finally {
            g3.close();
            c3.g();
        }
    }

    public boolean H(CharSequence charSequence, int i7, int i8, g0.n nVar) {
        if (nVar.f13039c == 0) {
            C1122d c1122d = (C1122d) this.f11336c;
            C1175a c3 = nVar.c();
            int a2 = c3.a(8);
            if (a2 != 0) {
                ((ByteBuffer) c3.f5028d).getShort(a2 + c3.f5025a);
            }
            c1122d.getClass();
            ThreadLocal threadLocal = C1122d.f13013b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i7 < i8) {
                sb.append(charSequence.charAt(i7));
                i7++;
            }
            TextPaint textPaint = c1122d.f13014a;
            String sb2 = sb.toString();
            int i9 = I.e.f3466a;
            nVar.f13039c = I.d.a(textPaint, sb2) ? 2 : 1;
        }
        return nVar.f13039c == 2;
    }

    public void I(C1428c c1428c) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f11335b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((C1427b) this.f11336c).e(c1428c);
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    public void J(C1778d c1778d) {
        ((l4.y) this.f11336c).f15028i.execute(new l4.x(1, this, c1778d));
    }

    public void K(String str) {
        C1777c c1777c = (C1777c) this.f11335b;
        synchronized (c1777c) {
            c1777c.e((byte) 1, str.getBytes(C1777c.f18049m));
        }
    }

    public void L(AbstractC0603a abstractC0603a) {
        ((androidx.lifecycle.B) this.f11335b).g(abstractC0603a);
        boolean z4 = abstractC0603a instanceof d1.r;
        C1501k c1501k = (C1501k) this.f11336c;
        if (z4) {
            c1501k.i((d1.r) abstractC0603a);
        } else if (abstractC0603a instanceof d1.p) {
            c1501k.j(((d1.p) abstractC0603a).f12369e);
        }
    }

    public v4.r M(C1473g c1473g) {
        return ((C1468b) ((n4.M) this.f11336c).f15383a).C(((C1473g) this.f11335b).m(c1473g));
    }

    public w N(v4.l lVar, boolean z4, boolean z7) {
        return new w(18, new C1593a(lVar, z4, z7), (C1593a) this.f11336c);
    }

    @Override // l.InterfaceC1363a
    public boolean a(AbstractC1364b abstractC1364b, m.k kVar) {
        ViewGroup viewGroup = ((i.v) this.f11336c).f13765R;
        WeakHashMap weakHashMap = U.f5037a;
        P.G.c(viewGroup);
        return ((InterfaceC1363a) this.f11335b).a(abstractC1364b, kVar);
    }

    @Override // l4.u
    public void b(String str, String str2) {
        ((C1479m) ((C1023h) this.f11336c).f12667a).m(((n4.M) this.f11335b).d(C1479m.c(str, str2)));
    }

    @Override // n4.G
    public void c(boolean z4, C0977k c0977k) {
        InterfaceC0965b interfaceC0965b = (InterfaceC0965b) ((AtomicReference) this.f11336c).get();
        if (interfaceC0965b != null) {
            ((C0784d) interfaceC0965b).b(z4).addOnSuccessListener(new C1316b(c0977k, 0)).addOnFailureListener(new C1317c(c0977k, 0));
        } else {
            c0977k.q(null);
        }
    }

    @Override // j2.InterfaceC1309f
    public int d(long j) {
        long[] jArr = (long[]) this.f11336c;
        int b7 = v2.t.b(jArr, j, false);
        if (b7 < jArr.length) {
            return b7;
        }
        return -1;
    }

    @Override // l.InterfaceC1363a
    public boolean e(AbstractC1364b abstractC1364b, m.k kVar) {
        return ((InterfaceC1363a) this.f11335b).e(abstractC1364b, kVar);
    }

    @Override // q5.s
    public void f(KeyEvent keyEvent, B3.g gVar) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            gVar.g(false);
            return;
        }
        Character a2 = ((d1.n) this.f11336c).a(keyEvent.getUnicodeChar());
        boolean z4 = action != 0;
        R5.F f7 = new R5.F(gVar, 18);
        x0 x0Var = (x0) this.f11335b;
        HashMap hashMap = new HashMap();
        hashMap.put("type", z4 ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(keyEvent.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        hashMap.put("character", a2.toString());
        hashMap.put("source", Integer.valueOf(keyEvent.getSource()));
        hashMap.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        ((F0) x0Var.f613b).L(hashMap, new R5.F(f7, 20));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [i.j, java.lang.Object] */
    @Override // l.InterfaceC1363a
    public void g(AbstractC1364b abstractC1364b) {
        ((InterfaceC1363a) this.f11335b).g(abstractC1364b);
        i.v vVar = (i.v) this.f11336c;
        if (vVar.f13761N != null) {
            vVar.f13750C.getDecorView().removeCallbacks(vVar.f13762O);
        }
        if (vVar.f13760M != null) {
            b0 b0Var = vVar.f13763P;
            if (b0Var != null) {
                b0Var.b();
            }
            b0 a2 = U.a(vVar.f13760M);
            a2.a(0.0f);
            vVar.f13763P = a2;
            a2.d(new i.o(this, 2));
        }
        vVar.f13752E.onSupportActionModeFinished(vVar.f13759L);
        vVar.f13759L = null;
        ViewGroup viewGroup = vVar.f13765R;
        WeakHashMap weakHashMap = U.f5037a;
        P.G.c(viewGroup);
        vVar.J();
    }

    @Override // j2.InterfaceC1309f
    public long h(int i7) {
        AbstractC1664a.f(i7 >= 0);
        long[] jArr = (long[]) this.f11336c;
        AbstractC1664a.f(i7 < jArr.length);
        return jArr[i7];
    }

    @Override // i2.InterfaceC1261q
    public u2.M i(C1257m c1257m, C1254j c1254j) {
        ((C1054c) this.f11335b).getClass();
        return new P2(27, new C1260p(c1257m, c1254j), (List) this.f11336c, false);
    }

    @Override // i2.InterfaceC1261q
    public u2.M j() {
        return new P2(27, ((C1054c) this.f11335b).j(), (List) this.f11336c, false);
    }

    @Override // l.InterfaceC1363a
    public boolean k(AbstractC1364b abstractC1364b, MenuItem menuItem) {
        return ((InterfaceC1363a) this.f11335b).k(abstractC1364b, menuItem);
    }

    @Override // j2.InterfaceC1309f
    public List m(long j) {
        C1305b c1305b;
        int f7 = v2.t.f((long[]) this.f11336c, j, false);
        return (f7 == -1 || (c1305b = ((C1305b[]) this.f11335b)[f7]) == C1305b.f14567I) ? Collections.emptyList() : Collections.singletonList(c1305b);
    }

    public synchronized ArrayList n(String str) {
        ArrayList arrayList;
        DataInputStream dataInputStream;
        int readUnsignedShort;
        AbstractC1706i0.m();
        Objects.toString(AbstractC1707i1.f17743c.getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str))));
        File fileStreamPath = AbstractC1707i1.f17743c.getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str)));
        ArrayList arrayList2 = null;
        DataInputStream dataInputStream2 = null;
        if (fileStreamPath.exists()) {
            try {
                dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
                try {
                    readUnsignedShort = dataInputStream.readUnsignedShort();
                } catch (Throwable th) {
                    th = th;
                    arrayList = null;
                }
            } catch (Throwable th2) {
                th = th2;
                arrayList = null;
            }
            if (readUnsignedShort == 0) {
                AbstractC1706i0.h(dataInputStream);
                return null;
            }
            arrayList = new ArrayList(readUnsignedShort);
            for (int i7 = 0; i7 < readUnsignedShort; i7++) {
                try {
                    byte[] bArr = new byte[dataInputStream.readUnsignedShort()];
                    dataInputStream.readFully(bArr);
                    arrayList.add(new String(bArr));
                } catch (Throwable th3) {
                    th = th3;
                    dataInputStream2 = dataInputStream;
                    try {
                        Log.getStackTraceString(th);
                        AbstractC1706i0.h(dataInputStream2);
                        arrayList2 = arrayList;
                        return arrayList2;
                    } catch (Throwable th4) {
                        AbstractC1706i0.h(dataInputStream2);
                        throw th4;
                    }
                }
            }
            dataInputStream.readUnsignedShort();
            AbstractC1706i0.h(dataInputStream);
            arrayList2 = arrayList;
        }
        return arrayList2;
    }

    @Override // B3.k
    public void onConsentFormLoadSuccess(B3.c cVar) {
        if (((zzj) this.f11335b).getConsentStatus() == 2) {
            cVar.show(((y1.a) this.f11336c).f18127a, new N5.e(this, 1));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0421, code lost:
    
        if (r2.equals("share") == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0467, code lost:
    
        if ((r8 instanceof java.util.Map) == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0469, code lost:
    
        if (r3 == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0473, code lost:
    
        if (r12.a((A5.p) r20) != false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0477, code lost:
    
        r2 = r19.a("text");
        t6.h.c(r2, "null cannot be cast to non-null type kotlin.String");
        r6.n((java.lang.String) r2, (java.lang.String) r19.a("subject"), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0489, code lost:
    
        if (r3 != false) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x048b, code lost:
    
        if (r3 == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x048d, code lost:
    
        ((A5.p) r20).success("dev.fluttercommunity.plus/share/unavailable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0496, code lost:
    
        ((A5.p) r20).success(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x04a4, code lost:
    
        throw new java.lang.IllegalArgumentException("Map arguments expected");
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0459, code lost:
    
        if (r2.equals("shareFilesWithResult") == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x04b7, code lost:
    
        if ((r8 instanceof java.util.Map) == false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x04b9, code lost:
    
        if (r3 == false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x04c3, code lost:
    
        if (r12.a((A5.p) r20) != false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x04c6, code lost:
    
        r2 = r19.a("paths");
        t6.h.b(r2);
        r6.o((java.util.List) r2, (java.util.List) r19.a("mimeTypes"), (java.lang.String) r19.a("text"), (java.lang.String) r19.a("subject"), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x04ee, code lost:
    
        if (r3 != false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x04f0, code lost:
    
        if (r3 == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x04f2, code lost:
    
        ((A5.p) r20).success("dev.fluttercommunity.plus/share/unavailable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x04fa, code lost:
    
        ((A5.p) r20).success(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0502, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0503, code lost:
    
        ((A5.p) r20).error("Share failed", r0.getMessage(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0516, code lost:
    
        throw new java.lang.IllegalArgumentException("Map arguments expected");
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0462, code lost:
    
        if (r2.equals("shareWithResult") == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x04ab, code lost:
    
        if (r2.equals("shareFiles") == false) goto L206;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:205:0x0503 -> B:202:0x0510). Please report as a decompilation issue!!! */
    @Override // A5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMethodCall(A5.o oVar, A5.r rVar) {
        Context context;
        t1.c cVar;
        Object obj;
        ?? r7;
        boolean isLocationEnabled;
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        switch (this.f11334a) {
            case 14:
                t6.h.e(oVar, "call");
                String str = oVar.f676a;
                t6.h.d(str, Request.JsonKeys.METHOD);
                boolean endsWith = str.endsWith("WithResult");
                int hashCode = str.hashCode();
                I4.j jVar = (I4.j) this.f11335b;
                Object obj2 = oVar.f677b;
                C1512b c1512b = (C1512b) this.f11336c;
                switch (hashCode) {
                    case -1811378728:
                        break;
                    case -1594861118:
                        break;
                    case -1212337029:
                        break;
                    case -743768819:
                        if (str.equals("shareUri")) {
                            if (!(obj2 instanceof Map)) {
                                throw new IllegalArgumentException("Map arguments expected");
                            }
                            Object a2 = oVar.a("uri");
                            t6.h.c(a2, "null cannot be cast to non-null type kotlin.String");
                            jVar.n((String) a2, null, false);
                            if (endsWith) {
                                return;
                            }
                            ((A5.p) rVar).success(null);
                            return;
                        }
                        ((A5.p) rVar).notImplemented();
                        return;
                    case 109400031:
                        break;
                    default:
                        ((A5.p) rVar).notImplemented();
                        return;
                }
            default:
                String str2 = oVar.f676a;
                str2.getClass();
                context = (Context) this.f11335b;
                cVar = (t1.c) this.f11336c;
                obj = oVar.f677b;
                switch (str2) {
                    case "checkServiceStatus":
                        int parseInt = Integer.parseInt(obj.toString());
                        if (context == null) {
                            Log.d("permissions_handler", "Context cannot be null.");
                            ((A5.p) rVar).error("PermissionHandler.ServiceManager", "Android context cannot be null.", null);
                            return;
                        }
                        if (parseInt == 3 || parseInt == 4 || parseInt == 5) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                LocationManager locationManager = (LocationManager) context.getSystemService(LocationManager.class);
                                if (locationManager != null) {
                                    isLocationEnabled = locationManager.isLocationEnabled();
                                    r7 = isLocationEnabled;
                                }
                                r7 = 0;
                            } else {
                                try {
                                    r7 = Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0;
                                } catch (Settings.SettingNotFoundException e7) {
                                    e7.printStackTrace();
                                }
                            }
                            ((A5.p) rVar).success(Integer.valueOf((int) r7));
                            return;
                        }
                        if (parseInt == 21) {
                            ((A5.p) rVar).success(Integer.valueOf(((BluetoothManager) context.getSystemService("bluetooth")).getAdapter().isEnabled() ? 1 : 0));
                            return;
                        }
                        if (parseInt != 8) {
                            if (parseInt == 16) {
                                ((A5.p) rVar).success(1);
                                return;
                            } else {
                                ((A5.p) rVar).success(2);
                                return;
                            }
                        }
                        PackageManager packageManager = context.getPackageManager();
                        if (!packageManager.hasSystemFeature("android.hardware.telephony")) {
                            ((A5.p) rVar).success(2);
                            return;
                        }
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        if (telephonyManager == null || telephonyManager.getPhoneType() == 0) {
                            ((A5.p) rVar).success(2);
                            return;
                        }
                        Intent intent = new Intent("android.intent.action.CALL");
                        intent.setData(Uri.parse("tel:123123"));
                        if (Build.VERSION.SDK_INT >= 33) {
                            of = PackageManager.ResolveInfoFlags.of(0L);
                            queryIntentActivities = packageManager.queryIntentActivities(intent, of);
                        } else {
                            queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                        }
                        if (queryIntentActivities.isEmpty()) {
                            ((A5.p) rVar).success(2);
                            return;
                        } else if (telephonyManager.getSimState() != 5) {
                            ((A5.p) rVar).success(0);
                            return;
                        } else {
                            ((A5.p) rVar).success(1);
                            return;
                        }
                    case "shouldShowRequestPermissionRationale":
                        int parseInt2 = Integer.parseInt(obj.toString());
                        AbstractActivityC1559c abstractActivityC1559c = cVar.f16277c;
                        if (abstractActivityC1559c == null) {
                            Log.d("permissions_handler", "Unable to detect current Activity.");
                            ((A5.p) rVar).error("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.", null);
                            return;
                        }
                        ArrayList e8 = p6.c.e(parseInt2, abstractActivityC1559c);
                        if (e8 == null) {
                            Log.d("permissions_handler", "No android specific permissions needed for: " + parseInt2);
                            ((A5.p) rVar).success(Boolean.FALSE);
                            return;
                        }
                        if (!e8.isEmpty()) {
                            ((A5.p) rVar).success(Boolean.valueOf(AbstractC0210f.b(cVar.f16277c, (String) e8.get(0))));
                            return;
                        }
                        Log.d("permissions_handler", "No permissions found in manifest for: " + parseInt2 + " no need to show request rationale");
                        ((A5.p) rVar).success(Boolean.FALSE);
                        return;
                    case "checkPermissionStatus":
                        ((A5.p) rVar).success(Integer.valueOf(cVar.a(Integer.parseInt(obj.toString()))));
                        return;
                    case "openAppSettings":
                        if (context == null) {
                            Log.d("permissions_handler", "Context cannot be null.");
                            ((A5.p) rVar).error("PermissionHandler.AppSettingsManager", "Android context cannot be null.", null);
                            return;
                        }
                        try {
                            Intent intent2 = new Intent();
                            intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent2.addCategory("android.intent.category.DEFAULT");
                            intent2.setData(Uri.parse("package:" + context.getPackageName()));
                            intent2.addFlags(268435456);
                            intent2.addFlags(1073741824);
                            intent2.addFlags(8388608);
                            context.startActivity(intent2);
                            ((A5.p) rVar).success(Boolean.TRUE);
                            return;
                        } catch (Exception unused) {
                            ((A5.p) rVar).success(Boolean.FALSE);
                            return;
                        }
                    case "requestPermissions":
                        List<Integer> list = (List) obj;
                        A5.p pVar = (A5.p) rVar;
                        C1604a c1604a = new C1604a(pVar);
                        if (cVar.f16278d > 0) {
                            pVar.error("PermissionHandler.PermissionManager", "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).", null);
                            return;
                        }
                        if (cVar.f16277c == null) {
                            Log.d("permissions_handler", "Unable to detect current Activity.");
                            pVar.error("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.", null);
                            return;
                        }
                        cVar.f16276b = c1604a;
                        cVar.f16279e = new HashMap();
                        cVar.f16278d = 0;
                        ArrayList arrayList = new ArrayList();
                        for (Integer num : list) {
                            if (cVar.a(num.intValue()) != 1) {
                                ArrayList e9 = p6.c.e(num.intValue(), cVar.f16277c);
                                if (e9 != null && !e9.isEmpty()) {
                                    int i7 = Build.VERSION.SDK_INT;
                                    if (num.intValue() == 16) {
                                        cVar.c(209, "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                                    } else if (i7 >= 30 && num.intValue() == 22) {
                                        cVar.c(210, "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
                                    } else if (num.intValue() == 23) {
                                        cVar.c(211, "android.settings.action.MANAGE_OVERLAY_PERMISSION");
                                    } else if (i7 >= 26 && num.intValue() == 24) {
                                        cVar.c(212, "android.settings.MANAGE_UNKNOWN_APP_SOURCES");
                                    } else if (num.intValue() == 27) {
                                        cVar.c(213, "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
                                    } else if (i7 >= 31 && num.intValue() == 34) {
                                        cVar.c(214, "android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                                    } else if (num.intValue() != 37 && num.intValue() != 0) {
                                        arrayList.addAll(e9);
                                        cVar.f16278d = e9.size() + cVar.f16278d;
                                    } else if (cVar.b()) {
                                        arrayList.add("android.permission.WRITE_CALENDAR");
                                        arrayList.add("android.permission.READ_CALENDAR");
                                        cVar.f16278d += 2;
                                    } else {
                                        cVar.f16279e.put(num, 0);
                                    }
                                } else if (!cVar.f16279e.containsKey(num)) {
                                    cVar.f16279e.put(num, 0);
                                    if (num.intValue() != 22 || Build.VERSION.SDK_INT >= 30) {
                                        cVar.f16279e.put(num, 0);
                                    } else {
                                        cVar.f16279e.put(num, 2);
                                    }
                                }
                            } else if (!cVar.f16279e.containsKey(num)) {
                                cVar.f16279e.put(num, 1);
                            }
                        }
                        if (arrayList.size() > 0) {
                            AbstractC0210f.a(cVar.f16277c, (String[]) arrayList.toArray(new String[0]), 24);
                        }
                        C1604a c1604a2 = cVar.f16276b;
                        if (c1604a2 == null || cVar.f16278d != 0) {
                            return;
                        }
                        c1604a2.f16271a.success(cVar.f16279e);
                        return;
                    default:
                        ((A5.p) rVar).notImplemented();
                        return;
                }
        }
    }

    @Override // j2.InterfaceC1309f
    public int p() {
        return ((long[]) this.f11336c).length;
    }

    public synchronized void q(String str, String str2, List list) {
        try {
            AbstractC1706i0.m();
            Objects.toString(AbstractC1707i1.f17743c.getFileStreamPath(z(str)));
            C0977k c0977k = new C0977k(AbstractC1707i1.f17743c.getFileStreamPath(z(str)), str2, 1, new C1718l0(27));
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                C1740r0 c1740r0 = new C1740r0();
                c1740r0.f17841a = str3;
                arrayList.add(c1740r0);
            }
            c0977k.g(arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean r(String str, String str2) {
        boolean z4;
        List list = (List) ((LinkedHashMap) this.f11336c).get(str2);
        if (list != null) {
            File file = (File) C1738q0.a(str).f12441b;
            if (file != null) {
                file.delete();
            }
            z4 = list.remove(str);
        } else {
            z4 = false;
        }
        if (list == null || list.isEmpty()) {
            synchronized (this) {
                try {
                    AbstractC1706i0.m();
                    File fileStreamPath = AbstractC1707i1.f17743c.getFileStreamPath(z(str2));
                    List list2 = (List) ((LinkedHashMap) this.f11336c).get(str2);
                    List<String> emptyList = list2 == null ? Collections.emptyList() : new ArrayList(list2);
                    if (emptyList != null && !emptyList.isEmpty()) {
                        emptyList.size();
                        for (String str3 : emptyList) {
                            File file2 = (File) C1738q0.a(str3).f12441b;
                            if (file2 != null) {
                                file2.delete();
                            }
                            "discardOutdatedBlocksForDataKey: removed block = ".concat(String.valueOf(str3));
                        }
                    }
                    ((LinkedHashMap) this.f11336c).remove(str2);
                    if (fileStreamPath != null) {
                        fileStreamPath.delete();
                    }
                    s();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            ((LinkedHashMap) this.f11336c).put(str2, list);
            q(str2, ".YFlurrySenderIndex.info.", list);
        }
        return z4;
    }

    public synchronized void s() {
        LinkedList linkedList = new LinkedList(((LinkedHashMap) this.f11336c).keySet());
        File fileStreamPath = AbstractC1707i1.f17743c.getFileStreamPath(z((String) this.f11335b));
        if (fileStreamPath != null) {
            fileStreamPath.delete();
        }
        if (!linkedList.isEmpty()) {
            String str = (String) this.f11335b;
            q(str, str, linkedList);
        }
    }

    public void t(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            ((Bundle) this.f11336c).putString((String) entry.getKey(), (String) entry.getValue());
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            D.i(exception);
            String message = exception.getMessage();
            D.i(message);
            return Tasks.forException(new f4.t(message));
        }
        zzagm zzagmVar = (zzagm) task.getResult();
        String zza = zzagmVar.zza();
        if (zzag.zzc(zza)) {
            return Tasks.forException(new f4.t(w1.L.i("No Recaptcha Enterprise siteKey configured for tenant/project ", (String) this.f11335b)));
        }
        List<String> zza2 = zzx.zza('/').zza((CharSequence) zza);
        String str = zza2.size() != 4 ? null : zza2.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception(w1.L.i("Invalid siteKey format ", zza)));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + ((String) this.f11335b));
        }
        Q3.o oVar = (Q3.o) this.f11336c;
        f4.H h6 = (f4.H) oVar.f5827f;
        Y3.i iVar = (Y3.i) oVar.f5825d;
        iVar.b();
        Application application = (Application) iVar.f7663a;
        h6.getClass();
        Task<RecaptchaTasksClient> tasksClient = Recaptcha.getTasksClient(application, str);
        Q3.o oVar2 = (Q3.o) this.f11336c;
        String str2 = (String) this.f11335b;
        synchronized (oVar2.f5822a) {
            oVar2.f5824c = zzagmVar;
            ((HashMap) oVar2.f5823b).put(str2, tasksClient);
        }
        return tasksClient;
    }

    public v4.r w(v4.c cVar, C1593a c1593a) {
        n4.M m7 = (n4.M) this.f11336c;
        m7.getClass();
        C1473g t7 = ((C1473g) this.f11335b).t(cVar);
        v4.r C3 = ((C1468b) m7.f15383a).C(t7);
        if (C3 != null) {
            return C3;
        }
        if (c1593a.a(cVar)) {
            return ((C1468b) m7.f15383a).z(t7).t(c1593a.f16147a.f17186a.o(cVar));
        }
        return null;
    }

    public v4.r x(v4.r rVar) {
        n4.M m7 = (n4.M) this.f11336c;
        m7.getClass();
        v4.r rVar2 = v4.j.f17184e;
        C1468b c1468b = (C1468b) m7.f15383a;
        C1473g c1473g = (C1473g) this.f11335b;
        v4.r<v4.p> C3 = c1468b.C(c1473g);
        if (C3 == null) {
            C1468b z4 = ((C1468b) m7.f15383a).z(c1473g);
            Iterator it = rVar.iterator();
            while (it.hasNext()) {
                v4.p pVar = (v4.p) it.next();
                rVar2 = rVar2.s(pVar.f17195a, z4.z(new C1473g(pVar.f17195a)).t(pVar.f17196b));
            }
            ArrayList arrayList = new ArrayList();
            q4.c cVar = z4.f15392a;
            Object obj = cVar.f15855a;
            if (obj != null) {
                for (v4.p pVar2 : (v4.r) obj) {
                    arrayList.add(new v4.p(pVar2.f17195a, pVar2.f17196b));
                }
            } else {
                for (Map.Entry entry : cVar.f15856b) {
                    q4.c cVar2 = (q4.c) entry.getValue();
                    if (cVar2.f15855a != null) {
                        arrayList.add(new v4.p((v4.c) entry.getKey(), (v4.r) cVar2.f15855a));
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                v4.p pVar3 = (v4.p) it2.next();
                rVar2 = rVar2.s(pVar3.f17195a, pVar3.f17196b);
            }
        } else if (!C3.r()) {
            for (v4.p pVar4 : C3) {
                rVar2 = rVar2.s(pVar4.f17195a, pVar4.f17196b);
            }
        }
        return rVar2;
    }

    public v4.r y(C1473g c1473g, v4.r rVar, v4.r rVar2) {
        n4.M m7 = (n4.M) this.f11336c;
        m7.getClass();
        q4.k.b("Either existingEventSnap or existingServerSnap must exist", (rVar == null && rVar2 == null) ? false : true);
        C1473g m8 = ((C1473g) this.f11335b).m(c1473g);
        if (((C1468b) m7.f15383a).C(m8) != null) {
            return null;
        }
        C1468b z4 = ((C1468b) m7.f15383a).z(m8);
        return z4.f15392a.isEmpty() ? rVar2.g(c1473g) : z4.t(rVar2.g(c1473g));
    }

    public /* synthetic */ w(int i7, Object obj, Object obj2, boolean z4) {
        this.f11334a = i7;
        this.f11335b = obj2;
        this.f11336c = obj;
    }

    public w(int i7) {
        this.f11334a = i7;
        switch (i7) {
            case 2:
                this.f11335b = new androidx.lifecycle.B();
                this.f11336c = new C1501k();
                L(d1.s.f12371r);
                break;
            case 20:
                this.f11335b = new HashMap();
                break;
            case zzbbd.zzt.zzm /* 21 */:
                HashSet hashSet = new HashSet();
                hashSet.add("");
                hashSet.add(null);
                hashSet.add("null");
                hashSet.add("9774d56d682e549c");
                hashSet.add("dead00beef");
                this.f11336c = Collections.unmodifiableSet(hashSet);
                this.f11335b = "";
                break;
            case 22:
                break;
            default:
                com.google.android.gms.common.c cVar = com.google.android.gms.common.c.f11215d;
                this.f11335b = new SparseIntArray();
                this.f11336c = cVar;
                break;
        }
    }

    public w(I4.j jVar, C1512b c1512b) {
        this.f11334a = 14;
        t6.h.e(c1512b, "manager");
        this.f11335b = jVar;
        this.f11336c = c1512b;
    }

    public w(String str, FirebaseAuth firebaseAuth) {
        this.f11334a = 3;
        Bundle bundle = new Bundle();
        this.f11335b = bundle;
        Bundle bundle2 = new Bundle();
        this.f11336c = bundle2;
        Y3.i iVar = firebaseAuth.f11849a;
        iVar.b();
        bundle.putString("com.google.firebase.auth.KEY_API_KEY", iVar.f7665c.f7672a);
        bundle.putString("com.google.firebase.auth.KEY_PROVIDER_ID", str);
        bundle.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", bundle2);
        bundle.putString("com.google.firebase.auth.internal.CLIENT_VERSION", zzads.zza().zzb());
        bundle.putString("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.b());
        Y3.i iVar2 = firebaseAuth.f11849a;
        iVar2.b();
        bundle.putString("com.google.firebase.auth.KEY_FIREBASE_APP_NAME", iVar2.f7664b);
        bundle.putString("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", firebaseAuth.f11848B);
    }

    public w(Context context, C1718l0 c1718l0, t1.c cVar, C1722m0 c1722m0) {
        this.f11334a = 19;
        this.f11335b = context;
        this.f11336c = cVar;
    }

    public w(WorkDatabase_Impl workDatabase_Impl, int i7) {
        this.f11334a = i7;
        switch (i7) {
            case 11:
                this.f11335b = workDatabase_Impl;
                this.f11336c = new C1427b(workDatabase_Impl, 6);
                break;
            default:
                this.f11335b = workDatabase_Impl;
                this.f11336c = new C1427b(workDatabase_Impl, 1);
                break;
        }
    }

    public w(x0 x0Var) {
        this.f11334a = 16;
        this.f11336c = new d1.n();
        this.f11335b = x0Var;
    }

    public w(C1142o c1142o) {
        this.f11334a = 8;
        this.f11335b = c1142o;
        this.f11336c = new AtomicReference();
        c1142o.a(new R5.F(this, 15));
    }

    public w(s4.h hVar) {
        this.f11334a = 17;
        this.f11335b = hVar;
        this.f11336c = hVar.f16173b.f16170g;
    }

    public w(l4.y yVar, C1777c c1777c) {
        this.f11334a = 9;
        this.f11336c = yVar;
        this.f11335b = c1777c;
        c1777c.f18054c = this;
    }

    public w(C1373k c1373k, int i7) {
        this.f11334a = i7;
        switch (i7) {
            case 27:
                C1023h c1023h = new C1023h(this);
                A5.s sVar = new A5.s(c1373k, "flutter/platform_views_2", A5.y.f688b, null);
                this.f11335b = sVar;
                sVar.b(c1023h);
                break;
            default:
                C1450e c1450e = new C1450e(this, 25);
                A5.s sVar2 = new A5.s(c1373k, "flutter/localization", A5.m.f675a, null);
                this.f11335b = sVar2;
                sVar2.b(c1450e);
                break;
        }
    }

    public w(C1373k c1373k, PackageManager packageManager) {
        this.f11334a = 28;
        C1450e c1450e = new C1450e(this, 26);
        this.f11335b = packageManager;
        new A5.s(c1373k, "flutter/processtext", A5.y.f688b, null).b(c1450e);
    }

    public w(F0 f02, C1722m0 c1722m0, C1122d c1122d) {
        this.f11334a = 5;
        this.f11335b = f02;
        this.f11336c = c1122d;
    }
}
