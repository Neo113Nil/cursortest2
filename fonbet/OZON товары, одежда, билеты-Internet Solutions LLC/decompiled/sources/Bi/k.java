package Bi;

import Bi.k;
import Hi.h;
import Hi.k;
import Hi.l;
import Sc.InterfaceC4008j;
import Sc.r;
import Sc.s;
import We.C;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.D;
import g.AbstractC6592d;
import g.InterfaceC6590b;
import h.C6760f;
import h.C6761g;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;

/* loaded from: classes6.dex */
public interface k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3828a = 0;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f3829a = new a();

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: Bi.k$a$a, reason: collision with other inner class name */
        static final class EnumC0102a {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ EnumC0102a[] $VALUES;
            public static final EnumC0102a NONE;
            public static final EnumC0102a WITHOUT_STATE;
            public static final EnumC0102a WITH_STATE;

            static {
                EnumC0102a enumC0102a = new EnumC0102a("NONE", 0);
                NONE = enumC0102a;
                EnumC0102a enumC0102a2 = new EnumC0102a("WITHOUT_STATE", 1);
                WITHOUT_STATE = enumC0102a2;
                EnumC0102a enumC0102a3 = new EnumC0102a("WITH_STATE", 2);
                WITH_STATE = enumC0102a3;
                EnumC0102a[] enumC0102aArr = {enumC0102a, enumC0102a2, enumC0102a3};
                $VALUES = enumC0102aArr;
                $ENTRIES = Xc.b.a(enumC0102aArr);
            }

            private EnumC0102a() {
                throw null;
            }

            public static EnumC0102a valueOf(String str) {
                return (EnumC0102a) Enum.valueOf(EnumC0102a.class, str);
            }

            public static EnumC0102a[] values() {
                return (EnumC0102a[]) $VALUES.clone();
            }
        }

        /* loaded from: classes10.dex */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3830a;

            static {
                int[] iArr = new int[EnumC0102a.values().length];
                try {
                    iArr[EnumC0102a.WITHOUT_STATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC0102a.WITH_STATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC0102a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f3830a = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.collections.K] */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
        public static void a(M m11, M m12, M m13, Hi.f fVar) {
            ?? r22;
            List<Hi.k> a11;
            Object bVar;
            if (fVar == null || (a11 = fVar.a()) == null) {
                r22 = 0;
            } else {
                List<Hi.k> list = a11;
                r22 = new ArrayList(C7714v.z(list, 10));
                for (Hi.k kVar : list) {
                    Intrinsics.checkNotNullParameter(kVar, "<this>");
                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(kotlin.text.h.j0('.', f(kVar.getPath()), ""));
                    if (mimeTypeFromExtension == null) {
                        mimeTypeFromExtension = "application/octet-stream";
                    }
                    if (kVar instanceof k.a) {
                        k.a aVar = (k.a) kVar;
                        long id2 = aVar.getId();
                        Uri uri = aVar.getUri();
                        String f7 = f(aVar.getPath());
                        C.f33536g.getClass();
                        bVar = new l.a(id2, uri, f7, C.a.b(mimeTypeFromExtension));
                    } else {
                        if (!(kVar instanceof k.b)) {
                            throw new Sc.o();
                        }
                        k.b bVar2 = (k.b) kVar;
                        long id3 = bVar2.getId();
                        Uri uri2 = bVar2.getUri();
                        String f11 = f(bVar2.getPath());
                        C.f33536g.getClass();
                        bVar = new l.b(id3, uri2, f11, C.a.b(mimeTypeFromExtension), bVar2.getDuration());
                    }
                    r22.add(bVar);
                }
            }
            if (r22 == 0) {
                r22 = K.f71697a;
            }
            h(m11, m12, m13, new Hi.g((List<? extends Hi.l>) r22, fVar != null ? fVar.b() : null));
        }

        public static final int b(Cursor cursor, String str) {
            Object a11;
            try {
                r.Companion companion = Sc.r.INSTANCE;
                a11 = Integer.valueOf(cursor.getColumnIndexOrThrow(str));
            } catch (Throwable th2) {
                r.Companion companion2 = Sc.r.INSTANCE;
                a11 = s.a(th2);
            }
            if (a11 instanceof r.b) {
                a11 = -1;
            }
            return ((Number) a11).intValue();
        }

        public static final String c(Cursor cursor, int i11) {
            if (i11 < 0 || cursor.isNull(i11)) {
                return null;
            }
            return cursor.getString(i11);
        }

        public static final C6761g.f e(Ci.k kVar) {
            I i11 = new I();
            i11.f71783a = true;
            I i12 = new I();
            i12.f71783a = true;
            k(i12, i11, kVar.c());
            boolean z11 = i11.f71783a;
            return (!z11 || i12.f71783a) ? (!i12.f71783a || z11) ? C6761g.b.f64579a : C6761g.e.f64581a : C6761g.c.f64580a;
        }

        private static String f(String str) {
            String separator = File.separator;
            Intrinsics.checkNotNullExpressionValue(separator, "separator");
            if (!kotlin.text.h.t(str, separator, false)) {
                return str;
            }
            Intrinsics.checkNotNullExpressionValue(separator, "separator");
            String substring = str.substring(kotlin.text.h.f(str, separator, 0, 6) + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static Ti.a g(final D d11, final xe.I i11, ComponentCallbacksC5392m componentCallbacksC5392m, Function1 function1, Function1 function12) {
            int i12;
            int extensionVersion;
            final M m11 = new M();
            final InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new o(componentCallbacksC5392m));
            final M m12 = new M();
            m12.f71787a = function1;
            final M m13 = new M();
            m13.f71787a = function12;
            final M m14 = new M();
            m14.f71787a = function12 != 0 ? EnumC0102a.WITH_STATE : function1 != 0 ? EnumC0102a.WITHOUT_STATE : EnumC0102a.NONE;
            if (Build.VERSION.SDK_INT >= 30) {
                extensionVersion = SdkExtensions.getExtensionVersion(30);
                if (extensionVersion >= 2) {
                    i12 = MediaStore.getPickImagesMaxLimit();
                    AbstractC6592d registerForActivityResult = componentCallbacksC5392m.registerForActivityResult(new g(), new InterfaceC6590b() { // from class: Bi.h
                        @Override // g.InterfaceC6590b
                        public final void onActivityResult(Object obj) {
                            k.a.a(M.this, m12, m13, (Hi.f) obj);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
                    AbstractC6592d registerForActivityResult2 = componentCallbacksC5392m.registerForActivityResult(new C6761g(), new InterfaceC6590b() { // from class: Bi.i
                        /* JADX WARN: Type inference failed for: r3v0, types: [Sc.j, java.lang.Object] */
                        @Override // g.InterfaceC6590b
                        public final void onActivityResult(Object obj) {
                            C10727i.c(D.this, null, null, new r((Uri) obj, i11, a11, m14, m12, m13, null), 3);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(registerForActivityResult2, "registerForActivityResult(...)");
                    final int i13 = i12;
                    AbstractC6592d registerForActivityResult3 = componentCallbacksC5392m.registerForActivityResult(new C6760f(i12), new InterfaceC6590b() { // from class: Bi.j
                        /* JADX WARN: Type inference failed for: r4v0, types: [Sc.j, java.lang.Object] */
                        @Override // g.InterfaceC6590b
                        public final void onActivityResult(Object obj) {
                            M m15 = m11;
                            ?? r42 = a11;
                            M m16 = m14;
                            M m17 = m12;
                            M m18 = m13;
                            C10727i.c(D.this, null, null, new q(m15, i13, (List) obj, r42, i11, m16, m17, m18, null), 3);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(registerForActivityResult3, "registerForActivityResult(...)");
                    return new Ti.a(new p(m11, registerForActivityResult, registerForActivityResult3, registerForActivityResult2, a11), new m(m12, m14, m13), new n(m13, m14, m12));
                }
            }
            i12 = 10;
            AbstractC6592d registerForActivityResult4 = componentCallbacksC5392m.registerForActivityResult(new g(), new InterfaceC6590b() { // from class: Bi.h
                @Override // g.InterfaceC6590b
                public final void onActivityResult(Object obj) {
                    k.a.a(M.this, m12, m13, (Hi.f) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(registerForActivityResult4, "registerForActivityResult(...)");
            AbstractC6592d registerForActivityResult22 = componentCallbacksC5392m.registerForActivityResult(new C6761g(), new InterfaceC6590b() { // from class: Bi.i
                /* JADX WARN: Type inference failed for: r3v0, types: [Sc.j, java.lang.Object] */
                @Override // g.InterfaceC6590b
                public final void onActivityResult(Object obj) {
                    C10727i.c(D.this, null, null, new r((Uri) obj, i11, a11, m14, m12, m13, null), 3);
                }
            });
            Intrinsics.checkNotNullExpressionValue(registerForActivityResult22, "registerForActivityResult(...)");
            final int i132 = i12;
            AbstractC6592d registerForActivityResult32 = componentCallbacksC5392m.registerForActivityResult(new C6760f(i12), new InterfaceC6590b() { // from class: Bi.j
                /* JADX WARN: Type inference failed for: r4v0, types: [Sc.j, java.lang.Object] */
                @Override // g.InterfaceC6590b
                public final void onActivityResult(Object obj) {
                    M m15 = m11;
                    ?? r42 = a11;
                    M m16 = m14;
                    M m17 = m12;
                    M m18 = m13;
                    C10727i.c(D.this, null, null, new q(m15, i132, (List) obj, r42, i11, m16, m17, m18, null), 3);
                }
            });
            Intrinsics.checkNotNullExpressionValue(registerForActivityResult32, "registerForActivityResult(...)");
            return new Ti.a(new p(m11, registerForActivityResult4, registerForActivityResult32, registerForActivityResult22, a11), new m(m12, m14, m13), new n(m13, m14, m12));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(M<EnumC0102a> m11, M<Function1<List<? extends Hi.l>, Unit>> m12, M<Function1<Hi.g, Unit>> m13, Hi.g gVar) {
            int i11 = b.f3830a[m11.f71787a.ordinal()];
            if (i11 == 1) {
                Function1<List<? extends Hi.l>, Unit> function1 = m12.f71787a;
                if (function1 != null) {
                    function1.invoke(gVar.a());
                    return;
                }
                return;
            }
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new Sc.o();
                }
            } else {
                Function1<Hi.g, Unit> function12 = m13.f71787a;
                if (function12 != null) {
                    function12.invoke(gVar);
                }
            }
        }

        public static Ti.a i(ComponentCallbacksC5392m componentCallbacksC5392m, Function1 function1, int i11) {
            D scope = androidx.lifecycle.K.a(componentCallbacksC5392m);
            C10720e0 c10720e0 = C10720e0.f105451a;
            He.b dispatcher = He.b.f10879b;
            if ((i11 & 8) != 0) {
                function1 = null;
            }
            Intrinsics.checkNotNullParameter(componentCallbacksC5392m, "<this>");
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            return g(scope, dispatcher, componentCallbacksC5392m, function1, null);
        }

        public static Ti.a j(ComponentCallbacksC5392m componentCallbacksC5392m, Function1 function1) {
            D scope = androidx.lifecycle.K.a(componentCallbacksC5392m);
            C10720e0 c10720e0 = C10720e0.f105451a;
            He.b dispatcher = He.b.f10879b;
            Intrinsics.checkNotNullParameter(componentCallbacksC5392m, "<this>");
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            return g(scope, dispatcher, componentCallbacksC5392m, null, function1);
        }

        private static final void k(I i11, I i12, Hi.h hVar) {
            if (hVar == null || hVar.equals(h.b.f11016a)) {
                return;
            }
            if (hVar.equals(h.d.f11018a)) {
                i11.f71783a = false;
                return;
            }
            if (hVar.equals(h.c.f11017a)) {
                i12.f71783a = false;
                return;
            }
            if (hVar.equals(h.e.f11019a)) {
                i12.f71783a = false;
                i11.f71783a = true;
            } else if (hVar instanceof h.a) {
                Iterator<T> it = ((h.a) hVar).a().iterator();
                while (it.hasNext()) {
                    k(i11, i12, (Hi.h) it.next());
                }
            }
        }
    }

    void a(@NotNull Ci.k kVar);

    void b(@NotNull Ci.k kVar, @NotNull Function1<? super Hi.g, Unit> function1);
}
