package C;

import C.s0;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.b;
import java.util.concurrent.CancellationException;

/* loaded from: classes8.dex */
final class r0 implements I.c<Surface> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.common.util.concurrent.m f4219a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b.a f4220b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f4221c;

    r0(com.google.common.util.concurrent.m mVar, b.a aVar, String str) {
        this.f4219a = mVar;
        this.f4220b = aVar;
        this.f4221c = str;
    }

    @Override // I.c
    public final void onFailure(@NonNull Throwable th2) {
        boolean z11 = th2 instanceof CancellationException;
        b.a aVar = this.f4220b;
        if (z11) {
            x2.i.f(null, aVar.e(new s0.b(o0.c(new StringBuilder(), this.f4221c, " cancelled."), th2)));
        } else {
            aVar.c(null);
        }
    }

    @Override // I.c
    public final void onSuccess(Surface surface) {
        I.k.j(this.f4220b, this.f4219a);
    }
}
