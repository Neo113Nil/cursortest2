package sg.bigo.ads.Y0;

import java.util.WeakHashMap;

/* renamed from: sg.bigo.ads.Y0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5011a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12628a;
    public final /* synthetic */ C5012b b;

    public C5011a(C5012b c5012b, int i) {
        this.b = c5012b;
        this.f12628a = i;
    }

    @Override // sg.bigo.ads.Y0.f
    public final void a(String str, long j, boolean z, int i) {
        int i2;
        f fVar = this.b.f12629a;
        if (fVar != null) {
            int i3 = this.f12628a;
            WeakHashMap weakHashMap = D.f12627a;
            if (i3 != 0) {
                i2 = i3 != 1 ? i3 != 2 ? 5 : 4 : 3;
            } else {
                i2 = 2;
            }
            fVar.a(str, j, z, i2);
        }
    }

    @Override // sg.bigo.ads.Y0.f
    public final void a(String str) {
        f fVar = this.b.f12629a;
        if (fVar != null) {
            fVar.a(str);
        }
    }
}
