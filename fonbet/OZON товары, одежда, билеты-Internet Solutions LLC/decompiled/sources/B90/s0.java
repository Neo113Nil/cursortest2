package B90;

import ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegate;
import ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3192b;

    public /* synthetic */ s0(Object obj, int i11) {
        this.f3191a = i11;
        this.f3192b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3191a) {
            case 0:
                v0.l0((v0) this.f3192b);
                break;
            case 1:
                O.m.a((O.m) this.f3192b);
                break;
            case 2:
                SharingPreviewFragment.onViewCreated$lambda$7((SharingPreviewFragment) this.f3192b);
                break;
            default:
                VideoMoleculeVisibilityDelegate.showCallback$lambda$1((VideoMoleculeVisibilityDelegate) this.f3192b);
                break;
        }
    }
}
