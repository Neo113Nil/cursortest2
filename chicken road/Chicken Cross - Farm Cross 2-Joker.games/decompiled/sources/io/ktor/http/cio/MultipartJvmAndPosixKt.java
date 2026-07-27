package io.ktor.http.cio;

import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* compiled from: MultipartJvmAndPosix.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "", "discardBlocking", "(Lio/ktor/utils/io/ByteReadChannel;)V", "ktor-http-cio"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MultipartJvmAndPosixKt {
    public static final void discardBlocking(ByteReadChannel byteReadChannel) {
        Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        BuildersKt__BuildersKt.runBlocking$default(null, new MultipartJvmAndPosixKt$discardBlocking$1(byteReadChannel, null), 1, null);
    }
}
