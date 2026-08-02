package B30;

import android.util.Log;
import b90.C5596c;
import com.vk.id.AccessToken;
import com.vk.id.VKID;
import com.vk.id.internal.di.VKIDDepsProd;
import com.vk.id.network.InternalVKIDRealApi;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.tabber.presentation.pay.PayActivity;
import ru.ozon.fintech.ui.textareaV20.TextAreaWrapperView;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;

/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2435a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2436b;

    public /* synthetic */ o(Object obj, int i11) {
        this.f2435a = i11;
        this.f2436b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AccessToken _get_accessToken_$lambda$15;
        InternalVKIDRealApi api$lambda$8;
        OzonTextInput internalOzonTextInput_delegate$lambda$2;
        Object obj = this.f2436b;
        switch (this.f2435a) {
            case 0:
                return r.o((r) obj);
            case 1:
                return I90.f.e0((I90.f) obj);
            case 2:
                Log.d("ESK_FLOW", " provideOkHttpClient provide old client from di");
                return ((C5596c) obj).b();
            case 3:
                _get_accessToken_$lambda$15 = VKID._get_accessToken_$lambda$15((VKID) obj);
                return _get_accessToken_$lambda$15;
            case 4:
                int i11 = PayActivity.f96334t0;
                return ((PayActivity) obj).J();
            case 5:
                api$lambda$8 = VKIDDepsProd.api$lambda$8((VKIDDepsProd) obj);
                return api$lambda$8;
            default:
                internalOzonTextInput_delegate$lambda$2 = TextAreaWrapperView.internalOzonTextInput_delegate$lambda$2((TextAreaWrapperView) obj);
                return internalOzonTextInput_delegate$lambda$2;
        }
    }
}
