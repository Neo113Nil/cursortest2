package p068j2;

import A1.InterfaceC0027k;
import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;
import p056h4.i;
import p151v2.a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0027k {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final b f14573I = new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final i f14574J = new i(8);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final float f14575A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final float f14576B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f14577C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f14578D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f14579E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final float f14580F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f14581G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final float f14582H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f14583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f14584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f14585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f14586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f14587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14588f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f14589x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float f14590y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f14591z;

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f7, int i7, int i8, float f8, int i9, int i10, float f9, float f10, float f11, boolean z4, int i11, int i12, float f12) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            a.f(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f14583a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f14583a = charSequence.toString();
        } else {
            this.f14583a = null;
        }
        this.f14584b = alignment;
        this.f14585c = alignment2;
        this.f14586d = bitmap;
        this.f14587e = f7;
        this.f14588f = i7;
        this.f14589x = i8;
        this.f14590y = f8;
        this.f14591z = i9;
        this.f14575A = f10;
        this.f14576B = f11;
        this.f14577C = z4;
        this.f14578D = i11;
        this.f14579E = i10;
        this.f14580F = f9;
        this.f14581G = i12;
        this.f14582H = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (TextUtils.equals(this.f14583a, bVar.f14583a) && this.f14584b == bVar.f14584b && this.f14585c == bVar.f14585c) {
            Bitmap bitmap = bVar.f14586d;
            Bitmap bitmap2 = this.f14586d;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f14587e == bVar.f14587e && this.f14588f == bVar.f14588f && this.f14589x == bVar.f14589x && this.f14590y == bVar.f14590y && this.f14591z == bVar.f14591z && this.f14575A == bVar.f14575A && this.f14576B == bVar.f14576B && this.f14577C == bVar.f14577C && this.f14578D == bVar.f14578D && this.f14579E == bVar.f14579E && this.f14580F == bVar.f14580F && this.f14581G == bVar.f14581G && this.f14582H == bVar.f14582H) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14583a, this.f14584b, this.f14585c, this.f14586d, Float.valueOf(this.f14587e), Integer.valueOf(this.f14588f), Integer.valueOf(this.f14589x), Float.valueOf(this.f14590y), Integer.valueOf(this.f14591z), Float.valueOf(this.f14575A), Float.valueOf(this.f14576B), Boolean.valueOf(this.f14577C), Integer.valueOf(this.f14578D), Integer.valueOf(this.f14579E), Float.valueOf(this.f14580F), Integer.valueOf(this.f14581G), Float.valueOf(this.f14582H)});
    }
}
