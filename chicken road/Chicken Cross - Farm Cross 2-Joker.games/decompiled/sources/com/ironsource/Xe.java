package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Xe {

    /* renamed from: a, reason: collision with root package name */
    private X5 f8015a;

    private final class a extends We {
        public a() {
        }

        @Override // com.ironsource.We, java.lang.Runnable
        public void run() {
            JSONObject b = IronSourceUtils.b(false);
            try {
                b.put(IronSourceConstants.EVENTS_DURATION, a());
            } catch (JSONException e) {
                C4491k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            C4357cd.P.a(new C4689v5(EnumC4707w5.APP_ENTER_BACKGROUND, b));
        }
    }

    public final void a(InterfaceC4441h7 applicationLifecycleService) {
        Intrinsics.checkNotNullParameter(applicationLifecycleService, "applicationLifecycleService");
        this.f8015a = new X5(applicationLifecycleService, new a());
    }
}
