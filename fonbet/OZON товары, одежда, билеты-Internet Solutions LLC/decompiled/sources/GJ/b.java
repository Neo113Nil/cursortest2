package GJ;

import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.UniversalObjectGridOneViewHolder;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements g, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f9832b;

    public /* synthetic */ b(Function1 function1, int i11) {
        this.f9831a = i11;
        this.f9832b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f9831a) {
            case 0:
                this.f9832b.invoke(obj);
                break;
            case 1:
            default:
                this.f9832b.invoke(obj);
                break;
            case 2:
                this.f9832b.invoke(obj);
                break;
            case 3:
                this.f9832b.invoke(obj);
                break;
            case 4:
                this.f9832b.invoke(obj);
                break;
            case 5:
                this.f9832b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        Integer startAutoSwipe$lambda$7$lambda$5;
        startAutoSwipe$lambda$7$lambda$5 = UniversalObjectGridOneViewHolder.startAutoSwipe$lambda$7$lambda$5(this.f9832b, obj);
        return startAutoSwipe$lambda$7$lambda$5;
    }
}
