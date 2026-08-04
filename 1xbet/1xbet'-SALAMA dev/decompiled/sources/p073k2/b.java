package p073k2;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f14689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14694h;

    public b(int i7, int i8) {
        ArrayList arrayList = new ArrayList();
        this.f14687a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f14688b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.f14689c = sb;
        this.f14693g = i7;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.f14690d = 15;
        this.f14691e = 0;
        this.f14692f = 0;
        this.f14694h = i8;
    }

    public final void a(char c3) {
        StringBuilder sb = this.f14689c;
        if (sb.length() < 32) {
            sb.append(c3);
        }
    }

    public final void b() {
        StringBuilder sb = this.f14689c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.f14687a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i7 = aVar.f14686c;
                if (i7 != length) {
                    return;
                }
                aVar.f14686c = i7 - 1;
            }
        }
    }

    public final p068j2.b c(int i7) {
        int i8;
        float f7;
        int i9 = this.f14691e + this.f14692f;
        int i10 = 32 - i9;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f14688b;
            if (i11 >= arrayList.size()) {
                break;
            }
            CharSequence charSequenceSubSequence = (CharSequence) arrayList.get(i11);
            int i12 = t.f17159a;
            if (charSequenceSubSequence.length() > i10) {
                charSequenceSubSequence = charSequenceSubSequence.subSequence(0, i10);
            }
            spannableStringBuilder.append(charSequenceSubSequence);
            spannableStringBuilder.append('\n');
            i11++;
        }
        SpannableString spannableStringD = d();
        int i13 = t.f17159a;
        int length = spannableStringD.length();
        SpannableString spannableStringSubSequence = spannableStringD;
        if (length > i10) {
            spannableStringSubSequence = spannableStringD.subSequence(0, i10);
        }
        spannableStringBuilder.append((CharSequence) spannableStringSubSequence);
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int length2 = i10 - spannableStringBuilder.length();
        int i14 = i9 - length2;
        if (i7 != Integer.MIN_VALUE) {
            i8 = i7;
        } else if (this.f14693g != 2 || (Math.abs(i14) >= 3 && length2 >= 0)) {
            i8 = (this.f14693g != 2 || i14 <= 0) ? 0 : 2;
        } else {
            i8 = 1;
        }
        if (i8 != 1) {
            if (i8 == 2) {
                i9 = 32 - length2;
            }
            f7 = ((i9 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f7 = 0.5f;
        }
        float f8 = f7;
        int i15 = this.f14690d;
        if (i15 > 7) {
            i15 -= 17;
        } else if (this.f14693g == 1) {
            i15 -= this.f14694h - 1;
        }
        return new p068j2.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i15, 1, Integer.MIN_VALUE, f8, i8, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f14689c);
        int length = spannableStringBuilder.length();
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f14687a;
            if (i11 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i11);
            boolean z7 = aVar.f14685b;
            int i13 = aVar.f14684a;
            if (i13 != 8) {
                boolean z8 = i13 == 7;
                if (i13 != 7) {
                    i10 = c.f14697R[i13];
                }
                z4 = z8;
            }
            int i14 = aVar.f14686c;
            i11++;
            if (i14 != (i11 < arrayList.size() ? ((a) arrayList.get(i11)).f14686c : length)) {
                if (i7 != -1 && !z7) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i7, i14, 33);
                    i7 = -1;
                } else if (i7 == -1 && z7) {
                    i7 = i14;
                }
                if (i8 != -1 && !z4) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i8, i14, 33);
                    i8 = -1;
                } else if (i8 == -1 && z4) {
                    i8 = i14;
                }
                if (i10 != i9) {
                    if (i9 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i9), i12, i14, 33);
                    }
                    i9 = i10;
                    i12 = i14;
                }
            }
        }
        if (i7 != -1 && i7 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i7, length, 33);
        }
        if (i8 != -1 && i8 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i8, length, 33);
        }
        if (i12 != length && i9 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i9), i12, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.f14687a.isEmpty() && this.f14688b.isEmpty() && this.f14689c.length() == 0;
    }
}
