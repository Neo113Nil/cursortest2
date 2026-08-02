package M0;

import A0.RunnableC0049o;
import I.C0160m;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.widget.TextView;
import com.google.android.gms.internal.ads.AbstractC1668us;
import com.google.android.gms.internal.ads.C1813y1;
import com.google.android.gms.internal.ads.Ct;
import com.google.android.gms.internal.ads.L3;
import i2.g;
import java.lang.Character;
import java.lang.ref.WeakReference;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.l;
import n.AbstractC2107A;
import n.AbstractC2154y;
import n.C2155z;
import r0.AbstractC2346c;
import v1.k;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3589a;

    /* renamed from: b, reason: collision with root package name */
    public int f3590b;

    /* renamed from: c, reason: collision with root package name */
    public int f3591c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3592d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3593e;

    public e(int i, byte b3) {
        this.f3589a = i;
        switch (i) {
            case 4:
                this.f3592d = new long[10];
                this.f3593e = new Object[10];
                break;
        }
    }

    public void a(int i) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0049o(this, i));
    }

    public void b(int i) {
        boolean z3 = false;
        int i5 = this.f3590b;
        int i6 = this.f3591c;
        if (i <= i6 && i5 <= i) {
            z3 = true;
        }
        if (z3) {
            return;
        }
        StringBuilder w5 = AbstractC2107A.w("Invalid offset: ", i, ". Valid range is [", i5, " , ");
        w5.append(i6);
        w5.append(']');
        Q0.a.a(w5.toString());
    }

    public int c() {
        C0160m c0160m = (C0160m) this.f3593e;
        if (c0160m == null) {
            return ((String) this.f3592d).length();
        }
        return (c0160m.f2498b - c0160m.c()) + (((String) this.f3592d).length() - (this.f3591c - this.f3590b));
    }

    public boolean d(int i) {
        int i5 = this.f3590b + 1;
        if (i > this.f3591c || i5 > i) {
            return false;
        }
        CharSequence charSequence = (CharSequence) this.f3592d;
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i6 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i6))) {
                if (!k.d()) {
                    return false;
                }
                k a5 = k.a();
                if (a5.c() != 1 || a5.b(charSequence, i6) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean e(int i) {
        int i5 = this.f3590b + 1;
        if (i > this.f3591c || i5 > i) {
            return false;
        }
        return AbstractC2346c.y(Character.codePointBefore((CharSequence) this.f3592d, i));
    }

    public boolean f(int i) {
        b(i);
        if (!((BreakIterator) this.f3593e).isBoundary(i)) {
            return false;
        }
        if (h(i) && h(i - 1) && h(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.f3592d).length() - 1 || !(g(i) || g(i + 1));
    }

    public boolean g(int i) {
        int i5 = i - 1;
        CharSequence charSequence = (CharSequence) this.f3592d;
        Character.UnicodeBlock of = Character.UnicodeBlock.of(charSequence.charAt(i5));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (l.a(of, unicodeBlock) && l.a(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return l.a(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && l.a(Character.UnicodeBlock.of(charSequence.charAt(i5)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean h(int i) {
        if (i >= this.f3591c || this.f3590b > i) {
            return false;
        }
        CharSequence charSequence = (CharSequence) this.f3592d;
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!k.d()) {
                return false;
            }
            k a5 = k.a();
            if (a5.c() != 1 || a5.b(charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean i(int i) {
        if (i >= this.f3591c || this.f3590b > i) {
            return false;
        }
        return AbstractC2346c.y(Character.codePointAt((CharSequence) this.f3592d, i));
    }

    public int j(int i) {
        b(i);
        int following = ((BreakIterator) this.f3593e).following(i);
        return (h(following + (-1)) && h(following) && !g(following)) ? j(following) : following;
    }

    public void k(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f3590b) != -1) {
            typeface = AbstractC2154y.a(typeface, i, (this.f3591c & 2) != 0);
        }
        C2155z c2155z = (C2155z) this.f3593e;
        if (c2155z.f18345m) {
            c2155z.f18344l = typeface;
            TextView textView = (TextView) ((WeakReference) this.f3592d).get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new g(c2155z.f18342j, 1, textView, typeface));
                } else {
                    textView.setTypeface(typeface, c2155z.f18342j);
                }
            }
        }
    }

    public int l(int i) {
        b(i);
        int preceding = ((BreakIterator) this.f3593e).preceding(i);
        return (h(preceding) && d(preceding) && !g(preceding)) ? l(preceding) : preceding;
    }

    public void m(int i, int i5, String str) {
        if (i > i5) {
            Q0.a.a("start index must be less than or equal to end index: " + i + " > " + i5);
        }
        if (i < 0) {
            Q0.a.a("start must be non-negative, but was " + i);
        }
        C0160m c0160m = (C0160m) this.f3593e;
        if (c0160m == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(((String) this.f3592d).length() - i5, 64);
            String str2 = (String) this.f3592d;
            int i6 = i - min;
            l.d("null cannot be cast to non-null type java.lang.String", str2);
            str2.getChars(i6, i, cArr, 0);
            String str3 = (String) this.f3592d;
            int i7 = max - min2;
            int i8 = min2 + i5;
            l.d("null cannot be cast to non-null type java.lang.String", str3);
            str3.getChars(i5, i8, cArr, i7);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            C0160m c0160m2 = new C0160m(1);
            c0160m2.f2498b = max;
            c0160m2.f2501e = cArr;
            c0160m2.f2499c = length;
            c0160m2.f2500d = i7;
            this.f3593e = c0160m2;
            this.f3590b = i6;
            this.f3591c = i8;
            return;
        }
        int i9 = this.f3590b;
        int i10 = i - i9;
        int i11 = i5 - i9;
        if (i10 < 0 || i11 > c0160m.f2498b - c0160m.c()) {
            this.f3592d = toString();
            this.f3593e = null;
            this.f3590b = -1;
            this.f3591c = -1;
            m(i, i5, str);
            return;
        }
        int length2 = str.length() - (i11 - i10);
        if (length2 > c0160m.c()) {
            int c5 = length2 - c0160m.c();
            int i12 = c0160m.f2498b;
            do {
                i12 *= 2;
            } while (i12 - c0160m.f2498b < c5);
            char[] cArr2 = new char[i12];
            X3.l.u0((char[]) c0160m.f2501e, cArr2, 0, 0, c0160m.f2499c);
            int i13 = c0160m.f2498b;
            int i14 = c0160m.f2500d;
            int i15 = i13 - i14;
            int i16 = i12 - i15;
            X3.l.u0((char[]) c0160m.f2501e, cArr2, i16, i14, i15 + i14);
            c0160m.f2501e = cArr2;
            c0160m.f2498b = i12;
            c0160m.f2500d = i16;
        }
        int i17 = c0160m.f2499c;
        if (i10 < i17 && i11 <= i17) {
            int i18 = i17 - i11;
            char[] cArr3 = (char[]) c0160m.f2501e;
            X3.l.u0(cArr3, cArr3, c0160m.f2500d - i18, i11, i17);
            c0160m.f2499c = i10;
            c0160m.f2500d -= i18;
        } else if (i10 >= i17 || i11 < i17) {
            int c6 = c0160m.c() + i10;
            int c7 = c0160m.c() + i11;
            int i19 = c0160m.f2500d;
            char[] cArr4 = (char[]) c0160m.f2501e;
            X3.l.u0(cArr4, cArr4, c0160m.f2499c, i19, c6);
            c0160m.f2499c += c6 - i19;
            c0160m.f2500d = c7;
        } else {
            c0160m.f2500d = c0160m.c() + i11;
            c0160m.f2499c = i10;
        }
        str.getChars(0, str.length(), (char[]) c0160m.f2501e, c0160m.f2499c);
        c0160m.f2499c = str.length() + c0160m.f2499c;
    }

    public synchronized int n() {
        return this.f3591c;
    }

    public synchronized Object o() {
        if (this.f3591c == 0) {
            return null;
        }
        return t();
    }

    public synchronized Object p(long j5) {
        Object obj;
        obj = null;
        while (this.f3591c > 0 && j5 - ((long[]) this.f3592d)[this.f3590b] >= 0) {
            obj = t();
        }
        return obj;
    }

    public synchronized void q() {
        try {
            Ct ct = (Ct) this.f3593e;
            if (ct.f8101b) {
                ct.f8100a.w2((byte[]) this.f3592d);
                ((Ct) this.f3593e).f8100a.H0(this.f3590b);
                ((Ct) this.f3593e).f8100a.B(this.f3591c);
                ((Ct) this.f3593e).f8100a.k0();
                ((Ct) this.f3593e).f8100a.c();
            }
        } catch (RemoteException e3) {
            Log.d("GASS", "Clearcut log failed", e3);
        }
    }

    public synchronized void r(long j5, Object obj) {
        try {
            if (this.f3591c > 0) {
                if (j5 <= ((long[]) this.f3592d)[((this.f3590b + r0) - 1) % ((Object[]) this.f3593e).length]) {
                    s();
                }
            }
            int length = ((Object[]) this.f3593e).length;
            if (this.f3591c >= length) {
                int i = length + length;
                long[] jArr = new long[i];
                Object[] objArr = new Object[i];
                int i5 = this.f3590b;
                int i6 = length - i5;
                System.arraycopy((long[]) this.f3592d, i5, jArr, 0, i6);
                System.arraycopy((Object[]) this.f3593e, this.f3590b, objArr, 0, i6);
                int i7 = this.f3590b;
                if (i7 > 0) {
                    System.arraycopy((long[]) this.f3592d, 0, jArr, i6, i7);
                    System.arraycopy((Object[]) this.f3593e, 0, objArr, i6, this.f3590b);
                }
                this.f3592d = jArr;
                this.f3593e = objArr;
                this.f3590b = 0;
            }
            int i8 = this.f3590b;
            int i9 = this.f3591c;
            Object[] objArr2 = (Object[]) this.f3593e;
            int length2 = (i8 + i9) % objArr2.length;
            ((long[]) this.f3592d)[length2] = j5;
            objArr2[length2] = obj;
            this.f3591c = i9 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void s() {
        this.f3590b = 0;
        this.f3591c = 0;
        Arrays.fill((Object[]) this.f3593e, (Object) null);
    }

    public Object t() {
        AbstractC1668us.a0(this.f3591c > 0);
        Object[] objArr = (Object[]) this.f3593e;
        int i = this.f3590b;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f3590b = (i + 1) % objArr.length;
        this.f3591c--;
        return obj;
    }

    public String toString() {
        switch (this.f3589a) {
            case 1:
                C0160m c0160m = (C0160m) this.f3593e;
                if (c0160m == null) {
                    return (String) this.f3592d;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) this.f3592d, 0, this.f3590b);
                sb.append((char[]) c0160m.f2501e, 0, c0160m.f2499c);
                char[] cArr = (char[]) c0160m.f2501e;
                int i = c0160m.f2500d;
                sb.append(cArr, i, c0160m.f2498b - i);
                String str = (String) this.f3592d;
                sb.append((CharSequence) str, this.f3591c, str.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public e(int i, ArrayList arrayList, int i5, L3 l32) {
        this.f3589a = 3;
        this.f3590b = i;
        this.f3592d = arrayList;
        this.f3591c = i5;
        this.f3593e = l32;
    }

    public /* synthetic */ e(Ct ct, byte[] bArr) {
        this.f3589a = 5;
        this.f3593e = ct;
        this.f3592d = bArr;
    }

    public e(int i) {
        this.f3589a = 2;
        this.f3592d = new C1813y1[i];
        this.f3591c = 0;
    }

    public e(CharSequence charSequence, int i, Locale locale) {
        this.f3589a = 0;
        this.f3592d = charSequence;
        if (charSequence.length() < 0) {
            Q0.a.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            Q0.a.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f3593e = wordInstance;
        this.f3590b = Math.max(0, -50);
        this.f3591c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new L0.b(charSequence, i));
    }

    public e(C2155z c2155z, int i, int i5, WeakReference weakReference) {
        this.f3589a = 6;
        this.f3593e = c2155z;
        this.f3590b = i;
        this.f3591c = i5;
        this.f3592d = weakReference;
    }
}
