package sg.bigo.ads.K0;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.K0.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4965w {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(File file) {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream fileInputStream2;
        File file2 = new File(file.getPath() + ".bak");
        if (file2.exists()) {
            file.delete();
            file2.renameTo(file);
        }
        ?? r6 = 0;
        try {
            if (!file.exists()) {
                return null;
            }
            try {
                int length = (int) file.length();
                if (length != 0) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        try {
                            byte[] bArr = new byte[length];
                            if (fileInputStream.read(bArr) == length) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused) {
                                    AbstractC5496a.b("IOUtils", "close file " + file.getPath() + " failed");
                                }
                                return bArr;
                            }
                        } catch (Exception unused2) {
                            AbstractC5496a.a("IOUtils", "read file " + file.getPath() + " failed");
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused3) {
                                    AbstractC5496a.b("IOUtils", "close file " + file.getPath() + " failed");
                                }
                            }
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused4) {
                                AbstractC5496a.b("IOUtils", "close file " + file.getPath() + " failed");
                            }
                        }
                        throw th;
                    }
                } else {
                    fileInputStream = null;
                }
                file.getName();
                byteArrayOutputStream = new ByteArrayOutputStream();
                fileInputStream2 = new FileInputStream(file);
            } catch (Exception unused5) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = r6;
                if (fileInputStream != null) {
                }
                throw th;
            }
            try {
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int read = fileInputStream2.read(bArr2);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, read);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int length2 = byteArray.length;
                file.getName();
                if (byteArray.length == 0) {
                    AbstractC5496a.a("IOUtils", "read " + file.getName() + " failed, data's length is 0.");
                    throw new Exception("read " + file.getName() + " failed, data's length is 0.");
                }
                try {
                    fileInputStream2.close();
                } catch (IOException unused6) {
                    AbstractC5496a.b("IOUtils", "close file " + file.getPath() + " failed");
                }
                return byteArray;
            } catch (Exception unused7) {
                fileInputStream = fileInputStream2;
                AbstractC5496a.a("IOUtils", "read file " + file.getPath() + " failed");
                if (fileInputStream != null) {
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            r6 = ".bak";
        }
    }

    public static String a(InputStream inputStream) {
        String str = "";
        if (inputStream == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream2.write(bArr, 0, read);
                }
                str = byteArrayOutputStream2.toString();
                a((Closeable) inputStream);
                a(byteArrayOutputStream2);
            } catch (IOException unused) {
                byteArrayOutputStream = byteArrayOutputStream2;
                a((Closeable) inputStream);
                if (byteArrayOutputStream != null) {
                    a(byteArrayOutputStream);
                }
                return str;
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                a((Closeable) inputStream);
                if (byteArrayOutputStream != null) {
                    a(byteArrayOutputStream);
                }
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        return str;
    }

    public static void a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream;
        StringBuilder sb;
        File file2 = new File(file.getPath() + ".bak");
        if (file.exists()) {
            if (file2.exists()) {
                if (!file.delete()) {
                    sb = new StringBuilder("delete locked file failed: ");
                    AbstractC5496a.a("IOUtils", sb.append(file.getName()).toString());
                }
            } else if (!file.renameTo(file2)) {
                sb = new StringBuilder("rename locked file failed: ");
                AbstractC5496a.a("IOUtils", sb.append(file.getName()).toString());
            }
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = null;
                }
            } catch (Exception unused) {
            }
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.getFD().sync();
                if (file2.exists() && !file2.delete()) {
                    AbstractC5496a.a("IOUtils", "delete backup file failed: " + file2.getName());
                }
                fileOutputStream.close();
            } catch (Exception unused2) {
                fileOutputStream2 = fileOutputStream;
                AbstractC5496a.a("IOUtils", "write file " + file.getPath() + " failed");
                if (file.exists() && !file.delete()) {
                    AbstractC5496a.a("IOUtils", "delete locked file with exception failed: " + file.getName());
                }
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
            } catch (Throwable th2) {
                th = th2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (IOException unused4) {
        }
    }
}
