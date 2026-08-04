package p073k2;

import G4.C0269b;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import p068j2.b;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0269b f14721c = new C0269b(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f14722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14723b;

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
        this.f14722a = new b(spannableStringBuilder, alignment, null, null, f7, 0, i7, f8, i8, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z7, i11, Integer.MIN_VALUE, 0.0f);
        this.f14723b = i10;
    }
}
