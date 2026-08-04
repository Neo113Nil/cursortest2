package I2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: renamed from: I2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0305m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f3630d;

    public RunnableC0305m(Context context, String str, boolean z4, boolean z7) {
        this.f3627a = context;
        this.f3628b = str;
        this.f3629c = z4;
        this.f3630d = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P p5 = E2.o.f1952C.f1957c;
        Context context = this.f3627a;
        AlertDialog.Builder builderJ = P.j(context);
        builderJ.setMessage(this.f3628b);
        if (this.f3629c) {
            builderJ.setTitle("Error");
        } else {
            builderJ.setTitle("Info");
        }
        if (this.f3630d) {
            builderJ.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderJ.setPositiveButton("Learn More", new DialogInterfaceOnClickListenerC0300h(context, 2));
            builderJ.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderJ.create().show();
    }
}
