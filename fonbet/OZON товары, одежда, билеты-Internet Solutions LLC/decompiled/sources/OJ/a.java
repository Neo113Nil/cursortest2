package OJ;

import kotlin.jvm.functions.Function1;
import qc.g;
import qc.q;
import ru.ozon.app.android.storage.auth.AuthStateStorageImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements q, g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f20133b;

    public /* synthetic */ a(Function1 function1, int i11) {
        this.f20132a = i11;
        this.f20133b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f20132a) {
            case 1:
                this.f20133b.invoke(obj);
                break;
            default:
                this.f20133b.invoke(obj);
                break;
        }
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean createSubject$lambda$0;
        createSubject$lambda$0 = AuthStateStorageImpl.createSubject$lambda$0(this.f20133b, obj);
        return createSubject$lambda$0;
    }
}
