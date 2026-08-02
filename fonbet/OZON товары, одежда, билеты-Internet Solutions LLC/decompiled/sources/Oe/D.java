package Oe;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class D<Key, Value, Collection, Builder extends Map<Key, Value>> extends AbstractC3682a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Z f20240a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Pe.m f20241b;

    public D(int i11) {
        Z z11 = Z.f20279a;
        Pe.m mVar = Pe.m.f22295a;
        this.f20240a = z11;
        this.f20241b = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Le.f
    public final void c(@NotNull Ne.a encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        e(obj);
        C3705y c3705y = (C3705y) this;
        Me.f b11 = c3705y.b();
        Ne.b C11 = encoder.C(b11);
        Iterator<Map.Entry<? extends Key, ? extends Value>> d11 = d(obj);
        int i11 = 0;
        while (d11.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = d11.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i12 = i11 + 1;
            C11.u(c3705y.b(), i11, this.f20240a, key);
            i11 += 2;
            C11.u(c3705y.b(), i12, this.f20241b, value);
        }
        C11.B(b11);
    }
}
