package Gc;

import Kc.C3493a;
import hg.InterfaceC6950c;
import io.reactivex.A;
import io.reactivex.w;
import nc.InterfaceC8487b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class f implements io.reactivex.j<Object>, w<Object>, io.reactivex.m<Object>, A<Object>, io.reactivex.d, InterfaceC6950c, InterfaceC8487b {
    private static final /* synthetic */ f[] $VALUES;
    public static final f INSTANCE;

    static {
        f fVar = new f("INSTANCE", 0);
        INSTANCE = fVar;
        $VALUES = new f[]{fVar};
    }

    private f() {
        throw null;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    @Override // hg.InterfaceC6950c
    public final void cancel() {
    }

    @Override // hg.InterfaceC6949b
    public final void d(InterfaceC6950c interfaceC6950c) {
        interfaceC6950c.cancel();
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return true;
    }

    @Override // hg.InterfaceC6950c
    public final void n(long j11) {
    }

    @Override // hg.InterfaceC6949b
    public final void onComplete() {
    }

    @Override // hg.InterfaceC6949b
    public final void onError(Throwable th2) {
        C3493a.f(th2);
    }

    @Override // hg.InterfaceC6949b
    public final void onNext(Object obj) {
    }

    @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        interfaceC8487b.dispose();
    }

    @Override // io.reactivex.m, io.reactivex.A
    public final void onSuccess(Object obj) {
    }
}
