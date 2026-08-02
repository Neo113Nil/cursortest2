package NZ;

import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sZ.AbstractC9643a;
import tZ.C9786a;

/* loaded from: classes3.dex */
public class f extends EZ.g {

    @NotNull
    private final ComponentCallbacksC5392m fragment;
    private final int hostId;
    private final j pathConfigOwner;

    static final class a extends AbstractC7737t implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            f fVar = f.this;
            fVar.getFragmentManager().R0(fVar.getFragmentManager().k0(0).getId(), 0);
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EZ.e<?> f18877c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ pZ.g f18878d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f18879e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EZ.e eVar, pZ.g gVar, int i11) {
            super(0);
            this.f18877c = eVar;
            this.f18878d = gVar;
            this.f18879e = i11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            f fVar = f.this;
            fVar.fragment.getChildFragmentManager().S0();
            fVar.redirect(this.f18877c.e(this.f18878d.getRedirect$compass_release()), this.f18879e);
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function0<Unit> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            f.this.getFragmentManager().S0();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(@NotNull ComponentCallbacksC5392m fragment, int i11, int i12, j jVar) {
        super(r1, Integer.valueOf(i11), r0, fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        G childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        r requireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.fragment = fragment;
        this.hostId = i12;
        this.pathConfigOwner = jVar;
    }

    private final EZ.e<?> wrapResponse(EZ.e<?> eVar) {
        Integer num;
        GZ.j c11 = eVar.c();
        if (c11 == null) {
            return eVar;
        }
        String uri = c11.b().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        String b11 = PZ.a.b(uri, true);
        j jVar = this.pathConfigOwner;
        return (jVar == null || (num = jVar.getPathConfig().get(b11)) == null) ? eVar : eVar.e(wrapDestination(num.intValue(), eVar.b()));
    }

    public final boolean canHandleBackStack() {
        return getFragmentManager().l0() > 1;
    }

    public final boolean clearBackStack() {
        boolean canHandleBackStack = canHandleBackStack();
        if (canHandleBackStack) {
            safeTransaction(new a());
        }
        return canHandleBackStack;
    }

    @Override // EZ.g
    public void navigate(@NotNull EZ.e<?> response, int i11) {
        Intrinsics.checkNotNullParameter(response, "response");
        Object b11 = response.b();
        if (b11 instanceof pZ.g) {
            if (canHandleBackStack()) {
                super.navigate(response, i11);
                return;
            } else {
                safeTransaction(new b(response, (pZ.g) b11, i11));
                return;
            }
        }
        int i12 = 0;
        if (b11 instanceof OZ.e) {
            OZ.e eVar = (OZ.e) b11;
            if (this.hostId != eVar.b()) {
                if (getFragmentManager().l0() == 0) {
                    next(response.e(new OZ.c(i12)), i11);
                }
                next(response, i11);
                return;
            } else {
                pZ.f a11 = eVar.a();
                if (a11 != null) {
                    super.navigate(response.e(a11), i11);
                    return;
                }
                return;
            }
        }
        if (b11 instanceof C9786a) {
            if (getFragmentManager().l0() <= 1) {
                next(response.e(new OZ.c(i12)), i11);
                return;
            } else {
                safeTransaction(new c());
                return;
            }
        }
        if (b11 instanceof AbstractC9643a) {
            super.navigate(wrapResponse(response), i11);
        } else {
            super.navigate(response, i11);
        }
    }

    @NotNull
    protected pZ.f wrapDestination(int i11, @NotNull pZ.f destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return i11 != this.hostId ? new OZ.e(i11, destination) : destination instanceof sZ.c ? sZ.c.copy$default((sZ.c) destination, null, null, null, null, null, Boolean.TRUE, Boolean.FALSE, 31, null) : destination;
    }
}
