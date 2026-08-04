package p046g0;

import W5.RunnableC0493d;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p097n3.a;
import p122r.c;
import p155w1.F0;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f13028i = new Object();
    public static volatile j j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f13029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f13030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f13031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f13032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f13033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f13034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f13036h;

    public j(q qVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f13029a = reentrantReadWriteLock;
        this.f13031c = 3;
        i iVar = (i) qVar.f13026b;
        this.f13034f = iVar;
        int i7 = qVar.f13025a;
        this.f13035g = i7;
        this.f13036h = (d) qVar.f13027c;
        this.f13032d = new Handler(Looper.getMainLooper());
        this.f13030b = new c(0);
        f fVar = new f(this);
        this.f13033e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i7 == 0) {
            try {
                this.f13031c = 0;
            } catch (Throwable th) {
                this.f13029a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.b(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (f13028i) {
            try {
                jVar = j;
                if (!(jVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public final int b() {
        this.f13029a.readLock().lock();
        try {
            return this.f13031c;
        } finally {
            this.f13029a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f13035g == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f13029a.writeLock().lock();
        try {
            if (this.f13031c == 0) {
                this.f13029a.writeLock().unlock();
                return;
            }
            this.f13031c = 0;
            this.f13029a.writeLock().unlock();
            f fVar = this.f13033e;
            j jVar = fVar.f13022a;
            try {
                jVar.f13034f.b(new e(fVar));
            } catch (Throwable th) {
                jVar.d(th);
            }
        } catch (Throwable th2) {
            this.f13029a.writeLock().unlock();
            throw th2;
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f13029a.writeLock().lock();
        try {
            this.f13031c = 2;
            arrayList.addAll(this.f13030b);
            this.f13030b.clear();
            this.f13029a.writeLock().unlock();
            this.f13032d.post(new RunnableC0493d(arrayList, this.f13031c, th));
        } catch (Throwable th2) {
            this.f13029a.writeLock().unlock();
            throw th2;
        }
    }

    public final CharSequence e(CharSequence charSequence, int i7, int i8) {
        int iCharCount;
        u[] uVarArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i8 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        if (!(i7 <= i8)) {
            throw new IllegalArgumentException("start should be <= than end");
        }
        w wVar = null;
        if (charSequence == null) {
            return null;
        }
        if (!(i7 <= charSequence.length())) {
            throw new IllegalArgumentException("start should be < than charSequence length");
        }
        if (!(i8 <= charSequence.length())) {
            throw new IllegalArgumentException("end should be < than charSequence length");
        }
        if (charSequence.length() == 0 || i7 == i8) {
            return charSequence;
        }
        w wVar2 = this.f13033e.f13023b;
        wVar2.getClass();
        boolean z4 = charSequence instanceof t;
        if (z4) {
            ((t) charSequence).a();
        }
        if (z4) {
            wVar = new w((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    wVar = new w((Spannable) charSequence);
                } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i7 - 1, i8 + 1, u.class) <= i8) {
                    wVar = new w(charSequence);
                }
            } finally {
                if (z4) {
                    ((t) charSequence).b();
                }
            }
        }
        if (wVar != null && (uVarArr = (u[]) wVar.f13071b.getSpans(i7, i8, u.class)) != null && uVarArr.length > 0) {
            for (u uVar : uVarArr) {
                int spanStart = wVar.f13071b.getSpanStart(uVar);
                int spanEnd = wVar.f13071b.getSpanEnd(uVar);
                if (spanStart != i8) {
                    wVar.removeSpan(uVar);
                }
                i7 = Math.min(spanStart, i7);
                i8 = Math.max(spanEnd, i8);
            }
        }
        if (i7 != i8 && i7 < charSequence.length()) {
            o oVar = new o((r) ((F0) wVar2.f11335b).f17381d);
            int iCodePointAt = Character.codePointAt(charSequence, i7);
            int i9 = 0;
            w wVar3 = wVar;
            loop1: while (true) {
                iCharCount = i7;
                while (true) {
                    if (i7 >= i8 || i9 >= Integer.MAX_VALUE) {
                        break loop1;
                    }
                    int iA = oVar.a(iCodePointAt);
                    if (iA == 1) {
                        iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                        if (iCharCount < i8) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        }
                        i7 = iCharCount;
                    } else if (iA == 2) {
                        i7 += Character.charCount(iCodePointAt);
                        if (i7 < i8) {
                            iCodePointAt = Character.codePointAt(charSequence, i7);
                        }
                    } else if (iA != 3) {
                    }
                }
                if (!wVar2.H(charSequence, iCharCount, i7, oVar.f13049d.f13062b)) {
                    if (wVar3 == null) {
                        wVar3 = new w((Spannable) new SpannableString(charSequence));
                    }
                    wVar3.setSpan(new u(oVar.f13049d.f13062b), iCharCount, i7, 33);
                    i9++;
                }
            }
            if (oVar.f13046a == 2 && oVar.f13048c.f13062b != null && ((oVar.f13051f > 1 || oVar.c()) && i9 < Integer.MAX_VALUE && !wVar2.H(charSequence, iCharCount, i7, oVar.f13048c.f13062b))) {
                if (wVar3 == null) {
                    wVar3 = new w(charSequence);
                }
                wVar3.setSpan(new u(oVar.f13048c.f13062b), iCharCount, i7, 33);
            }
            if (wVar3 != null) {
                return wVar3.f13071b;
            }
            if (!z4) {
                return charSequence;
            }
        } else if (!z4) {
            return charSequence;
        }
        return charSequence;
    }

    public final void f(h hVar) {
        a.i(hVar, "initCallback cannot be null");
        this.f13029a.writeLock().lock();
        try {
            if (this.f13031c == 1 || this.f13031c == 2) {
                this.f13032d.post(new RunnableC0493d(Arrays.asList(hVar), this.f13031c, (Throwable) null));
            } else {
                this.f13030b.add(hVar);
            }
        } finally {
            this.f13029a.writeLock().unlock();
        }
    }
}
