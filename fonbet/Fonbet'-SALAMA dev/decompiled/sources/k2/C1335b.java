package k2;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import j2.C1305b;
import java.util.ArrayList;
import v2.t;

/* renamed from: k2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1335b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14681a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f14682b;

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f14683c;

    /* renamed from: d, reason: collision with root package name */
    public int f14684d;

    /* renamed from: e, reason: collision with root package name */
    public int f14685e;

    /* renamed from: f, reason: collision with root package name */
    public int f14686f;

    /* renamed from: g, reason: collision with root package name */
    public int f14687g;

    /* renamed from: h, reason: collision with root package name */
    public int f14688h;

    public C1335b(int i7, int i8) {
        ArrayList arrayList = new ArrayList();
        this.f14681a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f14682b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.f14683c = sb;
        this.f14687g = i7;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.f14684d = 15;
        this.f14685e = 0;
        this.f14686f = 0;
        this.f14688h = i8;
    }

    public final void a(char c3) {
        StringBuilder sb = this.f14683c;
        if (sb.length() < 32) {
            sb.append(c3);
        }
    }

    public final void b() {
        StringBuilder sb = this.f14683c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.f14681a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C1334a c1334a = (C1334a) arrayList.get(size);
                int i7 = c1334a.f14680c;
                if (i7 != length) {
                    return;
                }
                c1334a.f14680c = i7 - 1;
            }
        }
    }

    public final C1305b c(int i7) {
        float f7;
        int i8 = this.f14685e + this.f14686f;
        int i9 = 32 - i8;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f14682b;
            if (i10 >= arrayList.size()) {
                break;
            }
            CharSequence charSequence = (CharSequence) arrayList.get(i10);
            int i11 = t.f17153a;
            if (charSequence.length() > i9) {
                charSequence = charSequence.subSequence(0, i9);
            }
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append('\n');
            i10++;
        }
        SpannableString d7 = d();
        int i12 = t.f17153a;
        int length = d7.length();
        CharSequence charSequence2 = d7;
        if (length > i9) {
            charSequence2 = d7.subSequence(0, i9);
        }
        spannableStringBuilder.append(charSequence2);
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int length2 = i9 - spannableStringBuilder.length();
        int i13 = i8 - length2;
        int i14 = i7 != Integer.MIN_VALUE ? i7 : (this.f14687g != 2 || (Math.abs(i13) >= 3 && length2 >= 0)) ? (this.f14687g != 2 || i13 <= 0) ? 0 : 2 : 1;
        if (i14 != 1) {
            if (i14 == 2) {
                i8 = 32 - length2;
            }
            f7 = ((i8 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f7 = 0.5f;
        }
        float f8 = f7;
        int i15 = this.f14684d;
        if (i15 > 7) {
            i15 -= 17;
        } else if (this.f14687g == 1) {
            i15 -= this.f14688h - 1;
        }
        return new C1305b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i15, 1, Integer.MIN_VALUE, f8, i14, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f14683c);
        int length = spannableStringBuilder.length();
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f14681a;
            if (i11 >= arrayList.size()) {
                break;
            }
            C1334a c1334a = (C1334a) arrayList.get(i11);
            boolean z7 = c1334a.f14679b;
            int i13 = c1334a.f14678a;
            if (i13 != 8) {
                boolean z8 = i13 == 7;
                if (i13 != 7) {
                    i10 = c.f14691R[i13];
                }
                z4 = z8;
            }
            int i14 = c1334a.f14680c;
            i11++;
            if (i14 != (i11 < arrayList.size() ? ((C1334a) arrayList.get(i11)).f14680c : length)) {
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
        return this.f14681a.isEmpty() && this.f14682b.isEmpty() && this.f14683c.length() == 0;
    }
}
