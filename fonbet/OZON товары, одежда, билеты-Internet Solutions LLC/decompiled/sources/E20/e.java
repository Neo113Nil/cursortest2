package E20;

import C.D;
import O20.m;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e implements z0.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f7392a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f7393b;

    e(a aVar, String str) {
        this.f7392a = aVar;
        this.f7393b = str;
    }

    @Override // androidx.lifecycle.z0.b
    public final <T extends w0> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return new m(new D(), a.k(this.f7392a), this.f7393b);
    }
}
