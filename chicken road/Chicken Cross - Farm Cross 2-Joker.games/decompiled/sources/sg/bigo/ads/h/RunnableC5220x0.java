package sg.bigo.ads.h;

import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.common.view.AdImageView;

/* renamed from: sg.bigo.ads.h.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5220x0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f12940a;
    public final /* synthetic */ AdImageView b;

    public RunnableC5220x0(ArrayList arrayList, AdImageView adImageView) {
        this.f12940a = arrayList;
        this.b = adImageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12940a.clear();
        this.b.c.c.clear();
    }
}
