package OJ;

import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import ru.ozon.app.android.storage.auth.AuthStateStorageImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements o, g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f20134a;

    public /* synthetic */ b(Function1 function1) {
        this.f20134a = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        this.f20134a.invoke(obj);
    }

    @Override // qc.o
    public Object apply(Object obj) {
        Boolean createSubject$lambda$1;
        createSubject$lambda$1 = AuthStateStorageImpl.createSubject$lambda$1(this.f20134a, obj);
        return createSubject$lambda$1;
    }
}
