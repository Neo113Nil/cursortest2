package p0;

/* renamed from: p0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0960l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f8267b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f8268c;

    public /* synthetic */ DialogInterfaceOnClickListenerC0960l(android.content.Intent intent, java.lang.Object obj, int i2) {
        this.f8266a = i2;
        this.f8267b = intent;
        this.f8268c = obj;
    }

    public final void a() {
        switch (this.f8266a) {
            case 0:
                android.content.Intent intent = this.f8267b;
                if (intent != null) {
                    ((com.google.android.gms.common.api.GoogleApiActivity) this.f8268c).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                android.content.Intent intent2 = this.f8267b;
                if (intent2 != null) {
                    ((o0.y) this.f8268c).startActivityForResult(intent2, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i2) {
        try {
            try {
                a();
            } catch (android.content.ActivityNotFoundException e2) {
                android.util.Log.e("DialogRedirect", true == android.os.Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e2);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
