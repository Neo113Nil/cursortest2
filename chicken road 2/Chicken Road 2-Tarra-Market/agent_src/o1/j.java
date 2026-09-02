package o1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class j extends j1.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6299b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f6300c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f6301d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r rVar, Object[] objArr, int i2, long j2) {
        super("OkHttp Window Update %s stream %d", objArr);
        this.f6301d = rVar;
        this.f6299b = i2;
        this.f6300c = j2;
    }

    @Override // j1.a
    public final void a() {
        r rVar = this.f6301d;
        try {
            rVar.f6336r.m(this.f6299b, this.f6300c);
        } catch (IOException unused) {
            rVar.b();
        }
    }
}
