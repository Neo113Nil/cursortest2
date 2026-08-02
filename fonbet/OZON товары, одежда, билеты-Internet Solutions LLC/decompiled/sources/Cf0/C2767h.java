package Cf0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import pf0.AbstractC8921d;
import pf0.EnumC8923f;

/* renamed from: Cf0.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2767h extends AbstractC8921d {

    /* renamed from: b, reason: collision with root package name */
    private final pf0.j f4912b = pf0.j.PROD_BUILDS_ALL_USERS;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC8923f f4913c = EnumC8923f.AppInterceptor;

    /* renamed from: d, reason: collision with root package name */
    private final String f4914d = "accept";

    /* renamed from: e, reason: collision with root package name */
    private final Function0<String> f4915e = a.f4916b;

    /* renamed from: Cf0.h$a */
    static final class a extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f4916b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ String invoke() {
            return "application/json; charset=utf-8";
        }
    }

    C2767h() {
    }

    @Override // pf0.AbstractC8921d
    public final Function0<String> c() {
        return this.f4915e;
    }

    @Override // pf0.AbstractC8922e
    public final String getKey() {
        return this.f4914d;
    }

    @Override // pf0.AbstractC8922e
    public final pf0.j getOzonNetworkDevToolsLevel() {
        return this.f4912b;
    }

    @Override // pf0.AbstractC8922e
    public final EnumC8923f getType() {
        return this.f4913c;
    }
}
