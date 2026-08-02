package Pk0;

import U7.n;
import android.content.Context;
import android.view.View;
import com.google.crypto.tink.internal.AbstractC5887f;
import com.google.crypto.tink.internal.F;
import gk0.InterfaceC6746B;
import io.sentry.util.l;
import io.sentry.util.u;
import io.sentry.util.z;
import j3.y;
import m1.InterfaceC8038i;
import m3.r;
import ru.ozon.app.android.initializers.atoms.AtomActionInitializer;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.AtomConfig;

/* loaded from: classes8.dex */
public final /* synthetic */ class a implements InterfaceC6746B, AbstractC5887f.a, l.a, InterfaceC8038i, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22631a;

    public /* synthetic */ a(int i11) {
        this.f22631a = i11;
    }

    public static String a(String str, StringBuilder sb2, boolean z11) {
        sb2.append(z11);
        sb2.append(str);
        return sb2.toString();
    }

    @Override // m1.InterfaceC8038i
    public double c(double d11) {
        return d11;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5887f.a
    public He.g d(F f7, S7.r rVar) {
        return n.b(f7, rVar);
    }

    @Override // io.sentry.util.l.a
    public Object g() {
        byte[] bArr = new byte[8];
        u.a().b(bArr);
        byte b11 = (byte) (bArr[6] & 15);
        bArr[6] = b11;
        bArr[6] = (byte) (b11 | 64);
        long j11 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            j11 = (j11 << 8) | (bArr[i11] & 255);
        }
        return z.c(j11);
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((y.c) obj).onRenderedFirstFrame();
    }

    @Override // gk0.InterfaceC6746B
    public View provide(Context context) {
        TextAtomView initialize$lambda$0;
        TextAtomView init$lambda$14$lambda$0;
        switch (this.f22631a) {
            case 0:
                initialize$lambda$0 = AtomConfig.initialize$lambda$0(context);
                return initialize$lambda$0;
            default:
                init$lambda$14$lambda$0 = AtomActionInitializer.init$lambda$14$lambda$0(context);
                return init$lambda$14$lambda$0;
        }
    }
}
