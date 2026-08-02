package Cf0;

import kotlin.jvm.functions.Function0;
import pf0.AbstractC8919b;
import pf0.AbstractC8921d;
import pf0.EnumC8923f;

/* renamed from: Cf0.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2765f extends AbstractC8921d {

    /* renamed from: b, reason: collision with root package name */
    private final pf0.j f4904b = pf0.j.PROD_BUILDS_ALL_USERS;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC8923f f4905c = EnumC8923f.AppInterceptor;

    /* renamed from: d, reason: collision with root package name */
    private final String f4906d = "x-o3-sdk-versions";

    /* renamed from: e, reason: collision with root package name */
    private final Function0<String> f4907e;

    C2765f(AbstractC8919b.c cVar) {
        this.f4907e = new C2764e(cVar);
    }

    @Override // pf0.AbstractC8921d
    public final Function0<String> c() {
        return this.f4907e;
    }

    @Override // pf0.AbstractC8922e
    public final String getKey() {
        return this.f4906d;
    }

    @Override // pf0.AbstractC8922e
    public final pf0.j getOzonNetworkDevToolsLevel() {
        return this.f4904b;
    }

    @Override // pf0.AbstractC8922e
    public final EnumC8923f getType() {
        return this.f4905c;
    }
}
