package E20;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d implements z0.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f7389a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f7390b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f7391c;

    d(a aVar, String str, String str2) {
        this.f7389a = aVar;
        this.f7390b = str;
        this.f7391c = str2;
    }

    @Override // androidx.lifecycle.z0.b
    public final <T extends w0> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return new N20.f(new N20.a(), this.f7390b, this.f7391c, a.k(this.f7389a));
    }
}
