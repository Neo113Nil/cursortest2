package F;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class u extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f116b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj, Handler handler, int i2) {
        super(handler);
        this.f115a = i2;
        this.f116b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f115a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        switch (this.f115a) {
            case 0:
                super.onChange(z2);
                x xVar = (x) this.f116b;
                if (xVar.f130i != null) {
                    xVar.d();
                    break;
                }
                break;
            default:
                onChange(z2, null);
                break;
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2, Uri uri) {
        switch (this.f115a) {
            case 1:
                io.flutter.view.i iVar = (io.flutter.view.i) this.f116b;
                if (!iVar.f827t) {
                    if (Settings.Global.getFloat(iVar.f813f, "transition_animation_scale", 1.0f) == 0.0f) {
                        iVar.f818k |= 4;
                    } else {
                        iVar.f818k &= -5;
                    }
                    ((FlutterJNI) iVar.f809b.f19b).setAccessibilityFeatures(iVar.f818k);
                    break;
                }
                break;
            default:
                super.onChange(z2, uri);
                break;
        }
    }
}
