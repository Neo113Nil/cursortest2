package T2;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: T2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0429g implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5698b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0429g(int i, Object obj) {
        this.f5697a = i;
        this.f5698b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f5697a) {
            case 0:
                ((AtomicInteger) this.f5698b).set(i);
                break;
            case 1:
                ((C0432j) this.f5698b).b();
                break;
            default:
                L l5 = P2.o.f4767B.f4771c;
                L.q((Context) this.f5698b, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
                break;
        }
    }
}
