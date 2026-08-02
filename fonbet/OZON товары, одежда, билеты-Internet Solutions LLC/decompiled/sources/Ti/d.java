package Ti;

import Ve.C4128bg;
import Ve.C4238fb;
import Ve.C4577r4;
import Ve.Mq;
import Ve.Yq;
import android.content.DialogInterface;
import androidx.fragment.app.r;
import ic0.C7046b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27185b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f27184a = i11;
        this.f27185b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        switch (this.f27184a) {
            case 0:
                Ki.a.a((r) this.f27185b);
                break;
            case 1:
                Mq this$0 = (Mq) this.f27185b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                C4577r4 c4577r4 = (C4577r4) this$0.u();
                ((Yq) c4577r4.f31933g).b(true);
                ((C4238fb) c4577r4.f31932f).b(C4128bg.f30735a);
                break;
            default:
                C7046b.u((C7046b) this.f27185b);
                break;
        }
    }
}
