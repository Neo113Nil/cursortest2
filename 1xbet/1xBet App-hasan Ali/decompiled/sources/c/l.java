package c;

import android.content.res.Resources;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u f7357k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0521H f7358l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0521H f7359m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0531j f7360n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ View f7361o;

    public /* synthetic */ l(u uVar, C0521H c0521h, C0521H c0521h2, AbstractActivityC0531j abstractActivityC0531j, View view) {
        this.f7357k = uVar;
        this.f7358l = c0521h;
        this.f7359m = c0521h2;
        this.f7360n = abstractActivityC0531j;
        this.f7361o = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window = this.f7360n.getWindow();
        kotlin.jvm.internal.l.e("getWindow(...)", window);
        C0521H c0521h = this.f7358l;
        i4.c cVar = c0521h.f7311c;
        View view = this.f7361o;
        Resources resources = view.getResources();
        kotlin.jvm.internal.l.e("getResources(...)", resources);
        boolean booleanValue = ((Boolean) cVar.c(resources)).booleanValue();
        C0521H c0521h2 = this.f7359m;
        i4.c cVar2 = c0521h2.f7311c;
        Resources resources2 = view.getResources();
        kotlin.jvm.internal.l.e("getResources(...)", resources2);
        this.f7357k.b(c0521h, c0521h2, window, view, booleanValue, ((Boolean) cVar2.c(resources2)).booleanValue());
    }
}
