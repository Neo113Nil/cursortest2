package sg.bigo.ads.k1;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;

/* loaded from: classes3.dex */
public final class L implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f13018a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C5266g c;
    public final /* synthetic */ O d;

    public L(O o, Activity activity, String str, C5266g c5266g) {
        this.d = o;
        this.f13018a = activity;
        this.b = str;
        this.c = c5266g;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        O o = this.d;
        Context context = this.f13018a;
        String str = this.b;
        C5266g c5266g = this.c;
        o.getClass();
        O.a(context, str, c5266g);
    }
}
