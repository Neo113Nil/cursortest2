package sg.bigo.ads.s0;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.List;

/* loaded from: classes3.dex */
public final class w implements z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f13301a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ List c;
    public final /* synthetic */ boolean d;

    public w(z zVar, Context context, List list, boolean z) {
        this.f13301a = zVar;
        this.b = context;
        this.c = list;
        this.d = z;
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(int i, String str, y yVar) {
        Context context = this.b;
        List list = this.c;
        boolean z = this.d;
        z zVar = this.f13301a;
        if (list.size() == 0) {
            zVar.a(0, "urlList all download Failed", null);
        } else {
            x.a(context, (String) list.remove(0), z, new w(zVar, context, list, z));
        }
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(Bitmap bitmap, y yVar) {
        z zVar = this.f13301a;
        if (zVar != null) {
            zVar.a(bitmap, yVar);
        }
    }
}
