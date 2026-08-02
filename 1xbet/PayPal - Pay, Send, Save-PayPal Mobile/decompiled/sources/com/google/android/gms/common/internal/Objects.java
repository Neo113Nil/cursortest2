package com.google.android.gms.common.internal;

/* loaded from: classes4.dex */
public final class Objects {

    public static final class ToStringHelper {
        private final java.util.List zza;
        private final java.lang.Object zzb;

        /* synthetic */ ToStringHelper(java.lang.Object obj, byte[] bArr) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(obj);
            this.zzb = obj;
            this.zza = new java.util.ArrayList();
        }

        public final com.google.android.gms.common.internal.Objects.ToStringHelper add(java.lang.String str, java.lang.Object obj) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
            int length = str.length();
            java.lang.String valueOf = java.lang.String.valueOf(obj);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 1 + java.lang.String.valueOf(valueOf).length());
            sb.append(str);
            sb.append("=");
            sb.append(valueOf);
            this.zza.add(sb.toString());
            return this;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(100);
            sb.append(this.zzb.getClass().getSimpleName());
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
            java.util.List list = this.zza;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append((java.lang.String) list.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
            return sb.toString();
        }
    }

    private Objects() {
        throw new java.lang.AssertionError("Uninstantiable");
    }

    public static boolean checkBundlesEquality(android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        java.util.Set<java.lang.String> keySet = bundle.keySet();
        if (!keySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (java.lang.String str : keySet) {
            if (!equal(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public static boolean equal(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int hashCode(java.lang.Object... objArr) {
        return java.util.Arrays.hashCode(objArr);
    }

    public static com.google.android.gms.common.internal.Objects.ToStringHelper toStringHelper(java.lang.Object obj) {
        return new com.google.android.gms.common.internal.Objects.ToStringHelper(obj, null);
    }
}
