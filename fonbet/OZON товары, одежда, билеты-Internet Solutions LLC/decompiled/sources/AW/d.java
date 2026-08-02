package AW;

import Ui.C4069c;
import android.os.Bundle;
import androidx.camera.core.impl.W;
import androidx.concurrent.futures.b;
import androidx.fragment.app.M;
import androidx.preference.Preference;
import com.google.android.gms.tasks.OnSuccessListener;
import j3.t;
import j3.y;
import m3.r;
import qc.e;
import ru.ozon.app.android.action.v2.ActionV2RepositoryImpl;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.metrics.client.MetricsResponseParser;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.app.android.travel.feature.hotels.shared.player.HotelsGalleryVideoPlayer;
import ru.ozon.app.android.ugc.widgets.reviewTiles.presentation.ReviewTilesVideoDelegate;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnBufferPlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements OnErrorPlayerControllerListener, Preference.d, e, OnBufferPlayerControllerListener, M, b.c, OnSuccessListener, OnRenderedFirstFramePlayerControllerListener, MetricsResponseParser, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f674a;

    public /* synthetic */ d(Object obj) {
        this.f674a = obj;
    }

    @Override // androidx.concurrent.futures.b.c
    public Object c(b.a aVar) {
        return W.b((W) this.f674a, aVar);
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.U((FintechPreferencesFragment) this.f674a);
        return true;
    }

    @Override // androidx.fragment.app.M
    public void f(Bundle bundle, String str) {
        C4069c.u((C4069c) this.f674a, str, bundle);
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((y.c) obj).m((t) this.f674a);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnBufferPlayerControllerListener
    public void onBuffer() {
        HotelsGalleryVideoPlayer.playerListener$lambda$9$lambda$2((HotelsGalleryVideoPlayer) this.f674a);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener
    public void onError(String str, Exception exc, Boolean bool) {
        ReviewTilesVideoDelegate.playerListener$lambda$2$lambda$1((ReviewTilesVideoDelegate) this.f674a, str, exc, bool);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener
    public void onRenderedFirstFrame() {
        VideoMoleculeViewHolder.playerListener$lambda$12$lambda$11((VideoMoleculeViewHolder) this.f674a);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((J90.b) this.f674a).invoke(obj);
    }

    @Override // ru.ozon.app.android.metrics.client.MetricsResponseParser
    public Object parse(String str) {
        ActionV2Response requestActionSheetInternal_0E7RQCE$lambda$11$lambda$10;
        requestActionSheetInternal_0E7RQCE$lambda$11$lambda$10 = ActionV2RepositoryImpl.requestActionSheetInternal_0E7RQCE$lambda$11$lambda$10((ActionV2RepositoryImpl) this.f674a, str);
        return requestActionSheetInternal_0E7RQCE$lambda$11$lambda$10;
    }
}
