package sg.bigo.ads.h;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.ValueCallback;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.q0.AbstractC5446j;

/* renamed from: sg.bigo.ads.h.f1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5164f1 {
    public static void a(sg.bigo.ads.C.l lVar, ValueCallback valueCallback) {
        if (lVar == null) {
            return;
        }
        sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar.e());
        if (!kVar.p()) {
            String e = kVar.e();
            if (sg.bigo.ads.K0.I.a((CharSequence) e)) {
                valueCallback.onReceiveValue(null);
                return;
            } else {
                sg.bigo.ads.s0.x.a(lVar.k.e, null, e, kVar.T, new C5160e1(valueCallback));
                return;
            }
        }
        String a2 = sg.bigo.ads.U.q.a(kVar.j(), lVar.k.e);
        if (sg.bigo.ads.K0.I.a((CharSequence) a2)) {
            valueCallback.onReceiveValue(null);
        } else {
            AbstractC5446j.a(3, null, new RunnableC5156d1(Uri.parse(a2).getPath(), lVar, valueCallback), 0L);
        }
    }

    public static Bitmap a(Context context, sg.bigo.ads.C.l lVar, Y y, Z z, boolean z2) {
        if (context == null || z == null) {
            return null;
        }
        String str = y != null ? y.c : "";
        if (lVar != null && sg.bigo.ads.K0.I.a((CharSequence) str)) {
            str = lVar.getCreativeId();
        }
        return AbstractC4962t.a(context, (sg.bigo.ads.C.x.a(4, str) * 0.5f) + 3.5f, z.d, z.b, z.c, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Integer a(NativeAd nativeAd) {
        if (nativeAd instanceof sg.bigo.ads.C.w) {
            sg.bigo.ads.C.w wVar = (sg.bigo.ads.C.w) nativeAd;
            Integer num = !wVar.S ? null : wVar.U;
            if (num != null) {
                return num;
            }
        }
        return null;
    }

    public static int a(NativeAd nativeAd, int i, boolean[] zArr) {
        int i2;
        boolean z = true;
        if (i != 2) {
            if (i == 3) {
                Integer a2 = a(nativeAd);
                if (a2 != null) {
                    i2 = a2.intValue();
                } else {
                    z = false;
                }
            }
            i2 = -16736769;
        } else {
            i2 = -14972829;
        }
        if (zArr != null && zArr.length != 0) {
            zArr[0] = z;
        }
        return i2;
    }

    public static sg.bigo.ads.U.r a(sg.bigo.ads.C.l lVar) {
        sg.bigo.ads.U0.h hVar;
        if (lVar == null) {
            return new sg.bigo.ads.U.r(-1, -1);
        }
        sg.bigo.ads.P.r rVar = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar.e())).E0;
        if (rVar != null) {
            sg.bigo.ads.U.r rVar2 = new sg.bigo.ads.U.r(rVar.f12490a, rVar.b);
            if (rVar2.a()) {
                return rVar2;
            }
        }
        if (lVar instanceof sg.bigo.ads.C.t) {
            sg.bigo.ads.z1.p pVar = ((sg.bigo.ads.C.t) lVar).l0;
            if (pVar != null) {
                sg.bigo.ads.U.r rVar3 = new sg.bigo.ads.U.r(pVar.v, pVar.u);
                if (rVar3.a()) {
                    return rVar3;
                }
            }
            sg.bigo.ads.U0.s sVar = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar.e())).A0;
            if (sVar != null) {
                sg.bigo.ads.U.r rVar4 = new sg.bigo.ads.U.r(sVar.f12581a, sVar.b);
                if (rVar4.a()) {
                    return rVar4;
                }
            }
        } else {
            sg.bigo.ads.U0.h[] hVarArr = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar.e())).z0;
            if (!sg.bigo.ads.K0.A.c(hVarArr)) {
                for (int i = 0; i < hVarArr.length && (hVar = hVarArr[i]) != null; i++) {
                    sg.bigo.ads.U.r rVar5 = new sg.bigo.ads.U.r(hVar.f12572a, hVar.b);
                    if (rVar5.a()) {
                        return rVar5;
                    }
                }
            }
        }
        return new sg.bigo.ads.U.r(-1, -1);
    }

    public static void a(int i, AdCountDownButton adCountDownButton) {
        int i2;
        boolean z;
        if (adCountDownButton == null) {
            return;
        }
        if (i != 2) {
            i2 = i != 3 ? i != 4 ? i != 5 ? i != 6 ? -1 : R.drawable.bigo_ad_ic_close5 : R.drawable.bigo_ad_ic_close4 : R.drawable.bigo_ad_ic_close3 : R.drawable.bigo_ad_ic_close;
            z = false;
        } else {
            i2 = R.drawable.bigo_ad_ic_close3;
            z = true;
        }
        if (i2 == -1) {
            adCountDownButton.a(R.layout.bigo_ad_item_inter_default_countdown_bg);
            return;
        }
        adCountDownButton.a(R.layout.bigo_ad_item_inter_countdown_bg);
        adCountDownButton.setCloseImageResource(i2);
        if (!adCountDownButton.c) {
            adCountDownButton.g = z;
            adCountDownButton.k.setVisibility(z ? 8 : 0);
            adCountDownButton.j.setVisibility(z ? 8 : 0);
            adCountDownButton.setShowCloseButtonInCountdown(!z);
        }
        if (i != 2) {
            adCountDownButton.setShowCloseButtonInCountdown(true);
        }
    }
}
