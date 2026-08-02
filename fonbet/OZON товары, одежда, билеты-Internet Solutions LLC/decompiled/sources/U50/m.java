package U50;

import androidx.lifecycle.z0;
import com.vk.id.TokensHandler;
import com.vk.id.internal.di.VKIDDepsProd;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator;
import ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27360b;

    public /* synthetic */ m(Object obj, int i11) {
        this.f27359a = i11;
        this.f27360b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        z0.b factory;
        TokensHandler tokensHandler;
        switch (this.f27359a) {
            case 0:
                return NativeBridgeConfigurator.m((NativeBridgeConfigurator) this.f27360b);
            case 1:
                factory = ((SharingPreviewFragment) this.f27360b).getFactory();
                return factory;
            default:
                tokensHandler = VKIDDepsProd.tokensHandler$lambda$23((VKIDDepsProd) this.f27360b);
                return tokensHandler;
        }
    }
}
