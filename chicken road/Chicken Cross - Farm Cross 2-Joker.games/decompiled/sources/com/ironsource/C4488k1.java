package com.ironsource;

import com.ironsource.C4524m1;
import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.k1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4488k1 implements InterfaceC4506l1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f8277a;
    private final String b;
    private final IronSource.a c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    /* renamed from: com.ironsource.k1$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8278a = new a();
        public static final int b = 1;
        public static final int c = 1;
        public static final int d = 1;

        private a() {
        }
    }

    public C4488k1(String version, String instanceId, IronSource.a adFormat, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f8277a = version;
        this.b = instanceId;
        this.c = adFormat;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    @Override // com.ironsource.InterfaceC4506l1
    public ArrayList<InterfaceC4542n1> a() {
        ArrayList<InterfaceC4542n1> arrayList = new ArrayList<>();
        arrayList.add(new C4524m1.v(this.f8277a));
        arrayList.add(new C4524m1.x(this.b));
        arrayList.add(new C4524m1.a(this.c));
        if (this.d) {
            arrayList.add(new C4524m1.p(1));
        }
        if (this.e) {
            arrayList.add(new C4524m1.e(1));
        }
        if (this.f) {
            arrayList.add(new C4524m1.o(1));
        }
        return arrayList;
    }

    public /* synthetic */ C4488k1(String str, String str2, IronSource.a aVar, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, aVar, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3);
    }
}
