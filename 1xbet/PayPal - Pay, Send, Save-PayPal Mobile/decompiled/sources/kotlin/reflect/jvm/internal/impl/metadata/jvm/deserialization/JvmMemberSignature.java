package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

/* loaded from: classes5.dex */
public abstract class JvmMemberSignature {
    public abstract java.lang.String asString();

    private JvmMemberSignature() {
    }

    public static final class Method extends kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature {
        private final java.lang.String getHighSpeedVideoFpsRanges;
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Method(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighSpeedVideoFpsRangesFor = str2;
        }

        public final java.lang.String getDesc() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final java.lang.String getName() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        public final java.lang.String asString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getName());
            sb.append(getDesc());
            return sb.toString();
        }

        public final int hashCode() {
            return (this.getHighSpeedVideoFpsRanges.hashCode() * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode();
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method)) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method method = (kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, method.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, method.getHighSpeedVideoFpsRangesFor);
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method copy(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            return new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method(str, str2);
        }

        public static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method copy$default(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method method, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = method.getHighSpeedVideoFpsRanges;
            }
            if ((i & 2) != 0) {
                str2 = method.getHighSpeedVideoFpsRangesFor;
            }
            return method.copy(str, str2);
        }
    }

    public static final class Field extends kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature {
        private final java.lang.String getHighSpeedVideoFpsRanges;
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Field(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighSpeedVideoFpsRanges = str2;
        }

        public final java.lang.String getDesc() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final java.lang.String getName() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        public final java.lang.String asString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getName());
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
            sb.append(getDesc());
            return sb.toString();
        }

        public final int hashCode() {
            return (this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field)) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field field = (kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, field.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, field.getHighSpeedVideoFpsRanges);
        }

        public final java.lang.String component2() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final java.lang.String component1() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    public final java.lang.String toString() {
        return asString();
    }

    public /* synthetic */ JvmMemberSignature(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
