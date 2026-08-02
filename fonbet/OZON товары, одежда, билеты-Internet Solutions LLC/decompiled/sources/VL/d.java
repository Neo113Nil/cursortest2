package VL;

import kotlin.jvm.functions.Function1;
import qc.g;

/* loaded from: classes7.dex */
public final /* synthetic */ class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f28455b;

    public /* synthetic */ d(Function1 function1, int i11) {
        this.f28454a = i11;
        this.f28455b = function1;
    }

    @Override // qc.g
    public final void accept(Object obj) {
        switch (this.f28454a) {
            case 0:
                this.f28455b.invoke(obj);
                break;
            default:
                this.f28455b.invoke(obj);
                break;
        }
    }
}
