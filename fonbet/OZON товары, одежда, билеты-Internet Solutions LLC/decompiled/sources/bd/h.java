package bd;

import bd.g;
import bd.g.b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h extends m {
    public static void g(File file, File target) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        if (!file.exists()) {
            throw new o(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            throw new d(file, target, "The destination file already exists.");
        }
        if (file.isDirectory()) {
            if (!target.mkdirs()) {
                throw new f(file, target, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                C5652b.a(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    public static boolean h(@NotNull File start) {
        Intrinsics.checkNotNullParameter(start, "<this>");
        Intrinsics.checkNotNullParameter(start, "<this>");
        FileWalkDirection direction = FileWalkDirection.BOTTOM_UP;
        Intrinsics.checkNotNullParameter(start, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
        g.b bVar = new g(start, direction, null, null, null, 0, 32, null).new b();
        while (true) {
            boolean z11 = true;
            while (bVar.hasNext()) {
                File next = bVar.next();
                if (next.delete() || !next.exists()) {
                    if (z11) {
                        break;
                    }
                }
                z11 = false;
            }
            return z11;
        }
    }

    @NotNull
    public static String i(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return kotlin.text.h.j0('.', name, "");
    }

    @NotNull
    public static byte[] j(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i11 = (int) length;
            byte[] bArr = new byte[i11];
            int i12 = i11;
            int i13 = 0;
            while (i12 > 0) {
                int read = fileInputStream.read(bArr, i13, i12);
                if (read < 0) {
                    break;
                }
                i12 -= read;
                i13 += read;
            }
            if (i12 > 0) {
                bArr = Arrays.copyOf(bArr, i13);
                Intrinsics.checkNotNullExpressionValue(bArr, "copyOf(...)");
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    C5653c c5653c = new C5653c();
                    c5653c.write(read2);
                    C5652b.a(fileInputStream, c5653c);
                    int size = c5653c.size() + i11;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] c11 = c5653c.c();
                    bArr = Arrays.copyOf(bArr, size);
                    Intrinsics.checkNotNullExpressionValue(bArr, "copyOf(...)");
                    C7705l.o(i11, 0, c5653c.size(), c11, bArr);
                }
            }
            fileInputStream.close();
            return bArr;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                Vd0.b.a(fileInputStream, th2);
                throw th3;
            }
        }
    }

    public static ArrayList k(File file) {
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        ArrayList arrayList = new ArrayList();
        j action = new j(arrayList);
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(action, "action");
        q.a(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
        return arrayList;
    }

    public static String l(File file) {
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String d11 = q.d(inputStreamReader);
            inputStreamReader.close();
            return d11;
        } finally {
        }
    }

    @NotNull
    public static File m(@NotNull File file, @NotNull String relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        File relative2 = new File(relative);
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative2, "relative");
        if (i.b(relative2)) {
            return relative2;
        }
        String file2 = file.toString();
        Intrinsics.checkNotNullExpressionValue(file2, "toString(...)");
        if (file2.length() != 0) {
            char c11 = File.separatorChar;
            if (!kotlin.text.h.C(file2, c11)) {
                return new File(file2 + c11 + relative2);
            }
        }
        return new File(file2 + relative2);
    }

    public static void n(@NotNull File file, @NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            Unit unit = Unit.f71690a;
            fileOutputStream.close();
        } finally {
        }
    }

    public static void o(@NotNull File file, @NotNull String text, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            k.d(fileOutputStream, text, charset);
            Unit unit = Unit.f71690a;
            fileOutputStream.close();
        } finally {
        }
    }
}
