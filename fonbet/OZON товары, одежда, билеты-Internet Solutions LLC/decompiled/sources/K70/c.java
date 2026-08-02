package K70;

import a50.C4950b;
import com.vk.id.internal.di.VKIDDepsProd;
import com.vk.id.storage.InternalVKIDTokenStorage;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.cbottommodal.presentation.CbottomModalDialogFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15330b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f15329a = i11;
        this.f15330b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InternalVKIDTokenStorage internalVKIDTokenStorage;
        switch (this.f15329a) {
            case 0:
                return d.a((d) this.f15330b);
            case 1:
                return ((CbottomModalDialogFragment) this.f15330b).getFactory();
            case 2:
                return ((C4950b) this.f15330b).getFactory();
            case 3:
                internalVKIDTokenStorage = VKIDDepsProd.tokenStorage_delegate$lambda$21((VKIDDepsProd) this.f15330b);
                return internalVKIDTokenStorage;
            case 4:
                return v30.e.h((v30.e) this.f15330b);
            default:
                return ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a.e0((ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a) this.f15330b);
        }
    }
}
