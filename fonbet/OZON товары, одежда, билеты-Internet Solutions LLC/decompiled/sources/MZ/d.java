package MZ;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashMap f17754a;

    public d(@NotNull HashMap requestHandlers) {
        Intrinsics.checkNotNullParameter(requestHandlers, "requestHandlers");
        this.f17754a = requestHandlers;
    }

    public final c<LZ.c> a(@NotNull LZ.c request) {
        Intrinsics.checkNotNullParameter(request, "request");
        c<LZ.c> cVar = (c) this.f17754a.get(request.getClass());
        if (cVar == null) {
            throw new IllegalArgumentException("Request handler not found for ".concat(request.getClass().getSimpleName()));
        }
        if (cVar.a(request)) {
            return cVar;
        }
        return null;
    }
}
