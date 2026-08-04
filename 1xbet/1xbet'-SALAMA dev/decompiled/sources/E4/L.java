package E4;

import A1.K0;
import G4.C0269b;
import G4.InterfaceC0273f;
import G4.InterfaceC0290x;
import G4.S;
import P.U;
import Y4.L0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AbstractC0616f0;
import androidx.appcompat.widget.C0644u;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.Timestamp;
import com.google.protobuf.AbstractC0867k;
import com.google.protobuf.C0865j;
import com.google.protobuf.z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p155w1.C1017n0;
import p155w1.P2;

/* JADX INFO: loaded from: classes2.dex */
public final class L implements InterfaceC0290x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f2146f;

    public L(View view) {
        this.f2141a = -1;
        this.f2142b = view;
        this.f2143c = C0644u.a();
    }

    @Override // G4.InterfaceC0290x
    public void a() {
        S s7 = (S) this.f2142b;
        C1017n0 c1017n0C0 = s7.c0("SELECT batch_id FROM mutations WHERE uid = ? LIMIT 1");
        String str = (String) this.f2145e;
        c1017n0C0.c(str);
        Cursor cursorJ = c1017n0C0.J();
        try {
            boolean zMoveToFirst = cursorJ.moveToFirst();
            cursorJ.close();
            if (zMoveToFirst) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            C1017n0 c1017n0C1 = s7.c0("SELECT path FROM document_mutations WHERE uid = ?");
            c1017n0C1.c(str);
            Cursor cursorJ2 = c1017n0C1.J();
            while (cursorJ2.moveToNext()) {
                try {
                    arrayList.add(p113p3.f.A(cursorJ2.getString(0)));
                } catch (Throwable th) {
                    if (cursorJ2 != null) {
                        try {
                            cursorJ2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            cursorJ2.close();
            p113p3.f.O("Document leak -- detected dangling mutation references when queue is empty. Dangling keys: %s", arrayList.isEmpty(), arrayList);
        } catch (Throwable th3) {
            if (cursorJ != null) {
                try {
                    cursorJ.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // G4.InterfaceC0290x
    public void b(AbstractC0867k abstractC0867k) {
        abstractC0867k.getClass();
        this.f2146f = abstractC0867k;
        x();
    }

    @Override // G4.InterfaceC0290x
    public ArrayList c(Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(p113p3.f.C(((H4.h) it.next()).f3318a));
        }
        L l7 = new L((S) this.f2142b, "SELECT DISTINCT dm.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path IN (", Arrays.asList(1000000, (String) this.f2145e), arrayList, ") AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id");
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        while (((Iterator) l7.f2146f).hasNext()) {
            l7.t().m(new G4.N(this, hashSet, arrayList2, 0));
        }
        if (l7.f2141a > 1) {
            Collections.sort(arrayList2, new C0269b(4));
        }
        return arrayList2;
    }

    @Override // G4.InterfaceC0290x
    public I4.i d(Timestamp timestamp, ArrayList arrayList, List list) {
        int i7 = this.f2141a;
        this.f2141a = i7 + 1;
        I4.i iVar = new I4.i(i7, timestamp, arrayList, list);
        R4.c cVar = (R4.c) this.f2143c;
        cVar.getClass();
        J4.j jVarF = J4.k.F();
        jVarF.d();
        J4.k.v((J4.k) jVarF.f12096b, iVar.f3673a);
        P2 p5 = (P2) cVar.f6064b;
        z0 z0VarY = P2.y(iVar.f3674b);
        jVarF.d();
        J4.k.y((J4.k) jVarF.f12096b, z0VarY);
        Iterator it = iVar.f3675c.iterator();
        while (it.hasNext()) {
            L0 l0V = p5.v((I4.h) it.next());
            jVarF.d();
            J4.k.w((J4.k) jVarF.f12096b, l0V);
        }
        Iterator it2 = iVar.f3676d.iterator();
        while (it2.hasNext()) {
            L0 l0V2 = p5.v((I4.h) it2.next());
            jVarF.d();
            J4.k.x((J4.k) jVarF.f12096b, l0V2);
        }
        J4.k kVar = (J4.k) jVarF.b();
        Integer numValueOf = Integer.valueOf(i7);
        byte[] bArrD = kVar.d();
        String str = (String) this.f2145e;
        S s7 = (S) this.f2142b;
        s7.b0("INSERT INTO mutations (uid, batch_id, mutations) VALUES (?, ?, ?)", str, numValueOf, bArrD);
        HashSet hashSet = new HashSet();
        SQLiteStatement sQLiteStatementCompileStatement = s7.j.compileStatement("INSERT INTO document_mutations (uid, path, batch_id) VALUES (?, ?, ?)");
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            H4.h hVar = ((I4.h) it3.next()).f3670a;
            if (hashSet.add(hVar)) {
                Object[] objArr = {str, p113p3.f.C(hVar.f3318a), Integer.valueOf(i7)};
                sQLiteStatementCompileStatement.clearBindings();
                S.Y(sQLiteStatementCompileStatement, objArr);
                sQLiteStatementCompileStatement.executeUpdateDelete();
                ((InterfaceC0273f) this.f2144d).s(hVar.d());
            }
        }
        return iVar;
    }

    @Override // G4.InterfaceC0290x
    public I4.i e(int i7) {
        C1017n0 c1017n0C0 = ((S) this.f2142b).c0("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id >= ? ORDER BY batch_id ASC LIMIT 1");
        c1017n0C0.c(1000000, (String) this.f2145e, Integer.valueOf(i7 + 1));
        Cursor cursorJ = c1017n0C0.J();
        try {
            if (!cursorJ.moveToFirst()) {
                cursorJ.close();
                return null;
            }
            I4.i iVarM = m(cursorJ.getInt(0), cursorJ.getBlob(1));
            cursorJ.close();
            return iVarM;
        } catch (Throwable th) {
            if (cursorJ != null) {
                try {
                    cursorJ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // G4.InterfaceC0290x
    public int f() {
        Integer numValueOf;
        C1017n0 c1017n0C0 = ((S) this.f2142b).c0("SELECT IFNULL(MAX(batch_id), ?) FROM mutations WHERE uid = ?");
        c1017n0C0.c(-1, (String) this.f2145e);
        Cursor cursorJ = c1017n0C0.J();
        try {
            if (cursorJ.moveToFirst()) {
                numValueOf = Integer.valueOf(cursorJ.getInt(0));
                cursorJ.close();
            } else {
                cursorJ.close();
                numValueOf = null;
            }
            return numValueOf.intValue();
        } catch (Throwable th) {
            if (cursorJ != null) {
                try {
                    cursorJ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // G4.InterfaceC0290x
    public I4.i g(int i7) {
        C1017n0 c1017n0C0 = ((S) this.f2142b).c0("SELECT SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id = ?");
        c1017n0C0.c(1000000, (String) this.f2145e, Integer.valueOf(i7));
        Cursor cursorJ = c1017n0C0.J();
        try {
            if (!cursorJ.moveToFirst()) {
                cursorJ.close();
                return null;
            }
            I4.i iVarM = m(i7, cursorJ.getBlob(0));
            cursorJ.close();
            return iVarM;
        } catch (Throwable th) {
            if (cursorJ != null) {
                try {
                    cursorJ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // G4.InterfaceC0290x
    public AbstractC0867k h() {
        return (AbstractC0867k) this.f2146f;
    }

    @Override // G4.InterfaceC0290x
    public void i(I4.i iVar, AbstractC0867k abstractC0867k) {
        abstractC0867k.getClass();
        this.f2146f = abstractC0867k;
        x();
    }

    @Override // G4.InterfaceC0290x
    public List j() {
        ArrayList arrayList = new ArrayList();
        C1017n0 c1017n0C0 = ((S) this.f2142b).c0("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? ORDER BY batch_id ASC");
        c1017n0C0.c(1000000, (String) this.f2145e);
        Cursor cursorJ = c1017n0C0.J();
        while (cursorJ.moveToNext()) {
            try {
                arrayList.add(m(cursorJ.getInt(0), cursorJ.getBlob(1)));
            } catch (Throwable th) {
                if (cursorJ != null) {
                    try {
                        cursorJ.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        cursorJ.close();
        return arrayList;
    }

    @Override // G4.InterfaceC0290x
    public void k(I4.i iVar) {
        S s7 = (S) this.f2142b;
        SQLiteStatement sQLiteStatementCompileStatement = s7.j.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        SQLiteStatement sQLiteStatementCompileStatement2 = s7.j.compileStatement("DELETE FROM document_mutations WHERE uid = ? AND path = ? AND batch_id = ?");
        int i7 = iVar.f3673a;
        Integer numValueOf = Integer.valueOf(i7);
        String str = (String) this.f2145e;
        sQLiteStatementCompileStatement.clearBindings();
        S.Y(sQLiteStatementCompileStatement, new Object[]{str, numValueOf});
        p113p3.f.O("Mutation batch (%s, %d) did not exist", sQLiteStatementCompileStatement.executeUpdateDelete() != 0, str, Integer.valueOf(iVar.f3673a));
        Iterator it = iVar.f3676d.iterator();
        while (it.hasNext()) {
            H4.h hVar = ((I4.h) it.next()).f3670a;
            Object[] objArr = {str, p113p3.f.C(hVar.f3318a), Integer.valueOf(i7)};
            sQLiteStatementCompileStatement2.clearBindings();
            S.Y(sQLiteStatementCompileStatement2, objArr);
            sQLiteStatementCompileStatement2.executeUpdateDelete();
            s7.f2934h.A(hVar);
        }
    }

    public void l() {
        View view = (View) this.f2142b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((G4.A) this.f2144d) != null) {
                if (((G4.A) this.f2146f) == null) {
                    this.f2146f = new G4.A();
                }
                G4.A a2 = (G4.A) this.f2146f;
                a2.f2873c = null;
                a2.f2872b = false;
                a2.f2874d = null;
                a2.f2871a = false;
                WeakHashMap weakHashMap = U.f5037a;
                ColorStateList colorStateListG = P.I.g(view);
                if (colorStateListG != null) {
                    a2.f2872b = true;
                    a2.f2873c = colorStateListG;
                }
                PorterDuff.Mode modeH = P.I.h(view);
                if (modeH != null) {
                    a2.f2871a = true;
                    a2.f2874d = modeH;
                }
                if (a2.f2872b || a2.f2871a) {
                    C0644u.d(background, a2, view.getDrawableState());
                    return;
                }
            }
            G4.A a4 = (G4.A) this.f2145e;
            if (a4 != null) {
                C0644u.d(background, a4, view.getDrawableState());
                return;
            }
            G4.A a7 = (G4.A) this.f2144d;
            if (a7 != null) {
                C0644u.d(background, a7, view.getDrawableState());
            }
        }
    }

    public I4.i m(int i7, byte[] bArr) {
        try {
            int length = bArr.length;
            R4.c cVar = (R4.c) this.f2143c;
            if (length < 1000000) {
                return cVar.C(J4.k.H(bArr));
            }
            ArrayList arrayList = new ArrayList();
            C0865j c0865j = AbstractC0867k.f12212b;
            arrayList.add(AbstractC0867k.A(bArr, 0, bArr.length));
            boolean z4 = true;
            while (z4) {
                int size = (arrayList.size() * 1000000) + 1;
                C1017n0 c1017n0C0 = ((S) this.f2142b).c0("SELECT SUBSTR(mutations, ?, ?) FROM mutations WHERE uid = ? AND batch_id = ?");
                c1017n0C0.c(Integer.valueOf(size), 1000000, (String) this.f2145e, Integer.valueOf(i7));
                Cursor cursorJ = c1017n0C0.J();
                try {
                    if (cursorJ.moveToFirst()) {
                        byte[] blob = cursorJ.getBlob(0);
                        C0865j c0865j2 = AbstractC0867k.f12212b;
                        arrayList.add(AbstractC0867k.A(blob, 0, blob.length));
                        if (blob.length < 1000000) {
                            z4 = false;
                        }
                    }
                    cursorJ.close();
                } catch (Throwable th) {
                    if (cursorJ != null) {
                        try {
                            cursorJ.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            int size2 = arrayList.size();
            return cVar.C(J4.k.G(size2 == 0 ? AbstractC0867k.f12212b : AbstractC0867k.m(arrayList.iterator(), size2)));
        } catch (com.google.protobuf.M e7) {
            p113p3.f.F("MutationBatch failed to parse: %s", e7);
            throw null;
        }
    }

    public ColorStateList n() {
        G4.A a2 = (G4.A) this.f2145e;
        if (a2 != null) {
            return (ColorStateList) a2.f2873c;
        }
        return null;
    }

    public PorterDuff.Mode o() {
        G4.A a2 = (G4.A) this.f2145e;
        if (a2 != null) {
            return (PorterDuff.Mode) a2.f2874d;
        }
        return null;
    }

    public void p(Task task) {
        B4.H h6;
        if (this.f2141a > 0) {
            Exception exception = task.getException();
            if ((exception instanceof B4.I) && ((h6 = ((B4.I) exception).f1098a) == B4.H.ABORTED || h6 == B4.H.ALREADY_EXISTS || h6 == B4.H.FAILED_PRECONDITION || !K4.j.a(h6))) {
                this.f2141a--;
                ((L4.m) this.f2145e).a(new K0(this, 2));
                return;
            }
        }
        ((TaskCompletionSource) this.f2146f).setException(task.getException());
    }

    public void q(AttributeSet attributeSet, int i7) {
        ColorStateList colorStateListF;
        View view = (View) this.f2142b;
        Context context = view.getContext();
        int[] iArr = p051h.a.f13327B;
        C1017n0 c1017n0F = C1017n0.F(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) c1017n0F.f17812c;
        View view2 = (View) this.f2142b;
        U.g(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c1017n0F.f17812c, i7);
        try {
            if (typedArray.hasValue(0)) {
                this.f2141a = typedArray.getResourceId(0, -1);
                C0644u c0644u = (C0644u) this.f2143c;
                Context context2 = view.getContext();
                int i8 = this.f2141a;
                synchronized (c0644u) {
                    colorStateListF = c0644u.f8748a.f(i8, context2);
                }
                if (colorStateListF != null) {
                    u(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                P.I.q(view, c1017n0F.q(1));
            }
            if (typedArray.hasValue(2)) {
                P.I.r(view, AbstractC0616f0.c(typedArray.getInt(2, -1), null));
            }
            c1017n0F.H();
        } catch (Throwable th) {
            c1017n0F.H();
            throw th;
        }
    }

    public void r() {
        this.f2141a = -1;
        u(null);
        l();
    }

    public void s(int i7) {
        ColorStateList colorStateListF;
        this.f2141a = i7;
        C0644u c0644u = (C0644u) this.f2143c;
        if (c0644u != null) {
            Context context = ((View) this.f2142b).getContext();
            synchronized (c0644u) {
                colorStateListF = c0644u.f8748a.f(i7, context);
            }
        } else {
            colorStateListF = null;
        }
        u(colorStateListF);
        l();
    }

    @Override // G4.InterfaceC0290x
    public void start() {
        ArrayList<String> arrayList = new ArrayList();
        S s7 = (S) this.f2142b;
        Cursor cursorJ = s7.c0("SELECT uid FROM mutation_queues").J();
        while (cursorJ.moveToNext()) {
            try {
                arrayList.add(cursorJ.getString(0));
            } catch (Throwable th) {
                if (cursorJ != null) {
                    try {
                        cursorJ.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        cursorJ.close();
        this.f2141a = 0;
        for (String str : arrayList) {
            C1017n0 c1017n0C0 = s7.c0("SELECT MAX(batch_id) FROM mutations WHERE uid = ?");
            c1017n0C0.c(str);
            Cursor cursorJ2 = c1017n0C0.J();
            while (cursorJ2.moveToNext()) {
                try {
                    this.f2141a = Math.max(this.f2141a, cursorJ2.getInt(0));
                } catch (Throwable th3) {
                    if (cursorJ2 != null) {
                        try {
                            cursorJ2.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            }
            cursorJ2.close();
        }
        this.f2141a++;
        C1017n0 c1017n0C1 = s7.c0("SELECT last_stream_token FROM mutation_queues WHERE uid = ?");
        c1017n0C1.c((String) this.f2145e);
        Cursor cursorJ3 = c1017n0C1.J();
        try {
            if (!cursorJ3.moveToFirst()) {
                cursorJ3.close();
                x();
            } else {
                byte[] blob = cursorJ3.getBlob(0);
                C0865j c0865j = AbstractC0867k.f12212b;
                this.f2146f = AbstractC0867k.A(blob, 0, blob.length);
                cursorJ3.close();
            }
        } catch (Throwable th5) {
            if (cursorJ3 != null) {
                try {
                    cursorJ3.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
            }
            throw th5;
        }
    }

    public C1017n0 t() {
        this.f2141a++;
        List list = (List) this.f2145e;
        ArrayList arrayList = new ArrayList(list);
        int i7 = 0;
        while (true) {
            Iterator it = (Iterator) this.f2146f;
            if (!it.hasNext() || i7 >= 900 - list.size()) {
                break;
            }
            arrayList.add(it.next());
            i7++;
        }
        Object[] array = arrayList.toArray();
        C1017n0 c1017n0C0 = ((S) this.f2142b).c0(((String) this.f2143c) + ((Object) L4.r.h(", ", "?", array.length)) + ((String) this.f2144d));
        c1017n0C0.c(array);
        return c1017n0C0;
    }

    public void u(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((G4.A) this.f2144d) == null) {
                this.f2144d = new G4.A();
            }
            G4.A a2 = (G4.A) this.f2144d;
            a2.f2873c = colorStateList;
            a2.f2872b = true;
        } else {
            this.f2144d = null;
        }
        l();
    }

    public void v(ColorStateList colorStateList) {
        if (((G4.A) this.f2145e) == null) {
            this.f2145e = new G4.A();
        }
        G4.A a2 = (G4.A) this.f2145e;
        a2.f2873c = colorStateList;
        a2.f2872b = true;
        l();
    }

    public void w(PorterDuff.Mode mode) {
        if (((G4.A) this.f2145e) == null) {
            this.f2145e = new G4.A();
        }
        G4.A a2 = (G4.A) this.f2145e;
        a2.f2874d = mode;
        a2.f2871a = true;
        l();
    }

    public void x() {
        ((S) this.f2142b).b0("INSERT OR REPLACE INTO mutation_queues (uid, last_acknowledged_batch_id, last_stream_token) VALUES (?, ?, ?)", (String) this.f2145e, -1, ((AbstractC0867k) this.f2146f).K());
    }

    public L(S s7, String str, List list, ArrayList arrayList, String str2) {
        this.f2141a = 0;
        this.f2142b = s7;
        this.f2143c = str;
        this.f2145e = list;
        this.f2144d = str2;
        this.f2146f = arrayList.iterator();
    }
}
