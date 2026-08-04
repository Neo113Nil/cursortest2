package Y;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import androidx.appcompat.widget.U0;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.k;
import p121q5.m;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7635b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Handler handler, int i7) {
        super(handler);
        this.f7634a = i7;
        this.f7635b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f7634a) {
            case 0:
                return true;
            case 1:
            default:
                return super.deliverSelfNotifications();
            case 2:
                return true;
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z4, Uri uri) {
        switch (this.f7634a) {
            case 1:
                k kVar = (k) this.f7635b;
                if (!kVar.f14339u) {
                    if (Settings.Global.getFloat(kVar.f14325f, "transition_animation_scale", 1.0f) == 0.0f) {
                        kVar.f14330l |= 4;
                    } else {
                        kVar.f14330l &= -5;
                    }
                    ((FlutterJNI) kVar.f14321b.f17812c).setAccessibilityFeatures(kVar.f14330l);
                    break;
                }
                break;
            default:
                super.onChange(z4, uri);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(U0 u4) {
        super(new Handler());
        this.f7634a = 0;
        this.f7635b = u4;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4) {
        Cursor cursor;
        switch (this.f7634a) {
            case 0:
                U0 u4 = (U0) this.f7635b;
                if (u4.f7639b && (cursor = u4.f7640c) != null && !cursor.isClosed()) {
                    u4.f7638a = u4.f7640c.requery();
                    break;
                }
                break;
            case 1:
                onChange(z4, null);
                break;
            default:
                super.onChange(z4);
                m mVar = (m) this.f7635b;
                if (mVar.f15941y != null) {
                    mVar.d();
                    break;
                }
                break;
        }
    }
}
