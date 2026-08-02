package c0;

import A0.F;
import A0.J0;
import A0.X;
import H0.p;
import a3.AbstractC0467k;
import android.graphics.Rect;
import android.view.autofill.AutofillId;
import e2.C1930k;
import k4.AbstractC2036a;
import r.w;

/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0533b extends g {

    /* renamed from: a, reason: collision with root package name */
    public final C1930k f7378a;

    /* renamed from: b, reason: collision with root package name */
    public final p f7379b;

    /* renamed from: c, reason: collision with root package name */
    public final F f7380c;

    /* renamed from: d, reason: collision with root package name */
    public final I0.a f7381d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7382e;
    public final AutofillId f;

    /* renamed from: g, reason: collision with root package name */
    public final w f7383g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7384h;

    public C0533b(C1930k c1930k, p pVar, F f, I0.a aVar, String str) {
        this.f7378a = c1930k;
        this.f7379b = pVar;
        this.f7380c = f;
        this.f7381d = aVar;
        this.f7382e = str;
        new Rect();
        f.setImportantForAutofill(1);
        J0 x5 = AbstractC2036a.x(f);
        AutofillId e3 = x5 != null ? X.e(x5.f304k) : null;
        if (e3 == null) {
            throw AbstractC0467k.u("Required value was null.");
        }
        this.f = e3;
        this.f7383g = new w();
    }
}
