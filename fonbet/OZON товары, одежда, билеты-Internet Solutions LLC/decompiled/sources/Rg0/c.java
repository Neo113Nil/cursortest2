package Rg0;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.s;
import Tg0.e;
import Tg0.f;
import Tg0.g;
import android.content.Intent;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.N0;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f25080a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f25081b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f25082c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f25083d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f25084e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f25085f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f25086g;

    static final class a extends AbstractC7737t implements Function0<Intent> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25088c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f25088c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Intent invoke() {
            c cVar = c.this;
            return c.c(cVar).a(this.f25088c, new b(cVar));
        }
    }

    private c() {
        throw null;
    }

    public c(String applicationId, InterfaceC4008j getProtectedAppIntentLazy, InterfaceC4008j checkCallableIntentLazy, InterfaceC4008j checkNeedShowDialogLazy, InterfaceC4008j disableDialogLazy, InterfaceC4008j setShownDialogLazy, InterfaceC4008j getFallbackIntentsUseCaseLazy) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(getProtectedAppIntentLazy, "getProtectedAppIntentLazy");
        Intrinsics.checkNotNullParameter(checkCallableIntentLazy, "checkCallableIntentLazy");
        Intrinsics.checkNotNullParameter(checkNeedShowDialogLazy, "checkNeedShowDialogLazy");
        Intrinsics.checkNotNullParameter(disableDialogLazy, "disableDialogLazy");
        Intrinsics.checkNotNullParameter(setShownDialogLazy, "setShownDialogLazy");
        Intrinsics.checkNotNullParameter(getFallbackIntentsUseCaseLazy, "getFallbackIntentsUseCaseLazy");
        this.f25080a = getProtectedAppIntentLazy;
        this.f25081b = checkCallableIntentLazy;
        this.f25082c = checkNeedShowDialogLazy;
        this.f25083d = disableDialogLazy;
        this.f25084e = setShownDialogLazy;
        this.f25085f = getFallbackIntentsUseCaseLazy;
        this.f25086g = k.b(new a(applicationId));
    }

    public static final Tg0.a a(c cVar) {
        return (Tg0.a) cVar.f25081b.getValue();
    }

    public static final Tg0.d b(c cVar) {
        return (Tg0.d) cVar.f25083d.getValue();
    }

    public static final f c(c cVar) {
        return (f) cVar.f25080a.getValue();
    }

    public final Object d(@NotNull j jVar) {
        Object f7 = C10727i.f(N0.f105411a, new Rg0.a(this, null), jVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    @NotNull
    public final List<Intent> e(@NotNull String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        return ((e) this.f25085f.getValue()).a(applicationId);
    }

    public final Intent f() {
        return (Intent) this.f25086g.getValue();
    }

    public final void g() {
        ((g) this.f25084e.getValue()).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        c cVar2;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f25092g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f25092g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dVar.f25090e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar.f25092g;
                if (i11 != 0) {
                    s.b(obj);
                    Tg0.c cVar3 = (Tg0.c) this.f25082c.getValue();
                    dVar.f25089d = this;
                    dVar.f25092g = 1;
                    obj = cVar3.a(dVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    cVar2 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar2 = dVar.f25089d;
                    s.b(obj);
                }
                return Boolean.valueOf((((Boolean) obj).booleanValue() || cVar2.f() == null) ? false : true);
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f25090e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f25092g;
        if (i11 != 0) {
        }
        return Boolean.valueOf((((Boolean) obj2).booleanValue() || cVar2.f() == null) ? false : true);
    }
}
