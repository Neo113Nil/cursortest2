package androidx.compose.ui.graphics.vector;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0010\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0010\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty;", "T", "", "<init>", "()V", "Rotation", "PivotX", "PivotY", "ScaleX", "ScaleY", "TranslateX", "TranslateY", "PathData", "Fill", "FillAlpha", "Stroke", "StrokeLineWidth", "StrokeAlpha", "TrimPathStart", "TrimPathEnd", "TrimPathOffset", "Landroidx/compose/ui/graphics/vector/VectorProperty$Fill;", "Landroidx/compose/ui/graphics/vector/VectorProperty$FillAlpha;", "Landroidx/compose/ui/graphics/vector/VectorProperty$PathData;", "Landroidx/compose/ui/graphics/vector/VectorProperty$PivotX;", "Landroidx/compose/ui/graphics/vector/VectorProperty$PivotY;", "Landroidx/compose/ui/graphics/vector/VectorProperty$Rotation;", "Landroidx/compose/ui/graphics/vector/VectorProperty$ScaleX;", "Landroidx/compose/ui/graphics/vector/VectorProperty$ScaleY;", "Landroidx/compose/ui/graphics/vector/VectorProperty$Stroke;", "Landroidx/compose/ui/graphics/vector/VectorProperty$StrokeAlpha;", "Landroidx/compose/ui/graphics/vector/VectorProperty$StrokeLineWidth;", "Landroidx/compose/ui/graphics/vector/VectorProperty$TranslateX;", "Landroidx/compose/ui/graphics/vector/VectorProperty$TranslateY;", "Landroidx/compose/ui/graphics/vector/VectorProperty$TrimPathEnd;", "Landroidx/compose/ui/graphics/vector/VectorProperty$TrimPathOffset;", "Landroidx/compose/ui/graphics/vector/VectorProperty$TrimPathStart;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class VectorProperty<T> {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$Rotation;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Rotation extends androidx.compose.ui.graphics.vector.VectorProperty<java.lang.Float> {
        public static final int $stable = 0;
        public static final androidx.compose.ui.graphics.vector.VectorProperty.Rotation INSTANCE = new androidx.compose.ui.graphics.vector.VectorProperty.Rotation();

        private Rotation() {
            super(null);
        }
    }

    private VectorProperty() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$PivotX;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PivotX extends androidx.compose.ui.graphics.vector.VectorProperty<java.lang.Float> {
        public static final int $stable = 0;
        public static final androidx.compose.ui.graphics.vector.VectorProperty.PivotX INSTANCE = new androidx.compose.ui.graphics.vector.VectorProperty.PivotX();

        private PivotX() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$PivotY;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PivotY extends androidx.compose.ui.graphics.vector.VectorProperty<java.lang.Float> {
        public static final int $stable = 0;
        public static final androidx.compose.ui.graphics.vector.VectorProperty.PivotY INSTANCE = new androidx.compose.ui.graphics.vector.VectorProperty.PivotY();

        private PivotY() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$ScaleX;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ScaleX extends androidx.compose.ui.graphics.vector.VectorProperty<java.lang.Float> {
        public static final int $stable = 0;
        public static final androidx.compose.ui.graphics.vector.VectorProperty.ScaleX INSTANCE = new androidx.compose.ui.graphics.vector.VectorProperty.ScaleX();

        private ScaleX() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$ScaleY;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ScaleY extends androidx.compose.ui.graphics.vector.VectorProperty<java.lang.Float> {
        public static final int $stable = 0;
        public static final androidx.compose.ui.graphics.vector.VectorProperty.ScaleY INSTANCE = new androidx.compose.ui.graphics.vector.VectorProperty.ScaleY();

        private ScaleY() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$TranslateX;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TranslateX extends androidx.compose.ui.graphics.vector.VectorProperty<java.lang.Float> {
        public static final int $stable = 0;
        public static final androidx.compose.ui.graphics.vector.VectorProperty.TranslateX INSTANCE = new androidx.compose.ui.graphics.vector.VectorProperty.TranslateX();

        private TranslateX() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$TranslateY;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TranslateY extends androidx.compose.ui.graphics.vector.VectorProperty<java.lang.Float> {
        public static final int $stable = 0;
        public static final androidx.compose.ui.graphics.vector.VectorProperty.TranslateY INSTANCE = new androidx.compose.ui.graphics.vector.VectorProperty.TranslateY();

        private TranslateY() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$PathData;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PathData extends androidx.compose.ui.graphics.vector.VectorProperty<java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode>> {
        public static final int $stable = 0;
        public static final androidx.compose.ui.graphics.vector.VectorProperty.PathData INSTANCE = new androidx.compose.ui.graphics.vector.VectorProperty.PathData();

        private PathData() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$Fill;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "Landroidx/compose/ui/graphics/Brush;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Fill extends androidx.compose.ui.graphics.vector.VectorProperty<androidx.compose.ui.graphics.Brush> {
        public static final int $stable = 0;
        public static final androidx.compose.ui.graphics.vector.VectorProperty.Fill INSTANCE = new androidx.compose.ui.graphics.vector.VectorProperty.Fill();

        private Fill() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$FillAlpha;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FillAlpha extends androidx.compose.ui.graphics.vector.VectorProperty<java.lang.Float> {
        public static final int $stable = 0;
        public static final androidx.compose.ui.graphics.vector.VectorProperty.FillAlpha INSTANCE = new androidx.compose.ui.graphics.vector.VectorProperty.FillAlpha();

        private FillAlpha() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$Stroke;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "Landroidx/compose/ui/graphics/Brush;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Stroke extends androidx.compose.ui.graphics.vector.VectorProperty<androidx.compose.ui.graphics.Brush> {
        public static final int $stable = 0;
        public static final androidx.compose.ui.graphics.vector.VectorProperty.Stroke INSTANCE = new androidx.compose.ui.graphics.vector.VectorProperty.Stroke();

        private Stroke() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$StrokeLineWidth;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StrokeLineWidth extends androidx.compose.ui.graphics.vector.VectorProperty<java.lang.Float> {
        public static final int $stable = 0;
        public static final androidx.compose.ui.graphics.vector.VectorProperty.StrokeLineWidth INSTANCE = new androidx.compose.ui.graphics.vector.VectorProperty.StrokeLineWidth();

        private StrokeLineWidth() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$StrokeAlpha;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StrokeAlpha extends androidx.compose.ui.graphics.vector.VectorProperty<java.lang.Float> {
        public static final int $stable = 0;
        public static final androidx.compose.ui.graphics.vector.VectorProperty.StrokeAlpha INSTANCE = new androidx.compose.ui.graphics.vector.VectorProperty.StrokeAlpha();

        private StrokeAlpha() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$TrimPathStart;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TrimPathStart extends androidx.compose.ui.graphics.vector.VectorProperty<java.lang.Float> {
        public static final int $stable = 0;
        public static final androidx.compose.ui.graphics.vector.VectorProperty.TrimPathStart INSTANCE = new androidx.compose.ui.graphics.vector.VectorProperty.TrimPathStart();

        private TrimPathStart() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$TrimPathEnd;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TrimPathEnd extends androidx.compose.ui.graphics.vector.VectorProperty<java.lang.Float> {
        public static final int $stable = 0;
        public static final androidx.compose.ui.graphics.vector.VectorProperty.TrimPathEnd INSTANCE = new androidx.compose.ui.graphics.vector.VectorProperty.TrimPathEnd();

        private TrimPathEnd() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$TrimPathOffset;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TrimPathOffset extends androidx.compose.ui.graphics.vector.VectorProperty<java.lang.Float> {
        public static final int $stable = 0;
        public static final androidx.compose.ui.graphics.vector.VectorProperty.TrimPathOffset INSTANCE = new androidx.compose.ui.graphics.vector.VectorProperty.TrimPathOffset();

        private TrimPathOffset() {
            super(null);
        }
    }

    public /* synthetic */ VectorProperty(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
