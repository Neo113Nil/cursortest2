package j2;

import A1.InterfaceC0027k;
import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import h4.C1206i;
import java.util.Arrays;
import v2.AbstractC1664a;

/* renamed from: j2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1305b implements InterfaceC0027k {

    /* renamed from: I, reason: collision with root package name */
    public static final C1305b f14567I = new C1305b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);

    /* renamed from: J, reason: collision with root package name */
    public static final C1206i f14568J = new C1206i(8);

    /* renamed from: A, reason: collision with root package name */
    public final float f14569A;

    /* renamed from: B, reason: collision with root package name */
    public final float f14570B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f14571C;

    /* renamed from: D, reason: collision with root package name */
    public final int f14572D;

    /* renamed from: E, reason: collision with root package name */
    public final int f14573E;

    /* renamed from: F, reason: collision with root package name */
    public final float f14574F;

    /* renamed from: G, reason: collision with root package name */
    public final int f14575G;

    /* renamed from: H, reason: collision with root package name */
    public final float f14576H;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f14577a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f14578b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f14579c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f14580d;

    /* renamed from: e, reason: collision with root package name */
    public final float f14581e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14582f;

    /* renamed from: x, reason: collision with root package name */
    public final int f14583x;

    /* renamed from: y, reason: collision with root package name */
    public final float f14584y;

    /* renamed from: z, reason: collision with root package name */
    public final int f14585z;

    public C1305b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f7, int i7, int i8, float f8, int i9, int i10, float f9, float f10, float f11, boolean z4, int i11, int i12, float f12) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            AbstractC1664a.f(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f14577a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f14577a = charSequence.toString();
        } else {
            this.f14577a = null;
        }
        this.f14578b = alignment;
        this.f14579c = alignment2;
        this.f14580d = bitmap;
        this.f14581e = f7;
        this.f14582f = i7;
        this.f14583x = i8;
        this.f14584y = f8;
        this.f14585z = i9;
        this.f14569A = f10;
        this.f14570B = f11;
        this.f14571C = z4;
        this.f14572D = i11;
        this.f14573E = i10;
        this.f14574F = f9;
        this.f14575G = i12;
        this.f14576H = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1305b.class != obj.getClass()) {
            return false;
        }
        C1305b c1305b = (C1305b) obj;
        if (TextUtils.equals(this.f14577a, c1305b.f14577a) && this.f14578b == c1305b.f14578b && this.f14579c == c1305b.f14579c) {
            Bitmap bitmap = c1305b.f14580d;
            Bitmap bitmap2 = this.f14580d;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f14581e == c1305b.f14581e && this.f14582f == c1305b.f14582f && this.f14583x == c1305b.f14583x && this.f14584y == c1305b.f14584y && this.f14585z == c1305b.f14585z && this.f14569A == c1305b.f14569A && this.f14570B == c1305b.f14570B && this.f14571C == c1305b.f14571C && this.f14572D == c1305b.f14572D && this.f14573E == c1305b.f14573E && this.f14574F == c1305b.f14574F && this.f14575G == c1305b.f14575G && this.f14576H == c1305b.f14576H) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14577a, this.f14578b, this.f14579c, this.f14580d, Float.valueOf(this.f14581e), Integer.valueOf(this.f14582f), Integer.valueOf(this.f14583x), Float.valueOf(this.f14584y), Integer.valueOf(this.f14585z), Float.valueOf(this.f14569A), Float.valueOf(this.f14570B), Boolean.valueOf(this.f14571C), Integer.valueOf(this.f14572D), Integer.valueOf(this.f14573E), Float.valueOf(this.f14574F), Integer.valueOf(this.f14575G), Float.valueOf(this.f14576H)});
    }
}
