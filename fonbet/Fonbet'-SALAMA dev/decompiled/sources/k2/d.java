package k2;

import G4.C0269b;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import j2.C1305b;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0269b f14715c = new C0269b(13);

    /* renamed from: a, reason: collision with root package name */
    public final C1305b f14716a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14717b;

    public d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f7, int i7, float f8, int i8, boolean z4, int i9, int i10) {
        boolean z7;
        int i11;
        if (z4) {
            i11 = i9;
            z7 = true;
        } else {
            z7 = false;
            i11 = -16777216;
        }
        this.f14716a = new C1305b(spannableStringBuilder, alignment, null, null, f7, 0, i7, f8, i8, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z7, i11, Integer.MIN_VALUE, 0.0f);
        this.f14717b = i10;
    }
}
