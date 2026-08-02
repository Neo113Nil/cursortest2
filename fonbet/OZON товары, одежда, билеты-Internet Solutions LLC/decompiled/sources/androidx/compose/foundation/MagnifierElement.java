package androidx.compose.foundation;

import D1.AbstractC2794c0;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n0.C8370K;
import n0.Y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/MagnifierElement;", "LD1/c0;", "Ln0/K;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MagnifierElement extends AbstractC2794c0<C8370K> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f38864a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7737t f38865b;

    /* renamed from: c, reason: collision with root package name */
    private final float f38866c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f38867d;

    /* renamed from: e, reason: collision with root package name */
    private final long f38868e;

    /* renamed from: f, reason: collision with root package name */
    private final float f38869f;

    /* renamed from: g, reason: collision with root package name */
    private final float f38870g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f38871h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Y f38872i;

    private MagnifierElement() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MagnifierElement(Function1 function1, Function1 function12, Y y11) {
        this.f38864a = (AbstractC7737t) function1;
        this.f38865b = (AbstractC7737t) function12;
        this.f38866c = Float.NaN;
        this.f38867d = true;
        this.f38868e = 9205357640488583168L;
        this.f38869f = Float.NaN;
        this.f38870g = Float.NaN;
        this.f38871h = true;
        this.f38872i = y11;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final C8370K getF41119a() {
        ?? r62 = this.f38864a;
        ?? r72 = this.f38865b;
        float f7 = this.f38869f;
        float f11 = this.f38870g;
        float f12 = this.f38866c;
        boolean z11 = this.f38867d;
        return new C8370K(f12, f7, f11, this.f38868e, r62, r72, this.f38872i, z11, this.f38871h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MagnifierElement) {
            MagnifierElement magnifierElement = (MagnifierElement) obj;
            if (this.f38864a == magnifierElement.f38864a && this.f38866c == magnifierElement.f38866c && this.f38867d == magnifierElement.f38867d && this.f38868e == magnifierElement.f38868e && Z1.h.b(this.f38869f, magnifierElement.f38869f) && Z1.h.b(this.f38870g, magnifierElement.f38870g) && this.f38871h == magnifierElement.f38871h && this.f38865b == magnifierElement.f38865b && Intrinsics.d(this.f38872i, magnifierElement.f38872i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a11 = C3532b.a(Pk0.b.a(this.f38870g, Pk0.b.a(this.f38869f, Pk0.c.a(C3532b.a(Pk0.b.a(this.f38866c, this.f38864a.hashCode() * 961, 31), 31, this.f38867d), 31, this.f38868e), 31), 31), 31, this.f38871h);
        AbstractC7737t abstractC7737t = this.f38865b;
        return this.f38872i.hashCode() + ((a11 + (abstractC7737t != null ? abstractC7737t.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // D1.AbstractC2794c0
    public final void update(C8370K c8370k) {
        ?? r62 = this.f38864a;
        ?? r72 = this.f38865b;
        Y y11 = this.f38872i;
        float f7 = this.f38866c;
        boolean z11 = this.f38867d;
        c8370k.P1(f7, this.f38869f, this.f38870g, this.f38868e, r62, r72, y11, z11, this.f38871h);
    }
}
