package com.fyber.inneractive.sdk.gpp;

import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class a {
    public String b;
    public String d;
    public Boolean e;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f5423a = new AtomicReference();
    public final com.fyber.inneractive.sdk.tcf.a c = new com.fyber.inneractive.sdk.tcf.a();

    public final boolean a() {
        Boolean bool = this.e;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = this.b;
        if (str == null || str.isEmpty()) {
            this.e = Boolean.FALSE;
            return false;
        }
        for (String str2 : this.b.split("_")) {
            try {
            } catch (NumberFormatException e) {
                IAlog.a("%s Error parsing section ID: %s", e, "GppManager", str2);
            }
            if (Integer.parseInt(str2.trim()) == 2) {
                this.e = Boolean.TRUE;
                return true;
            }
            continue;
        }
        this.e = Boolean.FALSE;
        return false;
    }

    public final void b() {
        String str = null;
        this.e = null;
        if (this.f5423a.get() != null) {
            try {
                this.d = ((SharedPreferences) this.f5423a.get()).getString("IABGPP_HDR_GppString", null);
            } catch (Throwable th) {
                IAlog.a("%s Error on getGppString", th, "GppManager");
            }
        }
        if (this.f5423a.get() != null) {
            try {
                this.b = ((SharedPreferences) this.f5423a.get()).getString("IABGPP_GppSID", null);
            } catch (Throwable th2) {
                IAlog.a("%s Error on computeAvailableSections", th2, "GppManager");
            }
        }
        com.fyber.inneractive.sdk.tcf.a aVar = this.c;
        aVar.b = null;
        aVar.c = false;
        if (this.f5423a.get() != null) {
            try {
                str = ((SharedPreferences) this.f5423a.get()).getString("IABGPP_2_String", null);
            } catch (Throwable th3) {
                IAlog.a("%s Error on getSectionGppString", th3, "GppManager");
            }
        }
        if (str == null) {
            IAlog.a("%s decodeTcf - gppTcfString is null, not decoding TCF", "GppManager");
            return;
        }
        com.fyber.inneractive.sdk.tcf.a aVar2 = this.c;
        aVar2.b = str;
        String[] split = str.split("\\.");
        if (split.length == 0 || !v.a(split[0])) {
            IAlog.a("%s empty string", "GppTcf");
            return;
        }
        try {
            aVar2.f5923a.a(split[0]);
            aVar2.a();
            aVar2.c = true;
            IAlog.a(" %s parsed object: %s", "GppTcf", aVar2.toString());
        } catch (Exception unused) {
            IAlog.b("%s invalid TC string: %s", "GppTcf", aVar2.b);
        }
    }
}
