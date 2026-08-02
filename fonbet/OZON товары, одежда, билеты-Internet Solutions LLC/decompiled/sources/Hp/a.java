package Hp;

import ru.ozon.app.android.cml.delivery.widgets.boxList.di.BoxListComponent$Companion$create$1$1;
import ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.BoxListViewModel;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.di.ParticipantPhoneComponent$Companion$create$1$1;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.ParticipantPhoneViewModel;

/* loaded from: classes11.dex */
public final /* synthetic */ class a implements Pc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11225a;

    public /* synthetic */ a(int i11) {
        this.f11225a = i11;
    }

    @Override // Pc.a
    public final Object get() {
        BoxListViewModel boxListViewModelProvider$lambda$0;
        ParticipantPhoneViewModel participantPhoneViewModelProvider$lambda$0;
        switch (this.f11225a) {
            case 0:
                boxListViewModelProvider$lambda$0 = BoxListComponent$Companion$create$1$1.boxListViewModelProvider$lambda$0();
                return boxListViewModelProvider$lambda$0;
            default:
                participantPhoneViewModelProvider$lambda$0 = ParticipantPhoneComponent$Companion$create$1$1.participantPhoneViewModelProvider$lambda$0();
                return participantPhoneViewModelProvider$lambda$0;
        }
    }
}
