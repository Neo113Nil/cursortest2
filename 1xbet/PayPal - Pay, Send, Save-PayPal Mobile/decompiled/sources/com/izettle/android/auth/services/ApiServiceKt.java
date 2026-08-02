package com.izettle.android.auth.services;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\"\u0018\u0010\u0002\u001a\u00020\u0001*\u00020\u00008CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "isFailure", "(I)Z"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ApiServiceKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isFailure(int i) {
        return 500 <= i && i < 601;
    }
}
