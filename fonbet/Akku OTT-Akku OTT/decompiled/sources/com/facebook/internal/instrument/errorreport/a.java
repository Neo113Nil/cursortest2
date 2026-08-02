package com.facebook.internal.instrument.errorreport;

import androidx.annotation.RestrictTo;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class a {
    public static final C0093a Companion = new C0093a();
    public String a;
    public String b;
    public Long c;

    /* renamed from: com.facebook.internal.instrument.errorreport.a$a, reason: collision with other inner class name */
    public static final class C0093a {
    }

    public a(String str) {
        Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        this.c = valueOf;
        this.b = str;
        StringBuffer stringBuffer = new StringBuffer("error_log_");
        Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type kotlin.Long");
        stringBuffer.append(valueOf.longValue());
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
        this.a = stringBuffer2;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.c;
            if (l != null) {
                jSONObject.put(Constants.TIMESTAMP, l);
            }
            jSONObject.put("error_message", this.b);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return super.toString();
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "params.toString()");
        return jSONObject2;
    }
}
