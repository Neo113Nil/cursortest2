package GQ;

import hi.InterfaceC6958a;
import k20.InterfaceC7469a;
import ru.ozon.app.android.checkoutcomposer.stickyNotification.di.StickyNotificationComponent;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelNotificationModalCheck.di.NotificationModalCheckComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9839a;

    public /* synthetic */ a(int i11) {
        this.f9839a = i11;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        NotificationModalCheckComponent create$lambda$0;
        StickyNotificationComponent create$lambda$02;
        switch (this.f9839a) {
            case 0:
                create$lambda$0 = NotificationModalCheckComponent.Companion.create$lambda$0();
                return create$lambda$0;
            default:
                create$lambda$02 = StickyNotificationComponent.Companion.create$lambda$0();
                return create$lambda$02;
        }
    }
}
