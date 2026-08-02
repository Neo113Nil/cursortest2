package B4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: B4.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2590t extends AbstractC7737t implements Function1<C2581j, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.I f2709b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ArrayList f2710c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.K f2711d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2584m f2712e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Bundle f2713f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2590t(kotlin.jvm.internal.I i11, ArrayList arrayList, kotlin.jvm.internal.K k11, C2584m c2584m, Bundle bundle) {
        super(1);
        this.f2709b = i11;
        this.f2710c = arrayList;
        this.f2711d = k11;
        this.f2712e = c2584m;
        this.f2713f = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C2581j c2581j) {
        List list;
        C2581j entry = c2581j;
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f2709b.f71783a = true;
        ArrayList arrayList = this.f2710c;
        int indexOf = arrayList.indexOf(entry);
        if (indexOf != -1) {
            kotlin.jvm.internal.K k11 = this.f2711d;
            int i11 = indexOf + 1;
            list = arrayList.subList(k11.f71785a, i11);
            k11.f71785a = i11;
        } else {
            list = kotlin.collections.K.f71697a;
        }
        this.f2712e.n(entry.d(), this.f2713f, entry, list);
        return Unit.f71690a;
    }
}
