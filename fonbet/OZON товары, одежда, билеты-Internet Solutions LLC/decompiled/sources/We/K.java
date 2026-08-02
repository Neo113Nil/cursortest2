package We;

import Sc.InterfaceC3999a;
import We.C;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import sf.C9684j;
import sf.InterfaceC9682h;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0015"}, d2 = {"LWe/K;", "", "<init>", "()V", "LWe/C;", "contentType", "()LWe/C;", "", "contentLength", "()J", "Lsf/h;", "sink", "", "writeTo", "(Lsf/h;)V", "", "isDuplex", "()Z", "isOneShot", "Companion", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public abstract class K {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: We.K$a, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public static H a(@NotNull File asRequestBody, C c11) {
            Intrinsics.checkNotNullParameter(asRequestBody, "$this$asRequestBody");
            return new H(asRequestBody, c11);
        }

        @NotNull
        public static J b(@NotNull String toRequestBody, C c11) {
            Intrinsics.checkNotNullParameter(toRequestBody, "$this$toRequestBody");
            Charset charset = Charsets.UTF_8;
            if (c11 != null) {
                C.a aVar = C.f33536g;
                Charset c12 = c11.c(null);
                if (c12 == null) {
                    C.f33536g.getClass();
                    c11 = C.a.b(c11 + "; charset=utf-8");
                } else {
                    charset = c12;
                }
            }
            byte[] bytes = toRequestBody.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return c(bytes, c11, 0, bytes.length);
        }

        @NotNull
        public static J c(@NotNull byte[] toRequestBody, C c11, int i11, int i12) {
            Intrinsics.checkNotNullParameter(toRequestBody, "$this$toRequestBody");
            long length = toRequestBody.length;
            long j11 = i11;
            long j12 = i12;
            byte[] bArr = Ye.b.f34900a;
            if ((j11 | j12) < 0 || j11 > length || length - j11 < j12) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return new J(toRequestBody, c11, i12, i11);
        }

        public static /* synthetic */ J d(Companion companion, byte[] bArr, C c11, int i11, int i12) {
            if ((i12 & 1) != 0) {
                c11 = null;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            int length = bArr.length;
            companion.getClass();
            return c(bArr, c11, i11, length);
        }
    }

    @InterfaceC3999a
    @NotNull
    public static final K create(C c11, @NotNull String content) {
        INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return Companion.b(content, c11);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract C contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(@NotNull InterfaceC9682h sink) throws IOException;

    @InterfaceC3999a
    @NotNull
    public static final K create(C c11, @NotNull C9684j toRequestBody) {
        INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(toRequestBody, "content");
        Intrinsics.checkNotNullParameter(toRequestBody, "$this$toRequestBody");
        return new I(toRequestBody, c11);
    }

    @NotNull
    public static final K create(@NotNull File file, C c11) {
        INSTANCE.getClass();
        return Companion.a(file, c11);
    }

    @NotNull
    public static final K create(@NotNull String str, C c11) {
        INSTANCE.getClass();
        return Companion.b(str, c11);
    }

    @NotNull
    public static final K create(@NotNull byte[] bArr) {
        return Companion.d(INSTANCE, bArr, null, 0, 7);
    }

    @NotNull
    public static final K create(@NotNull byte[] bArr, C c11) {
        return Companion.d(INSTANCE, bArr, c11, 0, 6);
    }

    @NotNull
    public static final K create(@NotNull byte[] bArr, C c11, int i11) {
        return Companion.d(INSTANCE, bArr, c11, i11, 4);
    }

    @NotNull
    public static final K create(@NotNull byte[] bArr, C c11, int i11, int i12) {
        INSTANCE.getClass();
        return Companion.c(bArr, c11, i11, i12);
    }

    @NotNull
    public static final K create(@NotNull C9684j toRequestBody, C c11) {
        INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(toRequestBody, "$this$toRequestBody");
        return new I(toRequestBody, c11);
    }

    @InterfaceC3999a
    @NotNull
    public static final K create(C c11, @NotNull byte[] content) {
        Companion companion = INSTANCE;
        int length = content.length;
        companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return Companion.c(content, c11, 0, length);
    }

    @InterfaceC3999a
    @NotNull
    public static final K create(C c11, @NotNull byte[] content, int i11) {
        Companion companion = INSTANCE;
        int length = content.length;
        companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return Companion.c(content, c11, i11, length);
    }

    @InterfaceC3999a
    @NotNull
    public static final K create(C c11, @NotNull byte[] content, int i11, int i12) {
        INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return Companion.c(content, c11, i11, i12);
    }

    @InterfaceC3999a
    @NotNull
    public static final K create(C c11, @NotNull File file) {
        INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        return Companion.a(file, c11);
    }
}
