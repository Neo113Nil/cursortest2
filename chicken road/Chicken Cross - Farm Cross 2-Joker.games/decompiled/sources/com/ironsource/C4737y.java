package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4737y implements InterfaceC4574of<JSONObject>, InterfaceC4538mf<C4701w> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, H0> f8767a = new LinkedHashMap();
    private int b;

    /* renamed from: com.ironsource.y$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8768a;

        static {
            int[] iArr = new int[EnumC4520lf.values().length];
            try {
                iArr[EnumC4520lf.LoadRequest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4520lf.LoadSuccess.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4520lf.ShowSuccess.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4520lf.ShowFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC4520lf.Destroyed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f8768a = iArr;
        }
    }

    private final void b(C4701w c4701w) {
        int i;
        int i2 = a.f8768a[c4701w.f().ordinal()];
        if (i2 == 2) {
            this.b++;
        } else if ((i2 == 3 || i2 == 4 || i2 == 5) && (i = this.b) > 0) {
            this.b = i - 1;
        }
    }

    public final int a() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC4538mf
    public void a(C4701w record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String c = record.c();
        Map<String, H0> map = this.f8767a;
        H0 h0 = map.get(c);
        if (h0 == null) {
            h0 = new H0();
            map.put(c, h0);
        }
        h0.a(record.a(new C4719x()));
        b(record);
    }

    @Override // com.ironsource.InterfaceC4290a7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(EnumC4556nf mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, H0> entry : this.f8767a.entrySet()) {
            String key = entry.getKey();
            JSONObject a2 = entry.getValue().a(mode);
            if (a2.length() > 0) {
                jSONObject.put(key, a2);
            }
        }
        return jSONObject;
    }

    public final boolean b() {
        return !this.f8767a.isEmpty();
    }
}
