package Ve;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* renamed from: Ve.bn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4135bn implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30742a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f30743b;

    public /* synthetic */ C4135bn(Pc.a aVar, int i11) {
        this.f30742a = i11;
        this.f30743b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f30742a) {
            case 0:
                Context context = (Context) ((Jb.f) this.f30743b).get();
                Intrinsics.checkNotNullParameter(context, "context");
                return new Xi(context);
            default:
                We.E okHttpClient = (We.E) this.f30743b.get();
                Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
                Retrofit build = new Retrofit.Builder().baseUrl(He.g.b()).client(okHttpClient).addConverterFactory(GsonConverterFactory.create()).build();
                Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .b…e())\n            .build()");
                Jb.j.d(build);
                return build;
        }
    }
}
