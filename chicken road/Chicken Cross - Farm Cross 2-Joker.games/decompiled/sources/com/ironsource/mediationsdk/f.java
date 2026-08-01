package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.C4471j2;
import com.ironsource.C4597q2;
import com.ironsource.S1;
import com.ironsource.mediationsdk.e;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    private final C4597q2 f8409a;
    private final String b;

    public f(C4597q2 settings, String sessionId) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f8409a = settings;
        this.b = sessionId;
    }

    @Override // com.ironsource.mediationsdk.g
    public e.a a(Context context, h auctionRequestParams, S1 auctionListener) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        Intrinsics.checkNotNullParameter(auctionListener, "auctionListener");
        JSONObject a2 = a(context, auctionRequestParams);
        String a3 = this.f8409a.a(auctionRequestParams.t());
        return auctionRequestParams.t() ? new C4471j2(auctionListener, new URL(a3), a2, auctionRequestParams.u(), this.f8409a) : new e.a(auctionListener, new URL(a3), a2, auctionRequestParams.u(), this.f8409a);
    }

    @Override // com.ironsource.mediationsdk.g
    public boolean b() {
        return this.f8409a.g() > 0;
    }

    @Override // com.ironsource.mediationsdk.g
    public boolean a() {
        return this.f8409a.n();
    }

    private final JSONObject a(Context context, h hVar) throws JSONException {
        JSONObject a2 = d.b().a(hVar);
        Intrinsics.checkNotNullExpressionValue(a2, "getInstance().enrichToke…low(auctionRequestParams)");
        return a2;
    }
}
