package l3;

import java.util.Arrays;
import k3.InterfaceC2034b;

/* renamed from: l3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2055b {

    /* renamed from: a, reason: collision with root package name */
    public final int f17773a;

    /* renamed from: b, reason: collision with root package name */
    public final v3.g f17774b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2034b f17775c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17776d;

    public C2055b(v3.g gVar, InterfaceC2034b interfaceC2034b, String str) {
        this.f17774b = gVar;
        this.f17775c = interfaceC2034b;
        this.f17776d = str;
        this.f17773a = Arrays.hashCode(new Object[]{gVar, interfaceC2034b, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2055b)) {
            return false;
        }
        C2055b c2055b = (C2055b) obj;
        return m3.v.g(this.f17774b, c2055b.f17774b) && m3.v.g(this.f17775c, c2055b.f17775c) && m3.v.g(this.f17776d, c2055b.f17776d);
    }

    public final int hashCode() {
        return this.f17773a;
    }
}
