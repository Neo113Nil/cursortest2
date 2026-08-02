package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
final class E {

    /* renamed from: a, reason: collision with root package name */
    final b f44665a;

    /* renamed from: b, reason: collision with root package name */
    a f44666b;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f44667a;

        /* renamed from: b, reason: collision with root package name */
        int f44668b;

        /* renamed from: c, reason: collision with root package name */
        int f44669c;

        /* renamed from: d, reason: collision with root package name */
        int f44670d;

        /* renamed from: e, reason: collision with root package name */
        int f44671e;

        final boolean a() {
            int i11 = this.f44667a;
            int i12 = 2;
            if ((i11 & 7) != 0) {
                int i13 = this.f44670d;
                int i14 = this.f44668b;
                if (((i13 > i14 ? 1 : i13 == i14 ? 2 : 4) & i11) == 0) {
                    return false;
                }
            }
            if ((i11 & 112) != 0) {
                int i15 = this.f44670d;
                int i16 = this.f44669c;
                if ((((i15 > i16 ? 1 : i15 == i16 ? 2 : 4) << 4) & i11) == 0) {
                    return false;
                }
            }
            if ((i11 & 1792) != 0) {
                int i17 = this.f44671e;
                int i18 = this.f44668b;
                if ((((i17 > i18 ? 1 : i17 == i18 ? 2 : 4) << 8) & i11) == 0) {
                    return false;
                }
            }
            if ((i11 & 28672) != 0) {
                int i19 = this.f44671e;
                int i21 = this.f44669c;
                if (i19 > i21) {
                    i12 = 1;
                } else if (i19 != i21) {
                    i12 = 4;
                }
                if ((i11 & (i12 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    interface b {
        int a();

        int b();

        View c(int i11);

        int d(View view);

        int e(View view);
    }

    E(b bVar) {
        this.f44665a = bVar;
        a aVar = new a();
        aVar.f44667a = 0;
        this.f44666b = aVar;
    }

    final View a(int i11, int i12, int i13, int i14) {
        b bVar = this.f44665a;
        int a11 = bVar.a();
        int b11 = bVar.b();
        int i15 = i12 > i11 ? 1 : -1;
        View view = null;
        while (i11 != i12) {
            View c11 = bVar.c(i11);
            int d11 = bVar.d(c11);
            int e11 = bVar.e(c11);
            a aVar = this.f44666b;
            aVar.f44668b = a11;
            aVar.f44669c = b11;
            aVar.f44670d = d11;
            aVar.f44671e = e11;
            if (i13 != 0) {
                aVar.f44667a = i13;
                if (aVar.a()) {
                    return c11;
                }
            }
            if (i14 != 0) {
                aVar.f44667a = i14;
                if (aVar.a()) {
                    view = c11;
                }
            }
            i11 += i15;
        }
        return view;
    }

    final boolean b(View view) {
        b bVar = this.f44665a;
        int a11 = bVar.a();
        int b11 = bVar.b();
        int d11 = bVar.d(view);
        int e11 = bVar.e(view);
        a aVar = this.f44666b;
        aVar.f44668b = a11;
        aVar.f44669c = b11;
        aVar.f44670d = d11;
        aVar.f44671e = e11;
        aVar.f44667a = 24579;
        return aVar.a();
    }
}
