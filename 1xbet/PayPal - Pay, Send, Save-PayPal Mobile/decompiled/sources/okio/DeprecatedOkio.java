package okio;

@kotlin.Deprecated(message = "changed in Okio 2.x")
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000b\u0010\u0010J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\t\u0010\u0013J+\u0010\t\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016\"\u00020\u0017H\u0007¢\u0006\u0004\b\t\u0010\u0019J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\t\u0010\u001cJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u001dJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u000e\u0010 J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016\"\u00020\u0017H\u0007¢\u0006\u0004\b\u000e\u0010!J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u000e\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0007¢\u0006\u0004\b#\u0010$"}, d2 = {"Lokio/-DeprecatedOkio;", "", "<init>", "()V", "Ljava/io/File;", "file", "Lokio/Sink;", "appendingSink", "(Ljava/io/File;)Lokio/Sink;", "sink", "Lokio/BufferedSink;", "buffer", "(Lokio/Sink;)Lokio/BufferedSink;", "Lokio/Source;", "source", "Lokio/BufferedSource;", "(Lokio/Source;)Lokio/BufferedSource;", "Ljava/io/OutputStream;", "outputStream", "(Ljava/io/OutputStream;)Lokio/Sink;", "Ljava/nio/file/Path;", "path", "", "Ljava/nio/file/OpenOption;", "options", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Sink;", "Ljava/net/Socket;", "socket", "(Ljava/net/Socket;)Lokio/Sink;", "(Ljava/io/File;)Lokio/Source;", "Ljava/io/InputStream;", "inputStream", "(Ljava/io/InputStream;)Lokio/Source;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Source;", "(Ljava/net/Socket;)Lokio/Source;", "blackhole", "()Lokio/Sink;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: okio.-DeprecatedOkio, reason: invalid class name */
/* loaded from: classes3.dex */
public final class DeprecatedOkio {
    public static final okio.DeprecatedOkio INSTANCE = new okio.DeprecatedOkio();

    private DeprecatedOkio() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "file.appendingSink()", imports = {"okio.appendingSink"}))
    public final okio.Sink appendingSink(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        return okio.Okio.appendingSink(file);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "sink.buffer()", imports = {"okio.buffer"}))
    public final okio.BufferedSink buffer(okio.Sink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        return okio.Okio.buffer(sink);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "source.buffer()", imports = {"okio.buffer"}))
    public final okio.BufferedSource buffer(okio.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        return okio.Okio.buffer(source);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "file.sink()", imports = {"okio.sink"}))
    public final okio.Sink sink(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        return okio.Okio__JvmOkioKt.sink$default(file, false, 1, null);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "outputStream.sink()", imports = {"okio.sink"}))
    public final okio.Sink sink(java.io.OutputStream outputStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputStream, "");
        return okio.Okio.sink(outputStream);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "path.sink(*options)", imports = {"okio.sink"}))
    public final okio.Sink sink(java.nio.file.Path path, java.nio.file.OpenOption... options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
        return okio.Okio.sink(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length));
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "socket.sink()", imports = {"okio.sink"}))
    public final okio.Sink sink(java.net.Socket socket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "");
        return okio.Okio.sink(socket);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "file.source()", imports = {"okio.source"}))
    public final okio.Source source(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        return okio.Okio.source(file);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "inputStream.source()", imports = {"okio.source"}))
    public final okio.Source source(java.io.InputStream inputStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        return okio.Okio.source(inputStream);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "path.source(*options)", imports = {"okio.source"}))
    public final okio.Source source(java.nio.file.Path path, java.nio.file.OpenOption... options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
        return okio.Okio.source(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length));
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "socket.source()", imports = {"okio.source"}))
    public final okio.Source source(java.net.Socket socket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "");
        return okio.Okio.source(socket);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "blackholeSink()", imports = {"okio.blackholeSink"}))
    public final okio.Sink blackhole() {
        return okio.Okio.blackhole();
    }
}
