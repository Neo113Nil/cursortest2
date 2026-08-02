package Fn;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.domain.ResultsHeaderRepositoryImpl;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.presentation.ShareListVO;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoriteComposerActionExecutor;
import ru.ozon.app.android.partpayment.formpage.data.photo.PhotoRepository;
import ru.ozon.app.android.partpayment.formpage.view.vo.PassFormVO;
import ru.ozon.app.android.session.userAdultModalMobile.data.AdultConfirmationRepository;
import ru.ozon.app.android.session.userAdultModalMobile.data.models.SetBirthdayResponse;
import ru.ozon.app.android.session.userAdultModalMobile.presentation.AdultConfirmationViewModel;
import ru.ozon.app.android.session.userAdultModalMobile.presentation.models.AdultConfirmationAction;

/* renamed from: Fn.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C3055d implements g, OnSuccessListener, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f9536b;

    public /* synthetic */ C3055d(Function1 function1, int i11) {
        this.f9535a = i11;
        this.f9536b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f9535a) {
            case 0:
                this.f9536b.invoke(obj);
                break;
            case 1:
                this.f9536b.invoke(obj);
                break;
            case 2:
            case 3:
            case 4:
            case 7:
            case 10:
            default:
                this.f9536b.invoke(obj);
                break;
            case 5:
                this.f9536b.invoke(obj);
                break;
            case 6:
                this.f9536b.invoke(obj);
                break;
            case 8:
                this.f9536b.invoke(obj);
                break;
            case 9:
                this.f9536b.invoke(obj);
                break;
            case 11:
                this.f9536b.invoke(obj);
                break;
            case 12:
                this.f9536b.invoke(obj);
                break;
            case 13:
                this.f9536b.invoke(obj);
                break;
            case 14:
                this.f9536b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        SetBirthdayResponse birthday$lambda$0;
        AdultConfirmationAction processSetBirthdayAction$lambda$3;
        PassFormVO uploadPhoto$lambda$0;
        Long addToFavorite$lambda$0;
        ShareListVO shareList$lambda$0;
        switch (this.f9535a) {
            case 3:
                birthday$lambda$0 = AdultConfirmationRepository.setBirthday$lambda$0(this.f9536b, obj);
                return birthday$lambda$0;
            case 4:
                processSetBirthdayAction$lambda$3 = AdultConfirmationViewModel.processSetBirthdayAction$lambda$3(this.f9536b, obj);
                return processSetBirthdayAction$lambda$3;
            case 7:
                uploadPhoto$lambda$0 = PhotoRepository.uploadPhoto$lambda$0(this.f9536b, obj);
                return uploadPhoto$lambda$0;
            case 10:
                addToFavorite$lambda$0 = FavoriteComposerActionExecutor.addToFavorite$lambda$0(this.f9536b, obj);
                return addToFavorite$lambda$0;
            default:
                shareList$lambda$0 = ResultsHeaderRepositoryImpl.shareList$lambda$0(this.f9536b, obj);
                return shareList$lambda$0;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        CredentialProviderPlayServicesImpl.onClearCredential$lambda$0(this.f9536b, obj);
    }
}
