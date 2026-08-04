package com.google.android.gms.common.internal;

import A1.x0;
import F.AbstractC0210f;
import P.U;
import P.b0;
import android.app.Application;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
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
import io.sentry.protocol.Request;
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
import p098n4.AbstractC0933f;
import p098n4.C0929b;
import p098n4.C0934g;
import p098n4.C0940m;
import p155w1.AbstractC0997i0;
import p155w1.AbstractC0998i1;
import p155w1.AbstractC1006k1;
import p155w1.C1009l0;
import p155w1.C1013m0;
import p155w1.C1029q0;
import p155w1.C1031r0;
import p155w1.C1051y;
import p155w1.F0;
import p155w1.P2;

/* JADX INFO: loaded from: classes.dex */
public final class w implements p023d1.s, Continuation, p078l.a, p061i2.q, p098n4.G, p083l4.u, A5.q, p068j2.f, p121q5.s, B3.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f11335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11336c;

    public /* synthetic */ w(int i7, Object obj, Object obj2) {
        this.f11334a = i7;
        this.f11335b = obj;
        this.f11336c = obj2;
    }

    public static boolean A(Editable editable, KeyEvent keyEvent, boolean z4) {
        p046g0.u[] uVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (uVarArr = (p046g0.u[]) editable.getSpans(selectionStart, selectionEnd, p046g0.u.class)) != null && uVarArr.length > 0) {
            for (p046g0.u uVar : uVarArr) {
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
        File fileStreamPath = AbstractC0998i1.f17749c.getFileStreamPath(".flurryb.");
        String utf = null;
        if (fileStreamPath == null || !fileStreamPath.exists()) {
            return null;
        }
        try {
            dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
            try {
                if (1 == dataInputStream.readInt()) {
                    utf = dataInputStream.readUTF();
                }
            } catch (Throwable th) {
                th = th;
                try {
                    Log.getStackTraceString(th);
                } finally {
                    AbstractC0997i0.h(dataInputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            dataInputStream = null;
        }
        return utf;
    }

    public static void o(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File fileStreamPath = AbstractC0998i1.f17749c.getFileStreamPath(".flurryb.");
        if (!AbstractC1006k1.g(fileStreamPath)) {
            return;
        }
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(new FileOutputStream(fileStreamPath));
            try {
                dataOutputStream2.writeInt(1);
                dataOutputStream2.writeUTF(str);
                AbstractC0997i0.h(dataOutputStream2);
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                try {
                    Log.getStackTraceString(th);
                } finally {
                    AbstractC0997i0.h(dataOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String u() {
        String[] list;
        DataInputStream dataInputStream;
        File filesDir = AbstractC0998i1.f17749c.getFilesDir();
        String utf = null;
        if (filesDir != null && (list = filesDir.list(new C1051y())) != null && list.length != 0) {
            File fileStreamPath = AbstractC0998i1.f17749c.getFileStreamPath(list[0]);
            if (fileStreamPath != null && fileStreamPath.exists()) {
                try {
                    dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
                    try {
                        if (46586 == dataInputStream.readUnsignedShort() && 2 == dataInputStream.readUnsignedShort()) {
                            dataInputStream.readUTF();
                            utf = dataInputStream.readUTF();
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            Log.getStackTraceString(th);
                        } finally {
                            AbstractC0997i0.h(dataInputStream);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = null;
                }
                return utf;
            }
        }
        return null;
    }

    public static void v(String str) {
        AbstractC0997i0.m();
        Objects.toString(AbstractC0998i1.f17749c.getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str))));
        File fileStreamPath = AbstractC0998i1.f17749c.getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str)));
        if (fileStreamPath.exists()) {
            fileStreamPath.delete();
        }
    }

    public static String z(String str) {
        return ".YFlurrySenderIndex.info.".concat(String.valueOf(str));
    }

    public void B(ArrayList arrayList, int i7, ArrayList arrayList2, List list, v4.l lVar) {
        p134s4.c cVar;
        v4.c cVarN;
        ArrayList<p134s4.c> arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            p134s4.c cVar2 = (p134s4.c) it.next();
            if (p136t.e.b(cVar2.f16159a, i7)) {
                arrayList3.add(cVar2);
            }
        }
        Collections.sort(arrayList3, new p134s4.f(this));
        for (p134s4.c cVar3 : arrayList3) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AbstractC0933f abstractC0933f = (AbstractC0933f) it2.next();
                if (abstractC0933f.g(i7)) {
                    if (p136t.e.b(cVar3.f16159a, 5) || p136t.e.b(cVar3.f16159a, 1)) {
                        cVar = cVar3;
                    } else {
                        v4.r rVar = cVar3.f16160b.f17192a;
                        v4.m mVar = v4.m.f17195a;
                        v4.k kVar = lVar.f17194c;
                        if (!kVar.equals(mVar) && !kVar.equals((v4.k) this.f11336c)) {
                            throw new IllegalArgumentException("Index not available in IndexedNode!");
                        }
                        lVar.l();
                        boolean zM = D.m(lVar.f17193b, v4.l.f17191d);
                        v4.c cVar4 = cVar3.f16162d;
                        if (zM) {
                            cVarN = lVar.f17192a.n(cVar4);
                        } else {
                            v4.p pVar = (v4.p) lVar.f17193b.f14781a.A(new v4.p(cVar4, rVar));
                            cVarN = pVar != null ? pVar.f17201a : null;
                        }
                        cVar = new p134s4.c(cVar3.f16159a, cVar3.f16160b, cVar3.f16162d, cVarN, cVar3.f16161c);
                    }
                    arrayList.add(abstractC0933f.b(cVar, (p134s4.h) this.f11335b));
                }
            }
        }
    }

    public v4.r C() {
        p134s4.a aVar = (p134s4.a) this.f11335b;
        if (aVar.f16154b) {
            return aVar.f16153a.f17192a;
        }
        return null;
    }

    public v4.r D() {
        p134s4.a aVar = (p134s4.a) this.f11336c;
        if (aVar.f16154b) {
            return aVar.f16153a.f17192a;
        }
        return null;
    }

    public Long E(String str) {
        D0.k kVarC = D0.k.c(1, "SELECT long_value FROM Preference where `key`=?");
        kVarC.f(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f11335b;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(kVarC);
        try {
            Long lValueOf = null;
            if (cursorG.moveToFirst() && !cursorG.isNull(0)) {
                lValueOf = Long.valueOf(cursorG.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorG.close();
            kVarC.g();
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
        D0.k kVarC = D0.k.c(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            kVarC.e(1);
        } else {
            kVarC.f(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f11335b;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(kVarC);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            cursorG.close();
            kVarC.g();
            return arrayList;
        } catch (Throwable th) {
            cursorG.close();
            kVarC.g();
            throw th;
        }
    }

    public boolean H(CharSequence charSequence, int i7, int i8, p046g0.n nVar) {
        if (nVar.f13045c == 0) {
            p046g0.d dVar = (p046g0.d) this.f11336c;
            p052h0.a aVarC = nVar.c();
            int iA = aVarC.a(8);
            if (iA != 0) {
                ((ByteBuffer) aVarC.f5028d).getShort(iA + aVarC.f5025a);
            }
            dVar.getClass();
            ThreadLocal threadLocal = p046g0.d.f13019b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i7 < i8) {
                sb.append(charSequence.charAt(i7));
                i7++;
            }
            TextPaint textPaint = dVar.f13020a;
            String string = sb.toString();
            int i9 = I.e.f3466a;
            nVar.f13045c = I.d.a(textPaint, string) ? 2 : 1;
        }
        return nVar.f13045c == 2;
    }

    public void I(p088m1.c cVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f11335b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((p088m1.b) this.f11336c).e(cVar);
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    public void J(p158w4.d dVar) {
        ((p083l4.y) this.f11336c).f15034i.execute(new p083l4.x(1, this, dVar));
    }

    public void K(String str) {
        p158w4.c cVar = (p158w4.c) this.f11335b;
        synchronized (cVar) {
            cVar.e((byte) 1, str.getBytes(p158w4.c.f18055m));
        }
    }

    public void L(p003a.a aVar) {
        ((androidx.lifecycle.B) this.f11335b).g(aVar);
        boolean z4 = aVar instanceof p023d1.r;
        p103o1.k kVar = (p103o1.k) this.f11336c;
        if (z4) {
            kVar.i((p023d1.r) aVar);
        } else if (aVar instanceof p023d1.p) {
            kVar.j(((p023d1.p) aVar).f12375e);
        }
    }

    public v4.r M(C0934g c0934g) {
        return ((C0929b) ((p098n4.M) this.f11336c).f15389a).C(((C0934g) this.f11335b).m(c0934g));
    }

    public w N(v4.l lVar, boolean z4, boolean z7) {
        return new w(18, new p134s4.a(lVar, z4, z7), (p134s4.a) this.f11336c);
    }

    @Override // p078l.a
    public boolean a(p078l.b bVar, p086m.k kVar) {
        ViewGroup viewGroup = ((p058i.v) this.f11336c).f13771R;
        WeakHashMap weakHashMap = U.f5037a;
        P.G.c(viewGroup);
        return ((p078l.a) this.f11335b).a(bVar, kVar);
    }

    @Override // p083l4.u
    public void b(String str, String str2) {
        ((C0940m) ((p033e3.h) this.f11336c).f12673a).m(((p098n4.M) this.f11335b).d(C0940m.c(str, str2)));
    }

    @Override // p098n4.G
    public void c(boolean z4, p028d6.k kVar) {
        p026d4.b bVar = (p026d4.b) ((AtomicReference) this.f11336c).get();
        if (bVar != null) {
            ((p014b4.d) bVar).b(z4).addOnSuccessListener(new p069j4.b(kVar, 0)).addOnFailureListener(new p069j4.c(kVar, 0));
        } else {
            kVar.q(null);
        }
    }

    @Override // p068j2.f
    public int d(long j) {
        long[] jArr = (long[]) this.f11336c;
        int iB = p151v2.t.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override // p078l.a
    public boolean e(p078l.b bVar, p086m.k kVar) {
        return ((p078l.a) this.f11335b).e(bVar, kVar);
    }

    @Override // p121q5.s
    public void f(KeyEvent keyEvent, B3.g gVar) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            gVar.g(false);
            return;
        }
        Character chA = ((p023d1.n) this.f11336c).a(keyEvent.getUnicodeChar());
        boolean z4 = action != 0;
        R5.F f7 = new R5.F(gVar, 18);
        x0 x0Var = (x0) this.f11335b;
        HashMap map = new HashMap();
        map.put("type", z4 ? "keyup" : "keydown");
        map.put("keymap", "android");
        map.put("flags", Integer.valueOf(keyEvent.getFlags()));
        map.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        map.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        map.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        map.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        map.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        map.put("character", chA.toString());
        map.put("source", Integer.valueOf(keyEvent.getSource()));
        map.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        map.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        ((F0) x0Var.f613b).L(map, new R5.F(f7, 20));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [i.j, java.lang.Object] */
    @Override // p078l.a
    public void g(p078l.b bVar) {
        ((p078l.a) this.f11335b).g(bVar);
        p058i.v vVar = (p058i.v) this.f11336c;
        if (vVar.f13767N != null) {
            vVar.f13756C.getDecorView().removeCallbacks(vVar.f13768O);
        }
        if (vVar.f13766M != null) {
            b0 b0Var = vVar.f13769P;
            if (b0Var != null) {
                b0Var.b();
            }
            b0 b0VarA = U.a(vVar.f13766M);
            b0VarA.a(0.0f);
            vVar.f13769P = b0VarA;
            b0VarA.d(new p058i.o(this, 2));
        }
        vVar.f13758E.onSupportActionModeFinished(vVar.f13765L);
        vVar.f13765L = null;
        ViewGroup viewGroup = vVar.f13771R;
        WeakHashMap weakHashMap = U.f5037a;
        P.G.c(viewGroup);
        vVar.J();
    }

    @Override // p068j2.f
    public long h(int i7) {
        p151v2.a.f(i7 >= 0);
        long[] jArr = (long[]) this.f11336c;
        p151v2.a.f(i7 < jArr.length);
        return jArr[i7];
    }

    @Override // p061i2.q
    public p146u2.M i(p061i2.m mVar, p061i2.j jVar) {
        ((p036e6.c) this.f11335b).getClass();
        return new P2(27, new p061i2.p(mVar, jVar), (List) this.f11336c, false);
    }

    @Override // p061i2.q
    public p146u2.M j() {
        return new P2(27, ((p036e6.c) this.f11335b).j(), (List) this.f11336c, false);
    }

    @Override // p078l.a
    public boolean k(p078l.b bVar, MenuItem menuItem) {
        return ((p078l.a) this.f11335b).k(bVar, menuItem);
    }

    @Override // p068j2.f
    public List m(long j) {
        p068j2.b bVar;
        int iF = p151v2.t.f((long[]) this.f11336c, j, false);
        return (iF == -1 || (bVar = ((p068j2.b[]) this.f11335b)[iF]) == p068j2.b.f14573I) ? Collections.emptyList() : Collections.singletonList(bVar);
    }

    public synchronized ArrayList n(String str) {
        ArrayList arrayList;
        AbstractC0997i0.m();
        Objects.toString(AbstractC0998i1.f17749c.getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str))));
        File fileStreamPath = AbstractC0998i1.f17749c.getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str)));
        ArrayList arrayList2 = null;
        DataInputStream dataInputStream = null;
        if (fileStreamPath.exists()) {
            try {
                try {
                    DataInputStream dataInputStream2 = new DataInputStream(new FileInputStream(fileStreamPath));
                    try {
                        int unsignedShort = dataInputStream2.readUnsignedShort();
                        if (unsignedShort == 0) {
                            AbstractC0997i0.h(dataInputStream2);
                            return null;
                        }
                        arrayList = new ArrayList(unsignedShort);
                        for (int i7 = 0; i7 < unsignedShort; i7++) {
                            try {
                                byte[] bArr = new byte[dataInputStream2.readUnsignedShort()];
                                dataInputStream2.readFully(bArr);
                                arrayList.add(new String(bArr));
                            } catch (Throwable th) {
                                th = th;
                            }
                        }
                        dataInputStream2.readUnsignedShort();
                        AbstractC0997i0.h(dataInputStream2);
                        arrayList2 = arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        arrayList = null;
                    }
                    dataInputStream = dataInputStream2;
                } catch (Throwable th3) {
                    th = th3;
                    arrayList = null;
                }
                Log.getStackTraceString(th);
                AbstractC0997i0.h(dataInputStream);
                arrayList2 = arrayList;
            } catch (Throwable th4) {
                AbstractC0997i0.h(dataInputStream);
                throw th4;
            }
        }
        return arrayList2;
    }

    @Override // B3.k
    public void onConsentFormLoadSuccess(B3.c cVar) {
        if (((zzj) this.f11335b).getConsentStatus() == 2) {
            cVar.show(((y1.a) this.f11336c).f18133a, new N5.e(this, 1));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0421, code lost:
    
        if (r2.equals("share") == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0459, code lost:
    
        if (r2.equals("shareFilesWithResult") == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0462, code lost:
    
        if (r2.equals("shareWithResult") == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0467, code lost:
    
        if ((r8 instanceof java.util.Map) == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0469, code lost:
    
        if (r3 == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0473, code lost:
    
        if (r12.a((A5.p) r20) != false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0477, code lost:
    
        r2 = r19.a("text");
        t6.h.c(r2, "null cannot be cast to non-null type kotlin.String");
        r6.n((java.lang.String) r2, (java.lang.String) r19.a("subject"), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0489, code lost:
    
        if (r3 != false) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x048b, code lost:
    
        if (r3 == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x048d, code lost:
    
        ((A5.p) r20).success("dev.fluttercommunity.plus/share/unavailable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0496, code lost:
    
        ((A5.p) r20).success(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x04a4, code lost:
    
        throw new java.lang.IllegalArgumentException("Map arguments expected");
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x04ab, code lost:
    
        if (r2.equals("shareFiles") == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x04b7, code lost:
    
        if ((r8 instanceof java.util.Map) == false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x04b9, code lost:
    
        if (r3 == false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x04c3, code lost:
    
        if (r12.a((A5.p) r20) != false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x04c6, code lost:
    
        r2 = r19.a("paths");
        t6.h.b(r2);
        r6.o((java.util.List) r2, (java.util.List) r19.a("mimeTypes"), (java.lang.String) r19.a("text"), (java.lang.String) r19.a("subject"), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x04ee, code lost:
    
        if (r3 != false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x04f0, code lost:
    
        if (r3 == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x04f2, code lost:
    
        ((A5.p) r20).success("dev.fluttercommunity.plus/share/unavailable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x04fa, code lost:
    
        ((A5.p) r20).success(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0502, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0503, code lost:
    
        ((A5.p) r20).error("Share failed", r0.getMessage(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0510, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0516, code lost:
    
        throw new java.lang.IllegalArgumentException("Map arguments expected");
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:?, code lost:
    
        return;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // A5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMethodCall(A5.o oVar, A5.r rVar) {
        ?? IsLocationEnabled;
        switch (this.f11334a) {
            case 14:
                t6.h.e(oVar, "call");
                String str = oVar.f676a;
                t6.h.d(str, Request.JsonKeys.METHOD);
                boolean zEndsWith = str.endsWith("WithResult");
                int iHashCode = str.hashCode();
                I4.j jVar = (I4.j) this.f11335b;
                Object obj = oVar.f677b;
                p107o5.b bVar = (p107o5.b) this.f11336c;
                switch (iHashCode) {
                    case -1811378728:
                        break;
                    case -1594861118:
                        break;
                    case -1212337029:
                        break;
                    case -743768819:
                        if (str.equals("shareUri")) {
                            if (!(obj instanceof Map)) {
                                throw new IllegalArgumentException("Map arguments expected");
                            }
                            Object objA = oVar.a("uri");
                            t6.h.c(objA, "null cannot be cast to non-null type kotlin.String");
                            jVar.n((String) objA, null, false);
                            if (zEndsWith) {
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
                break;
            default:
                String str2 = oVar.f676a;
                str2.getClass();
                Context context = (Context) this.f11335b;
                p138t1.c cVar = (p138t1.c) this.f11336c;
                Object obj2 = oVar.f677b;
                switch (str2) {
                    case "checkServiceStatus":
                        int i7 = Integer.parseInt(obj2.toString());
                        if (context == null) {
                            Log.d("permissions_handler", "Context cannot be null.");
                            ((A5.p) rVar).error("PermissionHandler.ServiceManager", "Android context cannot be null.", null);
                            return;
                        }
                        if (i7 == 3 || i7 == 4 || i7 == 5) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                LocationManager locationManager = (LocationManager) context.getSystemService(LocationManager.class);
                                IsLocationEnabled = locationManager == null ? 0 : locationManager.isLocationEnabled();
                            } else {
                                try {
                                    IsLocationEnabled = Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0;
                                } catch (Settings.SettingNotFoundException e7) {
                                    e7.printStackTrace();
                                }
                            }
                            ((A5.p) rVar).success(Integer.valueOf((int) IsLocationEnabled));
                            return;
                        }
                        if (i7 == 21) {
                            ((A5.p) rVar).success(Integer.valueOf(((BluetoothManager) context.getSystemService("bluetooth")).getAdapter().isEnabled() ? 1 : 0));
                            return;
                        }
                        if (i7 != 8) {
                            if (i7 == 16) {
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
                        if ((Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(intent, 0)).isEmpty()) {
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
                        int i8 = Integer.parseInt(obj2.toString());
                        p121q5.c cVar2 = cVar.f16283c;
                        if (cVar2 == null) {
                            Log.d("permissions_handler", "Unable to detect current Activity.");
                            ((A5.p) rVar).error("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.", null);
                            return;
                        }
                        ArrayList arrayListE = p115p6.c.e(i8, cVar2);
                        if (arrayListE == null) {
                            Log.d("permissions_handler", "No android specific permissions needed for: " + i8);
                            ((A5.p) rVar).success(Boolean.FALSE);
                            return;
                        }
                        if (!arrayListE.isEmpty()) {
                            ((A5.p) rVar).success(Boolean.valueOf(AbstractC0210f.b(cVar.f16283c, (String) arrayListE.get(0))));
                            return;
                        }
                        Log.d("permissions_handler", "No permissions found in manifest for: " + i8 + " no need to show request rationale");
                        ((A5.p) rVar).success(Boolean.FALSE);
                        return;
                    case "checkPermissionStatus":
                        ((A5.p) rVar).success(Integer.valueOf(cVar.a(Integer.parseInt(obj2.toString()))));
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
                        List<Integer> list = (List) obj2;
                        A5.p pVar = (A5.p) rVar;
                        p138t1.a aVar = new p138t1.a(pVar);
                        if (cVar.f16284d > 0) {
                            pVar.error("PermissionHandler.PermissionManager", "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).", null);
                            return;
                        }
                        if (cVar.f16283c == null) {
                            Log.d("permissions_handler", "Unable to detect current Activity.");
                            pVar.error("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.", null);
                            return;
                        }
                        cVar.f16282b = aVar;
                        cVar.f16285e = new HashMap();
                        cVar.f16284d = 0;
                        ArrayList arrayList = new ArrayList();
                        for (Integer num : list) {
                            if (cVar.a(num.intValue()) != 1) {
                                ArrayList arrayListE2 = p115p6.c.e(num.intValue(), cVar.f16283c);
                                if (arrayListE2 != null && !arrayListE2.isEmpty()) {
                                    int i9 = Build.VERSION.SDK_INT;
                                    if (num.intValue() == 16) {
                                        cVar.c(209, "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                                    } else if (i9 >= 30 && num.intValue() == 22) {
                                        cVar.c(210, "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
                                    } else if (num.intValue() == 23) {
                                        cVar.c(211, "android.settings.action.MANAGE_OVERLAY_PERMISSION");
                                    } else if (i9 >= 26 && num.intValue() == 24) {
                                        cVar.c(212, "android.settings.MANAGE_UNKNOWN_APP_SOURCES");
                                    } else if (num.intValue() == 27) {
                                        cVar.c(213, "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
                                    } else if (i9 >= 31 && num.intValue() == 34) {
                                        cVar.c(214, "android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                                    } else if (num.intValue() != 37 && num.intValue() != 0) {
                                        arrayList.addAll(arrayListE2);
                                        cVar.f16284d = arrayListE2.size() + cVar.f16284d;
                                    } else if (cVar.b()) {
                                        arrayList.add("android.permission.WRITE_CALENDAR");
                                        arrayList.add("android.permission.READ_CALENDAR");
                                        cVar.f16284d += 2;
                                    } else {
                                        cVar.f16285e.put(num, 0);
                                    }
                                } else if (!cVar.f16285e.containsKey(num)) {
                                    cVar.f16285e.put(num, 0);
                                    if (num.intValue() != 22 || Build.VERSION.SDK_INT >= 30) {
                                        cVar.f16285e.put(num, 0);
                                    } else {
                                        cVar.f16285e.put(num, 2);
                                    }
                                }
                            } else if (!cVar.f16285e.containsKey(num)) {
                                cVar.f16285e.put(num, 1);
                            }
                        }
                        if (arrayList.size() > 0) {
                            AbstractC0210f.a(cVar.f16283c, (String[]) arrayList.toArray(new String[0]), 24);
                        }
                        p138t1.a aVar2 = cVar.f16282b;
                        if (aVar2 == null || cVar.f16284d != 0) {
                            return;
                        }
                        aVar2.f16277a.success(cVar.f16285e);
                        return;
                    default:
                        ((A5.p) rVar).notImplemented();
                        return;
                }
        }
    }

    @Override // p068j2.f
    public int p() {
        return ((long[]) this.f11336c).length;
    }

    public synchronized void q(String str, String str2, List list) {
        try {
            AbstractC0997i0.m();
            Objects.toString(AbstractC0998i1.f17749c.getFileStreamPath(z(str)));
            p028d6.k kVar = new p028d6.k(AbstractC0998i1.f17749c.getFileStreamPath(z(str)), str2, 1, new C1009l0(27));
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                C1031r0 c1031r0 = new C1031r0();
                c1031r0.f17847a = str3;
                arrayList.add(c1031r0);
            }
            kVar.g(arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean r(String str, String str2) {
        boolean zRemove;
        List list = (List) ((LinkedHashMap) this.f11336c).get(str2);
        if (list != null) {
            File file = (File) C1029q0.a(str).f12447b;
            if (file != null) {
                file.delete();
            }
            zRemove = list.remove(str);
        } else {
            zRemove = false;
        }
        if (list == null || list.isEmpty()) {
            synchronized (this) {
                try {
                    AbstractC0997i0.m();
                    File fileStreamPath = AbstractC0998i1.f17749c.getFileStreamPath(z(str2));
                    List list2 = (List) ((LinkedHashMap) this.f11336c).get(str2);
                    List<String> listEmptyList = list2 == null ? Collections.emptyList() : new ArrayList(list2);
                    if (listEmptyList != null && !listEmptyList.isEmpty()) {
                        listEmptyList.size();
                        for (String str3 : listEmptyList) {
                            File file2 = (File) C1029q0.a(str3).f12447b;
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
        return zRemove;
    }

    public synchronized void s() {
        LinkedList linkedList = new LinkedList(((LinkedHashMap) this.f11336c).keySet());
        File fileStreamPath = AbstractC0998i1.f17749c.getFileStreamPath(z((String) this.f11335b));
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
            return Tasks.forException(new p042f4.t(message));
        }
        zzagm zzagmVar = (zzagm) task.getResult();
        String strZza = zzagmVar.zza();
        if (zzag.zzc(strZza)) {
            return Tasks.forException(new p042f4.t(p155w1.L.i("No Recaptcha Enterprise siteKey configured for tenant/project ", (String) this.f11335b)));
        }
        List<String> listZza = zzx.zza('/').zza((CharSequence) strZza);
        String str = listZza.size() != 4 ? null : listZza.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception(p155w1.L.i("Invalid siteKey format ", strZza)));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + ((String) this.f11335b));
        }
        Q3.o oVar = (Q3.o) this.f11336c;
        p042f4.H h6 = (p042f4.H) oVar.f5827f;
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

    public v4.r w(v4.c cVar, p134s4.a aVar) {
        p098n4.M m7 = (p098n4.M) this.f11336c;
        m7.getClass();
        C0934g c0934gT = ((C0934g) this.f11335b).t(cVar);
        v4.r rVarC = ((C0929b) m7.f15389a).C(c0934gT);
        if (rVarC != null) {
            return rVarC;
        }
        if (aVar.a(cVar)) {
            return ((C0929b) m7.f15389a).z(c0934gT).t(aVar.f16153a.f17192a.o(cVar));
        }
        return null;
    }

    public v4.r x(v4.r rVar) {
        p098n4.M m7 = (p098n4.M) this.f11336c;
        m7.getClass();
        v4.r rVarS = v4.j.f17190e;
        C0929b c0929b = (C0929b) m7.f15389a;
        C0934g c0934g = (C0934g) this.f11335b;
        v4.r<v4.p> rVarC = c0929b.C(c0934g);
        if (rVarC == null) {
            C0929b c0929bZ = ((C0929b) m7.f15389a).z(c0934g);
            Iterator it = rVar.iterator();
            while (it.hasNext()) {
                v4.p pVar = (v4.p) it.next();
                rVarS = rVarS.s(pVar.f17201a, c0929bZ.z(new C0934g(pVar.f17201a)).t(pVar.f17202b));
            }
            ArrayList<v4.p> arrayList = new ArrayList();
            p120q4.c cVar = c0929bZ.f15398a;
            Object obj = cVar.f15861a;
            if (obj != null) {
                for (v4.p pVar2 : (v4.r) obj) {
                    arrayList.add(new v4.p(pVar2.f17201a, pVar2.f17202b));
                }
            } else {
                for (Map.Entry entry : cVar.f15862b) {
                    p120q4.c cVar2 = (p120q4.c) entry.getValue();
                    if (cVar2.f15861a != null) {
                        arrayList.add(new v4.p((v4.c) entry.getKey(), (v4.r) cVar2.f15861a));
                    }
                }
            }
            for (v4.p pVar3 : arrayList) {
                rVarS = rVarS.s(pVar3.f17201a, pVar3.f17202b);
            }
        } else if (!rVarC.r()) {
            for (v4.p pVar4 : rVarC) {
                rVarS = rVarS.s(pVar4.f17201a, pVar4.f17202b);
            }
        }
        return rVarS;
    }

    public v4.r y(C0934g c0934g, v4.r rVar, v4.r rVar2) {
        p098n4.M m7 = (p098n4.M) this.f11336c;
        m7.getClass();
        p120q4.k.b("Either existingEventSnap or existingServerSnap must exist", (rVar == null && rVar2 == null) ? false : true);
        C0934g c0934gM = ((C0934g) this.f11335b).m(c0934g);
        if (((C0929b) m7.f15389a).C(c0934gM) != null) {
            return null;
        }
        C0929b c0929bZ = ((C0929b) m7.f15389a).z(c0934gM);
        return c0929bZ.f15398a.isEmpty() ? rVar2.g(c0934g) : c0929bZ.t(rVar2.g(c0934g));
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
                this.f11336c = new p103o1.k();
                L(p023d1.s.f12377r);
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

    public w(I4.j jVar, p107o5.b bVar) {
        this.f11334a = 14;
        t6.h.e(bVar, "manager");
        this.f11335b = jVar;
        this.f11336c = bVar;
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

    public w(Context context, C1009l0 c1009l0, p138t1.c cVar, C1013m0 c1013m0) {
        this.f11334a = 19;
        this.f11335b = context;
        this.f11336c = cVar;
    }

    public w(WorkDatabase_Impl workDatabase_Impl, int i7) {
        this.f11334a = i7;
        switch (i7) {
            case 11:
                this.f11335b = workDatabase_Impl;
                this.f11336c = new p088m1.b(workDatabase_Impl, 6);
                break;
            default:
                this.f11335b = workDatabase_Impl;
                this.f11336c = new p088m1.b(workDatabase_Impl, 1);
                break;
        }
    }

    public w(x0 x0Var) {
        this.f11334a = 16;
        this.f11336c = new p023d1.n();
        this.f11335b = x0Var;
    }

    public w(p048g4.o oVar) {
        this.f11334a = 8;
        this.f11335b = oVar;
        this.f11336c = new AtomicReference();
        oVar.a(new R5.F(this, 15));
    }

    public w(p134s4.h hVar) {
        this.f11334a = 17;
        this.f11335b = hVar;
        this.f11336c = hVar.f16179b.f16176g;
    }

    public w(p083l4.y yVar, p158w4.c cVar) {
        this.f11334a = 9;
        this.f11336c = yVar;
        this.f11335b = cVar;
        cVar.f18060c = this;
    }

    public w(p078l.k kVar, int i7) {
        this.f11334a = i7;
        switch (i7) {
            case 27:
                p033e3.h hVar = new p033e3.h(this);
                A5.s sVar = new A5.s(kVar, "flutter/platform_views_2", A5.y.f688b, null);
                this.f11335b = sVar;
                sVar.b(hVar);
                break;
            default:
                p096n1.e eVar = new p096n1.e(this, 25);
                A5.s sVar2 = new A5.s(kVar, "flutter/localization", A5.m.f675a, null);
                this.f11335b = sVar2;
                sVar2.b(eVar);
                break;
        }
    }

    public w(p078l.k kVar, PackageManager packageManager) {
        this.f11334a = 28;
        p096n1.e eVar = new p096n1.e(this, 26);
        this.f11335b = packageManager;
        new A5.s(kVar, "flutter/processtext", A5.y.f688b, null).b(eVar);
    }

    public w(F0 f7, C1013m0 c1013m0, p046g0.d dVar) {
        this.f11334a = 5;
        this.f11335b = f7;
        this.f11336c = dVar;
    }
}
