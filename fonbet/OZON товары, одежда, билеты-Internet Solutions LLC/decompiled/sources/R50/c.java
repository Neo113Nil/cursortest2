package R50;

import R50.a;
import android.content.Context;
import com.squareup.moshi.Moshi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements Jb.e<T50.a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f24641a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<Moshi> f24642b;

    public c(Pc.a<Context> aVar, Pc.a<Moshi> aVar2) {
        this.f24641a = aVar;
        this.f24642b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) ((a.d) this.f24641a).get();
        Moshi moshi = this.f24642b.get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new T50.a(context, moshi);
    }
}
