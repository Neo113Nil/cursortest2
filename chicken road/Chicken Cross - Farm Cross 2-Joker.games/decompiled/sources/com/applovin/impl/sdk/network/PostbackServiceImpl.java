package com.applovin.impl.sdk.network;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.i6;
import com.applovin.impl.n5;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.impl.sdk.l;
import com.applovin.impl.v5;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;
import java.util.Map;

/* loaded from: classes5.dex */
public class PostbackServiceImpl implements AppLovinPostbackService {

    /* renamed from: a, reason: collision with root package name */
    private final l f4492a;

    public PostbackServiceImpl(l lVar) {
        this.f4492a = lVar;
    }

    private boolean a(e eVar) {
        Map i = eVar.i();
        if (i == null) {
            return false;
        }
        Object obj = i.get(NotificationCompat.CATEGORY_EVENT);
        if ("postinstall".equals(obj)) {
            obj = i.get("sub_event");
        }
        return EventServiceImpl.ALLOW_PRE_INIT_EVENT_TYPES.contains(obj);
    }

    @Override // com.applovin.sdk.AppLovinPostbackService
    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(e.b(this.f4492a).b(str).a(false).a(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(eVar, i6.b.OTHER, appLovinPostbackListener);
    }

    public String toString() {
        return "PostbackService{}";
    }

    public void dispatchPostbackRequest(e eVar, i6.b bVar, AppLovinPostbackListener appLovinPostbackListener) {
        v5 v5Var = new v5(eVar, bVar, this.f4492a, appLovinPostbackListener);
        v5Var.a(a(eVar));
        this.f4492a.s0().a((n5) v5Var, bVar);
    }
}
