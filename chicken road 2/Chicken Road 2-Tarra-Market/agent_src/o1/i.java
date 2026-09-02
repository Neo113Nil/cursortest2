package o1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class i extends j1.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6297c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f6298d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, Object[] objArr, int i2, int i3) {
        super("OkHttp %s stream %d", objArr);
        this.f6298d = rVar;
        this.f6296b = i2;
        this.f6297c = i3;
    }

    @Override // j1.a
    public final void a() {
        r rVar = this.f6298d;
        try {
            rVar.f6336r.l(this.f6296b, this.f6297c);
        } catch (IOException unused) {
            rVar.b();
        }
    }
}
