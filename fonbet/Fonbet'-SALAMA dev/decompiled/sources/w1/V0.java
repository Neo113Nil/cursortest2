package w1;

import C1.C0095a;
import E4.C0177j;
import E4.EnumC0176i;
import G4.C0270c;
import G4.InterfaceC0273f;
import W5.AbstractC0486a1;
import Y4.C0567d;
import Y4.C0569e;
import a.AbstractC0603a;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.AbstractComponentCallbacksC0722v;
import b0.C0767o;
import b0.C0768p;
import b4.C0784d;
import b5.C0788a;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.firebase.Timestamp;
import com.google.protobuf.AbstractC0911k;
import com.google.protobuf.C0909j;
import f6.C1116i;
import i6.InterfaceC1287d;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import k4.AbstractC1341c;
import k4.C1343e;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class V0 implements A5.c, A5.d, G4.D, G6.g, J2.c, B3.k, F1.e, P1.z {

    /* renamed from: d, reason: collision with root package name */
    public static V0 f17559d;

    /* renamed from: e, reason: collision with root package name */
    public static C5.a f17560e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17561a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17562b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17563c;

    public /* synthetic */ V0(int i7, Object obj, Object obj2) {
        this.f17561a = i7;
        this.f17563c = obj;
        this.f17562b = obj2;
    }

    public static synchronized V0 d() {
        V0 v02;
        synchronized (V0.class) {
            try {
                if (f17559d == null) {
                    f17559d = new V0(0);
                }
                v02 = f17559d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return v02;
    }

    public void A(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v, boolean z4) {
        t6.h.e(abstractComponentCallbacksC0722v, "f");
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = ((androidx.fragment.app.Q) this.f17562b).f9405x;
        if (abstractComponentCallbacksC0722v2 != null) {
            abstractComponentCallbacksC0722v2.i().f9395n.A(abstractComponentCallbacksC0722v, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17563c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void B(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v, boolean z4) {
        t6.h.e(abstractComponentCallbacksC0722v, "f");
        androidx.fragment.app.Q q7 = (androidx.fragment.app.Q) this.f17562b;
        androidx.fragment.app.A a2 = q7.f9403v.f9552b;
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = q7.f9405x;
        if (abstractComponentCallbacksC0722v2 != null) {
            abstractComponentCallbacksC0722v2.i().f9395n.B(abstractComponentCallbacksC0722v, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17563c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void C(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v, boolean z4) {
        t6.h.e(abstractComponentCallbacksC0722v, "f");
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = ((androidx.fragment.app.Q) this.f17562b).f9405x;
        if (abstractComponentCallbacksC0722v2 != null) {
            abstractComponentCallbacksC0722v2.i().f9395n.C(abstractComponentCallbacksC0722v, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17563c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void D(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v, boolean z4) {
        t6.h.e(abstractComponentCallbacksC0722v, "f");
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = ((androidx.fragment.app.Q) this.f17562b).f9405x;
        if (abstractComponentCallbacksC0722v2 != null) {
            abstractComponentCallbacksC0722v2.i().f9395n.D(abstractComponentCallbacksC0722v, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17563c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void E(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v, boolean z4) {
        t6.h.e(abstractComponentCallbacksC0722v, "f");
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = ((androidx.fragment.app.Q) this.f17562b).f9405x;
        if (abstractComponentCallbacksC0722v2 != null) {
            abstractComponentCallbacksC0722v2.i().f9395n.E(abstractComponentCallbacksC0722v, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17563c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void F(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v, boolean z4) {
        t6.h.e(abstractComponentCallbacksC0722v, "f");
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = ((androidx.fragment.app.Q) this.f17562b).f9405x;
        if (abstractComponentCallbacksC0722v2 != null) {
            abstractComponentCallbacksC0722v2.i().f9395n.F(abstractComponentCallbacksC0722v, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17563c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void G(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v, boolean z4) {
        t6.h.e(abstractComponentCallbacksC0722v, "f");
        androidx.fragment.app.Q q7 = (androidx.fragment.app.Q) this.f17562b;
        androidx.fragment.app.A a2 = q7.f9403v.f9552b;
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = q7.f9405x;
        if (abstractComponentCallbacksC0722v2 != null) {
            abstractComponentCallbacksC0722v2.i().f9395n.G(abstractComponentCallbacksC0722v, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17563c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void H(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v, boolean z4) {
        t6.h.e(abstractComponentCallbacksC0722v, "f");
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = ((androidx.fragment.app.Q) this.f17562b).f9405x;
        if (abstractComponentCallbacksC0722v2 != null) {
            abstractComponentCallbacksC0722v2.i().f9395n.H(abstractComponentCallbacksC0722v, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17563c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void I(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v, boolean z4) {
        t6.h.e(abstractComponentCallbacksC0722v, "f");
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = ((androidx.fragment.app.Q) this.f17562b).f9405x;
        if (abstractComponentCallbacksC0722v2 != null) {
            abstractComponentCallbacksC0722v2.i().f9395n.I(abstractComponentCallbacksC0722v, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17563c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void J(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v, Bundle bundle, boolean z4) {
        t6.h.e(abstractComponentCallbacksC0722v, "f");
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = ((androidx.fragment.app.Q) this.f17562b).f9405x;
        if (abstractComponentCallbacksC0722v2 != null) {
            abstractComponentCallbacksC0722v2.i().f9395n.J(abstractComponentCallbacksC0722v, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17563c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void K(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v, boolean z4) {
        t6.h.e(abstractComponentCallbacksC0722v, "f");
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = ((androidx.fragment.app.Q) this.f17562b).f9405x;
        if (abstractComponentCallbacksC0722v2 != null) {
            abstractComponentCallbacksC0722v2.i().f9395n.K(abstractComponentCallbacksC0722v, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17563c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void L(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v, boolean z4) {
        t6.h.e(abstractComponentCallbacksC0722v, "f");
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = ((androidx.fragment.app.Q) this.f17562b).f9405x;
        if (abstractComponentCallbacksC0722v2 != null) {
            abstractComponentCallbacksC0722v2.i().f9395n.L(abstractComponentCallbacksC0722v, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17563c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void M(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v, boolean z4) {
        t6.h.e(abstractComponentCallbacksC0722v, "f");
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = ((androidx.fragment.app.Q) this.f17562b).f9405x;
        if (abstractComponentCallbacksC0722v2 != null) {
            abstractComponentCallbacksC0722v2.i().f9395n.M(abstractComponentCallbacksC0722v, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17563c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void N() {
        G4.V v6 = new G4.V(this, 0);
        Cursor rawQuery = ((SQLiteDatabase) this.f17562b).rawQuery("SELECT target_id, target_proto FROM targets", null);
        while (rawQuery.moveToNext()) {
            try {
                v6.accept(rawQuery);
            } catch (Throwable th) {
                if (rawQuery != null) {
                    try {
                        rawQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        rawQuery.close();
    }

    public byte[] O(EventMessage eventMessage) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f17562b;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = (DataOutputStream) this.f17563c;
        try {
            dataOutputStream.writeBytes(eventMessage.f10577a);
            dataOutputStream.writeByte(0);
            String str = eventMessage.f10578b;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(eventMessage.f10579c);
            dataOutputStream.writeLong(eventMessage.f10580d);
            dataOutputStream.write(eventMessage.f10581e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    public View P(int i7, int i8, int i9, int i10) {
        C0.L l7 = (C0.L) this.f17562b;
        int r7 = l7.r();
        int K7 = l7.K();
        int i11 = i8 > i7 ? 1 : -1;
        View view = null;
        while (i7 != i8) {
            View S6 = l7.S(i7);
            int j = l7.j(S6);
            int V4 = l7.V(S6);
            C0.K k7 = (C0.K) this.f17563c;
            k7.f1240b = r7;
            k7.f1241c = K7;
            k7.f1242d = j;
            k7.f1243e = V4;
            if (i9 != 0) {
                k7.f1239a = i9;
                if (k7.a()) {
                    return S6;
                }
            }
            if (i10 != 0) {
                k7.f1239a = i10;
                if (k7.a()) {
                    view = S6;
                }
            }
            i7 += i11;
        }
        return view;
    }

    public F1.k Q(Object... objArr) {
        Constructor b7;
        synchronized (((AtomicBoolean) this.f17563c)) {
            if (!((AtomicBoolean) this.f17563c).get()) {
                try {
                    b7 = ((B1.f) this.f17562b).b();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f17563c).set(true);
                } catch (Exception e7) {
                    throw new RuntimeException("Error instantiating extension", e7);
                }
            }
            b7 = null;
        }
        if (b7 == null) {
            return null;
        }
        try {
            return (F1.k) b7.newInstance(objArr);
        } catch (Exception e8) {
            throw new IllegalStateException("Unexpected error creating extractor", e8);
        }
    }

    public void R(String str, String str2) {
        C0.I i7 = (C0.I) this.f17563c;
        i7.getClass();
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            char charAt = str.charAt(i9);
            if (charAt <= 31 || charAt >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i9), str));
            }
        }
        if (str2 == null) {
            throw new IllegalArgumentException("value == null");
        }
        int length2 = str2.length();
        for (int i10 = 0; i10 < length2; i10++) {
            char charAt2 = str2.charAt(i10);
            if (charAt2 <= 31 || charAt2 >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(charAt2), Integer.valueOf(i10), str2));
            }
        }
        while (true) {
            ArrayList arrayList = i7.f1233a;
            if (i8 >= arrayList.size()) {
                arrayList.add(str);
                arrayList.add(str2.trim());
                return;
            } else {
                if (str.equalsIgnoreCase((String) arrayList.get(i8))) {
                    arrayList.remove(i8);
                    arrayList.remove(i8);
                    i8 -= 2;
                }
                i8 += 2;
            }
        }
    }

    public void S(String[] strArr, Runnable runnable) {
        String sb;
        String i7 = e1.k.i(new StringBuilder("["), TextUtils.join(", ", strArr), "]");
        boolean z4 = false;
        for (int i8 = 0; i8 < strArr.length; i8++) {
            String str = strArr[i8];
            boolean a02 = a0(str);
            if (i8 == 0) {
                z4 = a02;
            } else if (a02 != z4) {
                String h6 = AbstractC0486a1.h("Expected all of ", i7, " to either exist or not, but ");
                if (z4) {
                    StringBuilder c3 = t.e.c(h6);
                    c3.append(strArr[0]);
                    c3.append(" exists and ");
                    c3.append(str);
                    c3.append(" does not");
                    sb = c3.toString();
                } else {
                    StringBuilder c4 = t.e.c(h6);
                    c4.append(strArr[0]);
                    c4.append(" does not exist and ");
                    c4.append(str);
                    c4.append(" does");
                    sb = c4.toString();
                }
                throw new IllegalStateException(sb);
            }
        }
        if (z4) {
            Q0.a.v(1, "SQLiteSchema", AbstractC0486a1.h("Skipping migration because all of ", i7, " already exist"), new Object[0]);
        } else {
            runnable.run();
        }
    }

    public C1343e T(int i7) {
        E3.F m7 = ((C1343e) this.f17563c).m(new C0270c(H4.h.b(), i7));
        C1343e c1343e = H4.h.f3317c;
        while (((Iterator) m7.f1994b).hasNext()) {
            C0270c c0270c = (C0270c) m7.next();
            if (c0270c.f2965b != i7) {
                break;
            }
            c1343e = c1343e.l(c0270c.f2964a);
        }
        return c1343e;
    }

    public void U(Q3.l lVar) {
        Q3.m mVar = new Q3.m(lVar.f5816a, R3.g.class);
        HashMap hashMap = (HashMap) this.f17562b;
        if (!hashMap.containsKey(mVar)) {
            hashMap.put(mVar, lVar);
            return;
        }
        Q3.l lVar2 = (Q3.l) hashMap.get(mVar);
        if (lVar2.equals(lVar) && lVar.equals(lVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + mVar);
    }

    public void V(J3.m mVar) {
        if (mVar == null) {
            throw new NullPointerException("wrapper must be non-null");
        }
        Class b7 = mVar.b();
        HashMap hashMap = (HashMap) this.f17563c;
        if (!hashMap.containsKey(b7)) {
            hashMap.put(b7, mVar);
            return;
        }
        J3.m mVar2 = (J3.m) hashMap.get(b7);
        if (mVar2.equals(mVar) && mVar.equals(mVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + b7);
    }

    public C1343e W(int i7) {
        E3.F m7 = ((C1343e) this.f17563c).m(new C0270c(H4.h.b(), i7));
        C1343e c1343e = H4.h.f3317c;
        while (((Iterator) m7.f1994b).hasNext()) {
            C0270c c0270c = (C0270c) m7.next();
            if (c0270c.f2965b != i7) {
                break;
            }
            c1343e = c1343e.l(c0270c.f2964a);
            this.f17562b = ((C1343e) this.f17562b).t(c0270c);
            this.f17563c = ((C1343e) this.f17563c).t(c0270c);
        }
        return c1343e;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r9v0 ??, r9v3 ??, r9v5 ??, r9v4 ??, r9v7 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.trySplitConstInsns(FixTypesVisitor.java:457)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    public void X(int r25) {
        /*
            Method dump skipped, instructions count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.V0.X(int):void");
    }

    public void Y(int i7, Bundle bundle, Messenger messenger) {
        Message obtain = Message.obtain();
        obtain.what = i7;
        obtain.arg1 = 1;
        obtain.setData(bundle);
        obtain.replyTo = messenger;
        ((Messenger) this.f17562b).send(obtain);
    }

    public boolean Z(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = ((SQLiteDatabase) this.f17562b).rawQuery("PRAGMA table_info(" + str + ")", null);
            int columnIndex = cursor.getColumnIndex("name");
            while (cursor.moveToNext()) {
                arrayList.add(cursor.getString(columnIndex));
            }
            cursor.close();
            return arrayList.indexOf(str2) != -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // P1.z
    public void a(C0095a c0095a) {
        P1.C c3;
        if (c0095a.t() == 0 && (c0095a.t() & 128) != 0) {
            c0095a.E(6);
            int d7 = c0095a.d() / 4;
            int i7 = 0;
            while (true) {
                c3 = (P1.C) this.f17563c;
                if (i7 >= d7) {
                    break;
                }
                F1.x xVar = (F1.x) this.f17562b;
                c0095a.f(xVar.f2586d, 0, 4);
                xVar.o(0);
                int i8 = xVar.i(16);
                xVar.r(3);
                if (i8 == 0) {
                    xVar.r(13);
                } else {
                    int i9 = xVar.i(13);
                    if (c3.f5129f.get(i9) == null) {
                        c3.f5129f.put(i9, new P1.A(new O1.k(c3, i9)));
                        c3.f5134l++;
                    }
                }
                i7++;
            }
            if (c3.f5124a != 2) {
                c3.f5129f.remove(0);
            }
        }
    }

    public boolean a0(String str) {
        Cursor rawQueryWithFactory = ((SQLiteDatabase) this.f17562b).rawQueryWithFactory(new G4.Q(new Object[]{str}, 0), "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?", null, null);
        try {
            boolean z4 = !rawQueryWithFactory.moveToFirst();
            rawQueryWithFactory.close();
            return !z4;
        } catch (Throwable th) {
            if (rawQueryWithFactory != null) {
                try {
                    rawQueryWithFactory.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // F1.e
    public F1.d b(F1.h hVar, long j) {
        F1.d dVar;
        long j3 = hVar.f2534d;
        int min = (int) Math.min(20000L, hVar.f2533c - j3);
        C0095a c0095a = (C0095a) this.f17563c;
        c0095a.A(min);
        hVar.c((byte[]) c0095a.f1465c, 0, min, false);
        int i7 = -1;
        int i8 = -1;
        long j7 = -9223372036854775807L;
        while (c0095a.d() >= 4) {
            if (I1.b.a(c0095a.f1463a, (byte[]) c0095a.f1465c) != 442) {
                c0095a.E(1);
            } else {
                c0095a.E(4);
                long c3 = P1.w.c(c0095a);
                if (c3 != -9223372036854775807L) {
                    long b7 = ((v2.s) this.f17562b).b(c3);
                    if (b7 > j) {
                        if (j7 == -9223372036854775807L) {
                            return new F1.d(-1, b7, j3);
                        }
                        dVar = new F1.d(0, -9223372036854775807L, j3 + i8);
                    } else if (100000 + b7 > j) {
                        dVar = new F1.d(0, -9223372036854775807L, j3 + c0095a.f1463a);
                    } else {
                        i8 = c0095a.f1463a;
                        j7 = b7;
                    }
                    return dVar;
                }
                int i9 = c0095a.f1464b;
                if (c0095a.d() >= 10) {
                    c0095a.E(9);
                    int t7 = c0095a.t() & 7;
                    if (c0095a.d() >= t7) {
                        c0095a.E(t7);
                        if (c0095a.d() >= 4) {
                            if (I1.b.a(c0095a.f1463a, (byte[]) c0095a.f1465c) == 443) {
                                c0095a.E(4);
                                int y4 = c0095a.y();
                                if (c0095a.d() < y4) {
                                    c0095a.D(i9);
                                } else {
                                    c0095a.E(y4);
                                }
                            }
                            while (true) {
                                if (c0095a.d() < 4) {
                                    break;
                                }
                                int a2 = I1.b.a(c0095a.f1463a, (byte[]) c0095a.f1465c);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                c0095a.E(4);
                                if (c0095a.d() < 2) {
                                    c0095a.D(i9);
                                    break;
                                }
                                c0095a.D(Math.min(c0095a.f1464b, c0095a.f1463a + c0095a.y()));
                            }
                        } else {
                            c0095a.D(i9);
                        }
                    } else {
                        c0095a.D(i9);
                    }
                } else {
                    c0095a.D(i9);
                }
                i7 = c0095a.f1463a;
            }
        }
        return j7 != -9223372036854775807L ? new F1.d(-2, j7, j3 + i7) : F1.d.f2514d;
    }

    @Override // G4.D
    public void e(InterfaceC0273f interfaceC0273f) {
        this.f17563c = interfaceC0273f;
    }

    @Override // A5.c
    public void f(Object obj) {
        ((s5.f) this.f17562b).a(((A5.n) ((F0) ((P2) this.f17563c).f17509c).f17375d).a(obj));
    }

    @Override // F1.e
    public void g() {
        byte[] bArr = v2.t.f17158f;
        C0095a c0095a = (C0095a) this.f17563c;
        c0095a.getClass();
        c0095a.B(bArr.length, bArr);
    }

    public void h(Context context, MatrixCursor matrixCursor) {
        if (((U0) this.f17562b) == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                if (context instanceof Application) {
                    T0 a2 = T0.a();
                    if (a2.f17541e == null) {
                        if (matrixCursor != null) {
                            matrixCursor.moveToFirst();
                            a2.f17537a = matrixCursor.getLong(0);
                            a2.f17538b = matrixCursor.getLong(1);
                            a2.f17539c = matrixCursor.getLong(2);
                            matrixCursor.close();
                        } else {
                            Runtime runtime = Runtime.getRuntime();
                            ActivityManager.MemoryInfo a4 = AbstractC1706i0.a(applicationContext);
                            a2.f17537a = T0.f17536k;
                            a2.f17538b = runtime.totalMemory() - runtime.freeMemory();
                            a2.f17539c = a4.totalMem - a4.availMem;
                        }
                        a2.f17541e = new S0(a2, 0);
                        V0 d7 = d();
                        S0 s02 = a2.f17541e;
                        synchronized (((ArrayList) d7.f17563c)) {
                            ((ArrayList) d7.f17563c).add(s02);
                        }
                    }
                }
                X0 a7 = X0.a();
                if (a7.f17576a == null) {
                    long nanoTime = System.nanoTime();
                    a7.f17581f = nanoTime;
                    a7.f17580e = nanoTime;
                    a7.f17576a = new S0(a7, 1);
                    V0 d8 = d();
                    S0 s03 = a7.f17576a;
                    synchronized (((ArrayList) d8.f17563c)) {
                        ((ArrayList) d8.f17563c).add(s03);
                    }
                }
                U0 u02 = new U0(this);
                this.f17562b = u02;
                ((Application) applicationContext).registerActivityLifecycleCallbacks(u02);
            }
        }
    }

    @Override // G4.D
    public void i(H4.k kVar, H4.n nVar) {
        p3.f.O("setIndexManager() not called", ((InterfaceC0273f) this.f17563c) != null, new Object[0]);
        p3.f.O("Cannot add document to the RemoteDocumentCache with a read time of zero", !nVar.equals(H4.n.f3332b), new Object[0]);
        AbstractC1341c abstractC1341c = (AbstractC1341c) this.f17562b;
        H4.k f7 = kVar.f();
        f7.f3326d = nVar;
        H4.h hVar = kVar.f3323a;
        this.f17562b = abstractC1341c.D(hVar, f7);
        ((InterfaceC0273f) this.f17563c).s(hVar.d());
    }

    public void j(Object obj, String str) {
        ((ArrayList) this.f17563c).add(e1.k.f(str, "=", String.valueOf(obj)));
    }

    public void k() {
        this.f17562b = null;
        this.f17563c = null;
    }

    public boolean l(H4.h hVar) {
        E3.F m7 = ((C1343e) this.f17562b).m(new C0270c(hVar, 0));
        if (((Iterator) m7.f1994b).hasNext()) {
            return ((C0270c) m7.next()).f2964a.equals(hVar);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bb, code lost:
    
        if (r9.equals("IS_NULL") == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(ArrayList arrayList, JSONObject jSONObject) {
        char c3 = 1;
        if (jSONObject.has("compositeFilter")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("compositeFilter");
            if (!jSONObject2.getString("op").equals("AND")) {
                throw new IllegalArgumentException("The Android SDK only supports composite filters of type 'AND'");
            }
            JSONArray optJSONArray = jSONObject2.optJSONArray("filters");
            if (optJSONArray != null) {
                for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                    m(arrayList, optJSONArray.getJSONObject(i7));
                }
                return;
            }
            return;
        }
        if (jSONObject.has("fieldFilter")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("fieldFilter");
            arrayList.add(C0177j.e(H4.j.y(jSONObject3.getJSONObject("field").getString("fieldPath")), EnumC0176i.valueOf(jSONObject3.getString("op")), z(jSONObject3.getJSONObject("value"))));
            return;
        }
        if (jSONObject.has("unaryFilter")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("unaryFilter");
            H4.j y4 = H4.j.y(jSONObject4.getJSONObject("field").getString("fieldPath"));
            String string = jSONObject4.getString("op");
            string.getClass();
            EnumC0176i enumC0176i = EnumC0176i.EQUAL;
            EnumC0176i enumC0176i2 = EnumC0176i.NOT_EQUAL;
            switch (string.hashCode()) {
                case -2125479834:
                    if (string.equals("IS_NAN")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1465346180:
                    break;
                case -244195494:
                    if (string.equals("IS_NOT_NAN")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1019893512:
                    if (string.equals("IS_NOT_NULL")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                    arrayList.add(C0177j.e(y4, enumC0176i, H4.o.f3334a));
                    return;
                case 1:
                    arrayList.add(C0177j.e(y4, enumC0176i, H4.o.f3335b));
                    return;
                case 2:
                    arrayList.add(C0177j.e(y4, enumC0176i2, H4.o.f3334a));
                    return;
                case 3:
                    arrayList.add(C0177j.e(y4, enumC0176i2, H4.o.f3335b));
                    return;
                default:
                    throw new IllegalArgumentException("Unexpected unary filter: ".concat(string));
            }
        }
    }

    @Override // G4.D
    public HashMap n(Iterable iterable) {
        HashMap hashMap = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            H4.h hVar = (H4.h) it.next();
            hashMap.put(hVar, y(hVar));
        }
        return hashMap;
    }

    @Override // G4.D
    public void o(ArrayList arrayList) {
        p3.f.O("setIndexManager() not called", ((InterfaceC0273f) this.f17563c) != null, new Object[0]);
        AbstractC1341c abstractC1341c = H4.g.f3315a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            H4.h hVar = (H4.h) it.next();
            this.f17562b = ((AbstractC1341c) this.f17562b).F(hVar);
            abstractC1341c = abstractC1341c.D(hVar, H4.k.h(hVar, H4.n.f3332b));
        }
        ((InterfaceC0273f) this.f17563c).e(abstractC1341c);
    }

    @Override // B3.k
    public void onConsentFormLoadSuccess(B3.c cVar) {
        ((N5.c) ((F0) this.f17563c).f17373b).f4784d.put(Integer.valueOf(cVar.hashCode()), cVar);
        ((A5.p) this.f17562b).success(cVar);
    }

    @Override // A5.d
    public void p(ByteBuffer byteBuffer, s5.f fVar) {
        A5.s sVar = (A5.s) this.f17563c;
        try {
            ((A5.q) this.f17562b).onMethodCall(sVar.f683c.b(byteBuffer), new A5.p(0, this, fVar));
        } catch (RuntimeException e7) {
            Log.e("MethodChannel#" + sVar.f682b, "Failed to handle method call", e7);
            fVar.a(sVar.f683c.d(e7.getMessage(), Log.getStackTraceString(e7)));
        }
    }

    public void q(Y4.H0 h02, JSONObject jSONObject) {
        Y4.I B7 = Y4.K.B();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                B7.f(z(jSONObject.getJSONObject(next)), next);
            }
        }
        h02.i(B7);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6  */
    @Override // G6.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object r(G6.h hVar, InterfaceC1287d interfaceC1287d) {
        G6.n nVar;
        int i7;
        Throwable th;
        H6.n nVar2;
        V0 v02;
        G6.h hVar2;
        G6.p pVar;
        int i8;
        G6.r rVar;
        switch (this.f17561a) {
            case 13:
                if (interfaceC1287d instanceof G6.n) {
                    nVar = (G6.n) interfaceC1287d;
                    int i9 = nVar.f3102b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        nVar.f3102b = i9 - Integer.MIN_VALUE;
                        Object obj = nVar.f3101a;
                        j6.a aVar = j6.a.f14642a;
                        i7 = nVar.f3102b;
                        if (i7 != 0) {
                            AbstractC0603a.p0(obj);
                            H6.n nVar3 = new H6.n(hVar, nVar.getContext());
                            try {
                                C0767o c0767o = (C0767o) this.f17562b;
                                nVar.f3104d = this;
                                nVar.f3105e = hVar;
                                nVar.f3106f = nVar3;
                                nVar.f3102b = 1;
                                if (c0767o.invoke(nVar3, nVar) == aVar) {
                                    return aVar;
                                }
                                v02 = this;
                                hVar2 = hVar;
                                nVar2 = nVar3;
                            } catch (Throwable th2) {
                                th = th2;
                                nVar2 = nVar3;
                                nVar2.releaseIntercepted();
                                throw th;
                            }
                        } else {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC0603a.p0(obj);
                                return C1116i.f13008a;
                            }
                            nVar2 = nVar.f3106f;
                            hVar2 = nVar.f3105e;
                            v02 = nVar.f3104d;
                            try {
                                AbstractC0603a.p0(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                nVar2.releaseIntercepted();
                                throw th;
                            }
                        }
                        nVar2.releaseIntercepted();
                        G6.w wVar = (G6.w) v02.f17563c;
                        nVar.f3104d = null;
                        nVar.f3105e = null;
                        nVar.f3106f = null;
                        nVar.f3102b = 2;
                        wVar.r(hVar2, nVar);
                        return aVar;
                    }
                }
                nVar = new G6.n(this, interfaceC1287d);
                Object obj2 = nVar.f3101a;
                j6.a aVar2 = j6.a.f14642a;
                i7 = nVar.f3102b;
                if (i7 != 0) {
                }
                nVar2.releaseIntercepted();
                G6.w wVar2 = (G6.w) v02.f17563c;
                nVar.f3104d = null;
                nVar.f3105e = null;
                nVar.f3106f = null;
                nVar.f3102b = 2;
                wVar2.r(hVar2, nVar);
                return aVar2;
            case 14:
                if (interfaceC1287d instanceof G6.p) {
                    pVar = (G6.p) interfaceC1287d;
                    int i10 = pVar.f3113b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        pVar.f3113b = i10 - Integer.MIN_VALUE;
                        Object obj3 = pVar.f3112a;
                        j6.a aVar3 = j6.a.f14642a;
                        i8 = pVar.f3113b;
                        if (i8 != 0) {
                            AbstractC0603a.p0(obj3);
                            V0 v03 = (V0) this.f17562b;
                            G6.r rVar2 = new G6.r((C0768p) this.f17563c, hVar);
                            try {
                                pVar.f3115d = rVar2;
                                pVar.f3113b = 1;
                                if (v03.r(rVar2, pVar) == aVar3) {
                                    return aVar3;
                                }
                            } catch (H6.a e7) {
                                e = e7;
                                rVar = rVar2;
                                if (e.f3423a != rVar) {
                                    throw e;
                                }
                                return C1116i.f13008a;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            rVar = pVar.f3115d;
                            try {
                                AbstractC0603a.p0(obj3);
                            } catch (H6.a e8) {
                                e = e8;
                                if (e.f3423a != rVar) {
                                }
                                return C1116i.f13008a;
                            }
                        }
                        return C1116i.f13008a;
                    }
                }
                pVar = new G6.p(this, interfaceC1287d);
                Object obj32 = pVar.f3112a;
                j6.a aVar32 = j6.a.f14642a;
                i8 = pVar.f3113b;
                if (i8 != 0) {
                }
                return C1116i.f13008a;
            default:
                Object r7 = ((G6.g) this.f17562b).r(new G6.r(hVar, (I0.c) this.f17563c), interfaceC1287d);
                return r7 == j6.a.f14642a ? r7 : C1116i.f13008a;
        }
    }

    public H4.m s(String str) {
        H4.m y4 = H4.m.y(str);
        P2 p22 = (P2) this.f17563c;
        if (P2.E(y4)) {
            String l7 = y4.l(1);
            H4.f fVar = (H4.f) p22.f17508b;
            if (l7.equals(fVar.f3313a) && y4.l(3).equals(fVar.f3314b)) {
                return (H4.m) y4.p();
            }
        }
        throw new IllegalArgumentException("Resource name is not valid for current instance: ".concat(str));
    }

    public String toString() {
        switch (this.f17561a) {
            case 29:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f17562b.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f17563c;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    sb.append((String) arrayList.get(i7));
                    if (i7 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // G4.D
    public HashMap u(E4.C c3, H4.b bVar, Set set, d1.n nVar) {
        HashMap hashMap = new HashMap();
        H4.m mVar = c3.f2095f;
        Iterator E7 = ((AbstractC1341c) this.f17562b).E(new H4.h((H4.m) mVar.b("")));
        while (E7.hasNext()) {
            Map.Entry entry = (Map.Entry) E7.next();
            H4.k kVar = (H4.k) entry.getValue();
            H4.h hVar = (H4.h) entry.getKey();
            if (!mVar.m(hVar.f3318a)) {
                break;
            }
            if (hVar.f3318a.f3312a.size() <= mVar.f3312a.size() + 1 && H4.b.b(kVar).compareTo(bVar) > 0) {
                H4.h hVar2 = kVar.f3323a;
                if (set.contains(hVar2) || c3.g(kVar)) {
                    hashMap.put(hVar2, kVar.f());
                }
            }
        }
        return hashMap;
    }

    @Override // G4.D
    public Map v(String str, H4.b bVar, int i7) {
        throw new UnsupportedOperationException("getAll(String, IndexOffset, int) is not supported.");
    }

    public ArrayList w(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("values");
        if (optJSONArray != null) {
            for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                arrayList.add(z(optJSONArray.getJSONObject(i7)));
            }
        }
        return arrayList;
    }

    public Timestamp x(Object obj) {
        int i7;
        if (!(obj instanceof String)) {
            if (!(obj instanceof JSONObject)) {
                throw new IllegalArgumentException("Timestamps must be either ISO 8601-formatted strings or JSON objects");
            }
            JSONObject jSONObject = (JSONObject) obj;
            return new Timestamp(jSONObject.optLong("seconds"), jSONObject.optInt("nanos"));
        }
        String str = (String) obj;
        try {
            int indexOf = str.indexOf(84);
            if (indexOf == -1) {
                throw new IllegalArgumentException("Invalid timestamp: ".concat(str));
            }
            int indexOf2 = str.indexOf(90, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = str.indexOf(43, indexOf);
            }
            if (indexOf2 == -1) {
                indexOf2 = str.indexOf(45, indexOf);
            }
            if (indexOf2 == -1) {
                throw new IllegalArgumentException("Invalid timestamp: Missing valid timezone offset: ".concat(str));
            }
            String substring = str.substring(0, indexOf2);
            String str2 = "";
            int indexOf3 = substring.indexOf(46);
            if (indexOf3 != -1) {
                String substring2 = substring.substring(0, indexOf3);
                str2 = substring.substring(indexOf3 + 1);
                substring = substring2;
            }
            long time = ((SimpleDateFormat) this.f17562b).parse(substring).getTime() / 1000;
            if (str2.isEmpty()) {
                i7 = 0;
            } else {
                i7 = 0;
                for (int i8 = 0; i8 < 9; i8++) {
                    i7 *= 10;
                    if (i8 < str2.length()) {
                        if (str2.charAt(i8) < '0' || str2.charAt(i8) > '9') {
                            throw new IllegalArgumentException("Invalid nanoseconds: ".concat(str2));
                        }
                        i7 = (str2.charAt(i8) - '0') + i7;
                    }
                }
            }
            if (str.charAt(indexOf2) != 'Z') {
                String substring3 = str.substring(indexOf2 + 1);
                int indexOf4 = substring3.indexOf(58);
                if (indexOf4 == -1) {
                    throw new IllegalArgumentException("Invalid offset value: ".concat(substring3));
                }
                long parseLong = (Long.parseLong(substring3.substring(indexOf4 + 1)) + (Long.parseLong(substring3.substring(0, indexOf4)) * 60)) * 60;
                time = str.charAt(indexOf2) == '+' ? time - parseLong : time + parseLong;
            } else if (str.length() != indexOf2 + 1) {
                throw new IllegalArgumentException("Invalid timestamp: Invalid trailing data \"" + str.substring(indexOf2) + "\"");
            }
            return new Timestamp(time, i7);
        } catch (ParseException e7) {
            throw new IllegalArgumentException("Failed to parse timestamp", e7);
        }
    }

    @Override // G4.D
    public H4.k y(H4.h hVar) {
        H4.k kVar = (H4.k) ((AbstractC1341c) this.f17562b).m(hVar);
        return kVar != null ? kVar.f() : H4.k.g(hVar);
    }

    public Y4.I0 z(JSONObject jSONObject) {
        Y4.H0 S6 = Y4.I0.S();
        if (jSONObject.has("nullValue")) {
            S6.d();
            Y4.I0.C((Y4.I0) S6.f12096b);
        } else {
            if (jSONObject.has("booleanValue")) {
                boolean optBoolean = jSONObject.optBoolean("booleanValue", false);
                S6.d();
                Y4.I0.D((Y4.I0) S6.f12096b, optBoolean);
            } else if (jSONObject.has("integerValue")) {
                S6.h(jSONObject.optLong("integerValue"));
            } else if (jSONObject.has("doubleValue")) {
                S6.g(jSONObject.optDouble("doubleValue"));
            } else if (jSONObject.has("timestampValue")) {
                Timestamp x4 = x(jSONObject.get("timestampValue"));
                com.google.protobuf.y0 A7 = com.google.protobuf.z0.A();
                A7.f(x4.f11828a);
                A7.d();
                com.google.protobuf.z0.w((com.google.protobuf.z0) A7.f12096b, x4.f11829b);
                S6.l(A7);
            } else if (jSONObject.has("stringValue")) {
                S6.k(jSONObject.optString("stringValue", ""));
            } else if (jSONObject.has("bytesValue")) {
                byte[] decode = Base64.decode(jSONObject.getString("bytesValue"), 0);
                C0909j c0909j = AbstractC0911k.f12212b;
                C0909j A8 = AbstractC0911k.A(decode, 0, decode.length);
                S6.d();
                Y4.I0.x((Y4.I0) S6.f12096b, A8);
            } else if (jSONObject.has("referenceValue")) {
                String string = jSONObject.getString("referenceValue");
                S6.d();
                Y4.I0.y((Y4.I0) S6.f12096b, string);
            } else if (jSONObject.has("geoPointValue")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("geoPointValue");
                C0788a A9 = b5.b.A();
                double optDouble = jSONObject2.optDouble("latitude");
                A9.d();
                b5.b.v((b5.b) A9.f12096b, optDouble);
                double optDouble2 = jSONObject2.optDouble("longitude");
                A9.d();
                b5.b.w((b5.b) A9.f12096b, optDouble2);
                S6.d();
                Y4.I0.z((Y4.I0) S6.f12096b, (b5.b) A9.b());
            } else if (jSONObject.has("arrayValue")) {
                JSONArray optJSONArray = jSONObject.getJSONObject("arrayValue").optJSONArray("values");
                C0567d B7 = C0569e.B();
                if (optJSONArray != null) {
                    for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                        Y4.I0 z4 = z(optJSONArray.getJSONObject(i7));
                        B7.d();
                        C0569e.v((C0569e) B7.f12096b, z4);
                    }
                }
                S6.f(B7);
            } else {
                if (!jSONObject.has("mapValue")) {
                    throw new IllegalArgumentException("Unexpected value type: " + jSONObject);
                }
                q(S6, jSONObject.getJSONObject("mapValue").optJSONObject("fields"));
            }
        }
        return (Y4.I0) S6.b();
    }

    @Override // J2.c
    public J2.m zza(String str) {
        I2.K k7 = I2.P.f3579l;
        I2.P p5 = E2.o.f1952C.f1957c;
        new I2.A((Context) this.f17562b, (String) this.f17563c, str, null).zzb();
        return J2.m.f3827a;
    }

    public /* synthetic */ V0(int i7, Object obj, Object obj2, boolean z4) {
        this.f17561a = i7;
        this.f17562b = obj;
        this.f17563c = obj2;
    }

    public /* synthetic */ V0(int i7, boolean z4) {
        this.f17561a = i7;
    }

    public /* synthetic */ V0(Object obj) {
        this.f17561a = 29;
        this.f17562b = obj;
        this.f17563c = new ArrayList();
    }

    public V0(C5.b bVar, C1761y0 c1761y0) {
        this.f17561a = 5;
        this.f17562b = bVar;
        this.f17563c = c1761y0;
        c1761y0.f17932b = new R4.c(this, 3);
    }

    public V0(androidx.fragment.app.Q q7) {
        this.f17561a = 27;
        t6.h.e(q7, "fragmentManager");
        this.f17562b = q7;
        this.f17563c = new CopyOnWriteArrayList();
    }

    public V0(int i7) {
        this.f17561a = i7;
        switch (i7) {
            case 11:
                this.f17562b = new C1343e(Collections.emptyList(), C0270c.f2962c);
                this.f17563c = new C1343e(Collections.emptyList(), C0270c.f2963d);
                break;
            case 20:
                this.f17562b = new HashMap();
                this.f17563c = new HashMap();
                break;
            case zzbbd.zzt.zzm /* 21 */:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f17562b = byteArrayOutputStream;
                this.f17563c = new DataOutputStream(byteArrayOutputStream);
                break;
            case 23:
                this.f17562b = new ReentrantLock();
                this.f17563c = new LinkedHashMap();
                break;
            default:
                this.f17563c = new ArrayList();
                break;
        }
    }

    public V0(Q3.n nVar) {
        this.f17561a = 20;
        this.f17562b = new HashMap(nVar.f5820a);
        this.f17563c = new HashMap(nVar.f5821b);
    }

    public V0(U5.l0 l0Var, Object obj) {
        this.f17561a = 22;
        p3.f.k(l0Var, "status");
        this.f17562b = l0Var;
        this.f17563c = obj;
    }

    public V0(C0784d c0784d, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f17561a = 28;
        com.google.android.gms.common.internal.D.i(c0784d);
        this.f17562b = executor;
        this.f17563c = scheduledExecutorService;
    }

    public V0(P2 p22) {
        this.f17561a = 7;
        this.f17563c = p22;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        this.f17562b = simpleDateFormat;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
    }

    public V0(v2.s sVar) {
        this.f17561a = 18;
        this.f17562b = sVar;
        this.f17563c = new C0095a(4, false);
    }

    public V0(C0.L l7) {
        this.f17561a = 4;
        this.f17562b = l7;
        C0.K k7 = new C0.K();
        k7.f1239a = 0;
        this.f17563c = k7;
    }

    public V0(MediaCodec.CryptoInfo cryptoInfo) {
        this.f17561a = 6;
        this.f17562b = cryptoInfo;
        this.f17563c = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public V0(B1.f fVar) {
        this.f17561a = 8;
        this.f17562b = fVar;
        this.f17563c = new AtomicBoolean(false);
    }

    public V0(P1.C c3) {
        this.f17561a = 19;
        this.f17563c = c3;
        this.f17562b = new F1.x(new byte[4], 4);
    }

    @Override // P1.z
    public void c(v2.s sVar, F1.m mVar, C0.J j) {
    }
}
