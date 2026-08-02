package Ve;

import android.content.DialogInterface;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import ic0.C7046b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final /* synthetic */ class Iq implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC5390k f29248b;

    public /* synthetic */ Iq(DialogInterfaceOnCancelListenerC5390k dialogInterfaceOnCancelListenerC5390k, int i11) {
        this.f29247a = i11;
        this.f29248b = dialogInterfaceOnCancelListenerC5390k;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        switch (this.f29247a) {
            case 0:
                Mq this$0 = (Mq) this.f29248b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                C4577r4 c4577r4 = (C4577r4) this$0.u();
                ((Yq) c4577r4.f31933g).b(false);
                ((C4238fb) c4577r4.f31932f).b(C4128bg.f30735a);
                break;
            default:
                C7046b.t((C7046b) this.f29248b);
                break;
        }
    }
}
