package androidx.compose.foundation.layout;

import D1.AbstractC2794c0;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u0.EnumC9900i;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "LD1/c0;", "Landroidx/compose/foundation/layout/h0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class WrapContentElement extends AbstractC2794c0<h0> {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f39422e = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final EnumC9900i f39423a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39424b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f39425c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f39426d;

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(@NotNull EnumC9900i enumC9900i, boolean z11, @NotNull Function2 function2, @NotNull Object obj) {
        this.f39423a = enumC9900i;
        this.f39424b = z11;
        this.f39425c = (AbstractC7737t) function2;
        this.f39426d = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final h0 getF41119a() {
        return new h0(this.f39423a, this.f39424b, this.f39425c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f39423a == wrapContentElement.f39423a && this.f39424b == wrapContentElement.f39424b && Intrinsics.d(this.f39426d, wrapContentElement.f39426d);
    }

    public final int hashCode() {
        return this.f39426d.hashCode() + C3532b.a(this.f39423a.hashCode() * 31, 31, this.f39424b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
    @Override // D1.AbstractC2794c0
    public final void update(h0 h0Var) {
        h0 h0Var2 = h0Var;
        h0Var2.K1(this.f39423a);
        h0Var2.L1(this.f39424b);
        h0Var2.J1(this.f39425c);
    }
}
