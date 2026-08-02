package B90;

import android.view.View;
import androidx.core.view.C5353y0;
import androidx.preference.Preference;
import com.google.android.gms.tasks.OnSuccessListener;
import ru.ozon.app.android.session.logoutonall.presentation.LogoutOnAllDevicesViewModelImpl;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.DefaultPlayStoriesV3WidgetBinder;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnBufferPlayerControllerListener;
import ru.ozon.app.android.videomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* renamed from: B90.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2617t implements Preference.d, qc.g, OnBufferPlayerControllerListener, OnSuccessListener, androidx.core.view.D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3193a;

    public /* synthetic */ C2617t(Object obj) {
        this.f3193a = obj;
    }

    @Override // qc.g
    public void accept(Object obj) {
        LogoutOnAllDevicesViewModelImpl.onConfirmClick$lambda$2((LogoutOnAllDevicesViewModelImpl) this.f3193a, obj);
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.L((FintechPreferencesFragment) this.f3193a);
        return true;
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 systemElementsHeight$lambda$8$lambda$7;
        systemElementsHeight$lambda$8$lambda$7 = DefaultPlayStoriesV3WidgetBinder.getSystemElementsHeight$lambda$8$lambda$7((DefaultPlayStoriesV3WidgetBinder) this.f3193a, view, c5353y0);
        return systemElementsHeight$lambda$8$lambda$7;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnBufferPlayerControllerListener
    public void onBuffer() {
        VideoMoleculeViewHolder.playerListener$lambda$11$lambda$4((VideoMoleculeViewHolder) this.f3193a);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((K80.c) this.f3193a).invoke(obj);
    }
}
