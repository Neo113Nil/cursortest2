package B60;

import B30.f;
import kotlin.jvm.functions.Function1;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.storage.FastEntryData;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U50.j f2954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f2955b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FastEntryData f2956c;

    public /* synthetic */ b(U50.j jVar, c cVar, FastEntryData fastEntryData) {
        this.f2954a = jVar;
        this.f2955b = cVar;
        this.f2956c = fastEntryData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return c.e(this.f2954a, this.f2955b, this.f2956c, (f.c) obj);
    }
}
