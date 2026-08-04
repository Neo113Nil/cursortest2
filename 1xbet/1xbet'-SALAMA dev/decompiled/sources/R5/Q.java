package R5;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6096b;

    public /* synthetic */ Q(Object obj, int i7) {
        this.f6095a = i7;
        this.f6096b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f6095a) {
            case 0:
                ((Function1) this.f6096b).invoke(new S(((p044f6.f) obj).f13009a));
                return p044f6.i.f13014a;
            default:
                return obj == ((p050g6.d) this.f6096b) ? "(this Collection)" : String.valueOf(obj);
        }
    }
}
