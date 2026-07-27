package j3;

import Q2.c;
import Q2.g;
import R2.b;
import V2.e;
import W2.i;
import Y2.h;
import a4.AbstractC0197c;
import a4.C0195a;
import b2.AbstractC0279e;
import java.util.ArrayList;
import java.util.Comparator;

/* renamed from: j3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1200a implements O3.a {

    /* renamed from: a, reason: collision with root package name */
    public final C0195a f10467a;

    /* renamed from: b, reason: collision with root package name */
    public final J3.a f10468b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10469c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10470d;

    /* renamed from: e, reason: collision with root package name */
    public final V2.a f10471e;

    /* renamed from: f, reason: collision with root package name */
    public final i f10472f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10473g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10474h;

    /* renamed from: i, reason: collision with root package name */
    public final Q2.a f10475i;

    /* renamed from: j, reason: collision with root package name */
    public final g f10476j;

    /* renamed from: k, reason: collision with root package name */
    public final String f10477k;

    public C1200a(C0195a c0195a, J3.a aVar, long j2, long j6, V2.a aVar2, i iVar, String str, int i2, Q2.a aVar3, g gVar, String str2) {
        this.f10467a = c0195a;
        this.f10468b = aVar;
        this.f10469c = j2;
        this.f10470d = j6;
        this.f10471e = aVar2;
        this.f10472f = iVar;
        this.f10473g = str;
        this.f10474h = i2;
        this.f10475i = aVar3;
        this.f10476j = gVar;
        this.f10477k = str2;
    }

    @Override // O3.a, N3.a
    public final c a() {
        return this.f10475i;
    }

    @Override // N3.a
    public final int b() {
        return this.f10474h;
    }

    @Override // N3.a
    public final String c() {
        return this.f10477k;
    }

    @Override // O3.a
    public final b d() {
        ArrayList arrayList = new ArrayList();
        Q2.a aVar = this.f10475i;
        int i2 = 0;
        while (true) {
            Object[] objArr = aVar.f3233a;
            if (i2 >= objArr.length) {
                break;
            }
            Object obj = objArr[i2];
            Object obj2 = objArr[i2 + 1];
            e eVar = (e) obj;
            if (eVar != null && !eVar.f3237b.isEmpty() && obj2 != null) {
                S2.a c2 = S2.a.c(eVar);
                if (!c2.f2746b.isEmpty()) {
                    arrayList.add(c2);
                    arrayList.add(obj2);
                }
            }
            i2 += 2;
        }
        if (arrayList.size() == 2 && arrayList.get(0) != null) {
            return new R2.a(arrayList.toArray());
        }
        Object[] array = arrayList.toArray();
        Comparator comparator = R2.a.f2619d;
        for (int i3 = 0; i3 < array.length; i3 += 2) {
            S2.a aVar2 = (S2.a) array[i3];
            if (aVar2 != null && aVar2.f2746b.isEmpty()) {
                array[i3] = null;
            }
        }
        return new R2.a(array, R2.a.f2619d);
    }

    @Override // N3.a
    public final h e() {
        return this.f10471e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1200a)) {
            return false;
        }
        C1200a c1200a = (C1200a) obj;
        if (this.f10467a.equals(c1200a.f10467a) && this.f10468b.equals(c1200a.f10468b) && this.f10469c == c1200a.f10469c && this.f10470d == c1200a.f10470d && this.f10471e.equals(c1200a.f10471e) && this.f10472f.equals(c1200a.f10472f)) {
            String str = c1200a.f10473g;
            String str2 = this.f10473g;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.f10474h == c1200a.f10474h && this.f10475i.equals(c1200a.f10475i)) {
                    g gVar = c1200a.f10476j;
                    g gVar2 = this.f10476j;
                    if (gVar2 != null ? gVar2.equals(gVar) : gVar == null) {
                        String str3 = c1200a.f10477k;
                        String str4 = this.f10477k;
                        if (str4 == null) {
                            if (str3 == null) {
                                return true;
                            }
                        } else if (str4.equals(str3)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // N3.a
    public final i f() {
        return this.f10472f;
    }

    @Override // N3.a
    public final String g() {
        return this.f10473g;
    }

    @Override // N3.a
    public final long h() {
        return this.f10469c;
    }

    public final int hashCode() {
        int hashCode = (((this.f10467a.hashCode() ^ 1000003) * 1000003) ^ this.f10468b.hashCode()) * 1000003;
        long j2 = this.f10469c;
        int i2 = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j6 = this.f10470d;
        int hashCode2 = (((((i2 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.f10471e.hashCode()) * 1000003) ^ this.f10472f.hashCode()) * 1000003;
        String str = this.f10473g;
        int hashCode3 = (((((hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f10474h) * 1000003) ^ this.f10475i.hashCode()) * 1000003;
        g gVar = this.f10476j;
        int hashCode4 = (hashCode3 ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003;
        String str2 = this.f10477k;
        return hashCode4 ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // N3.a
    public final g i() {
        return this.f10476j;
    }

    @Override // N3.a
    public final AbstractC0197c j() {
        return this.f10467a;
    }

    @Override // N3.a
    public final long k() {
        return this.f10470d;
    }

    @Override // N3.a
    public final J3.a l() {
        return this.f10468b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogRecordDataImpl{resource=");
        sb.append(this.f10467a);
        sb.append(", instrumentationScopeInfo=");
        sb.append(this.f10468b);
        sb.append(", timestampEpochNanos=");
        sb.append(this.f10469c);
        sb.append(", observedTimestampEpochNanos=");
        sb.append(this.f10470d);
        sb.append(", spanContext=");
        sb.append(this.f10471e);
        sb.append(", severity=");
        sb.append(this.f10472f);
        sb.append(", severityText=");
        sb.append(this.f10473g);
        sb.append(", totalAttributeCount=");
        sb.append(this.f10474h);
        sb.append(", attributes=");
        sb.append(this.f10475i);
        sb.append(", bodyValue=");
        sb.append(this.f10476j);
        sb.append(", eventName=");
        return AbstractC0279e.h(sb, this.f10477k, "}");
    }
}
