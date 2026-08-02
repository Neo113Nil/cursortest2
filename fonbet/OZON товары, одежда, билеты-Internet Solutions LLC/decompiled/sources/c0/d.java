package c0;

import C.S;
import W.AbstractC4830a;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Y0;
import d0.AbstractC5990a;

/* loaded from: classes8.dex */
public final class d implements x2.j<AbstractC5990a> {

    /* renamed from: a, reason: collision with root package name */
    private final String f56137a;

    /* renamed from: b, reason: collision with root package name */
    private final int f56138b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC4830a f56139c;

    /* renamed from: d, reason: collision with root package name */
    private final Z.a f56140d;

    /* renamed from: e, reason: collision with root package name */
    private final Y0 f56141e;

    public d(@NonNull String str, int i11, @NonNull Y0 y02, @NonNull AbstractC4830a abstractC4830a, @NonNull Z.a aVar) {
        this.f56137a = str;
        this.f56138b = i11;
        this.f56141e = y02;
        this.f56139c = abstractC4830a;
        this.f56140d = aVar;
    }

    @Override // x2.j
    @NonNull
    public final AbstractC5990a get() {
        Range<Integer> a11 = this.f56139c.a();
        S.a("AudioEncCfgDefaultRslvr", "Using fallback AUDIO bitrate");
        Z.a aVar = this.f56140d;
        int d11 = C5694b.d(156000, aVar.e(), 2, aVar.f(), 48000, a11);
        AbstractC5990a.AbstractC0936a d12 = AbstractC5990a.d();
        d12.f(this.f56137a);
        d12.g(this.f56138b);
        d12.e(this.f56141e);
        d12.d(aVar.e());
        d12.h(aVar.f());
        d12.c(d11);
        return d12.b();
    }
}
