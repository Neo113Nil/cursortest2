package sg.bigo.ads.n1;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.f0.C5115b;
import sg.bigo.ads.h.C5176i1;

/* loaded from: classes3.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ValueCallback f13210a;
    public final /* synthetic */ String b;
    public final /* synthetic */ n c;

    public h(n nVar, C5176i1 c5176i1, String str) {
        this.c = nVar;
        this.f13210a = c5176i1;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ValueCallback valueCallback = this.f13210a;
        sg.bigo.ads.f0.h hVar = this.c.h;
        String str = this.b;
        CopyOnWriteArrayList copyOnWriteArrayList = hVar.f12787a;
        if (!I.a((CharSequence) str) && !A.a(copyOnWriteArrayList)) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(str, ((C5115b) it.next()).b)) {
                    break;
                }
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = hVar.c;
        if (!I.a((CharSequence) str) && !A.a(copyOnWriteArrayList2)) {
            Iterator it2 = copyOnWriteArrayList2.iterator();
            while (it2.hasNext()) {
                if (TextUtils.equals(str, ((C5115b) it2.next()).b)) {
                    z = true;
                }
            }
        }
        z = false;
        valueCallback.onReceiveValue(Boolean.valueOf(z));
    }
}
