package com.startapp.sdk.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.consent.ConsentActivity;
import com.startapp.sdk.adsbase.consent.ConsentConfig;
import com.startapp.sdk.adsbase.consent.ConsentTypeInfoConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g6 implements ic {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3750a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f3751b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f3752c;

    /* renamed from: d, reason: collision with root package name */
    public Intent f3753d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3754e = false;
    public boolean f = true;

    public g6(Context context, ib ibVar, ib ibVar2) {
        this.f3750a = context;
        this.f3751b = ibVar;
        this.f3752c = ibVar2;
    }

    public static boolean a(int i3) {
        ConsentConfig r3 = MetaData.E().r();
        ComponentInfoEventConfig f = r3 != null ? r3.f() : null;
        return f != null && f.a((long) i3);
    }

    public final boolean b() {
        ConsentConfig r3 = MetaData.E().r();
        return this.f && r3 != null && r3.l();
    }

    public final void a(Integer num, Long l3, Boolean bool, boolean z3, boolean z4) {
        if (b()) {
            long j3 = ((sf) this.f3751b.a()).getLong("consentTimestamp", 0L);
            int i3 = ((sf) this.f3751b.a()).getInt("consentType", -1);
            boolean contains = ((sf) this.f3751b.a()).contains("consentApc");
            boolean z5 = (num == null || i3 == num.intValue()) ? false : true;
            boolean z6 = (bool == null || (contains && ((sf) this.f3751b.a()).getBoolean("consentApc", false) == bool.booleanValue())) ? false : true;
            boolean z7 = l3 != null && l3.longValue() > j3;
            if (z3 || z7) {
                if (z5 || z6) {
                    rf edit = ((sf) this.f3751b.a()).edit();
                    if (z5) {
                        int intValue = num.intValue();
                        edit.a("consentType", num);
                        edit.f4299a.putInt("consentType", intValue);
                    }
                    if (z6) {
                        boolean booleanValue = bool.booleanValue();
                        edit.a("consentApc", bool);
                        edit.f4299a.putBoolean("consentApc", booleanValue);
                    }
                    if (z7) {
                        long longValue = l3.longValue();
                        edit.a("consentTimestamp", l3);
                        edit.f4299a.putLong("consentTimestamp", longValue);
                    }
                    edit.apply();
                    if (z4) {
                        MetaData.E().a(this.f3750a, new AdPreferences(), MetaDataRequest$RequestReason.CONSENT, false, null, true);
                    }
                }
            }
        }
    }

    @Override // com.startapp.sdk.internal.ic
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z3) {
        MetaData.E().a(this);
        ConsentConfig r3 = MetaData.E().r();
        if (r3 == null || !b()) {
            return;
        }
        Integer b3 = r3.b();
        if (b3 != null) {
            a(b3, Long.valueOf(r3.j()), null, false, false);
        }
        if (metaDataRequest$RequestReason == MetaDataRequest$RequestReason.CONSENT) {
            rf edit = ((sf) this.f3751b.a()).edit();
            long j3 = r3.j();
            edit.a("consentTimestamp", Long.valueOf(j3));
            edit.f4299a.putLong("consentTimestamp", j3);
            edit.apply();
            return;
        }
        if (metaDataRequest$RequestReason == MetaDataRequest$RequestReason.LAUNCH) {
            a(false, null, null, null, null, null);
        }
    }

    @Override // com.startapp.sdk.internal.ic
    public final void a() {
        MetaData.E().a(this);
    }

    public final boolean a(boolean z3, String str, String str2, String str3, String str4, String str5) {
        ConsentConfig r3;
        String g3;
        Integer consentTypeInfo;
        if ((z3 || gh.f3773u == 2) && (r3 = MetaData.E().r()) != null && ((b() || z3) && !this.f3754e)) {
            Context context = this.f3750a;
            WeakHashMap weakHashMap = si.f4343a;
            if (((f6) com.startapp.sdk.components.a.a(context).f3372t.a()).b() && si.c(this.f3750a)) {
                if (!z3 && (r3.i() == null || r3.h() == null || ((sf) this.f3751b.a()).contains("consentApc"))) {
                    return false;
                }
                if (z3) {
                    g3 = AdInformationMetaData.c().a().getDialogUrl();
                } else {
                    g3 = r3.g();
                }
                if (g3 == null) {
                    return false;
                }
                Intent intent = new Intent(this.f3750a, (Class<?>) ConsentActivity.class);
                intent.setFlags(805306368);
                intent.setData(Uri.parse(g3));
                intent.putExtra("allowCT", r3.l());
                intent.putExtra("timestamp", r3.j());
                intent.putExtra("templateName", Integer.valueOf(z3 ? 4 : r3.i().intValue()));
                intent.putExtra("templateId", Integer.valueOf(z3 ? 7 : r3.h().intValue()));
                if (!z3) {
                    str = r3.d();
                }
                if (str != null) {
                    intent.putExtra("dParam", str);
                }
                if (!z3) {
                    str2 = r3.e();
                }
                if (str2 != null) {
                    intent.putExtra("impressionUrl", str2);
                }
                if (!z3) {
                    str3 = r3.a();
                }
                if (str3 != null) {
                    intent.putExtra("clickUrl", str3);
                }
                if (z3) {
                    intent.putExtra("advertisingId", ((com.startapp.sdk.common.advertisingid.b) this.f3752c.a()).a().f3940a);
                    if (((sf) this.f3751b.a()).contains("consentType")) {
                        intent.putExtra("consentType", ((sf) this.f3751b.a()).getInt("consentType", -1));
                    }
                    if (str4 != null) {
                        intent.putExtra("erid", str4);
                    }
                    if (str5 != null) {
                        intent.putExtra("eridUrl", str5);
                    }
                }
                ConsentTypeInfoConfig c3 = r3.c();
                if (c3 != null) {
                    if (c3.b() != null) {
                        intent.putExtra("impression", c3.b());
                    }
                    if (c3.a() != null) {
                        intent.putExtra("falseClick", c3.a());
                    }
                    if (c3.c() != null) {
                        intent.putExtra("trueClick", c3.c());
                    }
                }
                if (z3 && (consentTypeInfo = AdInformationMetaData.c().a().getConsentTypeInfo()) != null) {
                    intent.putExtra("trueClick", consentTypeInfo);
                }
                try {
                    this.f3750a.startActivity(intent);
                    this.f3754e = true;
                    if (a(1)) {
                        d9 d9Var = new d9(e9.f3617d);
                        d9Var.f3574d = "CNS.shown";
                        d9Var.f3578i = String.valueOf(z3);
                        d9Var.f3575e = String.valueOf(System.currentTimeMillis());
                        d9Var.a();
                    }
                } catch (ActivityNotFoundException unused) {
                } catch (Throwable th) {
                    if (a(2)) {
                        d9.a(th);
                    }
                }
                return this.f3754e;
            }
        }
        return false;
    }
}
