package Py;

import kotlin.jvm.functions.Function1;
import qc.g;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f22721b;

    public /* synthetic */ a(Function1 function1, int i11) {
        this.f22720a = i11;
        this.f22721b = function1;
    }

    @Override // qc.g
    public final void accept(Object obj) {
        switch (this.f22720a) {
            case 0:
                this.f22721b.invoke(obj);
                break;
            default:
                this.f22721b.invoke(obj);
                break;
        }
    }
}
