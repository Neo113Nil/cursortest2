package Cf0;

import android.app.Application;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import qj.C9067a;

/* loaded from: classes7.dex */
final class D extends AbstractC7737t implements Function0<C9067a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f4838b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D(J j11) {
        super(0);
        this.f4838b = j11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9067a invoke() {
        Ld0.c cVar;
        C9067a c9067a;
        Object obj;
        C9067a c9067a2;
        cVar = this.f4838b.f4844a;
        Application context = cVar.c().a();
        Intrinsics.checkNotNullParameter(context, "context");
        c9067a = C9067a.f82186h;
        if (c9067a != null) {
            return c9067a;
        }
        obj = C9067a.f82185g;
        synchronized (obj) {
            c9067a2 = C9067a.f82186h;
            if (c9067a2 == null) {
                c9067a2 = new C9067a(context);
                C9067a.f82186h = c9067a2;
            }
        }
        return c9067a2;
    }
}
