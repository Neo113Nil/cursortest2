package com.google.firebase;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.InterfaceC0845t;

/* loaded from: classes4.dex */
public class FirebaseExceptionMapper implements InterfaceC0845t {
    @Override // com.google.android.gms.common.api.internal.InterfaceC0845t
    @NonNull
    public final Exception getException(@NonNull Status status) {
        int i = status.a;
        int i2 = status.a;
        String str = status.b;
        if (i == 8) {
            if (str == null) {
                str = d.a(i2);
            }
            return new FirebaseException(str);
        }
        if (str == null) {
            str = d.a(i2);
        }
        return new FirebaseApiNotAvailableException(str);
    }
}
