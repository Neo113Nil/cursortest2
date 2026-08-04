package androidx.appcompat.widget;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class W0 extends p046g0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8577a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f8578b;

    public W0(EditText editText) {
        this.f8578b = new WeakReference(editText);
    }

    @Override // p046g0.h
    public void a() {
        switch (this.f8577a) {
            case 0:
                SwitchCompat switchCompat = (SwitchCompat) this.f8578b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    @Override // p046g0.h
    public final void b() {
        switch (this.f8577a) {
            case 0:
                SwitchCompat switchCompat = (SwitchCompat) this.f8578b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
            default:
                p059i0.h.a((EditText) this.f8578b.get(), 1);
                break;
        }
    }

    public W0(SwitchCompat switchCompat) {
        this.f8578b = new WeakReference(switchCompat);
    }
}
