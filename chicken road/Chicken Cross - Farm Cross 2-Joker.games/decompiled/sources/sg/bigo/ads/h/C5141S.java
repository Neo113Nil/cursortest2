package sg.bigo.ads.h;

import android.widget.TextView;

/* renamed from: sg.bigo.ads.h.S, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5141S extends sg.bigo.ads.E0.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextView f12851a;
    public final /* synthetic */ sg.bigo.ads.E0.k b;

    public C5141S(TextView textView, sg.bigo.ads.E0.k kVar) {
        this.f12851a = textView;
        this.b = kVar;
    }

    @Override // sg.bigo.ads.E0.k
    public final long a() {
        sg.bigo.ads.E0.k kVar = this.b;
        if (kVar != null) {
            return kVar.a();
        }
        return 0L;
    }

    @Override // sg.bigo.ads.E0.k
    public final boolean b(int i) {
        T.a(this.f12851a, sg.bigo.ads.E0.p.b(i));
        sg.bigo.ads.E0.k kVar = this.b;
        if (kVar == null) {
            return false;
        }
        kVar.b(i);
        return false;
    }

    @Override // sg.bigo.ads.E0.k
    public final void a(int i) {
        sg.bigo.ads.E0.k kVar = this.b;
        if (kVar != null) {
            kVar.a(i);
        }
    }
}
