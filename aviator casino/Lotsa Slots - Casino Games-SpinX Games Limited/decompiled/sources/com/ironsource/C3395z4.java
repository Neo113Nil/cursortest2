package com.ironsource;

/* renamed from: com.ironsource.z4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3395z4 implements com.ironsource.InterfaceC3344w7 {

    /* renamed from: com.ironsource.z4$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6856a;

        static {
            int[] iArr = new int[com.ironsource.EnumC3323v4.values().length];
            try {
                iArr[com.ironsource.EnumC3323v4.IADS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.ironsource.EnumC3323v4.UADS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.ironsource.EnumC3323v4.SHARED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.ironsource.EnumC3323v4.NONE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f6856a = iArr;
        }
    }

    @Override // com.ironsource.InterfaceC3344w7
    public com.ironsource.B4 a(android.content.Context context, com.ironsource.EnumC3323v4 source) {
        com.ironsource.C3377y4 c3377y4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        int i = com.ironsource.C3395z4.a.f6856a[source.ordinal()];
        if (i == 1) {
            c3377y4 = new com.ironsource.C3377y4(context, "supersonic_shared_preferen");
        } else if (i == 2) {
            c3377y4 = new com.ironsource.C3377y4(context, "unityads-installinfo");
        } else {
            if (i != 3) {
                if (i == 4) {
                    return null;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
            c3377y4 = new com.ironsource.C3377y4(context, com.ironsource.A4.c);
        }
        return c3377y4;
    }
}
