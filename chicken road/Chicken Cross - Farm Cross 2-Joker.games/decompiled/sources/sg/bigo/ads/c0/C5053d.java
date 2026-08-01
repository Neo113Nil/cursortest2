package sg.bigo.ads.c0;

import android.database.Cursor;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* renamed from: sg.bigo.ads.c0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5053d {

    /* renamed from: a, reason: collision with root package name */
    public long f12704a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public String g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public long l;
    public int m;
    public String n;
    public String o;
    public String p;
    public final String q;
    public final long r;
    public final long s;

    public C5053d(Cursor cursor) {
        this.f12704a = -1L;
        this.f12704a = cursor.getLong(cursor.getColumnIndex("_id"));
        this.b = cursor.getString(cursor.getColumnIndex(SDKAnalyticsEvents.PARAMETER_SESSION_ID));
        this.c = cursor.getString(cursor.getColumnIndex("sid"));
        this.d = cursor.getString(cursor.getColumnIndex("dsp"));
        this.e = cursor.getString(cursor.getColumnIndex("ad_id"));
        this.f = cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_CREATIVE_ID));
        this.g = cursor.getString(cursor.getColumnIndex("url"));
        this.h = cursor.getInt(cursor.getColumnIndex("ad_type"));
        this.i = cursor.getInt(cursor.getColumnIndex("adx_type"));
        this.j = cursor.getInt(cursor.getColumnIndex("click_index"));
        this.k = cursor.getString(cursor.getColumnIndex("resolution"));
        this.l = cursor.getLong(cursor.getColumnIndex("cost"));
        this.m = cursor.getInt(cursor.getColumnIndex("action"));
        this.n = cursor.getString(cursor.getColumnIndex("click_trace"));
        this.o = cursor.getString(cursor.getColumnIndex("touch_trace"));
        this.p = cursor.getString(cursor.getColumnIndex("scroll_trace"));
        this.q = cursor.getString(cursor.getColumnIndex("ext"));
        this.r = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.s = cursor.getLong(cursor.getColumnIndex("mtime"));
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != C5053d.class) {
            return false;
        }
        long j = this.f12704a;
        return j >= 0 && j == ((C5053d) obj).f12704a;
    }

    public final String toString() {
        return "mId=" + this.f12704a + ",mSessionId=" + this.b + ",mSid=" + this.c + ",mDsp=" + this.d + ",mAdId=" + this.e + ",mCreativeId=" + this.f + ",mUrl=" + this.g + ",mAdType=" + this.h + ",mAdxType=" + this.i + ",mClickIndex=" + this.j + ",mResolution=" + this.k + ",mCost=" + this.l + ",mAction=" + this.m + ",mClickTrace=" + this.n + ",mTouchTrace=" + this.o + ",mScrollTrace=" + this.p;
    }

    public C5053d(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, String str7, long j, String str8, String str9, String str10) {
        this.f12704a = -1L;
        long currentTimeMillis = System.currentTimeMillis();
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = str7;
        this.l = j;
        this.m = 2;
        this.n = str8;
        this.o = str9;
        this.p = str10;
        this.q = "";
        this.r = currentTimeMillis;
        this.s = currentTimeMillis;
    }
}
