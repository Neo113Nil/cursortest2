package Gp;

import android.view.MotionEvent;
import android.view.View;
import ru.ozon.app.android.cml.delivery.molecules.secureDeal.presentation.SecureDealMoleculeView;
import ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2Fragment;

/* loaded from: classes11.dex */
public final /* synthetic */ class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10299b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f10298a = i11;
        this.f10299b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean onToggleStateChangedListener$lambda$4;
        boolean baseSetup$lambda$14;
        switch (this.f10298a) {
            case 0:
                onToggleStateChangedListener$lambda$4 = SecureDealMoleculeView.onToggleStateChangedListener$lambda$4((SecureDealMoleculeView) this.f10299b, view, motionEvent);
                return onToggleStateChangedListener$lambda$4;
            default:
                baseSetup$lambda$14 = OnboardingSlidesV2Fragment.baseSetup$lambda$14((OnboardingSlidesV2Fragment) this.f10299b, view, motionEvent);
                return baseSetup$lambda$14;
        }
    }
}
