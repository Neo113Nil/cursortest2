package A3;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.function.BiConsumer;
import y3.C1568b;
import y3.C1569c;
import y3.r;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1568b f60b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y3.g f61c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f62d;

    public /* synthetic */ h(y3.g gVar, int[] iArr, C1568b c1568b) {
        this.f61c = gVar;
        this.f62d = iArr;
        this.f60b = c1568b;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i2;
        C1568b c1568b = this.f60b;
        Object obj3 = this.f62d;
        switch (this.f59a) {
            case 0:
                S2.a aVar = (S2.a) obj;
                y3.g gVar = this.f61c;
                int b6 = gVar.b();
                if (aVar.f2746b.isEmpty()) {
                    i2 = 0;
                } else {
                    i2 = y3.h.b(F3.d.f688a, aVar.d());
                }
                int b7 = r.b(F3.d.f689b, aVar, obj2, a.f45h, gVar) + i2;
                gVar.f12398c[b6] = b7;
                int[] iArr = (int[]) obj3;
                iArr[0] = C1569c.b(b7) + c1568b.f12384c + b7 + iArr[0];
                return;
            default:
                y3.m mVar = (y3.m) obj3;
                y3.g gVar2 = this.f61c;
                S2.a aVar2 = (S2.a) obj;
                try {
                    mVar.R(c1568b, gVar2.e());
                    if (aVar2.f2746b.isEmpty()) {
                        C1568b c1568b2 = F3.d.f688a;
                    } else {
                        mVar.y(F3.d.f688a, aVar2.d());
                    }
                    mVar.c(F3.d.f689b, aVar2, obj2, a.f45h, gVar2);
                    mVar.H();
                    return;
                } catch (IOException e3) {
                    throw new UncheckedIOException(e3);
                }
        }
    }

    public /* synthetic */ h(y3.m mVar, C1568b c1568b, y3.g gVar) {
        this.f62d = mVar;
        this.f60b = c1568b;
        this.f61c = gVar;
    }
}
