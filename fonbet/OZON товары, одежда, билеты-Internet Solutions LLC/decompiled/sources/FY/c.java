package FY;

import android.view.MotionEvent;
import android.view.View;
import ru.ozon.app.android.videomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9216b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f9215a = i11;
        this.f9216b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean lambda$17$lambda$15;
        boolean z11;
        switch (this.f9215a) {
            case 0:
                lambda$17$lambda$15 = VideoMoleculeViewHolder.lambda$17$lambda$15((VideoMoleculeViewHolder) this.f9216b, view, motionEvent);
                return lambda$17$lambda$15;
            case 1:
                return Pe0.a.d((Pe0.a) this.f9216b, motionEvent);
            default:
                z11 = CameraFragment.setupFocusOnTap$lambda$87$lambda$86((CameraFragment) this.f9216b, view, motionEvent);
                return z11;
        }
    }
}
