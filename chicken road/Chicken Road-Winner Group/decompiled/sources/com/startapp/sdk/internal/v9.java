package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.insight.NetworkTestsMetaData;

/* loaded from: classes.dex */
public final class v9 extends w9 {

    /* renamed from: d, reason: collision with root package name */
    public final Context f4514d;

    public v9(Context context, d9 d9Var, g9 g9Var, n9 n9Var) {
        super(d9Var, g9Var, n9Var);
        this.f4514d = context;
    }

    @Override // com.startapp.sdk.internal.w9
    public final int a() {
        u9 u9Var = new u9(this.f4582a);
        u9Var.c(this.f4514d);
        String str = this.f4582a.f3573c;
        if (str != null && str.length() > 0) {
            u9Var.f4681c = str;
        }
        if ((this.f4583b.f3756b & 32) != 0) {
            try {
                com.startapp.sdk.adsbase.g.e(this.f4514d);
            } catch (Throwable th) {
                if (this.f4582a.f3571a != e9.f) {
                    d9.a(th);
                }
            }
        }
        if ((this.f4583b.f3756b & 8) != 0) {
            try {
                u9Var.f4456r0 = ((jh) ((mh) com.startapp.sdk.components.a.a(this.f4514d).f.a()).b()).a(6);
            } catch (Throwable th2) {
                if (this.f4582a.f3571a != e9.f) {
                    d9.a(th2);
                }
            }
        }
        String str2 = null;
        if ((this.f4583b.f3756b & 1) != 0) {
            try {
                u9Var.b(this.f4514d, null);
            } catch (Throwable th3) {
                if (this.f4582a.f3571a != e9.f) {
                    d9.a(th3);
                }
            }
        }
        if ((this.f4583b.f3756b & 2) != 0) {
            try {
                u9Var.d(this.f4514d);
            } catch (Throwable th4) {
                if (this.f4582a.f3571a != e9.f) {
                    d9.a(th4);
                }
            }
        }
        if ((this.f4583b.f3756b & 4) != 0) {
            try {
                u9Var.e(this.f4514d);
            } catch (Throwable th5) {
                if (this.f4582a.f3571a != e9.f) {
                    d9.a(th5);
                }
            }
        }
        if ((this.f4583b.f3756b & 16) != 0) {
            try {
                u9Var.a(this.f4514d);
            } catch (Throwable th6) {
                if (this.f4582a.f3571a != e9.f) {
                    d9.a(th6);
                }
            }
        }
        if ((this.f4583b.f3756b & 1024) != 0) {
            try {
                u9Var.b(this.f4514d);
            } catch (Throwable th7) {
                if (this.f4582a.f3571a != e9.f) {
                    d9.a(th7);
                }
            }
        }
        if ((this.f4583b.f3756b & 128) != 0) {
            try {
                String str3 = (String) ((l2) com.startapp.sdk.components.a.a(this.f4514d).f3370r.a()).b();
                if (str3 != null) {
                    u9Var.f4458t0 = AbstractC0253g.b(str3);
                }
            } catch (Throwable th8) {
                if (this.f4582a.f3571a != e9.f) {
                    d9.a(th8);
                }
            }
        }
        if ((this.f4583b.f3756b & 256) != 0) {
            try {
                String str4 = (String) ((jg) com.startapp.sdk.components.a.a(this.f4514d).f3371s.a()).b();
                if (str4 != null) {
                    u9Var.f4457s0 = AbstractC0253g.b(str4);
                }
            } catch (Throwable th9) {
                if (this.f4582a.f3571a != e9.f) {
                    d9.a(th9);
                }
            }
        }
        if ((this.f4583b.f3756b & 512) != 0) {
            try {
                u9Var.f4675Y = ((n0) com.startapp.sdk.components.a.a(this.f4514d).f3368p.a()).a();
            } catch (Throwable th10) {
                if (this.f4582a.f3571a != e9.f) {
                    d9.a(th10);
                }
            }
        }
        if ((this.f4583b.f3756b & 2048) != 0) {
            try {
                u9Var.f4459u0 = ((vh) com.startapp.sdk.components.a.a(this.f4514d).f3359g.a()).a(this.f4582a.f3571a);
            } catch (Throwable th11) {
                if (this.f4582a.f3571a != e9.f) {
                    d9.a(th11);
                }
            }
        }
        try {
            u9Var.f4661J = ((ef) com.startapp.sdk.components.a.a(this.f4514d).f3361i.a()).a(u9Var);
        } catch (Throwable th12) {
            if (this.f4582a.f3571a != e9.f) {
                d9.a(th12);
            }
        }
        AnalyticsConfig h3 = MetaData.E().h();
        NetworkTestsMetaData L = MetaData.E().L();
        e9 e9Var = this.f4582a.f3571a;
        if (e9Var == e9.f3625m) {
            if (L != null) {
                str2 = L.a();
            }
        } else if (e9Var == e9.f3626n) {
            if (L != null) {
                str2 = L.b();
            }
        } else if (e9Var == e9.f3627o) {
            if (L != null) {
                str2 = L.c();
            }
        } else if (e9Var == e9.f3621i) {
            str2 = h3.e();
        }
        if (str2 == null) {
            str2 = h3.d();
        }
        o8 o8Var = (o8) com.startapp.sdk.components.a.a(this.f4514d).f3366n.a();
        n8 n8Var = new n8(o8Var, str2);
        n8Var.f4096c = u9Var.a(((HttpClientConfig) o8Var.f.a()).e());
        n8Var.f4097d = ((HttpClientConfig) o8Var.f.a()).a(u9Var.f4676Z);
        r8 b3 = n8Var.b();
        return (b3 == null || b3.f4290b == null) ? 0 : 1;
    }
}
