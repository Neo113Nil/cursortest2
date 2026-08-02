package a10;

import L00.l;
import We.L;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.domain.decode.OkHttpHeaders;

/* loaded from: classes7.dex */
public final class j extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private final int f36206a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f36207b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final OkHttpHeaders f36208c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final L f36209d;

    public j(int i11, @NotNull String message, @NotNull OkHttpHeaders headers, @NotNull L rawResponse) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
        this.f36206a = i11;
        this.f36207b = message;
        this.f36208c = headers;
        this.f36209d = rawResponse;
    }

    public final int a() {
        return this.f36206a;
    }

    @NotNull
    public final l b() {
        return this.f36208c;
    }

    @NotNull
    public final Object d() {
        return this.f36209d;
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String getMessage() {
        return this.f36207b;
    }
}
