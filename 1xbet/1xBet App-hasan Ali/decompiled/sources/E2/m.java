package E2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1462a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f1463b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorSpace f1464c;

    /* renamed from: d, reason: collision with root package name */
    public final F2.h f1465d;

    /* renamed from: e, reason: collision with root package name */
    public final F2.g f1466e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1467g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1468h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final y4.m f1469j;

    /* renamed from: k, reason: collision with root package name */
    public final p f1470k;

    /* renamed from: l, reason: collision with root package name */
    public final n f1471l;

    /* renamed from: m, reason: collision with root package name */
    public final b f1472m;

    /* renamed from: n, reason: collision with root package name */
    public final b f1473n;

    /* renamed from: o, reason: collision with root package name */
    public final b f1474o;

    public m(Context context, Bitmap.Config config, ColorSpace colorSpace, F2.h hVar, F2.g gVar, boolean z3, boolean z5, boolean z6, String str, y4.m mVar, p pVar, n nVar, b bVar, b bVar2, b bVar3) {
        this.f1462a = context;
        this.f1463b = config;
        this.f1464c = colorSpace;
        this.f1465d = hVar;
        this.f1466e = gVar;
        this.f = z3;
        this.f1467g = z5;
        this.f1468h = z6;
        this.i = str;
        this.f1469j = mVar;
        this.f1470k = pVar;
        this.f1471l = nVar;
        this.f1472m = bVar;
        this.f1473n = bVar2;
        this.f1474o = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (kotlin.jvm.internal.l.a(this.f1462a, mVar.f1462a) && this.f1463b == mVar.f1463b) {
            return (Build.VERSION.SDK_INT < 26 || kotlin.jvm.internal.l.a(this.f1464c, mVar.f1464c)) && kotlin.jvm.internal.l.a(this.f1465d, mVar.f1465d) && this.f1466e == mVar.f1466e && this.f == mVar.f && this.f1467g == mVar.f1467g && this.f1468h == mVar.f1468h && kotlin.jvm.internal.l.a(this.i, mVar.i) && kotlin.jvm.internal.l.a(this.f1469j, mVar.f1469j) && kotlin.jvm.internal.l.a(this.f1470k, mVar.f1470k) && kotlin.jvm.internal.l.a(this.f1471l, mVar.f1471l) && this.f1472m == mVar.f1472m && this.f1473n == mVar.f1473n && this.f1474o == mVar.f1474o;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f1463b.hashCode() + (this.f1462a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f1464c;
        int hashCode2 = (((((((this.f1466e.hashCode() + ((this.f1465d.hashCode() + ((hashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.f1467g ? 1231 : 1237)) * 31) + (this.f1468h ? 1231 : 1237)) * 31;
        String str = this.i;
        return this.f1474o.hashCode() + ((this.f1473n.hashCode() + ((this.f1472m.hashCode() + ((this.f1471l.f1476k.hashCode() + ((this.f1470k.f1484a.hashCode() + ((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f1469j.f21360k)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
