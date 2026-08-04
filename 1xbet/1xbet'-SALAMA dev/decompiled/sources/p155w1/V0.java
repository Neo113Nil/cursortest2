package p155w1;

import A5.c;
import A5.d;
import A5.n;
import A5.p;
import A5.q;
import B1.f;
import B3.k;
import C0.I;
import C0.J;
import C0.K;
import C0.L;
import C1.C0095a;
import C5.a;
import E3.F;
import E4.C0177j;
import E4.EnumC0176i;
import F1.e;
import F1.x;
import G4.C0270c;
import G4.D;
import G4.InterfaceC0273f;
import G4.V;
import G6.g;
import G6.r;
import H4.j;
import H4.o;
import I1.b;
import I2.P;
import P1.C;
import P1.w;
import P1.z;
import Q3.l;
import Q3.m;
import U5.l0;
import W5.AbstractC0486a1;
import Y4.C0567d;
import Y4.C0569e;
import Y4.H0;
import Y4.I0;
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
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.A;
import androidx.fragment.app.AbstractComponentCallbacksC0701v;
import androidx.fragment.app.Q;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.firebase.Timestamp;
import com.google.protobuf.AbstractC0867k;
import com.google.protobuf.C0865j;
import com.google.protobuf.y0;
import com.google.protobuf.z0;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010b0.C0744o;
import p010b0.C0745p;
import p044f6.i;
import p151v2.s;
import p151v2.t;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class V0 implements c, d, D, g, J2.c, k, e, z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static V0 f17565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static a f17566e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f17569c;

    public /* synthetic */ V0(int i7, Object obj, Object obj2) {
        this.f17567a = i7;
        this.f17569c = obj;
        this.f17568b = obj2;
    }

    public static synchronized V0 d() {
        try {
            if (f17565d == null) {
                f17565d = new V0(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f17565d;
    }

    public void A(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v, boolean z4) {
        h.e(abstractComponentCallbacksC0701v, "f");
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = ((Q) this.f17568b).f9405x;
        if (abstractComponentCallbacksC0701v2 != null) {
            abstractComponentCallbacksC0701v2.i().f9395n.A(abstractComponentCallbacksC0701v, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17569c).iterator();
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

    public void B(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v, boolean z4) {
        h.e(abstractComponentCallbacksC0701v, "f");
        Q q7 = (Q) this.f17568b;
        A a2 = q7.f9403v.f9552b;
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = q7.f9405x;
        if (abstractComponentCallbacksC0701v2 != null) {
            abstractComponentCallbacksC0701v2.i().f9395n.B(abstractComponentCallbacksC0701v, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17569c).iterator();
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

    public void C(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v, boolean z4) {
        h.e(abstractComponentCallbacksC0701v, "f");
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = ((Q) this.f17568b).f9405x;
        if (abstractComponentCallbacksC0701v2 != null) {
            abstractComponentCallbacksC0701v2.i().f9395n.C(abstractComponentCallbacksC0701v, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17569c).iterator();
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

    public void D(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v, boolean z4) {
        h.e(abstractComponentCallbacksC0701v, "f");
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = ((Q) this.f17568b).f9405x;
        if (abstractComponentCallbacksC0701v2 != null) {
            abstractComponentCallbacksC0701v2.i().f9395n.D(abstractComponentCallbacksC0701v, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17569c).iterator();
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

    public void E(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v, boolean z4) {
        h.e(abstractComponentCallbacksC0701v, "f");
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = ((Q) this.f17568b).f9405x;
        if (abstractComponentCallbacksC0701v2 != null) {
            abstractComponentCallbacksC0701v2.i().f9395n.E(abstractComponentCallbacksC0701v, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17569c).iterator();
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

    public void F(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v, boolean z4) {
        h.e(abstractComponentCallbacksC0701v, "f");
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = ((Q) this.f17568b).f9405x;
        if (abstractComponentCallbacksC0701v2 != null) {
            abstractComponentCallbacksC0701v2.i().f9395n.F(abstractComponentCallbacksC0701v, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17569c).iterator();
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

    public void G(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v, boolean z4) {
        h.e(abstractComponentCallbacksC0701v, "f");
        Q q7 = (Q) this.f17568b;
        A a2 = q7.f9403v.f9552b;
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = q7.f9405x;
        if (abstractComponentCallbacksC0701v2 != null) {
            abstractComponentCallbacksC0701v2.i().f9395n.G(abstractComponentCallbacksC0701v, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17569c).iterator();
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

    public void H(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v, boolean z4) {
        h.e(abstractComponentCallbacksC0701v, "f");
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = ((Q) this.f17568b).f9405x;
        if (abstractComponentCallbacksC0701v2 != null) {
            abstractComponentCallbacksC0701v2.i().f9395n.H(abstractComponentCallbacksC0701v, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17569c).iterator();
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

    public void I(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v, boolean z4) {
        h.e(abstractComponentCallbacksC0701v, "f");
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = ((Q) this.f17568b).f9405x;
        if (abstractComponentCallbacksC0701v2 != null) {
            abstractComponentCallbacksC0701v2.i().f9395n.I(abstractComponentCallbacksC0701v, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17569c).iterator();
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

    public void J(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v, Bundle bundle, boolean z4) {
        h.e(abstractComponentCallbacksC0701v, "f");
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = ((Q) this.f17568b).f9405x;
        if (abstractComponentCallbacksC0701v2 != null) {
            abstractComponentCallbacksC0701v2.i().f9395n.J(abstractComponentCallbacksC0701v, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17569c).iterator();
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

    public void K(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v, boolean z4) {
        h.e(abstractComponentCallbacksC0701v, "f");
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = ((Q) this.f17568b).f9405x;
        if (abstractComponentCallbacksC0701v2 != null) {
            abstractComponentCallbacksC0701v2.i().f9395n.K(abstractComponentCallbacksC0701v, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17569c).iterator();
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

    public void L(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v, boolean z4) {
        h.e(abstractComponentCallbacksC0701v, "f");
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = ((Q) this.f17568b).f9405x;
        if (abstractComponentCallbacksC0701v2 != null) {
            abstractComponentCallbacksC0701v2.i().f9395n.L(abstractComponentCallbacksC0701v, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17569c).iterator();
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

    public void M(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v, boolean z4) {
        h.e(abstractComponentCallbacksC0701v, "f");
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = ((Q) this.f17568b).f9405x;
        if (abstractComponentCallbacksC0701v2 != null) {
            abstractComponentCallbacksC0701v2.i().f9395n.M(abstractComponentCallbacksC0701v, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17569c).iterator();
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
        V v6 = new V(this, 0);
        Cursor cursorRawQuery = ((SQLiteDatabase) this.f17568b).rawQuery("SELECT target_id, target_proto FROM targets", null);
        while (cursorRawQuery.moveToNext()) {
            try {
                v6.accept(cursorRawQuery);
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        cursorRawQuery.close();
    }

    public byte[] O(EventMessage eventMessage) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f17568b;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = (DataOutputStream) this.f17569c;
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
        L l7 = (L) this.f17568b;
        int iR = l7.r();
        int iK = l7.K();
        int i11 = i8 > i7 ? 1 : -1;
        View view = null;
        while (i7 != i8) {
            View viewS = l7.S(i7);
            int iJ = l7.j(viewS);
            int iV = l7.V(viewS);
            K k7 = (K) this.f17569c;
            k7.f1240b = iR;
            k7.f1241c = iK;
            k7.f1242d = iJ;
            k7.f1243e = iV;
            if (i9 != 0) {
                k7.f1239a = i9;
                if (k7.a()) {
                    return viewS;
                }
            }
            if (i10 != 0) {
                k7.f1239a = i10;
                if (k7.a()) {
                    view = viewS;
                }
            }
            i7 += i11;
        }
        return view;
    }

    public F1.k Q(Object... objArr) {
        Constructor constructorB;
        synchronized (((AtomicBoolean) this.f17569c)) {
            try {
                if (!((AtomicBoolean) this.f17569c).get()) {
                    try {
                        constructorB = ((f) this.f17568b).b();
                    } catch (ClassNotFoundException unused) {
                        ((AtomicBoolean) this.f17569c).set(true);
                        constructorB = null;
                    } catch (Exception e7) {
                        throw new RuntimeException("Error instantiating extension", e7);
                    }
                }
                constructorB = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (constructorB == null) {
            return null;
        }
        try {
            return (F1.k) constructorB.newInstance(objArr);
        } catch (Exception e8) {
            throw new IllegalStateException("Unexpected error creating extractor", e8);
        }
    }

    public void R(String str, String str2) {
        I i7 = (I) this.f17569c;
        i7.getClass();
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            char cCharAt = str.charAt(i9);
            if (cCharAt <= 31 || cCharAt >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i9), str));
            }
        }
        if (str2 == null) {
            throw new IllegalArgumentException("value == null");
        }
        int length2 = str2.length();
        for (int i10 = 0; i10 < length2; i10++) {
            char cCharAt2 = str2.charAt(i10);
            if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i10), str2));
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
        String string;
        String strI = p031e1.k.i(new StringBuilder("["), TextUtils.join(", ", strArr), "]");
        boolean z4 = false;
        for (int i7 = 0; i7 < strArr.length; i7++) {
            String str = strArr[i7];
            boolean zA0 = a0(str);
            if (i7 == 0) {
                z4 = zA0;
            } else if (zA0 != z4) {
                String strH = AbstractC0486a1.h("Expected all of ", strI, " to either exist or not, but ");
                if (z4) {
                    StringBuilder sbC = p136t.e.c(strH);
                    sbC.append(strArr[0]);
                    sbC.append(" exists and ");
                    sbC.append(str);
                    sbC.append(" does not");
                    string = sbC.toString();
                } else {
                    StringBuilder sbC2 = p136t.e.c(strH);
                    sbC2.append(strArr[0]);
                    sbC2.append(" does not exist and ");
                    sbC2.append(str);
                    sbC2.append(" does");
                    string = sbC2.toString();
                }
                throw new IllegalStateException(string);
            }
        }
        if (z4) {
            Q0.a.v(1, "SQLiteSchema", AbstractC0486a1.h("Skipping migration because all of ", strI, " already exist"), new Object[0]);
        } else {
            runnable.run();
        }
    }

    public p075k4.e T(int i7) {
        F fM = ((p075k4.e) this.f17569c).m(new C0270c(H4.h.b(), i7));
        p075k4.e eVarL = H4.h.f3317c;
        while (((Iterator) fM.f1994b).hasNext()) {
            C0270c c0270c = (C0270c) fM.next();
            if (c0270c.f2965b != i7) {
                break;
            }
            eVarL = eVarL.l(c0270c.f2964a);
        }
        return eVarL;
    }

    public void U(l lVar) throws GeneralSecurityException {
        m mVar = new m(lVar.f5816a, R3.g.class);
        HashMap map = (HashMap) this.f17568b;
        if (!map.containsKey(mVar)) {
            map.put(mVar, lVar);
            return;
        }
        l lVar2 = (l) map.get(mVar);
        if (lVar2.equals(lVar) && lVar.equals(lVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + mVar);
    }

    public void V(J3.m mVar) throws GeneralSecurityException {
        if (mVar == null) {
            throw new NullPointerException("wrapper must be non-null");
        }
        Class clsB = mVar.b();
        HashMap map = (HashMap) this.f17569c;
        if (!map.containsKey(clsB)) {
            map.put(clsB, mVar);
            return;
        }
        J3.m mVar2 = (J3.m) map.get(clsB);
        if (mVar2.equals(mVar) && mVar.equals(mVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + clsB);
    }

    public p075k4.e W(int i7) {
        F fM = ((p075k4.e) this.f17569c).m(new C0270c(H4.h.b(), i7));
        p075k4.e eVarL = H4.h.f3317c;
        while (((Iterator) fM.f1994b).hasNext()) {
            C0270c c0270c = (C0270c) fM.next();
            if (c0270c.f2965b != i7) {
                break;
            }
            eVarL = eVarL.l(c0270c.f2964a);
            this.f17568b = ((p075k4.e) this.f17568b).t(c0270c);
            this.f17569c = ((p075k4.e) this.f17569c).t(c0270c);
        }
        return eVarL;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r9v0 ??, r9v3 ??, r9v5 ??, r9v4 ??, r9v7 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.trySplitConstInsns(FixTypesVisitor.java:580)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        */
    public void X(int r25) {
        /*
            Method dump skipped, instruction units count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p155w1.V0.X(int):void");
    }

    public void Y(int i7, Bundle bundle, Messenger messenger) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i7;
        messageObtain.arg1 = 1;
        messageObtain.setData(bundle);
        messageObtain.replyTo = messenger;
        ((Messenger) this.f17568b).send(messageObtain);
    }

    public boolean Z(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = ((SQLiteDatabase) this.f17568b).rawQuery("PRAGMA table_info(" + str + ")", null);
            int columnIndex = cursorRawQuery.getColumnIndex("name");
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(cursorRawQuery.getString(columnIndex));
            }
            cursorRawQuery.close();
            return arrayList.indexOf(str2) != -1;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    @Override // P1.z
    public void a(C0095a c0095a) {
        C c3;
        if (c0095a.t() == 0 && (c0095a.t() & 128) != 0) {
            c0095a.E(6);
            int iD = c0095a.d() / 4;
            int i7 = 0;
            while (true) {
                c3 = (C) this.f17569c;
                if (i7 >= iD) {
                    break;
                }
                x xVar = (x) this.f17568b;
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
        Cursor cursorRawQueryWithFactory = ((SQLiteDatabase) this.f17568b).rawQueryWithFactory(new G4.Q(new Object[]{str}, 0), "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?", null, null);
        try {
            boolean z4 = !cursorRawQueryWithFactory.moveToFirst();
            cursorRawQueryWithFactory.close();
            return !z4;
        } catch (Throwable th) {
            if (cursorRawQueryWithFactory != null) {
                try {
                    cursorRawQueryWithFactory.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f0  */
    @Override // F1.e
    public F1.d b(F1.h hVar, long j) {
        int iA;
        F1.d dVar;
        long j3 = hVar.f2534d;
        int iMin = (int) Math.min(20000L, hVar.f2533c - j3);
        C0095a c0095a = (C0095a) this.f17569c;
        c0095a.A(iMin);
        hVar.c((byte[]) c0095a.f1465c, 0, iMin, false);
        int i7 = -1;
        int i8 = -1;
        long j7 = -9223372036854775807L;
        while (c0095a.d() >= 4) {
            if (b.a(c0095a.f1463a, (byte[]) c0095a.f1465c) != 442) {
                c0095a.E(1);
            } else {
                c0095a.E(4);
                long jC = w.c(c0095a);
                if (jC != -9223372036854775807L) {
                    long jB = ((s) this.f17568b).b(jC);
                    if (jB > j) {
                        if (j7 == -9223372036854775807L) {
                            return new F1.d(-1, jB, j3);
                        }
                        dVar = new F1.d(0, -9223372036854775807L, j3 + ((long) i8));
                    } else if (100000 + jB > j) {
                        dVar = new F1.d(0, -9223372036854775807L, j3 + ((long) c0095a.f1463a));
                    } else {
                        i8 = c0095a.f1463a;
                        j7 = jB;
                    }
                    return dVar;
                }
                int i9 = c0095a.f1464b;
                if (c0095a.d() >= 10) {
                    c0095a.E(9);
                    int iT = c0095a.t() & 7;
                    if (c0095a.d() >= iT) {
                        c0095a.E(iT);
                        if (c0095a.d() >= 4) {
                            if (b.a(c0095a.f1463a, (byte[]) c0095a.f1465c) != 443) {
                                while (c0095a.d() >= 4) {
                                    iA = b.a(c0095a.f1463a, (byte[]) c0095a.f1465c);
                                    if (iA == 442) {
                                        break;
                                    }
                                    break;
                                }
                            }
                            c0095a.E(4);
                            int iY = c0095a.y();
                            if (c0095a.d() < iY) {
                                c0095a.D(i9);
                            } else {
                                c0095a.E(iY);
                                while (c0095a.d() >= 4) {
                                    iA = b.a(c0095a.f1463a, (byte[]) c0095a.f1465c);
                                    if (iA == 442 || iA == 441 || (iA >>> 8) != 1) {
                                        break;
                                    }
                                    c0095a.E(4);
                                    if (c0095a.d() < 2) {
                                        c0095a.D(i9);
                                        break;
                                    }
                                    c0095a.D(Math.min(c0095a.f1464b, c0095a.f1463a + c0095a.y()));
                                }
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
        return j7 != -9223372036854775807L ? new F1.d(-2, j7, j3 + ((long) i7)) : F1.d.f2514d;
    }

    @Override // G4.D
    public void e(InterfaceC0273f interfaceC0273f) {
        this.f17569c = interfaceC0273f;
    }

    @Override // A5.c
    public void f(Object obj) {
        ((p135s5.f) this.f17568b).a(((n) ((F0) ((P2) this.f17569c).f17515c).f17381d).a(obj));
    }

    @Override // F1.e
    public void g() {
        byte[] bArr = t.f17164f;
        C0095a c0095a = (C0095a) this.f17569c;
        c0095a.getClass();
        c0095a.B(bArr.length, bArr);
    }

    public void h(Context context, MatrixCursor matrixCursor) {
        if (((U0) this.f17568b) == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                if (context instanceof Application) {
                    T0 t0A = T0.a();
                    if (t0A.f17547e == null) {
                        if (matrixCursor != null) {
                            matrixCursor.moveToFirst();
                            t0A.f17543a = matrixCursor.getLong(0);
                            t0A.f17544b = matrixCursor.getLong(1);
                            t0A.f17545c = matrixCursor.getLong(2);
                            matrixCursor.close();
                        } else {
                            Runtime runtime = Runtime.getRuntime();
                            ActivityManager.MemoryInfo memoryInfoA = AbstractC0997i0.a(applicationContext);
                            t0A.f17543a = T0.f17542k;
                            t0A.f17544b = runtime.totalMemory() - runtime.freeMemory();
                            t0A.f17545c = memoryInfoA.totalMem - memoryInfoA.availMem;
                        }
                        t0A.f17547e = new S0(t0A, 0);
                        V0 v0D = d();
                        S0 s7 = t0A.f17547e;
                        synchronized (((ArrayList) v0D.f17569c)) {
                            ((ArrayList) v0D.f17569c).add(s7);
                        }
                    }
                }
                X0 x0A = X0.a();
                if (x0A.f17582a == null) {
                    long jNanoTime = System.nanoTime();
                    x0A.f17587f = jNanoTime;
                    x0A.f17586e = jNanoTime;
                    x0A.f17582a = new S0(x0A, 1);
                    V0 v0D2 = d();
                    S0 s8 = x0A.f17582a;
                    synchronized (((ArrayList) v0D2.f17569c)) {
                        ((ArrayList) v0D2.f17569c).add(s8);
                    }
                }
                U0 u4 = new U0(this);
                this.f17568b = u4;
                ((Application) applicationContext).registerActivityLifecycleCallbacks(u4);
            }
        }
    }

    @Override // G4.D
    public void i(H4.k kVar, H4.n nVar) {
        p113p3.f.O("setIndexManager() not called", ((InterfaceC0273f) this.f17569c) != null, new Object[0]);
        p113p3.f.O("Cannot add document to the RemoteDocumentCache with a read time of zero", !nVar.equals(H4.n.f3332b), new Object[0]);
        p075k4.c cVar = (p075k4.c) this.f17568b;
        H4.k kVarF = kVar.f();
        kVarF.f3326d = nVar;
        H4.h hVar = kVar.f3323a;
        this.f17568b = cVar.D(hVar, kVarF);
        ((InterfaceC0273f) this.f17569c).s(hVar.d());
    }

    public void j(Object obj, String str) {
        ((ArrayList) this.f17569c).add(p031e1.k.f(str, "=", String.valueOf(obj)));
    }

    public void k() {
        this.f17568b = null;
        this.f17569c = null;
    }

    public boolean l(H4.h hVar) {
        F fM = ((p075k4.e) this.f17568b).m(new C0270c(hVar, 0));
        if (((Iterator) fM.f1994b).hasNext()) {
            return ((C0270c) fM.next()).f2964a.equals(hVar);
        }
        return false;
    }

    public void m(ArrayList arrayList, JSONObject jSONObject) throws JSONException {
        byte b7 = 1;
        if (jSONObject.has("compositeFilter")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("compositeFilter");
            if (!jSONObject2.getString("op").equals("AND")) {
                throw new IllegalArgumentException("The Android SDK only supports composite filters of type 'AND'");
            }
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("filters");
            if (jSONArrayOptJSONArray != null) {
                for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                    m(arrayList, jSONArrayOptJSONArray.getJSONObject(i7));
                }
                return;
            }
            return;
        }
        if (jSONObject.has("fieldFilter")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("fieldFilter");
            arrayList.add(C0177j.e(j.y(jSONObject3.getJSONObject("field").getString("fieldPath")), EnumC0176i.valueOf(jSONObject3.getString("op")), z(jSONObject3.getJSONObject("value"))));
            return;
        }
        if (jSONObject.has("unaryFilter")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("unaryFilter");
            j jVarY = j.y(jSONObject4.getJSONObject("field").getString("fieldPath"));
            String string = jSONObject4.getString("op");
            string.getClass();
            EnumC0176i enumC0176i = EnumC0176i.EQUAL;
            EnumC0176i enumC0176i2 = EnumC0176i.NOT_EQUAL;
            switch (string.hashCode()) {
                case -2125479834:
                    b7 = string.equals("IS_NAN") ? (byte) 0 : (byte) -1;
                    break;
                case -1465346180:
                    if (!string.equals("IS_NULL")) {
                        b7 = -1;
                    }
                    break;
                case -244195494:
                    b7 = string.equals("IS_NOT_NAN") ? (byte) 2 : (byte) -1;
                    break;
                case 1019893512:
                    b7 = string.equals("IS_NOT_NULL") ? (byte) 3 : (byte) -1;
                    break;
                default:
                    b7 = -1;
                    break;
            }
            switch (b7) {
                case 0:
                    arrayList.add(C0177j.e(jVarY, enumC0176i, o.f3334a));
                    return;
                case 1:
                    arrayList.add(C0177j.e(jVarY, enumC0176i, o.f3335b));
                    return;
                case 2:
                    arrayList.add(C0177j.e(jVarY, enumC0176i2, o.f3334a));
                    return;
                case 3:
                    arrayList.add(C0177j.e(jVarY, enumC0176i2, o.f3335b));
                    return;
                default:
                    throw new IllegalArgumentException("Unexpected unary filter: ".concat(string));
            }
        }
    }

    @Override // G4.D
    public HashMap n(Iterable iterable) {
        HashMap map = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            H4.h hVar = (H4.h) it.next();
            map.put(hVar, y(hVar));
        }
        return map;
    }

    @Override // G4.D
    public void o(ArrayList arrayList) {
        p113p3.f.O("setIndexManager() not called", ((InterfaceC0273f) this.f17569c) != null, new Object[0]);
        p075k4.c cVarD = H4.g.f3315a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            H4.h hVar = (H4.h) it.next();
            this.f17568b = ((p075k4.c) this.f17568b).F(hVar);
            cVarD = cVarD.D(hVar, H4.k.h(hVar, H4.n.f3332b));
        }
        ((InterfaceC0273f) this.f17569c).e(cVarD);
    }

    @Override // B3.k
    public void onConsentFormLoadSuccess(B3.c cVar) {
        ((N5.c) ((F0) this.f17569c).f17379b).f4784d.put(Integer.valueOf(cVar.hashCode()), cVar);
        ((p) this.f17568b).success(cVar);
    }

    @Override // A5.d
    public void p(ByteBuffer byteBuffer, p135s5.f fVar) {
        A5.s sVar = (A5.s) this.f17569c;
        try {
            ((q) this.f17568b).onMethodCall(sVar.f683c.b(byteBuffer), new p(0, this, fVar));
        } catch (RuntimeException e7) {
            Log.e("MethodChannel#" + sVar.f682b, "Failed to handle method call", e7);
            fVar.a(sVar.f683c.d(e7.getMessage(), Log.getStackTraceString(e7)));
        }
    }

    public void q(H0 h6, JSONObject jSONObject) {
        Y4.I iB = Y4.K.B();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                iB.f(z(jSONObject.getJSONObject(next)), next);
            }
        }
        h6.i(iB);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:35:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    @Override // G6.g
    public Object r(G6.h hVar, p065i6.d dVar) throws Throwable {
        G6.n nVar;
        Throwable th;
        H6.n nVar2;
        V0 v6;
        G6.h hVar2;
        G6.p pVar;
        r rVar;
        switch (this.f17567a) {
            case 13:
                if (dVar instanceof G6.n) {
                    nVar = (G6.n) dVar;
                    int i7 = nVar.f3102b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        nVar.f3102b = i7 - Integer.MIN_VALUE;
                    } else {
                        nVar = new G6.n(this, dVar);
                    }
                } else {
                    nVar = new G6.n(this, dVar);
                }
                Object obj = nVar.f3101a;
                j6.a aVar = j6.a.f14648a;
                int i8 = nVar.f3102b;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p003a.a.p0(obj);
                        return i.f13014a;
                    }
                    nVar2 = nVar.f3106f;
                    hVar2 = nVar.f3105e;
                    v6 = nVar.f3104d;
                    try {
                        p003a.a.p0(obj);
                        nVar2.releaseIntercepted();
                        G6.w wVar = (G6.w) v6.f17569c;
                        nVar.f3104d = null;
                        nVar.f3105e = null;
                        nVar.f3106f = null;
                        nVar.f3102b = 2;
                        wVar.r(hVar2, nVar);
                        return aVar;
                    } catch (Throwable th2) {
                        th = th2;
                        nVar2.releaseIntercepted();
                        throw th;
                    }
                }
                p003a.a.p0(obj);
                H6.n nVar3 = new H6.n(hVar, nVar.getContext());
                try {
                    C0744o c0744o = (C0744o) this.f17568b;
                    nVar.f3104d = this;
                    nVar.f3105e = hVar;
                    nVar.f3106f = nVar3;
                    nVar.f3102b = 1;
                    if (c0744o.invoke(nVar3, nVar) == aVar) {
                        return aVar;
                    }
                    v6 = this;
                    hVar2 = hVar;
                    nVar2 = nVar3;
                    nVar2.releaseIntercepted();
                    G6.w wVar2 = (G6.w) v6.f17569c;
                    nVar.f3104d = null;
                    nVar.f3105e = null;
                    nVar.f3106f = null;
                    nVar.f3102b = 2;
                    wVar2.r(hVar2, nVar);
                    return aVar;
                } catch (Throwable th3) {
                    th = th3;
                    nVar2 = nVar3;
                    nVar2.releaseIntercepted();
                    throw th;
                }
            case 14:
                if (dVar instanceof G6.p) {
                    pVar = (G6.p) dVar;
                    int i9 = pVar.f3113b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        pVar.f3113b = i9 - Integer.MIN_VALUE;
                    } else {
                        pVar = new G6.p(this, dVar);
                    }
                } else {
                    pVar = new G6.p(this, dVar);
                }
                Object obj2 = pVar.f3112a;
                j6.a aVar2 = j6.a.f14648a;
                int i10 = pVar.f3113b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = pVar.f3115d;
                    try {
                        p003a.a.p0(obj2);
                    } catch (H6.a e7) {
                        e = e7;
                        if (e.f3423a != rVar) {
                            throw e;
                        }
                    }
                    break;
                } else {
                    p003a.a.p0(obj2);
                    V0 v7 = (V0) this.f17568b;
                    r rVar2 = new r((C0745p) this.f17569c, hVar);
                    try {
                        pVar.f3115d = rVar2;
                        pVar.f3113b = 1;
                        if (v7.r(rVar2, pVar) == aVar2) {
                            return aVar2;
                        }
                    } catch (H6.a e8) {
                        e = e8;
                        rVar = rVar2;
                        if (e.f3423a != rVar) {
                            throw e;
                        }
                    }
                }
                return i.f13014a;
            default:
                Object objR = ((g) this.f17568b).r(new r(hVar, (I0.c) this.f17569c), dVar);
                return objR == j6.a.f14648a ? objR : i.f13014a;
        }
    }

    public H4.m s(String str) {
        H4.m mVarY = H4.m.y(str);
        P2 p5 = (P2) this.f17569c;
        if (P2.E(mVarY)) {
            String strL = mVarY.l(1);
            H4.f fVar = (H4.f) p5.f17514b;
            if (strL.equals(fVar.f3313a) && mVarY.l(3).equals(fVar.f3314b)) {
                return (H4.m) mVarY.p();
            }
        }
        throw new IllegalArgumentException("Resource name is not valid for current instance: ".concat(str));
    }

    public String toString() {
        switch (this.f17567a) {
            case 29:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f17568b.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f17569c;
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
    public HashMap u(E4.C c3, H4.b bVar, Set set, p023d1.n nVar) {
        HashMap map = new HashMap();
        H4.m mVar = c3.f2095f;
        Iterator itE = ((p075k4.c) this.f17568b).E(new H4.h((H4.m) mVar.b("")));
        while (itE.hasNext()) {
            Map.Entry entry = (Map.Entry) itE.next();
            H4.k kVar = (H4.k) entry.getValue();
            H4.h hVar = (H4.h) entry.getKey();
            if (!mVar.m(hVar.f3318a)) {
                break;
            }
            if (hVar.f3318a.f3312a.size() <= mVar.f3312a.size() + 1 && H4.b.b(kVar).compareTo(bVar) > 0) {
                H4.h hVar2 = kVar.f3323a;
                if (set.contains(hVar2) || c3.g(kVar)) {
                    map.put(hVar2, kVar.f());
                }
            }
        }
        return map;
    }

    @Override // G4.D
    public Map v(String str, H4.b bVar, int i7) {
        throw new UnsupportedOperationException("getAll(String, IndexOffset, int) is not supported.");
    }

    public ArrayList w(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
        if (jSONArrayOptJSONArray != null) {
            for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                arrayList.add(z(jSONArrayOptJSONArray.getJSONObject(i7)));
            }
        }
        return arrayList;
    }

    public Timestamp x(Object obj) {
        int iCharAt;
        if (!(obj instanceof String)) {
            if (!(obj instanceof JSONObject)) {
                throw new IllegalArgumentException("Timestamps must be either ISO 8601-formatted strings or JSON objects");
            }
            JSONObject jSONObject = (JSONObject) obj;
            return new Timestamp(jSONObject.optLong("seconds"), jSONObject.optInt("nanos"));
        }
        String str = (String) obj;
        try {
            int iIndexOf = str.indexOf(84);
            if (iIndexOf == -1) {
                throw new IllegalArgumentException("Invalid timestamp: ".concat(str));
            }
            int iIndexOf2 = str.indexOf(90, iIndexOf);
            if (iIndexOf2 == -1) {
                iIndexOf2 = str.indexOf(43, iIndexOf);
            }
            if (iIndexOf2 == -1) {
                iIndexOf2 = str.indexOf(45, iIndexOf);
            }
            if (iIndexOf2 == -1) {
                throw new IllegalArgumentException("Invalid timestamp: Missing valid timezone offset: ".concat(str));
            }
            String strSubstring = str.substring(0, iIndexOf2);
            String strSubstring2 = "";
            int iIndexOf3 = strSubstring.indexOf(46);
            if (iIndexOf3 != -1) {
                String strSubstring3 = strSubstring.substring(0, iIndexOf3);
                strSubstring2 = strSubstring.substring(iIndexOf3 + 1);
                strSubstring = strSubstring3;
            }
            long time = ((SimpleDateFormat) this.f17568b).parse(strSubstring).getTime() / 1000;
            if (strSubstring2.isEmpty()) {
                iCharAt = 0;
            } else {
                iCharAt = 0;
                for (int i7 = 0; i7 < 9; i7++) {
                    iCharAt *= 10;
                    if (i7 < strSubstring2.length()) {
                        if (strSubstring2.charAt(i7) < '0' || strSubstring2.charAt(i7) > '9') {
                            throw new IllegalArgumentException("Invalid nanoseconds: ".concat(strSubstring2));
                        }
                        iCharAt = (strSubstring2.charAt(i7) - '0') + iCharAt;
                    }
                }
            }
            if (str.charAt(iIndexOf2) != 'Z') {
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                int iIndexOf4 = strSubstring4.indexOf(58);
                if (iIndexOf4 == -1) {
                    throw new IllegalArgumentException("Invalid offset value: ".concat(strSubstring4));
                }
                long j = (Long.parseLong(strSubstring4.substring(iIndexOf4 + 1)) + (Long.parseLong(strSubstring4.substring(0, iIndexOf4)) * 60)) * 60;
                time = str.charAt(iIndexOf2) == '+' ? time - j : time + j;
            } else if (str.length() != iIndexOf2 + 1) {
                throw new IllegalArgumentException("Invalid timestamp: Invalid trailing data \"" + str.substring(iIndexOf2) + "\"");
            }
            return new Timestamp(time, iCharAt);
        } catch (ParseException e7) {
            throw new IllegalArgumentException("Failed to parse timestamp", e7);
        }
    }

    @Override // G4.D
    public H4.k y(H4.h hVar) {
        H4.k kVar = (H4.k) ((p075k4.c) this.f17568b).m(hVar);
        return kVar != null ? kVar.f() : H4.k.g(hVar);
    }

    public I0 z(JSONObject jSONObject) throws JSONException {
        H0 h0S = I0.S();
        if (jSONObject.has("nullValue")) {
            h0S.d();
            I0.C((I0) h0S.f12096b);
        } else {
            if (jSONObject.has("booleanValue")) {
                boolean zOptBoolean = jSONObject.optBoolean("booleanValue", false);
                h0S.d();
                I0.D((I0) h0S.f12096b, zOptBoolean);
            } else if (jSONObject.has("integerValue")) {
                h0S.h(jSONObject.optLong("integerValue"));
            } else if (jSONObject.has("doubleValue")) {
                h0S.g(jSONObject.optDouble("doubleValue"));
            } else if (jSONObject.has("timestampValue")) {
                Timestamp timestampX = x(jSONObject.get("timestampValue"));
                y0 y0VarA = z0.A();
                y0VarA.f(timestampX.f11828a);
                y0VarA.d();
                z0.w((z0) y0VarA.f12096b, timestampX.f11829b);
                h0S.l(y0VarA);
            } else if (jSONObject.has("stringValue")) {
                h0S.k(jSONObject.optString("stringValue", ""));
            } else if (jSONObject.has("bytesValue")) {
                byte[] bArrDecode = Base64.decode(jSONObject.getString("bytesValue"), 0);
                C0865j c0865j = AbstractC0867k.f12212b;
                C0865j c0865jA = AbstractC0867k.A(bArrDecode, 0, bArrDecode.length);
                h0S.d();
                I0.x((I0) h0S.f12096b, c0865jA);
            } else if (jSONObject.has("referenceValue")) {
                String string = jSONObject.getString("referenceValue");
                h0S.d();
                I0.y((I0) h0S.f12096b, string);
            } else if (jSONObject.has("geoPointValue")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("geoPointValue");
                p015b5.a aVarA = p015b5.b.A();
                double dOptDouble = jSONObject2.optDouble("latitude");
                aVarA.d();
                p015b5.b.v((p015b5.b) aVarA.f12096b, dOptDouble);
                double dOptDouble2 = jSONObject2.optDouble("longitude");
                aVarA.d();
                p015b5.b.w((p015b5.b) aVarA.f12096b, dOptDouble2);
                h0S.d();
                I0.z((I0) h0S.f12096b, (p015b5.b) aVarA.b());
            } else if (jSONObject.has("arrayValue")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.getJSONObject("arrayValue").optJSONArray("values");
                C0567d c0567dB = C0569e.B();
                if (jSONArrayOptJSONArray != null) {
                    for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                        I0 i0Z = z(jSONArrayOptJSONArray.getJSONObject(i7));
                        c0567dB.d();
                        C0569e.v((C0569e) c0567dB.f12096b, i0Z);
                    }
                }
                h0S.f(c0567dB);
            } else {
                if (!jSONObject.has("mapValue")) {
                    throw new IllegalArgumentException("Unexpected value type: " + jSONObject);
                }
                q(h0S, jSONObject.getJSONObject("mapValue").optJSONObject("fields"));
            }
        }
        return (I0) h0S.b();
    }

    @Override // J2.c
    public J2.m zza(String str) {
        I2.K k7 = P.f3579l;
        P p5 = E2.o.f1952C.f1957c;
        new I2.A((Context) this.f17568b, (String) this.f17569c, str, null).zzb();
        return J2.m.f3827a;
    }

    public /* synthetic */ V0(int i7, Object obj, Object obj2, boolean z4) {
        this.f17567a = i7;
        this.f17568b = obj;
        this.f17569c = obj2;
    }

    public /* synthetic */ V0(int i7, boolean z4) {
        this.f17567a = i7;
    }

    public /* synthetic */ V0(Object obj) {
        this.f17567a = 29;
        this.f17568b = obj;
        this.f17569c = new ArrayList();
    }

    public V0(C5.b bVar, C1052y0 c1052y0) {
        this.f17567a = 5;
        this.f17568b = bVar;
        this.f17569c = c1052y0;
        c1052y0.f17938b = new R4.c(this, 3);
    }

    public V0(Q q7) {
        this.f17567a = 27;
        h.e(q7, "fragmentManager");
        this.f17568b = q7;
        this.f17569c = new CopyOnWriteArrayList();
    }

    public V0(int i7) {
        this.f17567a = i7;
        switch (i7) {
            case 11:
                this.f17568b = new p075k4.e(Collections.emptyList(), C0270c.f2962c);
                this.f17569c = new p075k4.e(Collections.emptyList(), C0270c.f2963d);
                break;
            case 20:
                this.f17568b = new HashMap();
                this.f17569c = new HashMap();
                break;
            case zzbbd.zzt.zzm /* 21 */:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f17568b = byteArrayOutputStream;
                this.f17569c = new DataOutputStream(byteArrayOutputStream);
                break;
            case 23:
                this.f17568b = new ReentrantLock();
                this.f17569c = new LinkedHashMap();
                break;
            default:
                this.f17569c = new ArrayList();
                break;
        }
    }

    public V0(Q3.n nVar) {
        this.f17567a = 20;
        this.f17568b = new HashMap(nVar.f5820a);
        this.f17569c = new HashMap(nVar.f5821b);
    }

    public V0(l0 l0Var, Object obj) {
        this.f17567a = 22;
        p113p3.f.k(l0Var, "status");
        this.f17568b = l0Var;
        this.f17569c = obj;
    }

    public V0(p014b4.d dVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f17567a = 28;
        com.google.android.gms.common.internal.D.i(dVar);
        this.f17568b = executor;
        this.f17569c = scheduledExecutorService;
    }

    public V0(P2 p5) {
        this.f17567a = 7;
        this.f17569c = p5;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        this.f17568b = simpleDateFormat;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
    }

    public V0(s sVar) {
        this.f17567a = 18;
        this.f17568b = sVar;
        this.f17569c = new C0095a(4, false);
    }

    public V0(L l7) {
        this.f17567a = 4;
        this.f17568b = l7;
        K k7 = new K();
        k7.f1239a = 0;
        this.f17569c = k7;
    }

    public V0(MediaCodec.CryptoInfo cryptoInfo) {
        this.f17567a = 6;
        this.f17568b = cryptoInfo;
        this.f17569c = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public V0(f fVar) {
        this.f17567a = 8;
        this.f17568b = fVar;
        this.f17569c = new AtomicBoolean(false);
    }

    public V0(C c3) {
        this.f17567a = 19;
        this.f17569c = c3;
        this.f17568b = new x(new byte[4], 4);
    }

    @Override // P1.z
    public void c(s sVar, F1.m mVar, J j) {
    }
}
