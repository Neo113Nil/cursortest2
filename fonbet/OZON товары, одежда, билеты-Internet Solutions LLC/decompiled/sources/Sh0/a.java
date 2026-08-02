package Sh0;

import Uh0.d;
import android.app.Application;
import gh0.AbstractC6735a;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import lh0.b;
import mh0.C8147a;
import mh0.c;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<AbstractC6735a> f26239a;

    public a(@NotNull Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26239a = C7714v.b0(new b(new C8147a(), new c()), new Th0.a(new Uh0.a(), new d()));
    }

    @NotNull
    public final List<AbstractC6735a> a() {
        return this.f26239a;
    }
}
