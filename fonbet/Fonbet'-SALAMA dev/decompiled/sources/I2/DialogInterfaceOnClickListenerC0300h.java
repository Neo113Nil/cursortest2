package I2;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: I2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0300h implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3607b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0300h(Object obj, int i7) {
        this.f3606a = i7;
        this.f3607b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.f3606a) {
            case 0:
                ((AtomicInteger) this.f3607b).set(i7);
                break;
            case 1:
                ((C0303k) this.f3607b).b();
                break;
            default:
                P p5 = E2.o.f1952C.f1957c;
                P.q((Context) this.f3607b, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
                break;
        }
    }
}
