package M3;

import a4.AbstractC0197c;

/* loaded from: classes.dex */
public final class c implements N3.a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0197c f1948a;

    /* renamed from: b, reason: collision with root package name */
    public final J3.a f1949b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1950c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1951d;

    /* renamed from: e, reason: collision with root package name */
    public final V2.a f1952e;

    /* renamed from: f, reason: collision with root package name */
    public final W2.i f1953f;

    /* renamed from: g, reason: collision with root package name */
    public final Q2.a f1954g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1955h;

    /* renamed from: i, reason: collision with root package name */
    public final Q2.f f1956i;

    public c(AbstractC0197c abstractC0197c, J3.a aVar, long j2, long j6, V2.a aVar2, W2.i iVar, Q2.a aVar3, int i2, Q2.f fVar) {
        if (abstractC0197c == null) {
            throw new NullPointerException("Null resource");
        }
        this.f1948a = abstractC0197c;
        if (aVar == null) {
            throw new NullPointerException("Null instrumentationScopeInfo");
        }
        this.f1949b = aVar;
        this.f1950c = j2;
        this.f1951d = j6;
        if (aVar2 == null) {
            throw new NullPointerException("Null spanContext");
        }
        this.f1952e = aVar2;
        if (iVar == null) {
            throw new NullPointerException("Null severity");
        }
        this.f1953f = iVar;
        if (aVar3 == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f1954g = aVar3;
        this.f1955h = i2;
        this.f1956i = fVar;
    }

    @Override // N3.a
    public final Q2.c a() {
        return this.f1954g;
    }

    @Override // N3.a
    public final int b() {
        return this.f1955h;
    }

    @Override // N3.a
    public final String c() {
        return null;
    }

    @Override // N3.a
    public final Y2.h e() {
        return this.f1952e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f1948a.equals(cVar.f1948a) && this.f1949b.equals(cVar.f1949b) && this.f1950c == cVar.f1950c && this.f1951d == cVar.f1951d && this.f1952e.equals(cVar.f1952e) && this.f1953f.equals(cVar.f1953f) && this.f1954g.equals(cVar.f1954g) && this.f1955h == cVar.f1955h) {
            Q2.f fVar = cVar.f1956i;
            Q2.f fVar2 = this.f1956i;
            if (fVar2 == null) {
                if (fVar == null) {
                    return true;
                }
            } else if (fVar2.equals(fVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // N3.a
    public final W2.i f() {
        return this.f1953f;
    }

    @Override // N3.a
    public final String g() {
        return null;
    }

    @Override // N3.a
    public final long h() {
        return this.f1950c;
    }

    public final int hashCode() {
        int hashCode = (((this.f1948a.hashCode() ^ 1000003) * 1000003) ^ this.f1949b.hashCode()) * 1000003;
        long j2 = this.f1950c;
        int i2 = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j6 = this.f1951d;
        int hashCode2 = (((((((((i2 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.f1952e.hashCode()) * 1000003) ^ this.f1953f.hashCode()) * (-721379959)) ^ this.f1954g.hashCode()) * 1000003) ^ this.f1955h) * 1000003;
        Q2.f fVar = this.f1956i;
        return (hashCode2 ^ (fVar == null ? 0 : ((String) fVar.f2488b).hashCode())) * 1000003;
    }

    @Override // N3.a
    public final Q2.g i() {
        return this.f1956i;
    }

    @Override // N3.a
    public final AbstractC0197c j() {
        return this.f1948a;
    }

    @Override // N3.a
    public final long k() {
        return this.f1951d;
    }

    @Override // N3.a
    public final J3.a l() {
        return this.f1949b;
    }

    public final String toString() {
        return "SdkLogRecordData{resource=" + this.f1948a + ", instrumentationScopeInfo=" + this.f1949b + ", timestampEpochNanos=" + this.f1950c + ", observedTimestampEpochNanos=" + this.f1951d + ", spanContext=" + this.f1952e + ", severity=" + this.f1953f + ", severityText=null, attributes=" + this.f1954g + ", totalAttributeCount=" + this.f1955h + ", bodyValue=" + this.f1956i + ", eventName=null}";
    }
}
