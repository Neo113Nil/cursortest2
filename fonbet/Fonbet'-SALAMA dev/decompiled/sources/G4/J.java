package G4;

import A1.C0043s0;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class J implements L4.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2899c;

    public /* synthetic */ J(int i7, Object obj, Object obj2) {
        this.f2897a = i7;
        this.f2898b = obj;
        this.f2899c = obj2;
    }

    @Override // L4.h
    public final void accept(Object obj) {
        switch (this.f2897a) {
            case 0:
                HashMap hashMap = (HashMap) this.f2899c;
                Cursor cursor = (Cursor) obj;
                K k7 = (K) this.f2898b;
                k7.getClass();
                try {
                    int i7 = cursor.getInt(0);
                    String string = cursor.getString(1);
                    R4.c cVar = k7.f2903b;
                    W4.g z4 = W4.g.z(cursor.getBlob(2));
                    cVar.getClass();
                    k7.h(new H4.a(i7, string, R4.c.A(z4), hashMap.containsKey(Integer.valueOf(i7)) ? (H4.c) hashMap.get(Integer.valueOf(i7)) : H4.a.f3297e));
                    return;
                } catch (com.google.protobuf.M e7) {
                    p3.f.F("Failed to decode index: " + e7, new Object[0]);
                    throw null;
                }
            case 1:
                H4.m mVar = (H4.m) obj;
                if (((C0286t) this.f2898b).a(mVar)) {
                    String h6 = mVar.h();
                    H4.m mVar2 = (H4.m) mVar.t();
                    SQLiteStatement sQLiteStatement = (SQLiteStatement) this.f2899c;
                    sQLiteStatement.clearBindings();
                    sQLiteStatement.bindString(1, h6);
                    sQLiteStatement.bindString(2, p3.f.C(mVar2));
                    sQLiteStatement.execute();
                    return;
                }
                return;
            default:
                C0043s0 c0043s0 = (C0043s0) this.f2898b;
                c0043s0.getClass();
                ((L4.f) this.f2899c).a(new A0.f(29, c0043s0, (K4.i) obj));
                return;
        }
    }
}
