package H3;

import j3.C7272n;
import java.util.Objects;
import k4.j;
import k4.o;
import l4.C7865a;
import l4.C7867c;

/* loaded from: classes.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f10528a = new a();

    final class a implements f {

        /* renamed from: b, reason: collision with root package name */
        private final k4.e f10529b = new k4.e();

        a() {
        }

        public final j a(C7272n c7272n) {
            int i11;
            String str = c7272n.f69127o;
            if (str != null) {
                i11 = c7272n.f69107L;
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new C7865a(str, i11);
                    case "application/cea-708":
                        return new C7867c(i11, c7272n.f69130r);
                }
            }
            k4.e eVar = this.f10529b;
            if (!eVar.e(c7272n)) {
                throw new IllegalArgumentException(Nk.a.b("Attempted to create decoder for unsupported MIME type: ", str));
            }
            o b11 = eVar.b(c7272n);
            b11.getClass().getSimpleName().concat("Decoder");
            return new b(b11);
        }

        public final boolean b(C7272n c7272n) {
            String str = c7272n.f69127o;
            return this.f10529b.e(c7272n) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
        }
    }
}
