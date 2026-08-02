package com.google.android.gms.internal.auth;

import androidx.annotation.Nullable;
import com.google.android.gms.common.server.response.b;
import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
public abstract class zzbz extends b {
    @Override // com.google.android.gms.common.server.response.b
    @Nullable
    public final byte[] toByteArray() {
        try {
            return toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
