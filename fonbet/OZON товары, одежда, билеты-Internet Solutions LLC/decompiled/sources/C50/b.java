package C50;

import B0.C2454a;
import B90.C2618u;
import Ve.Om;
import com.detmir.recycli.adapters.RecyclerItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f4399a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4400b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4401c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4402d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f4403e;

    /* renamed from: f, reason: collision with root package name */
    private final Boolean f4404f;

    /* renamed from: g, reason: collision with root package name */
    private final String f4405g;

    /* renamed from: h, reason: collision with root package name */
    private final String f4406h;

    /* renamed from: i, reason: collision with root package name */
    private final ArrayList f4407i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayList f4408j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList f4409k;

    public b(String str, int i11, int i12, String str2, Long l11, Boolean bool, String str3, String str4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f4399a = str;
        this.f4400b = i11;
        this.f4401c = i12;
        this.f4402d = str2;
        this.f4403e = l11;
        this.f4404f = bool;
        this.f4405g = str3;
        this.f4406h = str4;
        this.f4407i = arrayList;
        this.f4408j = arrayList2;
        this.f4409k = arrayList3;
    }

    public final Boolean a() {
        return this.f4404f;
    }

    public final String b() {
        return this.f4402d;
    }

    public final List<RecyclerItem> c() {
        return this.f4408j;
    }

    public final List<RecyclerItem> d() {
        return this.f4409k;
    }

    public final Long e() {
        return this.f4403e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f4399a, bVar.f4399a) && this.f4400b == bVar.f4400b && this.f4401c == bVar.f4401c && Intrinsics.d(this.f4402d, bVar.f4402d) && Intrinsics.d(this.f4403e, bVar.f4403e) && Intrinsics.d(this.f4404f, bVar.f4404f) && Intrinsics.d(this.f4405g, bVar.f4405g) && Intrinsics.d(this.f4406h, bVar.f4406h) && this.f4407i.equals(bVar.f4407i) && this.f4408j.equals(bVar.f4408j) && this.f4409k.equals(bVar.f4409k);
    }

    public final String f() {
        return this.f4405g;
    }

    public final List<RecyclerItem> g() {
        return this.f4407i;
    }

    public final String h() {
        return this.f4406h;
    }

    public final int hashCode() {
        String str = this.f4399a;
        int a11 = C2454a.a(this.f4401c, C2454a.a(this.f4400b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f4402d;
        int hashCode = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.f4403e;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Boolean bool = this.f4404f;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f4405g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f4406h;
        return this.f4409k.hashCode() + C2618u.b(this.f4408j, C2618u.b(this.f4407i, (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FrameUI(id=");
        sb2.append(this.f4399a);
        sb2.append(", framePos=");
        sb2.append(this.f4400b);
        sb2.append(", storyPos=");
        sb2.append(this.f4401c);
        sb2.append(", background=");
        sb2.append(this.f4402d);
        sb2.append(", duration=");
        sb2.append(this.f4403e);
        sb2.append(", autoplay=");
        sb2.append(this.f4404f);
        sb2.append(", imageUrl=");
        sb2.append(this.f4405g);
        sb2.append(", videoUrl=");
        sb2.append(this.f4406h);
        sb2.append(", topWidgets=");
        sb2.append(this.f4407i);
        sb2.append(", bottomWidgets=");
        sb2.append(this.f4408j);
        sb2.append(", centerWidgets=");
        return Om.a(")", sb2, this.f4409k);
    }
}
