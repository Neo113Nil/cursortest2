package com.inmobi.media;

/* loaded from: classes5.dex */
public final class E2 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.BitSet f4674a;

    public final void a(java.lang.String b64String) {
        byte[] value;
        java.util.BitSet bitSet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b64String, "b64String");
        try {
            value = android.util.Base64.decode(b64String, 0);
        } catch (java.lang.Exception e) {
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e);
            value = null;
        }
        if (value != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            com.inmobi.media.B5.f4614a.getClass();
            if (com.inmobi.media.B5.w()) {
                bitSet = java.util.BitSet.valueOf(value);
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "<this>");
                java.util.BitSet bitSet2 = new java.util.BitSet(value.length * 8);
                int i = 0;
                for (byte b : value) {
                    int i2 = 0;
                    while (i2 < 8) {
                        boolean z = true;
                        int i3 = i + 1;
                        if (((b >> ((byte) i2)) & 1) != 1) {
                            z = false;
                        }
                        bitSet2.set(i, z);
                        i2++;
                        i = i3;
                    }
                }
                bitSet = bitSet2;
            }
            this.f4674a = bitSet;
        }
    }
}
