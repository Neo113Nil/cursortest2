package Wg0;

import android.content.DialogInterface;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33860a;

    public /* synthetic */ b(int i11) {
        this.f33860a = i11;
    }

    private final void a(DialogInterface dialogInterface, int i11) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        switch (this.f33860a) {
            case 0:
                break;
            case 1:
                dialogInterface.dismiss();
                break;
            default:
                dialogInterface.dismiss();
                break;
        }
    }
}
