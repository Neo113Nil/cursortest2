package q1;

/* renamed from: q1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0982b extends Q1.l {
    public static void F(java.io.File file, java.io.File target) {
        kotlin.jvm.internal.i.e(file, "<this>");
        kotlin.jvm.internal.i.e(target, "target");
        if (!file.exists()) {
            throw new q1.C0981a(file, null, "The source file doesn't exist.");
        }
        if (target.exists()) {
            throw new q1.C0981a(file, target, "The destination file already exists.");
        }
        if (file.isDirectory()) {
            if (!target.mkdirs()) {
                throw new androidx.datastore.preferences.protobuf.C0076l(file, target, "Failed to create target directory.");
            }
            return;
        }
        java.io.File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(target);
            try {
                u0.AbstractC0995a.f(fileInputStream, fileOutputStream, 8192);
                Q1.d.g(fileOutputStream, null);
                Q1.d.g(fileInputStream, null);
            } finally {
            }
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                Q1.d.g(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static java.lang.String G(java.io.File file) {
        java.nio.charset.Charset charset = y1.a.f8486a;
        kotlin.jvm.internal.i.e(charset, "charset");
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(file), charset);
        try {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            char[] cArr = new char[8192];
            for (int read = inputStreamReader.read(cArr); read >= 0; read = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, read);
            }
            java.lang.String stringWriter2 = stringWriter.toString();
            kotlin.jvm.internal.i.d(stringWriter2, "toString(...)");
            Q1.d.g(inputStreamReader, null);
            return stringWriter2;
        } finally {
        }
    }

    public static final void H(java.io.FileOutputStream fileOutputStream, java.lang.String text, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.i.e(text, "text");
        kotlin.jvm.internal.i.e(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        java.nio.charset.CharsetEncoder newEncoder = charset.newEncoder();
        java.nio.charset.CodingErrorAction codingErrorAction = java.nio.charset.CodingErrorAction.REPLACE;
        java.nio.charset.CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        java.nio.CharBuffer allocate = java.nio.CharBuffer.allocate(8192);
        kotlin.jvm.internal.i.b(onUnmappableCharacter);
        java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate(8192 * ((int) java.lang.Math.ceil(onUnmappableCharacter.maxBytesPerChar())));
        kotlin.jvm.internal.i.d(allocate2, "allocate(...)");
        int i2 = 0;
        int i3 = 0;
        while (i2 < text.length()) {
            int min = java.lang.Math.min(8192 - i3, text.length() - i2);
            int i4 = i2 + min;
            char[] array = allocate.array();
            kotlin.jvm.internal.i.d(array, "array(...)");
            text.getChars(i2, i4, array, i3);
            allocate.limit(min + i3);
            i3 = 1;
            if (!onUnmappableCharacter.encode(allocate, allocate2, i4 == text.length()).isUnderflow()) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            fileOutputStream.write(allocate2.array(), 0, allocate2.position());
            if (allocate.position() != allocate.limit()) {
                allocate.put(0, allocate.get());
            } else {
                i3 = 0;
            }
            allocate.clear();
            allocate2.clear();
            i2 = i4;
        }
    }
}
