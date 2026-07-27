package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.r8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4620r8 implements InterfaceC4476j7 {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, Object> f8503a = new HashMap();

    /* renamed from: com.ironsource.r8$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        String f8504a;
        String b;
        String c;
        Context d;
        String e;
        String f;

        a a(String str) {
            this.b = str;
            return this;
        }

        a b(String str) {
            this.f = str;
            return this;
        }

        a c(String str) {
            this.c = str;
            return this;
        }

        a d(String str) {
            this.f8504a = str;
            return this;
        }

        a e(String str) {
            this.e = str;
            return this;
        }

        a a(Context context) {
            this.d = context;
            return this;
        }

        public C4620r8 a() {
            return new C4620r8(this);
        }
    }

    private C4620r8(a aVar) {
        a(aVar);
        a(aVar.d);
    }

    private void a(Context context) {
        f8503a.put(C4761z5.e, R3.b(context));
        f8503a.put(C4761z5.f, R3.d(context));
    }

    public static void b(String str) {
        f8503a.put(C4761z5.f, SDKUtils.encodeString(str));
    }

    private void a(a aVar) {
        Context context = aVar.d;
        V4 b = V4.b(context);
        f8503a.put(C4761z5.j, SDKUtils.encodeString(b.e()));
        f8503a.put(C4761z5.k, SDKUtils.encodeString(b.f()));
        f8503a.put(C4761z5.l, Integer.valueOf(b.a()));
        f8503a.put(C4761z5.m, SDKUtils.encodeString(b.d()));
        f8503a.put(C4761z5.n, SDKUtils.encodeString(b.c()));
        f8503a.put(C4761z5.d, SDKUtils.encodeString(context.getPackageName()));
        f8503a.put(C4761z5.g, SDKUtils.encodeString(aVar.b));
        f8503a.put("sessionid", SDKUtils.encodeString(aVar.f8504a));
        f8503a.put(C4761z5.b, SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        f8503a.put(C4761z5.o, C4761z5.t);
        f8503a.put("origin", C4761z5.q);
        if (!TextUtils.isEmpty(aVar.e)) {
            f8503a.put(C4761z5.i, SDKUtils.encodeString(aVar.e));
        }
        if (TextUtils.isEmpty(aVar.f)) {
            return;
        }
        f8503a.put(C4761z5.K, aVar.f);
    }

    @Override // com.ironsource.InterfaceC4476j7
    public Map<String, Object> a() {
        return f8503a;
    }

    public static void a(String str) {
        f8503a.put(C4761z5.e, SDKUtils.encodeString(str));
    }
}
