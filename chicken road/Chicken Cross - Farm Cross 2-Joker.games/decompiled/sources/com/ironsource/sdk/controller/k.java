package com.ironsource.sdk.controller;

import android.content.Context;
import android.content.Intent;
import com.ironsource.InterfaceC4415g;
import com.ironsource.InterfaceC4433h;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface k {

    public static final class a implements InterfaceC4415g {
        @Override // com.ironsource.InterfaceC4415g
        public Intent a() {
            return new Intent("android.intent.action.VIEW");
        }
    }

    public static final class b implements InterfaceC4433h {
        @Override // com.ironsource.InterfaceC4433h
        public Intent a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, (Class<?>) InlineStoreActivity.class);
        }
    }

    public static final class c implements InterfaceC4433h {
        @Override // com.ironsource.InterfaceC4433h
        public Intent a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, (Class<?>) OpenUrlActivity.class);
        }
    }
}
