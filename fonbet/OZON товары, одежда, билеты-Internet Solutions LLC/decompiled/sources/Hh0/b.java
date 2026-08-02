package Hh0;

import Ih0.c;
import T7.E;
import androidx.work.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xh0.d;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ch0.a f11000a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d f11001b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11002c;

    static final class a extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<c> f11003b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<c> list) {
            super(0);
            this.f11003b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return E.a(this.f11003b.size(), "successfully sent ", " events");
        }
    }

    /* renamed from: Hh0.b$b, reason: collision with other inner class name */
    static final class C0223b extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Exception f11004b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0223b(Exception exc) {
            super(0);
            this.f11004b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "failed to send events because of " + this.f11004b;
        }
    }

    public b(@NotNull Ch0.a pushStatusRepository, @NotNull d responseTypeResolver, int i11) {
        Intrinsics.checkNotNullParameter(pushStatusRepository, "pushStatusRepository");
        Intrinsics.checkNotNullParameter(responseTypeResolver, "responseTypeResolver");
        this.f11000a = pushStatusRepository;
        this.f11001b = responseTypeResolver;
        this.f11002c = i11;
    }

    @NotNull
    public final n.a a(int i11, String str) {
        Ch0.a aVar = this.f11000a;
        ArrayList b11 = aVar.b();
        if (b11.isEmpty()) {
            n.a.c cVar = new n.a.c();
            Intrinsics.checkNotNullExpressionValue(cVar, "success(...)");
            return cVar;
        }
        try {
            int e11 = aVar.e(b11, str, Ih0.n.TASK_MANAGER, false);
            int i12 = sh0.b.f98783c;
            sh0.b.f("PushStatusWorkerDelegate", null, new a(b11), 6);
            this.f11001b.getClass();
            d.a a11 = d.a(e11);
            if (a11 == d.a.SUCCESS) {
                aVar.d(b11);
                return new n.a.c();
            }
            if (a11 == d.a.CLIENT_ERROR) {
                aVar.d(b11);
                return new n.a.C0823a();
            }
            if (i11 + 1 < this.f11002c) {
                aVar.c(b11);
                return new n.a.b();
            }
            aVar.c(b11);
            return new n.a.C0823a();
        } catch (Exception e12) {
            aVar.c(b11);
            int i13 = sh0.b.f98783c;
            sh0.b.f("PushStatusWorkerDelegate", null, new C0223b(e12), 6);
            n.a.C0823a c0823a = new n.a.C0823a();
            Intrinsics.checkNotNullExpressionValue(c0823a, "failure(...)");
            return c0823a;
        }
    }
}
