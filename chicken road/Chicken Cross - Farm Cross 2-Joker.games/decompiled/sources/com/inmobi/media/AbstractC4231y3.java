package com.inmobi.media;

import android.content.ContentValues;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.y3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4231y3 {
    public static final ContentValues a(C4066s3 c4066s3) {
        String str;
        Intrinsics.checkNotNullParameter(c4066s3, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(c4066s3.f7366a));
        contentValues.put("url", c4066s3.b);
        contentValues.put("pending_attempts", Integer.valueOf(c4066s3.f));
        contentValues.put("ts", Long.valueOf(c4066s3.g));
        contentValues.put("created_ts", Long.valueOf(c4066s3.h));
        contentValues.put("follow_redirect", Boolean.valueOf(c4066s3.d));
        contentValues.put("ping_in_webview", Boolean.valueOf(c4066s3.e));
        Map map = c4066s3.c;
        if (map != null && !map.isEmpty()) {
            try {
                Map map2 = c4066s3.c;
                Intrinsics.checkNotNull(map2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                str = new JSONObject(map2).toString();
            } catch (Exception unused) {
                str = "";
            }
            Intrinsics.checkNotNull(str);
            contentValues.put("track_extras", str);
        }
        return contentValues;
    }
}
