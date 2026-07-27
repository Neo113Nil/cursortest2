package com.moloco.sdk.internal.ortb.model;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0081\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/w;", "", "<init>", "(Ljava/lang/String;I)V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "a", "b", "c", "d", "e", "f", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes7.dex */
public final class w {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy<KSerializer<Object>> f10574a;

    @SerialName("start")
    public static final w b = new w("Start", 0);

    @SerialName("center")
    public static final w c = new w("Center", 1);

    @SerialName("end")
    public static final w d = new w("End", 2);

    @SerialName("left")
    public static final w e = new w("Left", 3);

    @SerialName("right")
    public static final w f = new w("Right", 4);
    public static final /* synthetic */ w[] g;
    public static final /* synthetic */ EnumEntries h;

    /* renamed from: com.moloco.sdk.internal.ortb.model.w$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final /* synthetic */ KSerializer a() {
            return (KSerializer) w.f10574a.getValue();
        }

        public final KSerializer<w> serializer() {
            return a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        w[] a2 = a();
        g = a2;
        h = EnumEntriesKt.enumEntries(a2);
        INSTANCE = new Companion(null);
        f10574a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.moloco.sdk.internal.ortb.model.w$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer createAnnotatedEnumSerializer;
                createAnnotatedEnumSerializer = EnumsKt.createAnnotatedEnumSerializer("com.moloco.sdk.internal.ortb.model.HorizontalAlignment", w.values(), new String[]{"start", "center", "end", "left", "right"}, new Annotation[][]{null, null, null, null, null}, null);
                return createAnnotatedEnumSerializer;
            }
        });
    }

    public w(String str, int i) {
    }

    public static final /* synthetic */ w[] a() {
        return new w[]{b, c, d, e, f};
    }

    public static EnumEntries<w> d() {
        return h;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) g.clone();
    }
}
