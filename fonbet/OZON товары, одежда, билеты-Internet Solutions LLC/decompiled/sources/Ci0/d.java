package Ci0;

import Sc.InterfaceC4008j;
import Sc.k;
import Sd0.c;
import Sd0.h;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.tracker.debug.menu.presentation.TrackerDebugMenuActivity;

/* loaded from: classes7.dex */
public final class d extends Sd0.g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4008j f5117a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4008j f5118b;

    static final class a extends AbstractC7737t implements Function0<c> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f5119b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(0);
            this.f5119b = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final c invoke() {
            return new c(this.f5119b);
        }
    }

    static final class b extends AbstractC7737t implements Function0<Sd0.f> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f5120b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(0);
            this.f5120b = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Sd0.f invoke() {
            final f fVar = this.f5120b;
            return new Sd0.f() { // from class: Ci0.e
                @Override // Sd0.f
                public final Sd0.c handle(h link, Sd0.b bVar) {
                    String str;
                    Application application;
                    Application application2;
                    String host;
                    Intrinsics.checkNotNullParameter(link, "link");
                    Intrinsics.checkNotNullParameter(bVar, "<unused var>");
                    Uri c11 = link.c();
                    if (c11 == null || (host = c11.getHost()) == null) {
                        str = null;
                    } else {
                        str = host.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
                    }
                    if (!Intrinsics.d(str, "trackersdk")) {
                        return c.d.f26178a;
                    }
                    f fVar2 = f.this;
                    application = fVar2.f5122a;
                    application2 = fVar2.f5122a;
                    Uri c12 = link.c();
                    Intent b11 = link.b();
                    Bundle extras = b11 != null ? b11.getExtras() : null;
                    Intent intent = new Intent(application2, (Class<?>) TrackerDebugMenuActivity.class);
                    intent.setData(c12);
                    if (extras != null) {
                        intent.putExtras(extras);
                    }
                    intent.setFlags(268435456);
                    application.startActivity(intent);
                    return c.b.f26177a;
                }
            };
        }
    }

    d(f fVar) {
        this.f5117a = k.b(new b(fVar));
        this.f5118b = k.b(new a(fVar));
    }

    @Override // Sd0.g
    public final Td0.a getDebugHandler() {
        return (Td0.a) this.f5118b.getValue();
    }

    @Override // Sd0.g
    public final Sd0.f getLinkHandler() {
        return (Sd0.f) this.f5117a.getValue();
    }
}
