package x1;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import n.AbstractC2144n;

/* loaded from: classes.dex */
public final class h extends v1.h implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final WeakReference f21082k;

    public h(AbstractC2144n abstractC2144n) {
        this.f21082k = new WeakReference(abstractC2144n);
    }

    @Override // v1.h
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.f21082k.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        i.a((EditText) this.f21082k.get(), 1);
    }
}
