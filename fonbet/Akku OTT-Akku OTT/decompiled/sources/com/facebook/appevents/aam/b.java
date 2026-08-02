package com.facebook.appevents.aam;

import androidx.annotation.RestrictTo;
import com.facebook.appevents.aam.d;
import com.facebook.internal.n;
import com.facebook.internal.p;
import com.facebook.w;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class b {
    public static final b a = new b();
    public static boolean b;

    public final void a() {
        String rulesFromServer;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            n k = p.k(w.b(), false);
            if (k != null && (rulesFromServer = k.j) != null) {
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(rulesFromServer, "rulesFromServer");
                try {
                    d.a().clear();
                    d.a.a(new JSONObject(rulesFromServer));
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }
}
