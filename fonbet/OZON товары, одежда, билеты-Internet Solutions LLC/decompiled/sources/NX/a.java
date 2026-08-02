package NX;

import kotlin.jvm.functions.Function1;
import qc.g;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18848a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f18849b;

    public /* synthetic */ a(Function1 function1, int i11) {
        this.f18848a = i11;
        this.f18849b = function1;
    }

    @Override // qc.g
    public final void accept(Object obj) {
        switch (this.f18848a) {
            case 0:
                this.f18849b.invoke(obj);
                break;
            case 1:
                this.f18849b.invoke(obj);
                break;
            case 2:
                this.f18849b.invoke(obj);
                break;
            case 3:
                this.f18849b.invoke(obj);
                break;
            case 4:
                this.f18849b.invoke(obj);
                break;
            default:
                this.f18849b.invoke(obj);
                break;
        }
    }
}
