package com.applovin.impl;

import android.app.Activity;
import androidx.exifinterface.media.ExifInterface;
import com.applovin.impl.i6;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.facebook.internal.AnalyticsEvents;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class h6 extends n5 {
    private final com.applovin.impl.sdk.l g;

    public h6(com.applovin.impl.sdk.l lVar) {
        super("TaskInitializeSdk", lVar, true);
        this.g = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, t2 t2Var, Exception exc) {
        if (exc != null) {
            this.g.E().a("license_validation", exc);
        }
        this.g.s0().a(new y6(this.g, t2Var, exc));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.g.U().a(this.g.e().b());
    }

    private void f() {
        if (this.g.U().c()) {
            return;
        }
        Activity w0 = this.g.w0();
        if (w0 != null) {
            this.g.U().a(w0);
        } else {
            this.g.E().a(h2.O0, this.b + ":maybeInitializeAdapters()");
            this.g.s0().a(new x6(this.g, true, "initializeAdapters", new Runnable() { // from class: com.applovin.impl.h6$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    h6.this.e();
                }
            }), i6.b.CORE, TimeUnit.SECONDS.toMillis(1L));
        }
    }

    private void g() {
        boolean c = this.g.q0().c();
        Map p = this.g.B().p();
        Map N = this.g.B().N();
        String a2 = c ? this.g.B().f().a() : "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        String str = c ? p.get("idfv") + " (use this for test devices)" : "<Enable verbose logging to see the App Set ID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        z2 z2Var = new z2();
        z2Var.a().a("=====AppLovin SDK=====");
        z2Var.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.g.a(c5.T3)).a("Ad Review Version", j.b()).a("OM SDK Version", this.g.g0().c());
        z2Var.a("===Device Info===").a(com.moloco.sdk.acm.b.d, t7.d()).a(IronSourceConstants.TYPE_GAID, a2).a("App Set ID", str).a(ExifInterface.TAG_MODEL, p.get("model")).a("Locale", p.get("locale")).a("Emulator", p.get("sim")).a("Tablet", p.get("is_tablet"));
        z2Var.a("===App Info===").a("Application ID", N.get("package_name")).a("Target SDK", N.get("target_sdk"));
        z2Var.a("===SDK Settings===").a("SDK Key", this.g.k0()).a("Mediation Provider", this.g.X()).a("TG", s7.a(this.g)).a("MD", this.g.a(c5.t)).a("Test Mode On", Boolean.valueOf(this.g.u0().c())).a("Verbose Logging On", Boolean.valueOf(c));
        z2Var.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(q0.a(a()));
        z2Var.a("===MAX Terms and Privcay Policy Flow===");
        v0 y = this.g.y();
        boolean j = y.j();
        z2Var.a("Enabled", Boolean.valueOf(j));
        if (j) {
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.g.w().getConsentFlowUserGeography();
            AppLovinSdkConfiguration.ConsentFlowUserGeography d = y.d();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography2 = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
            String str2 = "Other";
            z2Var.a("Consent Flow Geography", consentFlowUserGeography == consentFlowUserGeography2 ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN);
            if (t7.c(this.g)) {
                if (d == consentFlowUserGeography2) {
                    str2 = "GDPR";
                } else if (consentFlowUserGeography != AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER) {
                    str2 = "None";
                }
                z2Var.a("Debug User Geography", str2);
            }
        }
        z2Var.a("Privacy Policy URI", y.f()).a("Terms of Service URI", y.h());
        z2Var.a("===CMP (CONSENT MANAGEMENT PLATFORM)===").a(this.g.t0().i());
        z2Var.a();
        com.applovin.impl.sdk.p.g("AppLovinSdk", z2Var.toString());
    }

    private void h() {
        Long l = (Long) this.g.a(c5.y);
        if (l.longValue() < 0) {
            return;
        }
        Boolean bool = (Boolean) f5.a(e5.i, Boolean.FALSE, com.applovin.impl.sdk.l.p());
        Boolean bool2 = (Boolean) this.g.a(c5.z);
        if (!bool.booleanValue() || bool2.booleanValue()) {
            this.g.P().a(l.longValue()).a(this.g.s0().a("lv_task"), new x4.b() { // from class: com.applovin.impl.h6$$ExternalSyntheticLambda1
                @Override // com.applovin.impl.x4.b
                public final void a(boolean z, Object obj, Object obj2) {
                    h6.this.a(z, (t2) obj, (Exception) obj2);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0176, code lost:
    
        if (r12.g.D0() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01e7, code lost:
    
        r2 = com.ironsource.U3.i.t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01e8, code lost:
    
        r8.a(r9, r4.append(r2).append(" in ").append(java.lang.System.currentTimeMillis() - r6).append("ms").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0204, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01e4, code lost:
    
        if (r12.g.D0() != false) goto L45;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        com.applovin.impl.sdk.p pVar;
        String str;
        StringBuilder append;
        String str2 = AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED;
        long currentTimeMillis = System.currentTimeMillis();
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Initializing AppLovin SDK v" + AppLovinSdk.VERSION + "...");
        }
        try {
            this.g.I().b(a());
            this.g.I().e(a());
            this.g.s0().a((n5) new o5(this.g), i6.b.OTHER);
            this.g.B().d0();
            this.g.n0().c();
            this.g.z().l();
            if (t7.c(this.g)) {
                this.g.a();
            }
            this.g.Z0();
            g();
            f();
            this.g.a(true);
            h();
            this.g.h0().b();
            this.g.l().maybeFireAppKilledWhilePlayingAdPostback();
            if (((Boolean) this.g.a(c5.K2)).booleanValue()) {
                this.g.Z().maybeFireAppKilledWhilePlayingMediatedAdPostback();
            }
            this.g.G().maybeTrackAppOpenEvent();
            this.g.A().a();
            if (((Boolean) this.g.a(c5.X2)).booleanValue()) {
                this.g.z0().b();
            }
            if (((Boolean) this.g.a(c5.c1)).booleanValue()) {
                this.g.i().b();
            } else {
                this.g.i().g();
            }
            if (this.g.W().g() || (((Boolean) this.g.a(v3.G7)).booleanValue() && t7.c(this.g) && this.g.I0())) {
                this.g.W().e();
            }
            this.g.g0().i();
            if (!com.applovin.impl.sdk.p.a()) {
                return;
            }
            pVar = this.c;
            str = this.b;
            append = new StringBuilder().append("AppLovin SDK ").append(AppLovinSdk.VERSION).append(" initialization ");
        } catch (Throwable th) {
            try {
                com.applovin.impl.sdk.p.c("AppLovinSdk", "Failed to initialize SDK!", th);
                this.g.a(false);
                a(th);
                if (((Boolean) this.g.a(c5.i)).booleanValue()) {
                    this.g.h0().a();
                }
                if (((Boolean) this.g.a(c5.h)).booleanValue()) {
                    this.g.V0();
                }
                this.g.g0().i();
                if (!com.applovin.impl.sdk.p.a()) {
                    return;
                }
                pVar = this.c;
                str = this.b;
                append = new StringBuilder().append("AppLovin SDK ").append(AppLovinSdk.VERSION).append(" initialization ");
            } catch (Throwable th2) {
                this.g.g0().i();
                if (com.applovin.impl.sdk.p.a()) {
                    com.applovin.impl.sdk.p pVar2 = this.c;
                    String str3 = this.b;
                    StringBuilder append2 = new StringBuilder("AppLovin SDK ").append(AppLovinSdk.VERSION).append(" initialization ");
                    if (!this.g.D0()) {
                        str2 = U3.i.t;
                    }
                    pVar2.a(str3, append2.append(str2).append(" in ").append(System.currentTimeMillis() - currentTimeMillis).append("ms").toString());
                }
                throw th2;
            }
        }
    }
}
