package u0;

import p.AbstractC0819i;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0839a {

    /* renamed from: a, reason: collision with root package name */
    public final String f6694a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6695b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6696c;

    public C0839a(String str, String str2) {
        this.f6694a = str;
        this.f6695b = null;
        this.f6696c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0839a.class != obj.getClass()) {
            return false;
        }
        C0839a c0839a = (C0839a) obj;
        if (this.f6694a.equals(c0839a.f6694a)) {
            return this.f6696c.equals(c0839a.f6696c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6696c.hashCode() + (this.f6694a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DartEntrypoint( bundle path: ");
        sb.append(this.f6694a);
        sb.append(", function: ");
        return AbstractC0819i.b(sb, this.f6696c, " )");
    }

    public C0839a(String str, String str2, String str3) {
        this.f6694a = str;
        this.f6695b = str2;
        this.f6696c = str3;
    }
}
