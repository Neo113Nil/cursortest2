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
import d6.C0977k;
import java.util.ArrayList;
import n1.C1450e;
import q5.AbstractActivityC1559c;
import w5.C1782b;
import w5.InterfaceC1783c;
import x5.InterfaceC1789a;
import x5.InterfaceC1790b;

/* loaded from: classes.dex */
public class a implements InterfaceC1783c, InterfaceC1789a, q {

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC1559c f18127a;

    /* renamed from: b, reason: collision with root package name */
    public s f18128b;

    /* renamed from: c, reason: collision with root package name */
    public p f18129c;

    public final void a(String str, boolean z4) {
        h hVar;
        if (z4) {
            m mVar = new m(this.f18127a.getBaseContext());
            mVar.f1014b = 1;
            ((ArrayList) mVar.f1015c).add(str);
            B3.a f7 = mVar.f();
            g gVar = new g(0);
            gVar.f1064c = f7;
            gVar.f1063b = false;
            hVar = new h(gVar);
        } else {
            g gVar2 = new g(0);
            gVar2.f1063b = false;
            hVar = new h(gVar2);
        }
        zzj zzb = zza.zza(this.f18127a.getBaseContext()).zzb();
        zzb.requestConsentInfoUpdate(this.f18127a, hVar, new C0977k(22, (Object) this, (Object) zzb, false), new C1450e(this, 24));
    }

    @Override // x5.InterfaceC1789a
    public final void onAttachedToActivity(InterfaceC1790b interfaceC1790b) {
        this.f18127a = (AbstractActivityC1559c) ((o) interfaceC1790b).f5822a;
    }

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        s sVar = new s(c1782b.f18077c, "gdpr_dialog");
        this.f18128b = sVar;
        sVar.b(this);
    }

    @Override // x5.InterfaceC1789a
    public final void onDetachedFromActivity() {
        this.f18127a = null;
    }

    @Override // x5.InterfaceC1789a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f18127a = null;
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        this.f18128b.b(null);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00a8 -> B:9:0x00ad). Please report as a decompilation issue!!! */
    @Override // A5.q
    public final void onMethodCall(A5.o oVar, r rVar) {
        boolean z4;
        this.f18129c = (p) rVar;
        try {
            try {
                String str = oVar.f676a;
                if (str.equals("gdpr.activate")) {
                    String str2 = (String) oVar.a("testDeviceId");
                    try {
                        z4 = ((Boolean) oVar.a("isForTest")).booleanValue();
                    } catch (Exception unused) {
                        z4 = false;
                    }
                    a(str2, z4);
                } else if (str.equals("gdpr.getConsentStatus")) {
                    int consentStatus = zza.zza(this.f18127a.getBaseContext()).zzb().getConsentStatus();
                    this.f18129c.success(consentStatus != 0 ? consentStatus != 1 ? consentStatus != 2 ? consentStatus != 3 ? "ERROR" : "OBTAINED" : "REQUIRED" : "NOT_REQUIRED" : "UNKNOWN");
                } else if (str.equals("gdpr.reset")) {
                    try {
                        zza.zza(this.f18127a.getBaseContext()).zzb().reset();
                        this.f18129c.success(Boolean.TRUE);
                    } catch (Exception e7) {
                        this.f18129c.error("not specified code error", e7.getMessage(), e7.getStackTrace());
                    }
                } else {
                    ((p) rVar).notImplemented();
                }
            } catch (Exception e8) {
                this.f18129c.error("1", e8.getMessage(), e8.getStackTrace());
            }
        } catch (Exception unused2) {
        }
    }

    @Override // x5.InterfaceC1789a
    public final void onReattachedToActivityForConfigChanges(InterfaceC1790b interfaceC1790b) {
        this.f18127a = (AbstractActivityC1559c) ((o) interfaceC1790b).f5822a;
    }
}
