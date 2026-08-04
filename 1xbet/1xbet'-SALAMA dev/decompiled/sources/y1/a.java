package y1;

import A5.p;
import A5.q;
import A5.r;
import A5.s;
import B1.m;
import B3.g;
import B3.h;
import Q3.o;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzj;
import java.util.ArrayList;
import p028d6.k;
import p096n1.e;
import p159w5.c;
import p164x5.b;

/* JADX INFO: loaded from: classes.dex */
public class a implements c, p164x5.a, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p121q5.c f18133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f18134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f18135c;

    public final void a(String str, boolean z4) {
        h hVar;
        if (z4) {
            m mVar = new m(this.f18133a.getBaseContext());
            mVar.f1014b = 1;
            ((ArrayList) mVar.f1015c).add(str);
            B3.a aVarF = mVar.f();
            g gVar = new g(0);
            gVar.f1064c = aVarF;
            gVar.f1063b = false;
            hVar = new h(gVar);
        } else {
            g gVar2 = new g(0);
            gVar2.f1063b = false;
            hVar = new h(gVar2);
        }
        zzj zzjVarZzb = zza.zza(this.f18133a.getBaseContext()).zzb();
        zzjVarZzb.requestConsentInfoUpdate(this.f18133a, hVar, new k(22, (Object) this, (Object) zzjVarZzb, false), new e(this, 24));
    }

    @Override // p164x5.a
    public final void onAttachedToActivity(b bVar) {
        this.f18133a = (p121q5.c) ((o) bVar).f5822a;
    }

    @Override // p159w5.c
    public final void onAttachedToEngine(p159w5.b bVar) {
        s sVar = new s(bVar.f18083c, "gdpr_dialog");
        this.f18134b = sVar;
        sVar.b(this);
    }

    @Override // p164x5.a
    public final void onDetachedFromActivity() {
        this.f18133a = null;
    }

    @Override // p164x5.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f18133a = null;
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(p159w5.b bVar) {
        this.f18134b.b(null);
    }

    /* JADX INFO: Removed unreachable split cross block B:47:0x00ad */
    @Override // A5.q
    public final void onMethodCall(A5.o oVar, r rVar) {
        String str;
        boolean zBooleanValue;
        this.f18135c = (p) rVar;
        try {
            try {
                String str2 = oVar.f676a;
                if (str2.equals("gdpr.activate")) {
                    String str3 = (String) oVar.a("testDeviceId");
                    try {
                        zBooleanValue = ((Boolean) oVar.a("isForTest")).booleanValue();
                    } catch (Exception unused) {
                        zBooleanValue = false;
                    }
                    a(str3, zBooleanValue);
                } else if (str2.equals("gdpr.getConsentStatus")) {
                    int consentStatus = zza.zza(this.f18133a.getBaseContext()).zzb().getConsentStatus();
                    if (consentStatus == 0) {
                        str = "UNKNOWN";
                    } else if (consentStatus == 1) {
                        str = "NOT_REQUIRED";
                    } else if (consentStatus != 2) {
                        str = consentStatus != 3 ? "ERROR" : "OBTAINED";
                    } else {
                        str = "REQUIRED";
                    }
                    this.f18135c.success(str);
                } else if (str2.equals("gdpr.reset")) {
                    try {
                        zza.zza(this.f18133a.getBaseContext()).zzb().reset();
                        this.f18135c.success(Boolean.TRUE);
                    } catch (Exception e7) {
                        this.f18135c.error("not specified code error", e7.getMessage(), e7.getStackTrace());
                    }
                } else {
                    ((p) rVar).notImplemented();
                }
            } catch (Exception e8) {
                this.f18135c.error("1", e8.getMessage(), e8.getStackTrace());
            }
        } catch (Exception unused2) {
        }
    }

    @Override // p164x5.a
    public final void onReattachedToActivityForConfigChanges(b bVar) {
        this.f18133a = (p121q5.c) ((o) bVar).f5822a;
    }
}
