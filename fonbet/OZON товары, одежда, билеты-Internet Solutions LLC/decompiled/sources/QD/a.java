package QD;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.chatdetail.d;
import ru.ozon.android.messenger.framework.presentation.chatdetail.k;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.C9472j;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.viewpager.VideoItemViewHolder;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolder;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23115b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f23114a = i11;
        this.f23115b = obj;
    }

    @Override // androidx.lifecycle.G
    public final void onStateChanged(J j11, AbstractC5434v.a event) {
        k kVar;
        switch (this.f23114a) {
            case 0:
                VideoItemViewHolder.lifecycleObserver$lambda$0((VideoItemViewHolder) this.f23115b, j11, event);
                break;
            case 1:
                VideoMoleculeViewHolder.lfObserver$lambda$13((VideoMoleculeViewHolder) this.f23115b, j11, event);
                break;
            default:
                Intrinsics.checkNotNullParameter(j11, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (d.v.a.f89786a[event.ordinal()] == 1) {
                    d dVar = (d) this.f23115b;
                    C9472j i11 = dVar.A().i();
                    kVar = dVar.f89734g;
                    i11.a(kVar != null ? kVar.I() : null);
                    break;
                }
                break;
        }
    }
}
