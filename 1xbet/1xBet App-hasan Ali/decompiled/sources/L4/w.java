package L4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* loaded from: classes.dex */
public final class w extends v {
    public static Long k(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // L4.v, L4.o
    public final n f(z zVar) {
        z zVar2;
        kotlin.jvm.internal.l.f("path", zVar);
        Path f = zVar.f();
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(f, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(f) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (readSymbolicLink != null) {
                String str = z.f3126l;
                zVar2 = j3.i.s(readSymbolicLink.toString());
            } else {
                zVar2 = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long k5 = creationTime != null ? k(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long k6 = lastModifiedTime != null ? k(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new n(isRegularFile, isDirectory, zVar2, valueOf, k5, k6, lastAccessTime != null ? k(lastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // L4.v
    public final void j(z zVar, z zVar2) {
        kotlin.jvm.internal.l.f("source", zVar);
        kotlin.jvm.internal.l.f("target", zVar2);
        try {
            Files.move(zVar.f(), zVar2.f(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e3) {
            throw new FileNotFoundException(e3.getMessage());
        }
    }

    @Override // L4.v
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
