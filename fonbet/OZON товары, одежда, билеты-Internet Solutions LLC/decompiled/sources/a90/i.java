package a90;

import a90.C4963a;
import android.content.Context;
import android.util.Log;
import b90.C5594a;
import b90.C5596c;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i implements Jb.e<C5596c> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f36467a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<C5594a> f36468b;

    /* renamed from: c, reason: collision with root package name */
    private final j f36469c;

    public i(Pc.a aVar, Pc.a aVar2, j jVar) {
        this.f36467a = aVar;
        this.f36468b = aVar2;
        this.f36469c = jVar;
    }

    @Override // Pc.a
    public final Object get() {
        Context app = (Context) ((C4963a.d) this.f36467a).get();
        C5594a externalOkHttpSettings = (C5594a) ((C4963a.b) this.f36468b).get();
        Set interceptors = (Set) this.f36469c.get();
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(externalOkHttpSettings, "externalOkHttpSettings");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Log.d("ESK_FLOW", " provideFintechOkHttpClient interceptors.size: " + interceptors.size());
        return new C5596c(app, interceptors, externalOkHttpSettings, new C4970h());
    }
}
