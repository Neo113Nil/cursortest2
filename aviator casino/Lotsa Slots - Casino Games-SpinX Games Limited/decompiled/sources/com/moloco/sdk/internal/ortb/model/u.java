package com.moloco.sdk.internal.ortb.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0081\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/u;", "", "<init>", "(Ljava/lang/String;I)V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "a", "b", "c", "d", "e", com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@kotlinx.serialization.Serializable
/* loaded from: classes5.dex */
public final class u {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.moloco.sdk.internal.ortb.model.u.Companion INSTANCE;

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> f7058a;

    @kotlinx.serialization.SerialName("start")
    public static final com.moloco.sdk.internal.ortb.model.u b = new com.moloco.sdk.internal.ortb.model.u("Start", 0);

    @kotlinx.serialization.SerialName("center")
    public static final com.moloco.sdk.internal.ortb.model.u c = new com.moloco.sdk.internal.ortb.model.u("Center", 1);

    @kotlinx.serialization.SerialName("end")
    public static final com.moloco.sdk.internal.ortb.model.u d = new com.moloco.sdk.internal.ortb.model.u("End", 2);

    @kotlinx.serialization.SerialName("left")
    public static final com.moloco.sdk.internal.ortb.model.u e = new com.moloco.sdk.internal.ortb.model.u("Left", 3);

    @kotlinx.serialization.SerialName("right")
    public static final com.moloco.sdk.internal.ortb.model.u f = new com.moloco.sdk.internal.ortb.model.u("Right", 4);
    public static final /* synthetic */ com.moloco.sdk.internal.ortb.model.u[] g;
    public static final /* synthetic */ kotlin.enums.EnumEntries h;

    /* renamed from: com.moloco.sdk.internal.ortb.model.u$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final /* synthetic */ kotlinx.serialization.KSerializer a() {
            return (kotlinx.serialization.KSerializer) com.moloco.sdk.internal.ortb.model.u.f7058a.getValue();
        }

        public final kotlinx.serialization.KSerializer<com.moloco.sdk.internal.ortb.model.u> serializer() {
            return a();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        com.moloco.sdk.internal.ortb.model.u[] a2 = a();
        g = a2;
        h = kotlin.enums.EnumEntriesKt.enumEntries(a2);
        INSTANCE = new com.moloco.sdk.internal.ortb.model.u.Companion(null);
        f7058a = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.ortb.model.u$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createAnnotatedEnumSerializer;
                createAnnotatedEnumSerializer = kotlinx.serialization.internal.EnumsKt.createAnnotatedEnumSerializer("com.moloco.sdk.internal.ortb.model.HorizontalAlignment", com.moloco.sdk.internal.ortb.model.u.values(), new java.lang.String[]{"start", "center", "end", "left", "right"}, new java.lang.annotation.Annotation[][]{null, null, null, null, null}, null);
                return createAnnotatedEnumSerializer;
            }
        });
    }

    public u(java.lang.String str, int i) {
    }

    public static final /* synthetic */ com.moloco.sdk.internal.ortb.model.u[] a() {
        return new com.moloco.sdk.internal.ortb.model.u[]{b, c, d, e, f};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.internal.ortb.model.u> d() {
        return h;
    }

    public static com.moloco.sdk.internal.ortb.model.u valueOf(java.lang.String str) {
        return (com.moloco.sdk.internal.ortb.model.u) java.lang.Enum.valueOf(com.moloco.sdk.internal.ortb.model.u.class, str);
    }

    public static com.moloco.sdk.internal.ortb.model.u[] values() {
        return (com.moloco.sdk.internal.ortb.model.u[]) g.clone();
    }
}
