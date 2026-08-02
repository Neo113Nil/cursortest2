package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.io.path.PathsKt__PathUtilsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C;

@SourceDebugExtension({"SMAP\nNioFileSystemWrappingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NioFileSystemWrappingFileSystem.kt\nokio/NioFileSystemWrappingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,196:1\n1634#2,3:197\n1#3:200\n37#4:201\n36#4,3:202\n37#4:205\n36#4,3:206\n37#4:209\n36#4,3:210\n*S KotlinDebug\n*F\n+ 1 NioFileSystemWrappingFileSystem.kt\nokio/NioFileSystemWrappingFileSystem\n*L\n77#1:197,3\n104#1:201\n104#1:202,3\n125#1:205\n125#1:206,3\n138#1:209\n138#1:210,3\n*E\n"})
/* loaded from: classes5.dex */
public final class x extends y {
    public final FileSystem a;

    public x(FileSystem nioFileSystem) {
        Intrinsics.checkNotNullParameter(nioFileSystem, "nioFileSystem");
        this.a = nioFileSystem;
    }

    @Override // okio.v, okio.AbstractC1197l
    public final J appendingSink(C file, boolean z) {
        Intrinsics.checkNotNullParameter(file, "file");
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.add(StandardOpenOption.APPEND);
        if (!z) {
            createListBuilder.add(StandardOpenOption.CREATE);
        }
        List build = CollectionsKt.build(createListBuilder);
        Path t = t(file);
        StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) build.toArray(new StandardOpenOption[0]);
        OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
        OutputStream newOutputStream = Files.newOutputStream(t, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(newOutputStream, "newOutputStream(...)");
        Intrinsics.checkNotNullParameter(newOutputStream, "<this>");
        return new B(newOutputStream, new L());
    }

    @Override // okio.y, okio.v, okio.AbstractC1197l
    public final void atomicMove(C source, C target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        try {
            Intrinsics.checkNotNullExpressionValue(Files.move(t(source), t(target), (CopyOption[]) Arrays.copyOf(new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING}, 2)), "move(...)");
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // okio.v, okio.AbstractC1197l
    public final C canonicalize(C path) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            C.a aVar = C.Companion;
            Path realPath = t(path).toRealPath(new LinkOption[0]);
            Intrinsics.checkNotNullExpressionValue(realPath, "toRealPath(...)");
            return C.a.d(aVar, realPath);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(com.google.gson.internal.c.a(path, "no such file: "));
        }
    }

    @Override // okio.AbstractC1197l, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r0.b == true) goto L8;
     */
    @Override // okio.v, okio.AbstractC1197l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void createDirectory(C dir, boolean z) {
        boolean z2;
        Intrinsics.checkNotNullParameter(dir, "dir");
        C1196k metadataOrNull = metadataOrNull(dir);
        if (metadataOrNull != null) {
            z2 = true;
        }
        z2 = false;
        if (z2 && z) {
            throw new IOException(dir + " already exists.");
        }
        try {
            Intrinsics.checkNotNullExpressionValue(Files.createDirectory(t(dir), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)), "createDirectory(...)");
        } catch (IOException e) {
            if (!z2) {
                throw new IOException(com.google.gson.internal.c.a(dir, "failed to create directory: "), e);
            }
        }
    }

    @Override // okio.y, okio.v, okio.AbstractC1197l
    public final void createSymlink(C source, C target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullExpressionValue(Files.createSymbolicLink(t(source), t(target), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)), "createSymbolicLink(...)");
    }

    @Override // okio.v, okio.AbstractC1197l
    public final void delete(C path, boolean z) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        Path t = t(path);
        try {
            Files.delete(t);
        } catch (NoSuchFileException unused) {
            if (z) {
                throw new FileNotFoundException(com.google.gson.internal.c.a(path, "no such file: "));
            }
        } catch (IOException unused2) {
            if (Files.exists(t, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new IOException(com.google.gson.internal.c.a(path, "failed to delete "));
            }
        }
    }

    @Override // okio.v, okio.AbstractC1197l
    public final List<C> list(C dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        ArrayList s = s(dir, true);
        Intrinsics.checkNotNull(s);
        return s;
    }

    @Override // okio.v, okio.AbstractC1197l
    public final List<C> listOrNull(C dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return s(dir, false);
    }

    @Override // okio.y, okio.v, okio.AbstractC1197l
    public final C1196k metadataOrNull(C path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return y.l(t(path));
    }

    @Override // okio.v, okio.AbstractC1197l
    public final AbstractC1195j openReadOnly(C file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            FileChannel open = FileChannel.open(t(file), StandardOpenOption.READ);
            Intrinsics.checkNotNull(open);
            return new w(false, open);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(com.google.gson.internal.c.a(file, "no such file: "));
        }
    }

    @Override // okio.v, okio.AbstractC1197l
    public final AbstractC1195j openReadWrite(C file, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (z && z2) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.add(StandardOpenOption.READ);
        createListBuilder.add(StandardOpenOption.WRITE);
        if (z) {
            createListBuilder.add(StandardOpenOption.CREATE_NEW);
        } else if (!z2) {
            createListBuilder.add(StandardOpenOption.CREATE);
        }
        List build = CollectionsKt.build(createListBuilder);
        try {
            Path t = t(file);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) build.toArray(new StandardOpenOption[0]);
            FileChannel open = FileChannel.open(t, (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
            Intrinsics.checkNotNull(open);
            return new w(true, open);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(com.google.gson.internal.c.a(file, "no such file: "));
        }
    }

    public final ArrayList s(C c, boolean z) {
        List listDirectoryEntries$default;
        Path t = t(c);
        try {
            listDirectoryEntries$default = PathsKt__PathUtilsKt.listDirectoryEntries$default(t, null, 1, null);
            ArrayList arrayList = new ArrayList();
            Iterator it = listDirectoryEntries$default.iterator();
            while (it.hasNext()) {
                arrayList.add(C.a.d(C.Companion, (Path) it.next()));
            }
            CollectionsKt.sort(arrayList);
            return arrayList;
        } catch (Exception unused) {
            if (!z) {
                return null;
            }
            if (Files.exists(t, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new IOException(com.google.gson.internal.c.a(c, "failed to list "));
            }
            throw new FileNotFoundException(com.google.gson.internal.c.a(c, "no such file: "));
        }
    }

    @Override // okio.v, okio.AbstractC1197l
    public final J sink(C file, boolean z) {
        Intrinsics.checkNotNullParameter(file, "file");
        List createListBuilder = CollectionsKt.createListBuilder();
        if (z) {
            createListBuilder.add(StandardOpenOption.CREATE_NEW);
        }
        List build = CollectionsKt.build(createListBuilder);
        try {
            Path t = t(file);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) build.toArray(new StandardOpenOption[0]);
            OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
            OutputStream newOutputStream = Files.newOutputStream(t, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
            Intrinsics.checkNotNullExpressionValue(newOutputStream, "newOutputStream(...)");
            Intrinsics.checkNotNullParameter(newOutputStream, "<this>");
            return new B(newOutputStream, new L());
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(com.google.gson.internal.c.a(file, "no such file: "));
        }
    }

    @Override // okio.v, okio.AbstractC1197l
    public final K source(C file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            InputStream newInputStream = Files.newInputStream(t(file), (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
            Intrinsics.checkNotNullExpressionValue(newInputStream, "newInputStream(...)");
            return z.d(newInputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(com.google.gson.internal.c.a(file, "no such file: "));
        }
    }

    public final Path t(C c) {
        Path path;
        path = this.a.getPath(c.a.r(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return path;
    }

    @Override // okio.y, okio.v
    public final String toString() {
        String simpleName = Reflection.getOrCreateKotlinClass(this.a.getClass()).getSimpleName();
        Intrinsics.checkNotNull(simpleName);
        return simpleName;
    }
}
