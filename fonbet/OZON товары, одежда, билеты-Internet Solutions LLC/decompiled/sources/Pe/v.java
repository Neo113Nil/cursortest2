package Pe;

import Le.InterfaceC3583a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class v extends g {

    @NotNull
    public static final a Companion = new a(0);

    public static final class a {
        private a() {
        }

        @NotNull
        public final InterfaceC3583a<v> serializer() {
            return w.f22310a;
        }

        public /* synthetic */ a(int i11) {
            this();
        }
    }

    public /* synthetic */ v(int i11) {
        this();
    }

    @NotNull
    public abstract String b();

    @NotNull
    public String toString() {
        return b();
    }

    private v() {
        super(0);
    }
}
