package L4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class v extends o {
    @Override // L4.o
    public final void a(z zVar) {
        kotlin.jvm.internal.l.f("path", zVar);
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File e3 = zVar.e();
        if (e3.delete() || !e3.exists()) {
            return;
        }
        throw new IOException("failed to delete " + zVar);
    }

    @Override // L4.o
    public final List d(z zVar) {
        kotlin.jvm.internal.l.f("dir", zVar);
        File e3 = zVar.e();
        String[] list = e3.list();
        if (list == null) {
            if (e3.exists()) {
                throw new IOException("failed to list " + zVar);
            }
            throw new FileNotFoundException("no such file: " + zVar);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            kotlin.jvm.internal.l.c(str);
            arrayList.add(zVar.d(str));
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // L4.o
    public n f(z zVar) {
        kotlin.jvm.internal.l.f("path", zVar);
        File e3 = zVar.e();
        boolean isFile = e3.isFile();
        boolean isDirectory = e3.isDirectory();
        long lastModified = e3.lastModified();
        long length = e3.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !e3.exists()) {
            return null;
        }
        return new n(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
    }

    @Override // L4.o
    public final u g(z zVar) {
        return new u(new RandomAccessFile(zVar.e(), "r"));
    }

    @Override // L4.o
    public final G h(z zVar) {
        kotlin.jvm.internal.l.f("file", zVar);
        File e3 = zVar.e();
        Logger logger = x.f3123a;
        return new C0220c(1, new FileOutputStream(e3, false), new K());
    }

    @Override // L4.o
    public final I i(z zVar) {
        kotlin.jvm.internal.l.f("file", zVar);
        File e3 = zVar.e();
        Logger logger = x.f3123a;
        return new C0221d(new FileInputStream(e3), K.f3065d);
    }

    public void j(z zVar, z zVar2) {
        kotlin.jvm.internal.l.f("source", zVar);
        kotlin.jvm.internal.l.f("target", zVar2);
        if (zVar.e().renameTo(zVar2.e())) {
            return;
        }
        throw new IOException("failed to move " + zVar + " to " + zVar2);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
