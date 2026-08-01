package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Map<a.AbstractC1622a.c.EnumC1624a, a.AbstractC1622a.c> f11156a = new LinkedHashMap();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(a.AbstractC1622a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.f11156a.put(button.d(), button);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h
    public List<a.AbstractC1622a.c> q() {
        List list = MapsKt.toList(this.f11156a);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((a.AbstractC1622a.c) ((Pair) it.next()).getSecond());
        }
        return arrayList;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(a.AbstractC1622a.c.EnumC1624a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.f11156a.remove(buttonType);
    }
}
