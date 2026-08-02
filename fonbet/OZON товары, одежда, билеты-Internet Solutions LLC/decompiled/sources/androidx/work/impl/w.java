package androidx.work.impl;

import O4.c;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements c.InterfaceC0397c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f45532a;

    @Override // O4.c.InterfaceC0397c
    public O4.c a(c.b configuration) {
        Context context = (Context) this.f45532a;
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(context, "context");
        c.b.a aVar = new c.b.a(context);
        aVar.d(configuration.f19938b);
        aVar.c(configuration.f19939c);
        aVar.e();
        aVar.a();
        c.b configuration2 = aVar.b();
        Intrinsics.checkNotNullParameter(configuration2, "configuration");
        return new P4.d(configuration2.f19937a, configuration2.f19938b, configuration2.f19939c, configuration2.f19940d, configuration2.f19941e);
    }
}
