package androidx.activity;

import androidx.fragment.app.H;
import f6.C1116i;
import g6.C1157f;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class s extends t6.i implements s6.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f8126b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(A a2, int i7) {
        super(0);
        this.f8125a = i7;
        this.f8126b = a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    @Override // s6.a
    public final Object invoke() {
        H h6;
        switch (this.f8125a) {
            case 0:
                this.f8126b.a();
                break;
            case 1:
                A a2 = this.f8126b;
                H h7 = a2.f8082c;
                if (h7 == null) {
                    C1157f c1157f = a2.f8081b;
                    ListIterator listIterator = c1157f.listIterator(c1157f.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            h6 = listIterator.previous();
                            if (((H) h6).f9356a) {
                            }
                        } else {
                            h6 = 0;
                        }
                    }
                    h7 = h6;
                }
                a2.f8082c = null;
                if (h7 != null) {
                    h7.a();
                }
                break;
            default:
                this.f8126b.a();
                break;
        }
        return C1116i.f13008a;
    }
}
