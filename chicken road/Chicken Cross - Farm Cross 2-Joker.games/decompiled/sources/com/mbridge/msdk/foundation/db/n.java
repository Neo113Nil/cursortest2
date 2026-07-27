package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.ironsource.C4761z5;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.o;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: VideoReportDataDao.java */
/* loaded from: classes6.dex */
public class n extends a<com.mbridge.msdk.foundation.entity.n> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9292a = "com.mbridge.msdk.foundation.db.n";
    private static n b;

    private n(f fVar) {
        super(fVar);
    }

    public static n a(f fVar) {
        if (b == null) {
            synchronized (n.class) {
                if (b == null) {
                    b = new n(fVar);
                }
            }
        }
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r1 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0022, code lost:
    
        if (r1 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized int d() {
        int i;
        i = 0;
        Cursor cursor = null;
        try {
            try {
                cursor = getReadableDatabase().rawQuery("select count(*) from reward_report", null);
                if (cursor != null && cursor.moveToFirst()) {
                    i = cursor.getInt(0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception unused) {
                }
            }
            throw th;
        }
        return i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0342, code lost:
    
        if (r13 != null) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x034c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized List<com.mbridge.msdk.foundation.entity.n> a(String str) {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        com.mbridge.msdk.foundation.entity.n nVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        Cursor cursor4;
        com.mbridge.msdk.foundation.entity.n nVar2;
        String str2 = str;
        synchronized (this) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    cursor2 = getReadableDatabase().query("reward_report", null, "key=?", new String[]{str2}, null, null, null);
                    if (cursor2 != null) {
                        try {
                            if (cursor2.getCount() > 0) {
                                ArrayList arrayList3 = new ArrayList();
                                while (cursor2.moveToNext()) {
                                    String string = cursor2.getString(cursor2.getColumnIndex("key"));
                                    int i = cursor2.getInt(cursor2.getColumnIndex("networkType"));
                                    String string2 = cursor2.getString(cursor2.getColumnIndex("network_str"));
                                    cursor2.getInt(cursor2.getColumnIndex("isCompleteView"));
                                    cursor2.getInt(cursor2.getColumnIndex("watchedMillis"));
                                    int i2 = cursor2.getInt(cursor2.getColumnIndex(HandleInvocationsFromAdViewer.KEY_VIDEO_LENGTH));
                                    String string3 = cursor2.getString(cursor2.getColumnIndex("offerUrl"));
                                    String string4 = cursor2.getString(cursor2.getColumnIndex("reason"));
                                    int i3 = cursor2.getInt(cursor2.getColumnIndex("result"));
                                    String string5 = cursor2.getString(cursor2.getColumnIndex(IronSourceConstants.EVENTS_DURATION));
                                    int i4 = cursor2.getInt(cursor2.getColumnIndex("videoSize"));
                                    String string6 = cursor2.getString(cursor2.getColumnIndex("campaignId"));
                                    String string7 = cursor2.getString(cursor2.getColumnIndex("video_url"));
                                    String string8 = cursor2.getString(cursor2.getColumnIndex("unitId"));
                                    String string9 = cursor2.getString(cursor2.getColumnIndex("rid"));
                                    String string10 = cursor2.getString(cursor2.getColumnIndex("rid_n"));
                                    String string11 = cursor2.getString(cursor2.getColumnIndex("ad_type"));
                                    String string12 = cursor2.getString(cursor2.getColumnIndex("resource_type"));
                                    String string13 = cursor2.getString(cursor2.getColumnIndex("device_id"));
                                    String string14 = cursor2.getString(cursor2.getColumnIndex("creative"));
                                    int i5 = cursor2.getInt(cursor2.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T));
                                    if (str2.equals("2000021")) {
                                        try {
                                            try {
                                                nVar = new com.mbridge.msdk.foundation.entity.n(string, i, string3, string4, string2);
                                                nVar.b(string6);
                                                nVar.v(string7);
                                                nVar.n(string9);
                                                nVar.o(string10);
                                                nVar.u(string8);
                                                cursor3 = cursor2;
                                                arrayList = arrayList3;
                                            } catch (Exception e) {
                                                e = e;
                                                e.printStackTrace();
                                                q0.b(f9292a, e.getMessage());
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            cursor = cursor2;
                                            if (cursor != null) {
                                                try {
                                                    cursor.close();
                                                } catch (Exception unused) {
                                                }
                                            }
                                            throw th;
                                        }
                                    } else {
                                        if (str2.equals("2000022")) {
                                            arrayList = arrayList3;
                                            nVar = new com.mbridge.msdk.foundation.entity.n(string, i, i2, string3, i3, string5, i4, string2);
                                            nVar.b(string6);
                                            nVar.v(string7);
                                            nVar.n(string9);
                                            nVar.u(string8);
                                            nVar.m(string4);
                                            nVar.o(string10);
                                            nVar.a(string11);
                                        } else {
                                            arrayList = arrayList3;
                                            if (str2.equals("2000025")) {
                                                nVar = new com.mbridge.msdk.foundation.entity.n(string, i, i2, string3, i3, string5, i4, string2);
                                            } else if (str2.equals("2000024")) {
                                                nVar = new com.mbridge.msdk.foundation.entity.n(string, i, string3, string4, string2);
                                            } else if ("2000039".equals(str2)) {
                                                nVar = new com.mbridge.msdk.foundation.entity.n(cursor2.getString(cursor2.getColumnIndex("h5_click_data")));
                                            } else if ("2000043".equals(str2)) {
                                                try {
                                                    cursor4 = cursor2;
                                                    nVar = nVar2;
                                                    try {
                                                        nVar2 = new com.mbridge.msdk.foundation.entity.n(str, i3, string5, cursor2.getString(cursor2.getColumnIndex(CampaignEx.ENDCARD_URL)), string6, string8, string4, cursor2.getString(cursor2.getColumnIndex("type")));
                                                        nVar.n(string9);
                                                        nVar.o(string10);
                                                        if (!TextUtils.isEmpty(string6)) {
                                                            nVar.b(string6);
                                                        }
                                                        nVar.a(i5);
                                                        nVar.a(string11);
                                                        nVar.p(string12);
                                                        nVar.d(string13);
                                                        nVar.c(string14);
                                                        str2 = str;
                                                        cursor3 = cursor4;
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        cursor2 = cursor4;
                                                        e.printStackTrace();
                                                        q0.b(f9292a, e.getMessage());
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        cursor = cursor4;
                                                        if (cursor != null) {
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    cursor4 = cursor2;
                                                }
                                            } else {
                                                Cursor cursor5 = cursor2;
                                                try {
                                                    str2 = str;
                                                    if ("2000045".equals(str2)) {
                                                        nVar = new com.mbridge.msdk.foundation.entity.n();
                                                        nVar.j(str2);
                                                        nVar.c(i);
                                                        nVar.d(i3);
                                                        nVar.b(string6);
                                                        cursor3 = cursor5;
                                                        nVar.t(cursor3.getString(cursor3.getColumnIndex("template_url")));
                                                        nVar.m(string4);
                                                        nVar.n(string9);
                                                        nVar.o(string10);
                                                        nVar.u(string8);
                                                    } else {
                                                        cursor3 = cursor5;
                                                        if ("2000044".equals(str2)) {
                                                            nVar = new com.mbridge.msdk.foundation.entity.n();
                                                            nVar.j(str2);
                                                            nVar.c(i);
                                                            nVar.b(string6);
                                                            nVar.i(cursor3.getString(cursor3.getColumnIndex(CampaignEx.JSON_KEY_IMAGE_URL)));
                                                            nVar.m(string4);
                                                            nVar.n(string9);
                                                            nVar.o(string10);
                                                            nVar.u(string8);
                                                        } else if ("2000054".equals(str2)) {
                                                            nVar = new com.mbridge.msdk.foundation.entity.n();
                                                            nVar.j(str2);
                                                            nVar.p(string12);
                                                            nVar.u(string8);
                                                            nVar.d(string13);
                                                            nVar.a(string11);
                                                            nVar.b(string6);
                                                            nVar.n(string9);
                                                            nVar.o(string10);
                                                            nVar.d(i3);
                                                            nVar.m(string4);
                                                            nVar.c(i);
                                                            nVar.c(string14);
                                                            nVar.a(i5);
                                                        } else {
                                                            nVar = null;
                                                        }
                                                    }
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    cursor3 = cursor5;
                                                    cursor2 = cursor3;
                                                    e.printStackTrace();
                                                    q0.b(f9292a, e.getMessage());
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    cursor3 = cursor5;
                                                    cursor = cursor3;
                                                    if (cursor != null) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                        }
                                        cursor3 = cursor2;
                                    }
                                    if (nVar != null) {
                                        try {
                                            arrayList2 = arrayList;
                                            arrayList2.add(nVar);
                                        } catch (Exception e5) {
                                            e = e5;
                                            cursor2 = cursor3;
                                            e.printStackTrace();
                                            q0.b(f9292a, e.getMessage());
                                        } catch (Throwable th5) {
                                            th = th5;
                                            cursor = cursor3;
                                            if (cursor != null) {
                                            }
                                            throw th;
                                        }
                                    } else {
                                        arrayList2 = arrayList;
                                    }
                                    getWritableDatabase().delete("reward_report", "id = ?", new String[]{cursor3.getInt(cursor3.getColumnIndex("id")) + ""});
                                    arrayList3 = arrayList2;
                                    cursor2 = cursor3;
                                }
                                ArrayList arrayList4 = arrayList3;
                                try {
                                    cursor2.close();
                                } catch (Exception unused2) {
                                }
                                return arrayList4;
                            }
                        } catch (Exception e6) {
                            e = e6;
                        } catch (Throwable th6) {
                            th = th6;
                            cursor3 = cursor2;
                        }
                    }
                } catch (Exception e7) {
                    e = e7;
                    cursor2 = null;
                } catch (Throwable th7) {
                    th = th7;
                    cursor = null;
                }
                if (cursor2 != null) {
                    cursor2 = cursor2;
                    try {
                        cursor2.close();
                    } catch (Exception unused3) {
                    }
                }
            }
            return null;
        }
    }

    public synchronized long a(com.mbridge.msdk.foundation.entity.n nVar) {
        if (nVar != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("key", nVar.n());
                contentValues.put("networkType", Integer.valueOf(nVar.q()));
                contentValues.put("network_str", nVar.r());
                contentValues.put("isCompleteView", Integer.valueOf(nVar.m()));
                contentValues.put("watchedMillis", Integer.valueOf(nVar.F()));
                contentValues.put(HandleInvocationsFromAdViewer.KEY_VIDEO_LENGTH, Integer.valueOf(nVar.C()));
                if (!TextUtils.isEmpty(nVar.s())) {
                    contentValues.put("offerUrl", nVar.s());
                }
                if (!TextUtils.isEmpty(nVar.t())) {
                    contentValues.put("reason", URLEncoder.encode(nVar.t(), C4761z5.O));
                }
                contentValues.put("result", Integer.valueOf(nVar.x()));
                contentValues.put(IronSourceConstants.EVENTS_DURATION, nVar.g());
                contentValues.put("videoSize", Long.valueOf(nVar.D()));
                contentValues.put("type", nVar.h());
                String i = nVar.i();
                if (!TextUtils.isEmpty(i)) {
                    contentValues.put(CampaignEx.ENDCARD_URL, i);
                }
                String E = nVar.E();
                if (!TextUtils.isEmpty(E)) {
                    contentValues.put("video_url", E);
                }
                String u = nVar.u();
                if (!TextUtils.isEmpty(u)) {
                    contentValues.put("rid", u);
                }
                String v = nVar.v();
                if (!TextUtils.isEmpty(v)) {
                    contentValues.put("rid_n", v);
                }
                String z = nVar.z();
                if (!TextUtils.isEmpty(z)) {
                    contentValues.put("template_url", z);
                }
                String l = nVar.l();
                if (!TextUtils.isEmpty(l)) {
                    contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, l);
                }
                String a2 = nVar.a();
                if (!TextUtils.isEmpty(a2)) {
                    contentValues.put("ad_type", URLEncoder.encode(a2, C4761z5.O));
                }
                contentValues.put("unitId", nVar.B());
                contentValues.put("campaignId", nVar.d());
                if ("2000039".equals(nVar.n())) {
                    String b2 = o.b(nVar);
                    if (a1.b(b2)) {
                        contentValues.put("h5_click_data", b2);
                    }
                }
                String w = nVar.w();
                if (!TextUtils.isEmpty(w)) {
                    contentValues.put("resource_type", URLEncoder.encode(w, C4761z5.O));
                }
                String f = nVar.f();
                if (!TextUtils.isEmpty(f)) {
                    contentValues.put("device_id", URLEncoder.encode(f, C4761z5.O));
                }
                String e = nVar.e();
                if (!TextUtils.isEmpty(e)) {
                    contentValues.put("creative", URLEncoder.encode(e, C4761z5.O));
                }
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(nVar.b()));
                return getWritableDatabase().insert("reward_report", null, contentValues);
            } catch (Exception e2) {
                q0.b(f9292a, e2.getMessage());
            }
        }
        return -1L;
    }
}
