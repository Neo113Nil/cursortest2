package G4;

import Y4.A0;
import Y4.x0;
import Y4.y0;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.firebase.Timestamp;
import com.google.protobuf.AbstractC0867k;
import com.google.protobuf.z0;
import java.util.Iterator;
import p155w1.C1017n0;
import p155w1.P2;

/* JADX INFO: loaded from: classes2.dex */
public final class W implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S f2947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R4.c f2948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public H4.n f2951e = H4.n.f3332b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f2952f;

    public W(S s7, R4.c cVar) {
        this.f2947a = s7;
        this.f2948b = cVar;
    }

    @Override // G4.Y
    public final void a(p075k4.e eVar, int i7) {
        S s7 = this.f2947a;
        SQLiteStatement sQLiteStatementCompileStatement = s7.j.compileStatement("INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)");
        Iterator it = eVar.iterator();
        while (true) {
            E3.F f7 = (E3.F) it;
            if (!((Iterator) f7.f1994b).hasNext()) {
                return;
            }
            H4.h hVar = (H4.h) f7.next();
            Object[] objArr = {Integer.valueOf(i7), p113p3.f.C(hVar.f3318a)};
            sQLiteStatementCompileStatement.clearBindings();
            S.Y(sQLiteStatementCompileStatement, objArr);
            sQLiteStatementCompileStatement.executeUpdateDelete();
            s7.f2934h.A(hVar);
        }
    }

    @Override // G4.Y
    public final void b(Z z4) {
        l(z4);
        int i7 = this.f2949c;
        int i8 = z4.f2954b;
        if (i8 > i7) {
            this.f2949c = i8;
        }
        long j = this.f2950d;
        long j3 = z4.f2955c;
        if (j3 > j) {
            this.f2950d = j3;
        }
        this.f2952f++;
        m();
    }

    @Override // G4.Y
    public final void c(Z z4) {
        boolean z7;
        l(z4);
        int i7 = this.f2949c;
        int i8 = z4.f2954b;
        boolean z8 = true;
        if (i8 > i7) {
            this.f2949c = i8;
            z7 = true;
        } else {
            z7 = false;
        }
        long j = this.f2950d;
        long j3 = z4.f2955c;
        if (j3 > j) {
            this.f2950d = j3;
        } else {
            z8 = z7;
        }
        if (z8) {
            m();
        }
    }

    @Override // G4.Y
    public final void d(p075k4.e eVar, int i7) {
        S s7 = this.f2947a;
        SQLiteStatement sQLiteStatementCompileStatement = s7.j.compileStatement("DELETE FROM target_documents WHERE target_id = ? AND path = ?");
        Iterator it = eVar.iterator();
        while (true) {
            E3.F f7 = (E3.F) it;
            if (!((Iterator) f7.f1994b).hasNext()) {
                return;
            }
            H4.h hVar = (H4.h) f7.next();
            Object[] objArr = {Integer.valueOf(i7), p113p3.f.C(hVar.f3318a)};
            sQLiteStatementCompileStatement.clearBindings();
            S.Y(sQLiteStatementCompileStatement, objArr);
            sQLiteStatementCompileStatement.executeUpdateDelete();
            s7.f2934h.A(hVar);
        }
    }

    @Override // G4.Y
    public final int e() {
        return this.f2949c;
    }

    @Override // G4.Y
    public final p075k4.e f(int i7) {
        p075k4.e eVarL = H4.h.f3317c;
        C1017n0 c1017n0C0 = this.f2947a.c0("SELECT path FROM target_documents WHERE target_id = ?");
        c1017n0C0.c(Integer.valueOf(i7));
        Cursor cursorJ = c1017n0C0.J();
        while (cursorJ.moveToNext()) {
            try {
                eVarL = eVarL.l(new H4.h(p113p3.f.A(cursorJ.getString(0))));
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
        return eVarL;
    }

    @Override // G4.Y
    public final H4.n g() {
        return this.f2951e;
    }

    @Override // G4.Y
    public final void h(H4.n nVar) {
        this.f2951e = nVar;
        m();
    }

    @Override // G4.Y
    public final void i(int i7) {
        this.f2947a.b0("DELETE FROM target_documents WHERE target_id = ?", Integer.valueOf(i7));
    }

    @Override // G4.Y
    public final Z j(E4.I i7) {
        String strB = i7.b();
        C1017n0 c1017n0C0 = this.f2947a.c0("SELECT target_proto FROM targets WHERE canonical_id = ?");
        c1017n0C0.c(strB);
        Cursor cursorJ = c1017n0C0.J();
        Z z4 = null;
        while (cursorJ.moveToNext()) {
            try {
                Z zK = k(cursorJ.getBlob(0));
                if (i7.equals(zK.f2953a)) {
                    z4 = zK;
                }
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
        return z4;
    }

    public final Z k(byte[] bArr) {
        try {
            return this.f2948b.D(J4.g.M(bArr));
        } catch (com.google.protobuf.M e7) {
            p113p3.f.F("TargetData failed to parse: %s", e7);
            throw null;
        }
    }

    public final void l(Z z4) {
        E4.I i7 = z4.f2953a;
        String strB = i7.b();
        H4.n nVar = z4.f2957e;
        Timestamp timestamp = nVar.f3333a;
        R4.c cVar = this.f2948b;
        cVar.getClass();
        B b7 = B.f2875a;
        B b8 = z4.f2956d;
        p113p3.f.O("Only queries with purpose %s may be stored, got %s", b7.equals(b8), b7, b8);
        J4.e eVarL = J4.g.L();
        eVarL.d();
        J4.g gVar = (J4.g) eVarL.f12096b;
        int i8 = z4.f2954b;
        J4.g.z(gVar, i8);
        eVarL.d();
        J4.g gVar2 = (J4.g) eVarL.f12096b;
        long j = z4.f2955c;
        J4.g.C(gVar2, j);
        P2 p5 = (P2) cVar.f6064b;
        z0 z0VarY = P2.y(z4.f2958f.f3333a);
        eVarL.d();
        J4.g.x((J4.g) eVarL.f12096b, z0VarY);
        z0 z0VarY2 = P2.y(nVar.f3333a);
        eVarL.d();
        J4.g.A((J4.g) eVarL.f12096b, z0VarY2);
        eVarL.d();
        J4.g gVar3 = (J4.g) eVarL.f12096b;
        AbstractC0867k abstractC0867k = z4.f2959g;
        J4.g.B(gVar3, abstractC0867k);
        if (i7.f()) {
            x0 x0VarZ = y0.z();
            String strX = P2.x((H4.f) p5.f17514b, i7.f2126d);
            x0VarZ.d();
            y0.v((y0) x0VarZ.f12096b, strX);
            y0 y0Var = (y0) x0VarZ.b();
            eVarL.d();
            J4.g.w((J4.g) eVarL.f12096b, y0Var);
        } else {
            A0 a0W = p5.w(i7);
            eVarL.d();
            J4.g.v((J4.g) eVarL.f12096b, a0W);
        }
        this.f2947a.b0("INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(i8), strB, Long.valueOf(timestamp.f11828a), Integer.valueOf(timestamp.f11829b), abstractC0867k.K(), Long.valueOf(j), ((J4.g) eVarL.b()).d());
    }

    public final void m() {
        this.f2947a.b0("UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?", Integer.valueOf(this.f2949c), Long.valueOf(this.f2950d), Long.valueOf(this.f2951e.f3333a.f11828a), Integer.valueOf(this.f2951e.f3333a.f11829b), Long.valueOf(this.f2952f));
    }
}
