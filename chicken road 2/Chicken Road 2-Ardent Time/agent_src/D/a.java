package D;

/* loaded from: classes.dex */
public final class a extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f182b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(java.lang.Object obj, android.os.Handler handler, int i2) {
        super(handler);
        this.f181a = i2;
        this.f182b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f181a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2, android.net.Uri uri) {
        switch (this.f181a) {
            case 2:
                io.flutter.view.h hVar = (io.flutter.view.h) this.f182b;
                if (!hVar.t) {
                    if (android.provider.Settings.Global.getFloat(hVar.f7889f, "transition_animation_scale", 1.0f) == 0.0f) {
                        hVar.f7894k |= 4;
                    } else {
                        hVar.f7894k &= -5;
                    }
                    ((io.flutter.embedding.engine.FlutterJNI) hVar.f7885b.f658c).setAccessibilityFeatures(hVar.f7894k);
                    break;
                }
                break;
            default:
                super.onChange(z2, uri);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h.d0 d0Var) {
        super(new android.os.Handler());
        this.f181a = 0;
        this.f182b = d0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        android.database.Cursor cursor;
        switch (this.f181a) {
            case 0:
                h.d0 d0Var = (h.d0) this.f182b;
                if (d0Var.f186b && (cursor = d0Var.f187c) != null && !cursor.isClosed()) {
                    d0Var.f185a = d0Var.f187c.requery();
                    break;
                }
                break;
            case 1:
                super.onChange(z2);
                P0.t tVar = (P0.t) this.f182b;
                if (tVar.f1394i != null) {
                    tVar.d();
                    break;
                }
                break;
            default:
                onChange(z2, null);
                break;
        }
    }
}
