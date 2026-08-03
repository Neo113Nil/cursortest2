package m0;

/* loaded from: classes.dex */
public final class l extends A0.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f8063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0.f f8064b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m0.f fVar, android.content.Context context) {
        super(android.os.Looper.myLooper() == null ? android.os.Looper.getMainLooper() : android.os.Looper.myLooper(), 1);
        this.f8064b = fVar;
        this.f8063a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i2 = message.what;
        if (i2 != 1) {
            android.util.Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i2);
            return;
        }
        int i3 = m0.g.f8054a;
        m0.f fVar = this.f8064b;
        android.content.Context context = this.f8063a;
        int b2 = fVar.b(context, i3);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = m0.i.f8056a;
        if (b2 == 1 || b2 == 2 || b2 == 3 || b2 == 9) {
            android.content.Intent a2 = fVar.a(context, "n", b2);
            fVar.f(context, b2, a2 == null ? null : android.app.PendingIntent.getActivity(context, 0, a2, 201326592));
        }
    }
}
