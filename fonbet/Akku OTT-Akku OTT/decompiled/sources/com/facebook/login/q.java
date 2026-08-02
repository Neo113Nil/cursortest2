package com.facebook.login;

import android.os.Bundle;
import com.facebook.C0728q;
import com.facebook.internal.E;
import com.facebook.login.u;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class q implements E.a {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ p b;
    public final /* synthetic */ u.c c;

    public q(Bundle bundle, p pVar, u.c cVar) {
        this.a = bundle;
        this.b = pVar;
        this.c = cVar;
    }

    @Override // com.facebook.internal.E.a
    public final void a(JSONObject jSONObject) {
        String string;
        Bundle bundle = this.a;
        p pVar = this.b;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("id");
            } catch (JSONException e) {
                pVar.n().m(u.d.c.c(u.d.Companion, pVar.n().i, "Caught exception", e.getMessage()));
                return;
            }
        } else {
            string = null;
        }
        bundle.putString("com.facebook.platform.extra.USER_ID", string);
        pVar.v(bundle, this.c);
    }

    @Override // com.facebook.internal.E.a
    public final void b(C0728q c0728q) {
        p pVar = this.b;
        pVar.n().m(u.d.c.c(u.d.Companion, pVar.n().i, "Caught exception", c0728q != null ? c0728q.getMessage() : null));
    }
}
