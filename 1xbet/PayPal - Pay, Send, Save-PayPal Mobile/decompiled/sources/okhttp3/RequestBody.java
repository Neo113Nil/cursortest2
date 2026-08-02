package okhttp3;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lokhttp3/RequestBody;", "", "<init>", "()V", "Lokhttp3/MediaType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Lokio/BufferedSink;", "sink", "", "writeTo", "(Lokio/BufferedSink;)V", "", "isDuplex", "()Z", "isOneShot", "Lokio/ByteString;", "sha256", "()Lokio/ByteString;", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RequestBody {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.RequestBody.Companion INSTANCE;
    public static final okhttp3.RequestBody EMPTY;

    public long contentLength() throws java.io.IOException {
        return -1L;
    }

    /* renamed from: contentType */
    public abstract okhttp3.MediaType getGetHighSpeedVideoFpsRangesFor();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(okio.BufferedSink sink) throws java.io.IOException;

    public final okio.ByteString sha256() throws java.io.IOException {
        okio.HashingSink sha256 = okio.HashingSink.INSTANCE.sha256(okio.Okio.blackhole());
        okio.BufferedSink buffer = okio.Okio.buffer(sha256);
        try {
            writeTo(buffer);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(buffer, null);
            return sha256.hash();
        } finally {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\b\u001a\u00020\u0007*\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000bJ\u001f\u0010\b\u001a\u00020\u0007*\u00020\f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\rJ3\u0010\b\u001a\u00020\u0007*\u00020\u000e2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\b\u0010\u0012J\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00132\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u0014J'\u0010\b\u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u0018J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u001aJ!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0019\u001a\u00020\nH\u0007¢\u0006\u0004\b\b\u0010\u001bJ5\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\b\u0010\u001cJ!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001d\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\b\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lokhttp3/RequestBody$Companion;", "", "<init>", "()V", "", "Lokhttp3/MediaType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lokhttp3/RequestBody;", "create", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "Lokio/ByteString;", "(Lokio/ByteString;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "Ljava/io/FileDescriptor;", "(Ljava/io/FileDescriptor;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "", "", "offset", "byteCount", "([BLokhttp3/MediaType;II)Lokhttp3/RequestBody;", "Ljava/io/File;", "(Ljava/io/File;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "Lokio/Path;", "Lokio/FileSystem;", "fileSystem", "(Lokio/Path;Lokio/FileSystem;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "content", "(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;", "(Lokhttp3/MediaType;Lokio/ByteString;)Lokhttp3/RequestBody;", "(Lokhttp3/MediaType;[BII)Lokhttp3/RequestBody;", "file", "(Lokhttp3/MediaType;Ljava/io/File;)Lokhttp3/RequestBody;", "EMPTY", "Lokhttp3/RequestBody;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion companion, java.lang.String str, okhttp3.MediaType mediaType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(java.lang.String str, okhttp3.MediaType mediaType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.Pair<java.nio.charset.Charset, okhttp3.MediaType> chooseCharset = okhttp3.internal.Internal.chooseCharset(mediaType);
            java.nio.charset.Charset component1 = chooseCharset.component1();
            okhttp3.MediaType component2 = chooseCharset.component2();
            byte[] bytes = str.getBytes(component1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            return create(bytes, component2, 0, bytes.length);
        }

        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion companion, okio.ByteString byteString, okhttp3.MediaType mediaType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(final okio.ByteString byteString, final okhttp3.MediaType mediaType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
            return new okhttp3.RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
                @Override // okhttp3.RequestBody
                /* renamed from: contentType, reason: from getter */
                public final okhttp3.MediaType getGetHighSpeedVideoFpsRangesFor() {
                    return okhttp3.MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public final long contentLength() {
                    return byteString.size();
                }

                @Override // okhttp3.RequestBody
                public final void writeTo(okio.BufferedSink sink) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
                    sink.write(byteString);
                }
            };
        }

        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion companion, java.io.FileDescriptor fileDescriptor, okhttp3.MediaType mediaType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(fileDescriptor, mediaType);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(final java.io.FileDescriptor fileDescriptor, final okhttp3.MediaType mediaType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileDescriptor, "");
            return new okhttp3.RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                public final boolean isOneShot() {
                    return true;
                }

                @Override // okhttp3.RequestBody
                /* renamed from: contentType, reason: from getter */
                public final okhttp3.MediaType getGetHighSpeedVideoFpsRangesFor() {
                    return okhttp3.MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public final void writeTo(okio.BufferedSink sink) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(fileDescriptor);
                    try {
                        sink.getBuffer().writeAll(okio.Okio.source(fileInputStream));
                        kotlin.io.CloseableKt.closeFinally(fileInputStream, null);
                    } finally {
                    }
                }
            };
        }

        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion companion, byte[] bArr, okhttp3.MediaType mediaType, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                mediaType = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return companion.create(bArr, mediaType, i, i2);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(final byte[] bArr, final okhttp3.MediaType mediaType, final int i, final int i2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            okhttp3.internal._UtilCommonKt.checkOffsetAndCount(bArr.length, i, i2);
            return new okhttp3.RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$3
                @Override // okhttp3.RequestBody
                /* renamed from: contentType, reason: from getter */
                public final okhttp3.MediaType getGetHighSpeedVideoFpsRangesFor() {
                    return okhttp3.MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public final long contentLength() {
                    return i2;
                }

                @Override // okhttp3.RequestBody
                public final void writeTo(okio.BufferedSink sink) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
                    sink.write(bArr, i, i2);
                }
            };
        }

        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion companion, java.io.File file, okhttp3.MediaType mediaType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(final java.io.File file, final okhttp3.MediaType mediaType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
            return new okhttp3.RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$1
                @Override // okhttp3.RequestBody
                /* renamed from: contentType, reason: from getter */
                public final okhttp3.MediaType getGetHighSpeedVideoFpsRangesFor() {
                    return okhttp3.MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public final long contentLength() {
                    return file.length();
                }

                @Override // okhttp3.RequestBody
                public final void writeTo(okio.BufferedSink sink) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
                    okio.Source source = okio.Okio.source(file);
                    try {
                        sink.writeAll(source);
                        kotlin.io.CloseableKt.closeFinally(source, null);
                    } finally {
                    }
                }
            };
        }

        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion companion, okio.Path path, okio.FileSystem fileSystem, okhttp3.MediaType mediaType, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                mediaType = null;
            }
            return companion.create(path, fileSystem, mediaType);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(final okio.Path path, final okio.FileSystem fileSystem, final okhttp3.MediaType mediaType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
            return new okhttp3.RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$2
                @Override // okhttp3.RequestBody
                /* renamed from: contentType, reason: from getter */
                public final okhttp3.MediaType getGetHighSpeedVideoFpsRangesFor() {
                    return okhttp3.MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public final long contentLength() {
                    java.lang.Long size = fileSystem.metadata(path).getSize();
                    if (size != null) {
                        return size.longValue();
                    }
                    return -1L;
                }

                @Override // okhttp3.RequestBody
                public final void writeTo(okio.BufferedSink sink) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
                    okio.Source source = fileSystem.source(path);
                    try {
                        sink.writeAll(source);
                        kotlin.io.CloseableKt.closeFinally(source, null);
                    } finally {
                    }
                }
            };
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(okhttp3.MediaType contentType, java.lang.String content) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
            return create(content, contentType);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(okhttp3.MediaType contentType, okio.ByteString content) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
            return create(content, contentType);
        }

        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion companion, okhttp3.MediaType mediaType, byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return companion.create(mediaType, bArr, i, i2);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(okhttp3.MediaType contentType, byte[] content, int offset, int byteCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
            return create(content, contentType, offset, byteCount);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(okhttp3.MediaType contentType, java.io.File file) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
            return create(file, contentType);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(byte[] bArr, okhttp3.MediaType mediaType, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            return create$default(this, bArr, mediaType, i, 0, 4, (java.lang.Object) null);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(byte[] bArr, okhttp3.MediaType mediaType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            return create$default(this, bArr, mediaType, 0, 0, 6, (java.lang.Object) null);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(byte[] bArr) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            return create$default(this, bArr, (okhttp3.MediaType) null, 0, 0, 7, (java.lang.Object) null);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(okhttp3.MediaType mediaType, byte[] bArr, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            return create$default(this, mediaType, bArr, i, 0, 8, (java.lang.Object) null);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(okhttp3.MediaType mediaType, byte[] bArr) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            return create$default(this, mediaType, bArr, 0, 0, 12, (java.lang.Object) null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        okhttp3.RequestBody.Companion companion = new okhttp3.RequestBody.Companion(null);
        INSTANCE = companion;
        EMPTY = okhttp3.RequestBody.Companion.create$default(companion, okio.ByteString.EMPTY, (okhttp3.MediaType) null, 1, (java.lang.Object) null);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(byte[] bArr, okhttp3.MediaType mediaType, int i, int i2) {
        return INSTANCE.create(bArr, mediaType, i, i2);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(byte[] bArr, okhttp3.MediaType mediaType, int i) {
        return INSTANCE.create(bArr, mediaType, i);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(byte[] bArr, okhttp3.MediaType mediaType) {
        return INSTANCE.create(bArr, mediaType);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(byte[] bArr) {
        return INSTANCE.create(bArr);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(okio.Path path, okio.FileSystem fileSystem, okhttp3.MediaType mediaType) {
        return INSTANCE.create(path, fileSystem, mediaType);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(okio.ByteString byteString, okhttp3.MediaType mediaType) {
        return INSTANCE.create(byteString, mediaType);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(okhttp3.MediaType mediaType, byte[] bArr, int i, int i2) {
        return INSTANCE.create(mediaType, bArr, i, i2);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(okhttp3.MediaType mediaType, byte[] bArr, int i) {
        return INSTANCE.create(mediaType, bArr, i);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(okhttp3.MediaType mediaType, byte[] bArr) {
        return INSTANCE.create(mediaType, bArr);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(okhttp3.MediaType mediaType, okio.ByteString byteString) {
        return INSTANCE.create(mediaType, byteString);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(okhttp3.MediaType mediaType, java.lang.String str) {
        return INSTANCE.create(mediaType, str);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(okhttp3.MediaType mediaType, java.io.File file) {
        return INSTANCE.create(mediaType, file);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(java.lang.String str, okhttp3.MediaType mediaType) {
        return INSTANCE.create(str, mediaType);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(java.io.FileDescriptor fileDescriptor, okhttp3.MediaType mediaType) {
        return INSTANCE.create(fileDescriptor, mediaType);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(java.io.File file, okhttp3.MediaType mediaType) {
        return INSTANCE.create(file, mediaType);
    }
}
