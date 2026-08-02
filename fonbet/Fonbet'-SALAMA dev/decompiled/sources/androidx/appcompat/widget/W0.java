package androidx.appcompat.widget;

import android.widget.EditText;
import g0.AbstractC1126h;
import i0.C1241h;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class W0 extends AbstractC1126h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8577a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f8578b;

    public W0(EditText editText) {
        this.f8578b = new WeakReference(editText);
    }

    @Override // g0.AbstractC1126h
    public void a() {
        switch (this.f8577a) {
            case 0:
                SwitchCompat switchCompat = (SwitchCompat) this.f8578b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    break;
                }
                break;
        }
    }

    @Override // g0.AbstractC1126h
    public final void b() {
        switch (this.f8577a) {
            case 0:
                SwitchCompat switchCompat = (SwitchCompat) this.f8578b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    break;
                }
                break;
            default:
                C1241h.a((EditText) this.f8578b.get(), 1);
                break;
        }
    }

    public W0(SwitchCompat switchCompat) {
        this.f8578b = new WeakReference(switchCompat);
    }
}
