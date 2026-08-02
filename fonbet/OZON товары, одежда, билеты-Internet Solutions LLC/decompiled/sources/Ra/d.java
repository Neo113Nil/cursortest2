package Ra;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f24938a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ByteBuffer f24939b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b f24940c;

    d(g gVar, ByteBuffer byteBuffer, b bVar) {
        this.f24938a = gVar;
        this.f24939b = byteBuffer;
        this.f24940c = bVar;
    }

    public final void a() {
        this.f24938a.n();
    }

    public final void b(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f24938a.o(error);
        throw error;
    }

    public final ByteBuffer c() {
        Qa.b bVar;
        bVar = this.f24940c.f24904a;
        return this.f24938a.i(this.f24939b, bVar.h());
    }
}
