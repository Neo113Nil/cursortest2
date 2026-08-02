package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzccj {
    private final java.util.List zza = new java.util.ArrayList(20);

    public final com.google.android.libraries.places.internal.zzccj zza(java.lang.String str, java.lang.String str2) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "Unexpected char %#04x at %d in header name: %s", java.lang.Integer.valueOf(charAt), java.lang.Integer.valueOf(i2), str));
            }
        }
        if (str2 == null) {
            throw new java.lang.IllegalArgumentException("value == null");
        }
        for (int i3 = 0; i3 < str2.length(); i3++) {
            char charAt2 = str2.charAt(i3);
            if (charAt2 <= 31 || charAt2 >= 127) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "Unexpected char %#04x at %d in header value: %s", java.lang.Integer.valueOf(charAt2), java.lang.Integer.valueOf(i3), str2));
            }
        }
        while (true) {
            java.util.List list = this.zza;
            if (i >= list.size()) {
                list.add(str);
                list.add(str2.trim());
                return this;
            }
            if (str.equalsIgnoreCase((java.lang.String) list.get(i))) {
                list.remove(i);
                list.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public final com.google.android.libraries.places.internal.zzcck zzb() {
        return new com.google.android.libraries.places.internal.zzcck(this, null);
    }

    final /* synthetic */ java.util.List zzc() {
        return this.zza;
    }
}
