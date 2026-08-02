package VL;

import c1.C5721l;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import qc.o;
import ru.ozon.app.android.tabbar.data.TabConfig;
import ru.ozon.app.android.tabbar.data.TabConfigManagerImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f28451a;

    public /* synthetic */ b(Object obj) {
        this.f28451a = obj;
    }

    public void a() {
        List list;
        AbstractC7737t abstractC7737t = (AbstractC7737t) this.f28451a;
        synchronized (C5721l.D()) {
            list = C5721l.f56257h;
            C5721l.f56257h = C7714v.k0(list, abstractC7737t);
            Unit unit = Unit.f71690a;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        TabConfig loadTabConfig$lambda$7;
        loadTabConfig$lambda$7 = TabConfigManagerImpl.loadTabConfig$lambda$7((Function1) this.f28451a, obj);
        return loadTabConfig$lambda$7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(Function2 function2) {
        this.f28451a = (AbstractC7737t) function2;
    }
}
