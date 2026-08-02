package g0;

import W5.RunnableC0493d;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import n3.AbstractC1464a;
import w1.F0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f13022i = new Object();
    public static volatile j j;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f13023a;

    /* renamed from: b, reason: collision with root package name */
    public final r.c f13024b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f13025c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f13026d;

    /* renamed from: e, reason: collision with root package name */
    public final C1124f f13027e;

    /* renamed from: f, reason: collision with root package name */
    public final i f13028f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13029g;

    /* renamed from: h, reason: collision with root package name */
    public final C1122d f13030h;

    public j(q qVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f13023a = reentrantReadWriteLock;
        this.f13025c = 3;
        i iVar = (i) qVar.f13020b;
        this.f13028f = iVar;
        int i7 = qVar.f13019a;
        this.f13029g = i7;
        this.f13030h = (C1122d) qVar.f13021c;
        this.f13026d = new Handler(Looper.getMainLooper());
        this.f13024b = new r.c(0);
        C1124f c1124f = new C1124f(this);
        this.f13027e = c1124f;
        reentrantReadWriteLock.writeLock().lock();
        if (i7 == 0) {
            try {
                this.f13025c = 0;
            } catch (Throwable th) {
                this.f13023a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.b(new C1123e(c1124f));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (f13022i) {
            try {
                jVar = j;
                if (!(jVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return jVar;
    }

    public final int b() {
        this.f13023a.readLock().lock();
        try {
            return this.f13025c;
        } finally {
            this.f13023a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f13029g == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f13023a.writeLock().lock();
        try {
            if (this.f13025c == 0) {
                return;
            }
            this.f13025c = 0;
            this.f13023a.writeLock().unlock();
            C1124f c1124f = this.f13027e;
            j jVar = c1124f.f13016a;
            try {
                jVar.f13028f.b(new C1123e(c1124f));
            } catch (Throwable th) {
                jVar.d(th);
            }
        } finally {
            this.f13023a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f13023a.writeLock().lock();
        try {
            this.f13025c = 2;
            arrayList.addAll(this.f13024b);
            this.f13024b.clear();
            this.f13023a.writeLock().unlock();
            this.f13026d.post(new RunnableC0493d(arrayList, this.f13025c, th));
        } catch (Throwable th2) {
            this.f13023a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0143 A[Catch: all -> 0x006d, TryCatch #0 {all -> 0x006d, blocks: (B:122:0x0051, B:125:0x0056, B:127:0x005a, B:129:0x0067, B:32:0x007a, B:34:0x0084, B:36:0x0087, B:38:0x008b, B:40:0x009b, B:42:0x009e, B:46:0x00ab, B:49:0x00b3, B:54:0x00d2, B:78:0x00de, B:82:0x00ea, B:83:0x00f4, B:66:0x0103, B:69:0x010a, B:57:0x010f, B:59:0x011a, B:88:0x0121, B:90:0x0125, B:92:0x012b, B:94:0x012f, B:97:0x0137, B:100:0x0143, B:101:0x0148, B:103:0x0156, B:30:0x0070), top: B:121:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0156 A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #0 {all -> 0x006d, blocks: (B:122:0x0051, B:125:0x0056, B:127:0x005a, B:129:0x0067, B:32:0x007a, B:34:0x0084, B:36:0x0087, B:38:0x008b, B:40:0x009b, B:42:0x009e, B:46:0x00ab, B:49:0x00b3, B:54:0x00d2, B:78:0x00de, B:82:0x00ea, B:83:0x00f4, B:66:0x0103, B:69:0x010a, B:57:0x010f, B:59:0x011a, B:88:0x0121, B:90:0x0125, B:92:0x012b, B:94:0x012f, B:97:0x0137, B:100:0x0143, B:101:0x0148, B:103:0x0156, B:30:0x0070), top: B:121:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b A[Catch: all -> 0x006d, TryCatch #0 {all -> 0x006d, blocks: (B:122:0x0051, B:125:0x0056, B:127:0x005a, B:129:0x0067, B:32:0x007a, B:34:0x0084, B:36:0x0087, B:38:0x008b, B:40:0x009b, B:42:0x009e, B:46:0x00ab, B:49:0x00b3, B:54:0x00d2, B:78:0x00de, B:82:0x00ea, B:83:0x00f4, B:66:0x0103, B:69:0x010a, B:57:0x010f, B:59:0x011a, B:88:0x0121, B:90:0x0125, B:92:0x012b, B:94:0x012f, B:97:0x0137, B:100:0x0143, B:101:0x0148, B:103:0x0156, B:30:0x0070), top: B:121:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence e(CharSequence charSequence, int i7, int i8) {
        o oVar;
        int codePointAt;
        w wVar;
        int i9;
        int a2;
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
        w wVar2 = null;
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
        com.google.android.gms.common.internal.w wVar3 = this.f13027e.f13017b;
        wVar3.getClass();
        boolean z4 = charSequence instanceof t;
        if (z4) {
            ((t) charSequence).a();
        }
        if (!z4) {
            try {
                if (!(charSequence instanceof Spannable)) {
                    if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i7 - 1, i8 + 1, u.class) <= i8) {
                        wVar2 = new w(charSequence);
                    }
                    if (wVar2 != null && (uVarArr = (u[]) wVar2.f13065b.getSpans(i7, i8, u.class)) != null && uVarArr.length > 0) {
                        for (u uVar : uVarArr) {
                            int spanStart = wVar2.f13065b.getSpanStart(uVar);
                            int spanEnd = wVar2.f13065b.getSpanEnd(uVar);
                            if (spanStart != i8) {
                                wVar2.removeSpan(uVar);
                            }
                            i7 = Math.min(spanStart, i7);
                            i8 = Math.max(spanEnd, i8);
                        }
                    }
                    if (i7 != i8 && i7 < charSequence.length()) {
                        oVar = new o((r) ((F0) wVar3.f11335b).f17375d);
                        codePointAt = Character.codePointAt(charSequence, i7);
                        int i10 = 0;
                        wVar = wVar2;
                        loop1: while (true) {
                            i9 = i7;
                            while (i7 < i8 && i10 < Integer.MAX_VALUE) {
                                a2 = oVar.a(codePointAt);
                                if (a2 != 1) {
                                    i9 += Character.charCount(Character.codePointAt(charSequence, i9));
                                    if (i9 < i8) {
                                        codePointAt = Character.codePointAt(charSequence, i9);
                                    }
                                    i7 = i9;
                                } else if (a2 == 2) {
                                    i7 += Character.charCount(codePointAt);
                                    if (i7 < i8) {
                                        codePointAt = Character.codePointAt(charSequence, i7);
                                    }
                                } else if (a2 == 3) {
                                    if (!wVar3.H(charSequence, i9, i7, oVar.f13043d.f13056b)) {
                                        if (wVar == null) {
                                            wVar = new w((Spannable) new SpannableString(charSequence));
                                        }
                                        wVar.setSpan(new u(oVar.f13043d.f13056b), i9, i7, 33);
                                        i10++;
                                    }
                                }
                            }
                        }
                        if (oVar.f13040a == 2 && oVar.f13042c.f13056b != null && ((oVar.f13045f > 1 || oVar.c()) && i10 < Integer.MAX_VALUE && !wVar3.H(charSequence, i9, i7, oVar.f13042c.f13056b))) {
                            if (wVar == null) {
                                wVar = new w(charSequence);
                            }
                            wVar.setSpan(new u(oVar.f13042c.f13056b), i9, i7, 33);
                        }
                        if (wVar != null) {
                            if (!z4) {
                                return charSequence;
                            }
                            return charSequence;
                        }
                        Spannable spannable = wVar.f13065b;
                        if (z4) {
                            ((t) charSequence).b();
                        }
                        return spannable;
                    }
                    return charSequence;
                }
            } finally {
                if (z4) {
                    ((t) charSequence).b();
                }
            }
        }
        wVar2 = new w((Spannable) charSequence);
        if (wVar2 != null) {
            while (r7 < r6) {
            }
        }
        if (i7 != i8) {
            oVar = new o((r) ((F0) wVar3.f11335b).f17375d);
            codePointAt = Character.codePointAt(charSequence, i7);
            int i102 = 0;
            wVar = wVar2;
            loop1: while (true) {
                i9 = i7;
                while (i7 < i8) {
                    a2 = oVar.a(codePointAt);
                    if (a2 != 1) {
                    }
                }
            }
            if (oVar.f13040a == 2) {
                if (wVar == null) {
                }
                wVar.setSpan(new u(oVar.f13042c.f13056b), i9, i7, 33);
            }
            if (wVar != null) {
            }
        }
        return charSequence;
    }

    public final void f(AbstractC1126h abstractC1126h) {
        AbstractC1464a.i(abstractC1126h, "initCallback cannot be null");
        this.f13023a.writeLock().lock();
        try {
            if (this.f13025c != 1 && this.f13025c != 2) {
                this.f13024b.add(abstractC1126h);
                this.f13023a.writeLock().unlock();
            }
            this.f13026d.post(new RunnableC0493d(Arrays.asList(abstractC1126h), this.f13025c, (Throwable) null));
            this.f13023a.writeLock().unlock();
        } catch (Throwable th) {
            this.f13023a.writeLock().unlock();
            throw th;
        }
    }
}
