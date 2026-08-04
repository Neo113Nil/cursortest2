package L5;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class K implements io.flutter.plugin.platform.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4416b;

    public /* synthetic */ K(Object obj, int i7) {
        this.f4415a = i7;
        this.f4416b = obj;
    }

    @Override // io.flutter.plugin.platform.f
    public final void dispose() {
        switch (this.f4415a) {
            case 0:
                this.f4416b = null;
                break;
        }
    }

    @Override // io.flutter.plugin.platform.f
    public final View getView() {
        switch (this.f4415a) {
            case 0:
                return (View) this.f4416b;
            case 1:
                return (View) this.f4416b;
            default:
                return new View((Context) this.f4416b);
        }
    }

    private final void a() {
    }

    private final void b() {
    }
}
