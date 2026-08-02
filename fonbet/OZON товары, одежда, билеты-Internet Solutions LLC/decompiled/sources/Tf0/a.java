package Tf0;

import Ld0.c;
import Od0.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vf0.p;
import Yf0.i;
import android.net.Uri;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f27163a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f27164b;

    /* renamed from: Tf0.a$a, reason: collision with other inner class name */
    static final class C0545a extends AbstractC7737t implements Function0<p> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f27165b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0545a(c cVar) {
            super(0);
            this.f27165b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final p invoke() {
            return new p(this.f27165b);
        }
    }

    static final class b extends AbstractC7737t implements Function0<i> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f27166b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.f27166b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final i invoke() {
            return new i(this.f27166b);
        }
    }

    public a(@NotNull c store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.f27163a = k.b(new C0545a(store));
        this.f27164b = k.b(new b(store));
    }

    @NotNull
    public final Od0.a a(@NotNull Uri deeplink, @NotNull String path) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(path, "path");
        return path.equals("extraHeaders") ? ((p) this.f27163a.getValue()).d(deeplink) : path.equals("mockPath") ? ((i) this.f27164b.getValue()).c(deeplink) : new a.c();
    }
}
