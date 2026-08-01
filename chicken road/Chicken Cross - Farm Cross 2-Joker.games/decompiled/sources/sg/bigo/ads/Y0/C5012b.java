package sg.bigo.ads.Y0;

import android.content.Context;
import android.os.SystemClock;

/* renamed from: sg.bigo.ads.Y0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5012b implements sg.bigo.ads.S.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f12629a;
    public final /* synthetic */ String b;
    public final /* synthetic */ g c;

    public C5012b(g gVar, f fVar, String str) {
        this.c = gVar;
        this.f12629a = fVar;
        this.b = str;
    }

    @Override // sg.bigo.ads.S.a
    public final void a(Context context, String str, int i, String str2) {
        this.c.a(context, str, new C5011a(this, i));
    }

    @Override // sg.bigo.ads.S.a
    public final void a(String str, String str2, String str3) {
        f fVar = this.f12629a;
        if (fVar != null) {
            fVar.a(this.b, SystemClock.elapsedRealtime() - this.c.f, true, 2);
        }
    }
}
