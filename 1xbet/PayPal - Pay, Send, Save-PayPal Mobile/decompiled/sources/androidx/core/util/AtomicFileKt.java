package androidx.core.util;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a-\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0014\u0010\u0012\u001a\u00020\b*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0014\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroid/util/AtomicFile;", "Lkotlin/Function1;", "Ljava/io/FileOutputStream;", "Lkotlin/ParameterName;", "", "block", "tryWrite", "(Landroid/util/AtomicFile;Lkotlin/jvm/functions/Function1;)V", "", "array", "writeBytes", "(Landroid/util/AtomicFile;[B)V", "", "text", "Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "writeText", "(Landroid/util/AtomicFile;Ljava/lang/String;Ljava/nio/charset/Charset;)V", "readBytes", "(Landroid/util/AtomicFile;)[B", "readText", "(Landroid/util/AtomicFile;Ljava/nio/charset/Charset;)Ljava/lang/String;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AtomicFileKt {
    public static final void tryWrite(android.util.AtomicFile atomicFile, kotlin.jvm.functions.Function1<? super java.io.FileOutputStream, kotlin.Unit> function1) {
        java.io.FileOutputStream startWrite = atomicFile.startWrite();
        try {
            function1.invoke(startWrite);
            atomicFile.finishWrite(startWrite);
        } catch (java.lang.Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }

    public static /* synthetic */ void writeText$default(android.util.AtomicFile atomicFile, java.lang.String str, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        writeText(atomicFile, str, charset);
    }

    public static final void writeText(android.util.AtomicFile atomicFile, java.lang.String str, java.nio.charset.Charset charset) {
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        writeBytes(atomicFile, bytes);
    }

    public static final byte[] readBytes(android.util.AtomicFile atomicFile) {
        return atomicFile.readFully();
    }

    public static /* synthetic */ java.lang.String readText$default(android.util.AtomicFile atomicFile, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return readText(atomicFile, charset);
    }

    public static final java.lang.String readText(android.util.AtomicFile atomicFile, java.nio.charset.Charset charset) {
        return new java.lang.String(atomicFile.readFully(), charset);
    }

    public static final void writeBytes(android.util.AtomicFile atomicFile, byte[] bArr) {
        java.io.FileOutputStream startWrite = atomicFile.startWrite();
        try {
            startWrite.write(bArr);
            atomicFile.finishWrite(startWrite);
        } catch (java.lang.Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }
}
