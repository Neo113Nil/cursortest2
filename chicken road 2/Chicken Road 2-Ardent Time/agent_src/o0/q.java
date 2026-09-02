package o0;

/* loaded from: classes.dex */
public final class q extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f8174a;

    /* renamed from: b, reason: collision with root package name */
    public final o0.i f8175b;

    public q(o0.i iVar) {
        this.f8175b = iVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.net.Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            ((C.b) this.f8175b.f8149c).getClass();
            throw null;
        }
    }
}
