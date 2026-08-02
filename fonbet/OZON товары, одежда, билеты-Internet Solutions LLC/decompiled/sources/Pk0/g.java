package Pk0;

import S7.q;
import T7.X;
import U7.y;
import android.content.Context;
import android.view.View;
import androidx.core.app.FrameMetricsAggregator;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.z;
import com.google.gson.internal.o;
import gk0.InterfaceC6746B;
import io.sentry.util.l;
import java.util.ArrayDeque;
import ru.ozon.app.android.initializers.atoms.AtomActionInitializer;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.atoms.AtomConfig;

/* loaded from: classes8.dex */
public final /* synthetic */ class g implements InterfaceC6746B, z.a, o, l.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22637a;

    public /* synthetic */ g(int i11) {
        this.f22637a = i11;
    }

    public static int a(int i11, int i12, double d11) {
        return (Double.hashCode(d11) + i11) * i12;
    }

    public static String c(Thread thread, String str, String str2) {
        return thread + str + ((Object) str2);
    }

    public static void d(int i11, String str, String str2, String str3, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(i11);
        sb2.append(str3);
    }

    @Override // com.google.crypto.tink.internal.z.a
    public G b(q qVar) {
        return y.b((X) qVar);
    }

    @Override // com.google.gson.internal.o
    public Object f() {
        return new ArrayDeque();
    }

    @Override // io.sentry.util.l.a
    public Object g() {
        return new FrameMetricsAggregator();
    }

    @Override // gk0.InterfaceC6746B
    public View provide(Context context) {
        SmallButtonView initialize$lambda$7;
        AspectView init$lambda$14$lambda$12;
        switch (this.f22637a) {
            case 0:
                initialize$lambda$7 = AtomConfig.initialize$lambda$7(context);
                return initialize$lambda$7;
            default:
                init$lambda$14$lambda$12 = AtomActionInitializer.init$lambda$14$lambda$12(context);
                return init$lambda$14$lambda$12;
        }
    }
}
