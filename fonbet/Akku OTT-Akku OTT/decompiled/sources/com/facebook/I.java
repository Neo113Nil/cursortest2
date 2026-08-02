package com.facebook;

import android.net.Uri;
import com.facebook.internal.E;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class I implements E.a {
    @Override // com.facebook.internal.E.a
    public final void a(JSONObject jSONObject) {
        String optString = jSONObject != null ? jSONObject.optString("id") : null;
        if (optString == null) {
            return;
        }
        String optString2 = jSONObject.optString("link");
        String optString3 = jSONObject.optString("profile_picture", null);
        H h = new H(optString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), optString2 != null ? Uri.parse(optString2) : null, optString3 != null ? Uri.parse(optString3) : null);
        H.Companion.getClass();
        K.Companion.a().a(h, true);
    }

    @Override // com.facebook.internal.E.a
    public final void b(C0728q c0728q) {
        Objects.toString(c0728q);
    }
}
