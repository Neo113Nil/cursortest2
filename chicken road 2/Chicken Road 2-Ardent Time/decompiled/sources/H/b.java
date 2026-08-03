package H;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.j implements s1.InterfaceC0991a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f602f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f603g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, java.lang.Object obj, java.lang.Object obj2) {
        super(0);
        this.f601e = i2;
        this.f602f = obj;
        this.f603g = obj2;
    }

    @Override // s1.InterfaceC0991a
    public final java.lang.Object invoke() {
        switch (this.f601e) {
            case 0:
                android.content.Context context = (android.content.Context) this.f602f;
                ((H.c) this.f603g).getClass();
                java.lang.String fileName = "FlutterSharedPreferences".concat(".preferences_pb");
                kotlin.jvm.internal.i.e(fileName, "fileName");
                return new java.io.File(context.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
            default:
                ((a0.InterfaceC0060a) ((Z.b) this.f602f).f1843b).a((P0.q) this.f603g);
                return h1.C0177i.f3302a;
        }
    }
}
