package Pk0;

import De.C2862e;
import S0.C3969l;
import S0.D;
import android.content.Context;
import android.view.View;
import com.google.gson.internal.o;
import gk0.InterfaceC6746B;
import java.util.LinkedHashSet;
import ru.ozon.app.android.initializers.atoms.AtomActionInitializer;
import ru.ozon.uni.android.uikit.view.atoms.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.AtomConfig;

/* loaded from: classes8.dex */
public final /* synthetic */ class f implements InterfaceC6746B, o, q3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22636a;

    public /* synthetic */ f(int i11) {
        this.f22636a = i11;
    }

    public static D b(C2862e c2862e, C3969l c3969l) {
        D d11 = new D(c2862e);
        c3969l.x(d11);
        return d11;
    }

    public static void c(String str, String str2, StringBuilder sb2, boolean z11, boolean z12) {
        sb2.append(z11);
        sb2.append(str);
        sb2.append(z12);
        sb2.append(str2);
    }

    public String a(p3.i iVar) {
        String str = iVar.f80073h;
        return str != null ? str : iVar.f80066a.toString();
    }

    @Override // com.google.gson.internal.o
    public Object f() {
        return new LinkedHashSet();
    }

    @Override // gk0.InterfaceC6746B
    public View provide(Context context) {
        SmallIconButtonView initialize$lambda$5;
        BadgeView init$lambda$14$lambda$10;
        switch (this.f22636a) {
            case 0:
                initialize$lambda$5 = AtomConfig.initialize$lambda$5(context);
                return initialize$lambda$5;
            default:
                init$lambda$14$lambda$10 = AtomActionInitializer.init$lambda$14$lambda$10(context);
                return init$lambda$14$lambda$10;
        }
    }
}
