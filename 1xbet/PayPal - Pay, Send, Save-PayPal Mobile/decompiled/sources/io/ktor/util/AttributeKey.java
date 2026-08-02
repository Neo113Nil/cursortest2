package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lio/ktor/util/AttributeKey;", "", "T", "", "name", "Lio/ktor/util/reflect/TypeInfo;", "type", "<init>", "(Ljava/lang/String;Lio/ktor/util/reflect/TypeInfo;)V", "toString", "()Ljava/lang/String;", "component1", "copy", "(Ljava/lang/String;Lio/ktor/util/reflect/TypeInfo;)Lio/ktor/util/AttributeKey;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getName", "getHighSpeedVideoFpsRangesFor", "Lio/ktor/util/reflect/TypeInfo;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AttributeKey<T> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final io.ktor.util.reflect.TypeInfo getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String name;

    public AttributeKey(java.lang.String str, io.ktor.util.reflect.TypeInfo typeInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeInfo, "");
        this.name = str;
        this.getHighResolutionOutputSizeshNQ4ISI = typeInfo;
        if (kotlin.text.StringsKt.isBlank(str)) {
            throw new java.lang.IllegalArgumentException("Name can't be blank".toString());
        }
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AttributeKey: ");
        sb.append(this.name);
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AttributeKey(java.lang.String str, io.ktor.util.reflect.TypeInfo typeInfo, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, typeInfo);
        kotlin.reflect.KType kType;
        if ((i & 2) != 0) {
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
            try {
                kType = kotlin.jvm.internal.Reflection.typeOf(java.lang.Object.class);
            } catch (java.lang.Throwable unused) {
                kType = null;
            }
            typeInfo = new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType);
        }
    }

    public final int hashCode() {
        return (this.name.hashCode() * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.util.AttributeKey)) {
            return false;
        }
        io.ktor.util.AttributeKey attributeKey = (io.ktor.util.AttributeKey) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, attributeKey.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, attributeKey.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final io.ktor.util.AttributeKey<T> copy(java.lang.String name2, io.ktor.util.reflect.TypeInfo type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new io.ktor.util.AttributeKey<>(name2, type);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ io.ktor.util.AttributeKey copy$default(io.ktor.util.AttributeKey attributeKey, java.lang.String str, io.ktor.util.reflect.TypeInfo typeInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = attributeKey.name;
        }
        if ((i & 2) != 0) {
            typeInfo = attributeKey.getHighResolutionOutputSizeshNQ4ISI;
        }
        return attributeKey.copy(str, typeInfo);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AttributeKey(java.lang.String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }
}
