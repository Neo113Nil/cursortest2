package com.startapp.sdk.internal;

import java.util.Collection;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class ca implements re {

    /* renamed from: b, reason: collision with root package name */
    public static final ca f3538b = new ca();

    /* renamed from: a, reason: collision with root package name */
    public final Set f3539a;

    public ca(Set languages) {
        kotlin.jvm.internal.j.e(languages, "languages");
        this.f3539a = languages;
    }

    @Override // com.startapp.sdk.internal.re
    public final JSONArray a() {
        if (this.f3539a != null) {
            return new JSONArray((Collection) this.f3539a);
        }
        return null;
    }

    @Override // com.startapp.sdk.internal.re
    public final String b() {
        Set set = this.f3539a;
        if (set == null) {
            return null;
        }
        WeakHashMap weakHashMap = si.f4343a;
        StringBuilder sb = new StringBuilder();
        boolean z3 = false;
        for (Object obj : set) {
            if (z3) {
                sb.append(";");
            }
            sb.append(obj);
            z3 = true;
        }
        return sb.toString();
    }

    public ca() {
        this.f3539a = null;
    }
}
