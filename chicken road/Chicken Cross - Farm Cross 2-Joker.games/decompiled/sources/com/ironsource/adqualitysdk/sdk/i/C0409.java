package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʅ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0409 implements InvocationHandler {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f540 = StringFog.decrypt("K0zR8Z5MwyMtXcDRuE7APS5Ixt4=\n", "TCmltfsvrFE=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C1084 f541;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Object f542;

    public C0409(Object obj, C1084 c1084) {
        this.f542 = obj;
        this.f541 = c1084;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (name.hashCode() == 1622498214) {
            String str = f540;
            if (name.equals(str)) {
                try {
                    String name2 = method.getName();
                    if (name2.hashCode() == 1622498214 && name2.equals(str)) {
                        return this.f542;
                    }
                    return null;
                } catch (Throwable th) {
                    AbstractC0480.m5464(StringFog.decrypt("eqBY68rUaTBGoQ==\n", "KtI3k7OBHVk=\n"), StringFog.decrypt("Gp7RPhFLY78pg8g0QwpugCqNzzgXEiq8OpjLPgdL\n", "X+yjUWNrCtE=\n") + method.getName(), th, true);
                    return null;
                }
            }
        }
        try {
            this.f541.m5873(obj, method, objArr);
        } catch (Throwable th2) {
            String decrypt = StringFog.decrypt("RAv9X8djZlB4Cg==\n", "FHmSJ742Ejk=\n");
            StringBuilder append = new StringBuilder().append(StringFog.decrypt("4+L3P0D1JSnQ/+41ErklNNL16zVA72w=\n", "ppCFUDLVTEc=\n"));
            Object obj2 = this.f542;
            AbstractC0480.m5464(decrypt, append.append(obj2 != null ? obj2.toString() : StringFog.decrypt("SaXb5w==\n", "J9C3izpfxoU=\n")).append(StringFog.decrypt("zcvliRyHw6M=\n", "7aaA/XTop5k=\n")).append(method.getName()).toString(), th2, true);
        }
        Object obj3 = this.f542;
        if (obj3 != null) {
            return method.invoke(obj3, objArr);
        }
        if (!Object.class.equals(method.getDeclaringClass())) {
            return null;
        }
        if (objArr != null) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : objArr) {
                    if (Proxy.isProxyClass(obj4.getClass())) {
                        arrayList.add(Proxy.getInvocationHandler(obj4));
                    } else {
                        arrayList.add(obj4);
                    }
                }
                objArr = arrayList.toArray();
            } catch (Throwable th3) {
                AbstractC0480.m5464(StringFog.decrypt("Ob1Y/His9I8FvA==\n", "ac83hAH5gOY=\n"), StringFog.decrypt("EY4PmHTIpR8giBSZYcirFCKTHpZyga0UdJ0PkHU=\n", "VPx99wbowno=\n"), th3, true);
            }
        }
        return method.invoke(this, objArr);
    }
}
