package sg.bigo.ads.j;

import android.content.Context;
import android.view.View;

/* loaded from: classes3.dex */
public final class i implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f13002a;
    public final /* synthetic */ j b;
    public final /* synthetic */ l c;

    public i(l lVar, Context context, j jVar) {
        this.c = lVar;
        this.f13002a = context;
        this.b = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.c.a(this.f13002a, this.b.f13003a);
    }
}
