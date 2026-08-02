package a30;

import a30.C4933a;
import android.content.Context;
import c30.C5742a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a30.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4935c implements Jb.e<C5742a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f36243a;

    public C4935c(Pc.a<Context> aVar) {
        this.f36243a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) ((C4933a.C0687a.c) this.f36243a).get();
        Intrinsics.checkNotNullParameter(context, "context");
        return new C5742a(context);
    }
}
