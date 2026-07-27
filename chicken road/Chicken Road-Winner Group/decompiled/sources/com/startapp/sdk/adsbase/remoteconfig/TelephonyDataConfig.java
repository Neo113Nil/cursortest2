package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class TelephonyDataConfig implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final TelephonyDataConfig f3322a = new TelephonyDataConfig();
    private static final long serialVersionUID = -7175662234963204913L;
    private String param;
    private boolean enabled = true;

    @TypeInfo(type = ArrayList.class)
    private List<String> categories = Collections.singletonList(e9.f3621i.f3629a);

    public final List a() {
        return this.categories;
    }

    public final String b() {
        return this.param;
    }

    public final boolean c() {
        return this.enabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TelephonyDataConfig telephonyDataConfig = (TelephonyDataConfig) obj;
            if (this.enabled == telephonyDataConfig.enabled && si.a(this.categories, telephonyDataConfig.categories) && si.a((Object) this.param, (Object) telephonyDataConfig.param)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), this.categories, this.param};
        WeakHashMap weakHashMap = si.f4343a;
        return Arrays.deepHashCode(objArr);
    }
}
