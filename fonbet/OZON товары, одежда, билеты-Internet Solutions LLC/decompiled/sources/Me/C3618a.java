package Me;

import g.C6594f;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Me.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3618a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f17899a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private K f17900b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayList f17901c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final HashSet f17902d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ArrayList f17903e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ArrayList f17904f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ArrayList f17905g;

    public C3618a(@NotNull String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f17899a = serialName;
        this.f17900b = K.f71697a;
        this.f17901c = new ArrayList();
        this.f17902d = new HashSet();
        this.f17903e = new ArrayList();
        this.f17904f = new ArrayList();
        this.f17905g = new ArrayList();
    }

    public static void a(C3618a c3618a, String elementName, f descriptor) {
        K annotations = K.f71697a;
        c3618a.getClass();
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (!c3618a.f17902d.add(elementName)) {
            StringBuilder b11 = C6594f.b("Element with name '", elementName, "' is already registered in ");
            b11.append(c3618a.f17899a);
            throw new IllegalArgumentException(b11.toString().toString());
        }
        c3618a.f17901c.add(elementName);
        c3618a.f17903e.add(descriptor);
        c3618a.f17904f.add(annotations);
        c3618a.f17905g.add(false);
    }

    @NotNull
    public final List<Annotation> b() {
        return this.f17900b;
    }

    @NotNull
    public final ArrayList c() {
        return this.f17904f;
    }

    @NotNull
    public final ArrayList d() {
        return this.f17903e;
    }

    @NotNull
    public final ArrayList e() {
        return this.f17901c;
    }

    @NotNull
    public final ArrayList f() {
        return this.f17905g;
    }

    public final void g(@NotNull K k11) {
        Intrinsics.checkNotNullParameter(k11, "<set-?>");
        this.f17900b = k11;
    }
}
