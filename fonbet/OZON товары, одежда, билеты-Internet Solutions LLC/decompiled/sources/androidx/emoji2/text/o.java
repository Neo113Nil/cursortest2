package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import androidx.annotation.NonNull;
import androidx.emoji2.text.j;
import androidx.emoji2.text.u;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes8.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final j.d f42715a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final u f42716b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private j.e f42717c;

    private static class a implements b<y> {

        /* renamed from: a, reason: collision with root package name */
        public y f42718a;

        /* renamed from: b, reason: collision with root package name */
        private final j.d f42719b;

        a(y yVar, j.d dVar) {
            this.f42718a = yVar;
            this.f42719b = dVar;
        }

        @Override // androidx.emoji2.text.o.b
        public final boolean a(@NonNull CharSequence charSequence, int i11, int i12, w wVar) {
            if (wVar.k()) {
                return true;
            }
            if (this.f42718a == null) {
                this.f42718a = new y(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f42719b.getClass();
            this.f42718a.setSpan(new x(wVar), i11, i12, 33);
            return true;
        }

        @Override // androidx.emoji2.text.o.b
        public final y getResult() {
            return this.f42718a;
        }
    }

    private interface b<T> {
        boolean a(@NonNull CharSequence charSequence, int i11, int i12, w wVar);

        T getResult();
    }

    private static class c implements b<c> {

        /* renamed from: a, reason: collision with root package name */
        private final int f42720a;

        /* renamed from: b, reason: collision with root package name */
        public int f42721b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f42722c = -1;

        c(int i11) {
            this.f42720a = i11;
        }

        @Override // androidx.emoji2.text.o.b
        public final boolean a(@NonNull CharSequence charSequence, int i11, int i12, w wVar) {
            int i13 = this.f42720a;
            if (i11 > i13 || i13 >= i12) {
                return i12 <= i13;
            }
            this.f42721b = i11;
            this.f42722c = i12;
            return false;
        }

        @Override // androidx.emoji2.text.o.b
        public final c getResult() {
            return this;
        }
    }

    private static class d implements b<d> {

        /* renamed from: a, reason: collision with root package name */
        private final String f42723a;

        d(String str) {
            this.f42723a = str;
        }

        @Override // androidx.emoji2.text.o.b
        public final boolean a(@NonNull CharSequence charSequence, int i11, int i12, w wVar) {
            if (!TextUtils.equals(charSequence.subSequence(i11, i12), this.f42723a)) {
                return true;
            }
            wVar.l();
            return false;
        }

        @Override // androidx.emoji2.text.o.b
        public final d getResult() {
            return this;
        }
    }

    static final class e {

        /* renamed from: a, reason: collision with root package name */
        private int f42724a = 1;

        /* renamed from: b, reason: collision with root package name */
        private final u.a f42725b;

        /* renamed from: c, reason: collision with root package name */
        private u.a f42726c;

        /* renamed from: d, reason: collision with root package name */
        private u.a f42727d;

        /* renamed from: e, reason: collision with root package name */
        private int f42728e;

        /* renamed from: f, reason: collision with root package name */
        private int f42729f;

        e(u.a aVar) {
            this.f42725b = aVar;
            this.f42726c = aVar;
        }

        private void e() {
            this.f42724a = 1;
            this.f42726c = this.f42725b;
            this.f42729f = 0;
        }

        private boolean f() {
            return this.f42726c.b().j() || this.f42728e == 65039;
        }

        final int a(int i11) {
            u.a a11 = this.f42726c.a(i11);
            int i12 = 1;
            if (this.f42724a == 2) {
                if (a11 != null) {
                    this.f42726c = a11;
                    this.f42729f++;
                } else if (i11 == 65038) {
                    e();
                } else if (i11 != 65039) {
                    if (this.f42726c.b() != null) {
                        if (this.f42729f != 1) {
                            this.f42727d = this.f42726c;
                            e();
                        } else if (f()) {
                            this.f42727d = this.f42726c;
                            e();
                        } else {
                            e();
                        }
                        i12 = 3;
                    } else {
                        e();
                    }
                }
                i12 = 2;
            } else if (a11 == null) {
                e();
            } else {
                this.f42724a = 2;
                this.f42726c = a11;
                this.f42729f = 1;
                i12 = 2;
            }
            this.f42728e = i11;
            return i12;
        }

        final w b() {
            return this.f42726c.b();
        }

        final w c() {
            return this.f42727d.b();
        }

        final boolean d() {
            if (this.f42724a != 2 || this.f42726c.b() == null) {
                return false;
            }
            return this.f42729f > 1 || f();
        }
    }

    o(@NonNull u uVar, @NonNull j.d dVar, @NonNull j.e eVar, @NonNull Set set) {
        this.f42715a = dVar;
        this.f42716b = uVar;
        this.f42717c = eVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            h(str, 0, str.length(), 1, true, new d(str));
        }
    }

    private static boolean a(@NonNull Editable editable, @NonNull KeyEvent keyEvent, boolean z11) {
        p[] pVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (pVarArr = (p[]) editable.getSpans(selectionStart, selectionEnd, p.class)) != null && pVarArr.length > 0) {
                for (p pVar : pVarArr) {
                    int spanStart = editable.getSpanStart(pVar);
                    int spanEnd = editable.getSpanEnd(pVar);
                    if ((z11 && spanStart == selectionStart) || ((!z11 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean d(@NonNull InputConnection inputConnection, @NonNull Editable editable, int i11, int i12, boolean z11) {
        int min;
        if (editable != null && i11 >= 0 && i12 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z11) {
                    int max = Math.max(i11, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z12 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z12) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z12 = true;
                                    }
                                } else if (!z12) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i12, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z13 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z13) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z13 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i11, 0);
                    min = Math.min(selectionEnd + i12, editable.length());
                }
                p[] pVarArr = (p[]) editable.getSpans(selectionStart, min, p.class);
                if (pVarArr != null && pVarArr.length > 0) {
                    for (p pVar : pVarArr) {
                        int spanStart = editable.getSpanStart(pVar);
                        int spanEnd = editable.getSpanEnd(pVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    InputConnectionWrapper inputConnectionWrapper = (InputConnectionWrapper) inputConnection;
                    inputConnectionWrapper.beginBatchEdit();
                    editable.delete(max3, min2);
                    inputConnectionWrapper.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    static boolean e(@NonNull Editable editable, int i11, @NonNull KeyEvent keyEvent) {
        if (!(i11 != 67 ? i11 != 112 ? false : a(editable, keyEvent, true) : a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean f(CharSequence charSequence, int i11, int i12, w wVar) {
        if (wVar.d() == 0) {
            wVar.h();
            wVar.m(((h) this.f42717c).a(i11, i12, charSequence));
        }
        return wVar.d() == 2;
    }

    private <T> T h(@NonNull CharSequence charSequence, int i11, int i12, int i13, boolean z11, b<T> bVar) {
        int i14;
        e eVar = new e(this.f42716b.e());
        int codePointAt = Character.codePointAt(charSequence, i11);
        int i15 = 0;
        boolean z12 = true;
        loop0: while (true) {
            int i16 = codePointAt;
            while (true) {
                i14 = i11;
                while (i11 < i12 && i15 < i13 && z12) {
                    int a11 = eVar.a(i16);
                    if (a11 == 1) {
                        i11 = Character.charCount(Character.codePointAt(charSequence, i14)) + i14;
                        if (i11 < i12) {
                            break;
                        }
                    } else if (a11 == 2) {
                        int charCount = Character.charCount(i16) + i11;
                        if (charCount < i12) {
                            i16 = Character.codePointAt(charSequence, charCount);
                        }
                        i11 = charCount;
                    } else if (a11 == 3) {
                        if (z11 || !f(charSequence, i14, i11, eVar.c())) {
                            z12 = bVar.a(charSequence, i14, i11, eVar.c());
                            i15++;
                        }
                    }
                }
            }
            codePointAt = Character.codePointAt(charSequence, i11);
        }
        if (eVar.d() && i15 < i13 && z12 && (z11 || !f(charSequence, i14, i11, eVar.b()))) {
            bVar.a(charSequence, i14, i11, eVar.b());
        }
        return bVar.getResult();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final int b(int i11, @NonNull String str) {
        if (i11 < 0 || i11 >= str.length()) {
            return -1;
        }
        if (str instanceof Spanned) {
            Spanned spanned = (Spanned) str;
            p[] pVarArr = (p[]) spanned.getSpans(i11, i11 + 1, p.class);
            if (pVarArr.length > 0) {
                return spanned.getSpanEnd(pVarArr[0]);
            }
        }
        return ((c) h(str, Math.max(0, i11 - 16), Math.min(str.length(), i11 + 16), Integer.MAX_VALUE, true, new c(i11))).f42722c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final int c(int i11, @NonNull String str) {
        if (i11 < 0 || i11 >= str.length()) {
            return -1;
        }
        if (str instanceof Spanned) {
            Spanned spanned = (Spanned) str;
            p[] pVarArr = (p[]) spanned.getSpans(i11, i11 + 1, p.class);
            if (pVarArr.length > 0) {
                return spanned.getSpanStart(pVarArr[0]);
            }
        }
        return ((c) h(str, Math.max(0, i11 - 16), Math.min(str.length(), i11 + 16), Integer.MAX_VALUE, true, new c(i11))).f42721b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0095, code lost:
    
        if (r1 != false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:16:0x003b, B:18:0x0043, B:20:0x0046, B:22:0x004a, B:24:0x0056, B:25:0x0059), top: B:6:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final CharSequence g(@NonNull CharSequence charSequence, int i11, int i12, boolean z11) {
        y yVar;
        Throwable th2;
        CharSequence charSequence2;
        int i13;
        int i14;
        p[] pVarArr;
        boolean z12 = charSequence instanceof v;
        if (z12) {
            ((v) charSequence).a();
        }
        try {
            if (!z12) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        yVar = (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i11 + (-1), i12 + 1, p.class) > i12) ? null : new y(charSequence);
                        if (yVar != null && (pVarArr = (p[]) yVar.getSpans(i11, i12, p.class)) != null && pVarArr.length > 0) {
                            for (p pVar : pVarArr) {
                                int spanStart = yVar.getSpanStart(pVar);
                                int spanEnd = yVar.getSpanEnd(pVar);
                                if (spanStart != i12) {
                                    yVar.removeSpan(pVar);
                                }
                                i11 = Math.min(spanStart, i11);
                                i12 = Math.max(spanEnd, i12);
                            }
                        }
                        i13 = i11;
                        i14 = i12;
                        if (i13 != i14 || i13 >= charSequence.length()) {
                            charSequence2 = charSequence;
                            if (!z12) {
                                return charSequence2;
                            }
                        } else {
                            charSequence2 = charSequence;
                            try {
                                y yVar2 = (y) h(charSequence2, i13, i14, Integer.MAX_VALUE, z11, new a(yVar, this.f42715a));
                                if (yVar2 != null) {
                                    Spannable b11 = yVar2.b();
                                    if (z12) {
                                        ((v) charSequence2).d();
                                    }
                                    return b11;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                th2 = th;
                                if (!z12) {
                                    throw th2;
                                }
                                ((v) charSequence2).d();
                                throw th2;
                            }
                        }
                        ((v) charSequence2).d();
                        return charSequence2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    charSequence2 = charSequence;
                    if (!z12) {
                    }
                }
            }
            yVar = new y((Spannable) charSequence);
            if (yVar != null) {
                while (r4 < r3) {
                }
            }
            i13 = i11;
            i14 = i12;
            if (i13 != i14) {
            }
            charSequence2 = charSequence;
            if (!z12) {
            }
            ((v) charSequence2).d();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
            th2 = th;
            if (!z12) {
            }
        }
    }
}
