package T2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: T2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0434l implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Context f5718k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f5719l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f5720m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f5721n;

    public RunnableC0434l(Context context, String str, boolean z3, boolean z5) {
        this.f5718k = context;
        this.f5719l = str;
        this.f5720m = z3;
        this.f5721n = z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L l5 = P2.o.f4767B.f4771c;
        Context context = this.f5718k;
        AlertDialog.Builder j5 = L.j(context);
        j5.setMessage(this.f5719l);
        if (this.f5720m) {
            j5.setTitle("Error");
        } else {
            j5.setTitle("Info");
        }
        if (this.f5721n) {
            j5.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            j5.setPositiveButton("Learn More", new DialogInterfaceOnClickListenerC0429g(2, context));
            j5.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        j5.create().show();
    }
}
