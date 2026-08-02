package H10;

import C.o0;
import ed.InterfaceC6346b;
import h10.AbstractC6779a;
import i10.C6997c;
import i10.InterfaceC6995a;
import i10.j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;

/* loaded from: classes7.dex */
public final class a extends AbstractC6779a<l, C0216a> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private String f10501c;

    @InterfaceC6346b
    /* renamed from: H10.a$a, reason: collision with other inner class name */
    public static final class C0216a implements InterfaceC6995a {

        /* renamed from: a, reason: collision with root package name */
        private final String f10502a;

        private /* synthetic */ C0216a(String str) {
            this.f10502a = str;
        }

        public static final /* synthetic */ C0216a a(String str) {
            return new C0216a(str);
        }

        public final /* synthetic */ String b() {
            return this.f10502a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C0216a) {
                return Intrinsics.d(this.f10502a, ((C0216a) obj).f10502a);
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f10502a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return o0.c(new StringBuilder("ComposerRootLocator(pageRootLocator="), this.f10502a, ")");
        }
    }

    public a() {
        super(C0216a.a(null));
        this.f10501c = null;
    }

    @Override // h10.AbstractC6779a
    public final C0216a d(A00.a event, C6997c<l> state, C0216a c0216a) {
        boolean z11;
        String f7;
        T00.a f11;
        T00.e h11;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(state, "state");
        String str = null;
        if (Intrinsics.d(this.f10501c, null)) {
            j o11 = state.o();
            if (o11.c() == null) {
                i10.e d11 = o11.d();
                if ((d11 != null ? d11.b() : null) == null) {
                    z11 = false;
                    i10.e d12 = o11.d();
                    f7 = (d12 != null || (f11 = d12.f()) == null || (h11 = f11.h()) == null) ? null : h11.f();
                    if (!z11 && f7 == null) {
                        str = "composerErrorView";
                    } else if (f7 != null && !h.K(f7)) {
                        this.f10501c = f7;
                        str = f7;
                    }
                }
            }
            z11 = true;
            i10.e d122 = o11.d();
            if (d122 != null) {
            }
            if (!z11) {
            }
            if (f7 != null) {
                this.f10501c = f7;
                str = f7;
            }
        } else {
            str = this.f10501c;
        }
        return C0216a.a(str);
    }
}
