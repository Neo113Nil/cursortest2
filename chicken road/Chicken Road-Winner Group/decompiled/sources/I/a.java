package I;

import I1.q;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.i;
import l.f0;

/* loaded from: classes.dex */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f562b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Handler handler, int i3) {
        super(handler);
        this.f561a = i3;
        this.f562b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f561a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z3, Uri uri) {
        switch (this.f561a) {
            case 2:
                i iVar = (i) this.f562b;
                if (!iVar.f9446u) {
                    if (Settings.Global.getFloat(iVar.f, "transition_animation_scale", 1.0f) == 0.0f) {
                        iVar.f9437l |= 4;
                    } else {
                        iVar.f9437l &= -5;
                    }
                    ((FlutterJNI) iVar.f9428b.f67c).setAccessibilityFeatures(iVar.f9437l);
                    break;
                }
                break;
            default:
                super.onChange(z3, uri);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f0 f0Var) {
        super(new Handler());
        this.f561a = 0;
        this.f562b = f0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        Cursor cursor;
        switch (this.f561a) {
            case 0:
                f0 f0Var = (f0) this.f562b;
                if (f0Var.f566b && (cursor = f0Var.f567c) != null && !cursor.isClosed()) {
                    f0Var.f565a = f0Var.f567c.requery();
                    break;
                }
                break;
            case 1:
                super.onChange(z3);
                q qVar = (q) this.f562b;
                if (qVar.f649i != null) {
                    qVar.d();
                    break;
                }
                break;
            default:
                onChange(z3, null);
                break;
        }
    }
}
