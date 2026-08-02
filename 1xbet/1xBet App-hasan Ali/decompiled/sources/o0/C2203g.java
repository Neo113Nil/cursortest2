package o0;

import android.graphics.PathMeasure;
import i0.C2004i;
import i4.InterfaceC2015a;

/* renamed from: o0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2203g extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: m, reason: collision with root package name */
    public static final C2203g f18549m = new C2203g(0, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C2203g f18550n = new C2203g(0, 1);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f18551l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2203g(int i, int i5) {
        super(i);
        this.f18551l = i5;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        switch (this.f18551l) {
            case 0:
                return new C2004i(new PathMeasure());
            default:
                return W3.o.f6046a;
        }
    }
}
