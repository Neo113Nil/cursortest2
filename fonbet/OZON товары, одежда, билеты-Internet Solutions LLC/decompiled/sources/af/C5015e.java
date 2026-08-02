package af;

import C.o0;
import I0.C3173b;
import hf.InterfaceC6945b;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import sf.F;
import sf.G;
import sf.K;
import sf.M;
import sf.z;

/* renamed from: af.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5015e implements Closeable, Flushable {

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    public static final Regex f36710t = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    public static final String f36711u = "CLEAN";

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    public static final String f36712v = "DIRTY";

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    public static final String f36713w = "REMOVE";

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    public static final String f36714x = "READ";

    /* renamed from: a, reason: collision with root package name */
    private long f36715a;

    /* renamed from: b, reason: collision with root package name */
    private final File f36716b;

    /* renamed from: c, reason: collision with root package name */
    private final File f36717c;

    /* renamed from: d, reason: collision with root package name */
    private final File f36718d;

    /* renamed from: e, reason: collision with root package name */
    private long f36719e;

    /* renamed from: f, reason: collision with root package name */
    private F f36720f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap<String, b> f36721g;

    /* renamed from: h, reason: collision with root package name */
    private int f36722h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f36723i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f36724j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f36725k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f36726l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f36727m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f36728n;

    /* renamed from: o, reason: collision with root package name */
    private long f36729o;

    /* renamed from: p, reason: collision with root package name */
    private final bf.c f36730p;

    /* renamed from: q, reason: collision with root package name */
    private final C5017g f36731q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final InterfaceC6945b f36732r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final File f36733s;

    /* renamed from: af.e$a */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean[] f36734a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f36735b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final b f36736c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C5015e f36737d;

        /* renamed from: af.e$a$a, reason: collision with other inner class name */
        static final class C0708a extends AbstractC7737t implements Function1<IOException, Unit> {
            C0708a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(IOException iOException) {
                IOException it = iOException;
                Intrinsics.checkNotNullParameter(it, "it");
                synchronized (a.this.f36737d) {
                    a.this.c();
                }
                return Unit.f71690a;
            }
        }

        public a(@NotNull C5015e c5015e, b entry) {
            boolean[] zArr;
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.f36737d = c5015e;
            this.f36736c = entry;
            if (entry.g()) {
                zArr = null;
            } else {
                c5015e.getClass();
                zArr = new boolean[2];
            }
            this.f36734a = zArr;
        }

        public final void a() throws IOException {
            synchronized (this.f36737d) {
                try {
                    if (this.f36735b) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.d(this.f36736c.b(), this)) {
                        this.f36737d.s(this, false);
                    }
                    this.f36735b = true;
                    Unit unit = Unit.f71690a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void b() throws IOException {
            synchronized (this.f36737d) {
                try {
                    if (this.f36735b) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.d(this.f36736c.b(), this)) {
                        this.f36737d.s(this, true);
                    }
                    this.f36735b = true;
                    Unit unit = Unit.f71690a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void c() {
            b bVar = this.f36736c;
            if (Intrinsics.d(bVar.b(), this)) {
                C5015e c5015e = this.f36737d;
                if (c5015e.f36724j) {
                    c5015e.s(this, false);
                } else {
                    bVar.o();
                }
            }
        }

        @NotNull
        public final b d() {
            return this.f36736c;
        }

        public final boolean[] e() {
            return this.f36734a;
        }

        @NotNull
        public final K f(int i11) {
            synchronized (this.f36737d) {
                if (this.f36735b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!Intrinsics.d(this.f36736c.b(), this)) {
                    return z.b();
                }
                if (!this.f36736c.g()) {
                    boolean[] zArr = this.f36734a;
                    Intrinsics.f(zArr);
                    zArr[i11] = true;
                }
                try {
                    return new j(this.f36737d.y().h((File) this.f36736c.c().get(i11)), new C0708a());
                } catch (FileNotFoundException unused) {
                    return z.b();
                }
            }
        }
    }

    /* renamed from: af.e$b */
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final long[] f36739a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ArrayList f36740b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final ArrayList f36741c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f36742d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f36743e;

        /* renamed from: f, reason: collision with root package name */
        private a f36744f;

        /* renamed from: g, reason: collision with root package name */
        private int f36745g;

        /* renamed from: h, reason: collision with root package name */
        private long f36746h;

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        private final String f36747i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C5015e f36748j;

        public b(@NotNull C5015e c5015e, String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f36748j = c5015e;
            this.f36747i = key;
            c5015e.getClass();
            this.f36739a = new long[2];
            this.f36740b = new ArrayList();
            this.f36741c = new ArrayList();
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append('.');
            int length = sb2.length();
            for (int i11 = 0; i11 < 2; i11++) {
                sb2.append(i11);
                this.f36740b.add(new File(c5015e.x(), sb2.toString()));
                sb2.append(".tmp");
                this.f36741c.add(new File(c5015e.x(), sb2.toString()));
                sb2.setLength(length);
            }
        }

        @NotNull
        public final ArrayList a() {
            return this.f36740b;
        }

        public final a b() {
            return this.f36744f;
        }

        @NotNull
        public final ArrayList c() {
            return this.f36741c;
        }

        @NotNull
        public final String d() {
            return this.f36747i;
        }

        @NotNull
        public final long[] e() {
            return this.f36739a;
        }

        public final int f() {
            return this.f36745g;
        }

        public final boolean g() {
            return this.f36742d;
        }

        public final long h() {
            return this.f36746h;
        }

        public final boolean i() {
            return this.f36743e;
        }

        public final void j(a aVar) {
            this.f36744f = aVar;
        }

        public final void k(@NotNull List<String> strings) throws IOException {
            Intrinsics.checkNotNullParameter(strings, "strings");
            int size = strings.size();
            this.f36748j.getClass();
            if (size != 2) {
                throw new IOException("unexpected journal line: " + strings);
            }
            try {
                int size2 = strings.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    this.f36739a[i11] = Long.parseLong(strings.get(i11));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + strings);
            }
        }

        public final void l(int i11) {
            this.f36745g = i11;
        }

        public final void m() {
            this.f36742d = true;
        }

        public final void n(long j11) {
            this.f36746h = j11;
        }

        public final void o() {
            this.f36743e = true;
        }

        public final c p() {
            byte[] bArr = Ye.b.f34900a;
            if (!this.f36742d) {
                return null;
            }
            C5015e c5015e = this.f36748j;
            if (!c5015e.f36724j && (this.f36744f != null || this.f36743e)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f36739a.clone();
            for (int i11 = 0; i11 < 2; i11++) {
                try {
                    M g10 = c5015e.y().g((File) this.f36740b.get(i11));
                    if (!c5015e.f36724j) {
                        this.f36745g++;
                        g10 = new C5016f(this, g10, g10);
                    }
                    arrayList.add(g10);
                } catch (FileNotFoundException unused) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Ye.b.e((M) it.next());
                    }
                    try {
                        c5015e.X(this);
                        return null;
                    } catch (IOException unused2) {
                        return null;
                    }
                }
            }
            return new c(this.f36748j, this.f36747i, this.f36746h, arrayList, jArr);
        }

        public final void q(@NotNull F writer) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            for (long j11 : this.f36739a) {
                writer.h0(32);
                writer.Y(j11);
            }
        }
    }

    /* renamed from: af.e$c */
    public final class c implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final String f36749a;

        /* renamed from: b, reason: collision with root package name */
        private final long f36750b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f36751c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C5015e f36752d;

        public c(@NotNull C5015e c5015e, String key, @NotNull long j11, @NotNull ArrayList sources, long[] lengths) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(sources, "sources");
            Intrinsics.checkNotNullParameter(lengths, "lengths");
            this.f36752d = c5015e;
            this.f36749a = key;
            this.f36750b = j11;
            this.f36751c = sources;
        }

        public final a c() throws IOException {
            String str = this.f36749a;
            return this.f36752d.t(this.f36750b, str);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Iterator it = this.f36751c.iterator();
            while (it.hasNext()) {
                Ye.b.e((M) it.next());
            }
        }

        @NotNull
        public final M d(int i11) {
            return (M) this.f36751c.get(i11);
        }

        @NotNull
        public final String j() {
            return this.f36749a;
        }
    }

    public C5015e(@NotNull File directory, long j11, @NotNull bf.e taskRunner) {
        InterfaceC6945b fileSystem = InterfaceC6945b.f65492a;
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.f36732r = fileSystem;
        this.f36733s = directory;
        this.f36715a = j11;
        this.f36721g = new LinkedHashMap<>(0, 0.75f, true);
        this.f36730p = taskRunner.h();
        this.f36731q = new C5017g(this, o0.c(new StringBuilder(), Ye.b.f34906g, " Cache"));
        if (j11 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f36716b = new File(directory, "journal");
        this.f36717c = new File(directory, "journal.tmp");
        this.f36718d = new File(directory, "journal.bkp");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean I() {
        int i11 = this.f36722h;
        return i11 >= 2000 && i11 >= this.f36721g.size();
    }

    private final void L() throws IOException {
        File file = this.f36717c;
        InterfaceC6945b interfaceC6945b = InterfaceC6945b.f65492a;
        interfaceC6945b.c(file);
        Iterator<b> it = this.f36721g.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "i.next()");
            b bVar = next;
            int i11 = 0;
            if (bVar.b() == null) {
                while (i11 < 2) {
                    this.f36719e += bVar.e()[i11];
                    i11++;
                }
            } else {
                bVar.j(null);
                while (i11 < 2) {
                    interfaceC6945b.c((File) bVar.a().get(i11));
                    interfaceC6945b.c((File) bVar.c().get(i11));
                    i11++;
                }
                it.remove();
            }
        }
    }

    private final void O() throws IOException {
        File file = this.f36716b;
        InterfaceC6945b interfaceC6945b = InterfaceC6945b.f65492a;
        G d11 = z.d(interfaceC6945b.g(file));
        try {
            String s11 = d11.s(Long.MAX_VALUE);
            String s12 = d11.s(Long.MAX_VALUE);
            String s13 = d11.s(Long.MAX_VALUE);
            String s14 = d11.s(Long.MAX_VALUE);
            String s15 = d11.s(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(s11) || !"1".equals(s12) || !Intrinsics.d(String.valueOf(201105), s13) || !Intrinsics.d(String.valueOf(2), s14) || s15.length() > 0) {
                throw new IOException("unexpected journal header: [" + s11 + ", " + s12 + ", " + s14 + ", " + s15 + ']');
            }
            int i11 = 0;
            while (true) {
                try {
                    Q(d11.s(Long.MAX_VALUE));
                    i11++;
                } catch (EOFException unused) {
                    this.f36722h = i11 - this.f36721g.size();
                    if (d11.c()) {
                        this.f36720f = z.c(new j(interfaceC6945b.e(file), new h(this)));
                    } else {
                        R();
                    }
                    Unit unit = Unit.f71690a;
                    d11.close();
                    return;
                }
            }
        } finally {
        }
    }

    private final void Q(String str) throws IOException {
        String substring;
        int I11 = kotlin.text.h.I(' ', 0, 6, str);
        if (I11 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i11 = I11 + 1;
        int I12 = kotlin.text.h.I(' ', i11, 4, str);
        LinkedHashMap<String, b> linkedHashMap = this.f36721g;
        if (I12 == -1) {
            substring = str.substring(i11);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
            String str2 = f36713w;
            if (I11 == str2.length() && kotlin.text.h.e0(str, str2, false)) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i11, I12);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        b bVar = linkedHashMap.get(substring);
        if (bVar == null) {
            bVar = new b(this, substring);
            linkedHashMap.put(substring, bVar);
        }
        if (I12 != -1) {
            String str3 = f36711u;
            if (I11 == str3.length() && kotlin.text.h.e0(str, str3, false)) {
                String substring2 = str.substring(I12 + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.String).substring(startIndex)");
                List<String> l11 = kotlin.text.h.l(substring2, new char[]{' '}, 0, 6);
                bVar.m();
                bVar.j(null);
                bVar.k(l11);
                return;
            }
        }
        if (I12 == -1) {
            String str4 = f36712v;
            if (I11 == str4.length() && kotlin.text.h.e0(str, str4, false)) {
                bVar.j(new a(this, bVar));
                return;
            }
        }
        if (I12 == -1) {
            String str5 = f36714x;
            if (I11 == str5.length() && kotlin.text.h.e0(str, str5, false)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    private static void d0(String str) {
        if (!f36710t.f(str)) {
            throw new IllegalArgumentException(C3173b.a('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    private final synchronized void r() {
        if (this.f36726l) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void B() throws IOException {
        boolean z11;
        p002if.j jVar;
        try {
            byte[] bArr = Ye.b.f34900a;
            if (this.f36725k) {
                return;
            }
            InterfaceC6945b isCivilized = InterfaceC6945b.f65492a;
            if (isCivilized.d(this.f36718d)) {
                if (isCivilized.d(this.f36716b)) {
                    isCivilized.c(this.f36718d);
                } else {
                    isCivilized.b(this.f36718d, this.f36716b);
                }
            }
            File file = this.f36718d;
            Intrinsics.checkNotNullParameter(isCivilized, "$this$isCivilized");
            Intrinsics.checkNotNullParameter(file, "file");
            K h11 = isCivilized.h(file);
            try {
                try {
                    isCivilized.c(file);
                    h11.close();
                    z11 = true;
                } catch (IOException unused) {
                    Unit unit = Unit.f71690a;
                    h11.close();
                    isCivilized.c(file);
                    z11 = false;
                }
                this.f36724j = z11;
                if (InterfaceC6945b.f65492a.d(this.f36716b)) {
                    try {
                        O();
                        L();
                        this.f36725k = true;
                        return;
                    } catch (IOException e11) {
                        p002if.j.f66400c.getClass();
                        jVar = p002if.j.f66398a;
                        String str = "DiskLruCache " + this.f36733s + " is corrupt: " + e11.getMessage() + ", removing";
                        jVar.getClass();
                        p002if.j.j(5, str, e11);
                        try {
                            close();
                            InterfaceC6945b.f65492a.a(this.f36733s);
                            this.f36726l = false;
                        } catch (Throwable th2) {
                            this.f36726l = false;
                            throw th2;
                        }
                    }
                }
                R();
                this.f36725k = true;
            } finally {
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void R() throws IOException {
        try {
            F f7 = this.f36720f;
            if (f7 != null) {
                f7.close();
            }
            F c11 = z.c(InterfaceC6945b.f65492a.h(this.f36717c));
            try {
                c11.h1("libcore.io.DiskLruCache");
                c11.h0(10);
                c11.h1("1");
                c11.h0(10);
                c11.Y(201105);
                c11.h0(10);
                c11.Y(2);
                c11.h0(10);
                c11.h0(10);
                for (b bVar : this.f36721g.values()) {
                    if (bVar.b() != null) {
                        c11.h1(f36712v);
                        c11.h0(32);
                        c11.h1(bVar.d());
                        c11.h0(10);
                    } else {
                        c11.h1(f36711u);
                        c11.h0(32);
                        c11.h1(bVar.d());
                        bVar.q(c11);
                        c11.h0(10);
                    }
                }
                Unit unit = Unit.f71690a;
                c11.close();
                InterfaceC6945b interfaceC6945b = InterfaceC6945b.f65492a;
                if (interfaceC6945b.d(this.f36716b)) {
                    interfaceC6945b.b(this.f36716b, this.f36718d);
                }
                interfaceC6945b.b(this.f36717c, this.f36716b);
                interfaceC6945b.c(this.f36718d);
                this.f36720f = z.c(new j(interfaceC6945b.e(this.f36716b), new h(this)));
                this.f36723i = false;
                this.f36728n = false;
            } finally {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void W(@NotNull String key) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        B();
        r();
        d0(key);
        b bVar = this.f36721g.get(key);
        if (bVar != null) {
            Intrinsics.checkNotNullExpressionValue(bVar, "lruEntries[key] ?: return false");
            X(bVar);
            if (this.f36719e <= this.f36715a) {
                this.f36727m = false;
            }
        }
    }

    public final void X(@NotNull b entry) throws IOException {
        F f7;
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (!this.f36724j) {
            if (entry.f() > 0 && (f7 = this.f36720f) != null) {
                f7.h1(f36712v);
                f7.h0(32);
                f7.h1(entry.d());
                f7.h0(10);
                f7.flush();
            }
            if (entry.f() > 0 || entry.b() != null) {
                entry.o();
                return;
            }
        }
        a b11 = entry.b();
        if (b11 != null) {
            b11.c();
        }
        for (int i11 = 0; i11 < 2; i11++) {
            InterfaceC6945b.f65492a.c((File) entry.a().get(i11));
            this.f36719e -= entry.e()[i11];
            entry.e()[i11] = 0;
        }
        this.f36722h++;
        F f11 = this.f36720f;
        if (f11 != null) {
            f11.h1(f36713w);
            f11.h0(32);
            f11.h1(entry.d());
            f11.h0(10);
        }
        this.f36721g.remove(entry.d());
        if (I()) {
            this.f36730p.j(this.f36731q, 0L);
        }
    }

    @NotNull
    public final synchronized i Z() throws IOException {
        B();
        return new i(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "toEvict");
        X(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0() throws IOException {
        while (this.f36719e > this.f36715a) {
            Iterator<b> it = this.f36721g.values().iterator();
            while (it.hasNext()) {
                b toEvict = it.next();
                if (!toEvict.i()) {
                    break;
                }
            }
            return;
        }
        this.f36727m = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        a b11;
        try {
            if (this.f36725k && !this.f36726l) {
                Collection<b> values = this.f36721g.values();
                Intrinsics.checkNotNullExpressionValue(values, "lruEntries.values");
                Object[] array = values.toArray(new b[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                for (b bVar : (b[]) array) {
                    if (bVar.b() != null && (b11 = bVar.b()) != null) {
                        b11.c();
                    }
                }
                b0();
                F f7 = this.f36720f;
                Intrinsics.f(f7);
                f7.close();
                this.f36720f = null;
                this.f36726l = true;
                return;
            }
            this.f36726l = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() throws IOException {
        if (this.f36725k) {
            r();
            b0();
            F f7 = this.f36720f;
            Intrinsics.f(f7);
            f7.flush();
        }
    }

    public final synchronized void s(@NotNull a editor, boolean z11) throws IOException {
        Intrinsics.checkNotNullParameter(editor, "editor");
        b d11 = editor.d();
        if (!Intrinsics.d(d11.b(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z11 && !d11.g()) {
            for (int i11 = 0; i11 < 2; i11++) {
                boolean[] e11 = editor.e();
                Intrinsics.f(e11);
                if (!e11[i11]) {
                    editor.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                }
                if (!InterfaceC6945b.f65492a.d((File) d11.c().get(i11))) {
                    editor.a();
                    return;
                }
            }
        }
        for (int i12 = 0; i12 < 2; i12++) {
            File file = (File) d11.c().get(i12);
            if (!z11 || d11.i()) {
                InterfaceC6945b.f65492a.c(file);
            } else {
                InterfaceC6945b interfaceC6945b = InterfaceC6945b.f65492a;
                if (interfaceC6945b.d(file)) {
                    File file2 = (File) d11.a().get(i12);
                    interfaceC6945b.b(file, file2);
                    long j11 = d11.e()[i12];
                    long f7 = interfaceC6945b.f(file2);
                    d11.e()[i12] = f7;
                    this.f36719e = (this.f36719e - j11) + f7;
                }
            }
        }
        d11.j(null);
        if (d11.i()) {
            X(d11);
            return;
        }
        this.f36722h++;
        F f11 = this.f36720f;
        Intrinsics.f(f11);
        if (!d11.g() && !z11) {
            this.f36721g.remove(d11.d());
            f11.h1(f36713w);
            f11.h0(32);
            f11.h1(d11.d());
            f11.h0(10);
            f11.flush();
            if (this.f36719e <= this.f36715a || I()) {
                this.f36730p.j(this.f36731q, 0L);
            }
        }
        d11.m();
        f11.h1(f36711u);
        f11.h0(32);
        f11.h1(d11.d());
        d11.q(f11);
        f11.h0(10);
        if (z11) {
            long j12 = this.f36729o;
            this.f36729o = 1 + j12;
            d11.n(j12);
        }
        f11.flush();
        if (this.f36719e <= this.f36715a) {
        }
        this.f36730p.j(this.f36731q, 0L);
    }

    public final synchronized a t(long j11, @NotNull String key) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        B();
        r();
        d0(key);
        b bVar = this.f36721g.get(key);
        if (j11 != -1 && (bVar == null || bVar.h() != j11)) {
            return null;
        }
        if ((bVar != null ? bVar.b() : null) != null) {
            return null;
        }
        if (bVar != null && bVar.f() != 0) {
            return null;
        }
        if (!this.f36727m && !this.f36728n) {
            F f7 = this.f36720f;
            Intrinsics.f(f7);
            f7.h1(f36712v);
            f7.h0(32);
            f7.h1(key);
            f7.h0(10);
            f7.flush();
            if (this.f36723i) {
                return null;
            }
            if (bVar == null) {
                bVar = new b(this, key);
                this.f36721g.put(key, bVar);
            }
            a aVar = new a(this, bVar);
            bVar.j(aVar);
            return aVar;
        }
        this.f36730p.j(this.f36731q, 0L);
        return null;
    }

    public final synchronized c v(@NotNull String key) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        B();
        r();
        d0(key);
        b bVar = this.f36721g.get(key);
        if (bVar == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(bVar, "lruEntries[key] ?: return null");
        c p11 = bVar.p();
        if (p11 == null) {
            return null;
        }
        this.f36722h++;
        F f7 = this.f36720f;
        Intrinsics.f(f7);
        f7.h1(f36714x);
        f7.h0(32);
        f7.h1(key);
        f7.h0(10);
        if (I()) {
            this.f36730p.j(this.f36731q, 0L);
        }
        return p11;
    }

    public final boolean w() {
        return this.f36726l;
    }

    @NotNull
    public final File x() {
        return this.f36733s;
    }

    @NotNull
    public final InterfaceC6945b y() {
        return this.f36732r;
    }

    @NotNull
    public final LinkedHashMap<String, b> z() {
        return this.f36721g;
    }
}
