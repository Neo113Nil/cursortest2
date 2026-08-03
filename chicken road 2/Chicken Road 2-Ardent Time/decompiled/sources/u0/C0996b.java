package u0;

/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0996b {

    /* renamed from: b, reason: collision with root package name */
    public static final u0.C0996b f8359b;

    /* renamed from: a, reason: collision with root package name */
    public G0.b f8360a;

    static {
        u0.C0996b c0996b = new u0.C0996b();
        c0996b.f8360a = null;
        f8359b = c0996b;
    }

    public static G0.b a(android.content.Context context) {
        G0.b bVar;
        u0.C0996b c0996b = f8359b;
        synchronized (c0996b) {
            try {
                if (c0996b.f8360a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    c0996b.f8360a = new G0.b(context);
                }
                bVar = c0996b.f8360a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
