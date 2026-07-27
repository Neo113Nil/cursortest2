package sg.bigo.ads.c0;

import android.database.Cursor;

/* renamed from: sg.bigo.ads.c0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5050a {

    /* renamed from: a, reason: collision with root package name */
    public final long f12701a;
    public final String b;
    public final long c;
    public final long d;

    public C5050a(Cursor cursor) {
        this.f12701a = -1L;
        this.f12701a = cursor.getLong(cursor.getColumnIndex("_id"));
        this.b = cursor.getString(cursor.getColumnIndex("res_file_name"));
        this.c = cursor.getLong(cursor.getColumnIndex("res_delete_millis"));
        this.d = cursor.getLong(cursor.getColumnIndex("sdk_init_millis"));
        cursor.getString(cursor.getColumnIndex("ext"));
        cursor.getLong(cursor.getColumnIndex("ctime"));
        cursor.getLong(cursor.getColumnIndex("mtime"));
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != C5050a.class) {
            return false;
        }
        long j = this.f12701a;
        return j >= 0 && j == ((C5050a) obj).f12701a;
    }

    public final String toString() {
        return "mId = " + this.f12701a + ",mFileName=" + this.b + ",mSdkInitMillis:" + this.d + ",mDeleteMillis:" + this.c;
    }
}
