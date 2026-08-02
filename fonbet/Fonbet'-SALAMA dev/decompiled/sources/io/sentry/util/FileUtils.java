package io.sentry.util;

import W5.AbstractC0486a1;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class FileUtils {
    public static boolean deleteRecursively(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return true;
        }
        for (File file2 : listFiles) {
            if (!deleteRecursively(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    public static byte[] readBytesFromFile(String str, long j) {
        File file = new File(str);
        if (!file.exists()) {
            throw new IOException(AbstractC0486a1.h("File '", file.getName(), "' doesn't exists"));
        }
        if (!file.isFile()) {
            throw new IOException(AbstractC0486a1.h("Reading path ", str, " failed, because it's not a file."));
        }
        if (!file.canRead()) {
            throw new IOException(AbstractC0486a1.h("Reading the item ", str, " failed, because can't read the file."));
        }
        if (file.length() > j) {
            throw new IOException(String.format("Reading file failed, because size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", str, Long.valueOf(file.length()), Long.valueOf(j)));
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read == -1) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            bufferedInputStream.close();
                            fileInputStream.close();
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String readText(File file) {
        if (file == null || !file.exists() || !file.isFile() || !file.canRead()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
            }
            while (true) {
                String readLine2 = bufferedReader.readLine();
                if (readLine2 == null) {
                    bufferedReader.close();
                    return sb.toString();
                }
                sb.append("\n");
                sb.append(readLine2);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
