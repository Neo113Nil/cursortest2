package H00;

import H00.b;
import S7.q;
import T7.c0;
import U7.A;
import android.content.Context;
import android.view.View;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.z;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import gk0.InterfaceC6746B;
import kotlin.jvm.internal.Intrinsics;
import n8.InterfaceC8452b;
import n8.e;
import ru.ozon.app.android.initializers.atoms.AtomActionInitializer;
import ru.ozon.uni.android.uikit.view.atoms.buttons.addtocart.AddToCartButtonView;
import z8.InterfaceC10999b;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements b.a, InterfaceC6746B, z.a, e {
    public static int c(int i11, int i12, Object obj) {
        return (obj.hashCode() + i11) * i12;
    }

    @Override // n8.e
    public Object a(InterfaceC8452b interfaceC8452b) {
        InterfaceC10999b lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(interfaceC8452b);
        return lambda$getComponents$0;
    }

    @Override // com.google.crypto.tink.internal.z.a
    public G b(q qVar) {
        return A.d((c0) qVar);
    }

    @Override // H00.b.a
    public void logError(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // gk0.InterfaceC6746B
    public View provide(Context context) {
        AddToCartButtonView init$lambda$14$lambda$3;
        init$lambda$14$lambda$3 = AtomActionInitializer.init$lambda$14$lambda$3(context);
        return init$lambda$14$lambda$3;
    }
}
