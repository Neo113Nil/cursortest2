package v1;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import com.google.android.gms.internal.ads.RunnableC0920e5;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import k4.AbstractC2036a;
import l3.C2054a;
import r.C2328f;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f20343j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile k f20344k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f20345a;

    /* renamed from: b, reason: collision with root package name */
    public final C2328f f20346b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f20347c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f20348d;

    /* renamed from: e, reason: collision with root package name */
    public final g f20349e;
    public final i f;

    /* renamed from: g, reason: collision with root package name */
    public final C2054a f20350g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20351h;
    public final e i;

    public k(r rVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f20345a = reentrantReadWriteLock;
        this.f20347c = 3;
        i iVar = rVar.f20371a;
        this.f = iVar;
        int i = rVar.f20372b;
        this.f20351h = i;
        this.i = rVar.f20373c;
        this.f20348d = new Handler(Looper.getMainLooper());
        this.f20346b = new C2328f(0);
        this.f20350g = new C2054a(11);
        g gVar = new g(this);
        this.f20349e = gVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f20347c = 0;
            } catch (Throwable th) {
                this.f20345a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                iVar.f(new f(gVar));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static k a() {
        k kVar;
        synchronized (f20343j) {
            try {
                kVar = f20344k;
                if (!(kVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return kVar;
    }

    public static boolean d() {
        return f20344k != null;
    }

    public final int b(CharSequence charSequence, int i) {
        if (!(c() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        AbstractC2036a.o("charSequence cannot be null", charSequence);
        v3.e eVar = this.f20349e.f20341b;
        eVar.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            w[] wVarArr = (w[]) spanned.getSpans(i, i + 1, w.class);
            if (wVarArr.length > 0) {
                return spanned.getSpanStart(wVarArr[0]);
            }
        }
        return ((o) eVar.I(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new o(i))).f20355l;
    }

    public final int c() {
        this.f20345a.readLock().lock();
        try {
            return this.f20347c;
        } finally {
            this.f20345a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.f20351h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (c() == 1) {
            return;
        }
        this.f20345a.writeLock().lock();
        try {
            if (this.f20347c == 0) {
                return;
            }
            this.f20347c = 0;
            this.f20345a.writeLock().unlock();
            g gVar = this.f20349e;
            k kVar = gVar.f20340a;
            try {
                kVar.f.f(new f(gVar));
            } catch (Throwable th) {
                kVar.f(th);
            }
        } finally {
            this.f20345a.writeLock().unlock();
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f20345a.writeLock().lock();
        try {
            this.f20347c = 2;
            arrayList.addAll(this.f20346b);
            this.f20346b.clear();
            this.f20345a.writeLock().unlock();
            this.f20348d.post(new RunnableC0920e5(arrayList, this.f20347c, th));
        } catch (Throwable th2) {
            this.f20345a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009c A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:82:0x0057, B:85:0x005c, B:87:0x0060, B:89:0x006d, B:35:0x008c, B:37:0x0096, B:39:0x0099, B:41:0x009c, B:43:0x00ac, B:44:0x00af), top: B:81:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence g(int i, int i5, int i6, CharSequence charSequence) {
        CharSequence charSequence2;
        Throwable th;
        int i7;
        int i8;
        w[] wVarArr;
        if (!(c() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        if (!(i <= i5)) {
            throw new IllegalArgumentException("start should be <= than end");
        }
        y yVar = null;
        if (charSequence == null) {
            return null;
        }
        if (!(i <= charSequence.length())) {
            throw new IllegalArgumentException("start should be < than charSequence length");
        }
        if (!(i5 <= charSequence.length())) {
            throw new IllegalArgumentException("end should be < than charSequence length");
        }
        if (charSequence.length() == 0 || i == i5) {
            return charSequence;
        }
        boolean z3 = i6 == 1;
        v3.e eVar = this.f20349e.f20341b;
        eVar.getClass();
        boolean z5 = charSequence instanceof u;
        if (z5) {
            ((u) charSequence).a();
        }
        try {
            if (!z5) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i5 + 1, w.class) <= i5) {
                            yVar = new y();
                            yVar.f20389k = false;
                            yVar.f20390l = new SpannableString(charSequence);
                        }
                        if (yVar != null && (wVarArr = (w[]) yVar.f20390l.getSpans(i, i5, w.class)) != null && wVarArr.length > 0) {
                            for (w wVar : wVarArr) {
                                int spanStart = yVar.f20390l.getSpanStart(wVar);
                                int spanEnd = yVar.f20390l.getSpanEnd(wVar);
                                if (spanStart != i5) {
                                    yVar.removeSpan(wVar);
                                }
                                i = Math.min(spanStart, i);
                                i5 = Math.max(spanEnd, i5);
                            }
                        }
                        i7 = i;
                        i8 = i5;
                        if (i7 != i8 || i7 >= charSequence.length()) {
                            charSequence2 = charSequence;
                            if (!z5) {
                                return charSequence2;
                            }
                        } else {
                            charSequence2 = charSequence;
                            try {
                                y yVar2 = (y) eVar.I(charSequence2, i7, i8, Integer.MAX_VALUE, z3, new v3.g(23, yVar, (C2054a) eVar.f20432l));
                                if (yVar2 != null) {
                                    Spannable spannable = yVar2.f20390l;
                                    if (z5) {
                                        ((u) charSequence2).b();
                                    }
                                    return spannable;
                                }
                                if (!z5) {
                                    return charSequence2;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                if (!z5) {
                                    throw th;
                                }
                                ((u) charSequence2).b();
                                throw th;
                            }
                        }
                        ((u) charSequence2).b();
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    charSequence2 = charSequence;
                    if (!z5) {
                    }
                }
            }
            yVar = new y((Spannable) charSequence);
            if (yVar != null) {
                while (r1 < r3) {
                }
            }
            i7 = i;
            i8 = i5;
            if (i7 != i8) {
            }
            charSequence2 = charSequence;
            if (!z5) {
            }
            ((u) charSequence2).b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
            th = th;
            if (!z5) {
            }
        }
    }

    public final void h(h hVar) {
        AbstractC2036a.o("initCallback cannot be null", hVar);
        this.f20345a.writeLock().lock();
        try {
            if (this.f20347c != 1 && this.f20347c != 2) {
                this.f20346b.add(hVar);
                this.f20345a.writeLock().unlock();
            }
            this.f20348d.post(new RunnableC0920e5(Arrays.asList(hVar), this.f20347c, (Throwable) null));
            this.f20345a.writeLock().unlock();
        } catch (Throwable th) {
            this.f20345a.writeLock().unlock();
            throw th;
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        g gVar = this.f20349e;
        gVar.getClass();
        Bundle bundle = editorInfo.extras;
        w1.b bVar = (w1.b) gVar.f20342c.f17994l;
        int a5 = bVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a5 != 0 ? ((ByteBuffer) bVar.f6158n).getInt(a5 + bVar.f6155k) : 0);
        Bundle bundle2 = editorInfo.extras;
        gVar.f20340a.getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
