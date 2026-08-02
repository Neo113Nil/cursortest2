package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r"}, d2 = {"Landroidx/compose/ui/graphics/Outline;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Rect;", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "bounds", "Rectangle", "Rounded", "Generic", "Landroidx/compose/ui/graphics/Outline$Generic;", "Landroidx/compose/ui/graphics/Outline$Rectangle;", "Landroidx/compose/ui/graphics/Outline$Rounded;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class Outline {
    public static final int $stable = 0;

    /* renamed from: getBounds */
    public abstract androidx.compose.ui.geometry.Rect getRect();

    private Outline() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010"}, d2 = {"Landroidx/compose/ui/graphics/Outline$Rectangle;", "Landroidx/compose/ui/graphics/Outline;", "Landroidx/compose/ui/geometry/Rect;", "rect", "<init>", "(Landroidx/compose/ui/geometry/Rect;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/geometry/Rect;", "getRect", "()Landroidx/compose/ui/geometry/Rect;", "getBounds", "bounds"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Rectangle extends androidx.compose.ui.graphics.Outline {
        public static final int $stable = 0;
        private final androidx.compose.ui.geometry.Rect rect;

        public Rectangle(androidx.compose.ui.geometry.Rect rect) {
            super(null);
            this.rect = rect;
        }

        public final androidx.compose.ui.geometry.Rect getRect() {
            return this.rect;
        }

        @Override // androidx.compose.ui.graphics.Outline
        /* renamed from: getBounds, reason: from getter */
        public final androidx.compose.ui.geometry.Rect getRect() {
            return this.rect;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof androidx.compose.ui.graphics.Outline.Rectangle) && kotlin.jvm.internal.Intrinsics.areEqual(this.rect, ((androidx.compose.ui.graphics.Outline.Rectangle) other).rect);
        }

        public final int hashCode() {
            return this.rect.hashCode();
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/ui/graphics/Outline$Rounded;", "Landroidx/compose/ui/graphics/Outline;", "Landroidx/compose/ui/geometry/RoundRect;", "roundRect", "<init>", "(Landroidx/compose/ui/geometry/RoundRect;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/geometry/RoundRect;", "getRoundRect", "()Landroidx/compose/ui/geometry/RoundRect;", "Landroidx/compose/ui/graphics/Path;", "roundRectPath", "Landroidx/compose/ui/graphics/Path;", "getRoundRectPath$ui_graphics", "()Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/geometry/Rect;", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "bounds"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Rounded extends androidx.compose.ui.graphics.Outline {
        public static final int $stable = 0;
        private final androidx.compose.ui.geometry.RoundRect roundRect;
        private final androidx.compose.ui.graphics.Path roundRectPath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Rounded(androidx.compose.ui.geometry.RoundRect roundRect) {
            super(0 == true ? 1 : 0);
            androidx.compose.ui.graphics.Path path = null;
            this.roundRect = roundRect;
            if (!androidx.compose.ui.geometry.RoundRectKt.isSimple(roundRect)) {
                androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
                androidx.compose.ui.graphics.Path.addRoundRect$default(Path, roundRect, null, 2, null);
                path = Path;
            }
            this.roundRectPath = path;
        }

        public final androidx.compose.ui.geometry.RoundRect getRoundRect() {
            return this.roundRect;
        }

        /* renamed from: getRoundRectPath$ui_graphics, reason: from getter */
        public final androidx.compose.ui.graphics.Path getRoundRectPath() {
            return this.roundRectPath;
        }

        @Override // androidx.compose.ui.graphics.Outline
        /* renamed from: getBounds */
        public final androidx.compose.ui.geometry.Rect getRect() {
            return androidx.compose.ui.geometry.RoundRectKt.getBoundingRect(this.roundRect);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof androidx.compose.ui.graphics.Outline.Rounded) && kotlin.jvm.internal.Intrinsics.areEqual(this.roundRect, ((androidx.compose.ui.graphics.Outline.Rounded) other).roundRect);
        }

        public final int hashCode() {
            return this.roundRect.hashCode();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/ui/graphics/Outline$Generic;", "Landroidx/compose/ui/graphics/Outline;", "Landroidx/compose/ui/graphics/Path;", "path", "<init>", "(Landroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/graphics/Path;", "getPath", "()Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/geometry/Rect;", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "bounds"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Generic extends androidx.compose.ui.graphics.Outline {
        public static final int $stable = 8;
        private final androidx.compose.ui.graphics.Path path;

        public Generic(androidx.compose.ui.graphics.Path path) {
            super(null);
            this.path = path;
        }

        public final androidx.compose.ui.graphics.Path getPath() {
            return this.path;
        }

        @Override // androidx.compose.ui.graphics.Outline
        /* renamed from: getBounds */
        public final androidx.compose.ui.geometry.Rect getRect() {
            return this.path.getBounds();
        }
    }

    public /* synthetic */ Outline(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
