package AA;

import io.reactivex.C;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import qc.q;
import ru.ozon.app.android.cabinet.profiledatasettings.domain.ProfileSettingsInteractorImpl;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.presentation.AddLegalAddressMobileViewHolder;
import ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchViewModelImpl;

/* loaded from: classes12.dex */
public final /* synthetic */ class d implements g, q, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f593b;

    public /* synthetic */ d(Function1 function1, int i11) {
        this.f592a = i11;
        this.f593b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f592a) {
            case 0:
                this.f593b.invoke(obj);
                break;
            case 1:
                this.f593b.invoke(obj);
                break;
            case 2:
                this.f593b.invoke(obj);
                break;
            case 3:
            case 4:
            case 7:
            default:
                this.f593b.invoke(obj);
                break;
            case 5:
                this.f593b.invoke(obj);
                break;
            case 6:
                this.f593b.invoke(obj);
                break;
            case 8:
                this.f593b.invoke(obj);
                break;
            case 9:
                this.f593b.invoke(obj);
                break;
            case 10:
                this.f593b.invoke(obj);
                break;
            case 11:
                this.f593b.invoke(obj);
                break;
            case 12:
                this.f593b.invoke(obj);
                break;
            case 13:
                this.f593b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        C updateUserBirthday$lambda$0;
        updateUserBirthday$lambda$0 = ProfileSettingsInteractorImpl.updateUserBirthday$lambda$0(this.f593b, obj);
        return updateUserBirthday$lambda$0;
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean bindInitial$lambda$1;
        boolean checkAddress$lambda$3;
        switch (this.f592a) {
            case 3:
                bindInitial$lambda$1 = AddressSearchViewModelImpl.bindInitial$lambda$1(this.f593b, obj);
                return bindInitial$lambda$1;
            default:
                checkAddress$lambda$3 = AddLegalAddressMobileViewHolder.checkAddress$lambda$3(this.f593b, obj);
                return checkAddress$lambda$3;
        }
    }
}
