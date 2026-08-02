package okio;

import androidx.exifinterface.media.ExifInterface;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import okio.C;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\b&\u0018\u0000 E2\u00060\u0001j\u0002`\u0002:\u0001FB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u0006\u0010\u0010\u001a\u00020\u0005H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u0005H&¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0005H&¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010 \u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\rH&¢\u0006\u0004\b \u0010!J\u0015\u0010 \u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b \u0010\u001dJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u0005H&¢\u0006\u0004\b#\u0010$JG\u0010,\u001a\u00028\u0000\"\u0004\b\u0000\u0010%2\u0006\u0010\u001a\u001a\u00020\u00052\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00028\u00000&¢\u0006\u0002\b(H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b*\u0010+J!\u0010.\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\rH&¢\u0006\u0004\b.\u0010/J\u0015\u0010.\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b.\u00100JQ\u00105\u001a\u00028\u0000\"\u0004\b\u0000\u0010%2\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\r2\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00028\u00000&¢\u0006\u0002\b(H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001¢\u0006\u0004\b3\u00104J!\u00106\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\rH&¢\u0006\u0004\b6\u0010/J\u0015\u00106\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b6\u00100J!\u00108\u001a\u0002072\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\rH&¢\u0006\u0004\b8\u00109J\u0015\u00108\u001a\u0002072\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b8\u0010:J\u001f\u0010;\u001a\u0002072\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b;\u00109J\u0015\u0010;\u001a\u0002072\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b;\u0010:J\u001f\u0010=\u001a\u0002072\u0006\u0010#\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u0005H&¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u0002072\u0006\u0010#\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u0005H\u0016¢\u0006\u0004\b?\u0010>J!\u0010@\u001a\u0002072\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\rH&¢\u0006\u0004\b@\u00109J\u0015\u0010@\u001a\u0002072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b@\u0010:J!\u0010B\u001a\u0002072\u0006\u0010A\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\bB\u00109J\u0015\u0010B\u001a\u0002072\u0006\u0010A\u001a\u00020\u0005¢\u0006\u0004\bB\u0010:J\u001f\u0010C\u001a\u0002072\u0006\u0010#\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u0005H&¢\u0006\u0004\bC\u0010>J\u000f\u0010D\u001a\u000207H\u0016¢\u0006\u0004\bD\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006G"}, d2 = {"Lokio/l;", "Ljava/io/Closeable;", "Lokio/Closeable;", "<init>", "()V", "Lokio/C;", "path", "canonicalize", "(Lokio/C;)Lokio/C;", "Lokio/k;", "metadata", "(Lokio/C;)Lokio/k;", "metadataOrNull", "", "exists", "(Lokio/C;)Z", "dir", "", "list", "(Lokio/C;)Ljava/util/List;", "listOrNull", "followSymlinks", "Lkotlin/sequences/Sequence;", "listRecursively", "(Lokio/C;Z)Lkotlin/sequences/Sequence;", "(Lokio/C;)Lkotlin/sequences/Sequence;", Constants.FILE, "Lokio/j;", "openReadOnly", "(Lokio/C;)Lokio/j;", "mustCreate", "mustExist", "openReadWrite", "(Lokio/C;ZZ)Lokio/j;", "Lokio/K;", "source", "(Lokio/C;)Lokio/K;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Lokio/g;", "Lkotlin/ExtensionFunctionType;", "readerAction", "-read", "(Lokio/C;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "read", "Lokio/J;", "sink", "(Lokio/C;Z)Lokio/J;", "(Lokio/C;)Lokio/J;", "Lokio/f;", "writerAction", "-write", "(Lokio/C;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "write", "appendingSink", "", "createDirectory", "(Lokio/C;Z)V", "(Lokio/C;)V", "createDirectories", "target", "atomicMove", "(Lokio/C;Lokio/C;)V", "copy", "delete", "fileOrDirectory", "deleteRecursively", "createSymlink", "close", "Companion", "a", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,191:1\n58#2,22:192\n58#2,22:214\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n*L\n73#1:192,22\n95#1:214,22\n*E\n"})
/* renamed from: okio.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1197l implements Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    @JvmField
    public static final AbstractC1197l RESOURCES;

    @JvmField
    public static final AbstractC1197l SYSTEM;

    @JvmField
    public static final C SYSTEM_TEMPORARY_DIRECTORY;

    /* renamed from: okio.l$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ Object m3359write$default(AbstractC1197l abstractC1197l, C file, boolean z, Function1 writerAction, int i, Object obj) throws IOException {
        ?? r4;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(writerAction, "writerAction");
        E a = z.a(abstractC1197l.sink(file, z));
        Object th = null;
        try {
            Object invoke = writerAction.invoke(a);
            InlineMarker.finallyStart(1);
            try {
                a.close();
            } catch (Throwable th2) {
                th = th2;
            }
            InlineMarker.finallyEnd(1);
            r4 = th;
            th = invoke;
        } catch (Throwable th3) {
            InlineMarker.finallyStart(1);
            try {
                a.close();
            } catch (Throwable th4) {
                ExceptionsKt.addSuppressed(th3, th4);
            }
            InlineMarker.finallyEnd(1);
            r4 = th3;
        }
        if (r4 == 0) {
            return th;
        }
        throw r4;
    }

    static {
        AbstractC1197l vVar;
        try {
            Class.forName("java.nio.file.Files");
            vVar = new y();
        } catch (ClassNotFoundException unused) {
            vVar = new v();
        }
        SYSTEM = vVar;
        C.a aVar = C.Companion;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        SYSTEM_TEMPORARY_DIRECTORY = C.a.c(aVar, property);
        ClassLoader classLoader = okio.internal.n.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
        RESOURCES = new okio.internal.n(classLoader);
    }

    public static /* synthetic */ J appendingSink$default(AbstractC1197l abstractC1197l, C c, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return abstractC1197l.appendingSink(c, z);
    }

    public static /* synthetic */ void createDirectories$default(AbstractC1197l abstractC1197l, C c, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        abstractC1197l.createDirectories(c, z);
    }

    public static /* synthetic */ void createDirectory$default(AbstractC1197l abstractC1197l, C c, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        abstractC1197l.createDirectory(c, z);
    }

    public static /* synthetic */ void delete$default(AbstractC1197l abstractC1197l, C c, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        abstractC1197l.delete(c, z);
    }

    public static /* synthetic */ void deleteRecursively$default(AbstractC1197l abstractC1197l, C c, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        abstractC1197l.deleteRecursively(c, z);
    }

    @JvmStatic
    @JvmName(name = "get")
    public static final AbstractC1197l get(FileSystem fileSystem) {
        INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        return new x(fileSystem);
    }

    public static /* synthetic */ Sequence listRecursively$default(AbstractC1197l abstractC1197l, C c, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return abstractC1197l.listRecursively(c, z);
    }

    public static /* synthetic */ AbstractC1195j openReadWrite$default(AbstractC1197l abstractC1197l, C c, boolean z, boolean z2, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return abstractC1197l.openReadWrite(c, z, z2);
    }

    public static /* synthetic */ J sink$default(AbstractC1197l abstractC1197l, C c, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return abstractC1197l.sink(c, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @JvmName(name = "-read")
    /* renamed from: -read, reason: not valid java name */
    public final <T> T m3360read(C file, Function1<? super InterfaceC1192g, ? extends T> readerAction) throws IOException {
        ?? r5;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(readerAction, "readerAction");
        F b = z.b(source(file));
        T th = null;
        try {
            T invoke = readerAction.invoke(b);
            InlineMarker.finallyStart(1);
            try {
                b.close();
            } catch (Throwable th2) {
                th = th2;
            }
            InlineMarker.finallyEnd(1);
            T t = th;
            th = invoke;
            r5 = t;
        } catch (Throwable th3) {
            InlineMarker.finallyStart(1);
            try {
                b.close();
            } catch (Throwable th4) {
                ExceptionsKt.addSuppressed(th3, th4);
            }
            InlineMarker.finallyEnd(1);
            r5 = th3;
        }
        if (r5 == 0) {
            return th;
        }
        throw r5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @JvmName(name = "-write")
    /* renamed from: -write, reason: not valid java name */
    public final <T> T m3361write(C file, boolean mustCreate, Function1<? super InterfaceC1191f, ? extends T> writerAction) throws IOException {
        ?? r5;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(writerAction, "writerAction");
        E a = z.a(sink(file, mustCreate));
        T th = null;
        try {
            T invoke = writerAction.invoke(a);
            InlineMarker.finallyStart(1);
            try {
                a.close();
            } catch (Throwable th2) {
                th = th2;
            }
            InlineMarker.finallyEnd(1);
            T t = th;
            th = invoke;
            r5 = t;
        } catch (Throwable th3) {
            InlineMarker.finallyStart(1);
            try {
                a.close();
            } catch (Throwable th4) {
                ExceptionsKt.addSuppressed(th3, th4);
            }
            InlineMarker.finallyEnd(1);
            r5 = th3;
        }
        if (r5 == 0) {
            return th;
        }
        throw r5;
    }

    public final J appendingSink(C file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return appendingSink(file, false);
    }

    public abstract J appendingSink(C file, boolean mustExist) throws IOException;

    public abstract void atomicMove(C source, C target) throws IOException;

    public abstract C canonicalize(C path) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public void copy(C source, C target) throws IOException {
        Throwable th;
        Long l;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        K source2 = source(source);
        Throwable th2 = null;
        try {
            E a = z.a(sink$default(this, target, false, 2, null));
            try {
                l = Long.valueOf(a.o(source2));
                try {
                    a.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    a.close();
                } catch (Throwable th5) {
                    ExceptionsKt.addSuppressed(th4, th5);
                }
                th = th4;
                l = null;
            }
        } catch (Throwable th6) {
            th2 = th6;
            if (source2 != null) {
                try {
                    source2.close();
                } catch (Throwable th7) {
                    ExceptionsKt.addSuppressed(th2, th7);
                }
            }
        }
        if (th != null) {
            throw th;
        }
        l.getClass();
        if (source2 != null) {
            try {
                source2.close();
            } catch (Throwable th8) {
                th2 = th8;
            }
        }
        if (th2 != null) {
            throw th2;
        }
    }

    public final void createDirectories(C dir, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        ArrayDeque arrayDeque = new ArrayDeque();
        for (C c = dir; c != null && !exists(c); c = c.c()) {
            arrayDeque.addFirst(c);
        }
        if (mustCreate && arrayDeque.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = arrayDeque.iterator();
        while (it.hasNext()) {
            createDirectory$default(this, (C) it.next(), false, 2, null);
        }
    }

    public final void createDirectory(C dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        createDirectory(dir, false);
    }

    public abstract void createDirectory(C dir, boolean mustCreate) throws IOException;

    public abstract void createSymlink(C source, C target) throws IOException;

    public final void delete(C path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        delete(path, false);
    }

    public abstract void delete(C path, boolean mustExist) throws IOException;

    public void deleteRecursively(C fileOrDirectory, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        Iterator it = SequencesKt.sequence(new okio.internal.e(this, fileOrDirectory, null)).iterator();
        while (it.hasNext()) {
            delete((C) it.next(), mustExist && !it.hasNext());
        }
    }

    public final boolean exists(C path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return metadataOrNull(path) != null;
    }

    public abstract List<C> list(C dir) throws IOException;

    public abstract List<C> listOrNull(C dir);

    public Sequence<C> listRecursively(C dir, boolean followSymlinks) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        return SequencesKt.sequence(new okio.internal.f(dir, this, followSymlinks, null));
    }

    public final C1196k metadata(C path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        C1196k metadataOrNull = metadataOrNull(path);
        if (metadataOrNull != null) {
            return metadataOrNull;
        }
        throw new FileNotFoundException(com.google.gson.internal.c.a(path, "no such file: "));
    }

    public abstract C1196k metadataOrNull(C path) throws IOException;

    public abstract AbstractC1195j openReadOnly(C file) throws IOException;

    public final AbstractC1195j openReadWrite(C file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return openReadWrite(file, false, false);
    }

    public abstract AbstractC1195j openReadWrite(C file, boolean mustCreate, boolean mustExist) throws IOException;

    public final J sink(C file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return sink(file, false);
    }

    public abstract J sink(C file, boolean mustCreate) throws IOException;

    public abstract K source(C file) throws IOException;

    public final Sequence<C> listRecursively(C dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return listRecursively(dir, false);
    }

    public final void deleteRecursively(C fileOrDirectory) throws IOException {
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        deleteRecursively(fileOrDirectory, false);
    }

    public final void createDirectories(C dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        createDirectories(dir, false);
    }
}
