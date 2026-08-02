package c0;

import C.S;
import W.AbstractC4830a;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5086c0;
import androidx.camera.core.impl.Y0;
import d0.AbstractC5990a;

/* renamed from: c0.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5695c implements x2.j<AbstractC5990a> {

    /* renamed from: a, reason: collision with root package name */
    private final String f56131a;

    /* renamed from: b, reason: collision with root package name */
    private final Y0 f56132b;

    /* renamed from: c, reason: collision with root package name */
    private final int f56133c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC4830a f56134d;

    /* renamed from: e, reason: collision with root package name */
    private final Z.a f56135e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC5086c0.a f56136f;

    public C5695c(@NonNull String str, int i11, @NonNull Y0 y02, @NonNull AbstractC4830a abstractC4830a, @NonNull Z.a aVar, @NonNull InterfaceC5086c0.a aVar2) {
        this.f56131a = str;
        this.f56133c = i11;
        this.f56132b = y02;
        this.f56134d = abstractC4830a;
        this.f56135e = aVar;
        this.f56136f = aVar2;
    }

    @Override // x2.j
    @NonNull
    public final AbstractC5990a get() {
        S.a("AudioEncAdPrflRslvr", "Using resolved AUDIO bitrate from AudioProfile");
        Range<Integer> a11 = this.f56134d.a();
        InterfaceC5086c0.a aVar = this.f56136f;
        int b11 = aVar.b();
        Z.a aVar2 = this.f56135e;
        int d11 = C5694b.d(b11, aVar2.e(), aVar.c(), aVar2.f(), aVar.g(), a11);
        AbstractC5990a.AbstractC0936a d12 = AbstractC5990a.d();
        d12.f(this.f56131a);
        d12.g(this.f56133c);
        d12.e(this.f56132b);
        d12.d(aVar2.e());
        d12.h(aVar2.f());
        d12.c(d11);
        return d12.b();
    }
}
