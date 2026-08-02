package kotlin.reflect.jvm.internal.impl.km;

/* loaded from: classes5.dex */
public abstract class KmClassifier {
    private KmClassifier() {
    }

    public static final class Class extends kotlin.reflect.jvm.internal.impl.km.KmClassifier {
        private final java.lang.String getHighSpeedVideoSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Class(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.getHighSpeedVideoSizes = str;
        }

        public final java.lang.String getName() {
            return this.getHighSpeedVideoSizes;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Class(name=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.getHighSpeedVideoSizes.hashCode();
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kotlin.reflect.jvm.internal.impl.km.KmClassifier.Class) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, ((kotlin.reflect.jvm.internal.impl.km.KmClassifier.Class) obj).getHighSpeedVideoSizes);
        }
    }

    public static final class TypeParameter extends kotlin.reflect.jvm.internal.impl.km.KmClassifier {
        private final int getHighResolutionOutputSizeshNQ4ISI;

        public TypeParameter(int i) {
            super(null);
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        public final int getId() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TypeParameter(id=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kotlin.reflect.jvm.internal.impl.km.KmClassifier.TypeParameter) && this.getHighResolutionOutputSizeshNQ4ISI == ((kotlin.reflect.jvm.internal.impl.km.KmClassifier.TypeParameter) obj).getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    public static final class TypeAlias extends kotlin.reflect.jvm.internal.impl.km.KmClassifier {
        private final java.lang.String getHighSpeedVideoSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TypeAlias(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.getHighSpeedVideoSizes = str;
        }

        public final java.lang.String getName() {
            return this.getHighSpeedVideoSizes;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TypeAlias(name=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.getHighSpeedVideoSizes.hashCode();
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kotlin.reflect.jvm.internal.impl.km.KmClassifier.TypeAlias) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, ((kotlin.reflect.jvm.internal.impl.km.KmClassifier.TypeAlias) obj).getHighSpeedVideoSizes);
        }
    }

    public /* synthetic */ KmClassifier(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
