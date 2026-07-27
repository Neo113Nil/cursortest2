package com.ironsource;

import com.ironsource.E0;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.ironsource.wd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4715wd implements InterfaceC4733xd {

    /* renamed from: a, reason: collision with root package name */
    private final T0 f8750a;
    private final AbstractC4720x0 b;
    private final Function1<T0, T0> c;

    /* renamed from: com.ironsource.wd$a */
    static final class a extends Lambda implements Function1<T0, T0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8751a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T0 invoke(T0 tools) {
            Intrinsics.checkNotNullParameter(tools, "tools");
            return new T0(tools, E0.b.PROVIDER);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4715wd(T0 adUnitTools, AbstractC4720x0 adUnitData, Function1<? super T0, ? extends T0> createProviderTools) {
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(createProviderTools, "createProviderTools");
        this.f8750a = adUnitTools;
        this.b = adUnitData;
        this.c = createProviderTools;
    }

    private final List<NetworkSettings> b(List<String> list) {
        Set set = CollectionsKt.toSet(list);
        HashMap hashMap = new HashMap(list.size());
        for (NetworkSettings networkSettings : this.b.m()) {
            if (set.contains(networkSettings.getProviderInstanceName())) {
                String providerInstanceName = networkSettings.getProviderInstanceName();
                Intrinsics.checkNotNullExpressionValue(providerInstanceName, "provider.providerInstanceName");
                hashMap.put(providerInstanceName, networkSettings);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            NetworkSettings networkSettings2 = (NetworkSettings) hashMap.get((String) it.next());
            if (networkSettings2 != null) {
                arrayList.add(networkSettings2);
            }
        }
        return arrayList;
    }

    @Override // com.ironsource.InterfaceC4733xd
    public List<C4422g6> a(List<String> instances) {
        Intrinsics.checkNotNullParameter(instances, "instances");
        if (instances.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        List<NetworkSettings> b = b(instances);
        C4507l2 a2 = a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(b, 10));
        Iterator<T> it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(a(a2, (NetworkSettings) it.next()));
        }
        return arrayList;
    }

    public /* synthetic */ C4715wd(T0 t0, AbstractC4720x0 abstractC4720x0, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(t0, abstractC4720x0, (i & 4) != 0 ? a.f8751a : function1);
    }

    private final C4422g6 a(C4507l2 c4507l2, NetworkSettings networkSettings) {
        I i = new I(this.f8750a, this.b, networkSettings);
        return new C4422g6(this.c.invoke(this.f8750a), new C(this.b, networkSettings, c4507l2, new C4345c1(networkSettings, this.b.b(networkSettings), this.b.b().a()), new C4561o2(networkSettings.getProviderInstanceName()), this.f8750a.g(), true), i);
    }

    private final C4507l2 a() {
        return new C4507l2("", new JSONObject(), null, 0, "");
    }
}
