package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.w0;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public e f5907a;
    public String b;
    public j c;
    public boolean d = true;

    public abstract e a();

    public final e a(String str) {
        this.d = str != null;
        e eVar = this.f5907a;
        eVar.getClass();
        eVar.c = System.currentTimeMillis();
        this.c.a(this);
        String a2 = this.c.a();
        this.f5907a.h = a2;
        w0 a3 = com.fyber.inneractive.sdk.config.a.a(this.b);
        IAlog.a("%sGot unit config for unitId: %s from config manager", IAlog.a(this), this.b);
        IAlog.a("%s%s", IAlog.a(this), a3);
        if (this.d) {
            a(str, a3);
        } else if (this instanceof l) {
            a(a2, a3);
        } else {
            h hVar = new h(a2);
            if (hVar.f5909a) {
                String str2 = hVar.b;
                if (str2 == null || TextUtils.isEmpty(str2.trim())) {
                    throw new Exception("empty ad content detected. failing fast.");
                }
                a(str2, a3);
            }
        }
        return this.f5907a;
    }

    public abstract void a(String str, w0 w0Var);

    public boolean b() {
        return this instanceof c;
    }
}
