package Md;

import Cd.F;
import Ld.y;
import Md.a;
import Sd.b;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import yd.C10884b;

/* loaded from: classes.dex */
public final class b implements y.c {

    /* renamed from: i, reason: collision with root package name */
    private static boolean f17879i;

    /* renamed from: j, reason: collision with root package name */
    private static final HashMap f17880j;

    /* renamed from: a, reason: collision with root package name */
    private int[] f17881a = null;

    /* renamed from: b, reason: collision with root package name */
    private String f17882b = null;

    /* renamed from: c, reason: collision with root package name */
    private int f17883c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String[] f17884d = null;

    /* renamed from: e, reason: collision with root package name */
    private String[] f17885e = null;

    /* renamed from: f, reason: collision with root package name */
    private String[] f17886f = null;

    /* renamed from: g, reason: collision with root package name */
    private a.EnumC0345a f17887g = null;

    /* renamed from: h, reason: collision with root package name */
    private String[] f17888h = null;

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class a implements y.b {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f17889a = new ArrayList();

        @Override // Ld.y.b
        public final void a() {
            f((String[]) this.f17889a.toArray(new String[0]));
        }

        @Override // Ld.y.b
        public final void b(Object obj) {
            if (obj instanceof String) {
                this.f17889a.add((String) obj);
            }
        }

        @Override // Ld.y.b
        public final void c(@NotNull Sd.b bVar, @NotNull Sd.f fVar) {
        }

        @Override // Ld.y.b
        public final y.a d(@NotNull Sd.b bVar) {
            return null;
        }

        @Override // Ld.y.b
        public final void e(@NotNull Xd.f fVar) {
        }

        protected abstract void f(@NotNull String[] strArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Md.b$b, reason: collision with other inner class name */
    class C0347b implements y.a {
        C0347b() {
        }

        @Override // Ld.y.a
        public final void a() {
        }

        @Override // Ld.y.a
        public final y.b b(Sd.f fVar) {
            String b11 = fVar.b();
            if ("d1".equals(b11)) {
                return new Md.c(this);
            }
            if ("d2".equals(b11)) {
                return new Md.d(this);
            }
            return null;
        }

        @Override // Ld.y.a
        public final void c(Sd.f fVar, @NotNull Sd.b bVar, @NotNull Sd.f fVar2) {
        }

        @Override // Ld.y.a
        public final void d(Sd.f fVar, @NotNull Xd.f fVar2) {
        }

        @Override // Ld.y.a
        public final y.a e(@NotNull Sd.b bVar, Sd.f fVar) {
            return null;
        }

        @Override // Ld.y.a
        public final void f(Sd.f fVar, Object obj) {
            Map map;
            String b11 = fVar.b();
            boolean equals = "k".equals(b11);
            b bVar = b.this;
            if (equals) {
                if (obj instanceof Integer) {
                    a.EnumC0345a.Companion.getClass();
                    map = a.EnumC0345a.entryById;
                    a.EnumC0345a enumC0345a = (a.EnumC0345a) map.get((Integer) obj);
                    if (enumC0345a == null) {
                        enumC0345a = a.EnumC0345a.UNKNOWN;
                    }
                    bVar.f17887g = enumC0345a;
                    return;
                }
                return;
            }
            if ("mv".equals(b11)) {
                if (obj instanceof int[]) {
                    bVar.f17881a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(b11)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    bVar.f17882b = str;
                    return;
                }
                return;
            }
            if ("xi".equals(b11)) {
                if (obj instanceof Integer) {
                    bVar.f17883c = ((Integer) obj).intValue();
                }
            } else if ("pn".equals(b11) && (obj instanceof String) && !((String) obj).isEmpty()) {
                bVar.getClass();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes10.dex */
    class c implements y.a {
        c() {
        }

        @Override // Ld.y.a
        public final void a() {
        }

        @Override // Ld.y.a
        public final y.b b(Sd.f fVar) {
            if ("b".equals(fVar.b())) {
                return new e(this);
            }
            return null;
        }

        @Override // Ld.y.a
        public final void c(Sd.f fVar, @NotNull Sd.b bVar, @NotNull Sd.f fVar2) {
        }

        @Override // Ld.y.a
        public final void d(Sd.f fVar, @NotNull Xd.f fVar2) {
        }

        @Override // Ld.y.a
        public final y.a e(@NotNull Sd.b bVar, Sd.f fVar) {
            return null;
        }

        @Override // Ld.y.a
        public final void f(Sd.f fVar, Object obj) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes10.dex */
    class d implements y.a {
        d() {
        }

        @Override // Ld.y.a
        public final void a() {
        }

        @Override // Ld.y.a
        public final y.b b(Sd.f fVar) {
            String b11 = fVar.b();
            if ("data".equals(b11) || "filePartClassNames".equals(b11)) {
                return new f(this);
            }
            if ("strings".equals(b11)) {
                return new g(this);
            }
            return null;
        }

        @Override // Ld.y.a
        public final void c(Sd.f fVar, @NotNull Sd.b bVar, @NotNull Sd.f fVar2) {
        }

        @Override // Ld.y.a
        public final void d(Sd.f fVar, @NotNull Xd.f fVar2) {
        }

        @Override // Ld.y.a
        public final y.a e(@NotNull Sd.b bVar, Sd.f fVar) {
            return null;
        }

        @Override // Ld.y.a
        public final void f(Sd.f fVar, Object obj) {
            String b11 = fVar.b();
            boolean equals = "version".equals(b11);
            b bVar = b.this;
            if (equals) {
                if (obj instanceof int[]) {
                    bVar.f17881a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(b11)) {
                bVar.f17882b = obj instanceof String ? (String) obj : null;
            }
        }
    }

    static {
        try {
            f17879i = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f17879i = false;
        }
        HashMap hashMap = new HashMap();
        f17880j = hashMap;
        hashMap.put(b.a.b(new Sd.c("kotlin.jvm.internal.KotlinClass")), a.EnumC0345a.CLASS);
        hashMap.put(b.a.b(new Sd.c("kotlin.jvm.internal.KotlinFileFacade")), a.EnumC0345a.FILE_FACADE);
        hashMap.put(b.a.b(new Sd.c("kotlin.jvm.internal.KotlinMultifileClass")), a.EnumC0345a.MULTIFILE_CLASS);
        hashMap.put(b.a.b(new Sd.c("kotlin.jvm.internal.KotlinMultifileClassPart")), a.EnumC0345a.MULTIFILE_CLASS_PART);
        hashMap.put(b.a.b(new Sd.c("kotlin.jvm.internal.KotlinSyntheticClass")), a.EnumC0345a.SYNTHETIC_CLASS);
    }

    @Override // Ld.y.c
    public final void a() {
    }

    @Override // Ld.y.c
    public final y.a b(@NotNull Sd.b bVar, @NotNull C10884b c10884b) {
        a.EnumC0345a enumC0345a;
        Sd.c a11 = bVar.a();
        if (a11.equals(F.f4690a)) {
            return new C0347b();
        }
        if (a11.equals(F.f4704o)) {
            return new c();
        }
        if (f17879i || this.f17887g != null || (enumC0345a = (a.EnumC0345a) f17880j.get(bVar)) == null) {
            return null;
        }
        this.f17887g = enumC0345a;
        return new d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        if (r0 != Md.a.EnumC0345a.MULTIFILE_CLASS_PART) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        if (r11.f17884d != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Md.a k() {
        Rd.e eVar = Rd.e.f25015g;
        if (this.f17887g != null && this.f17881a != null) {
            Rd.e eVar2 = new Rd.e(this.f17881a, (this.f17883c & 8) != 0);
            if (eVar2.g(eVar)) {
                a.EnumC0345a enumC0345a = this.f17887g;
                if (enumC0345a != a.EnumC0345a.CLASS) {
                    if (enumC0345a != a.EnumC0345a.FILE_FACADE) {
                    }
                }
            } else {
                this.f17886f = this.f17884d;
                this.f17884d = null;
            }
            String[] strArr = this.f17888h;
            if (strArr != null) {
                Rd.a.a(strArr);
            }
            return new Md.a(this.f17887g, eVar2, this.f17884d, this.f17886f, this.f17885e, this.f17882b, this.f17883c);
        }
        return null;
    }
}
