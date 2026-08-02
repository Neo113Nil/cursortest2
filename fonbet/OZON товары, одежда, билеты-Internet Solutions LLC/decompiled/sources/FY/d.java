package FY;

import android.view.View;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.presentation.MorkovskMenuViewHolder;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnStartPlayerControllerListener;
import ru.ozon.app.android.videomolecule.presentation.viewholder.VideoMoleculeViewHolder;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements OnStartPlayerControllerListener, D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f9217a;

    public /* synthetic */ d(Object obj) {
        this.f9217a = obj;
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 bind$lambda$3;
        bind$lambda$3 = MorkovskMenuViewHolder.bind$lambda$3((MorkovskMenuViewHolder) this.f9217a, view, c5353y0);
        return bind$lambda$3;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnStartPlayerControllerListener
    public void onStart(PlayerState playerState) {
        VideoMoleculeViewHolder.playerListener$lambda$11$lambda$3((VideoMoleculeViewHolder) this.f9217a, playerState);
    }
}
