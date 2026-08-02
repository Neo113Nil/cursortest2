package p000;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: pv */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0595pv {

    /* JADX INFO: renamed from: j */
    public static final Object f6260j = new Object();

    /* JADX INFO: renamed from: k */
    public static volatile C0595pv f6261k;

    /* JADX INFO: renamed from: a */
    public final ReentrantReadWriteLock f6262a;

    /* JADX INFO: renamed from: b */
    public final C0165e8 f6263b;

    /* JADX INFO: renamed from: c */
    public volatile int f6264c;

    /* JADX INFO: renamed from: d */
    public final Handler f6265d;

    /* JADX INFO: renamed from: e */
    public final C0447lv f6266e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0558ov f6267f;

    /* JADX INFO: renamed from: g */
    public final o31 f6268g;

    /* JADX INFO: renamed from: h */
    public final int f6269h;

    /* JADX INFO: renamed from: i */
    public final C0442lq f6270i;

    public C0595pv(h40 h40Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f6262a = reentrantReadWriteLock;
        this.f6264c = 3;
        InterfaceC0558ov interfaceC0558ov = h40Var.f3043a;
        this.f6267f = interfaceC0558ov;
        int i = h40Var.f3044b;
        this.f6269h = i;
        this.f6270i = h40Var.f3045c;
        this.f6265d = new Handler(Looper.getMainLooper());
        this.f6263b = new C0165e8();
        this.f6268g = new o31(21);
        C0447lv c0447lv = new C0447lv(this);
        this.f6266e = c0447lv;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f6264c = 0;
            } catch (Throwable th) {
                this.f6262a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m3995b() == 0) {
            try {
                interfaceC0558ov.mo1479d(new C0410kv(c0447lv));
            } catch (Throwable th2) {
                m3997d(th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0595pv m3994a() {
        C0595pv c0595pv;
        synchronized (f6260j) {
            try {
                c0595pv = f6261k;
                if (!(c0595pv != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0595pv;
    }

    /* JADX INFO: renamed from: b */
    public final int m3995b() {
        this.f6262a.readLock().lock();
        try {
            return this.f6264c;
        } finally {
            this.f6262a.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3996c() {
        if (!(this.f6269h == 1)) {
            C0270h1.m2191g("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (m3995b() == 1) {
            return;
        }
        this.f6262a.writeLock().lock();
        try {
            if (this.f6264c == 0) {
                this.f6262a.writeLock().unlock();
                return;
            }
            this.f6264c = 0;
            this.f6262a.writeLock().unlock();
            C0447lv c0447lv = this.f6266e;
            C0595pv c0595pv = c0447lv.f4911a;
            try {
                c0595pv.f6267f.mo1479d(new C0410kv(c0447lv));
            } catch (Throwable th) {
                c0595pv.m3997d(th);
            }
        } catch (Throwable th2) {
            this.f6262a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3997d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f6262a.writeLock().lock();
        try {
            this.f6264c = 2;
            arrayList.addAll(this.f6263b);
            this.f6263b.clear();
            this.f6262a.writeLock().unlock();
            this.f6265d.post(new RunnableC0521nv(arrayList, this.f6264c, th));
        } catch (Throwable th2) {
            this.f6262a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0096 A[Catch: all -> 0x0079, TryCatch #2 {all -> 0x0079, blocks: (B:35:0x0051, B:38:0x0056, B:40:0x005a, B:42:0x0067, B:49:0x0086, B:51:0x0090, B:53:0x0093, B:55:0x0096, B:57:0x00a6, B:58:0x00a9), top: B:107:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6 A[Catch: all -> 0x0079, TryCatch #2 {all -> 0x0079, blocks: (B:35:0x0051, B:38:0x0056, B:40:0x005a, B:42:0x0067, B:49:0x0086, B:51:0x0090, B:53:0x0093, B:55:0x0096, B:57:0x00a6, B:58:0x00a9), top: B:107:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00be  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc  */
    /* JADX INFO: renamed from: e */
    public final CharSequence m3998e(CharSequence charSequence, int i, int i2) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i3;
        int i4;
        bf1[] bf1VarArr;
        int spanStart;
        wf1 wf1Var = null;
        if (!(m3995b() == 1)) {
            C0270h1.m2191g("Not initialized yet");
            return null;
        }
        if (i < 0) {
            C0270h1.m2190f("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            C0270h1.m2190f("end cannot be negative");
            return null;
        }
        if (!(i <= i2)) {
            C0270h1.m2190f("start should be <= than end");
            return null;
        }
        if (charSequence == null) {
            return null;
        }
        if (!(i <= charSequence.length())) {
            C0270h1.m2190f("start should be < than charSequence length");
            return null;
        }
        if (!(i2 <= charSequence.length())) {
            C0270h1.m2190f("end should be < than charSequence length");
            return null;
        }
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        qd0 qd0Var = this.f6266e.f4912b;
        qd0Var.getClass();
        boolean z = charSequence instanceof f91;
        if (z) {
            ((f91) charSequence).m1746a();
        }
        if (z) {
            wf1Var = new wf1((Spannable) charSequence);
            if (wf1Var != null) {
                for (bf1 bf1Var : bf1VarArr) {
                    spanStart = wf1Var.f8537k.getSpanStart(bf1Var);
                    int spanEnd = wf1Var.f8537k.getSpanEnd(bf1Var);
                    if (spanStart != i2) {
                        wf1Var.removeSpan(bf1Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd, i2);
                }
            }
            i3 = i;
            i4 = i2;
            if (i3 != i4) {
                charSequence2 = charSequence;
                if (!z) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z) {
                    return charSequence2;
                }
            }
            ((f91) charSequence2).m1747b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    wf1Var = new wf1((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z) {
                        throw th;
                    }
                    ((f91) charSequence2).m1747b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, bf1.class) <= i2) {
                wf1Var = new wf1();
                wf1Var.f8536j = false;
                wf1Var.f8537k = new SpannableString(charSequence);
            }
            if (wf1Var != null && (bf1VarArr = (bf1[]) wf1Var.f8537k.getSpans(i, i2, bf1.class)) != null && bf1VarArr.length > 0) {
                while (i < r2) {
                    spanStart = wf1Var.f8537k.getSpanStart(bf1Var);
                    int spanEnd2 = wf1Var.f8537k.getSpanEnd(bf1Var);
                    if (spanStart != i2) {
                        wf1Var.removeSpan(bf1Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd2, i2);
                }
            }
            i3 = i;
            i4 = i2;
            if (i3 != i4 || i3 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z) {
                    return charSequence2;
                }
            } else {
                try {
                    charSequence2 = charSequence;
                    try {
                        wf1 wf1Var2 = (wf1) qd0Var.m4085w(charSequence2, i3, i4, Integer.MAX_VALUE, false, new C0312i6(24, wf1Var, (o31) qd0Var.f6471k));
                        if (wf1Var2 != null) {
                            Spannable spannable = wf1Var2.f8537k;
                            if (z) {
                                ((f91) charSequence2).m1747b();
                            }
                            return spannable;
                        }
                        if (!z) {
                            return charSequence2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        if (!z) {
                            throw th;
                        }
                        ((f91) charSequence2).m1747b();
                        throw th;
                    }
                } catch (Throwable th4) {
                    charSequence2 = charSequence;
                    th = th4;
                }
            }
            ((f91) charSequence2).m1747b();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
        }
        if (!z) {
            throw th;
        }
        ((f91) charSequence2).m1747b();
        throw th;
    }

    /* JADX INFO: renamed from: f */
    public final void m3999f(AbstractC0484mv abstractC0484mv) {
        hn0.m2313g(abstractC0484mv, "initCallback cannot be null");
        this.f6262a.writeLock().lock();
        try {
            if (this.f6264c == 1 || this.f6264c == 2) {
                this.f6265d.post(new RunnableC0521nv(Arrays.asList(abstractC0484mv), this.f6264c, null));
            } else {
                this.f6263b.add(abstractC0484mv);
            }
        } finally {
            this.f6262a.writeLock().unlock();
        }
    }
}
