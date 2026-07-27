package v2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements u2.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f10423a;

    /* renamed from: b, reason: collision with root package name */
    public final l f10424b;

    public c(String str, l lVar) {
        this.f10423a = str;
        this.f10424b = lVar;
    }

    @Override // u2.e
    public final Iterator iterator() {
        return new b(this);
    }
}
