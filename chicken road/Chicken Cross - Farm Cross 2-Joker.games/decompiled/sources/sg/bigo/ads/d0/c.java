package sg.bigo.ads.d0;

import android.content.ContentValues;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import sg.bigo.ads.b0.AbstractC5025b;
import sg.bigo.ads.c0.C5053d;

/* loaded from: classes3.dex */
public abstract class c {
    public static long a(C5053d c5053d) {
        c5053d.toString();
        ContentValues contentValues = new ContentValues();
        long j = c5053d.f12704a;
        if (j > 0) {
            contentValues.put("_id", Long.valueOf(j));
        }
        contentValues.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, c5053d.b);
        contentValues.put("sid", c5053d.c);
        contentValues.put("dsp", c5053d.d);
        contentValues.put("ad_id", c5053d.e);
        contentValues.put(CampaignEx.JSON_KEY_CREATIVE_ID, c5053d.f);
        contentValues.put("url", c5053d.g);
        contentValues.put("ad_type", Integer.valueOf(c5053d.h));
        contentValues.put("adx_type", Integer.valueOf(c5053d.i));
        contentValues.put("click_index", Integer.valueOf(c5053d.j));
        contentValues.put("resolution", c5053d.k);
        contentValues.put("cost", Long.valueOf(c5053d.l));
        contentValues.put("action", Integer.valueOf(c5053d.m));
        contentValues.put("click_trace", c5053d.n);
        contentValues.put("touch_trace", c5053d.o);
        contentValues.put("scroll_trace", c5053d.p);
        contentValues.put("ext", c5053d.q);
        long j2 = c5053d.r;
        if (j2 == 0) {
            j2 = System.currentTimeMillis();
        }
        contentValues.put("ctime", Long.valueOf(j2));
        long j3 = c5053d.s;
        if (j3 == 0) {
            j3 = System.currentTimeMillis();
        }
        contentValues.put("mtime", Long.valueOf(j3));
        return AbstractC5025b.b("tb_webview", contentValues);
    }
}
