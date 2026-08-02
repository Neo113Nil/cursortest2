package Kz;

import android.content.DialogInterface;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import ru.ozon.app.android.account.adult.ui.AdultDialog;
import ru.ozon.app.android.marketing.widgets.notificationssettings.dialog.NotificationsSettingsDialogFragment;

/* renamed from: Kz.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC3536b implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16057a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC5390k f16058b;

    public /* synthetic */ DialogInterfaceOnClickListenerC3536b(DialogInterfaceOnCancelListenerC5390k dialogInterfaceOnCancelListenerC5390k, int i11) {
        this.f16057a = i11;
        this.f16058b = dialogInterfaceOnCancelListenerC5390k;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        switch (this.f16057a) {
            case 0:
                ((NotificationsSettingsDialogFragment) this.f16058b).passResult(0);
                break;
            default:
                AdultDialog.onStart$lambda$2$lambda$0((AdultDialog) this.f16058b, dialogInterface, i11);
                break;
        }
    }
}
