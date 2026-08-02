package B1;

import K0.H;
import P.AbstractC0317t;
import P.D;
import P.e1;
import R3.j;
import S3.K;
import W3.o;
import a0.AbstractC0447c;
import a0.AbstractC0449e;
import android.view.inputmethod.InputMethodManager;
import c.x;
import c.y;
import game.betting133.sports1xbet.aqua_network.AquaSportsDefaults;
import i4.InterfaceC2015a;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Set;
import y4.t;
import y4.u;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements InterfaceC2015a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f750k;

    public /* synthetic */ h(int i) {
        this.f750k = i;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        String apiBa_par_seUrl_delegate$lambda$0;
        String apiS_par_ecret_delegate$lambda$1;
        String apiAut_par_hority_delegate$lambda$2;
        o oVar = o.f6046a;
        switch (this.f750k) {
            case 0:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 1:
                D d5 = E1.a.f1396a;
                return null;
            case 2:
                D d6 = J1.a.f2692a;
                return null;
            case 3:
                return H.f2780d;
            case 4:
                AbstractC0317t.d("Unexpected call to default provider");
                throw new D2.e();
            case 5:
                D.d dVar = j.f5218a;
                return oVar;
            case 6:
                Set set = K.f5393a;
                return oVar;
            case 7:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 8:
                return new Y.d(new LinkedHashMap());
            case 9:
                e1 e1Var = Y.h.f6114a;
                return null;
            case 10:
                e1 e1Var2 = AbstractC0447c.f6365a;
                return null;
            case 11:
                e1 e1Var3 = AbstractC0449e.f6367a;
                return null;
            case 12:
                try {
                    Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                    declaredField.setAccessible(true);
                    Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                    declaredField2.setAccessible(true);
                    Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                    declaredField3.setAccessible(true);
                    return new y(declaredField3, declaredField, declaredField2);
                } catch (NoSuchFieldException unused) {
                    return x.f7370a;
                }
            case 13:
                return oVar;
            case 14:
                D d7 = d.j.f16821a;
                return null;
            case 15:
                apiBa_par_seUrl_delegate$lambda$0 = AquaSportsDefaults.apiBa_par_seUrl_delegate$lambda$0();
                return apiBa_par_seUrl_delegate$lambda$0;
            case 16:
                apiS_par_ecret_delegate$lambda$1 = AquaSportsDefaults.apiS_par_ecret_delegate$lambda$1();
                return apiS_par_ecret_delegate$lambda$1;
            case 17:
                apiAut_par_hority_delegate$lambda$2 = AquaSportsDefaults.apiAut_par_hority_delegate$lambda$2();
                return apiAut_par_hority_delegate$lambda$2;
            case 18:
                return new u(new t());
            default:
                return null;
        }
    }
}
