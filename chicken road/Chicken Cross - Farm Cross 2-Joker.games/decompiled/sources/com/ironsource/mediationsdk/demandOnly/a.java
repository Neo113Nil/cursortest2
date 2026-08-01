package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.C4561o2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface a {

    /* renamed from: com.ironsource.mediationsdk.demandOnly.a$a, reason: collision with other inner class name */
    public static final class C1332a implements a {

        /* renamed from: a, reason: collision with root package name */
        private final List<C4561o2> f8385a;

        /* JADX WARN: Multi-variable type inference failed */
        public C1332a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public C4561o2 a(String instanceName) {
            Object obj;
            Intrinsics.checkNotNullParameter(instanceName, "instanceName");
            Iterator<T> it = this.f8385a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((C4561o2) obj).c(), instanceName)) {
                    break;
                }
            }
            return (C4561o2) obj;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public String b() {
            if (this.f8385a.isEmpty()) {
                return "";
            }
            return "1" + ((C4561o2) CollectionsKt.first((List) this.f8385a)).c();
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public C4561o2 get(int i) {
            if (i < 0 || i >= this.f8385a.size()) {
                return null;
            }
            return this.f8385a.get(i);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public boolean isEmpty() {
            return this.f8385a.isEmpty();
        }

        public C1332a(List<C4561o2> waterfall) {
            Intrinsics.checkNotNullParameter(waterfall, "waterfall");
            this.f8385a = waterfall;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public List<C4561o2> a() {
            return this.f8385a;
        }

        public /* synthetic */ C1332a(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new ArrayList() : list);
        }
    }

    C4561o2 a(String str);

    List<C4561o2> a();

    String b();

    C4561o2 get(int i);

    boolean isEmpty();
}
