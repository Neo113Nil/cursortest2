package com.ironsource;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.w4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4706w4 implements InterfaceC4655t7 {

    /* renamed from: com.ironsource.w4$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8743a;

        static {
            int[] iArr = new int[EnumC4634s4.values().length];
            try {
                iArr[EnumC4634s4.IADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4634s4.UADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4634s4.SHARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4634s4.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8743a = iArr;
        }
    }

    @Override // com.ironsource.InterfaceC4655t7
    public InterfaceC4742y4 a(Context context, EnumC4634s4 source) {
        C4688v4 c4688v4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        int i = a.f8743a[source.ordinal()];
        if (i == 1) {
            c4688v4 = new C4688v4(context, "supersonic_shared_preferen");
        } else if (i == 2) {
            c4688v4 = new C4688v4(context, "unityads-installinfo");
        } else {
            if (i != 3) {
                if (i == 4) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            c4688v4 = new C4688v4(context, C4724x4.c);
        }
        return c4688v4;
    }
}
