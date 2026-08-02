package Pe;

import Sc.InterfaceC4008j;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;

/* loaded from: classes10.dex */
public final class n implements Me.f {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4008j f22297a;

    n(Function0<? extends Me.f> function0) {
        this.f22297a = Sc.k.b(function0);
    }

    private final Me.f a() {
        return (Me.f) this.f22297a.getValue();
    }

    @Override // Me.f
    public final boolean b() {
        return false;
    }

    @Override // Me.f
    public final Me.f c(int i11) {
        return a().c(i11);
    }

    @Override // Me.f
    public final int d() {
        return a().d();
    }

    @Override // Me.f
    public final String e(int i11) {
        return a().e(i11);
    }

    @Override // Me.f
    public final String f() {
        return a().f();
    }

    @Override // Me.f
    public final List<Annotation> getAnnotations() {
        return K.f71697a;
    }

    @Override // Me.f
    public final Me.m getKind() {
        return a().getKind();
    }

    @Override // Me.f
    public final boolean isInline() {
        return false;
    }
}
