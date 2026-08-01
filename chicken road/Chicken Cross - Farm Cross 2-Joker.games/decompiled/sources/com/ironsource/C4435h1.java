package com.ironsource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* renamed from: com.ironsource.h1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4435h1 implements InterfaceC4574of<JSONArray> {

    /* renamed from: a, reason: collision with root package name */
    private final List<C4417g1> f8219a = new ArrayList();

    /* renamed from: com.ironsource.h1$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8220a;

        static {
            int[] iArr = new int[EnumC4556nf.values().length];
            try {
                iArr[EnumC4556nf.FullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4556nf.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8220a = iArr;
        }
    }

    @Override // com.ironsource.InterfaceC4290a7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONArray a(EnumC4556nf mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i = a.f8220a[mode.ordinal()];
        if (i == 1) {
            List<C4417g1> b = b();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(b, 10));
            Iterator<T> it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4417g1) it.next()).d());
            }
            return new JSONArray((Collection) arrayList);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        List<C4417g1> a2 = a();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(a2, 10));
        Iterator<T> it2 = a2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C4417g1) it2.next()).c());
        }
        return new JSONArray((Collection) arrayList2);
    }

    public final void a(C4417g1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f8219a.add(event);
    }

    private final List<C4417g1> a() {
        List<C4417g1> list = this.f8219a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C4417g1 c4417g1 = (C4417g1) obj;
            if (c4417g1.e() != EnumC4520lf.LoadSuccess && c4417g1.e() != EnumC4520lf.LoadRequest) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C4417g1) it.next()).a());
        }
        Set set = CollectionsKt.toSet(arrayList2);
        List<C4417g1> list2 = this.f8219a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            C4417g1 c4417g12 = (C4417g1) obj2;
            if (c4417g12.e() == EnumC4520lf.LoadSuccess && !set.contains(c4417g12.a())) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    private final List<C4417g1> b() {
        List<C4417g1> list = this.f8219a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C4417g1) obj).e() != EnumC4520lf.LoadRequest) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
