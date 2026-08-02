package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/material3/TextFieldLabelPosition;", "", "<init>", "()V", "Attached", "Above"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class TextFieldLabelPosition {
    public static final int $stable = 0;

    private TextFieldLabelPosition() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018"}, d2 = {"Landroidx/compose/material3/TextFieldLabelPosition$Attached;", "Landroidx/compose/material3/TextFieldLabelPosition;", "", "alwaysMinimize", "Landroidx/compose/ui/Alignment$Horizontal;", "minimizedAlignment", "expandedAlignment", "<init>", "(ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getAlwaysMinimize", "()Z", "Landroidx/compose/ui/Alignment$Horizontal;", "getMinimizedAlignment", "()Landroidx/compose/ui/Alignment$Horizontal;", "getExpandedAlignment"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Attached extends androidx.compose.material3.TextFieldLabelPosition {
        public static final int $stable = 0;
        private final boolean alwaysMinimize;
        private final androidx.compose.ui.Alignment.Horizontal expandedAlignment;
        private final androidx.compose.ui.Alignment.Horizontal minimizedAlignment;

        public final boolean getAlwaysMinimize() {
            return this.alwaysMinimize;
        }

        public /* synthetic */ Attached(boolean z, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.ui.Alignment.Horizontal horizontal2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? androidx.compose.ui.Alignment.INSTANCE.getStart() : horizontal, (i & 4) != 0 ? androidx.compose.ui.Alignment.INSTANCE.getStart() : horizontal2);
        }

        public final androidx.compose.ui.Alignment.Horizontal getMinimizedAlignment() {
            return this.minimizedAlignment;
        }

        public final androidx.compose.ui.Alignment.Horizontal getExpandedAlignment() {
            return this.expandedAlignment;
        }

        public Attached(boolean z, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.ui.Alignment.Horizontal horizontal2) {
            super(null);
            this.alwaysMinimize = z;
            this.minimizedAlignment = horizontal;
            this.expandedAlignment = horizontal2;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.material3.TextFieldLabelPosition.Attached)) {
                return false;
            }
            androidx.compose.material3.TextFieldLabelPosition.Attached attached = (androidx.compose.material3.TextFieldLabelPosition.Attached) other;
            return this.alwaysMinimize == attached.alwaysMinimize && kotlin.jvm.internal.Intrinsics.areEqual(this.minimizedAlignment, attached.minimizedAlignment) && kotlin.jvm.internal.Intrinsics.areEqual(this.expandedAlignment, attached.expandedAlignment);
        }

        public final int hashCode() {
            return (((java.lang.Boolean.hashCode(this.alwaysMinimize) * 31) + this.minimizedAlignment.hashCode()) * 31) + this.expandedAlignment.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Attached(alwaysMinimize=");
            sb.append(this.alwaysMinimize);
            sb.append(", minimizedAlignment=");
            sb.append(this.minimizedAlignment);
            sb.append(", expandedAlignment=");
            sb.append(this.expandedAlignment);
            sb.append(')');
            return sb.toString();
        }

        public Attached() {
            this(false, null, null, 7, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/material3/TextFieldLabelPosition$Above;", "Landroidx/compose/material3/TextFieldLabelPosition;", "Landroidx/compose/ui/Alignment$Horizontal;", "alignment", "<init>", "(Landroidx/compose/ui/Alignment$Horizontal;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/Alignment$Horizontal;", "getAlignment", "()Landroidx/compose/ui/Alignment$Horizontal;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Above extends androidx.compose.material3.TextFieldLabelPosition {
        public static final int $stable = 0;
        private final androidx.compose.ui.Alignment.Horizontal alignment;

        public Above(androidx.compose.ui.Alignment.Horizontal horizontal) {
            super(null);
            this.alignment = horizontal;
        }

        public /* synthetic */ Above(androidx.compose.ui.Alignment.Horizontal horizontal, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? androidx.compose.ui.Alignment.INSTANCE.getStart() : horizontal);
        }

        public final androidx.compose.ui.Alignment.Horizontal getAlignment() {
            return this.alignment;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof androidx.compose.material3.TextFieldLabelPosition.Above) {
                return kotlin.jvm.internal.Intrinsics.areEqual(this.alignment, ((androidx.compose.material3.TextFieldLabelPosition.Above) other).alignment);
            }
            return false;
        }

        public final int hashCode() {
            return this.alignment.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Above(alignment=");
            sb.append(this.alignment);
            sb.append(')');
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Above() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ TextFieldLabelPosition(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
