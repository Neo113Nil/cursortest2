package sg.bigo.ads.d;

import android.util.Pair;
import sg.bigo.ads.BigoAdSdk;

/* renamed from: sg.bigo.ads.d.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5057c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12721a;
    public final /* synthetic */ String b;

    public RunnableC5057c(String str, String str2) {
        this.f12721a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (BigoAdSdk.d == null || !BigoAdSdk.f12220a.get()) {
            BigoAdSdk.g.add(Pair.create(this.f12721a, this.b));
        } else {
            BigoAdSdk.d.a(this.f12721a, this.b);
        }
    }
}
