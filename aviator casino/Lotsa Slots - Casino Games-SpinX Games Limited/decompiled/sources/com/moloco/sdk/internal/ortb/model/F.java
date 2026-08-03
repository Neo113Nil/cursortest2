package com.moloco.sdk.internal.ortb.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0081\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/F;", "", "<init>", "(Ljava/lang/String;I)V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "a", "b", "c", "d", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@kotlinx.serialization.Serializable
/* loaded from: classes5.dex */
public final class F {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.moloco.sdk.internal.ortb.model.F.Companion INSTANCE;

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> f7020a;

    @kotlinx.serialization.SerialName("top")
    public static final com.moloco.sdk.internal.ortb.model.F b = new com.moloco.sdk.internal.ortb.model.F("Top", 0);

    @kotlinx.serialization.SerialName("center")
    public static final com.moloco.sdk.internal.ortb.model.F c = new com.moloco.sdk.internal.ortb.model.F("Center", 1);

    @kotlinx.serialization.SerialName(com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM)
    public static final com.moloco.sdk.internal.ortb.model.F d = new com.moloco.sdk.internal.ortb.model.F("Bottom", 2);
    public static final /* synthetic */ com.moloco.sdk.internal.ortb.model.F[] e;
    public static final /* synthetic */ kotlin.enums.EnumEntries f;

    /* renamed from: com.moloco.sdk.internal.ortb.model.F$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final /* synthetic */ kotlinx.serialization.KSerializer a() {
            return (kotlinx.serialization.KSerializer) com.moloco.sdk.internal.ortb.model.F.f7020a.getValue();
        }

        public final kotlinx.serialization.KSerializer<com.moloco.sdk.internal.ortb.model.F> serializer() {
            return a();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        com.moloco.sdk.internal.ortb.model.F[] a2 = a();
        e = a2;
        f = kotlin.enums.EnumEntriesKt.enumEntries(a2);
        INSTANCE = new com.moloco.sdk.internal.ortb.model.F.Companion(null);
        f7020a = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.ortb.model.F$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createAnnotatedEnumSerializer;
                createAnnotatedEnumSerializer = kotlinx.serialization.internal.EnumsKt.createAnnotatedEnumSerializer("com.moloco.sdk.internal.ortb.model.VerticalAlignment", com.moloco.sdk.internal.ortb.model.F.values(), new java.lang.String[]{"top", "center", com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM}, new java.lang.annotation.Annotation[][]{null, null, null}, null);
                return createAnnotatedEnumSerializer;
            }
        });
    }

    public F(java.lang.String str, int i) {
    }

    public static final /* synthetic */ com.moloco.sdk.internal.ortb.model.F[] a() {
        return new com.moloco.sdk.internal.ortb.model.F[]{b, c, d};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.internal.ortb.model.F> d() {
        return f;
    }

    public static com.moloco.sdk.internal.ortb.model.F valueOf(java.lang.String str) {
        return (com.moloco.sdk.internal.ortb.model.F) java.lang.Enum.valueOf(com.moloco.sdk.internal.ortb.model.F.class, str);
    }

    public static com.moloco.sdk.internal.ortb.model.F[] values() {
        return (com.moloco.sdk.internal.ortb.model.F[]) e.clone();
    }
}
