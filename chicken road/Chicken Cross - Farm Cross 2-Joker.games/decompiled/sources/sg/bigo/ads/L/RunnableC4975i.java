package sg.bigo.ads.L;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: sg.bigo.ads.L.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4975i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12386a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ int c;

    public RunnableC4975i(int i, View view, ViewGroup viewGroup) {
        this.f12386a = view;
        this.b = viewGroup;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r.a(this.f12386a, new C4968b(this));
    }
}
