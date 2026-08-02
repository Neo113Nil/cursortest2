package R5;

import f6.C1113f;
import f6.C1116i;
import g6.AbstractC1155d;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class Q implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6096b;

    public /* synthetic */ Q(Object obj, int i7) {
        this.f6095a = i7;
        this.f6096b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f6095a) {
            case 0:
                ((Function1) this.f6096b).invoke(new S(((C1113f) obj).f13003a));
                return C1116i.f13008a;
            default:
                return obj == ((AbstractC1155d) this.f6096b) ? "(this Collection)" : String.valueOf(obj);
        }
    }
}
