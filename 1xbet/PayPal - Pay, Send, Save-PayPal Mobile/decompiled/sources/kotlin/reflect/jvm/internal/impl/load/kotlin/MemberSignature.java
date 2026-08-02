package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public final class MemberSignature {
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion Companion = new kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion(null);
    private final java.lang.String Camera2StreamConfigurationMap;

    private MemberSignature(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature fromMethod(kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature jvmMethodSignature) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jvmMethodSignature, "");
            return fromMethodNameAndDesc(nameResolver.getString(jvmMethodSignature.getName()), nameResolver.getString(jvmMethodSignature.getDesc()));
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature fromMethodNameAndDesc(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(str2);
            return new kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature(sb.toString(), null);
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature fromFieldNameAndDesc(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append('#');
            sb.append(str2);
            return new kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature(sb.toString(), null);
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature fromJvmMemberSignature(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature jvmMemberSignature) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jvmMemberSignature, "");
            if (jvmMemberSignature instanceof kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method) {
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method method = (kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method) jvmMemberSignature;
                return fromMethodNameAndDesc(method.getName(), method.getDesc());
            }
            if (!(jvmMemberSignature instanceof kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field field = (kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field) jvmMemberSignature;
            return fromFieldNameAndDesc(field.getName(), field.getDesc());
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature fromMethodSignatureAndParameterIndex(kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature memberSignature, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memberSignature, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(memberSignature.getSignature());
            sb.append('@');
            sb.append(i);
            return new kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature(sb.toString(), null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String getSignature() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MemberSignature(signature=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return this.Camera2StreamConfigurationMap.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, ((kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature) obj).Camera2StreamConfigurationMap);
    }

    public /* synthetic */ MemberSignature(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
