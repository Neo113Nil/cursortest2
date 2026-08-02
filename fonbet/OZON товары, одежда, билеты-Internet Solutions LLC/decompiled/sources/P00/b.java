package P00;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final int f21447a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f21448b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i11, Exception exc, @NotNull String responseMessage) {
        super(exc);
        Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
        this.f21447a = i11;
        this.f21448b = responseMessage;
    }

    public final int a() {
        return this.f21447a;
    }

    @NotNull
    public final String b() {
        return this.f21448b;
    }
}
