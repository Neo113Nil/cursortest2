package Qe;

import Le.InterfaceC3583a;
import Me.m;
import Me.n;
import Oe.AbstractC3683b;
import Oe.J;
import Oe.N;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class l extends Ne.a implements Pe.o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f23342a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Pe.b f23343b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final o f23344c;

    /* renamed from: d, reason: collision with root package name */
    private final Pe.o[] f23345d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Re.c f23346e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Pe.f f23347f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f23348g;

    /* renamed from: h, reason: collision with root package name */
    private String f23349h;

    /* renamed from: i, reason: collision with root package name */
    private String f23350i;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23351a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23351a = iArr;
        }
    }

    public l(@NotNull d composer, @NotNull Pe.b json, @NotNull o mode, Pe.o[] oVarArr) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f23342a = composer;
        this.f23343b = json;
        this.f23344c = mode;
        this.f23345d = oVarArr;
        this.f23346e = json.c();
        this.f23347f = json.b();
        int ordinal = mode.ordinal();
        if (oVarArr != null) {
            Pe.o oVar = oVarArr[ordinal];
            if (oVar == null && oVar == this) {
                return;
            }
            oVarArr[ordinal] = this;
        }
    }

    @Override // Ne.a, Ne.c
    public final void A(char c11) {
        q(String.valueOf(c11));
    }

    @Override // Ne.b
    public final void B(@NotNull Me.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        o oVar = this.f23344c;
        if (oVar.end != 0) {
            d dVar = this.f23342a;
            dVar.getClass();
            dVar.d();
            dVar.f(oVar.end);
        }
    }

    @Override // Ne.a
    public final void D(@NotNull Me.f descriptor, int i11) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i12 = a.f23351a[this.f23344c.ordinal()];
        boolean z11 = true;
        d dVar = this.f23342a;
        if (i12 == 1) {
            if (!dVar.a()) {
                dVar.f(',');
            }
            dVar.c();
            return;
        }
        if (i12 == 2) {
            if (dVar.a()) {
                this.f23348g = true;
                dVar.c();
                return;
            }
            if (i11 % 2 == 0) {
                dVar.f(',');
                dVar.c();
            } else {
                dVar.f(':');
                dVar.l();
                z11 = false;
            }
            this.f23348g = z11;
            return;
        }
        if (i12 == 3) {
            if (i11 == 0) {
                this.f23348g = true;
            }
            if (i11 == 1) {
                dVar.f(',');
                dVar.l();
                this.f23348g = false;
                return;
            }
            return;
        }
        if (!dVar.a()) {
            dVar.f(',');
        }
        dVar.c();
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        Pe.b json = this.f23343b;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.d(descriptor.getKind(), n.a.f17935a)) {
            json.b().getClass();
        }
        q(descriptor.e(i11));
        dVar.f(':');
        dVar.l();
    }

    @Override // Ne.a, Ne.c
    public final void a(byte b11) {
        if (this.f23348g) {
            q(String.valueOf((int) b11));
        } else {
            this.f23342a.e(b11);
        }
    }

    @Override // Ne.a, Ne.c
    @NotNull
    public final Ne.c c(@NotNull Me.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        boolean a11 = m.a(descriptor);
        o oVar = this.f23344c;
        Pe.b bVar = this.f23343b;
        d dVar = this.f23342a;
        if (a11) {
            if (!(dVar instanceof f)) {
                dVar = new f(dVar.f23335a, this.f23348g);
            }
            return new l(dVar, bVar, oVar, null);
        }
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        if (descriptor.isInline() && descriptor.equals(Pe.h.a())) {
            if (!(dVar instanceof e)) {
                dVar = new e(dVar.f23335a, this.f23348g);
            }
            return new l(dVar, bVar, oVar, null);
        }
        if (this.f23349h != null) {
            this.f23350i = descriptor.f();
            return this;
        }
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // Ne.c
    @NotNull
    public final Ne.b e(@NotNull Me.f desc) {
        o oVar;
        Pe.o oVar2;
        Intrinsics.checkNotNullParameter(desc, "descriptor");
        Pe.b bVar = this.f23343b;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Me.m kind = desc.getKind();
        if (kind instanceof Me.d) {
            oVar = o.POLY_OBJ;
        } else if (Intrinsics.d(kind, n.b.f17936a)) {
            oVar = o.LIST;
        } else if (Intrinsics.d(kind, n.c.f17937a)) {
            Me.f keyDescriptor = p.a(desc.c(0), bVar.c());
            Me.m kind2 = keyDescriptor.getKind();
            if (!(kind2 instanceof Me.e) && !Intrinsics.d(kind2, m.b.f17934a)) {
                bVar.b().getClass();
                Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
                throw new g("Value of type '" + keyDescriptor.f() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
            }
            oVar = o.MAP;
        } else {
            oVar = o.OBJ;
        }
        char c11 = oVar.begin;
        d dVar = this.f23342a;
        if (c11 != 0) {
            dVar.f(c11);
            dVar.b();
        }
        String str = this.f23349h;
        if (str != null) {
            String str2 = this.f23350i;
            if (str2 == null) {
                str2 = desc.f();
            }
            dVar.c();
            q(str);
            dVar.f(':');
            dVar.getClass();
            q(str2);
            this.f23349h = null;
            this.f23350i = null;
        }
        if (this.f23344c == oVar) {
            return this;
        }
        Pe.o[] oVarArr = this.f23345d;
        return (oVarArr == null || (oVar2 = oVarArr[oVar.ordinal()]) == null) ? new l(dVar, bVar, oVar, oVarArr) : oVar2;
    }

    @Override // Ne.a, Ne.c
    public final void g(short s11) {
        if (this.f23348g) {
            q(String.valueOf((int) s11));
        } else {
            this.f23342a.j(s11);
        }
    }

    @Override // Ne.a, Ne.c
    public final void h(boolean z11) {
        if (this.f23348g) {
            q(String.valueOf(z11));
        } else {
            this.f23342a.f23335a.c(String.valueOf(z11));
        }
    }

    @Override // Ne.a, Ne.c
    public final void i(float f7) {
        boolean z11 = this.f23348g;
        d dVar = this.f23342a;
        if (z11) {
            q(String.valueOf(f7));
        } else {
            dVar.f23335a.c(String.valueOf(f7));
        }
        this.f23347f.getClass();
        if (Float.isInfinite(f7) || Float.isNaN(f7)) {
            throw h.a(dVar.f23335a.toString(), Float.valueOf(f7));
        }
    }

    @Override // Ne.b
    public final boolean j(@NotNull N descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f23347f.getClass();
        return false;
    }

    @Override // Ne.a, Ne.c
    public final void m(int i11) {
        if (this.f23348g) {
            q(String.valueOf(i11));
        } else {
            this.f23342a.g(i11);
        }
    }

    @Override // Ne.a, Ne.c
    public final void q(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f23342a.k(value);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r0.b().b() != Pe.a.NONE) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0051, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r4, Me.n.d.f17938a) == false) goto L26;
     */
    @Override // Ne.a, Ne.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> void r(@NotNull Le.f<? super T> serializer, T t2) {
        String a11;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Pe.b json = this.f23343b;
        json.b().getClass();
        boolean z11 = serializer instanceof AbstractC3683b;
        if (!z11) {
            int i11 = k.f23341a[json.b().b().ordinal()];
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    throw new Sc.o();
                }
                Me.m kind = serializer.b().getKind();
                if (!Intrinsics.d(kind, n.a.f17935a)) {
                }
                Me.f b11 = serializer.b();
                Intrinsics.checkNotNullParameter(b11, "<this>");
                Intrinsics.checkNotNullParameter(json, "json");
                Iterator<Annotation> it = b11.getAnnotations().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        a11 = json.b().a();
                        break;
                    }
                    Annotation next = it.next();
                    if (next instanceof Pe.e) {
                        a11 = ((Pe.e) next).discriminator();
                        break;
                    }
                }
            }
            a11 = null;
        }
        if (z11) {
            AbstractC3683b abstractC3683b = (AbstractC3683b) serializer;
            if (t2 == null) {
                throw new IllegalArgumentException(("Value for serializer " + abstractC3683b.b() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            Le.f<? super T> a12 = Le.c.a(abstractC3683b, this, t2);
            if (a11 != null && (serializer instanceof Le.d)) {
                Me.f b12 = a12.b();
                Intrinsics.checkNotNullParameter(b12, "<this>");
                if (J.a(b12).contains(a11)) {
                    ((Le.d) serializer).getClass();
                    throw null;
                }
            }
            Me.m kind2 = a12.b().getKind();
            Intrinsics.checkNotNullParameter(kind2, "kind");
            if (kind2 instanceof m.b) {
                throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            }
            if (kind2 instanceof Me.e) {
                throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            }
            if (kind2 instanceof Me.d) {
                throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
            }
            serializer = a12;
        }
        if (a11 != null) {
            String f7 = serializer.b().f();
            this.f23349h = a11;
            this.f23350i = f7;
        }
        serializer.c(this, t2);
    }

    @Override // Ne.a, Ne.c
    public final void s(double d11) {
        boolean z11 = this.f23348g;
        d dVar = this.f23342a;
        if (z11) {
            q(String.valueOf(d11));
        } else {
            dVar.f23335a.c(String.valueOf(d11));
        }
        this.f23347f.getClass();
        if (Double.isInfinite(d11) || Double.isNaN(d11)) {
            throw h.a(dVar.f23335a.toString(), Double.valueOf(d11));
        }
    }

    @Override // Ne.a, Ne.b
    public final void t(@NotNull Me.f descriptor, int i11, @NotNull InterfaceC3583a serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (obj != null || this.f23347f.c()) {
            super.t(descriptor, i11, serializer, obj);
        }
    }

    @Override // Ne.a, Ne.c
    public final void v(long j11) {
        if (this.f23348g) {
            q(String.valueOf(j11));
        } else {
            this.f23342a.h(j11);
        }
    }

    @Override // Ne.c
    public final void x() {
        this.f23342a.i("null");
    }

    @Override // Ne.c
    @NotNull
    public final Re.c z() {
        return this.f23346e;
    }
}
