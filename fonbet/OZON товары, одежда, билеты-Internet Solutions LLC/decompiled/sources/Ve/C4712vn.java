package Ve;

import Ae.C2399j;
import Lm0.a;
import W2.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.SPaySdkConfig;

/* renamed from: Ve.vn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4712vn implements Vl {

    /* renamed from: a, reason: collision with root package name */
    public final Tq f32311a;

    /* renamed from: b, reason: collision with root package name */
    public final Ma f32312b;

    /* renamed from: c, reason: collision with root package name */
    public SPaySdkConfig f32313c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f32314d;

    public C4712vn(Tq configService, Ma defaultPreferences) {
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(defaultPreferences, "defaultPreferences");
        this.f32311a = configService;
        this.f32312b = defaultPreferences;
        this.f32314d = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kotlin.coroutines.jvm.internal.c cVar) {
        C4739wm c4739wm;
        int i11;
        try {
            if (cVar instanceof C4739wm) {
                c4739wm = (C4739wm) cVar;
                int i12 = c4739wm.f32384f;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c4739wm.f32384f = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c4739wm.f32382d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c4739wm.f32384f;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        Ma ma2 = this.f32312b;
                        Ma.f29467a.getClass();
                        f.a key = C4381ka.f31433d;
                        c4739wm.f32384f = 1;
                        Le le2 = (Le) ma2;
                        le2.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        obj = C2399j.w(new Ae.C(new C4729wc(AbstractC4445mg.f31590b.getValue(le2.f29422b, AbstractC4445mg.f31589a[0]).getData(), key), new C4727wa()), c4739wm);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                    }
                    return (SPaySdkConfig) new Gson().d((String) obj, SPaySdkConfig.class);
                }
            }
            if (i11 != 0) {
            }
            return (SPaySdkConfig) new Gson().d((String) obj, SPaySdkConfig.class);
        } catch (Exception e11) {
            a.b bVar = Lm0.a.f17149a;
            bVar.b("CATCH_BLOCK_EXCEPTION_TAG");
            bVar.i(e11);
            return null;
        }
        c4739wm = new C4739wm(this, cVar);
        Object obj2 = c4739wm.f32382d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4739wm.f32384f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c2, code lost:
    
        if (r10 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c7, code lost:
    
        if (r10 == r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r5v7, types: [Ve.Tq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(kotlin.coroutines.jvm.internal.c cVar) {
        Xm xm;
        int i11;
        C4712vn c4712vn;
        C4712vn c4712vn2;
        C4197e c4197e;
        SPaySdkConfig sPaySdkConfig;
        C4712vn c4712vn3;
        SPaySdkConfig sPaySdkConfig2;
        Object obj;
        if (cVar instanceof Xm) {
            xm = (Xm) cVar;
            int i12 = xm.f30412i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                xm.f30412i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = xm.f30410g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = xm.f30412i;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    xm.f30407d = this;
                    Tq tq = this.f32311a;
                    xm.f30408e = tq;
                    xm.f30409f = this;
                    xm.f30412i = 1;
                    C4197e c4197e2 = (C4197e) tq;
                    obj2 = c4197e2.a(xm);
                    if (obj2 != aVar) {
                        c4712vn = this;
                        c4712vn2 = c4712vn;
                        c4197e = c4197e2;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj2);
                        return Unit.f71690a;
                    }
                    c4712vn = xm.f30409f;
                    c4712vn3 = xm.f30407d;
                    Sc.s.b(obj2);
                    sPaySdkConfig = (SPaySdkConfig) obj2;
                    c4712vn2 = c4712vn3;
                    c4712vn.f32313c = sPaySdkConfig;
                    sPaySdkConfig2 = c4712vn2.f32313c;
                    if (sPaySdkConfig2 != null) {
                        c4712vn2.f32313c = sPaySdkConfig2;
                        c4712vn2.c();
                        SPaySdkConfig sPaySdkConfig3 = c4712vn2.f32313c;
                        xm.f30407d = null;
                        xm.f30408e = null;
                        xm.f30409f = null;
                        xm.f30412i = 3;
                        String k11 = new Gson().k(sPaySdkConfig3);
                        if (k11 != null) {
                            Ma.f29467a.getClass();
                            f.a aVar2 = C4381ka.f31433d;
                            Le le2 = (Le) c4712vn2.f32312b;
                            obj = AbstractC4445mg.f31590b.getValue(le2.f29422b, AbstractC4445mg.f31589a[0]).a(new Dd(k11, le2, aVar2, null), xm);
                            if (obj != aVar) {
                                obj = Unit.f71690a;
                            }
                        }
                        obj = Unit.f71690a;
                    }
                    return Unit.f71690a;
                }
                c4712vn = xm.f30409f;
                ?? r52 = xm.f30408e;
                c4712vn2 = xm.f30407d;
                Sc.s.b(obj2);
                c4197e = r52;
                sPaySdkConfig = (SPaySdkConfig) obj2;
                if (sPaySdkConfig == null) {
                    xm.f30407d = c4712vn2;
                    xm.f30408e = c4197e;
                    xm.f30409f = c4712vn;
                    xm.f30412i = 2;
                    obj2 = c4712vn2.a(xm);
                    if (obj2 != aVar) {
                        c4712vn3 = c4712vn2;
                        sPaySdkConfig = (SPaySdkConfig) obj2;
                        c4712vn2 = c4712vn3;
                    }
                    return aVar;
                }
                c4712vn.f32313c = sPaySdkConfig;
                sPaySdkConfig2 = c4712vn2.f32313c;
                if (sPaySdkConfig2 != null) {
                }
                return Unit.f71690a;
            }
        }
        xm = new Xm(this, cVar);
        Object obj22 = xm.f30410g;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = xm.f30412i;
        if (i11 != 0) {
        }
        sPaySdkConfig = (SPaySdkConfig) obj22;
        if (sPaySdkConfig == null) {
        }
        c4712vn.f32313c = sPaySdkConfig;
        sPaySdkConfig2 = c4712vn2.f32313c;
        if (sPaySdkConfig2 != null) {
        }
        return Unit.f71690a;
    }

    public final void c() {
        SPaySdkConfig.Localization localization;
        SPaySdkConfig sPaySdkConfig = this.f32313c;
        if (sPaySdkConfig == null || (localization = sPaySdkConfig.getLocalization()) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f32314d;
        linkedHashMap.put("bankApp", localization.getBankApp());
        linkedHashMap.put("enableSPay", localization.getEnableSPay());
        linkedHashMap.put("payError", localization.getPayError());
        linkedHashMap.put("payLoading", localization.getPayLoading());
        linkedHashMap.put("bankAppLoading", localization.getBankAppLoading());
        linkedHashMap.put("successEnableSPay", localization.getSuccessEnableSPay());
        linkedHashMap.put("userProfileInfo", localization.getUserProfileInfo());
        linkedHashMap.put("npmLinkText", localization.getNmtTermsText());
    }
}
