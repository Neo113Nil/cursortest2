package com.moloco.sdk.internal.services.events;

import com.moloco.sdk.UserIntent;
import com.moloco.sdk.internal.services.E;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10791a = "CustomUserEventBuilderServiceImpl";
    public static final String b = "user_ad_interaction_ext";

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10792a;

        static {
            int[] iArr = new int[a.AbstractC1622a.c.EnumC1624a.values().length];
            try {
                iArr[a.AbstractC1622a.c.EnumC1624a.f11585a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.AbstractC1622a.c.EnumC1624a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.AbstractC1622a.c.EnumC1624a.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.AbstractC1622a.c.EnumC1624a.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.AbstractC1622a.c.EnumC1624a.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.AbstractC1622a.c.EnumC1624a.f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.AbstractC1622a.c.EnumC1624a.g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.AbstractC1622a.c.EnumC1624a.h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[a.AbstractC1622a.c.EnumC1624a.i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f10792a = iArr;
        }
    }

    public static final UserIntent.UserAdInteractionExt.Button.Type a(a.AbstractC1622a.c.EnumC1624a enumC1624a) {
        Intrinsics.checkNotNullParameter(enumC1624a, "<this>");
        switch (a.f10792a[enumC1624a.ordinal()]) {
            case 1:
                return UserIntent.UserAdInteractionExt.Button.Type.NONE;
            case 2:
                return UserIntent.UserAdInteractionExt.Button.Type.CLOSE;
            case 3:
                return UserIntent.UserAdInteractionExt.Button.Type.SKIP;
            case 4:
                return UserIntent.UserAdInteractionExt.Button.Type.DEC_SKIP;
            case 5:
                return UserIntent.UserAdInteractionExt.Button.Type.MUTE;
            case 6:
                return UserIntent.UserAdInteractionExt.Button.Type.UNMUTE;
            case 7:
                return UserIntent.UserAdInteractionExt.Button.Type.CTA;
            case 8:
                return UserIntent.UserAdInteractionExt.Button.Type.REPLAY;
            case 9:
                return UserIntent.UserAdInteractionExt.Button.Type.AD_BADGE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final UserIntent.UserAdInteractionExt.Position a(a.AbstractC1622a.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        UserIntent.UserAdInteractionExt.Position.Builder newBuilder = UserIntent.UserAdInteractionExt.Position.newBuilder();
        newBuilder.setX(fVar.c());
        newBuilder.setY(fVar.d());
        UserIntent.UserAdInteractionExt.Position build = newBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public static final UserIntent.UserAdInteractionExt.Size a(a.AbstractC1622a.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        UserIntent.UserAdInteractionExt.Size.Builder newBuilder = UserIntent.UserAdInteractionExt.Size.newBuilder();
        newBuilder.setW(gVar.d());
        newBuilder.setH(gVar.c());
        UserIntent.UserAdInteractionExt.Size build = newBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public static final UserIntent.UserAdInteractionExt.Size a(E e) {
        Intrinsics.checkNotNullParameter(e, "<this>");
        UserIntent.UserAdInteractionExt.Size.Builder newBuilder = UserIntent.UserAdInteractionExt.Size.newBuilder();
        newBuilder.setW(e.m());
        newBuilder.setH(e.k());
        UserIntent.UserAdInteractionExt.Size build = newBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
