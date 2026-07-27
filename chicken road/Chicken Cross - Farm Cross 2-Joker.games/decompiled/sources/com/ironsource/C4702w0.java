package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.w0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4702w0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f8739a;
    private final List<NetworkSettings> b;
    private final C4515la c;

    /* JADX WARN: Multi-variable type inference failed */
    public C4702w0(String str, List<? extends NetworkSettings> providerList, C4515la publisherDataHolder) {
        Intrinsics.checkNotNullParameter(providerList, "providerList");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.f8739a = str;
        this.b = providerList;
        this.c = publisherDataHolder;
    }

    public final String a() {
        return this.f8739a;
    }

    public final List<NetworkSettings> b() {
        return this.b;
    }

    public final C4515la c() {
        return this.c;
    }

    public final List<NetworkSettings> d() {
        return this.b;
    }

    public final C4515la e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4702w0)) {
            return false;
        }
        C4702w0 c4702w0 = (C4702w0) obj;
        return Intrinsics.areEqual(this.f8739a, c4702w0.f8739a) && Intrinsics.areEqual(this.b, c4702w0.b) && Intrinsics.areEqual(this.c, c4702w0.c);
    }

    public final String f() {
        return this.f8739a;
    }

    public int hashCode() {
        String str = this.f8739a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "AdUnitCommonData(userId=" + this.f8739a + ", providerList=" + this.b + ", publisherDataHolder=" + this.c + ")";
    }

    public final C4702w0 a(String str, List<? extends NetworkSettings> providerList, C4515la publisherDataHolder) {
        Intrinsics.checkNotNullParameter(providerList, "providerList");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        return new C4702w0(str, providerList, publisherDataHolder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4702w0 a(C4702w0 c4702w0, String str, List list, C4515la c4515la, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4702w0.f8739a;
        }
        if ((i & 2) != 0) {
            list = c4702w0.b;
        }
        if ((i & 4) != 0) {
            c4515la = c4702w0.c;
        }
        return c4702w0.a(str, list, c4515la);
    }
}
