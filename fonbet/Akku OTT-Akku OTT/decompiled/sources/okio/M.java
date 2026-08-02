package okio;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.ExceptionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C;

@SourceDebugExtension({"SMAP\nZipFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,142:1\n58#2,4:143\n58#2,22:147\n66#2,10:169\n62#2,3:179\n77#2,3:182\n58#2,22:185\n*S KotlinDebug\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n*L\n55#1:143,4\n56#1:147,22\n55#1:169,10\n55#1:179,3\n55#1:182,3\n99#1:185,22\n*E\n"})
/* loaded from: classes5.dex */
public final class M extends AbstractC1197l {
    public static final C d;
    public final C a;
    public final AbstractC1197l b;
    public final Map<C, okio.internal.p> c;

    static {
        C.Companion.getClass();
        d = C.a.a(DomExceptionUtils.SEPARATOR, false);
    }

    public M(C zipPath, AbstractC1197l fileSystem, Map entries) {
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.a = zipPath;
        this.b = fileSystem;
        this.c = entries;
    }

    @Override // okio.AbstractC1197l
    public final J appendingSink(C file, boolean z) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.AbstractC1197l
    public final void atomicMove(C source, C target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.AbstractC1197l
    public final C canonicalize(C child) {
        Intrinsics.checkNotNullParameter(child, "path");
        C c = d;
        c.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        C b = okio.internal.h.b(c, child, true);
        if (this.c.containsKey(b)) {
            return b;
        }
        throw new FileNotFoundException(String.valueOf(child));
    }

    @Override // okio.AbstractC1197l
    public final void createDirectory(C dir, boolean z) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.AbstractC1197l
    public final void createSymlink(C source, C target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    public final List<C> d(C child, boolean z) {
        C c = d;
        c.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        okio.internal.p pVar = this.c.get(okio.internal.h.b(c, child, true));
        if (pVar != null) {
            return CollectionsKt.toList(pVar.q);
        }
        if (z) {
            throw new IOException(com.google.gson.internal.c.a(child, "not a directory: "));
        }
        return null;
    }

    @Override // okio.AbstractC1197l
    public final void delete(C path, boolean z) {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.AbstractC1197l
    public final List<C> list(C dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<C> d2 = d(dir, true);
        Intrinsics.checkNotNull(d2);
        return d2;
    }

    @Override // okio.AbstractC1197l
    public final List<C> listOrNull(C dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return d(dir, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0136  */
    @Override // okio.AbstractC1197l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1196k metadataOrNull(C child) {
        Long valueOf;
        long j;
        Long l;
        Long valueOf2;
        Long l2;
        Long l3;
        Long valueOf3;
        Throwable th;
        Throwable th2;
        okio.internal.p pVar;
        Intrinsics.checkNotNullParameter(child, "path");
        C c = d;
        c.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        okio.internal.p centralDirectoryZipEntry = this.c.get(okio.internal.h.b(c, child, true));
        if (centralDirectoryZipEntry == null) {
            return null;
        }
        long j2 = centralDirectoryZipEntry.h;
        if (j2 != -1) {
            AbstractC1195j openReadOnly = this.b.openReadOnly(this.a);
            try {
                F b = z.b(openReadOnly.x(j2));
                try {
                    Intrinsics.checkNotNullParameter(b, "<this>");
                    Intrinsics.checkNotNullParameter(centralDirectoryZipEntry, "centralDirectoryZipEntry");
                    pVar = okio.internal.u.e(b, centralDirectoryZipEntry);
                    Intrinsics.checkNotNull(pVar);
                    try {
                        b.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        b.close();
                    } catch (Throwable th5) {
                        ExceptionsKt.addSuppressed(th4, th5);
                    }
                    th2 = th4;
                    pVar = null;
                }
            } catch (Throwable th6) {
                th = th6;
                if (openReadOnly != null) {
                    try {
                        openReadOnly.close();
                    } catch (Throwable th7) {
                        ExceptionsKt.addSuppressed(th, th7);
                    }
                }
                centralDirectoryZipEntry = null;
            }
            if (th2 != null) {
                throw th2;
            }
            try {
                openReadOnly.close();
                th = null;
            } catch (Throwable th8) {
                th = th8;
            }
            th = th;
            centralDirectoryZipEntry = pVar;
            if (th != null) {
                throw th;
            }
        }
        boolean z = centralDirectoryZipEntry.b;
        boolean z2 = !z;
        Long valueOf4 = z ? null : Long.valueOf(centralDirectoryZipEntry.f);
        Long l4 = centralDirectoryZipEntry.m;
        if (l4 != null) {
            valueOf = Long.valueOf((l4.longValue() / 10000) - 11644473600000L);
        } else {
            valueOf = centralDirectoryZipEntry.p != null ? Long.valueOf(r2.intValue() * 1000) : null;
        }
        Long l5 = centralDirectoryZipEntry.k;
        if (l5 != null) {
            j = 11644473600000L;
            valueOf2 = Long.valueOf((l5.longValue() / 10000) - 11644473600000L);
        } else {
            j = 11644473600000L;
            if (centralDirectoryZipEntry.n == null) {
                int i = centralDirectoryZipEntry.j;
                if (i != -1) {
                    int i2 = centralDirectoryZipEntry.i;
                    if (i != -1) {
                        int i3 = (i >> 11) & 31;
                        int i4 = (i >> 5) & 63;
                        int i5 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i3, i4, i5);
                        valueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                }
                l = null;
                l2 = centralDirectoryZipEntry.l;
                if (l2 == null) {
                    valueOf3 = Long.valueOf((l2.longValue() / 10000) - j);
                } else {
                    if (centralDirectoryZipEntry.o == null) {
                        l3 = null;
                        return new C1196k(z2, z, null, valueOf4, valueOf, l, l3);
                    }
                    valueOf3 = Long.valueOf(r0.intValue() * 1000);
                }
                l3 = valueOf3;
                return new C1196k(z2, z, null, valueOf4, valueOf, l, l3);
            }
            valueOf2 = Long.valueOf(r3.intValue() * 1000);
        }
        l = valueOf2;
        l2 = centralDirectoryZipEntry.l;
        if (l2 == null) {
        }
        l3 = valueOf3;
        return new C1196k(z2, z, null, valueOf4, valueOf, l, l3);
    }

    @Override // okio.AbstractC1197l
    public final AbstractC1195j openReadOnly(C file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // okio.AbstractC1197l
    public final AbstractC1195j openReadWrite(C file, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // okio.AbstractC1197l
    public final J sink(C file, boolean z) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.AbstractC1197l
    public final K source(C child) throws IOException {
        Throwable th;
        F f;
        Intrinsics.checkNotNullParameter(child, "file");
        C c = d;
        c.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        okio.internal.p pVar = this.c.get(okio.internal.h.b(c, child, true));
        if (pVar == null) {
            throw new FileNotFoundException(com.google.gson.internal.c.a(child, "no such file: "));
        }
        long j = pVar.f;
        AbstractC1195j openReadOnly = this.b.openReadOnly(this.a);
        try {
            f = z.b(openReadOnly.x(pVar.h));
            try {
                openReadOnly.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (openReadOnly != null) {
                try {
                    openReadOnly.close();
                } catch (Throwable th4) {
                    ExceptionsKt.addSuppressed(th3, th4);
                }
            }
            th = th3;
            f = null;
        }
        if (th != null) {
            throw th;
        }
        Intrinsics.checkNotNullParameter(f, "<this>");
        okio.internal.u.e(f, null);
        return pVar.g == 0 ? new okio.internal.l(f, j, true) : new okio.internal.l(new s(new okio.internal.l(f, pVar.e, true), new Inflater(true)), j, false);
    }
}
