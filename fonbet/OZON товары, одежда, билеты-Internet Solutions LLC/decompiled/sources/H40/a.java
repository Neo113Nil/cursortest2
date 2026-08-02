package H40;

import B90.C2618u;
import C.o0;
import Kk.C3532b;
import Kk.d;
import android.graphics.Rect;
import com.detmir.recycli.adapters.RecyclerItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f10582a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f10583b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f10584c;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f10585d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Rect f10586e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Rect f10587f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Rect f10588g;

    /* renamed from: h, reason: collision with root package name */
    private final String f10589h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f10590i;

    /* renamed from: j, reason: collision with root package name */
    private final String f10591j;

    public a(@NotNull String id2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, @NotNull Rect mainPaddings, @NotNull Rect footerPaddings, @NotNull Rect headerPaddings, String str, boolean z11, String str2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(mainPaddings, "mainPaddings");
        Intrinsics.checkNotNullParameter(footerPaddings, "footerPaddings");
        Intrinsics.checkNotNullParameter(headerPaddings, "headerPaddings");
        this.f10582a = id2;
        this.f10583b = arrayList;
        this.f10584c = arrayList2;
        this.f10585d = arrayList3;
        this.f10586e = mainPaddings;
        this.f10587f = footerPaddings;
        this.f10588g = headerPaddings;
        this.f10589h = str;
        this.f10590i = z11;
        this.f10591j = str2;
    }

    public final String a() {
        return this.f10591j;
    }

    public final List<RecyclerItem> b() {
        return this.f10584c;
    }

    @NotNull
    public final Rect c() {
        return this.f10587f;
    }

    public final List<RecyclerItem> d() {
        return this.f10583b;
    }

    @NotNull
    public final Rect e() {
        return this.f10588g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f10582a.equals(aVar.f10582a) && this.f10583b.equals(aVar.f10583b) && this.f10584c.equals(aVar.f10584c) && this.f10585d.equals(aVar.f10585d) && Intrinsics.d(this.f10586e, aVar.f10586e) && Intrinsics.d(this.f10587f, aVar.f10587f) && Intrinsics.d(this.f10588g, aVar.f10588g) && Intrinsics.d(this.f10589h, aVar.f10589h) && this.f10590i == aVar.f10590i && Intrinsics.d(this.f10591j, aVar.f10591j);
    }

    public final String f() {
        return this.f10589h;
    }

    public final List<RecyclerItem> g() {
        return this.f10585d;
    }

    @NotNull
    public final Rect h() {
        return this.f10586e;
    }

    public final int hashCode() {
        int a11 = d.a(this.f10588g, d.a(this.f10587f, d.a(this.f10586e, C2618u.b(this.f10585d, C2618u.b(this.f10584c, C2618u.b(this.f10583b, this.f10582a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        String str = this.f10589h;
        int a12 = C3532b.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f10590i);
        String str2 = this.f10591j;
        return a12 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean i() {
        return this.f10590i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CbottomUIState(id=");
        sb2.append(this.f10582a);
        sb2.append(", header=");
        sb2.append(this.f10583b);
        sb2.append(", footer=");
        sb2.append(this.f10584c);
        sb2.append(", main=");
        sb2.append(this.f10585d);
        sb2.append(", mainPaddings=");
        sb2.append(this.f10586e);
        sb2.append(", footerPaddings=");
        sb2.append(this.f10587f);
        sb2.append(", headerPaddings=");
        sb2.append(this.f10588g);
        sb2.append(", imageUrl=");
        sb2.append(this.f10589h);
        sb2.append(", scrollable=");
        sb2.append(this.f10590i);
        sb2.append(", backgroundColor=");
        return o0.c(sb2, this.f10591j, ")");
    }
}
