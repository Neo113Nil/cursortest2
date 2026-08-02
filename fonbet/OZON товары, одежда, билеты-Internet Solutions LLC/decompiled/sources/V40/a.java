package V40;

import kotlin.jvm.functions.Function0;
import l80.f;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28081b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f28080a = i11;
        this.f28081b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj = this.f28081b;
        switch (this.f28080a) {
            case 0:
                return b.a((b) obj);
            default:
                int i11 = f.f72971Z;
                return ((f) obj).J();
        }
    }
}
