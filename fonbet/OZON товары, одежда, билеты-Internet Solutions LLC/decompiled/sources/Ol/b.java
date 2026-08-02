package Ol;

import io.reactivex.u;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import ru.ozon.app.android.tabbar.data.TabConfigManagerImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements g, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20457a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f20458b;

    public /* synthetic */ b(Function1 function1, int i11) {
        this.f20457a = i11;
        this.f20458b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f20457a) {
            case 0:
                this.f20458b.invoke(obj);
                break;
            default:
                this.f20458b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        u _init_$lambda$0;
        _init_$lambda$0 = TabConfigManagerImpl._init_$lambda$0(this.f20458b, obj);
        return _init_$lambda$0;
    }
}
