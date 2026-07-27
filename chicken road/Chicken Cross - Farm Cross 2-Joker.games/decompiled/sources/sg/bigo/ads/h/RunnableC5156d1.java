package sg.bigo.ads.h;

import android.net.Uri;
import android.webkit.ValueCallback;
import sg.bigo.ads.K0.AbstractC4962t;

/* renamed from: sg.bigo.ads.h.d1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5156d1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12879a;
    public final /* synthetic */ sg.bigo.ads.C.l b;
    public final /* synthetic */ ValueCallback c;

    public RunnableC5156d1(String str, sg.bigo.ads.C.l lVar, ValueCallback valueCallback) {
        this.f12879a = str;
        this.b = lVar;
        this.c = valueCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.onReceiveValue(AbstractC4962t.b(Uri.parse(this.f12879a).getPath(), this.b.k.e));
    }
}
