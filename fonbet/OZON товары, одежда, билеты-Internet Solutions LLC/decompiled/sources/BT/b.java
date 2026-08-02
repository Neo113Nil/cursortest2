package BT;

import Sc.r;
import android.location.Location;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import ru.ozon.app.android.account.user.UserManagerImpl;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.checkoutgeo.location.MockLocationRepositoryImpl;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements g, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f3293b;

    public /* synthetic */ b(Function1 function1, int i11) {
        this.f3292a = i11;
        this.f3293b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f3292a) {
            case 0:
                this.f3293b.invoke(obj);
                break;
            case 1:
                this.f3293b.invoke(obj);
                break;
            case 2:
                this.f3293b.invoke(obj);
                break;
            case 3:
                this.f3293b.invoke(obj);
                break;
            case 4:
                this.f3293b.invoke(obj);
                break;
            case 5:
                this.f3293b.invoke(obj);
                break;
            case 6:
                this.f3293b.invoke(obj);
                break;
            case 7:
                this.f3293b.invoke(obj);
                break;
            case 8:
                this.f3293b.invoke(obj);
                break;
            case 9:
            case 11:
            default:
                this.f3293b.invoke(obj);
                break;
            case 10:
                this.f3293b.invoke(obj);
                break;
            case 12:
                this.f3293b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        Location requestSingleLocation$lambda$1;
        r mapToResult$lambda$2;
        AtomAction handle$lambda$1;
        switch (this.f3292a) {
            case 9:
                requestSingleLocation$lambda$1 = MockLocationRepositoryImpl.requestSingleLocation$lambda$1(this.f3293b, obj);
                return requestSingleLocation$lambda$1;
            case 10:
            default:
                handle$lambda$1 = ActionSheetEventHandler.handle$lambda$1(this.f3293b, obj);
                return handle$lambda$1;
            case 11:
                mapToResult$lambda$2 = UserManagerImpl.mapToResult$lambda$2(this.f3293b, obj);
                return mapToResult$lambda$2;
        }
    }
}
