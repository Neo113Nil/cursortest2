package V5;

import Z5.p;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;

/* loaded from: classes.dex */
final class z implements d.a<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p.a f28320a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ A f28321b;

    z(A a11, p.a aVar) {
        this.f28321b = a11;
        this.f28320a = aVar;
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void a(Object obj) {
        A a11 = this.f28321b;
        p.a<?> aVar = this.f28320a;
        if (a11.e(aVar)) {
            a11.f(aVar, obj);
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void onLoadFailed(@NonNull Exception exc) {
        A a11 = this.f28321b;
        p.a<?> aVar = this.f28320a;
        if (a11.e(aVar)) {
            a11.g(aVar, exc);
        }
    }
}
