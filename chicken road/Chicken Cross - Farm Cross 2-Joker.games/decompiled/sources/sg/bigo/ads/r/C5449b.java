package sg.bigo.ads.r;

import androidx.core.view.ViewCompat;
import sg.bigo.ads.E0.p;

/* renamed from: sg.bigo.ads.r.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5449b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13263a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5449b(c cVar) {
        int i;
        int i2;
        int i3 = cVar.d;
        if (i3 != 1 && i3 != 2 && i3 != 3) {
            i3 = 1;
        }
        if (i3 == 2) {
            this.f13263a = false;
            this.b = ViewCompat.MEASURED_STATE_MASK;
        } else {
            if (i3 != 3) {
                this.f13263a = false;
                this.b = -1;
                this.c = p.a(-14671580, (int) 38.25f);
                this.d = -14671580;
                this.e = -14671580;
                p.a(this.e, 128);
                this.f = -1;
                this.g = p.a(-14671580, (int) 38.25f);
                int i4 = cVar.c;
                i = (i4 != 1 || i4 == 2 || i4 == 3) ? i4 : 1;
                if (i != 2) {
                    i2 = -14972829;
                } else {
                    if (i == 3) {
                        this.h = 872415231;
                        this.i = -1;
                        return;
                    }
                    i2 = -16736769;
                }
                this.h = i2;
                this.i = 0;
            }
            this.f13263a = true;
            this.b = p.a(ViewCompat.MEASURED_STATE_MASK, (int) 76.5f);
        }
        this.c = p.a(-1, (int) 38.25f);
        this.d = -1;
        this.e = -1;
        p.a(this.e, 128);
        this.f = -1;
        this.g = p.a(-14671580, (int) 38.25f);
        int i42 = cVar.c;
        if (i42 != 1) {
        }
        if (i != 2) {
        }
        this.h = i2;
        this.i = 0;
    }
}
