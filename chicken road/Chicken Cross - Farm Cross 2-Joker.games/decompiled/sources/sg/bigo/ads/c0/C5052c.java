package sg.bigo.ads.c0;

import android.database.Cursor;

/* renamed from: sg.bigo.ads.c0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5052c {

    /* renamed from: a, reason: collision with root package name */
    public long f12703a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final long f;
    public final long g;

    public C5052c(Cursor cursor) {
        this.f12703a = -1L;
        this.f12703a = cursor.getLong(cursor.getColumnIndex("_id"));
        this.b = cursor.getString(cursor.getColumnIndex("event_id"));
        this.c = cursor.getString(cursor.getColumnIndex("event_info"));
        this.d = cursor.getLong(cursor.getColumnIndex("expired_ts"));
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
        if (obj.getClass() != C5052c.class) {
            return false;
        }
        long j = this.f12703a;
        return j >= 0 && j == ((C5052c) obj).f12703a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("mId = ");
        sb.append(this.f12703a).append(",mEventId = ");
        sb.append(this.b).append(",mExpiredTs = ");
        sb.append(this.d).append(",eventInfo = ");
        sb.append(this.c);
        return sb.toString();
    }

    public C5052c(String str, String str2, long j) {
        this.f12703a = -1L;
        long currentTimeMillis = System.currentTimeMillis();
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = "";
        this.f = currentTimeMillis;
        this.g = currentTimeMillis;
    }
}
