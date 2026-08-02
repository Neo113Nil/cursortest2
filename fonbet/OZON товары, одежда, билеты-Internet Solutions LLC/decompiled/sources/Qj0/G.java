package Qj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class G extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23513a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23514b;

    /* renamed from: c, reason: collision with root package name */
    private final Double f23515c;

    /* renamed from: d, reason: collision with root package name */
    private final Long f23516d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(@NotNull String eventType, String str, Double d11, Long l11) {
        super(0);
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.f23513a = eventType;
        this.f23514b = str;
        this.f23515c = d11;
        this.f23516d = l11;
    }

    public final Long a() {
        return this.f23516d;
    }

    @NotNull
    public final String b() {
        return this.f23513a;
    }

    public final Double c() {
        return this.f23515c;
    }

    public final String d() {
        return this.f23514b;
    }
}
