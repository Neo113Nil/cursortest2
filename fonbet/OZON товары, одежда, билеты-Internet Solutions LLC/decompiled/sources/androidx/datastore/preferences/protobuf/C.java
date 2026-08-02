package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public class C {

    /* renamed from: a, reason: collision with root package name */
    protected volatile Q f42458a;

    /* renamed from: b, reason: collision with root package name */
    private volatile AbstractC5362h f42459b;

    public final int a() {
        if (this.f42459b != null) {
            return this.f42459b.size();
        }
        if (this.f42458a != null) {
            return this.f42458a.getSerializedSize();
        }
        return 0;
    }

    public final Q b(Q q11) {
        if (this.f42458a == null) {
            synchronized (this) {
                if (this.f42458a == null) {
                    try {
                        this.f42458a = q11;
                        this.f42459b = AbstractC5362h.f42524b;
                    } catch (C5379z unused) {
                        this.f42458a = q11;
                        this.f42459b = AbstractC5362h.f42524b;
                    }
                }
            }
        }
        return this.f42458a;
    }

    public final Q c(Q q11) {
        Q q12 = this.f42458a;
        this.f42459b = null;
        this.f42458a = q11;
        return q12;
    }

    public final AbstractC5362h d() {
        if (this.f42459b != null) {
            return this.f42459b;
        }
        synchronized (this) {
            try {
                if (this.f42459b != null) {
                    return this.f42459b;
                }
                if (this.f42458a == null) {
                    this.f42459b = AbstractC5362h.f42524b;
                } else {
                    this.f42459b = this.f42458a.toByteString();
                }
                return this.f42459b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c11 = (C) obj;
        Q q11 = this.f42458a;
        Q q12 = c11.f42458a;
        return (q11 == null && q12 == null) ? d().equals(c11.d()) : (q11 == null || q12 == null) ? q11 != null ? q11.equals(c11.b(q11.a())) : b(q12.a()).equals(q12) : q11.equals(q12);
    }

    public int hashCode() {
        return 1;
    }
}
