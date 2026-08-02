package E;

import P.C0315s;
import android.R;

/* renamed from: E.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0107l extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1223l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0107l(int i) {
        super(2);
        this.f1223l = i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        int i;
        C0315s c0315s = (C0315s) obj;
        ((Number) obj2).intValue();
        c0315s.X(-1451087197);
        int i5 = this.f1223l;
        if (i5 == 1) {
            i = R.string.cut;
        } else if (i5 == 2) {
            i = R.string.copy;
        } else if (i5 == 3) {
            i = R.string.paste;
        } else {
            if (i5 != 4) {
                throw null;
            }
            i = R.string.selectAll;
        }
        String M5 = G4.l.M(i, c0315s);
        c0315s.q(false);
        return M5;
    }
}
