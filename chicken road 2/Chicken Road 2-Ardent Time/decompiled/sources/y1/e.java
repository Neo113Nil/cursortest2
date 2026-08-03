package y1;

/* loaded from: classes.dex */
public final class e extends i1.AbstractC0186e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0.i f8502a;

    public e(o0.i iVar) {
        this.f8502a = iVar;
    }

    @Override // i1.AbstractC0186e
    public final int a() {
        return ((java.util.regex.Matcher) this.f8502a.f8148b).groupCount() + 1;
    }

    @Override // i1.AbstractC0186e, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return super.contains((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i2) {
        java.lang.String group = ((java.util.regex.Matcher) this.f8502a.f8148b).group(i2);
        return group == null ? "" : group;
    }

    @Override // i1.AbstractC0186e, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return super.indexOf((java.lang.String) obj);
        }
        return -1;
    }

    @Override // i1.AbstractC0186e, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return super.lastIndexOf((java.lang.String) obj);
        }
        return -1;
    }
}
