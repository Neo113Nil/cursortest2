package F90;

import com.vk.id.internal.di.VKIDDepsProd;
import com.vk.id.storage.InternalVKIDEncryptedSharedPreferencesStorage;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.cbottomwebview.presentation.CbottomWebViewDialogFragment;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import y80.C10863b;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9160b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f9159a = i11;
        this.f9160b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int screenEdge_delegate$lambda$0;
        InternalVKIDEncryptedSharedPreferencesStorage encryptedSharedPreferencesStorage$lambda$20;
        switch (this.f9159a) {
            case 0:
                return e.m0((e) this.f9160b);
            case 1:
                return Boolean.valueOf(CbottomWebViewDialogFragment.u((CbottomWebViewDialogFragment) this.f9160b));
            case 2:
                screenEdge_delegate$lambda$0 = FintechWebView.screenEdge_delegate$lambda$0((FintechWebView) this.f9160b);
                return Integer.valueOf(screenEdge_delegate$lambda$0);
            case 3:
                return P60.e.b((P60.e) this.f9160b);
            case 4:
                return NativeBridgeConfigurator.a((NativeBridgeConfigurator) this.f9160b);
            case 5:
                encryptedSharedPreferencesStorage$lambda$20 = VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20((VKIDDepsProd) this.f9160b);
                return encryptedSharedPreferencesStorage$lambda$20;
            case 6:
                return v30.e.i((v30.e) this.f9160b);
            case 7:
                return C10863b.a((C10863b) this.f9160b);
            default:
                return ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a.f0((ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a) this.f9160b);
        }
    }
}
