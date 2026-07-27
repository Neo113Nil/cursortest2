package sg.bigo.ads.c0;

import android.database.Cursor;

/* renamed from: sg.bigo.ads.c0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5051b {

    /* renamed from: a, reason: collision with root package name */
    public long f12702a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final long f;
    public final long g;

    public C5051b(Cursor cursor) {
        this.f12702a = -1L;
        this.f12702a = cursor.getLong(cursor.getColumnIndex("_id"));
        this.b = cursor.getString(cursor.getColumnIndex("event_action"));
        this.c = cursor.getString(cursor.getColumnIndex("event_info"));
        this.d = cursor.getInt(cursor.getColumnIndex("states"));
        this.e = cursor.getString(cursor.getColumnIndex("ext"));
        this.f = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.g = cursor.getLong(cursor.getColumnIndex("mtime"));
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != C5051b.class) {
            return false;
        }
        long j = this.f12702a;
        return j >= 0 && j == ((C5051b) obj).f12702a;
    }

    public final String toString() {
        return "mId = " + this.f12702a + ",eventInfo=" + this.c;
    }

    public C5051b(String str, String str2) {
        this.f12702a = -1L;
        long currentTimeMillis = System.currentTimeMillis();
        this.b = str;
        this.c = str2;
        this.d = 0;
        this.e = "";
        this.f = currentTimeMillis;
        this.g = currentTimeMillis;
    }
}
