package DL;

import F3.C2998c;
import F3.J;
import K80.e;
import N3.u;
import Zl0.i;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import com.google.android.gms.tasks.OnSuccessListener;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.content.RoleInvitationCreatorContentViewHolder;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.PlayVideoEventsDelegate;
import ru.ozon.app.android.update.rustore.RuStoreInAppUpdateRepository;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.HasAudioPlayerControllerListener;
import u3.P;
import yl0.InterfaceC10919d;
import yl0.InterfaceC10920e;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements HasAudioPlayerControllerListener, J.a, OnSuccessListener, InterfaceC10919d, D, InterfaceC10920e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6239b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f6238a = i11;
        this.f6239b = obj;
    }

    @Override // F3.J.a
    public J a(P p11) {
        return new C2998c((u) this.f6239b);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.HasAudioPlayerControllerListener
    public void hasAudio(boolean z11) {
        PlayVideoEventsDelegate.playerListener$lambda$3$lambda$2((PlayVideoEventsDelegate) this.f6239b, z11);
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 insetsListener$lambda$0;
        insetsListener$lambda$0 = RoleInvitationCreatorContentViewHolder.insetsListener$lambda$0((RoleInvitationCreatorContentViewHolder) this.f6239b, view, c5353y0);
        return insetsListener$lambda$0;
    }

    @Override // yl0.InterfaceC10919d
    public void onFailure(Throwable th2) {
        ((i) this.f6239b).f36048e.info("Re-subscription is completed with exception " + th2.getMessage());
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f6238a) {
            case 2:
                ((e) this.f6239b).invoke(obj);
                break;
            default:
                ((RuStoreInAppUpdateRepository) this.f6239b).handleResult(-1920, ((Integer) obj).intValue());
                break;
        }
    }
}
