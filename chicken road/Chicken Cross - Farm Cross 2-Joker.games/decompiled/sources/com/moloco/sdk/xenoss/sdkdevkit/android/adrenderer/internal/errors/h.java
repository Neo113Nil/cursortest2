package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class h {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10973a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.f10972a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f10973a = iArr;
        }
    }

    public static final i a(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        int i = a.f10973a[gVar.ordinal()];
        if (i == 1) {
            return i.f10974a;
        }
        if (i == 2) {
            return i.b;
        }
        if (i == 3) {
            return i.c;
        }
        if (i == 4) {
            return i.d;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final j b(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        int i = a.f10973a[gVar.ordinal()];
        if (i == 1) {
            return j.f10975a;
        }
        if (i == 2) {
            return j.b;
        }
        if (i == 3) {
            return j.c;
        }
        if (i == 4) {
            return j.d;
        }
        throw new NoWhenBranchMatchedException();
    }
}
