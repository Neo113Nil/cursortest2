package Kr;

import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class e implements qc.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f16039b;

    public /* synthetic */ e(Function1 function1, int i11) {
        this.f16038a = i11;
        this.f16039b = function1;
    }

    @Override // qc.g
    public final void accept(Object obj) {
        switch (this.f16038a) {
            case 0:
                this.f16039b.invoke(obj);
                break;
            case 1:
                this.f16039b.invoke(obj);
                break;
            case 2:
                this.f16039b.invoke(obj);
                break;
            default:
                this.f16039b.invoke(obj);
                break;
        }
    }
}
