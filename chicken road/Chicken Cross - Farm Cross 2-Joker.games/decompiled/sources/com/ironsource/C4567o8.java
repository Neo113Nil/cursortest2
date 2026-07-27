package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;

/* renamed from: com.ironsource.o8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4567o8 {

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, Object> f8468a = new HashMap<>();

    public HashMap<String, Object> a() {
        return this.f8468a;
    }

    public C4567o8 a(String str, Object obj) {
        if (obj != null) {
            this.f8468a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }
}
