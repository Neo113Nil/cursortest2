package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Lf {

    /* renamed from: a, reason: collision with root package name */
    public static final Lf f7755a = new Lf();

    private Lf() {
    }

    public final void a(int i) {
        a(EnumC4707w5.TEST_SUITE_FAILED_TO_OPEN, Integer.valueOf(i), null);
    }

    public final void b() {
        a(this, EnumC4707w5.TEST_SUITE_LAUNCH_TS, null, null, 6, null);
    }

    public final void c() {
        a(this, EnumC4707w5.TEST_SUITE_OPENED_SUCCESSFULLY, null, null, 6, null);
    }

    public final void d() {
        a(this, EnumC4707w5.TEST_SUITE_WEB_CONTROLLER_OPEN_SUCCESSFULLY, null, null, 6, null);
    }

    public final void a(String errorReason) {
        Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        a(EnumC4707w5.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD, Integer.valueOf(IronSourceConstants.errorCode_TEST_SUITE_WEB_CONTROLLER_NOT_LOADED), errorReason);
    }

    static /* synthetic */ void a(Lf lf, EnumC4707w5 enumC4707w5, Integer num, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        lf.a(enumC4707w5, num, str);
    }

    private final void a(EnumC4707w5 enumC4707w5, Integer num, String str) {
        Uf uf = Uf.f7953a;
        JSONObject a2 = uf.a(false);
        if (num != null) {
            a2.put(IronSourceConstants.EVENTS_ERROR_CODE, num.intValue());
            JSONArray a3 = a();
            if (a3 != null) {
                a2.put(com.ironsource.mediationsdk.metadata.a.f, a3);
            }
        }
        if (str != null) {
            a2.put("reason", str);
        }
        uf.a(enumC4707w5, a2);
    }

    private final JSONArray a() {
        ConcurrentHashMap<String, List<String>> d = Uf.f7953a.d();
        if (d.containsKey(com.ironsource.mediationsdk.metadata.a.f)) {
            return new JSONArray((Collection) d.get(com.ironsource.mediationsdk.metadata.a.f));
        }
        return null;
    }
}
