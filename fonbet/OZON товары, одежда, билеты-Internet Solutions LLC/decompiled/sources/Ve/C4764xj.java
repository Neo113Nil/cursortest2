package Ve;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import l5.C7873b;
import l5.g;
import n5.u;

/* renamed from: Ve.xj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4764xj implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Jb.f f32489a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f32490b;

    public C4764xj(Jb.f fVar, Pc.a aVar) {
        this.f32489a = fVar;
        this.f32490b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) this.f32489a.get();
        We.E okHttpClient = (We.E) this.f32490b.get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        g.a aVar = new g.a(context);
        aVar.d(new A(okHttpClient, 1));
        C7873b.a aVar2 = new C7873b.a();
        aVar2.a(new u.a(0));
        aVar.c(aVar2.e());
        return aVar.b();
    }
}
