package Ol0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.data.source.ArbiterMasterSelectionDataSource", f = "ArbiterMasterSelectionDataSource.kt", l = {11}, m = "getMasterPackage-gIAlu-s")
/* loaded from: classes4.dex */
public final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f20466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f20467e;

    /* renamed from: f, reason: collision with root package name */
    public int f20468f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f20467e = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f20466d = obj;
        this.f20468f |= LinearLayoutManager.INVALID_OFFSET;
        Object a11 = this.f20467e.a(null, this);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Sc.r.a(a11);
    }
}
