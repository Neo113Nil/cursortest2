package sg.bigo.ads.Q0;

import android.webkit.ValueCallback;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class a implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f12499a;

    public a(ArrayList arrayList) {
        this.f12499a = arrayList;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Exception exc = (Exception) obj;
        if (exc != null) {
            this.f12499a.add(exc);
        }
    }
}
