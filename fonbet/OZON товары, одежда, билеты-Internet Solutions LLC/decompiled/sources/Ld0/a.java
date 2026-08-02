package Ld0;

import Od0.a;
import Od0.c;
import Od0.e;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f16828a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f16829b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f16830c;

    /* renamed from: Ld0.a$a, reason: collision with other inner class name */
    static final class C0322a extends AbstractC7737t implements Function0<List<? extends Od0.b>> {
        C0322a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Od0.b> invoke() {
            Collection<Od0.d<e>> values = a.this.f16828a.g().values();
            Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : values) {
                if (obj instanceof Od0.b) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    static final class b extends AbstractC7737t implements Function0<List<? extends Od0.e<e>>> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Od0.e<e>> invoke() {
            Collection<Od0.d<e>> values = a.this.f16828a.g().values();
            Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : values) {
                if (obj instanceof Od0.e) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    public a(@NotNull c diStore) {
        Intrinsics.checkNotNullParameter(diStore, "diStore");
        this.f16828a = diStore;
        this.f16829b = k.b(new b());
        this.f16830c = k.b(new C0322a());
    }

    private final Od0.a d(Od0.c cVar, Context context) {
        e.b aVar;
        e.b bVar = null;
        if (cVar != null) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            if (cVar instanceof c.b) {
                Uri uri = ((c.b) cVar).b();
                Intrinsics.checkNotNullParameter(uri, "uri");
                aVar = new e.b.C0410b(uri);
            } else if (cVar instanceof c.a) {
                Intent intent = ((c.a) cVar).b();
                Intrinsics.checkNotNullParameter(intent, "intent");
                aVar = new e.b.a(intent);
            }
            bVar = aVar;
        }
        InterfaceC4008j interfaceC4008j = this.f16830c;
        c cVar2 = this.f16828a;
        if (cVar != null) {
            Iterator it = ((List) interfaceC4008j.getValue()).iterator();
            while (it.hasNext()) {
                ((Od0.b) it.next()).beforeHandleDeeplink(cVar2, cVar);
            }
        }
        InterfaceC4008j interfaceC4008j2 = this.f16829b;
        if (bVar != null) {
            Iterator it2 = ((List) interfaceC4008j2.getValue()).iterator();
            while (it2.hasNext()) {
                ((Od0.e) it2.next()).beforeHandleDeeplink(cVar2, bVar);
            }
        }
        if (context != null && cVar != null) {
            for (Od0.b bVar2 : (List) interfaceC4008j.getValue()) {
                if (bVar2.canHandle(cVar)) {
                    Od0.a handleDeeplink = bVar2.handleDeeplink(cVar2, cVar, context);
                    if ((handleDeeplink instanceof a.C0408a) || (handleDeeplink instanceof a.b)) {
                        return handleDeeplink;
                    }
                }
            }
        }
        if (bVar != null) {
            Iterator it3 = ((List) interfaceC4008j2.getValue()).iterator();
            while (it3.hasNext()) {
                e.a handleDeeplink2 = ((Od0.e) it3.next()).handleDeeplink(cVar2, bVar);
                boolean z11 = handleDeeplink2 instanceof e.a.C0409a;
                if (z11 || (handleDeeplink2 instanceof e.a.b)) {
                    Intrinsics.checkNotNullParameter(handleDeeplink2, "<this>");
                    if (z11) {
                        return new a.C0408a();
                    }
                    if (!(handleDeeplink2 instanceof e.a.b)) {
                        return new a.c();
                    }
                    e.a.b bVar3 = (e.a.b) handleDeeplink2;
                    return new a.b(bVar3.a(), bVar3.b());
                }
            }
        }
        return new a.c();
    }

    @NotNull
    public final Od0.a b(@NotNull c.b deeplink, @NotNull Context activityContext) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        return d(deeplink, activityContext);
    }

    @InterfaceC3999a
    @NotNull
    public final e.a c(@NotNull e.b deeplink) {
        Od0.c cVar;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(deeplink, "<this>");
        if (deeplink instanceof e.b.C0410b) {
            Uri uri = ((e.b.C0410b) deeplink).b();
            Intrinsics.checkNotNullParameter(uri, "uri");
            cVar = new c.b(uri);
        } else if (deeplink instanceof e.b.a) {
            Intent intent = ((e.b.a) deeplink).b();
            Intrinsics.checkNotNullParameter(intent, "intent");
            cVar = new c.a(intent);
        } else {
            cVar = null;
        }
        Od0.a d11 = d(cVar, null);
        Intrinsics.checkNotNullParameter(d11, "<this>");
        if (d11 instanceof a.C0408a) {
            return new e.a.C0409a();
        }
        if (!(d11 instanceof a.b)) {
            return new e.a.c();
        }
        a.b bVar = (a.b) d11;
        return new e.a.b(bVar.a(), bVar.b());
    }
}
