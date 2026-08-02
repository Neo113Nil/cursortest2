package P40;

import C.o0;
import android.graphics.Rect;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f21841a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f21842b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f21843c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f21844d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f21845e;

    /* renamed from: f, reason: collision with root package name */
    private final List<Integer> f21846f;

    /* renamed from: g, reason: collision with root package name */
    private final String f21847g;

    public d(boolean z11, Integer num, Integer num2, Rect rect, Rect rect2, List<Integer> list, String str) {
        this.f21841a = z11;
        this.f21842b = num;
        this.f21843c = num2;
        this.f21844d = rect;
        this.f21845e = rect2;
        this.f21846f = list;
        this.f21847g = str;
    }

    public final String a() {
        return this.f21847g;
    }

    public final List<Integer> b() {
        return this.f21846f;
    }

    public final Integer c() {
        return this.f21843c;
    }

    public final Rect d() {
        return this.f21845e;
    }

    public final Rect e() {
        return this.f21844d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f21841a == dVar.f21841a && Intrinsics.d(this.f21842b, dVar.f21842b) && Intrinsics.d(this.f21843c, dVar.f21843c) && Intrinsics.d(this.f21844d, dVar.f21844d) && Intrinsics.d(this.f21845e, dVar.f21845e) && Intrinsics.d(this.f21846f, dVar.f21846f) && Intrinsics.d(this.f21847g, dVar.f21847g);
    }

    public final boolean f() {
        return this.f21841a;
    }

    public final Integer g() {
        return this.f21842b;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f21841a) * 31;
        Integer num = this.f21842b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f21843c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Rect rect = this.f21844d;
        int hashCode4 = (hashCode3 + (rect == null ? 0 : rect.hashCode())) * 31;
        Rect rect2 = this.f21845e;
        int hashCode5 = (hashCode4 + (rect2 == null ? 0 : rect2.hashCode())) * 31;
        List<Integer> list = this.f21846f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f21847g;
        return hashCode6 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModalOptions(touchOutSideClose=");
        sb2.append(this.f21841a);
        sb2.append(", width=");
        sb2.append(this.f21842b);
        sb2.append(", height=");
        sb2.append(this.f21843c);
        sb2.append(", margins=");
        sb2.append(this.f21844d);
        sb2.append(", mainPaddings=");
        sb2.append(this.f21845e);
        sb2.append(", backgroundRadius=");
        sb2.append(this.f21846f);
        sb2.append(", backgroundColor=");
        return o0.c(sb2, this.f21847g, ")");
    }
}
