package H5;

/* loaded from: classes8.dex */
public final class i<T> {

    /* renamed from: a, reason: collision with root package name */
    String f10627a;

    /* renamed from: b, reason: collision with root package name */
    String f10628b;

    public final void a(String str, String str2) {
        this.f10627a = str;
        this.f10628b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x2.d)) {
            return false;
        }
        x2.d dVar = (x2.d) obj;
        F f7 = dVar.f104935a;
        Object obj2 = this.f10627a;
        if (f7 != obj2 && (f7 == 0 || !f7.equals(obj2))) {
            return false;
        }
        Object obj3 = this.f10628b;
        S s11 = dVar.f104936b;
        if (s11 != obj3) {
            return s11 != 0 && s11.equals(obj3);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f10627a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f10628b;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + ((Object) this.f10627a) + " " + ((Object) this.f10628b) + "}";
    }
}
