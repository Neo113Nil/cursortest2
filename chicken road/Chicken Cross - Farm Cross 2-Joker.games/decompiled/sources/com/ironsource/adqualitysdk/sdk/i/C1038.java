package com.ironsource.adqualitysdk.sdk.i;

import com.hyprmx.android.sdk.core.DependencyHolder;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ἲ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1038 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1012 f3087;

    public C1038(C1012 c1012) {
        this.f3087 = c1012;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1012 c1012 = this.f3087;
        DependencyHolder dependencyHolder = (DependencyHolder) arrayList.get(0);
        c1012.getClass();
        return dependencyHolder.getPreloadedData();
    }
}
