package a4;

import j3.s;
import j3.t;
import java.util.Arrays;

/* renamed from: a4.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4941c implements t.a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f36260a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36261b;

    /* renamed from: c, reason: collision with root package name */
    public final String f36262c;

    public C4941c(byte[] bArr, String str, String str2) {
        this.f36260a = bArr;
        this.f36261b = str;
        this.f36262c = str2;
    }

    @Override // j3.t.a
    public final void a(s.a aVar) {
        String str = this.f36261b;
        if (str != null) {
            aVar.Z(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4941c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f36260a, ((C4941c) obj).f36260a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f36260a);
    }

    public final String toString() {
        return "ICY: title=\"" + this.f36261b + "\", url=\"" + this.f36262c + "\", rawMetadata.length=\"" + this.f36260a.length + "\"";
    }
}
