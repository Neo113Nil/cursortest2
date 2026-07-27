package com.ironsource;

import android.content.Context;
import com.ironsource.C4531m8;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class ch {

    /* renamed from: a, reason: collision with root package name */
    private final String f8116a;
    private Context b;
    private X3 c;
    private R4 d;
    private int e;
    private C4349c5 f;
    private int g;
    private int h;
    private final String i = "ch";
    private a j;

    protected enum a {
        NOT_RECOVERED,
        RECOVERED,
        IN_RECOVERING,
        NOT_ALLOWED
    }

    public ch(Context context, X3 x3, R4 r4, int i, C4349c5 c4349c5, String str) {
        a h = h();
        this.j = h;
        if (h != a.NOT_ALLOWED) {
            this.b = context;
            this.c = x3;
            this.d = r4;
            this.e = i;
            this.f = c4349c5;
            this.g = 0;
        }
        this.f8116a = str;
    }

    private a h() {
        this.h = FeaturesManager.getInstance().getInitRecoverTrials();
        Logger.i(this.i, "getInitialState mMaxAllowedTrials: " + this.h);
        if (this.h > 0) {
            return a.NOT_RECOVERED;
        }
        Logger.i(this.i, "recovery is not allowed by config");
        return a.NOT_ALLOWED;
    }

    private void j() {
        if (this.g != this.h) {
            this.j = a.NOT_RECOVERED;
            return;
        }
        Logger.i(this.i, "handleRecoveringEndedFailed | Reached max trials");
        this.j = a.NOT_ALLOWED;
        a();
    }

    private void k() {
        a();
        this.j = a.RECOVERED;
    }

    public boolean a(C4531m8.c cVar, C4531m8.b bVar) {
        Logger.i(this.i, "shouldRecoverWebController: ");
        a aVar = this.j;
        if (aVar == a.NOT_ALLOWED) {
            Logger.i(this.i, "shouldRecoverWebController: false | recover is not allowed");
            return false;
        }
        if (cVar != C4531m8.c.Native) {
            Logger.i(this.i, "shouldRecoverWebController: false | current controller type is: " + cVar);
            return false;
        }
        if (bVar == C4531m8.b.Loading || bVar == C4531m8.b.None) {
            Logger.i(this.i, "shouldRecoverWebController: false | a Controller is currently loading");
            return false;
        }
        if (aVar == a.RECOVERED) {
            Logger.i(this.i, "shouldRecoverWebController: false | already recovered");
            return false;
        }
        if (aVar == a.IN_RECOVERING) {
            Logger.i(this.i, "shouldRecoverWebController: false | currently in recovering");
            return false;
        }
        if (this.b == null || this.c == null || this.d == null) {
            Logger.i(this.i, "shouldRecoverWebController: false | missing mandatory param");
            return false;
        }
        Logger.i(this.i, "shouldRecoverWebController: true | allow recovering ");
        return true;
    }

    public Context b() {
        return this.b;
    }

    public String c() {
        return this.f8116a;
    }

    public X3 d() {
        return this.c;
    }

    public int e() {
        return this.e;
    }

    public R4 f() {
        return this.d;
    }

    public C4349c5 g() {
        return this.f;
    }

    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(U3.i.A0, m());
            jSONObject.put(U3.i.B0, this.g);
            jSONObject.put(U3.i.C0, this.h);
        } catch (JSONException e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }

    public boolean l() {
        return this.j == a.IN_RECOVERING;
    }

    public boolean m() {
        return this.j == a.RECOVERED;
    }

    public void n() {
        a aVar = this.j;
        a aVar2 = a.IN_RECOVERING;
        if (aVar != aVar2) {
            this.g++;
            Logger.i(this.i, "recoveringStarted - trial number " + this.g);
            this.j = aVar2;
        }
    }

    public void a() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.f = null;
    }

    public void a(boolean z) {
        if (this.j != a.IN_RECOVERING) {
            return;
        }
        if (z) {
            k();
        } else {
            j();
        }
    }
}
