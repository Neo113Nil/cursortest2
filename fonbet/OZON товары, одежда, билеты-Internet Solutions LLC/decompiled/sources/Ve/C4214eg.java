package Ve;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.view.SpayBonusCompositeView;

/* renamed from: Ve.eg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4214eg implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f30927a;

    /* renamed from: b, reason: collision with root package name */
    public final SpayBonusCompositeView f30928b;

    public C4214eg(ConstraintLayout constraintLayout, SpayBonusCompositeView spayBonusCompositeView) {
        this.f30927a = constraintLayout;
        this.f30928b = spayBonusCompositeView;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f30927a;
    }
}
