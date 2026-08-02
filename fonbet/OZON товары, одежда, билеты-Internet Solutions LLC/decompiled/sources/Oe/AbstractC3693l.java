package Oe;

import Le.InterfaceC3583a;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Oe.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC3693l<Element, Collection, Builder> extends AbstractC3682a<Element, Collection, Builder> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC3583a<Element> f20307a;

    public AbstractC3693l(InterfaceC3583a interfaceC3583a) {
        this.f20307a = interfaceC3583a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Le.f
    public void c(@NotNull Ne.a encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int e11 = e(obj);
        Me.f b11 = b();
        Ne.b C11 = encoder.C(b11);
        Iterator<Element> d11 = d(obj);
        for (int i11 = 0; i11 < e11; i11++) {
            C11.u(b(), i11, this.f20307a, d11.next());
        }
        C11.B(b11);
    }
}
