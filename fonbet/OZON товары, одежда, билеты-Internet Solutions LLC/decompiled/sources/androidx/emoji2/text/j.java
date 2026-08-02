package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.NonNull;
import androidx.collection.C5133b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: j, reason: collision with root package name */
    private static final Object f42690j = new Object();

    /* renamed from: k, reason: collision with root package name */
    private static volatile j f42691k;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ReentrantReadWriteLock f42692a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final C5133b f42693b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f42694c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private final Handler f42695d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final a f42696e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    final h f42697f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    private final d f42698g;

    /* renamed from: h, reason: collision with root package name */
    private final int f42699h;

    /* renamed from: i, reason: collision with root package name */
    private final e f42700i;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        private volatile o f42701b;

        /* renamed from: c, reason: collision with root package name */
        private volatile u f42702c;

        final int a(int i11, @NonNull CharSequence charSequence) {
            return this.f42701b.b(i11, (String) charSequence);
        }

        final int b(int i11, @NonNull CharSequence charSequence) {
            return this.f42701b.c(i11, (String) charSequence);
        }

        final void c(@NonNull u uVar) {
            this.f42702c = uVar;
            u uVar2 = this.f42702c;
            d dVar = this.f42703a.f42698g;
            e eVar = this.f42703a.f42700i;
            this.f42703a.getClass();
            this.f42703a.getClass();
            this.f42701b = new o(uVar2, dVar, eVar, n.a());
            this.f42703a.m();
        }

        final CharSequence d(@NonNull CharSequence charSequence, int i11, int i12, boolean z11) {
            return this.f42701b.g(charSequence, i11, i12, z11);
        }

        final void e(@NonNull EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f42702c.d());
            Bundle bundle = editorInfo.extras;
            this.f42703a.getClass();
            bundle.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        final j f42703a;

        b(j jVar) {
            this.f42703a = jVar;
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        final h f42704a;

        /* renamed from: b, reason: collision with root package name */
        int f42705b = 0;

        /* renamed from: c, reason: collision with root package name */
        @NonNull
        e f42706c = new androidx.emoji2.text.h();

        protected c(@NonNull h hVar) {
            this.f42704a = hVar;
        }
    }

    public static class d {
    }

    public interface e {
    }

    public static abstract class f {
        public void a() {
        }

        public void b() {
        }
    }

    private static class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f42707a;

        /* renamed from: b, reason: collision with root package name */
        private final int f42708b;

        g(@NonNull List list, int i11, Throwable th2) {
            x2.i.e(list, "initCallbacks cannot be null");
            this.f42707a = new ArrayList(list);
            this.f42708b = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f42707a;
            int size = arrayList.size();
            int i11 = 0;
            if (this.f42708b != 1) {
                while (i11 < size) {
                    ((f) arrayList.get(i11)).a();
                    i11++;
                }
            } else {
                while (i11 < size) {
                    ((f) arrayList.get(i11)).b();
                    i11++;
                }
            }
        }
    }

    public interface h {
        void a(@NonNull i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th2);

        public abstract void b(@NonNull u uVar);
    }

    private j(@NonNull c cVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f42692a = reentrantReadWriteLock;
        this.f42694c = 3;
        h hVar = cVar.f42704a;
        this.f42697f = hVar;
        int i11 = cVar.f42705b;
        this.f42699h = i11;
        this.f42700i = cVar.f42706c;
        this.f42695d = new Handler(Looper.getMainLooper());
        this.f42693b = new C5133b(0);
        this.f42698g = new d();
        a aVar = new a(this);
        this.f42696e = aVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i11 == 0) {
            try {
                this.f42694c = 0;
            } catch (Throwable th2) {
                this.f42692a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (f() == 0) {
            try {
                hVar.a(new androidx.emoji2.text.i(aVar));
            } catch (Throwable th3) {
                l(th3);
            }
        }
    }

    @NonNull
    public static j c() {
        j jVar;
        synchronized (f42690j) {
            jVar = f42691k;
            x2.i.f("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", jVar != null);
        }
        return jVar;
    }

    public static boolean g(@NonNull InputConnection inputConnection, @NonNull Editable editable, int i11, int i12, boolean z11) {
        return o.d(inputConnection, editable, i11, i12, z11);
    }

    public static boolean h(@NonNull Editable editable, int i11, @NonNull KeyEvent keyEvent) {
        return o.e(editable, i11, keyEvent);
    }

    @NonNull
    public static void i(@NonNull c cVar) {
        if (f42691k == null) {
            synchronized (f42690j) {
                try {
                    if (f42691k == null) {
                        f42691k = new j(cVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static boolean j() {
        return f42691k != null;
    }

    public final int d(int i11, @NonNull String str) {
        return this.f42696e.a(i11, str);
    }

    public final int e(int i11, @NonNull String str) {
        return this.f42696e.b(i11, str);
    }

    public final int f() {
        this.f42692a.readLock().lock();
        try {
            return this.f42694c;
        } finally {
            this.f42692a.readLock().unlock();
        }
    }

    public final void k() {
        x2.i.f("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.f42699h == 1);
        if (f() == 1) {
            return;
        }
        this.f42692a.writeLock().lock();
        try {
            if (this.f42694c == 0) {
                return;
            }
            this.f42694c = 0;
            this.f42692a.writeLock().unlock();
            a aVar = this.f42696e;
            j jVar = aVar.f42703a;
            try {
                jVar.f42697f.a(new androidx.emoji2.text.i(aVar));
            } catch (Throwable th2) {
                jVar.l(th2);
            }
        } finally {
            this.f42692a.writeLock().unlock();
        }
    }

    final void l(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f42692a.writeLock().lock();
        try {
            this.f42694c = 2;
            arrayList.addAll(this.f42693b);
            this.f42693b.clear();
            this.f42692a.writeLock().unlock();
            this.f42695d.post(new g(arrayList, this.f42694c, th2));
        } catch (Throwable th3) {
            this.f42692a.writeLock().unlock();
            throw th3;
        }
    }

    final void m() {
        ArrayList arrayList = new ArrayList();
        this.f42692a.writeLock().lock();
        try {
            this.f42694c = 1;
            arrayList.addAll(this.f42693b);
            this.f42693b.clear();
            this.f42692a.writeLock().unlock();
            this.f42695d.post(new g(arrayList, this.f42694c, null));
        } catch (Throwable th2) {
            this.f42692a.writeLock().unlock();
            throw th2;
        }
    }

    public final CharSequence n(int i11, int i12, int i13, CharSequence charSequence) {
        x2.i.f("Not initialized yet", f() == 1);
        if (i11 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        x2.i.a("start should be <= than end", i11 <= i12);
        if (charSequence == null) {
            return null;
        }
        x2.i.a("start should be < than charSequence length", i11 <= charSequence.length());
        x2.i.a("end should be < than charSequence length", i12 <= charSequence.length());
        if (charSequence.length() == 0 || i11 == i12) {
            return charSequence;
        }
        return this.f42696e.d(charSequence, i11, i12, i13 == 1);
    }

    public final void o(@NonNull f fVar) {
        x2.i.e(fVar, "initCallback cannot be null");
        this.f42692a.writeLock().lock();
        try {
            if (this.f42694c != 1 && this.f42694c != 2) {
                this.f42693b.add(fVar);
                this.f42692a.writeLock().unlock();
            }
            this.f42695d.post(new g(Arrays.asList(fVar), this.f42694c, null));
            this.f42692a.writeLock().unlock();
        } catch (Throwable th2) {
            this.f42692a.writeLock().unlock();
            throw th2;
        }
    }

    public final void p(@NonNull f fVar) {
        x2.i.e(fVar, "initCallback cannot be null");
        ReentrantReadWriteLock reentrantReadWriteLock = this.f42692a;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f42693b.remove(fVar);
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    public final void q(@NonNull EditorInfo editorInfo) {
        if (f() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f42696e.e(editorInfo);
    }
}
