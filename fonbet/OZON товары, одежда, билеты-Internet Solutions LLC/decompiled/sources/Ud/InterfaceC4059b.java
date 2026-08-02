package Ud;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9820K;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9845k;
import td.i0;

/* renamed from: Ud.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4059b {

    /* renamed from: Ud.b$a */
    public static final class a implements InterfaceC4059b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f27588a = new a();

        @Override // Ud.InterfaceC4059b
        @NotNull
        public final String a(@NotNull InterfaceC9842h classifier, @NotNull u renderer) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            Intrinsics.checkNotNullParameter(renderer, "renderer");
            if (classifier instanceof i0) {
                Sd.f name = ((i0) classifier).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return renderer.X(name, false);
            }
            Sd.d k11 = Vd.i.k(classifier);
            Intrinsics.checkNotNullExpressionValue(k11, "getFqName(...)");
            return renderer.P(k11);
        }
    }

    /* renamed from: Ud.b$b, reason: collision with other inner class name */
    public static final class C0556b implements InterfaceC4059b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0556b f27589a = new C0556b();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, td.h] */
        /* JADX WARN: Type inference failed for: r2v1, types: [td.k] */
        /* JADX WARN: Type inference failed for: r2v2, types: [td.k] */
        @Override // Ud.InterfaceC4059b
        @NotNull
        public final String a(@NotNull InterfaceC9842h classifier, @NotNull u renderer) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            Intrinsics.checkNotNullParameter(renderer, "renderer");
            if (classifier instanceof i0) {
                Sd.f name = ((i0) classifier).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return renderer.X(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(classifier.getName());
                classifier = classifier.d();
            } while (classifier instanceof InterfaceC9839e);
            return H.b(C7714v.v(arrayList));
        }
    }

    /* renamed from: Ud.b$c */
    public static final class c implements InterfaceC4059b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f27590a = new c();

        private static String b(InterfaceC9842h interfaceC9842h) {
            String str;
            Sd.f name = interfaceC9842h.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            String a11 = H.a(name);
            if (interfaceC9842h instanceof i0) {
                return a11;
            }
            InterfaceC9845k d11 = interfaceC9842h.d();
            Intrinsics.checkNotNullExpressionValue(d11, "getContainingDeclaration(...)");
            if (d11 instanceof InterfaceC9839e) {
                str = b((InterfaceC9842h) d11);
            } else if (d11 instanceof InterfaceC9820K) {
                Sd.d j11 = ((InterfaceC9820K) d11).c().j();
                Intrinsics.checkNotNullExpressionValue(j11, "toUnsafe(...)");
                Intrinsics.checkNotNullParameter(j11, "<this>");
                List<Sd.f> h11 = j11.h();
                Intrinsics.checkNotNullExpressionValue(h11, "pathSegments(...)");
                str = H.b(h11);
            } else {
                str = null;
            }
            if (str == null || str.equals("")) {
                return a11;
            }
            return str + '.' + a11;
        }

        @Override // Ud.InterfaceC4059b
        @NotNull
        public final String a(@NotNull InterfaceC9842h classifier, @NotNull u renderer) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            Intrinsics.checkNotNullParameter(renderer, "renderer");
            return b(classifier);
        }
    }

    @NotNull
    String a(@NotNull InterfaceC9842h interfaceC9842h, @NotNull u uVar);
}
