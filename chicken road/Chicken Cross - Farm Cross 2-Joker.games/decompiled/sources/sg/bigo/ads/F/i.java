package sg.bigo.ads.F;

import android.graphics.Bitmap;
import sg.bigo.ads.s0.y;
import sg.bigo.ads.s0.z;

/* loaded from: classes3.dex */
public final class i implements z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.Q.c f12289a;
    public final /* synthetic */ j b;

    public i(j jVar, o oVar) {
        this.b = jVar;
        this.f12289a = oVar;
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(int i, String str, y yVar) {
        sg.bigo.ads.Q.c cVar;
        j jVar = this.b;
        sg.bigo.ads.C.l lVar = jVar.b;
        if (lVar == null || jVar.f12290a == null || (cVar = this.f12289a) == null) {
            return;
        }
        cVar.a(lVar, i, 3001, str);
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(Bitmap bitmap, y yVar) {
        j jVar = this.b;
        sg.bigo.ads.C.l lVar = jVar.b;
        if (lVar == null || jVar.f12290a == null || this.f12289a == null) {
            return;
        }
        lVar.a(bitmap, 1);
        this.b.f12290a.setImageBitmap(bitmap);
        this.f12289a.a(this.b.b);
    }
}
