package G4;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class V implements L4.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V0 f2946b;

    public /* synthetic */ V(V0 v6, int i7) {
        this.f2945a = i7;
        this.f2946b = v6;
    }

    @Override // L4.h
    public final void accept(Object obj) {
        Cursor cursor = (Cursor) obj;
        switch (this.f2945a) {
            case 0:
                V0 v6 = this.f2946b;
                v6.getClass();
                int i7 = cursor.getInt(0);
                try {
                    J4.g gVarM = J4.g.M(cursor.getBlob(1));
                    com.google.protobuf.A a2 = (com.google.protobuf.A) gVarM.j(5);
                    if (!a2.f12095a.equals(gVarM)) {
                        a2.d();
                        com.google.protobuf.A.e(a2.f12096b, gVarM);
                    }
                    J4.e eVar = (J4.e) a2;
                    eVar.d();
                    J4.g.y((J4.g) eVar.f12096b);
                    ((SQLiteDatabase) v6.f17568b).execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{((J4.g) eVar.b()).d(), Integer.valueOf(i7)});
                    return;
                } catch (com.google.protobuf.M unused) {
                    p113p3.f.F("Failed to decode Query data for target %s", Integer.valueOf(i7));
                    throw null;
                }
            case 1:
                V0 v7 = this.f2946b;
                v7.getClass();
                int i8 = cursor.getInt(0);
                try {
                    ((SQLiteDatabase) v7.f17568b).execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{((R4.c) v7.f17569c).D(J4.g.M(cursor.getBlob(1))).f2953a.b(), Integer.valueOf(i8)});
                    return;
                } catch (com.google.protobuf.M unused2) {
                    p113p3.f.F("Failed to decode Query data for target %s", Integer.valueOf(i8));
                    throw null;
                }
            default:
                V0 v8 = this.f2946b;
                v8.getClass();
                String string = cursor.getString(0);
                Q q7 = new Q(new Object[]{string, Long.valueOf(cursor.getLong(1))}, 0);
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) v8.f17568b;
                Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(q7, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?", null, null);
                while (cursorRawQueryWithFactory.moveToNext()) {
                    try {
                        int i9 = cursorRawQueryWithFactory.getInt(0);
                        SQLiteStatement sQLiteStatementCompileStatement = sQLiteDatabase.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
                        sQLiteStatementCompileStatement.bindString(1, string);
                        sQLiteStatementCompileStatement.bindLong(2, i9);
                        p113p3.f.O("Mutation batch (%s, %d) did not exist", sQLiteStatementCompileStatement.executeUpdateDelete() != 0, string, Integer.valueOf(i9));
                        sQLiteDatabase.execSQL("DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?", new Object[]{string, Integer.valueOf(i9)});
                    } catch (Throwable th) {
                        if (cursorRawQueryWithFactory != null) {
                            try {
                                cursorRawQueryWithFactory.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            break;
                        }
                        throw th;
                    }
                }
                cursorRawQueryWithFactory.close();
                return;
        }
    }
}
