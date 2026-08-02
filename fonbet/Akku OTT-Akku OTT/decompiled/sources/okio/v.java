package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C;

@SourceDebugExtension({"SMAP\nJvmSystemFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,158:1\n11563#2,3:159\n*S KotlinDebug\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n*L\n77#1:159,3\n*E\n"})
/* loaded from: classes5.dex */
public class v extends AbstractC1197l {
    public static ArrayList d(C c, boolean z) {
        File file = c.toFile();
        String[] list = file.list();
        if (list == null) {
            if (!z) {
                return null;
            }
            if (file.exists()) {
                throw new IOException(com.google.gson.internal.c.a(c, "failed to list "));
            }
            throw new FileNotFoundException(com.google.gson.internal.c.a(c, "no such file: "));
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Intrinsics.checkNotNull(str);
            arrayList.add(c.e(str));
        }
        CollectionsKt.sort(arrayList);
        return arrayList;
    }

    @Override // okio.AbstractC1197l
    public J appendingSink(C file, boolean z) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (z && !exists(file)) {
            throw new IOException(file + " doesn't exist.");
        }
        File file2 = file.toFile();
        Intrinsics.checkNotNullParameter(file2, "<this>");
        FileOutputStream fileOutputStream = new FileOutputStream(file2, true);
        Intrinsics.checkNotNullParameter(fileOutputStream, "<this>");
        return new B(fileOutputStream, new L());
    }

    @Override // okio.AbstractC1197l
    public void atomicMove(C source, C target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // okio.AbstractC1197l
    public C canonicalize(C path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File canonicalFile = path.toFile().getCanonicalFile();
        if (!canonicalFile.exists()) {
            throw new FileNotFoundException("no such file");
        }
        C.a aVar = C.Companion;
        Intrinsics.checkNotNull(canonicalFile);
        return C.a.b(aVar, canonicalFile);
    }

    @Override // okio.AbstractC1197l
    public void createDirectory(C dir, boolean z) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        C1196k metadataOrNull = metadataOrNull(dir);
        if (metadataOrNull == null || !metadataOrNull.b) {
            throw new IOException(com.google.gson.internal.c.a(dir, "failed to create directory: "));
        }
        if (z) {
            throw new IOException(dir + " already exists.");
        }
    }

    @Override // okio.AbstractC1197l
    public void createSymlink(C source, C target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("unsupported");
    }

    @Override // okio.AbstractC1197l
    public void delete(C path, boolean z) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException(com.google.gson.internal.c.a(path, "failed to delete "));
        }
        if (z) {
            throw new FileNotFoundException(com.google.gson.internal.c.a(path, "no such file: "));
        }
    }

    @Override // okio.AbstractC1197l
    public List<C> list(C dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        ArrayList d = d(dir, true);
        Intrinsics.checkNotNull(d);
        return d;
    }

    @Override // okio.AbstractC1197l
    public List<C> listOrNull(C dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return d(dir, false);
    }

    @Override // okio.AbstractC1197l
    public C1196k metadataOrNull(C path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = path.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || file.exists()) {
            return new C1196k(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
        }
        return null;
    }

    @Override // okio.AbstractC1197l
    public AbstractC1195j openReadOnly(C file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new u(false, new RandomAccessFile(file.toFile(), "r"));
    }

    @Override // okio.AbstractC1197l
    public AbstractC1195j openReadWrite(C file, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (z && z2) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        if (z && exists(file)) {
            throw new IOException(file + " already exists.");
        }
        if (!z2 || exists(file)) {
            return new u(true, new RandomAccessFile(file.toFile(), "rw"));
        }
        throw new IOException(file + " doesn't exist.");
    }

    @Override // okio.AbstractC1197l
    public J sink(C file, boolean z) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (z && exists(file)) {
            throw new IOException(file + " already exists.");
        }
        File file2 = file.toFile();
        Intrinsics.checkNotNullParameter(file2, "<this>");
        FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
        Intrinsics.checkNotNullParameter(fileOutputStream, "<this>");
        return new B(fileOutputStream, new L());
    }

    @Override // okio.AbstractC1197l
    public K source(C file) {
        Intrinsics.checkNotNullParameter(file, "file");
        File file2 = file.toFile();
        Intrinsics.checkNotNullParameter(file2, "<this>");
        return new t(new FileInputStream(file2), L.NONE);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
