package sg.bigo.ads.Y0;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class z implements sg.bigo.ads.S.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f12650a;
    public final /* synthetic */ String b;
    public final /* synthetic */ sg.bigo.ads.e.h c;
    public final /* synthetic */ sg.bigo.ads.P.f d;
    public final /* synthetic */ boolean e;

    public z(i iVar, String str, sg.bigo.ads.e.h hVar, sg.bigo.ads.P.f fVar, boolean z) {
        this.f12650a = iVar;
        this.b = str;
        this.c = hVar;
        this.d = fVar;
        this.e = z;
    }

    @Override // sg.bigo.ads.S.a
    public final void a(Context context, String str, int i, String str2) {
        int i2 = i != 0 ? i != 1 ? i != 2 ? 5 : 4 : 3 : 2;
        String str3 = this.b;
        sg.bigo.ads.e.h hVar = this.c;
        D.a(context, str3, hVar, this.d, i2, this.e, D.a(hVar));
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        sg.bigo.ads.e.h hVar2 = this.c;
        sg.bigo.ads.s1.b.a(3002, 10114, str2, hVar2 == null ? null : hVar2.e());
    }

    @Override // sg.bigo.ads.S.a
    public final void a(String str, String str2, String str3) {
        i iVar = this.f12650a;
        iVar.e = str;
        iVar.f = str2;
        iVar.g = str3;
    }
}
