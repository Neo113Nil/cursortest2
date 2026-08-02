package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.C0863e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class e extends a.AbstractC0110a {
    @Override // com.google.android.gms.common.api.a.AbstractC0110a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, C0863e c0863e, @Nullable Object obj, h.a aVar, h.b bVar) {
        return new com.google.android.gms.auth.api.signin.internal.g(context, looper, c0863e, (GoogleSignInOptions) obj, aVar, bVar);
    }

    @Override // com.google.android.gms.common.api.a.e
    public final List getImpliedScopes(@Nullable Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.EMPTY_LIST : new ArrayList(googleSignInOptions.b);
    }
}
