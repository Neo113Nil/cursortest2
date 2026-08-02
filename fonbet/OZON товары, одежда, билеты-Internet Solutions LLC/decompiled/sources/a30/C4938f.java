package a30;

import a30.C4933a;
import android.content.Context;
import c30.j;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a30.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4938f implements Jb.e<j> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f36250a;

    public C4938f(Pc.a<Context> aVar) {
        this.f36250a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) ((C4933a.C0687a.c) this.f36250a).get();
        Intrinsics.checkNotNullParameter(context, "context");
        return new j(context);
    }
}
