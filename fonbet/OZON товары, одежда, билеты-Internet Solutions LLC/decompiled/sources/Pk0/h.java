package Pk0;

import S0.C3969l;
import S7.q;
import U7.y;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.x;
import gk0.InterfaceC6746B;
import kotlin.jvm.internal.Intrinsics;
import m3.N;
import ru.ozon.app.android.initializers.atoms.AtomActionInitializer;
import ru.ozon.app.android.uikit.view.atoms.flashsale.StockBarView;
import ru.ozon.uni.android.uikit.view.atoms.tags.TagAtomView;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.data.TestInfo;

/* loaded from: classes8.dex */
public final /* synthetic */ class h implements InterfaceC6746B, x.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22638a;

    public /* synthetic */ h(int i11) {
        this.f22638a = i11;
    }

    public static Paint a(boolean z11) {
        Paint paint = new Paint();
        paint.setAntiAlias(z11);
        return paint;
    }

    public static Object b(C3969l c3969l, int i11) {
        c3969l.k();
        c3969l.o(i11);
        return c3969l.C();
    }

    public static String c(StringBuilder sb2, TestInfo testInfo, String str) {
        sb2.append(testInfo);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder e(String str, String str2) {
        Intrinsics.checkNotNullExpressionValue(str, str2);
        return new StringBuilder();
    }

    public static void f(int i11, int i12, int i13, int i14, int i15) {
        N.L(i11);
        N.L(i12);
        N.L(i13);
        N.L(i14);
        N.L(i15);
    }

    @Override // com.google.crypto.tink.internal.x.a
    public q d(G g10) {
        return y.a(g10);
    }

    @Override // gk0.InterfaceC6746B
    public View provide(Context context) {
        TagAtomView initialize$lambda$8;
        StockBarView init$lambda$14$lambda$13;
        switch (this.f22638a) {
            case 0:
                initialize$lambda$8 = AtomConfig.initialize$lambda$8(context);
                return initialize$lambda$8;
            default:
                init$lambda$14$lambda$13 = AtomActionInitializer.init$lambda$14$lambda$13(context);
                return init$lambda$14$lambda$13;
        }
    }
}
