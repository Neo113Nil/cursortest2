package com.ironsource.sdk.controller;

/* loaded from: classes5.dex */
public interface k {

    public static final class a implements com.ironsource.InterfaceC3050g {
        @Override // com.ironsource.InterfaceC3050g
        public android.content.Intent a() {
            return new android.content.Intent("android.intent.action.VIEW");
        }
    }

    public static final class b implements com.ironsource.InterfaceC3068h {
        @Override // com.ironsource.InterfaceC3068h
        public android.content.Intent a(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            return new android.content.Intent(context, (java.lang.Class<?>) com.unity3d.ironsourceads.internal.services.InlineStoreActivity.class);
        }
    }

    public static final class c implements com.ironsource.InterfaceC3068h {
        @Override // com.ironsource.InterfaceC3068h
        public android.content.Intent a(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            return new android.content.Intent(context, (java.lang.Class<?>) com.ironsource.sdk.controller.OpenUrlActivity.class);
        }
    }
}
