package G4;

import android.database.Cursor;
import com.google.firebase.Timestamp;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class I implements L4.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2896b;

    public /* synthetic */ I(Object obj, int i7) {
        this.f2895a = i7;
        this.f2896b = obj;
    }

    @Override // L4.h
    public final void accept(Object obj) {
        Object obj2 = this.f2896b;
        switch (this.f2895a) {
            case 0:
                Cursor cursor = (Cursor) obj;
                ((HashMap) obj2).put(Integer.valueOf(cursor.getInt(0)), new H4.c(cursor.getLong(1), new H4.b(new H4.n(new Timestamp(cursor.getLong(2), cursor.getInt(3))), new H4.h(p113p3.f.A(cursor.getString(4))), cursor.getInt(5))));
                return;
            case 1:
                Boolean[] boolArr = (Boolean[]) obj2;
                try {
                    if ("BUILD_OVERLAYS".equals(((Cursor) obj).getString(0))) {
                        boolArr[0] = Boolean.TRUE;
                        return;
                    }
                    return;
                } catch (IllegalArgumentException e7) {
                    p113p3.f.F("SQLitePersistence.DataMigration failed to parse: %s", e7);
                    throw null;
                }
            default:
                Cursor cursor2 = (Cursor) obj;
                W w7 = (W) obj2;
                w7.getClass();
                w7.f2949c = cursor2.getInt(0);
                w7.f2950d = cursor2.getInt(1);
                w7.f2951e = new H4.n(new Timestamp(cursor2.getLong(2), cursor2.getInt(3)));
                w7.f2952f = cursor2.getLong(4);
                return;
        }
    }
}
