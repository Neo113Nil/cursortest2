package AF;

import io.reactivex.C;
import kotlin.jvm.functions.Function1;
import qc.o;
import ru.ozon.app.android.cabinet.profileAvatar.presentation.viewmodel.AvatarViewModel;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.domain.ResultsHeaderRepositoryImpl;
import ru.ozon.app.android.mediaupload.video.validation.VideoValidationEvent;
import ru.ozon.app.android.mediaupload.video.validation.VideoValidationWebSocket;

/* loaded from: classes13.dex */
public final /* synthetic */ class d implements qc.g, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f613b;

    public /* synthetic */ d(Function1 function1, int i11) {
        this.f612a = i11;
        this.f613b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f612a) {
            case 0:
                this.f613b.invoke(obj);
                break;
            case 1:
                this.f613b.invoke(obj);
                break;
            case 2:
                this.f613b.invoke(obj);
                break;
            case 3:
                this.f613b.invoke(obj);
                break;
            case 4:
                this.f613b.invoke(obj);
                break;
            case 5:
            default:
                this.f613b.invoke(obj);
                break;
            case 6:
                this.f613b.invoke(obj);
                break;
            case 7:
                this.f613b.invoke(obj);
                break;
            case 8:
                this.f613b.invoke(obj);
                break;
            case 9:
                this.f613b.invoke(obj);
                break;
            case 10:
                this.f613b.invoke(obj);
                break;
            case 11:
                this.f613b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        String uploadAvatar$lambda$4;
        VideoValidationEvent startValidation$lambda$2;
        C shareList$lambda$1;
        switch (this.f612a) {
            case 5:
                uploadAvatar$lambda$4 = AvatarViewModel.uploadAvatar$lambda$4(this.f613b, obj);
                return uploadAvatar$lambda$4;
            case 13:
                startValidation$lambda$2 = VideoValidationWebSocket.startValidation$lambda$2(this.f613b, obj);
                return startValidation$lambda$2;
            default:
                shareList$lambda$1 = ResultsHeaderRepositoryImpl.shareList$lambda$1(this.f613b, obj);
                return shareList$lambda$1;
        }
    }
}
