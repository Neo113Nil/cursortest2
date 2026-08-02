package Ma;

import Ja.h;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f17782a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17783b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f17784c;

    /* renamed from: d, reason: collision with root package name */
    private final h f17785d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Map<String, List<String>> f17786e;

    /* renamed from: f, reason: collision with root package name */
    private final long f17787f;

    public d(int i11, @NotNull String statusMessage, String str, Long l11, h hVar, @NotNull Map headers, long j11) {
        Intrinsics.checkNotNullParameter(statusMessage, "statusMessage");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f17782a = i11;
        this.f17783b = str;
        this.f17784c = l11;
        this.f17785d = hVar;
        this.f17786e = headers;
        this.f17787f = j11;
    }

    public final Long a() {
        return this.f17784c;
    }

    public final String b() {
        return this.f17783b;
    }

    @NotNull
    public final Map<String, List<String>> c() {
        return this.f17786e;
    }

    public final h d() {
        return this.f17785d;
    }

    public final long e() {
        return this.f17787f;
    }

    public final int f() {
        return this.f17782a;
    }
}
