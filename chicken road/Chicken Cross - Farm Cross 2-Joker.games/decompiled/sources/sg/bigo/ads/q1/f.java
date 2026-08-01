package sg.bigo.ads.q1;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes3.dex */
public abstract class f {
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0121, code lost:
    
        throw new java.io.IOException("uncompressed size exceeds limit");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014d, code lost:
    
        throw new java.io.IOException("illegal entry: " + r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(File file, File file2) {
        if (!file.isFile()) {
            throw new IOException("zip not found: " + file);
        }
        if (!file2.exists() && !file2.mkdirs()) {
            throw new IOException("cannot mkdir: " + file2);
        }
        File canonicalFile = file2.getCanonicalFile();
        String canonicalPath = canonicalFile.getCanonicalPath();
        byte[] bArr = new byte[8192];
        ZipInputStream zipInputStream = null;
        try {
            ZipInputStream zipInputStream2 = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
            long j = 0;
            int i = 0;
            loop0: while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream2.getNextEntry();
                    if (nextEntry == null) {
                        try {
                            zipInputStream2.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    i++;
                    if (i > 2000) {
                        throw new IOException("too many zip entries");
                    }
                    String name = nextEntry.getName();
                    if (name.startsWith("/") || name.contains("..")) {
                        break;
                    }
                    File file3 = new File(canonicalFile, name);
                    String canonicalPath2 = file3.getCanonicalPath();
                    if (!canonicalPath2.startsWith(canonicalPath + File.separator) && !canonicalPath2.equals(canonicalPath)) {
                        throw new IOException("zip slip: " + name);
                    }
                    if (!nextEntry.isDirectory()) {
                        File parentFile = file3.getParentFile();
                        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                            throw new IOException("mkdir parent failed: " + parentFile);
                        }
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file3);
                            while (true) {
                                try {
                                    int read = zipInputStream2.read(bArr);
                                    if (read > 0) {
                                        j += read;
                                        if (j > 83886080) {
                                            break loop0;
                                        } else {
                                            fileOutputStream.write(bArr, 0, read);
                                        }
                                    } else {
                                        try {
                                            fileOutputStream.close();
                                            break;
                                        } catch (IOException unused2) {
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    zipInputStream = fileOutputStream;
                                    if (zipInputStream != null) {
                                        try {
                                            zipInputStream.close();
                                        } catch (IOException unused3) {
                                        }
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else if (!file3.exists() && !file3.mkdirs()) {
                        throw new IOException("mkdir failed: " + file3);
                    }
                    zipInputStream2.closeEntry();
                } catch (Throwable th3) {
                    th = th3;
                    zipInputStream = zipInputStream2;
                    if (zipInputStream != null) {
                        try {
                            zipInputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
