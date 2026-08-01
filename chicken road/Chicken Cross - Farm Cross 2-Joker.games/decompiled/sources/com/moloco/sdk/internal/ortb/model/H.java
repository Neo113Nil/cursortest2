package com.moloco.sdk.internal.ortb.model;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0081\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/H;", "", "<init>", "(Ljava/lang/String;I)V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "a", "b", "c", "d", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes7.dex */
public final class H {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy<KSerializer<Object>> f10531a;

    @SerialName(ViewHierarchyConstants.DIMENSION_TOP_KEY)
    public static final H b = new H("Top", 0);

    @SerialName("center")
    public static final H c = new H("Center", 1);

    @SerialName("bottom")
    public static final H d = new H("Bottom", 2);
    public static final /* synthetic */ H[] e;
    public static final /* synthetic */ EnumEntries f;

    /* renamed from: com.moloco.sdk.internal.ortb.model.H$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final /* synthetic */ KSerializer a() {
            return (KSerializer) H.f10531a.getValue();
        }

        public final KSerializer<H> serializer() {
            return a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        H[] a2 = a();
        e = a2;
        f = EnumEntriesKt.enumEntries(a2);
        INSTANCE = new Companion(null);
        f10531a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.moloco.sdk.internal.ortb.model.H$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer createAnnotatedEnumSerializer;
                createAnnotatedEnumSerializer = EnumsKt.createAnnotatedEnumSerializer("com.moloco.sdk.internal.ortb.model.VerticalAlignment", H.values(), new String[]{ViewHierarchyConstants.DIMENSION_TOP_KEY, "center", "bottom"}, new Annotation[][]{null, null, null}, null);
                return createAnnotatedEnumSerializer;
            }
        });
    }

    public H(String str, int i) {
    }

    public static final /* synthetic */ H[] a() {
        return new H[]{b, c, d};
    }

    public static EnumEntries<H> d() {
        return f;
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) e.clone();
    }
}
