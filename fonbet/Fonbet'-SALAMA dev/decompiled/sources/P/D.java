package P;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class D extends F {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5023e;

    public D(int i7, Class cls, int i8, int i9, int i10) {
        this.f5023e = i10;
        this.f5025a = i7;
        this.f5028d = cls;
        this.f5027c = i8;
        this.f5026b = i9;
    }

    @Override // P.F
    public final Object b(View view) {
        switch (this.f5023e) {
            case 0:
                return Boolean.valueOf(M.d(view));
            case 1:
                return M.b(view);
            case 2:
                return O.b(view);
            default:
                return Boolean.valueOf(M.c(view));
        }
    }

    @Override // P.F
    public final void c(View view, Object obj) {
        switch (this.f5023e) {
            case 0:
                M.j(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                M.h(view, (CharSequence) obj);
                break;
            case 2:
                O.e(view, (CharSequence) obj);
                break;
            default:
                M.g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // P.F
    public final boolean e(Object obj, Object obj2) {
        switch (this.f5023e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 2:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
