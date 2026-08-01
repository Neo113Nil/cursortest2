package com.mbridge.msdk.config.component.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ComponentDatabase.java */
/* loaded from: classes6.dex */
public class a {
    private static a b;

    /* renamed from: a, reason: collision with root package name */
    private final b f8971a;

    private a(Context context) {
        this.f8971a = new b(context);
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (b == null) {
                b = new a(com.mbridge.msdk.foundation.controller.c.n().d());
            }
            aVar = b;
        }
        return aVar;
    }

    public Map<String, Object> b(String str) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), 2);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), "SQL is null");
            return hashMap;
        }
        try {
            a(true).execSQL(str);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), 1);
        } catch (Throwable th) {
            q0.b("ComponentDatabase", th.getMessage());
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), 2);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), th.getMessage());
        }
        return hashMap;
    }

    public Map<String, Object> c(String str) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), 2);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), "SQL is null");
            return hashMap;
        }
        try {
            return b(str);
        } catch (Throwable th) {
            q0.b("ComponentDatabase", th.getMessage());
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), 2);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), th.getMessage());
            return hashMap;
        }
    }

    public Map<String, Object> d(String str) {
        Object obj;
        HashMap hashMap = new HashMap();
        int i = 2;
        if (TextUtils.isEmpty(str)) {
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), 2);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), "SQL is null");
            return hashMap;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        try {
            Object obj2 = null;
            Cursor rawQuery = a(false).rawQuery(str, null);
            if (rawQuery != null) {
                try {
                    if (rawQuery.getCount() > 0) {
                        String[] columnNames = rawQuery.getColumnNames();
                        while (rawQuery.moveToNext()) {
                            HashMap hashMap2 = new HashMap();
                            int length = columnNames.length;
                            int i3 = i2;
                            while (i3 < length) {
                                String str2 = columnNames[i3];
                                int columnIndex = rawQuery.getColumnIndex(str2);
                                if (columnIndex != -1) {
                                    int type = rawQuery.getType(columnIndex);
                                    if (type == 0) {
                                        obj = null;
                                        hashMap2.put(str2, null);
                                        i3++;
                                        obj2 = obj;
                                        i = 2;
                                    } else if (type == 1) {
                                        hashMap2.put(str2, String.valueOf(rawQuery.getLong(columnIndex)));
                                    } else if (type == i) {
                                        hashMap2.put(str2, String.valueOf(rawQuery.getFloat(columnIndex)));
                                    } else if (type == 3) {
                                        hashMap2.put(str2, rawQuery.getString(columnIndex));
                                    } else if (type == 4) {
                                        hashMap2.put(str2, new String(rawQuery.getBlob(columnIndex)));
                                    }
                                }
                                obj = null;
                                i3++;
                                obj2 = obj;
                                i = 2;
                            }
                            arrayList.add(hashMap2);
                            obj2 = obj2;
                            i = 2;
                            i2 = 0;
                        }
                    }
                } finally {
                }
            }
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), 1);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("data"), arrayList);
            if (rawQuery != null) {
                rawQuery.close();
            }
        } catch (Throwable th) {
            q0.b("ComponentDatabase", th.getMessage());
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), 2);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), th.getMessage());
        }
        return hashMap;
    }

    public SQLiteDatabase a(boolean z) {
        try {
            return z ? this.f8971a.getWritableDatabase() : this.f8971a.getReadableDatabase();
        } catch (Throwable th) {
            q0.b("ComponentDatabase", th.getMessage());
            return null;
        }
    }

    public Map<String, Object> a(String str) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), 2);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), "SQL is null");
            return hashMap;
        }
        try {
            b(str);
            if (str.contains(c.TABLE_FILE_DB)) {
                new com.mbridge.msdk.config.component.database.file.a().a(str);
            }
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), 1);
        } catch (Throwable th) {
            q0.b("ComponentDatabase", th.getMessage());
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), 2);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), th.getMessage());
        }
        return hashMap;
    }
}
