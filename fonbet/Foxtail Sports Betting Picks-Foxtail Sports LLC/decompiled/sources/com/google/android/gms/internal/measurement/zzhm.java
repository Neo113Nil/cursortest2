package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.SimpleArrayMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class zzhm implements zzhr {
    private final SimpleArrayMap<String, SimpleArrayMap<String, String>> zza;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0008, code lost:
    
        if (r3 != null) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019 A[RETURN] */
    @Override // com.google.android.gms.internal.measurement.zzhr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zza(Uri uri, String str, String str2, String str3) {
        SimpleArrayMap<String, String> simpleArrayMap;
        if (uri != null) {
            str = uri.toString();
        }
        SimpleArrayMap<String, SimpleArrayMap<String, String>> simpleArrayMap2 = this.zza;
        if (simpleArrayMap2 != null) {
            simpleArrayMap = simpleArrayMap2.get(str);
            if (simpleArrayMap != null) {
                return null;
            }
            if (str2 != null) {
                str3 = str2 + str3;
            }
            return simpleArrayMap.get(str3);
        }
        simpleArrayMap = null;
        if (simpleArrayMap != null) {
        }
    }

    zzhm(SimpleArrayMap<String, SimpleArrayMap<String, String>> simpleArrayMap) {
        this.zza = simpleArrayMap;
    }
}
