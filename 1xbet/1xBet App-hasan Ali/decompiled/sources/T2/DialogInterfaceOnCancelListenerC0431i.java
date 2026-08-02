package T2;

import android.content.DialogInterface;

/* renamed from: T2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnCancelListenerC0431i implements DialogInterface.OnCancelListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5704k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f5705l;

    public /* synthetic */ DialogInterfaceOnCancelListenerC0431i(int i, Object obj) {
        this.f5704k = i;
        this.f5705l = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f5704k) {
            case 0:
                ((C0432j) this.f5705l).b();
                break;
        }
    }
}
