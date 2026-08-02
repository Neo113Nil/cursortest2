package Y40;

import B0.C2454a;
import B90.C2618u;
import android.graphics.Rect;
import com.detmir.recycli.adapters.RecyclerItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f34572a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34573b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34574c;

    /* renamed from: d, reason: collision with root package name */
    private final Long f34575d;

    /* renamed from: e, reason: collision with root package name */
    private final Boolean f34576e;

    /* renamed from: f, reason: collision with root package name */
    private final String f34577f;

    /* renamed from: g, reason: collision with root package name */
    private final String f34578g;

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList f34579h;

    /* renamed from: i, reason: collision with root package name */
    private final ArrayList f34580i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayList f34581j;

    /* renamed from: k, reason: collision with root package name */
    private final Rect f34582k;

    /* renamed from: l, reason: collision with root package name */
    private final Rect f34583l;

    /* renamed from: m, reason: collision with root package name */
    private final Rect f34584m;

    public b(String str, int i11, String str2, Long l11, Boolean bool, String str3, String str4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Rect rect, Rect rect2, Rect rect3) {
        this.f34572a = str;
        this.f34573b = i11;
        this.f34574c = str2;
        this.f34575d = l11;
        this.f34576e = bool;
        this.f34577f = str3;
        this.f34578g = str4;
        this.f34579h = arrayList;
        this.f34580i = arrayList2;
        this.f34581j = arrayList3;
        this.f34582k = rect;
        this.f34583l = rect2;
        this.f34584m = rect3;
    }

    public final Boolean a() {
        return this.f34576e;
    }

    public final String b() {
        return this.f34574c;
    }

    public final List<RecyclerItem> c() {
        return this.f34580i;
    }

    public final Rect d() {
        return this.f34584m;
    }

    public final List<RecyclerItem> e() {
        return this.f34581j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f34572a, bVar.f34572a) && this.f34573b == bVar.f34573b && Intrinsics.d(this.f34574c, bVar.f34574c) && Intrinsics.d(this.f34575d, bVar.f34575d) && Intrinsics.d(this.f34576e, bVar.f34576e) && Intrinsics.d(this.f34577f, bVar.f34577f) && Intrinsics.d(this.f34578g, bVar.f34578g) && this.f34579h.equals(bVar.f34579h) && this.f34580i.equals(bVar.f34580i) && this.f34581j.equals(bVar.f34581j) && Intrinsics.d(this.f34582k, bVar.f34582k) && Intrinsics.d(this.f34583l, bVar.f34583l) && Intrinsics.d(this.f34584m, bVar.f34584m);
    }

    public final Rect f() {
        return this.f34583l;
    }

    public final Long g() {
        return this.f34575d;
    }

    public final String h() {
        return this.f34577f;
    }

    public final int hashCode() {
        String str = this.f34572a;
        int a11 = C2454a.a(this.f34573b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.f34574c;
        int hashCode = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.f34575d;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Boolean bool = this.f34576e;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f34577f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f34578g;
        int b11 = C2618u.b(this.f34581j, C2618u.b(this.f34580i, C2618u.b(this.f34579h, (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31), 31);
        Rect rect = this.f34582k;
        int hashCode5 = (b11 + (rect == null ? 0 : rect.hashCode())) * 31;
        Rect rect2 = this.f34583l;
        int hashCode6 = (hashCode5 + (rect2 == null ? 0 : rect2.hashCode())) * 31;
        Rect rect3 = this.f34584m;
        return hashCode6 + (rect3 != null ? rect3.hashCode() : 0);
    }

    public final List<RecyclerItem> i() {
        return this.f34579h;
    }

    public final Rect j() {
        return this.f34582k;
    }

    public final String k() {
        return this.f34578g;
    }

    @NotNull
    public final String toString() {
        return "FrameUI(id=" + this.f34572a + ", framePos=" + this.f34573b + ", background=" + this.f34574c + ", duration=" + this.f34575d + ", autoplay=" + this.f34576e + ", imageUrl=" + this.f34577f + ", videoUrl=" + this.f34578g + ", topWidgets=" + this.f34579h + ", bottomWidgets=" + this.f34580i + ", centerWidgets=" + this.f34581j + ", topWidgetsPadding=" + this.f34582k + ", centerWidgetsPadding=" + this.f34583l + ", bottomWidgetsPadding=" + this.f34584m + ")";
    }
}
