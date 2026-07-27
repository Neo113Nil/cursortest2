package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.f0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4398f0 implements InterfaceC4416g0 {
    public static final a b = new a(null);
    private static final String c = "ext_";

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f8181a = new HashMap();

    /* renamed from: com.ironsource.f0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // com.ironsource.InterfaceC4416g0
    public void a(HashMap<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f8181a.putAll(params);
    }

    @Override // com.ironsource.InterfaceC4416g0
    public void b(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f8181a.put("ext_" + key, value);
    }

    @Override // com.ironsource.InterfaceC4416g0
    public Map<String, String> get() {
        return this.f8181a;
    }

    @Override // com.ironsource.InterfaceC4416g0
    public void a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f8181a.put(key, value);
    }
}
