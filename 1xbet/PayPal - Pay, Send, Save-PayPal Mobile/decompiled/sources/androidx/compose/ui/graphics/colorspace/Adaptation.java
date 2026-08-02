package androidx.compose.ui.graphics.colorspace;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\b\b&\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Adaptation;", "", "", "p0", "<init>", "([F)V", "transform", "[F", "getTransform$ui_graphics", "()[F", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class Adaptation {
    private static final androidx.compose.ui.graphics.colorspace.Adaptation Bradford;
    private static final androidx.compose.ui.graphics.colorspace.Adaptation Ciecat02;
    private static final androidx.compose.ui.graphics.colorspace.Adaptation VonKries;
    private final float[] transform;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.colorspace.Adaptation.Companion INSTANCE = new androidx.compose.ui.graphics.colorspace.Adaptation.Companion(null);
    public static final int $stable = 8;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Adaptation$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "Bradford", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "getBradford", "()Landroidx/compose/ui/graphics/colorspace/Adaptation;", "VonKries", "getVonKries", "Ciecat02", "getCiecat02"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.ui.graphics.colorspace.Adaptation getBradford() {
            return androidx.compose.ui.graphics.colorspace.Adaptation.Bradford;
        }

        public final androidx.compose.ui.graphics.colorspace.Adaptation getVonKries() {
            return androidx.compose.ui.graphics.colorspace.Adaptation.VonKries;
        }

        public final androidx.compose.ui.graphics.colorspace.Adaptation getCiecat02() {
            return androidx.compose.ui.graphics.colorspace.Adaptation.Ciecat02;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private Adaptation(float[] fArr) {
        this.transform = fArr;
    }

    /* renamed from: getTransform$ui_graphics, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    static {
        final float[] fArr = {0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f};
        Bradford = new androidx.compose.ui.graphics.colorspace.Adaptation(fArr) { // from class: androidx.compose.ui.graphics.colorspace.Adaptation$Companion$Bradford$1
            {
                kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            }

            public final java.lang.String toString() {
                return "Bradford";
            }
        };
        final float[] fArr2 = {0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f};
        VonKries = new androidx.compose.ui.graphics.colorspace.Adaptation(fArr2) { // from class: androidx.compose.ui.graphics.colorspace.Adaptation$Companion$VonKries$1
            {
                kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            }

            public final java.lang.String toString() {
                return "VonKries";
            }
        };
        final float[] fArr3 = {0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f};
        Ciecat02 = new androidx.compose.ui.graphics.colorspace.Adaptation(fArr3) { // from class: androidx.compose.ui.graphics.colorspace.Adaptation$Companion$Ciecat02$1
            {
                kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            }

            public final java.lang.String toString() {
                return "Ciecat02";
            }
        };
    }

    public /* synthetic */ Adaptation(float[] fArr, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }
}
