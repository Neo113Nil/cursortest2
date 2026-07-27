package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class AdDebuggerMetadata implements Serializable {
    private static final long serialVersionUID = 2490385963596560324L;

    @TypeInfo(type = LinkedHashSet.class)
    private Set<String> devices;

    @TypeInfo(name = "sendInfoEvents")
    private boolean infoEvents;
    private boolean testAds;

    public final Set a() {
        return this.devices;
    }

    public final boolean b() {
        return this.infoEvents;
    }

    public final boolean c() {
        return this.testAds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AdDebuggerMetadata adDebuggerMetadata = (AdDebuggerMetadata) obj;
            if (this.testAds == adDebuggerMetadata.testAds && this.infoEvents == adDebuggerMetadata.infoEvents && si.a(this.devices, adDebuggerMetadata.devices)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.devices, Boolean.valueOf(this.testAds), Boolean.valueOf(this.infoEvents)};
        WeakHashMap weakHashMap = si.f4343a;
        return Arrays.deepHashCode(objArr);
    }
}
