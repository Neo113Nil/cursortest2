package B3;

import B3.C2561e;
import B3.O;
import B3.q;
import android.content.Context;
import android.os.Build;
import java.io.IOException;

/* renamed from: B3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2566j implements q.b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2355a;

    public C2566j(Context context) {
        this.f2355a = context;
    }

    @Override // B3.q.b
    public final q a(q.a aVar) throws IOException {
        Context context;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 && ((context = this.f2355a) == null || i11 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new O.a().a(aVar);
        }
        int h11 = j3.u.h(aVar.f2363c.f69127o);
        m3.s.e("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + m3.N.G(h11));
        return new C2561e.a(h11).a(aVar);
    }
}
