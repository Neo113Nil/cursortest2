package Ve;

import B90.C2618u;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Go implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Jb.f f29091a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f29092b;

    public Go(Jb.f fVar, Pc.a aVar) {
        this.f29091a = fVar;
        this.f29092b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) this.f29091a.get();
        We.E okHttpClient = (We.E) this.f29092b.get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        k5.R1 a11 = new C4426lq(context, new M8.b(context), new C2618u(3)).f31542a.a().a();
        Intrinsics.checkNotNullExpressionValue(a11, "bmsSdk.apiProvider.fingerprintApi");
        k5.h3 a12 = a11.a();
        Intrinsics.checkNotNullExpressionValue(a12, "fingerprintApi.fingerprintSdkFactory");
        return a12;
    }
}
