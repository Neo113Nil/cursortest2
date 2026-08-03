package com.moloco.sdk.internal.services.events;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f7270a = "CustomUserEventBuilderServiceImpl";
    public static final java.lang.String b = "user_ad_interaction_ext";

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7271a;

        static {
            int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a.values().length];
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a.f7987a.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a.b.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a.c.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a.d.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a.e.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a.f.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a.g.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a.h.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a.i.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            f7271a = iArr;
        }
    }

    public static final com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a enumC0327a) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumC0327a, "<this>");
        switch (com.moloco.sdk.internal.services.events.b.a.f7271a[enumC0327a.ordinal()]) {
            case 1:
                return com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type.NONE;
            case 2:
                return com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type.CLOSE;
            case 3:
                return com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type.SKIP;
            case 4:
                return com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type.DEC_SKIP;
            case 5:
                return com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type.MUTE;
            case 6:
                return com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type.UNMUTE;
            case 7:
                return com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type.CTA;
            case 8:
                return com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type.REPLAY;
            case 9:
                return com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type.AD_BADGE;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.moloco.sdk.UserIntent.UserAdInteractionExt.Position a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f fVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "<this>");
        com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.Builder newBuilder = com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.newBuilder();
        newBuilder.setX(fVar.c());
        newBuilder.setY(fVar.d());
        com.moloco.sdk.UserIntent.UserAdInteractionExt.Position build = newBuilder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public static final com.moloco.sdk.UserIntent.UserAdInteractionExt.Size a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.g gVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "<this>");
        com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.Builder newBuilder = com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.newBuilder();
        newBuilder.setW(gVar.d());
        newBuilder.setH(gVar.c());
        com.moloco.sdk.UserIntent.UserAdInteractionExt.Size build = newBuilder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public static final com.moloco.sdk.UserIntent.UserAdInteractionExt.Size a(com.moloco.sdk.internal.services.E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "<this>");
        com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.Builder newBuilder = com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.newBuilder();
        newBuilder.setW(e.m());
        newBuilder.setH(e.k());
        com.moloco.sdk.UserIntent.UserAdInteractionExt.Size build = newBuilder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
