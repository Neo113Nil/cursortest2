package com.plaid.internal;

/* renamed from: com.plaid.internal.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0509e {

    /* renamed from: com.plaid.internal.e$a */
    public final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6398a;

        static {
            int[] iArr = new int[com.plaid.internal.core.protos.link.workflow.primitives.f.values().length];
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.primitives.f.ANDROID_SMS_VERIFICATION_API_TYPE_UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.primitives.f.UNRECOGNIZED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.primitives.f.ANDROID_SMS_VERIFICATION_API_TYPE_SMS_RETRIEVER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f6398a = iArr;
        }
    }

    public static final com.plaid.internal.EnumC0508d7 a(com.plaid.internal.core.protos.link.workflow.primitives.f fVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "");
        int i = com.plaid.internal.C0509e.a.f6398a[fVar.ordinal()];
        if (i == 1) {
            return com.plaid.internal.EnumC0508d7.NO_SMS_AUTOFILL;
        }
        if (i == 2) {
            return com.plaid.internal.EnumC0508d7.NO_SMS_AUTOFILL;
        }
        if (i == 3) {
            return com.plaid.internal.EnumC0508d7.SMS_RECEIVER;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
