package J0;

import D1.InterfaceC2801g;
import S0.InterfaceC3967k;
import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.C5194q;
import gk0.InterfaceC6746B;
import java.util.TreeSet;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.initializers.atoms.AtomActionInitializer;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.atoms.AtomConfig;

/* loaded from: classes.dex */
public final /* synthetic */ class P implements InterfaceC6746B, com.google.gson.internal.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12929a;

    public /* synthetic */ P(int i11) {
        this.f12929a = i11;
    }

    public static String a(int i11, int i12, String str, String str2, StringBuilder sb2) {
        sb2.append(i11);
        sb2.append(str);
        sb2.append(i12);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder b(String str, String str2, Integer num, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(num);
        sb2.append(str4);
        return sb2;
    }

    public static Function2 c(InterfaceC3967k interfaceC3967k, C5194q c5194q, InterfaceC3967k interfaceC3967k2, S0.A0 a02) {
        S0.F1.b(interfaceC3967k, c5194q, InterfaceC2801g.a.e());
        S0.F1.b(interfaceC3967k2, a02, InterfaceC2801g.a.g());
        return InterfaceC2801g.a.b();
    }

    @Override // com.google.gson.internal.o
    public Object f() {
        return new TreeSet();
    }

    @Override // gk0.InterfaceC6746B
    public View provide(Context context) {
        SmallBorderlessButtonView initialize$lambda$6;
        TextAtomV2View init$lambda$14$lambda$11;
        switch (this.f12929a) {
            case 1:
                initialize$lambda$6 = AtomConfig.initialize$lambda$6(context);
                return initialize$lambda$6;
            default:
                init$lambda$14$lambda$11 = AtomActionInitializer.init$lambda$14$lambda$11(context);
                return init$lambda$14$lambda$11;
        }
    }
}
