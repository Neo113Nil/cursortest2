package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.h7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3758h7 {
    public static final JSONObject a(C3730g7 c3730g7) {
        Intrinsics.checkNotNullParameter(c3730g7, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x", Float.valueOf(AbstractC3727g4.a(c3730g7.f7117a)));
        jSONObject.put("y", Float.valueOf(AbstractC3727g4.a(c3730g7.b)));
        jSONObject.put("width", c3730g7.c);
        jSONObject.put("height", c3730g7.d);
        return jSONObject;
    }
}
