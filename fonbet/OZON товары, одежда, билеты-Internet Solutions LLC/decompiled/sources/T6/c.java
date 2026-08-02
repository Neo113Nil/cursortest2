package T6;

import C.o0;
import android.content.Context;
import androidx.annotation.NonNull;
import b7.InterfaceC5572a;

/* loaded from: classes9.dex */
final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26678a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5572a f26679b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5572a f26680c;

    /* renamed from: d, reason: collision with root package name */
    private final String f26681d;

    c(Context context, InterfaceC5572a interfaceC5572a, InterfaceC5572a interfaceC5572a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f26678a = context;
        if (interfaceC5572a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f26679b = interfaceC5572a;
        if (interfaceC5572a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f26680c = interfaceC5572a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f26681d = str;
    }

    @Override // T6.h
    public final Context a() {
        return this.f26678a;
    }

    @Override // T6.h
    @NonNull
    public final String b() {
        return this.f26681d;
    }

    @Override // T6.h
    public final InterfaceC5572a c() {
        return this.f26680c;
    }

    @Override // T6.h
    public final InterfaceC5572a d() {
        return this.f26679b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f26678a.equals(hVar.a()) && this.f26679b.equals(hVar.d()) && this.f26680c.equals(hVar.c()) && this.f26681d.equals(hVar.b());
    }

    public final int hashCode() {
        return ((((((this.f26678a.hashCode() ^ 1000003) * 1000003) ^ this.f26679b.hashCode()) * 1000003) ^ this.f26680c.hashCode()) * 1000003) ^ this.f26681d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f26678a);
        sb2.append(", wallClock=");
        sb2.append(this.f26679b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f26680c);
        sb2.append(", backendName=");
        return o0.c(sb2, this.f26681d, "}");
    }
}
